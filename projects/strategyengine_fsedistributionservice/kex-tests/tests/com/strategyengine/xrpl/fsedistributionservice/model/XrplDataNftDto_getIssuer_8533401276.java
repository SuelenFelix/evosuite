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

public class XrplDataNftDto_getIssuer_8533401276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334373;

    public XrplDataNftDto_getIssuer_8533401276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334410 = new Long(-7055293192926325895L);
        Long term334412 = new Long(9121171957554652661L);
        Long term334414 = new Long(-2752058965354731489L);
        Long term334416 = new Long(-4723024480537897669L);
        term334373 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334373, term334373.getClass(), "nfTokenID", "UGKENyzPxk");
        setField(term334373, term334373.getClass(), "issuer", "xsGPsLxzxW");
        setField(term334373, term334373.getClass(), "owner", "XoKkEYIzVX");
        setField(term334373, term334373.getClass(), "taxon", term334410);
        setField(term334373, term334373.getClass(), "transferFee", term334412);
        setField(term334373, term334373.getClass(), "flags", term334414);
        setField(term334373, term334373.getClass(), "sequence", term334416);
        setField(term334373, term334373.getClass(), "uri", "rtKwDvMEWe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIssuer", argTypes, term334373, args);
    }

};


