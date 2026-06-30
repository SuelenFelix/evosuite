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

public class DropRecipientEnt_setUpdateDate_188432130823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34556;
     Object term34651;

    public DropRecipientEnt_setUpdateDate_188432130823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34557 = new Long(3580984732036213717L);
        Class<? extends Object> term34664 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term34663 = ((Class) term34664).getDeclaredField((String) "VERIFIED");
        ((Field) term34663).setAccessible(true);
        Object enum67 = ((Field) term34663).get((Object) null);
        Integer term34611 = new Integer(-6029667);
        Long term34613 = new Long(5330761990446327930L);
        term34556 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term34571 = newInstance(Class.forName("java.util.Date"));
        Object term34573 = newInstance(Class.forName("java.util.Date"));
        setField(term34556, term34556.getClass(), "id", term34557);
        setField(term34556, term34556.getClass(), "address", "PqtVXXZMqK");
        setLongField(term34571, term34571.getClass(), "fastTime", 1673375951909L);
        setField(term34571, term34571.getClass(), "cdate", null);
        setField(term34556, term34556.getClass(), "createDate", term34571);
        setLongField(term34573, term34573.getClass(), "fastTime", 1816279347222L);
        setField(term34573, term34573.getClass(), "cdate", null);
        setField(term34556, term34556.getClass(), "updateDate", term34573);
        setField(term34556, term34556.getClass(), "status", enum67);
        setField(term34556, term34556.getClass(), "failReason", "rYbtIDVdnd");
        setField(term34556, term34556.getClass(), "code", "UKAReurpHG");
        setField(term34556, term34556.getClass(), "retryAttempt", term34611);
        setField(term34556, term34556.getClass(), "dropRequestId", term34613);
        setField(term34556, term34556.getClass(), "snapshotBalance", "WVRMUmrljA");
        setField(term34556, term34556.getClass(), "payAmount", "NTlKJDDWlk");
        setField(term34556, term34556.getClass(), "ownedNftId", "vOuMEpOQAg");
        term34651 = newInstance(Class.forName("java.util.Date"));
        setLongField(term34651, term34651.getClass(), "fastTime", 1267380225974L);
        setField(term34651, term34651.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term34651;
        callMethod(klass, "setUpdateDate", argTypes, term34556, args);
    }

};


