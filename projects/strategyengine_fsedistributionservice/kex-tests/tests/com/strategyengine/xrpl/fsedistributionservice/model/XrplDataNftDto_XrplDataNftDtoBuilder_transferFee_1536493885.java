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

public class XrplDataNftDto_XrplDataNftDtoBuilder_transferFee_1536493885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332007;
     Object term332064;

    public XrplDataNftDto_XrplDataNftDtoBuilder_transferFee_1536493885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332044 = new Long(-2109397517777696156L);
        Long term332046 = new Long(6631484353678437959L);
        Long term332048 = new Long(-1763360854589438694L);
        Long term332050 = new Long(-4225690761644993738L);
        term332007 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332007, term332007.getClass(), "nfTokenID", "sqUthQtpCU");
        setField(term332007, term332007.getClass(), "issuer", "heMCJQtnSe");
        setField(term332007, term332007.getClass(), "owner", "nozhcagtoi");
        setField(term332007, term332007.getClass(), "taxon", term332044);
        setField(term332007, term332007.getClass(), "transferFee", term332046);
        setField(term332007, term332007.getClass(), "flags", term332048);
        setField(term332007, term332007.getClass(), "sequence", term332050);
        setField(term332007, term332007.getClass(), "uri", "UAotjofyqR");
        term332064 = new Long(4498588544424613697L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term332064;
        callMethod(klass, "transferFee", argTypes, term332007, args);
    }

};


