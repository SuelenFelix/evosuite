package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_getStatus_111157737010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27615;

    public DropRecipientEnt_getStatus_111157737010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27616 = new Long(-78240609295693193L);
        Class<? extends Object> term27719 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term27718 = ((Class) term27719).getDeclaredField((String) "FAILED");
        ((Field) term27718).setAccessible(true);
        Object enum55 = ((Field) term27718).get((Object) null);
        Integer term27668 = new Integer(-1339778481);
        Long term27670 = new Long(3090901538358721367L);
        term27615 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term27630 = newInstance(Class.forName("java.util.Date"));
        Object term27632 = newInstance(Class.forName("java.util.Date"));
        setField(term27615, term27615.getClass(), "id", term27616);
        setField(term27615, term27615.getClass(), "address", "sQvGcVjdEx");
        setLongField(term27630, term27630.getClass(), "fastTime", 1309132342717L);
        setField(term27630, term27630.getClass(), "cdate", null);
        setField(term27615, term27615.getClass(), "createDate", term27630);
        setLongField(term27632, term27632.getClass(), "fastTime", 1695470381249L);
        setField(term27632, term27632.getClass(), "cdate", null);
        setField(term27615, term27615.getClass(), "updateDate", term27632);
        setField(term27615, term27615.getClass(), "status", enum55);
        setField(term27615, term27615.getClass(), "failReason", "rLHAoqXgPh");
        setField(term27615, term27615.getClass(), "code", "zUlRdimJtU");
        setField(term27615, term27615.getClass(), "retryAttempt", term27668);
        setField(term27615, term27615.getClass(), "dropRequestId", term27670);
        setField(term27615, term27615.getClass(), "snapshotBalance", "vwbEQQNQrx");
        setField(term27615, term27615.getClass(), "payAmount", "xtftXXMbem");
        setField(term27615, term27615.getClass(), "ownedNftId", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term27615, args);
    }

};


