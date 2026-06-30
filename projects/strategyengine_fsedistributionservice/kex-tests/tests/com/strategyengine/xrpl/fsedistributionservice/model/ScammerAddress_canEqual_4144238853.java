package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddress_canEqual_4144238853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566920;
     Object term566951;

    public ScammerAddress_canEqual_4144238853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566921 = new Long(7598786125321910224L);
        term566920 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term566935 = newInstance(Class.forName("java.util.Date"));
        Object term566937 = newInstance(Class.forName("java.util.Date"));
        setField(term566920, term566920.getClass(), "id", term566921);
        setField(term566920, term566920.getClass(), "account", "hIFzWFybun");
        setLongField(term566935, term566935.getClass(), "fastTime", 1289595945693L);
        setField(term566935, term566935.getClass(), "cdate", null);
        setField(term566920, term566920.getClass(), "createDate", term566935);
        setLongField(term566937, term566937.getClass(), "fastTime", 1403996270153L);
        setField(term566937, term566937.getClass(), "cdate", null);
        setField(term566920, term566920.getClass(), "updateDate", term566937);
        setField(term566920, term566920.getClass(), "type", "efPIDmXVuA");
        term566951 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term566951;
        callMethod(klass, "canEqual", argTypes, term566920, args);
    }

};


