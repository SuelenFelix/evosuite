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

public class XrplDataNftDto_getUri_166258818412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334955;

    public XrplDataNftDto_getUri_166258818412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334992 = new Long(3917904228139004931L);
        Long term334994 = new Long(-2746162973618820048L);
        Long term334996 = new Long(-5466267958566655205L);
        Long term334998 = new Long(4066162530086558234L);
        term334955 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334955, term334955.getClass(), "nfTokenID", "wghzZSjyPl");
        setField(term334955, term334955.getClass(), "issuer", "CPkpKPIQrd");
        setField(term334955, term334955.getClass(), "owner", "KTqaReORfO");
        setField(term334955, term334955.getClass(), "taxon", term334992);
        setField(term334955, term334955.getClass(), "transferFee", term334994);
        setField(term334955, term334955.getClass(), "flags", term334996);
        setField(term334955, term334955.getClass(), "sequence", term334998);
        setField(term334955, term334955.getClass(), "uri", "AfaIIRjDxi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUri", argTypes, term334955, args);
    }

};


