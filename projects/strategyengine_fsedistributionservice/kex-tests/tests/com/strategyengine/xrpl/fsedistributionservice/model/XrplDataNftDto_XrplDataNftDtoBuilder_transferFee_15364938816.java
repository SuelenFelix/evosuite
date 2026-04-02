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

public class XrplDataNftDto_XrplDataNftDtoBuilder_transferFee_15364938816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332621;

    public XrplDataNftDto_XrplDataNftDtoBuilder_transferFee_15364938816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332621 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332621, term332621.getClass(), "nfTokenID", null);
        setField(term332621, term332621.getClass(), "issuer", null);
        setField(term332621, term332621.getClass(), "owner", null);
        setField(term332621, term332621.getClass(), "taxon", null);
        setField(term332621, term332621.getClass(), "transferFee", null);
        setField(term332621, term332621.getClass(), "flags", null);
        setField(term332621, term332621.getClass(), "sequence", null);
        setField(term332621, term332621.getClass(), "uri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "transferFee", argTypes, term332621, args);
    }

};


