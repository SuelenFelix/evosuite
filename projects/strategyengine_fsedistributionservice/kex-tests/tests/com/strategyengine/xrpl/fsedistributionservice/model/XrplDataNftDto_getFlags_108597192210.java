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

public class XrplDataNftDto_getFlags_108597192210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334761;

    public XrplDataNftDto_getFlags_108597192210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334798 = new Long(3345606904545902400L);
        Long term334800 = new Long(-6289397283685653555L);
        Long term334802 = new Long(4270489998641176236L);
        Long term334804 = new Long(7649159120514186821L);
        term334761 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334761, term334761.getClass(), "nfTokenID", "QSvmOZQTXd");
        setField(term334761, term334761.getClass(), "issuer", "vQLwJDUryB");
        setField(term334761, term334761.getClass(), "owner", "JhCgwQaWUU");
        setField(term334761, term334761.getClass(), "taxon", term334798);
        setField(term334761, term334761.getClass(), "transferFee", term334800);
        setField(term334761, term334761.getClass(), "flags", term334802);
        setField(term334761, term334761.getClass(), "sequence", term334804);
        setField(term334761, term334761.getClass(), "uri", "MbEifzcdun");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlags", argTypes, term334761, args);
    }

};


