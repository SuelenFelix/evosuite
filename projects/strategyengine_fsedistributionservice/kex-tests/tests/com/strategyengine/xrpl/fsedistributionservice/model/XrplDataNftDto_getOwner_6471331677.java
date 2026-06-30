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

public class XrplDataNftDto_getOwner_6471331677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334470;

    public XrplDataNftDto_getOwner_6471331677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334507 = new Long(-8609587218393726408L);
        Long term334509 = new Long(4133412897876628646L);
        Long term334511 = new Long(-4233021136506075526L);
        Long term334513 = new Long(9041534029896652168L);
        term334470 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334470, term334470.getClass(), "nfTokenID", "FjPjLYxYCD");
        setField(term334470, term334470.getClass(), "issuer", "MVKJWagTKW");
        setField(term334470, term334470.getClass(), "owner", "JrgxSjdHDm");
        setField(term334470, term334470.getClass(), "taxon", term334507);
        setField(term334470, term334470.getClass(), "transferFee", term334509);
        setField(term334470, term334470.getClass(), "flags", term334511);
        setField(term334470, term334470.getClass(), "sequence", term334513);
        setField(term334470, term334470.getClass(), "uri", "oYTaCsZgHc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term334470, args);
    }

};


