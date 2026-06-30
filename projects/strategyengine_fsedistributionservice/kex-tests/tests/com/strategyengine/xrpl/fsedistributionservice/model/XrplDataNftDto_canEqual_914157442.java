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

public class XrplDataNftDto_canEqual_914157442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333984;
     Object term334041;

    public XrplDataNftDto_canEqual_914157442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334021 = new Long(8542753860527083778L);
        Long term334023 = new Long(-7981877752051488010L);
        Long term334025 = new Long(4486175312218543930L);
        Long term334027 = new Long(-5866516262253090421L);
        term333984 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term333984, term333984.getClass(), "nfTokenID", "MBcybJsfOP");
        setField(term333984, term333984.getClass(), "issuer", "spZaeqpTCZ");
        setField(term333984, term333984.getClass(), "owner", "vXFjQWxORA");
        setField(term333984, term333984.getClass(), "taxon", term334021);
        setField(term333984, term333984.getClass(), "transferFee", term334023);
        setField(term333984, term333984.getClass(), "flags", term334025);
        setField(term333984, term333984.getClass(), "sequence", term334027);
        setField(term333984, term333984.getClass(), "uri", "jzhkCKcgje");
        term334041 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term334041;
        callMethod(klass, "canEqual", argTypes, term333984, args);
    }

};


