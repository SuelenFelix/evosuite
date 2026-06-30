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

public class XrplDataNftDto_XrplDataNftDtoBuilder_flags_14119456886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332106;
     Object term332163;

    public XrplDataNftDto_XrplDataNftDtoBuilder_flags_14119456886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term332143 = new Long(6207481297504886524L);
        Long term332145 = new Long(-8869783148712995243L);
        Long term332147 = new Long(9148095734887346640L);
        Long term332149 = new Long(-5311570055634772542L);
        term332106 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term332106, term332106.getClass(), "nfTokenID", "ZVxspVELsB");
        setField(term332106, term332106.getClass(), "issuer", "lwBTtSWyCb");
        setField(term332106, term332106.getClass(), "owner", "jalAJUuHgn");
        setField(term332106, term332106.getClass(), "taxon", term332143);
        setField(term332106, term332106.getClass(), "transferFee", term332145);
        setField(term332106, term332106.getClass(), "flags", term332147);
        setField(term332106, term332106.getClass(), "sequence", term332149);
        setField(term332106, term332106.getClass(), "uri", "KqPWpTvDAg");
        term332163 = new Long(-1279719656945091084L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term332163;
        callMethod(klass, "flags", argTypes, term332106, args);
    }

};


