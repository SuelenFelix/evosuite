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

public class XrplDataNftDto_getTransferFee_2039606389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334664;

    public XrplDataNftDto_getTransferFee_2039606389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334701 = new Long(1881020230556705937L);
        Long term334703 = new Long(-2937192447508714837L);
        Long term334705 = new Long(3804352102719959988L);
        Long term334707 = new Long(-5317408542996378156L);
        term334664 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto"));
        setField(term334664, term334664.getClass(), "nfTokenID", "yjLlTYCCBx");
        setField(term334664, term334664.getClass(), "issuer", "tmMslEelEQ");
        setField(term334664, term334664.getClass(), "owner", "zQlbOXpNcl");
        setField(term334664, term334664.getClass(), "taxon", term334701);
        setField(term334664, term334664.getClass(), "transferFee", term334703);
        setField(term334664, term334664.getClass(), "flags", term334705);
        setField(term334664, term334664.getClass(), "sequence", term334707);
        setField(term334664, term334664.getClass(), "uri", "iDjBOxOVMQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrplDataNftDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransferFee", argTypes, term334664, args);
    }

};


