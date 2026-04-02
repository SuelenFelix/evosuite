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

public class XrplDataNftDto_setSequence_77303743021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335802;
     Object term335859;

    public XrplDataNftDto_setSequence_77303743021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335839 = new Long(808761243947256536L);
        Long term335841 = new Long(5841040494527118725L);
        Long term335843 = new Long(5535938323123427777L);
        Long term335845 = new Long(1292632924316952683L);
        term335802 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335802, term335802.getClass(), "nfTokenID", "mODhKHNihX");
        setField(term335802, term335802.getClass(), "issuer", "JuAcOfOxNL");
        setField(term335802, term335802.getClass(), "owner", "XaqYbQZIGI");
        setField(term335802, term335802.getClass(), "taxon", term335839);
        setField(term335802, term335802.getClass(), "transferFee", term335841);
        setField(term335802, term335802.getClass(), "flags", term335843);
        setField(term335802, term335802.getClass(), "sequence", term335845);
        setField(term335802, term335802.getClass(), "uri", "grTooFWhNl");
        term335859 = new Long(2896485328388781986L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term335859;
        callMethod(klass, "setSequence", argTypes, term335802, args);
    }

};


