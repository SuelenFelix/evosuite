package io.graversen.minecraft.rcon.commands;

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
import static io.graversen.minecraft.rcon.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class WeatherCommand_init_4671992830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum36;
     Object term23412;

    public WeatherCommand_init_4671992830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23443 = Class.forName((String) "io.graversen.minecraft.rcon.util.Weathers");
        Field term23442 = ((Class) term23443).getDeclaredField((String) "RAIN");
        ((Field) term23442).setAccessible(true);
        enum36 = ((Field) term23442).get((Object) null);
        term23412 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Weathers");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = enum36;
        args[1] = term23412;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


