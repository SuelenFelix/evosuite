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

public class XrplDataNftDto_setTransferFee_23058750819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335604;
     Object term335661;

    public XrplDataNftDto_setTransferFee_23058750819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335641 = new Long(7068447368781427495L);
        Long term335643 = new Long(7899092949241236700L);
        Long term335645 = new Long(3369965039136843143L);
        Long term335647 = new Long(-383809899410674609L);
        term335604 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335604, term335604.getClass(), "nfTokenID", "YdjPhVNTEu");
        setField(term335604, term335604.getClass(), "issuer", "rLgUagmMGn");
        setField(term335604, term335604.getClass(), "owner", "EZlpBOXfGZ");
        setField(term335604, term335604.getClass(), "taxon", term335641);
        setField(term335604, term335604.getClass(), "transferFee", term335643);
        setField(term335604, term335604.getClass(), "flags", term335645);
        setField(term335604, term335604.getClass(), "sequence", term335647);
        setField(term335604, term335604.getClass(), "uri", "XkQUchkoze");
        term335661 = new Long(4633443327989555279L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term335661;
        callMethod(klass, "setTransferFee", argTypes, term335604, args);
    }

};


