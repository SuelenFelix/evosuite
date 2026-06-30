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

public class XrplDataNftDto_getNfTokenID_7908418645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334276;

    public XrplDataNftDto_getNfTokenID_7908418645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334313 = new Long(-921066654455496205L);
        Long term334315 = new Long(7622401904339010124L);
        Long term334317 = new Long(-761256632171362830L);
        Long term334319 = new Long(6975846341920664143L);
        term334276 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334276, term334276.getClass(), "nfTokenID", "rWmZbuScqX");
        setField(term334276, term334276.getClass(), "issuer", "TjNFMlAPjg");
        setField(term334276, term334276.getClass(), "owner", "RtwermybyK");
        setField(term334276, term334276.getClass(), "taxon", term334313);
        setField(term334276, term334276.getClass(), "transferFee", term334315);
        setField(term334276, term334276.getClass(), "flags", term334317);
        setField(term334276, term334276.getClass(), "sequence", term334319);
        setField(term334276, term334276.getClass(), "uri", "viHGfcpsVu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNfTokenID", argTypes, term334276, args);
    }

};


