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

public class XrplDataNftDto_XrplDataNftDtoBuilder_owner_10202388333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331789;

    public XrplDataNftDto_XrplDataNftDtoBuilder_owner_10202388333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331826 = new Long(1186857065042697930L);
        Long term331828 = new Long(1659080369100392023L);
        Long term331830 = new Long(854087753192360238L);
        Long term331832 = new Long(-6246278604466261475L);
        term331789 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder"));
        setField(term331789, term331789.getClass(), "nfTokenID", "uGYzQjwRvb");
        setField(term331789, term331789.getClass(), "issuer", "nkZCVHXnmb");
        setField(term331789, term331789.getClass(), "owner", "eevshnfTuP");
        setField(term331789, term331789.getClass(), "taxon", term331826);
        setField(term331789, term331789.getClass(), "transferFee", term331828);
        setField(term331789, term331789.getClass(), "flags", term331830);
        setField(term331789, term331789.getClass(), "sequence", term331832);
        setField(term331789, term331789.getClass(), "uri", "HzOxmBbucP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto$XrplDataNftDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lVuUoDaGSk";
        callMethod(klass, "owner", argTypes, term331789, args);
    }

};


