<#import "parts/default.ftl" as c>

<@c.page>
<h3>${userChannel.username}</h3>
<div>${type}</div>
<ul class="list-group">
    <#list users as user>
    <li class="list-group-item">
        <a href="/user-messages/${user.id}" class="text-warning">${user.getUsername()}</a>
    </li>
</#list>
</ul>
</@c.page>