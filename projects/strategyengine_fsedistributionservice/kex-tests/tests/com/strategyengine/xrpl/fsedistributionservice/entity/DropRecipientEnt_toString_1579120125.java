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

public class DropRecipientEnt_toString_1579120125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24738;

    public DropRecipientEnt_toString_1579120125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24739 = new Long(4616440478358528406L);
        Class<? extends Object> term24842 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term24841 = ((Class) term24842).getDeclaredField((String) "FAILED");
        ((Field) term24841).setAccessible(true);
        Object enum50 = ((Field) term24841).get((Object) null);
        Integer term24791 = new Integer(-1922583790);
        Long term24793 = new Long(3427570961451840069L);
        term24738 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term24753 = newInstance(Class.forName("java.util.Date"));
        Object term24755 = newInstance(Class.forName("java.util.Date"));
        setField(term24738, term24738.getClass(), "id", term24739);
        setField(term24738, term24738.getClass(), "address", "LWyEaeIyAo");
        setLongField(term24753, term24753.getClass(), "fastTime", 1369539267611L);
        setField(term24753, term24753.getClass(), "cdate", null);
        setField(term24738, term24738.getClass(), "createDate", term24753);
        setLongField(term24755, term24755.getClass(), "fastTime", 1510275079351L);
        setField(term24755, term24755.getClass(), "cdate", null);
        setField(term24738, term24738.getClass(), "updateDate", term24755);
        setField(term24738, term24738.getClass(), "status", enum50);
        setField(term24738, term24738.getClass(), "failReason", "yVMkkQhvmN");
        setField(term24738, term24738.getClass(), "code", "mvrkADEgpp");
        setField(term24738, term24738.getClass(), "retryAttempt", term24791);
        setField(term24738, term24738.getClass(), "dropRequestId", term24793);
        setField(term24738, term24738.getClass(), "snapshotBalance", "pXOkjyeIRb");
        setField(term24738, term24738.getClass(), "payAmount", "GgZWSjxjyE");
        setField(term24738, term24738.getClass(), "ownedNftId", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24738, args);
    }

};


