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
import java.util.ArrayList;

public class UserAddresses_UserAddressesBuilder_toString_21456047844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336627;

    public UserAddresses_UserAddressesBuilder_toString_21456047844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336640 = new ArrayList();
        ((ArrayList) term336640).add("qEwUfGEixD");
        ((ArrayList) term336640).add("gzwdEqELlU");
        ((ArrayList) term336640).add("PVcLgfdPEf");
        term336627 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder"));
        setField(term336627, term336627.getClass(), "uniqueid", "nAZCgcAqKF");
        setField(term336627, term336627.getClass(), "addresses", term336640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses$UserAddressesBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term336627, args);
    }

};


