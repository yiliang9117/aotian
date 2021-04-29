<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-04-28
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="height: 100%; margin: 0">
<div id="container" style="height: 800%"></div>

<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts@5/dist/echarts.min.js"></script>
<!-- Uncomment this line if you want to dataTool extension
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts@5/dist/extension/dataTool.min.js"></script>
-->
<!-- Uncomment this line if you want to use gl extension
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts-gl@2/dist/echarts-gl.min.js"></script>
-->
<!-- Uncomment this line if you want to echarts-stat extension
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts-stat@latest/dist/ecStat.min.js"></script>
-->
<!-- Uncomment this line if you want to use map
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts@5/map/js/china.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts@5/map/js/world.js"></script>
-->
<!-- Uncomment these two lines if you want to use bmap extension
<script type="text/javascript" src="https://api.map.baidu.com/api?v=2.0&ak=<Your Key Here>"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/echarts@5/dist/extension/bmap.min.js"></script>
-->

<script type="text/javascript">
    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};

    var option;



    option = {
        title: {
            text: '计划账户进线数量',
            subtext: '数据来自网络'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            data: ['A级客户', 'B级客户', 'C级客户', 'D级客户', 'E级客户','无','合计','开单率']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type: 'value',
            boundaryGap: [0, 0.001]
        },
        yAxis: {
            type: 'category',
            data: ${yAxis }
        },
        series: [
            {
                name: '合计',
                type: 'bar',
                data: ${aalData }
            },
            {
                name: '开单率',
                type: 'bar',
                data: ${turnoverRatio }
            },,
            {
                name: 'A级客户',
                type: 'bar',
                data: ${aData }
            },
            {
                name: 'B级客户',
                type: 'bar',
                data: ${bData }
            },
            {
                name: 'C级客户',
                type: 'bar',
                data: ${cData }
            },
            {
                name: 'D级客户',
                type: 'bar',
                data: ${dData }
            },
            {
                name: 'E级客户',
                type: 'bar',
                data: ${eData }
            },
            {
                name: '无',
                type: 'bar',
                data: ${nData }
            }
        ]

    }
    ;



    if (option && typeof option === 'object') {
        myChart.setOption(option);
    }
    setTimeout(function (){
        window.onresize = function () {
            twChart.resize();
        }
    },200)

</script>
</body>

</html>
