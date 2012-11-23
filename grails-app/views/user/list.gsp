<g:if test="${flash.message}">
  <div class="message">${flash.message}</div>
</g:if>
<g:link controller="user" action="list">
  new user
</g:link>