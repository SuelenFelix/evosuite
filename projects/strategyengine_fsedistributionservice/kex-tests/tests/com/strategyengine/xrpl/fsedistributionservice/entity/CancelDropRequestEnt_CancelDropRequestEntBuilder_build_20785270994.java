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

public class CancelDropRequestEnt_CancelDropRequestEntBuilder_build_20785270994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241823;

    public CancelDropRequestEnt_CancelDropRequestEntBuilder_build_20785270994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241824 = new Long(7921404547326630089L);
        Long term241828 = new Long(2155219577693802424L);
        term241823 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder"));
        Object term241826 = newInstance(Class.forName("java.util.Date"));
        setField(term241823, term241823.getClass(), "id", term241824);
        setLongField(term241826, term241826.getClass(), "fastTime", 1499144843041L);
        setField(term241826, term241826.getClass(), "cdate", null);
        setField(term241823, term241823.getClass(), "createDate", term241826);
        setField(term241823, term241823.getClass(), "dropRequestId", term241828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term241823, args);
    }

};


