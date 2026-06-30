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

public class XrplDataNftDto_getTaxon_18392684318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334567;

    public XrplDataNftDto_getTaxon_18392684318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334604 = new Long(1342629750107593698L);
        Long term334606 = new Long(-2050224942342343039L);
        Long term334608 = new Long(-2456427474561523240L);
        Long term334610 = new Long(-7010338441819086776L);
        term334567 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334567, term334567.getClass(), "nfTokenID", "JjbnWzssdi");
        setField(term334567, term334567.getClass(), "issuer", "JBjRYdrxgs");
        setField(term334567, term334567.getClass(), "owner", "SGDHQYYzsR");
        setField(term334567, term334567.getClass(), "taxon", term334604);
        setField(term334567, term334567.getClass(), "transferFee", term334606);
        setField(term334567, term334567.getClass(), "flags", term334608);
        setField(term334567, term334567.getClass(), "sequence", term334610);
        setField(term334567, term334567.getClass(), "uri", "hecboVcqgp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaxon", argTypes, term334567, args);
    }

};


