package qiqi.listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class MessageEvent extends ApplicationEvent implements Serializable {


	private static final long serialVersionUID = 7294093646774624409L;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MessageEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "MessageEvent{" +
				"source=" + source +
				'}';
	}
}
