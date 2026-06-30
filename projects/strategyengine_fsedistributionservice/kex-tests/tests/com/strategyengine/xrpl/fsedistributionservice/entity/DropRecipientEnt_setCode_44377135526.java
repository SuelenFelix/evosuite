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

public class DropRecipientEnt_setCode_44377135526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36753;

    public DropRecipientEnt_setCode_44377135526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36754 = new Long(6426732259596412988L);
        Class<? extends Object> term36870 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term36869 = ((Class) term36870).getDeclaredField((String) "SENDING");
        ((Field) term36869).setAccessible(true);
        Object enum71 = ((Field) term36869).get((Object) null);
        Integer term36807 = new Integer(-1007160944);
        Long term36809 = new Long(185793058502220865L);
        term36753 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term36768 = newInstance(Class.forName("java.util.Date"));
        Object term36770 = newInstance(Class.forName("java.util.Date"));
        setField(term36753, term36753.getClass(), "id", term36754);
        setField(term36753, term36753.getClass(), "address", "pvDEABOxLt");
        setLongField(term36768, term36768.getClass(), "fastTime", 1838150926204L);
        setField(term36768, term36768.getClass(), "cdate", null);
        setField(term36753, term36753.getClass(), "createDate", term36768);
        setLongField(term36770, term36770.getClass(), "fastTime", 1518785790701L);
        setField(term36770, term36770.getClass(), "cdate", null);
        setField(term36753, term36753.getClass(), "updateDate", term36770);
        setField(term36753, term36753.getClass(), "status", enum71);
        setField(term36753, term36753.getClass(), "failReason", "beAMpkroCQ");
        setField(term36753, term36753.getClass(), "code", "uSUvKAyuvd");
        setField(term36753, term36753.getClass(), "retryAttempt", term36807);
        setField(term36753, term36753.getClass(), "dropRequestId", term36809);
        setField(term36753, term36753.getClass(), "snapshotBalance", "onQLVONGuf");
        setField(term36753, term36753.getClass(), "payAmount", "SOrEHbcbmn");
        setField(term36753, term36753.getClass(), "ownedNftId", "bnsyeQXFdu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BwtdjiefJn";
        callMethod(klass, "setCode", argTypes, term36753, args);
    }

};


