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

public class XrplDataNftDto_setNfTokenID_62808442415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335148;

    public XrplDataNftDto_setNfTokenID_62808442415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335185 = new Long(-5097855288490086692L);
        Long term335187 = new Long(-8356953418230835643L);
        Long term335189 = new Long(-2213998544405629464L);
        Long term335191 = new Long(226516165063797489L);
        term335148 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335148, term335148.getClass(), "nfTokenID", "xhQojgWfiF");
        setField(term335148, term335148.getClass(), "issuer", "hFxhVQNBry");
        setField(term335148, term335148.getClass(), "owner", "JrFOkJdQNH");
        setField(term335148, term335148.getClass(), "taxon", term335185);
        setField(term335148, term335148.getClass(), "transferFee", term335187);
        setField(term335148, term335148.getClass(), "flags", term335189);
        setField(term335148, term335148.getClass(), "sequence", term335191);
        setField(term335148, term335148.getClass(), "uri", "SgjnbEXsMB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vvGvdVbopl";
        callMethod(klass, "setNfTokenID", argTypes, term335148, args);
    }

};


