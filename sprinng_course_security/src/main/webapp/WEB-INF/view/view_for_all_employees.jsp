<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!Doctype html>
<html>
<body>
<h3>Information for everyone</h3>

<security:authorize access="hasRole('HR')">
    <br><br>
    <input type="button", value="Salary"
           onclick="window.location.href='hr_info'">
    For HR
    <br><br>
</security:authorize>


<security:authorize access="hasRole('MANAGER')">
    <br><br>
    <input type="button", value="Performance"
           onclick="window.location.href='manager_info'">
    Only for Managers
    <br><br>
</security:authorize>

</body>

</html>