# 企业微信SDK

已完成的功能

- 获取accessToken
- 成员管理
- 部门管理
- 标签管理 

> 使用API前，先传递accessToken，具体API参数的传递，请参阅[企业微信API](https://work.weixin.qq.com/api/doc)

> 注意事项：API接口成功后根据实际情况返回，有的为空，有的返回对象，但是如果报错一定会以`异常`的形式抛出（包含了企业微信返回的异常）


#### 获取accessToken
```java
    AccessToken accessToken = WorkWechatBuilder.builder("corpId", "corpSecret").getAccessTokens().getAccessToken();
```

#### 成员API

创建成员
```java
    Member member = new Member();
    member.setCellphone("13000010001");
    member.setMemberId("Spector");
    member.setName("test");
    member.setDepartmentList(Arrays.asList(22L, 21L));
    member.setGender(GenderType.MALE);
    member.setPhoto("http://p.qlogo.cn/bizmail/twaxvWXxbdsjkRVrurzIvbmIHmWDE3icLnNjYKSRCCEZaSVME03Bv2w/0");
    member.setLeader(false);
    member.setEnable(true);
    WorkWechatBuilder.builder(accessToken).getMembers().createMember(member);
```

修改成员
```java
   Member member = new Member();
   member.setMemberId("Spector");
   member.setEnglishName("hello");
   WorkWechatBuilder.builder(accessToken).getMembers().updateMember(member);
```

读取成员
```java
    Member member = builder().getMembers().getMemeber("Spector");
    System.out.println(member);
```

删除成员
```java 
    WorkWechatBuilder.builder(accessToken).getMembers().deleteMemeber("Spector");
```

批量删除
```java
    MemberDelete memberDelete = new MemberDelete();
    memberDelete.setUseridlist(Arrays.asList("Spector", "Spector1"));
    WorkWechatBuilder.builder(accessToken).getMembers().batchDeleteMember(memberDelete);
```

获取部门成员
```java
    SimpleMemberList memberList = WorkWechatBuilder.builder(accessToken).getMembers().listSimpleDepartmentMember(11L);
    for (SimpleMember member : memberList.getUserlist()) {
        System.out.println(member);
    }
```

获取部门成员详情
```java
    MemberList memberList = WorkWechatBuilder.builder(accessToken).getMembers().listDepartmentMember(22L);
    for (Member member : memberList.getUserlist()) {
        System.out.println(member);
    }
```

#### 部门API

创建部门
```java
    Department department = new Department();
    department.setName("test");
    department.setParentId(1L);
    department.setOrder(1);
    builder().getDepartments().createDepartment(department);
```

修改部门
```java
    Department department = new Department();
    department.setName("联盟");
    department.setParentId(1L);
    department.setOrder(1);
    department.setId(83L);
    builder().getDepartments().updateDepartment(department);
```

获取指定部门
```
    //传null时获取所有
    DepartmentList departmentList = builder().getDepartments().listDepartment(83L);
    for (Department department : departmentList.getDepartment()) {
        System.out.println(department);
    }
```

删除部门
```java
    builder().getDepartments().deleteDepartment(84L);
```

#### 部门API

新增标签
```java
    Tag tag = new Tag();
    tag.setTagId(4L);
    tag.setTagName("hello");
    builder().getTags().createTag(tag);
```

修改标签
```java
    Tag tag = new Tag();
    tag.setTagId(4L);
    tag.setTagName("world");
    builder().getTags().updateTag(tag);
```

删除标签
```java
    builder().getTags().deleteTag(4L);
```

获取标签列表
```java
    TagList tagList = builder().getTags().listTag();
    for (Tag tag : tagList.getTaglist()) {
        System.out.println(tag);
    }
```

获取标签成员
```java
    TagMember tegMember = builder().getTags().getTagMember(3L);
    System.out.println(tegMember);
```

增加标签成员
```java
    TagMemberUpdate tagMember = new TagMemberUpdate();
    tagMember.setTagId(4L);
    tagMember.setUserList(Arrays.asList("GuoXia", "ZhangBiLing"));
    builder().getTags().createTagMember(tagMember);
```

删除标签成员
```java
    TagMemberUpdate tagMember = new TagMemberUpdate();
    tagMember.setTagId(4L);
    tagMember.setUserList(Arrays.asList("GuoXia", "ZhangBiLing"));
    builder().getTags().deleteTagMember(tagMember);
```

