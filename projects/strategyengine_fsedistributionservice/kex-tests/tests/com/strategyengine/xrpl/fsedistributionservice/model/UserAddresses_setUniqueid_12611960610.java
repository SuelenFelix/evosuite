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

public class UserAddresses_setUniqueid_12611960610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337714;

    public UserAddresses_setUniqueid_12611960610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term337727 = new ArrayList();
        ((ArrayList) term337727).add("qdtUDYxxKy");
        ((ArrayList) term337727).add("fSxuiDFwrP");
        ((ArrayList) term337727).add("kkVoDibEgl");
        ((ArrayList) term337727).add("PLwKYMwKMG");
        ((ArrayList) term337727).add("iNAPriOsZk");
        term337714 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses"));
        setField(term337714, term337714.getClass(), "uniqueid", "yPIlHPlNib");
        setField(term337714, term337714.getClass(), "addresses", term337727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.UserAddresses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WIzLNHlHin";
        callMethod(klass, "setUniqueid", argTypes, term337714, args);
    }

};


