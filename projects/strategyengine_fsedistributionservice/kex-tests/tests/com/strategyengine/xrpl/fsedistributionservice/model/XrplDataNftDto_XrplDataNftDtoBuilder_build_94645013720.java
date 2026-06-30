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

public class XrplDataNftDto_XrplDataNftDtoBuilder_build_94645013720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332625;

    public XrplDataNftDto_XrplDataNftDtoBuilder_build_94645013720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332625 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332625, term332625.getClass(), "nfTokenID", null);
        setField(term332625, term332625.getClass(), "issuer", null);
        setField(term332625, term332625.getClass(), "owner", null);
        setField(term332625, term332625.getClass(), "taxon", null);
        setField(term332625, term332625.getClass(), "transferFee", null);
        setField(term332625, term332625.getClass(), "flags", null);
        setField(term332625, term332625.getClass(), "sequence", null);
        setField(term332625, term332625.getClass(), "uri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term332625, args);
    }

};


