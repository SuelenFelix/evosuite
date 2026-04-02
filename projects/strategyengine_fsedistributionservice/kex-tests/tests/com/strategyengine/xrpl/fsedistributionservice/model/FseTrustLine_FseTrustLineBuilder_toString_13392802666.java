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

public class FseTrustLine_FseTrustLineBuilder_toString_13392802666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606949;

    public FseTrustLine_FseTrustLineBuilder_toString_13392802666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606949 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine$FseTrustLineBuilder"));
        setField(term606949, term606949.getClass(), "classicAddress", "CgmarxBJZT");
        setField(term606949, term606949.getClass(), "currency", "keaFywfzbU");
        setField(term606949, term606949.getClass(), "balance", "ADlubZpgSu");
        setField(term606949, term606949.getClass(), "limit", "MzSJDcOtLM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine$FseTrustLineBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term606949, args);
    }

};


