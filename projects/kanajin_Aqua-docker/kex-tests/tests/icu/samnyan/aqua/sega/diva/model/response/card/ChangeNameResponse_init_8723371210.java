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

public class ChangeNameResponse_init_8723371210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum58;
     Object term19433;
     Object term19435;

    public ChangeNameResponse_init_8723371210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19480 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term19479 = ((Class) term19480).getDeclaredField((String) "SUCCESS");
        ((Field) term19479).setAccessible(true);
        enum58 = ((Field) term19479).get((Object) null);
        term19433 = new Integer(-1465035361);
        term19435 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = "EeBVbzjcCI";
        args[1] = "UfQtPRyWRC";
        args[2] = "FPvxVzzSvD";
        args[3] = enum58;
        args[4] = term19433;
        args[5] = term19435;
        args[6] = "WHcwFgsGFC";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


