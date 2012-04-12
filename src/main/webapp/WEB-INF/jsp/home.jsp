<%@ include file="common/page-includes.jspf" %>
<!doctype html>
<html lang="en">
    <body>
        <h1><spring:message code="page.page.title" /></h1>
        <section>
            <h1>${model.name}</h1>
        </section>
        <form:form action="${pageContext.request.contextPath}/home/" modelAttribute="model">
            <form:errors path="name" element="div" cssClass="error"/>
            <form:label path="name"/> <form:input path="name" />
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>