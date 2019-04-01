package com.alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.4
 *修改日期：2016-03-08
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static String partner = "2088421877569153";
	
	// 收款支付宝账号，以2088开头由16位纯数字组成的字符串，一般情况下收款账号就是签约账号
	public static String seller_id = partner;

	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	//public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC96wPJ95wqG81OC/2xpJrnsYF3ZcFwEX9XkJtYqYeSkby7u9kK7sN1pHqdw/PaA6u7CqoRW4a2TfjzCcUaAkw8f5CYVcWp0veQzaVpscCTcPTEI5wwbGM+gshotEHu7BUVh/PtA4plNwc0DnsMg6zg73RVaSPuyBox0SqeQeAohsNmFnwqEHzHwj6mQbKwOHsM5b5xMhuGOldxVoHs4Oh9sSIiqBIJ6OB4mwCRaA/Uh6eYSOvOP1VFBNn1qoeeBFl8AO9smWlv6vUff0RSirADDXwZUUq4L6dKdOoBUDUk2KeaZUNijRPpk78YR6J5jNzP7Hi2O/fJOd/wxOiovIV1AgMBAAECggEAVxb/XM18Ql8PbZvYEW8/TcI7cWorI14SvC/m3OiY7+B+4MQKipXk8fyj8dba6v3F8Xa5eE41X0IwSBsR1JR7Kz8AKqsignbo6fEzyl0lxzcENzFxPU9mz1Kf3kvS9GI0ZPQ8KlL2UuXCGuANEzcKvvdvrH8TaDtAr9mQJpRk24/tJWVJb4BUTPJprdT1m0ccvsFg1jn77xlmhkOC2cewLC7tFDuWH0+LnD6RK2u/5BZm84ECggPd8T8z2/M6DtUUyruYpu/wDdV1AfWegQedRWg+nIJqdTuZqBiZaEj82TaRNrytQgyZ/XdW1PNopvqppAmpImSFjm9aO7zJw2EAgQKBgQD5ZTJPs8+Zx9xiswWRgRa3TuTbuxlpnCuEXRRLBHZR0jV/9Nakx7Li3UHJE0HMtG2X4T6pQT8v3htFbe4D2WoQOaBZfDfMMqAMqYj/Q/AqviQSG/O0TXcy/xL5wdwdOlv2TGDsEMGzv/7hevA2I22HhgxyP3KT6OwBXnO1TWMTIQKBgQDC8pXd1NncGPGvjP402/zAolfyKIhZ7Z/M5/9RxaYOGxayuFqRcfecp0xTOEqs2xEvXHlYyIXtFi7zw2otSjPHxBLI8SJom107c209nXRHiXiW1QF2bNl/ZXjORyaRP6qYD/8K8mhrG5vUwvtTrmLcX8O3r7v9xsI02jykSEU71QKBgQCyQMxW/1QwvBMfUIl4WGXeGzukefRN8duAve6VN9lB3hdzH5KTMFEBqdctWuA66fMzDUF2RDZfhkbDtzDZ+3m9oxKjIw/WmZCfvEU4/lwYkNLDRstHYd8CyiHL9e3XzjCQuELGN6vbSC1rCC3M5EGTDhKzTfodEewthk75lRhtQQKBgCnHTUDeJdZabik+IRh48MDjyc82yonjN/T03y3KGt05BvNEOPyknPkwjVXkYXSL+jHZMpRJXRJDR8qr3WxZU6GDLrdrngEnEqL0CLxEqy/NkU9Z1NdpWm9H8szaSLSmHUw7WWAiNSiHIS1GoA/99mfeChaqjbJET0h+YLKgXl4FAoGAWDSA+i37hYM4gW8HTW2yzISqLt8zLelrnc7C7HYACXpzanXb3tSWOQkqU7sZpHJVCkuETnPJlPvfg+Fs5RjO34kbz7a+UQEdNgGVP4R484aALw4tlFw85MpKIIw7cew0+euJ8KIrGx09BzhTQOQlYoIZduVdDqDrkxsFM/PAJHQ=";
	
	public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCX3HkEW3MJoIClZmnrxh5n+Sl3MfLoPsHIvmd8hIguQhoItYqrdTBYs1CSebj8mijUNUsVz2q499xsn2sAPOexp73pOSnTQYzpnOumnV1oQ9x5zqcwZjHtM3yTDafUAs04zCPaQWD0xZ8gT8COOg2GouzhBpdN5Y8ECr47O4TsP7oSJHcXm5uHeTfjnUo6D+jTMkNnOK10yrbZAdVsgav3/Ujg+mrvdhJc6rvXp+wlgpJBUuabE6BFkGjlAg0llVfBmVNU5Pndq8GDgxu5yLWwS9JaqOt6rNXILyugJWk4sauOQZrMQwJX4X8oUbs7ovzmJm3VwOVK/UE0ffdqfR6TAgMBAAECggEAXEEGj3wSrYWAwXou3JmVvSojY5LHcwk05gOtkHpe1GM5t5K5tCFUBn6gcutZUrNAHHJns882kTmaAa7y7MkTI9y4RSeB3iGTPhQjICu3I/Edzi2ZaZCbwfKmOhtwmh49l8SD/0H6aZhoa9OnMX/Y2bK+XpGHdz3+nMD+AbPNs0qsX0s9RGs0BWtx7qXHYwWMYwVnJWg2iMqdZFFUKV+ViEJffFsquQ5gCY4QGhXLSZ1MBiiIJvQW9PKc1+3dL8RC+IHPhiVhhorXFJbbm1Kjopa1BFzRR3yKB7CecKfm04pnwqZo1tgQ3SGIyFHeb9pzZBB63eCEYNTICaT9aQn94QKBgQDqHgFnCfX7Tz5GdGXHHpFxKFq2eOQUevF4gE9fR4ScbtFV4m7UumvmKIxdG1h8P6ONM9eyWt654+nVKnrdNJ19H7/wuMuXe6+JXcbhUnXKiidyXZ63beDPBnYhlUkYyvz70cvfZPG+RRYv4kVAov6PqRtutFUzQAS7jpql5f5+MQKBgQCmDjuOwOAeBrWYIHGr/A0qytU4xOY2jQ61VCjHKKLQvakuxRhLlbv+0ld6r6TM2Se6DKyG8DIitUHRwYT5fnCCZoHuA4VXOH1c80drHDMuF0RkjAHDUPNKnJdqZSY5gKWz1pPkbqKtxPzmGsA+43Tuxm9U6woIuWkvGmM7NH7kAwKBgGj1HMHZ+Fo7U3r4kexr6t5lLg3iMrZvy7OvKmZXxL7w+45aXj+md9sOUKcpLEk/qo4SMOA31uRVpi43xi9HeFdxFXbREg0OmUqnLRM1CbPMrhSanh4z93Y4ulsh90xTLImkq5ayRaJ8jI7ZDR0GNcOoF7FQzWWVjMmdC/3WF3rxAoGAQt5iX2cOGSlMgTk3bTFvv/a0DEtGBVuiO6TrUt/rSLHHaj0WPoHKlZ/weEg4zgD4fXRTGXeqSM3C9ou+V5XyCqDq24TxciEeYorZDKnrdjkKYo76usNjZX1PgBnBXdCPaa8UGR3wRpeX27WUCv8ffHPOK10GymKXl89BfHr0Si8CgYEAp08gXUsUgoC9+EagKAQNhpCv/Un81UGuddiq0OIpfAvoFBmEUplPY30g+p/W9maaKyN+hpQbc8pKh0CwHr+OAnTXdhSvDQ34frq6Y4vJ/Oa40CXzpCoQXjHRXjtpeNXbvhAoUIMJBpN5KZUV/7AHMtIbhFoK+GgIogch3P6uF+8=";
	// 支付宝的公钥,查看地址：https://b.alipay.com/order/pidAndKey.htm
	//public static String alipay_public_key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgP0Hk2NAdiJ8DBFXwads8S5lDub7t+PezmwpCdh4Qs+MAYzweoT4TmmEnDzSw0ZSTfIkhObqN0qC3/rY0TYx9T4G0WCDRESIh0q9o6AGwj6ztFXThzGb/uWe7b91lKdDZJYW+QTgDNG4fhvXIz86GypA+BIIDms1ZhVsog1ljrfzK3mkss4ucEE9gy6IR4iZSbdDV7KXUPe+2VEeXCQPcx+Jlw642HPi+InaSYo4oGvS/OBt23Brt9ay399wiKzAnKacnkfcbhUsoogd77L2RLTWrcp5BbxDSM0fJeeE+erXu0f6WpUtAnCYgmJgzdrDcqx+LxoC1FDJDKnrXLtcnQIDAQAB";

	public static String alipay_public_key  ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgP0Hk2NAdiJ8DBFXwads8S5lDub7t+PezmwpCdh4Qs+MAYzweoT4TmmEnDzSw0ZSTfIkhObqN0qC3/rY0TYx9T4G0WCDRESIh0q9o6AGwj6ztFXThzGb/uWe7b91lKdDZJYW+QTgDNG4fhvXIz86GypA+BIIDms1ZhVsog1ljrfzK3mkss4ucEE9gy6IR4iZSbdDV7KXUPe+2VEeXCQPcx+Jlw642HPi+InaSYo4oGvS/OBt23Brt9ay399wiKzAnKacnkfcbhUsoogd77L2RLTWrcp5BbxDSM0fJeeE+erXu0f6WpUtAnCYgmJgzdrDcqx+LxoC1FDJDKnrXLtcnQIDAQAB";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "18y04t1375.iask.in:38288/alipay_old_ras_webtest/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "18y04t1375.iask.in:38288/alipay_old_ras_webtest/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static String log_path = "C:\\";
		
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
		
	// 支付类型 ，无需修改
	public static String payment_type = "1";
		
	// 调用的接口名，无需修改
	public static String service = "create_direct_pay_by_user";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
//↓↓↓↓↓↓↓↓↓↓ 请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	// 防钓鱼时间戳  若要使用请调用类文件submit中的query_timestamp函数
	public static String anti_phishing_key = "";
	
	// 客户端的IP地址 非局域网的外网IP地址，如：221.0.0.1
	public static String exter_invoke_ip = "";
		
//↑↑↑↑↑↑↑↑↑↑请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
}

