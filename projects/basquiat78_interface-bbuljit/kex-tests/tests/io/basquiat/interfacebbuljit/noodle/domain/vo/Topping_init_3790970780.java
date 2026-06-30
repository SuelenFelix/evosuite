package io.basquiat.interfacebbuljit.noodle.domain.vo;

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
import static io.basquiat.interfacebbuljit.noodle.domain.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Topping_init_3790970780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object enum1;

    public Topping_init_3790970780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term29 = ((Class) term30).getDeclaredField((String) "ADD");
        ((Field) term29).setAccessible(true);
        enum0 = ((Field) term29).get((Object) null);
        Class<? extends Object> term291 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term290 = ((Class) term291).getDeclaredField((String) "NOT");
        ((Field) term290).setAccessible(true);
        enum1 = ((Field) term290).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[2] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[3] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        argTypes[4] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Object[] args = new Object[5];
        args[0] = enum0;
        args[1] = enum0;
        args[2] = enum0;
        args[3] = enum0;
        args[4] = enum1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


