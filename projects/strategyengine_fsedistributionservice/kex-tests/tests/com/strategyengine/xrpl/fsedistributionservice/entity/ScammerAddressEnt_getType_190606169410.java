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

public class ScammerAddressEnt_getType_190606169410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239352;

    public ScammerAddressEnt_getType_190606169410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239353 = new Long(6151197215723513345L);
        term239352 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239367 = newInstance(Class.forName("java.util.Date"));
        Object term239369 = newInstance(Class.forName("java.util.Date"));
        setField(term239352, term239352.getClass(), "id", term239353);
        setField(term239352, term239352.getClass(), "address", "VuprBjhWdI");
        setLongField(term239367, term239367.getClass(), "fastTime", 1431597537131L);
        setField(term239367, term239367.getClass(), "cdate", null);
        setField(term239352, term239352.getClass(), "createDate", term239367);
        setLongField(term239369, term239369.getClass(), "fastTime", 1417943521310L);
        setField(term239369, term239369.getClass(), "cdate", null);
        setField(term239352, term239352.getClass(), "updateDate", term239369);
        setField(term239352, term239352.getClass(), "type", "CFGOXMbAUn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term239352, args);
    }

};


