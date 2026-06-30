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

public class BillingResponse_init_195396899629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3431;
     Object term3433;
     Object term3435;
     Object term3449;
     Object term3475;
     Object term3489;
     Object term3491;

    public BillingResponse_init_195396899629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3431 = new Integer(-1222614956);
        term3433 = new Integer(-1870495012);
        term3435 = new Integer(-1310015129);
        term3449 = new Integer(-2104981311);
        term3475 = new Integer(-571169753);
        term3489 = new Integer(318591690);
        term3491 = new Integer(-165587447);
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
        args[0] = term3431;
        args[1] = term3433;
        args[2] = term3435;
        args[3] = "EeBVbzjcCI";
        args[4] = term3449;
        args[5] = "UfQtPRyWRC";
        args[6] = "FPvxVzzSvD";
        args[7] = term3475;
        args[8] = "WHcwFgsGFC";
        args[9] = term3489;
        args[10] = term3491;
        args[11] = "HzqpegHiRq";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


