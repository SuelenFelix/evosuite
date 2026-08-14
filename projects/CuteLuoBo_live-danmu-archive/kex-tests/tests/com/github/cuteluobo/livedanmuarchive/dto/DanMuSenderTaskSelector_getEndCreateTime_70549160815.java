package com.github.cuteluobo.livedanmuarchive.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class DanMuSenderTaskSelector_getEndCreateTime_70549160815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1457;

    public DanMuSenderTaskSelector_getEndCreateTime_70549160815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1458 = new Long(-5724112525188606013L);
        Long term1460 = new Long(-6100012593724108983L);
        Long term1462 = new Long(5465527210299101732L);
        Long term1464 = new Long(4699157009689333952L);
        Long term1466 = new Long(-78240609295693193L);
        Long term1468 = new Long(3090901538358721367L);
        Long term1470 = new Long(-1677189124507026637L);
        Long term1472 = new Long(4795660804170399986L);
        Integer term1474 = new Integer(1585847225);
        Long term1512 = new Long(-4030863184426321096L);
        Long term1514 = new Long(0L);
        Long term1516 = new Long(0L);
        Integer term1518 = new Integer(0);
        Boolean term1520 = new Boolean(false);
        Boolean term1522 = new Boolean(false);
        Long term1524 = new Long(-8010214112439224349L);
        Long term1526 = new Long(-6673920710396545553L);
        Long term1528 = new Long(3412644969878030772L);
        term1457 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector"));
        setField(term1457, term1457.getClass(), "startCreateTime", term1458);
        setField(term1457, term1457.getClass(), "endCreateTime", term1460);
        setField(term1457, term1457.getClass(), "startUpdateTime", term1462);
        setField(term1457, term1457.getClass(), "endUpdateTime", term1464);
        setField(term1457, term1457.getClass(), "startFinishTime", term1466);
        setField(term1457, term1457.getClass(), "endFinishTime", term1468);
        setField(term1457, term1457.getClass(), "startVideoCreatedTime", term1470);
        setField(term1457, term1457.getClass(), "endVideoCreatedTime", term1472);
        setField(term1457, term1457.getClass(), "id", term1474);
        setField(term1457, term1457.getClass(), "platform", "gGSMzuGICf");
        setField(term1457, term1457.getClass(), "videoCreatorUid", "hxCBltsObl");
        setField(term1457, term1457.getClass(), "videoId", "BndsHwAFMv");
        setField(term1457, term1457.getClass(), "videoCreatedTime", term1512);
        setField(term1457, term1457.getClass(), "danmuTotalNum", term1514);
        setField(term1457, term1457.getClass(), "danmuSentNum", term1516);
        setField(term1457, term1457.getClass(), "pageSize", term1518);
        setField(term1457, term1457.getClass(), "skip", term1520);
        setField(term1457, term1457.getClass(), "taskFail", term1522);
        setField(term1457, term1457.getClass(), "createTime", term1524);
        setField(term1457, term1457.getClass(), "updateTime", term1526);
        setField(term1457, term1457.getClass(), "finishTime", term1528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuSenderTaskSelector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndCreateTime", argTypes, term1457, args);
    }

};


