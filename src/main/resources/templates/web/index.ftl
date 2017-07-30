<#include "/common/head.ftl"/>
</head>
<body>
<div>
  <a href="rest/user/${testid}" target="_blank">${springMacroRequestContext.contextPath}
    /rest/user/${testid}</a>
</div>
<div>
  <a href="rest/user/edit?id=${testid}" target="_blank">测试修改功能</a>
</div>
<div>
  自定义属性：<br/>
${customProperties.name} <br/>
${customProperties.optVersion} <br/>
${customProperties.optNumber} <br/>
${customProperties.url} <br/>
</div>
<div>
日期格式化
${datetime?string("yyyy-MM-dd HH:mm:ss")}<br/>
数字
${num}
<br/><br/>
m1M3，m1 - 最少1位；M3最大3位
#{num;m1M3}
</div>
<#setting number_format="##0.##">
<#assign answer=12342.126646/>
${answer?string}<br/>
${answer?string(",##0.###")}

${datetime?string("yyyy-MM-dd HH:mm:ss")}
<#assign answer=12342.126646/>
${answer?string("##0.##")}  -> 12342.13
${answer?string(",##0.###")}  -> 12,342.127
</body>
</html>