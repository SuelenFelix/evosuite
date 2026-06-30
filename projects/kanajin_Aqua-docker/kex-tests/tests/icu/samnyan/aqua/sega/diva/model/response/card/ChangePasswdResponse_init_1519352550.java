package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class ChangePasswdResponse_init_1519352550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum68;
     Object term23064;
     Object term23066;

    public ChangePasswdResponse_init_1519352550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23099 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term23098 = ((Class) term23099).getDeclaredField((String) "FAILED");
        ((Field) term23098).setAccessible(true);
        enum68 = ((Field) term23098).get((Object) null);
        term23064 = new Integer(-268815336);
        term23066 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = "YpJbIgJWWv";
        args[1] = "JppkknKVOw";
        args[2] = "iljANwuEjk";
        args[3] = enum68;
        args[4] = term23064;
        args[5] = term23066;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


