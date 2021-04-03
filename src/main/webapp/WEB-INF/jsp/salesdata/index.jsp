<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>本草极萃-销售大屏数据</title>
    <script type="text/javascript" src="/static/js/jquery.js"></script>
    <link rel="stylesheet" href="/static/css/comon0.css">
</head>
<script type="text/javascript">
	$(document).ready(function(){
		var html=$(".wrap ul").html()
		$(".wrap ul").append(html)
		var ls=$(".wrap li").length/2+1
		i=0
		ref = setInterval(function(){
			i++
			if(i==ls){
				i=1
				$(".wrap ul").css({marginTop:0})
				$(".wrap ul").animate({marginTop:-'.52'*i+'rem'},1000)
			}
	    	$(".wrap ul").animate({marginTop:-'.52'*i+'rem'},1000)


		},2400);



				var html2=$(".adduser ul").html()
		$(".adduser ul").append(html2)
		var ls2=$(".adduser li").length/2+1
		a=0
		ref = setInterval(function(){
			a++
			if(a==ls2){
				a=1
				$(".adduser ul").css({marginTop:0})
				$(".adduser ul").animate({marginTop:-'.5'*a+'rem'},800)
			}
	    	$(".adduser ul").animate({marginTop:-'.5'*a+'rem'},800)


		},4300);







	})
