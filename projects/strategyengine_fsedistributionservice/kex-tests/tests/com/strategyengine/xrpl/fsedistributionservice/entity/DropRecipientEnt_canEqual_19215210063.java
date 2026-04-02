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

public class DropRecipientEnt_canEqual_19215210063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23587;
     Object term23681;

    public DropRecipientEnt_canEqual_19215210063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23588 = new Long(5219030281405653303L);
        Class<? extends Object> term23693 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term23692 = ((Class) term23693).getDeclaredField((String) "SENDING");
        ((Field) term23692).setAccessible(true);
        Object enum48 = ((Field) term23692).get((Object) null);
        Integer term23641 = new Integer(1484323161);
        Long term23643 = new Long(-8471550651709805183L);
        term23587 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term23602 = newInstance(Class.forName("java.util.Date"));
        Object term23604 = newInstance(Class.forName("java.util.Date"));
        setField(term23587, term23587.getClass(), "id", term23588);
        setField(term23587, term23587.getClass(), "address", "xIeFjkHkOe");
        setLongField(term23602, term23602.getClass(), "fastTime", 1491181740539L);
        setField(term23602, term23602.getClass(), "cdate", null);
        setField(term23587, term23587.getClass(), "createDate", term23602);
        setLongField(term23604, term23604.getClass(), "fastTime", 1461996881310L);
        setField(term23604, term23604.getClass(), "cdate", null);
        setField(term23587, term23587.getClass(), "updateDate", term23604);
        setField(term23587, term23587.getClass(), "status", enum48);
        setField(term23587, term23587.getClass(), "failReason", "SdCKLMIYnX");
        setField(term23587, term23587.getClass(), "code", "OJJtVNPyKZ");
        setField(term23587, term23587.getClass(), "retryAttempt", term23641);
        setField(term23587, term23587.getClass(), "dropRequestId", term23643);
        setField(term23587, term23587.getClass(), "snapshotBalance", "AKNapTAfmD");
        setField(term23587, term23587.getClass(), "payAmount", "xJgPlLxpgC");
        setField(term23587, term23587.getClass(), "ownedNftId", "EYtfuJaxiM");
        term23681 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23681;
        callMethod(klass, "canEqual", argTypes, term23587, args);
    }

};


