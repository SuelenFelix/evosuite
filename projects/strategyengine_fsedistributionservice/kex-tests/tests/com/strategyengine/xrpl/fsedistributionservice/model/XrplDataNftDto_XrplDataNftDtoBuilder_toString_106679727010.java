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

public class XrplDataNftDto_XrplDataNftDtoBuilder_toString_106679727010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332520;

    public XrplDataNftDto_XrplDataNftDtoBuilder_toString_106679727010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332557 = new Long(-9057998854977924783L);
        Long term332559 = new Long(8015201292704898322L);
        Long term332561 = new Long(623115373634781772L);
        Long term332563 = new Long(-6928102703492980650L);
        term332520 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332520, term332520.getClass(), "nfTokenID", "IwDJSFYrvd");
        setField(term332520, term332520.getClass(), "issuer", "zIcvqyfLta");
        setField(term332520, term332520.getClass(), "owner", "HAReZkXopn");
        setField(term332520, term332520.getClass(), "taxon", term332557);
        setField(term332520, term332520.getClass(), "transferFee", term332559);
        setField(term332520, term332520.getClass(), "flags", term332561);
        setField(term332520, term332520.getClass(), "sequence", term332563);
        setField(term332520, term332520.getClass(), "uri", "clSasMmBlm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term332520, args);
    }

};


