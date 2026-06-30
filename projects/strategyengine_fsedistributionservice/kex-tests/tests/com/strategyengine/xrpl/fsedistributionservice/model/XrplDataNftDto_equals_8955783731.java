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

public class XrplDataNftDto_equals_8955783731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333886;
     Object term333943;

    public XrplDataNftDto_equals_8955783731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term333923 = new Long(-5269076898456067678L);
        Long term333925 = new Long(2124275424075254005L);
        Long term333927 = new Long(-6616339196088014666L);
        Long term333929 = new Long(-1437596366836021966L);
        term333886 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term333886, term333886.getClass(), "nfTokenID", "lWjrRjjSxQ");
        setField(term333886, term333886.getClass(), "issuer", "YTiiBmPBxA");
        setField(term333886, term333886.getClass(), "owner", "DeKKQvsCKV");
        setField(term333886, term333886.getClass(), "taxon", term333923);
        setField(term333886, term333886.getClass(), "transferFee", term333925);
        setField(term333886, term333886.getClass(), "flags", term333927);
        setField(term333886, term333886.getClass(), "sequence", term333929);
        setField(term333886, term333886.getClass(), "uri", "djcluFSRjM");
        term333943 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term333943;
        callMethod(klass, "equals", argTypes, term333886, args);
    }

};


