<#import "parts/default.ftl" as c>

<@c.page>
    <div class="form-row">
        <div class="form-group col-md-6">
            <form method="get" action="/main" class="form-inline">
                <input type="text" name="filter" class="form-control" value="${filter?ifExists}" placeholder="Search by tag">
                <div>
                    <p style="margin-left: 20px"> </p>
                </div>
                <button type="submit" class="btn btn-outline-dark">Search</button>
            </form>
        </div>
    </div>

    <#include "parts/messageEdit.ftl" />
    <#include "parts/messageList.ftl" />
</@c.page>