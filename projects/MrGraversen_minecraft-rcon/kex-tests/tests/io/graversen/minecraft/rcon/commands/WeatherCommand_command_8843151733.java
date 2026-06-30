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

public class WeatherCommand_command_8843151733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24146;

    public WeatherCommand_command_8843151733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24160 = Class.forName((String) "io.graversen.minecraft.rcon.util.Weathers");
        Field term24159 = ((Class) term24160).getDeclaredField((String) "THUNDER");
        ((Field) term24159).setAccessible(true);
        Object enum39 = ((Field) term24159).get((Object) null);
        term24146 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand"));
        setField(term24146, term24146.getClass(), "weather", enum39);
        setLongField(term24146, term24146.getClass(), "duration", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WeatherCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term24146, args);
    }

};


