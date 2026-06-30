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

public class DropRecipientEnt_setId_16380108620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32799;
     Object term32893;

    public DropRecipientEnt_setId_16380108620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32800 = new Long(9205327385733285058L);
        Class<? extends Object> term32906 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term32905 = ((Class) term32906).getDeclaredField((String) "SENDING");
        ((Field) term32905).setAccessible(true);
        Object enum64 = ((Field) term32905).get((Object) null);
        Integer term32853 = new Integer(1622346318);
        Long term32855 = new Long(4199886998224701110L);
        term32799 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term32814 = newInstance(Class.forName("java.util.Date"));
        Object term32816 = newInstance(Class.forName("java.util.Date"));
        setField(term32799, term32799.getClass(), "id", term32800);
        setField(term32799, term32799.getClass(), "address", "NzBMMhkhpT");
        setLongField(term32814, term32814.getClass(), "fastTime", 1862657813973L);
        setField(term32814, term32814.getClass(), "cdate", null);
        setField(term32799, term32799.getClass(), "createDate", term32814);
        setLongField(term32816, term32816.getClass(), "fastTime", 1299431078379L);
        setField(term32816, term32816.getClass(), "cdate", null);
        setField(term32799, term32799.getClass(), "updateDate", term32816);
        setField(term32799, term32799.getClass(), "status", enum64);
        setField(term32799, term32799.getClass(), "failReason", "qCpEbQDHdF");
        setField(term32799, term32799.getClass(), "code", "AHbZyFOmlo");
        setField(term32799, term32799.getClass(), "retryAttempt", term32853);
        setField(term32799, term32799.getClass(), "dropRequestId", term32855);
        setField(term32799, term32799.getClass(), "snapshotBalance", "TwfWVQGiIj");
        setField(term32799, term32799.getClass(), "payAmount", "gUvcueTURF");
        setField(term32799, term32799.getClass(), "ownedNftId", "EwQBhZjCIT");
        term32893 = new Long(8540994973773607992L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32893;
        callMethod(klass, "setId", argTypes, term32799, args);
    }

};


