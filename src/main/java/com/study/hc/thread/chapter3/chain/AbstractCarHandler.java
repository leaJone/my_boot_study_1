package com.study.hc.thread.chapter3.chain;

/**
 * 职责：Handler 职责类的抽象父类
 * @author MAIBENBEN
 */
public abstract class AbstractCarHandler {

    AbstractCarHandler carHandler = null;

    /**
     * 抽象方法 用于定义职责的方法
     */
    public abstract void carHandler();

    /**
     * 设置下一个职责处理类
     *
     * @param nextCarHandler
     * @return
     */
    public AbstractCarHandler setNextCarHandler(AbstractCarHandler nextCarHandler) {
        this.carHandler = nextCarHandler;
        return this.carHandler;
    }

    /**
     * 职责下传
     */
    protected void doChain() {
        if (this.carHandler != null) {
            this.carHandler.carHandler();
        }
    }
}
