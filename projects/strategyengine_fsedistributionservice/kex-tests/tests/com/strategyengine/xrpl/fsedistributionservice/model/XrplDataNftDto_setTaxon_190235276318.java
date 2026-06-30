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

public class XrplDataNftDto_setTaxon_190235276318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335505;
     Object term335562;

    public XrplDataNftDto_setTaxon_190235276318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335542 = new Long(-2217438327452869934L);
        Long term335544 = new Long(6427987239762071453L);
        Long term335546 = new Long(9216691136820489449L);
        Long term335548 = new Long(6460434640369527093L);
        term335505 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term335505, term335505.getClass(), "nfTokenID", "OoCofiAnPP");
        setField(term335505, term335505.getClass(), "issuer", "vjPbHKOEPZ");
        setField(term335505, term335505.getClass(), "owner", "rvTeECGvmV");
        setField(term335505, term335505.getClass(), "taxon", term335542);
        setField(term335505, term335505.getClass(), "transferFee", term335544);
        setField(term335505, term335505.getClass(), "flags", term335546);
        setField(term335505, term335505.getClass(), "sequence", term335548);
        setField(term335505, term335505.getClass(), "uri", "lDBTAFbBEZ");
        term335562 = new Long(-5745335841303453480L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term335562;
        callMethod(klass, "setTaxon", argTypes, term335505, args);
    }

};


