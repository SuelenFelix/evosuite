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
import java.lang.String;
import java.lang.Object;

public class DropScheduleEnt_setDropRequestId_153725693221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20693;
     Object term20738;

    public DropScheduleEnt_setDropRequestId_153725693221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20694 = new Long(-1539859611880912454L);
        Class<? extends Object> term20741 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term20740 = ((Class) term20741).getDeclaredField((String) "ANNUALLY");
        ((Field) term20740).setAccessible(true);
        Object enum42 = ((Field) term20740).get((Object) null);
        Class<? extends Object> term21147 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term21146 = ((Class) term21147).getDeclaredField((String) "COMPLETE");
        ((Field) term21146).setAccessible(true);
        Object enum43 = ((Field) term21146).get((Object) null);
        Long term20736 = new Long(4100236067313034103L);
        term20693 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term20708 = newInstance(Class.forName("java.util.Date"));
        Object term20710 = newInstance(Class.forName("java.util.Date"));
        setField(term20693, term20693.getClass(), "id", term20694);
        setField(term20693, term20693.getClass(), "frequency", enum42);
        setLongField(term20708, term20708.getClass(), "fastTime", 1597421765774L);
        setField(term20708, term20708.getClass(), "cdate", null);
        setField(term20693, term20693.getClass(), "repeatUntilDate", term20708);
        setLongField(term20710, term20710.getClass(), "fastTime", 1354735325477L);
        setField(term20710, term20710.getClass(), "cdate", null);
        setField(term20693, term20693.getClass(), "createDate", term20710);
        setField(term20693, term20693.getClass(), "lockUuid", "yGtHPyvYiQ");
        setField(term20693, term20693.getClass(), "dropScheduleStatus", enum43);
        setField(term20693, term20693.getClass(), "dropRequestId", term20736);
        term20738 = new Long(1195529027276497124L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term20738;
        callMethod(klass, "setDropRequestId", argTypes, term20693, args);
    }

};


