<#assign s=JspTaglibs["/WEB-INF/tld/struts-tags.tld"]/>
<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome to my blog!</title>
</head>
<body>
<div class="contain">
    <div class="main">
        <p>
            ${(blog.id)!}
        </p>
        <p>
        ${(blog.title)!}
        </p>
        <p>
        ${(blog.body)!}
        </p>
        <p>
        ${(blog.authorId)!}
        </p>
    </div>
</div>
</body>
</html>