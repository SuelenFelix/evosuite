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

public class XrplDataNftDto_XrplDataNftDtoBuilder_sequence_20266167227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332205;
     Object term332262;

    public XrplDataNftDto_XrplDataNftDtoBuilder_sequence_20266167227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332242 = new Long(7190487627244901799L);
        Long term332244 = new Long(-5577824208081701355L);
        Long term332246 = new Long(4003767587571884508L);
        Long term332248 = new Long(-4773031420684190217L);
        term332205 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332205, term332205.getClass(), "nfTokenID", "zhxNzTDkbQ");
        setField(term332205, term332205.getClass(), "issuer", "JwcYvvKRwe");
        setField(term332205, term332205.getClass(), "owner", "okLcKGoawO");
        setField(term332205, term332205.getClass(), "taxon", term332242);
        setField(term332205, term332205.getClass(), "transferFee", term332244);
        setField(term332205, term332205.getClass(), "flags", term332246);
        setField(term332205, term332205.getClass(), "sequence", term332248);
        setField(term332205, term332205.getClass(), "uri", "wuJRunvJUq");
        term332262 = new Long(4815723481405472054L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term332262;
        callMethod(klass, "sequence", argTypes, term332205, args);
    }

};


