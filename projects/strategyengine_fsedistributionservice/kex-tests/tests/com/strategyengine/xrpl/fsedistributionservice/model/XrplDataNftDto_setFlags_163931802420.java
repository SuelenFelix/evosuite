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

public class XrplDataNftDto_setFlags_163931802420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335703;
     Object term335760;

    public XrplDataNftDto_setFlags_163931802420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335740 = new Long(-7883918174480028850L);
        Long term335742 = new Long(3512582740653676967L);
        Long term335744 = new Long(-6893173979797141349L);
        Long term335746 = new Long(8849217995403029606L);
        term335703 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335703, term335703.getClass(), "nfTokenID", "xHufEneCSu");
        setField(term335703, term335703.getClass(), "issuer", "dcNBqbQVSa");
        setField(term335703, term335703.getClass(), "owner", "voFZMRWdRg");
        setField(term335703, term335703.getClass(), "taxon", term335740);
        setField(term335703, term335703.getClass(), "transferFee", term335742);
        setField(term335703, term335703.getClass(), "flags", term335744);
        setField(term335703, term335703.getClass(), "sequence", term335746);
        setField(term335703, term335703.getClass(), "uri", "xUCRGyGVPj");
        term335760 = new Long(2179437725582700997L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term335760;
        callMethod(klass, "setFlags", argTypes, term335703, args);
    }

};


