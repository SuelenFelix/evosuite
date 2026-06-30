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

public class FseTrustLine_setClassicAddress_197793863911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407727;

    public FseTrustLine_setClassicAddress_197793863911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407727 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term407727, term407727.getClass(), "classicAddress", "kopyQNUhIV");
        setField(term407727, term407727.getClass(), "currency", "jNxTZuasym");
        setField(term407727, term407727.getClass(), "balance", "pqQZPnGjAE");
        setField(term407727, term407727.getClass(), "limit", "wLFHiajqXh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xNZcqGsPAa";
        callMethod(klass, "setClassicAddress", argTypes, term407727, args);
    }

};


