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

public class TransactionEnt_getDropRequestId_183029885212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;

    public TransactionEnt_getDropRequestId_183029885212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2604 = new Long(846579494941632714L);
        Long term2644 = new Long(6689117472719450333L);
        Long term2646 = new Long(5836128569274066678L);
        term2603 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2618 = newInstance(Class.forName("java.util.Date"));
        setField(term2603, term2603.getClass(), "id", term2604);
        setField(term2603, term2603.getClass(), "hash", "fhkbdRViHi");
        setLongField(term2618, term2618.getClass(), "fastTime", 1876872800559L);
        setField(term2618, term2618.getClass(), "cdate", null);
        setField(term2603, term2603.getClass(), "createDate", term2618);
        setField(term2603, term2603.getClass(), "failReason", "uWHnvSvaPl");
        setField(term2603, term2603.getClass(), "code", "kBdSllIBVz");
        setField(term2603, term2603.getClass(), "dropRecipientId", term2644);
        setField(term2603, term2603.getClass(), "dropRequestId", term2646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term2603, args);
    }

};


