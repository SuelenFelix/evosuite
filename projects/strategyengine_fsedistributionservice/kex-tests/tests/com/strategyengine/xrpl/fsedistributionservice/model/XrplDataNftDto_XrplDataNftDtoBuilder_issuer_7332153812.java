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

public class XrplDataNftDto_XrplDataNftDtoBuilder_issuer_7332153812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331670;

    public XrplDataNftDto_XrplDataNftDtoBuilder_issuer_7332153812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331707 = new Long(-8034026767184380879L);
        Long term331709 = new Long(-1865079020076651952L);
        Long term331711 = new Long(-6255610460583667093L);
        Long term331713 = new Long(-3947173237186855838L);
        term331670 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term331670, term331670.getClass(), "nfTokenID", "PVYBCybavV");
        setField(term331670, term331670.getClass(), "issuer", "lXOLVBrGzc");
        setField(term331670, term331670.getClass(), "owner", "lWRWhoPZaY");
        setField(term331670, term331670.getClass(), "taxon", term331707);
        setField(term331670, term331670.getClass(), "transferFee", term331709);
        setField(term331670, term331670.getClass(), "flags", term331711);
        setField(term331670, term331670.getClass(), "sequence", term331713);
        setField(term331670, term331670.getClass(), "uri", "jUBVwhASOA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WNLNmPMYIn";
        callMethod(klass, "issuer", argTypes, term331670, args);
    }

};


