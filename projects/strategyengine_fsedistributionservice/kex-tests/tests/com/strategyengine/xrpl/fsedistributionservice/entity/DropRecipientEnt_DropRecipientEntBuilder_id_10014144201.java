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

public class DropRecipientEnt_DropRecipientEntBuilder_id_10014144201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40333;
     Object term40426;

    public DropRecipientEnt_DropRecipientEntBuilder_id_10014144201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40334 = new Long(3238645206498300107L);
        Class<? extends Object> term40439 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term40438 = ((Class) term40439).getDeclaredField((String) "FAILED");
        ((Field) term40438).setAccessible(true);
        Object enum77 = ((Field) term40438).get((Object) null);
        Integer term40386 = new Integer(-1179120542);
        Long term40388 = new Long(-1592696983130738594L);
        term40333 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term40348 = newInstance(Class.forName("java.util.Date"));
        Object term40350 = newInstance(Class.forName("java.util.Date"));
        setField(term40333, term40333.getClass(), "id", term40334);
        setField(term40333, term40333.getClass(), "address", "EdPAvpluZg");
        setLongField(term40348, term40348.getClass(), "fastTime", 1267044489300L);
        setField(term40348, term40348.getClass(), "cdate", null);
        setField(term40333, term40333.getClass(), "createDate", term40348);
        setLongField(term40350, term40350.getClass(), "fastTime", 1446437953738L);
        setField(term40350, term40350.getClass(), "cdate", null);
        setField(term40333, term40333.getClass(), "updateDate", term40350);
        setField(term40333, term40333.getClass(), "status", enum77);
        setField(term40333, term40333.getClass(), "failReason", "DzHVBMqWtE");
        setField(term40333, term40333.getClass(), "code", "THZSpzBRYP");
        setField(term40333, term40333.getClass(), "retryAttempt", term40386);
        setField(term40333, term40333.getClass(), "dropRequestId", term40388);
        setField(term40333, term40333.getClass(), "snapshotBalance", "ZfBIVGBQOE");
        setField(term40333, term40333.getClass(), "payAmount", "QSrDQfEsTR");
        setField(term40333, term40333.getClass(), "ownedNftId", "PsqusYmejD");
        term40426 = new Long(6902365338255307910L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term40426;
        callMethod(klass, "id", argTypes, term40333, args);
    }

};


