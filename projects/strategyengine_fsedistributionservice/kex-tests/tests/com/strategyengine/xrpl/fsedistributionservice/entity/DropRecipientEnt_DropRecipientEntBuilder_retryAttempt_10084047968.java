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

public class DropRecipientEnt_DropRecipientEntBuilder_retryAttempt_10084047968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44444;
     Object term44537;

    public DropRecipientEnt_DropRecipientEntBuilder_retryAttempt_10084047968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44445 = new Long(-7406618974062419277L);
        Class<? extends Object> term44550 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term44549 = ((Class) term44550).getDeclaredField((String) "QUEUED");
        ((Field) term44549).setAccessible(true);
        Object enum84 = ((Field) term44549).get((Object) null);
        Integer term44497 = new Integer(-1145578966);
        Long term44499 = new Long(868503089567085985L);
        term44444 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term44459 = newInstance(Class.forName("java.util.Date"));
        Object term44461 = newInstance(Class.forName("java.util.Date"));
        setField(term44444, term44444.getClass(), "id", term44445);
        setField(term44444, term44444.getClass(), "address", "qFGKIJjlmV");
        setLongField(term44459, term44459.getClass(), "fastTime", 1615579184168L);
        setField(term44459, term44459.getClass(), "cdate", null);
        setField(term44444, term44444.getClass(), "createDate", term44459);
        setLongField(term44461, term44461.getClass(), "fastTime", 1440882974759L);
        setField(term44461, term44461.getClass(), "cdate", null);
        setField(term44444, term44444.getClass(), "updateDate", term44461);
        setField(term44444, term44444.getClass(), "status", enum84);
        setField(term44444, term44444.getClass(), "failReason", "IHqvyhMtuM");
        setField(term44444, term44444.getClass(), "code", "dAldIGYAXV");
        setField(term44444, term44444.getClass(), "retryAttempt", term44497);
        setField(term44444, term44444.getClass(), "dropRequestId", term44499);
        setField(term44444, term44444.getClass(), "snapshotBalance", "mLwibAPEsa");
        setField(term44444, term44444.getClass(), "payAmount", "zsWKWiTFuo");
        setField(term44444, term44444.getClass(), "ownedNftId", "UPUbwyHQKN");
        term44537 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term44537;
        callMethod(klass, "retryAttempt", argTypes, term44444, args);
    }

};


