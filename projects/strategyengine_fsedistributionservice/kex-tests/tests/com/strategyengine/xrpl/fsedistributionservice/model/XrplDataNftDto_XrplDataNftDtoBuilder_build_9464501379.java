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

public class XrplDataNftDto_XrplDataNftDtoBuilder_build_9464501379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332423;

    public XrplDataNftDto_XrplDataNftDtoBuilder_build_9464501379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332460 = new Long(-4539648422466320845L);
        Long term332462 = new Long(369988508829037253L);
        Long term332464 = new Long(-9069994265835848577L);
        Long term332466 = new Long(-1698215709085558019L);
        term332423 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332423, term332423.getClass(), "nfTokenID", "xRVYXsEcrn");
        setField(term332423, term332423.getClass(), "issuer", "PwyEzyzkFI");
        setField(term332423, term332423.getClass(), "owner", "QyBqhwjZjI");
        setField(term332423, term332423.getClass(), "taxon", term332460);
        setField(term332423, term332423.getClass(), "transferFee", term332462);
        setField(term332423, term332423.getClass(), "flags", term332464);
        setField(term332423, term332423.getClass(), "sequence", term332466);
        setField(term332423, term332423.getClass(), "uri", "WTJsUQWrPu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term332423, args);
    }

};


