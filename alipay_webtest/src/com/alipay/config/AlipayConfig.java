package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	//public static String app_id = "2017103009611284";
	
	//自己的沙箱id
	//public static String app_id = "2016091300505409";
	
	//自己的id非沙箱
	//public static String app_id = "2018052160182156";
	
	//天航的应用id
	public static String app_id = "2017032906464298";
		
	//2088121929575306
	// 自己商户私钥，您的PKCS8格式RSA2私钥
   // public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCIfMbVgd07kuJNLJOm/9TmiTsjmfczCM6+jFdYwL+Hhbdz6SEWtZwAiwRt7myb8tcMNyFJ3quKTDmdwzRbQ7HhR1xkl62VKb+/wJzYpEcNLR9gw07594MzMMCBAxD+nkEPhIr7v62tYerqagX9hdO0nVVRAJ3n6BpriIILUN/uISQOSCdazqXwXhBEDaaoIuImKjgS4K76jFxmC5jtrDBdfUWZbitnhjQ0eQ1lyyKhBcHizkumgPeeh1AlAFat472j+uIvEPPqQYOqS5o57GepZVTCrz3V6DZkShW7JSarIC/cIdwpUjURjLUdHHit/e23fgUv9GRBcd3EawndSScXAgMBAAECggEANJCZozDYm1D+hupcEz0EKaVAeX2ajrUdqpUyLqRNH0yIUsO+Upiu9CaWFiB1A7qKx9GTqHdxaVnh9rhvOZbgsvpgwv0HhSMHDjqILYdXNePi6clOaUbB6L0l5onfya/5LpjFTh+MK/JCHvWmSPV5i13stb2fEul5A2EXdHQ5SeQ5Z21MHntbi95YTo8D//Jl3VSvzMlhGwGbntIdodlTzdMXXMpei2urriBPoUjZSdtsJKlJC32TcNZIF/kQkIzyVC4hfaYwfT+FbW/CKWP30Xvh4TouvDBAewYs0UifL9jlUx8cIOGihQMUubMNRe6XKfSEvojhd6tmAcKxOgUYwQKBgQDFIBjs+gWkrAb1oFoUnICwxnFH2ALWd3/Ghz6FdrDLnY4LWh92Epbv6C1It7uIvZB8p4R1USVHZgdZEj7qdcyAv57zjQ/HblJ8Ki0igca3eYwO+cAC3LfXfmswz+8F2b4TSq0UoIxG5P7M+dpCaZ9JUQscct4pQ9IOqH0wW9/YFQKBgQCxQGS+ww1i4zH68djekmzTAncpgCYp7tur2u3kmy50f+znKPnh0cnJ60q8d+9crkNOzi4HdNrY43JS8VBOgU4kIfDEucg7TE3GYAQFDiz6ibcoxAZbHyxY8QAp5OiNdgSA5h9Yc8fDGhQYsVbARyuiSPUSk5ET9M/JdUIf+CNBewKBgCu+Pqm/pabwIa86ASNXw1r2/kZSEfcjl3AnrOETAJJ+iPnN6vNZlrLwE7RySSRD5J800TjzY9FfO7wxR1LiBxp+6zfikqDPw3AYL+HbaIxoZYMhOtGnxwgD3qd7TPBAbGR9isDsC5Tj1gMIYr2gEJ/FYzDR8Ki5ixCDpRwpFxgtAoGAQOWdvUZ3ETyz4PhJefxMgdmGPZig4HuGzF5E+Y1jrd3kpCIZk3eXFSnj3CthZSKcnC7bJXnAYuarxfh6ebPYI1yV5cFLsYJXe4lOD3fIOhbQC8nxtc0tFIdwkuYvyxNpxLP8yArkGefjccMESzQDotBpglqrJI5ewZkAE+prJh8CgYAvhPqJOFz/YuCKmKrpdf4aji+gxD+fcSloELVexQEatpxT+2Bh4VHsN9f15QL0FuOgyi0XiHprDqVITatw75JmUwMqVUtjux3EMCsBKo+E1EtU+3t/Z9nDYx36lJpS35AiNQdeGyM8Q/t+m1zN7LGxFcMsme+USkdtQ3rVTrPvRA==";
	
	//自己的沙箱私钥
    //public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCNhTI5rYADcfHVlM5VYhbNyoqMf5uUGst2/cjo3xJ6xgB+YDfNpfQoITmAX3/FfYDPgsT5WRVtIA0FEcB54IOQDEUrqwz2oVKcQYOlv5l6QcZDkKFdHFHHvHwgG+zDhnA6XQESlAXBRsW+TAhHb2AA+XSqKIW1fGrsXBtp2VHHb4EqMJPgG4ncNwcGKpFGaT6UXtzosEfI79uR6SiUfubQYH3HvdTww0ad3TC5l/oSKLyVAugdvv5ZNpyvFV7ECE4rFtvmLPl6NpkypUnLila1MfRIwgc4oh8jq9FetcV3s4sBq6jr6cisnk4RiwR8rqO9twdvzIefIt44mbA+BmptAgMBAAECggEANsgdphgUWsEL5SqCKKkcvLKvqS1ocw9gPYKF+CcJxz7ISCNE1rVr6vDZimjtU+x+JVWwm/kxAxoKEDFL+aHAK82kJQBEt1/BU71Eka+2YI3/in39CMcCnTfIMMG+h/2NifoghSmJhMS5nS1fcw+Y8SefUpL3F0a/ORl6fyHhtzpOBZHJlyERY+3oUuuXefguK44hEWtCI22BPzQr33gY+ghMy0svlxNjGT8W9PSl84GRPDZAB3EiAzxWVVZS6COEqx5ufoyvhJN9I5HKWl0+cQVbWGXf/ik176bXmuVMZf/3w2mgBg2OyGZKI/irKwE+XKfiBnewsSE8RG8bx1AbfQKBgQDJQC40BSPHBmb38mqhgzt9fuakMwim5ibXoiPEjGvvBXY0X4OVaRB2UF78TzaTgNAcFkMHJiP/W2njM3IdqEwoYJTeUjiVaROHlzIqanfa/BNHvHdjAtI7EABY4r4u+aeKs5Vn4WTfjB2XYsGe47Z6o69Wy4aIvoMx+ZaDRBxtEwKBgQC0BS0jgvzC0Kc3xBoWCDmmcjanVRHsCYIZRaRH/fu73EydoZXV9G4Kl6Ph+J4uFijRcF/9utXiBCnjt6HreybVC8u//g9vKhopR76+6DnMzVWQz2erYnPuHmtEzO28a/CYpVcimYDqj3FwvTBGFiJ6jsVf8zf3qgWRfO1lpLI6fwKBgQCBAp+bwV+6CiSf9crdVt8gB+WahQya0Rc9TDdZnBrk0r9/u2sCsKNY9RSu8aiuzfiayLqXLqAM5nDusOAKmwSXLbLBAjw7q2xVk1sZTb8fplBFwE9YLUrPieZvFIuOWYRJqe2w9hBQLeYaUbiFPryPybZxEW9g4aAAvVr7MwJ1+QKBgAwnoVGZgYmB3xiD1CMSsRnM8mW/97LRPYiJTDtUKdAYYs/t3hkRJPDwJi+Wws9nzZ++j6ypFdHp6A4pEvS8XvXZkwtGkzI1TIjnADkRov1yC8n4Rw6qWhuE0EdX8uFbBGa6GzUJ2kt8HfO3wm+pBPDzfN4qpOfDAhc9sSXAxgvvAoGBAKL5INvl/DWdT27eXIPRHW8S2R8O9WyyNlDxjFwt1WFbDfOmu0XY9PVqY4tPZUg4Sp1IsZbcmrK5GKNbniOGylVseCUbRwBA7wA3MYQ2OV4pJwJ8N5Um5fU7+cyaC9iCSSOoSvOZdxuotvEfLcDG5HH7MDZWMKhqJUo+B5ArSfHX";
	
  //天航的的私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC96wPJ95wqG81OC/2xpJrnsYF3ZcFwEX9XkJtYqYeSkby7u9kK7sN1pHqdw/PaA6u7CqoRW4a2TfjzCcUaAkw8f5CYVcWp0veQzaVpscCTcPTEI5wwbGM+gshotEHu7BUVh/PtA4plNwc0DnsMg6zg73RVaSPuyBox0SqeQeAohsNmFnwqEHzHwj6mQbKwOHsM5b5xMhuGOldxVoHs4Oh9sSIiqBIJ6OB4mwCRaA/Uh6eYSOvOP1VFBNn1qoeeBFl8AO9smWlv6vUff0RSirADDXwZUUq4L6dKdOoBUDUk2KeaZUNijRPpk78YR6J5jNzP7Hi2O/fJOd/wxOiovIV1AgMBAAECggEAVxb/XM18Ql8PbZvYEW8/TcI7cWorI14SvC/m3OiY7+B+4MQKipXk8fyj8dba6v3F8Xa5eE41X0IwSBsR1JR7Kz8AKqsignbo6fEzyl0lxzcENzFxPU9mz1Kf3kvS9GI0ZPQ8KlL2UuXCGuANEzcKvvdvrH8TaDtAr9mQJpRk24/tJWVJb4BUTPJprdT1m0ccvsFg1jn77xlmhkOC2cewLC7tFDuWH0+LnD6RK2u/5BZm84ECggPd8T8z2/M6DtUUyruYpu/wDdV1AfWegQedRWg+nIJqdTuZqBiZaEj82TaRNrytQgyZ/XdW1PNopvqppAmpImSFjm9aO7zJw2EAgQKBgQD5ZTJPs8+Zx9xiswWRgRa3TuTbuxlpnCuEXRRLBHZR0jV/9Nakx7Li3UHJE0HMtG2X4T6pQT8v3htFbe4D2WoQOaBZfDfMMqAMqYj/Q/AqviQSG/O0TXcy/xL5wdwdOlv2TGDsEMGzv/7hevA2I22HhgxyP3KT6OwBXnO1TWMTIQKBgQDC8pXd1NncGPGvjP402/zAolfyKIhZ7Z/M5/9RxaYOGxayuFqRcfecp0xTOEqs2xEvXHlYyIXtFi7zw2otSjPHxBLI8SJom107c209nXRHiXiW1QF2bNl/ZXjORyaRP6qYD/8K8mhrG5vUwvtTrmLcX8O3r7v9xsI02jykSEU71QKBgQCyQMxW/1QwvBMfUIl4WGXeGzukefRN8duAve6VN9lB3hdzH5KTMFEBqdctWuA66fMzDUF2RDZfhkbDtzDZ+3m9oxKjIw/WmZCfvEU4/lwYkNLDRstHYd8CyiHL9e3XzjCQuELGN6vbSC1rCC3M5EGTDhKzTfodEewthk75lRhtQQKBgCnHTUDeJdZabik+IRh48MDjyc82yonjN/T03y3KGt05BvNEOPyknPkwjVXkYXSL+jHZMpRJXRJDR8qr3WxZU6GDLrdrngEnEqL0CLxEqy/NkU9Z1NdpWm9H8szaSLSmHUw7WWAiNSiHIS1GoA/99mfeChaqjbJET0h+YLKgXl4FAoGAWDSA+i37hYM4gW8HTW2yzISqLt8zLelrnc7C7HYACXpzanXb3tSWOQkqU7sZpHJVCkuETnPJlPvfg+Fs5RjO34kbz7a+UQEdNgGVP4R484aALw4tlFw85MpKIIw7cew0+euJ8KIrGx09BzhTQOQlYoIZduVdDqDrkxsFM/PAJHQ=";
	
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    //public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApQ2aLwib2AzZCfF7zklYDerdyhSRkq/o8SW8G0Jnku6F6Kp1u99pphS2gKeJ";
    
    //自己沙箱的公钥
    //public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArzFPjPRozajvFNX4R1x7f6dD1L2uz02t2492JI6iM6VvCtyZP7TTExl0V9rfxbi+7nFc8xDTDi2fqosOpF43qtfrYTK4RD+CZ1avvAfs9qoP1p5Css6/Mv3DX6d3snMtgEe8fTxd6BY01YKQY6Ra38Hx9zJ1UNaVRXxjLI1mXEAqcuNymHuyf5DUApeJEwSah1txufVTELbt+22ku1jPMMm1hayMquyTOhGmZil7UTbIVRct9D1n9fcFi2HS/cUDM45jTekRviykCi8zjUZeILImXj9AmDEcnR2n5q9lhXM/DkxweslwHAAqlIFIwyqJEYTYbeOsP+cq6mph2kGxjwIDAQAB";
    
    
    //天航支付宝的公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgP0Hk2NAdiJ8DBFXwads8S5lDub7t+PezmwpCdh4Qs+MAYzweoT4TmmEnDzSw0ZSTfIkhObqN0qC3/rY0TYx9T4G0WCDRESIh0q9o6AGwj6ztFXThzGb/uWe7b91lKdDZJYW+QTgDNG4fhvXIz86GypA+BIIDms1ZhVsog1ljrfzK3mkss4ucEE9gy6IR4iZSbdDV7KXUPe+2VEeXCQPcx+Jlw642HPi+InaSYo4oGvS/OBt23Brt9ay399wiKzAnKacnkfcbhUsoogd77L2RLTWrcp5BbxDSM0fJeeE+erXu0f6WpUtAnCYgmJgzdrDcqx+LxoC1FDJDKnrXLtcnQIDAQAB";
    
    
    //自己支付宝的公钥非沙箱
   // public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAg+UgKpu5YcslG+b4KBCA2Vd/zREw5CZ1ooSAHe7Qc0G5ZyBwUwIgTcgcg3DyHeDGaXxWkVXm6O64wOpxVorZFC+JJV1rHctGpDmQ7iqxUWPHJzmjLdhW8rFRz4OD556x2h6+TeAS2e4ax9RvHRzl8OQpsV5JSEIroqALMd6dpbJBYAifL5ar0/LX/+U8QZ19Ewx+MyyWjwjq3/CjDLRMFv780dCYEgUNsnnlb761S/+5INRMSSQqNtFJFGAu2LzcgypGhiQF3KcQANoJ5kch0k68A8Yat2waCjx8wtFHgNmtONNl57EWofbKoylaSHZM6mzDcFWq2HjbUCIN8wQmswIDAQAB";
    
    
   // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "18y04t1375.iask.in:38288/alipay_webtest/NotifyAction";
	
	//public static String notify_url = "http://18y04t1375.iask.in:35488/alipay_webtest/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "18y04t1375.iask.in:38288/alipay_webtest/ReturnAction";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	//沙箱支付宝网关
	//public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	
	// 日志
	public static String log_path = "d:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

