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

public class DropRecipientEnt_getOwnedNftId_178075101617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31654;

    public DropRecipientEnt_getOwnedNftId_178075101617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31655 = new Long(5246058710498845622L);
        Class<? extends Object> term31758 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term31757 = ((Class) term31758).getDeclaredField((String) "FAILED");
        ((Field) term31757).setAccessible(true);
        Object enum62 = ((Field) term31757).get((Object) null);
        Integer term31707 = new Integer(-1685132342);
        Long term31709 = new Long(4394651392080968777L);
        term31654 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term31669 = newInstance(Class.forName("java.util.Date"));
        Object term31671 = newInstance(Class.forName("java.util.Date"));
        setField(term31654, term31654.getClass(), "id", term31655);
        setField(term31654, term31654.getClass(), "address", "izPpKDErnQ");
        setLongField(term31669, term31669.getClass(), "fastTime", 1709178890088L);
        setField(term31669, term31669.getClass(), "cdate", null);
        setField(term31654, term31654.getClass(), "createDate", term31669);
        setLongField(term31671, term31671.getClass(), "fastTime", 1644776129220L);
        setField(term31671, term31671.getClass(), "cdate", null);
        setField(term31654, term31654.getClass(), "updateDate", term31671);
        setField(term31654, term31654.getClass(), "status", enum62);
        setField(term31654, term31654.getClass(), "failReason", "NnpwZBUTvx");
        setField(term31654, term31654.getClass(), "code", "tlQSNgTkQX");
        setField(term31654, term31654.getClass(), "retryAttempt", term31707);
        setField(term31654, term31654.getClass(), "dropRequestId", term31709);
        setField(term31654, term31654.getClass(), "snapshotBalance", "PCipZnmBOF");
        setField(term31654, term31654.getClass(), "payAmount", "zcorEihhLK");
        setField(term31654, term31654.getClass(), "ownedNftId", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwnedNftId", argTypes, term31654, args);
    }

};


