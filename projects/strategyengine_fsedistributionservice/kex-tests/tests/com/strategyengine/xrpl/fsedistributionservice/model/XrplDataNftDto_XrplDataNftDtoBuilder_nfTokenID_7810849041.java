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

public class XrplDataNftDto_XrplDataNftDtoBuilder_nfTokenID_7810849041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331551;

    public XrplDataNftDto_XrplDataNftDtoBuilder_nfTokenID_7810849041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331588 = new Long(-8195504192950938590L);
        Long term331590 = new Long(-3141593811423226559L);
        Long term331592 = new Long(165312735504471081L);
        Long term331594 = new Long(7910323873668469704L);
        term331551 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term331551, term331551.getClass(), "nfTokenID", "oLdidoDNLS");
        setField(term331551, term331551.getClass(), "issuer", "EbcXzUOlTx");
        setField(term331551, term331551.getClass(), "owner", "cskZnajTgh");
        setField(term331551, term331551.getClass(), "taxon", term331588);
        setField(term331551, term331551.getClass(), "transferFee", term331590);
        setField(term331551, term331551.getClass(), "flags", term331592);
        setField(term331551, term331551.getClass(), "sequence", term331594);
        setField(term331551, term331551.getClass(), "uri", "WZVuzItKLn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GlWTGuZeKv";
        callMethod(klass, "nfTokenID", argTypes, term331551, args);
    }

};


