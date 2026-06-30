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

public class WeatherCommand_getWeather_19416872751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23666;

    public WeatherCommand_getWeather_19416872751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23680 = Class.forName((String) "io.graversen.minecraft.rcon.util.Weathers");
        Field term23679 = ((Class) term23680).getDeclaredField((String) "THUNDER");
        ((Field) term23679).setAccessible(true);
        Object enum37 = ((Field) term23679).get((Object) null);
        term23666 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand"));
        setField(term23666, term23666.getClass(), "weather", enum37);
        setLongField(term23666, term23666.getClass(), "duration", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeather", argTypes, term23666, args);
    }

};


