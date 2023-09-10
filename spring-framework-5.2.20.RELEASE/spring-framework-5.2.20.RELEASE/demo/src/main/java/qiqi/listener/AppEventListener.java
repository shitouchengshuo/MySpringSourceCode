package qiqi.listener;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import qiqi.bean.Cat;

@Component
public class AppEventListener {

	public AppEventListener() {
		System.out.println("++++++++++AppListener+++++++++++++++++++++++++");
	}

	@EventListener
	public void listenMessage(MessageEvent messageEvent){
		System.out.println("********messageEvent*******************" + messageEvent);
	}

	@EventListener
	public void listenMessage(ChangeEvent changeEvent){
		System.out.println("*************changeEvent**************" + changeEvent);
	}

	@EventListener  //感知任意对象
	public void listenMessage(PayloadApplicationEvent<Cat> event){
		System.out.println("Payload事件到达。。。。" + event.getPayload() + "已处理");
	}
}
