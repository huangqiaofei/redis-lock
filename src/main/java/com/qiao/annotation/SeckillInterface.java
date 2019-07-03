package com.qiao.annotation;


/**
 * @author huangqf
 */
public interface SeckillInterface {

    @CacheLock(lockedPrefix = "TEST_PREFIX")
    void secKill(String arg1, @LockedObject Long arg2);
}
