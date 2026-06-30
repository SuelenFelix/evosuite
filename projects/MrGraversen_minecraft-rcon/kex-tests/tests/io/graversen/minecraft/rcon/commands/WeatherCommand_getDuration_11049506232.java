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

public class WeatherCommand_getDuration_11049506232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23912;

    public WeatherCommand_getDuration_11049506232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23923 = Class.forName((String) "io.graversen.minecraft.rcon.util.Weathers");
        Field term23922 = ((Class) term23923).getDeclaredField((String) "RAIN");
        ((Field) term23922).setAccessible(true);
        Object enum38 = ((Field) term23922).get((Object) null);
        term23912 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand"));
        setField(term23912, term23912.getClass(), "weather", enum38);
        setLongField(term23912, term23912.getClass(), "duration", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term23912, args);
    }

};


