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

public class XrplDataNftDto_setIssuer_99257368916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335267;

    public XrplDataNftDto_setIssuer_99257368916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335304 = new Long(-5055043026089632641L);
        Long term335306 = new Long(-3602145915631274444L);
        Long term335308 = new Long(1978286377020745883L);
        Long term335310 = new Long(2957284484642534979L);
        term335267 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335267, term335267.getClass(), "nfTokenID", "oWsWBayari");
        setField(term335267, term335267.getClass(), "issuer", "zHAsiDDJCb");
        setField(term335267, term335267.getClass(), "owner", "yQPIyadxOz");
        setField(term335267, term335267.getClass(), "taxon", term335304);
        setField(term335267, term335267.getClass(), "transferFee", term335306);
        setField(term335267, term335267.getClass(), "flags", term335308);
        setField(term335267, term335267.getClass(), "sequence", term335310);
        setField(term335267, term335267.getClass(), "uri", "pBpdxKmyFY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lEnMgQzxMz";
        callMethod(klass, "setIssuer", argTypes, term335267, args);
    }

};


