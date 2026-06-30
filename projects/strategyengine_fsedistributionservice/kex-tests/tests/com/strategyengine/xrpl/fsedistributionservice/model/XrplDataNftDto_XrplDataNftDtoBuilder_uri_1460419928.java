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

public class XrplDataNftDto_XrplDataNftDtoBuilder_uri_1460419928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332304;

    public XrplDataNftDto_XrplDataNftDtoBuilder_uri_1460419928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332341 = new Long(8621736372873134417L);
        Long term332343 = new Long(5106927272042726665L);
        Long term332345 = new Long(6913945762720683253L);
        Long term332347 = new Long(-7873197993099724563L);
        term332304 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332304, term332304.getClass(), "nfTokenID", "lkSPvxhaVR");
        setField(term332304, term332304.getClass(), "issuer", "hVlTtmyLIH");
        setField(term332304, term332304.getClass(), "owner", "utKaBGMcsA");
        setField(term332304, term332304.getClass(), "taxon", term332341);
        setField(term332304, term332304.getClass(), "transferFee", term332343);
        setField(term332304, term332304.getClass(), "flags", term332345);
        setField(term332304, term332304.getClass(), "sequence", term332347);
        setField(term332304, term332304.getClass(), "uri", "lmuWGCZjgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cEZMciSNtX";
        callMethod(klass, "uri", argTypes, term332304, args);
    }

};


