<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    int cnt = 5;

    if (request.getParameter("cnt") != null) {
        cnt = Integer.parseInt(request.getParameter("cnt"));
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>numForm</title>
    <script type="text/javascript">
        function cntChange() {
            alert("changed");
            qwer.action = "?";
            qwer.submit();
        }
    </script>
</head>
<body>
    cnt: <%= cnt %>
    <h1>numForm</h1>
    <form action="numReg.jsp" name="qwer">
        <table border="">
            <% for (int i = 0; i < cnt; i++) { %>
                <tr>
                    <td colspan="2" align="right">
                        칸수:
                        <select name="cnt" id="" onchange="cntChange()">
                            <% for (int j = 5; j < 30; j += 5) { %>
                                <option <%= (j == cnt) ? "selected" : "" %>><%= j %></option>
                            <% } %>
                        </select>
                    </td>
                    <td><input type="text" name="no" value="<%= (int) (Math.random() * 100) + 10 %>" /></td>
                </tr>
            <% } %>
            <tr>
                <td><input type="text" name="no" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="계산" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
