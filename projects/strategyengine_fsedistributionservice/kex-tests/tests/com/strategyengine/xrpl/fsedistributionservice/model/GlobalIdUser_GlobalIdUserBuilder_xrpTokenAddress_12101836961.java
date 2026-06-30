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
import java.lang.Object;
import java.lang.Integer;

public class GlobalIdUser_GlobalIdUserBuilder_xrpTokenAddress_12101836961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446408;
     Object term446436;

    public GlobalIdUser_GlobalIdUserBuilder_xrpTokenAddress_12101836961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term446434 = new Integer(479531250);
        term446408 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser$GlobalIdUserBuilder"));
        Object term446409 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term446409, term446409.getClass(), "currencyName", "CLEwlxHcqT");
        setField(term446409, term446409.getClass(), "classicAddress", "ITYLKPXKxL");
        setField(term446408, term446408.getClass(), "xrpTokenAddress", term446409);
        setField(term446408, term446408.getClass(), "totalVerifications", term446434);
        term446436 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress"));
        setField(term446436, term446436.getClass(), "currencyName", "AZimImfppv");
        setField(term446436, term446436.getClass(), "classicAddress", "oTKpImhTKa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.GlobalIdUser$GlobalIdUserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpTokenAddress");
        Object[] args = new Object[1];
        args[0] = term446436;
        callMethod(klass, "xrpTokenAddress", argTypes, term446408, args);
    }

};


