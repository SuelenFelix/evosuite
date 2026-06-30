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

public class XrplDataNftDto_hashCode_13442650483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334082;

    public XrplDataNftDto_hashCode_13442650483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334119 = new Long(-4336769198128902991L);
        Long term334121 = new Long(-3441020756295150684L);
        Long term334123 = new Long(-2938034344303060228L);
        Long term334125 = new Long(-758819117507836512L);
        term334082 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334082, term334082.getClass(), "nfTokenID", "THllnCKhSX");
        setField(term334082, term334082.getClass(), "issuer", "QENisOjsdU");
        setField(term334082, term334082.getClass(), "owner", "XcNzjytYdo");
        setField(term334082, term334082.getClass(), "taxon", term334119);
        setField(term334082, term334082.getClass(), "transferFee", term334121);
        setField(term334082, term334082.getClass(), "flags", term334123);
        setField(term334082, term334082.getClass(), "sequence", term334125);
        setField(term334082, term334082.getClass(), "uri", "yaWHpyBtzq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term334082, args);
    }

};


