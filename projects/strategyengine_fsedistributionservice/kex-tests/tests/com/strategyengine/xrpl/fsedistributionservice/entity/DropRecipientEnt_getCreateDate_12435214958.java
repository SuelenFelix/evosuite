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

public class DropRecipientEnt_getCreateDate_12435214958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26465;

    public DropRecipientEnt_getCreateDate_12435214958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26466 = new Long(-5724112525188606013L);
        Class<? extends Object> term26569 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term26568 = ((Class) term26569).getDeclaredField((String) "FAILED");
        ((Field) term26568).setAccessible(true);
        Object enum53 = ((Field) term26568).get((Object) null);
        Integer term26518 = new Integer(-2038273078);
        Long term26520 = new Long(-6100012593724108983L);
        term26465 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term26480 = newInstance(Class.forName("java.util.Date"));
        Object term26482 = newInstance(Class.forName("java.util.Date"));
        setField(term26465, term26465.getClass(), "id", term26466);
        setField(term26465, term26465.getClass(), "address", "HWkpTmtlrc");
        setLongField(term26480, term26480.getClass(), "fastTime", 1714975302670L);
        setField(term26480, term26480.getClass(), "cdate", null);
        setField(term26465, term26465.getClass(), "createDate", term26480);
        setLongField(term26482, term26482.getClass(), "fastTime", 1830753077357L);
        setField(term26482, term26482.getClass(), "cdate", null);
        setField(term26465, term26465.getClass(), "updateDate", term26482);
        setField(term26465, term26465.getClass(), "status", enum53);
        setField(term26465, term26465.getClass(), "failReason", "hMmaoREuCK");
        setField(term26465, term26465.getClass(), "code", "VeDtgDzGAN");
        setField(term26465, term26465.getClass(), "retryAttempt", term26518);
        setField(term26465, term26465.getClass(), "dropRequestId", term26520);
        setField(term26465, term26465.getClass(), "snapshotBalance", "aWYOWZFyaX");
        setField(term26465, term26465.getClass(), "payAmount", "BRIVNtfUWU");
        setField(term26465, term26465.getClass(), "ownedNftId", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term26465, args);
    }

};


