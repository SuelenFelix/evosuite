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

public class ScammerAddressEnt_setUpdateDate_75807655816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239632;
     Object term239663;

    public ScammerAddressEnt_setUpdateDate_75807655816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239633 = new Long(-6664891356964396236L);
        term239632 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239647 = newInstance(Class.forName("java.util.Date"));
        Object term239649 = newInstance(Class.forName("java.util.Date"));
        setField(term239632, term239632.getClass(), "id", term239633);
        setField(term239632, term239632.getClass(), "address", "dyqukIBJxC");
        setLongField(term239647, term239647.getClass(), "fastTime", 1567913763811L);
        setField(term239647, term239647.getClass(), "cdate", null);
        setField(term239632, term239632.getClass(), "createDate", term239647);
        setLongField(term239649, term239649.getClass(), "fastTime", 1743926303358L);
        setField(term239649, term239649.getClass(), "cdate", null);
        setField(term239632, term239632.getClass(), "updateDate", term239649);
        setField(term239632, term239632.getClass(), "type", "MVMiGQdgnX");
        term239663 = newInstance(Class.forName("java.util.Date"));
        setLongField(term239663, term239663.getClass(), "fastTime", 1848128420821L);
        setField(term239663, term239663.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term239663;
        callMethod(klass, "setUpdateDate", argTypes, term239632, args);
    }

};


