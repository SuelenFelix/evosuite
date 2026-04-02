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

public class XrplDataNftDto_XrplDataNftDtoBuilder_taxon_6586491794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331908;
     Object term331965;

    public XrplDataNftDto_XrplDataNftDtoBuilder_taxon_6586491794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331945 = new Long(9113614356317836741L);
        Long term331947 = new Long(2244124922001093690L);
        Long term331949 = new Long(-849289244399400018L);
        Long term331951 = new Long(-5334920917680098031L);
        term331908 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term331908, term331908.getClass(), "nfTokenID", "cuNrapAQtZ");
        setField(term331908, term331908.getClass(), "issuer", "fCiCxxhDyR");
        setField(term331908, term331908.getClass(), "owner", "AseuIhxdgC");
        setField(term331908, term331908.getClass(), "taxon", term331945);
        setField(term331908, term331908.getClass(), "transferFee", term331947);
        setField(term331908, term331908.getClass(), "flags", term331949);
        setField(term331908, term331908.getClass(), "sequence", term331951);
        setField(term331908, term331908.getClass(), "uri", "JXKflOoAwA");
        term331965 = new Long(-5681371087517724194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term331965;
        callMethod(klass, "taxon", argTypes, term331908, args);
    }

};


