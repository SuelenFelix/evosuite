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

public class DefaultGameMode_command_13668146361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16903;

    public DefaultGameMode_command_13668146361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16918 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameModes");
        Field term16917 = ((Class) term16918).getDeclaredField((String) "ADVENTURE");
        ((Field) term16917).setAccessible(true);
        Object enum27 = ((Field) term16917).get((Object) null);
        term16903 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.DefaultGameMode"));
        setField(term16903, term16903.getClass(), "gameMode", enum27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.DefaultGameMode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term16903, args);
    }

};


