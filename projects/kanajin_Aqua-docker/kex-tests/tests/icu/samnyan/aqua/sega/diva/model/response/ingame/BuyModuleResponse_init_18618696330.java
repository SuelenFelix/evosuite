package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class BuyModuleResponse_init_18618696330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum14;
     Object term4965;
     Object term4979;

    public BuyModuleResponse_init_18618696330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5012 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term5011 = ((Class) term5012).getDeclaredField((String) "FAILED");
        ((Field) term5011).setAccessible(true);
        enum14 = ((Field) term5011).get((Object) null);
        term4965 = new Integer(-655067527);
        term4979 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = "jDtqGUpnZN";
        args[1] = "nGKItKLYNC";
        args[2] = "UiUYnPrcCi";
        args[3] = enum14;
        args[4] = term4965;
        args[5] = "UoYtihxVaS";
        args[6] = term4979;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


