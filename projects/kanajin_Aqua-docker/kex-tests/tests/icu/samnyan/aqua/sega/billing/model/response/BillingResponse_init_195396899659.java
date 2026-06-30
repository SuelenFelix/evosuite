package icu.samnyan.aqua.sega.billing.model.response;

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
import static icu.samnyan.aqua.sega.billing.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BillingResponse_init_195396899659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3793;
     Object term3795;
     Object term3797;
     Object term3799;
     Object term3801;
     Object term3803;
     Object term3805;

    public BillingResponse_init_195396899659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3793 = new Integer(0);
        term3795 = new Integer(0);
        term3797 = new Integer(0);
        term3799 = new Integer(0);
        term3801 = new Integer(0);
        term3803 = new Integer(0);
        term3805 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.billing.model.response.BillingResponse");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        Object[] args = new Object[12];
        args[0] = term3793;
        args[1] = term3795;
        args[2] = term3797;
        args[3] = null;
        args[4] = term3799;
        args[5] = null;
        args[6] = null;
        args[7] = term3801;
        args[8] = null;
        args[9] = term3803;
        args[10] = term3805;
        args[11] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