</script>
<body>
    <div class="loading">
        <div class="loadbox"> <img src="/static/images/loading.gif"> 页面加载中... </div>
    </div>
    <div class="head">
        <h1><img src="/static/images/logo.png">本草极萃销售作战大屏</h1>
        <div class="weather"><img src="/static/images/weather.png">
				<span id="localtime1" style=" color: #ffeb7b; font-size:24px; right: 30px; top:-20px; "></span>
		</div>
    </div>
    <div class="mainbox">
        <ul class="clearfix">
            <li>
                <div class="boxall" style="height: 2.7rem">
                    <div class="alltitle">生意参谋</div>

                    <div class="sycm">
                        <ul class="clearfix">
                            <li><h2>1824</h2><span>今日销售额</span></li>
                            <li><h2>1920</h2><span>昨日销售额</span></li>
                            <li><h2>19%</h2><span>环比增长</span></li>
                        </ul>
                        <div style="border-bottom: 1px solid rgba(255,255,255,.1)"></div>
                        <ul class="clearfix">
                            <li><h2>1824</h2><span>本月销售额</span></li>
                            <li><h2>1920</h2><span>上月销售额</span></li>
                            <li><h2>19%</h2><span>环比增长</span></li>
                        </ul>


                    </div>
                    <div class="boxfoot"></div>
                </div>
                <div class="boxall" style="height: 2.65rem">
                    <div class="alltitle">消费占比</div>
                    <div class="sy" id="echarts1"></div>
                    <div class="sy" id="echarts2"></div>
                    <div class="sy" id="echarts3"></div>
                    <div class="boxfoot"></div>
                </div>
                <div class="boxall" style="height: 2.95rem">
                    <div class="alltitle">行业区分比例</div>
                    <div id="echarts4" style="height: 2.2rem; width: 100%;"></div>
                    <div class="boxfoot"></div>
                </div>
            </li>
            <li>
                <div class="bar">
                    <div class="barbox">
                        <ul class="clearfix">
                            <li class="pulll_left counter">128600</li>
                            <li class="pulll_left counter">101320</li>
                        </ul>
                    </div>
                    <div class="barbox2">
                        <ul class="clearfix">
                            <li class="pulll_left">A1区本月成交金额</li>
                            <li class="pulll_left">二部本月成交金额</li>
                        </ul>
                    </div>
                </div>
                <div class="map">
				
				
				
                    <div class="map1"><img src="/static/images/lbx.png"></div>
                    <div class="map2"><img src="/static/images/jt.png"></div>
                    <div class="map3"><img src="/static/images/map.png"></div>

				    <span id="localtime" style=" color: #ffeb7b; font-size:60px; right: 30px; top:-20px; "></span>

                    <div class="map4" id="map_1"></div>
					
					
				
                </div>
            </li>
            <li>
                <div class="boxall" style="height:5.2rem">
                    <div class="alltitle">新增订单信息</div>
                    <div class="tabs">
                        <ul class="clearfix">
                            <li><a class="active" href="#">7天</a></li>
                            <li><a href="#">15天</a></li>
                            <li><a href="#">30天</a></li>
                        </ul>
                    </div>
                    <div class="clearfix">
                        <div class="sy" id="echarts6"></div>
                        <div class="sy" id="echarts7"></div>
                        <div class="sy" id="echarts8"></div>
                    </div>
                    <div class="addnew">
                        <div class="tit02"><span>今日新增订单列表</span></div>
                        <div class="adduser">
                            <ul class="clearfix">
                                <li class="clearfix"> <span class="pulll_left"><img src="/static/images/head.jpg">1今日新增订单列表</span> <span class="pulll_right" style="padding-right: 52px;">24岁 - 女 - 广州 </span> </li>
                                <li class="clearfix"> <span class="pulll_left"><img src="/static/images/head.jpg">2今日新增订单列表</span> <span class="pulll_right" style="padding-right: 52px;">24岁 - 女 - 广州 </span> </li>
                                <li class="clearfix"> <span class="pulll_left"><img src="/static/images/head.jpg">3今日新增订单列表</span> <span class="pulll_right" style="padding-right: 52px;">24岁 - 女 - 广州 </span> </li>
                                <li class="clearfix"> <span class="pulll_left"><img src="/static/images/head.jpg">4今日新增订单列表</span> <span class="pulll_right" style="padding-right: 52px;">24岁 - 女 - 广州 </span> </li>
                            </ul>
                        </div>
                    </div>
                    <div class="boxfoot"></div>
                </div>
                <div class="boxall" style="height: 3.4rem">
                    <div class="alltitle">实时消费记录</div>
                    <div class="wrap">
                        <ul>
                            <li>
                                <p>1李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                            <li>
                                <p>2李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                            <li>
                                <p>3李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                            <li>
                                <p>4李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                            <li>
                                <p>5李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                            <li>
                                <p>6李东梁-支付宝支付-6980元-极萃机三代1台</p>
                            </li>
                        </ul>
                    </div>
                    <div class="boxfoot"></div>
                </div>
            </li>
        </ul>
 
    </div>
    <div class="back"></div>
    <script language="JavaScript" src="/static/js/js.js"></script>
    <script type="text/javascript" src="/static/js/echarts.min.js"></script>
    <script type="text/javascript" src="/static/js/china.js"></script>
    <script type="text/javascript" src="/static/js/area_echarts.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            myChart1.resize();
            myChart2.resize();
            myChart3.resize();
            myChart6.resize();
            myChart7.resize();
            myChart8.resize();
        })
        window.addEventListener("resize", function () {
            myChart1.resize();
            myChart2.resize();
            myChart3.resize();
            myChart6.resize();
            myChart7.resize();
            myChart8.resize();
        });
    </script>
    <script type="text/javascript">
        var v0 = 1000;
        var v1 = 353;
        var v2 = 178;
        var v3 = 68;



        var myChart6 = echarts.init(document.getElementById('echarts6'));
        option6 = {
            series: [{
                type: 'pie',
                radius: ['70%', '80%'],
                color: '#0088cc',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v1,
                    name: '新增会员',
                    label: {
                        normal: {
                            formatter: v1 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                },
                       {
                           value: v0,
                           name: '老会员',
                           label: {
                               normal: {
                                   formatter: function (params) {
                                       return '占比' + Math.round(v1 / v0 * 100) + '%'
                                   },
                                   textStyle: {
                                       color: '#aaa',
                                       fontSize: 12
                                   }
                               }
                           },
                           itemStyle: {
                               normal: {
                                   color: 'rgba(255,255,255,.2)'
                               },
                               emphasis: {
                                   color: '#fff'
                               }
                           },
                       }]
            }]

        };

        var myChart7 = echarts.init(document.getElementById('echarts7'));
        option7 = {
            series: [{
                type: 'pie',
                radius: ['70%', '80%'],
                color: '#fccb00',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v2,
                    name: '新增领卡会员',
                    label: {
                        normal: {
                            formatter: v2 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                },
                       {
                           value: v0,
                           name: '总领卡会员',
                           label: {
                               normal: {
                                   formatter: function (params) {
                                       return '占比' + Math.round(v2 / v0 * 100) + '%'
                                   },
                                   textStyle: {
                                       color: '#aaa',
                                       fontSize: 12
                                   }
                               }
                           },
                           itemStyle: {
                               normal: {
                                   color: 'rgba(255,255,255,.2)'
                               },
                               emphasis: {
                                   color: '#fff'
                               }
                           },
                       }]
            }]
        };


        var myChart8 = echarts.init(document.getElementById('echarts8'));
        option8 = {


            series: [{

                type: 'pie',
                radius: ['70%', '80%'],
                color: '#62b62f',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v3,
                    name: '女消费',
                    label: {
                        normal: {
                            formatter: v3 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                }, {
                    value: v0,
                    name: '男消费',
                    label: {
                        normal: {
                            formatter: function (params) {
                                return '占比' + Math.round(v2 / v0 * 100) + '%'
                            },
                            textStyle: {
                                color: '#aaa',
                                fontSize: 12
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,255,.2)'
                        },
                        emphasis: {
                            color: '#fff'
                        }
                    },
                }]
            }]
        };
        setTimeout(function () {
            myChart6.setOption(option6);
            myChart7.setOption(option7);
            myChart8.setOption(option8);
        }, 500);

    </script>
    <script type="text/javascript">
        var myChart1 = echarts.init(document.getElementById('echarts1'));
        var v1 = 298;
        var v2 = 523;
        var v3 = v1 + v2;
        option1 = {

      
            series: [{
                type: 'pie',
                radius: ['70%', '80%'],
                color: '#0088cc',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v1,
                    name: '平均单客价',
                    label: {
                        normal: {
                            formatter: v3 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                },
                ]
            }]
        };


        var myChart3 = echarts.init(document.getElementById('echarts3'));
        var v1 = 298 
        var v2 = 523 
        var v3 = v1 + v2 
        option2 = {

       
            series: [{
                type: 'pie',
                radius: ['70%', '80%'],
                color: '#fccb00',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v1,
                    name: '男消费',
                    label: {
                        normal: {
                            formatter: v1 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                }, {
                    value: v2,
                    name: '女消费',
                    label: {
                        normal: {
                            formatter: function (params) {
                                return '占比' + Math.round(v1 / v3 * 100) + '%'
                            },
                            textStyle: {
                                color: '#aaa',
                                fontSize: 12
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,255,.2)'
                        },
                        emphasis: {
                            color: '#fff'
                        }
                    },
                }]
            }]
        };


        var myChart2 = echarts.init(document.getElementById('echarts2'));
        option3 = {


            series: [{

                type: 'pie',
                radius: ['70%', '80%'],
                color: '#62b62f',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v2,
                    name: '女消费',
                    label: {
                        normal: {
                            formatter: v2 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                }, {
                    value: v1,
                    name: '男消费',
                    label: {
                        normal: {
                            formatter: function (params) {
                                return '占比' + Math.round(v2 / v3 * 100) + '%'
                            },
                            textStyle: {
                                color: '#aaa',
                                fontSize: 12
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,255,.2)'
                        },
                        emphasis: {
                            color: '#fff'
                        }
                    },
                }]
            }]
        };
        setTimeout(function () {
            myChart1.setOption(option1);
            myChart2.setOption(option2);
            myChart3.setOption(option3);
        }, 500);

    </script>
    <script type="text/javascript">
        var myChart = echarts.init(document.getElementById('echarts4'));
        var plantCap = [{
            name: '工业',
            value: '222'
        }, {
            name: '农业',
            value: '115'
        }, {
            name: '互联网',
            value: '113'
        }, {
            name: '医疗',
            value: '95'
        }, {
            name: '文学',
            value: '92'
        }, {
            name: '服装',
            value: '87'
        }];
        var datalist = [{
            offset: [56, 48],
            symbolSize: 110,
   
            color: 'rgba(73,188,247,.14)',

        }, {

            offset: [30, 70],
            symbolSize: 70,
            color: 'rgba(73,188,247,.14)'
        }, {
            offset: [0, 43],
            symbolSize: 60,
            color: 'rgba(73,188,247,.14)'

        }, {
            offset: [93, 30],
            symbolSize: 70,
            color: 'rgba(73,188,247,.14)'
        }, {
            offset: [26, 19],
            symbolSize: 65,
            color: 'rgba(73,188,247,.14)'
        }, {
            offset: [75, 75],
            symbolSize: 60,
            color: 'rgba(73,188,247,.14)'

        }];

        var datas = [];
        for (var i = 0; i < plantCap.length; i++) {
            var item = plantCap[i];
            var itemToStyle = datalist[i];
            datas.push({
                name: item.value + '\n' + item.name,
                value: itemToStyle.offset,
                symbolSize: itemToStyle.symbolSize,
                label: {
                    normal: {
                        textStyle: {
                            fontSize: 14
                        }
                    }
                },

                itemStyle: {
                    normal: {
                        color: itemToStyle.color,
                        opacity: itemToStyle.opacity
                    }
                },
            })
        }
        option = {
            grid: {
                show: false,
                top: 10,
                bottom: 10
            },

            xAxis: [{
                gridIndex: 0,
                type: 'value',
                show: false,
                min: 0,
                max: 100,
                nameLocation: 'middle',
                nameGap: 5
            }],

            yAxis: [{
                gridIndex: 0,
                min: 0,
                show: false,
                max: 100,
                nameLocation: 'middle',
                nameGap: 30
            }],
            series: [{
                type: 'scatter',
                symbol: 'circle',
                symbolSize: 120,
                label: {
                    normal: {
                        show: true,
                        formatter: '{b}',
                        color: '#FFF',
                        textStyle: {
                            fontSize: '30'
                        }
                    },
                },
                itemStyle: {
                    normal: {
                        color: '#F30'
                    }
                },
                data: datas
            }]

        };
        myChart.setOption(option);
        $(document).ready(function () {
            myChart.resize();

        })
        window.addEventListener("resize", function () {
            myChart.resize();
        });
    </script>
    <script type="text/javascript" src="/static/js/jquery.waypoints.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery.countup.min.js"></script>
    <script type="text/javascript">
        $('.counter').countUp();
    </script>
	
	
	
    <script type="text/javascript">
	function showLocale(objD){
	var str,colorhead,colorfoot;
	var yy = objD.getYear();
	if(yy<1900) yy = yy+1900;
	var MM = objD.getMonth()+1;
	if(MM<10) MM = '0' + MM;
	var dd = objD.getDate();
	if(dd<10) dd = '0' + dd;
	var hh = objD.getHours();
	if(hh<10) hh = '0' + hh;
	var mm = objD.getMinutes();
	if(mm<10) mm = '0' + mm;
	var ss = objD.getSeconds();
	if(ss<10) ss = '0' + ss;
	
	var ms = objD.getMilliseconds();
	ms = parseInt(ms/10);
	if(ms<10) ms =  '0' + ms;
	
	
	var ww = objD.getDay();
	if  ( ww==0 )  colorhead="<font color=\"#ec0b0b\">";
	if  ( ww > 0 && ww < 6 )  colorhead="<font color=\"#ec0b0b\">";
	if  ( ww==6 )  colorhead="<font color=\"#ec0b0b\">";
	if  (ww==0)  ww="星期日";
	if  (ww==1)  ww="星期一";
	if  (ww==2)  ww="星期二";
	if  (ww==3)  ww="星期三";
	if  (ww==4)  ww="星期四";
	if  (ww==5)  ww="星期五";
	if  (ww==6)  ww="星期六";
	colorfoot="</font>"
	//str = colorhead + yy + "-" + MM + "-" + dd + " " + hh + ":" + mm + ":" + ss + "  " + ww + colorfoot;
	str = colorhead +  " " + hh + ":" + mm + ":" + ss  + " " +  ww + colorfoot;
	return(str);
}

function tick(){
var today;
today = new Date();
document.getElementById("localtime").innerHTML = showLocale(today);
window.setTimeout("tick()", 100);
}

tick();
	
	
    </script>
	
	
	
	
	
	

</body>
</html>
