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

public class DropRecipientEnt_setOwnedNftId_33102988831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39700;

    public DropRecipientEnt_setOwnedNftId_33102988831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39701 = new Long(5904678961906211249L);
        Class<? extends Object> term39818 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term39817 = ((Class) term39818).getDeclaredField((String) "VERIFIED");
        ((Field) term39817).setAccessible(true);
        Object enum76 = ((Field) term39817).get((Object) null);
        Integer term39755 = new Integer(-203030934);
        Long term39757 = new Long(-1820639665251914495L);
        term39700 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term39715 = newInstance(Class.forName("java.util.Date"));
        Object term39717 = newInstance(Class.forName("java.util.Date"));
        setField(term39700, term39700.getClass(), "id", term39701);
        setField(term39700, term39700.getClass(), "address", "dJGPlmSRnz");
        setLongField(term39715, term39715.getClass(), "fastTime", 1541716264920L);
        setField(term39715, term39715.getClass(), "cdate", null);
        setField(term39700, term39700.getClass(), "createDate", term39715);
        setLongField(term39717, term39717.getClass(), "fastTime", 1736141630618L);
        setField(term39717, term39717.getClass(), "cdate", null);
        setField(term39700, term39700.getClass(), "updateDate", term39717);
        setField(term39700, term39700.getClass(), "status", enum76);
        setField(term39700, term39700.getClass(), "failReason", "DPskuFUobI");
        setField(term39700, term39700.getClass(), "code", "wBGfLpNNiZ");
        setField(term39700, term39700.getClass(), "retryAttempt", term39755);
        setField(term39700, term39700.getClass(), "dropRequestId", term39757);
        setField(term39700, term39700.getClass(), "snapshotBalance", "yUGCjlqgJE");
        setField(term39700, term39700.getClass(), "payAmount", "PXdVZyoJyC");
        setField(term39700, term39700.getClass(), "ownedNftId", "vLerpqavFM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qnvxzwuGKX";
        callMethod(klass, "setOwnedNftId", argTypes, term39700, args);
    }

};


