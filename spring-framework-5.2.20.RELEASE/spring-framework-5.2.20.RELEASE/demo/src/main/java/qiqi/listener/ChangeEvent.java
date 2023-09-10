package qiqi.listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

public class ChangeEvent extends ApplicationEvent implements Serializable {


	private static final long serialVersionUID = 5075464765252487818L;
	private String state;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public ChangeEvent(Object source) {
		super(source);
	}

	public ChangeEvent(Object source, String state) {
		super(source);
		this.state = state;
	}

	@Override
	public String toString() {
		return "MessageEvent{" +
				"source=" + source +
				'}';
	}
}