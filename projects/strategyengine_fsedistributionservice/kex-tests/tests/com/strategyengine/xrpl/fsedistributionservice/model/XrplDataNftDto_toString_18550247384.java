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

public class XrplDataNftDto_toString_18550247384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334179;

    public XrplDataNftDto_toString_18550247384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334216 = new Long(-1855660992126411308L);
        Long term334218 = new Long(-6435676296015352817L);
        Long term334220 = new Long(-3817606000638396608L);
        Long term334222 = new Long(-1435639144971145612L);
        term334179 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334179, term334179.getClass(), "nfTokenID", "avheFeRlbW");
        setField(term334179, term334179.getClass(), "issuer", "tOwnGveRxa");
        setField(term334179, term334179.getClass(), "owner", "poFpgGCWFn");
        setField(term334179, term334179.getClass(), "taxon", term334216);
        setField(term334179, term334179.getClass(), "transferFee", term334218);
        setField(term334179, term334179.getClass(), "flags", term334220);
        setField(term334179, term334179.getClass(), "sequence", term334222);
        setField(term334179, term334179.getClass(), "uri", "RqdyWjrKTf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term334179, args);
    }

};


