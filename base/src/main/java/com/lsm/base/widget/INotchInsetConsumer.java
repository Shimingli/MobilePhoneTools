package com.lsm.base.widget;

public interface INotchInsetConsumer {
    /**
     *
     * @return if true stop dispatch to child view
     */
    boolean notifyInsetMaybeChanged();
}