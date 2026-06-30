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

public class GameModeCommand_getGameMode_20851737161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4391;

    public GameModeCommand_getGameMode_20851737161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4418 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameModes");
        Field term4417 = ((Class) term4418).getDeclaredField((String) "CREATIVE");
        ((Field) term4417).setAccessible(true);
        Object enum7 = ((Field) term4417).get((Object) null);
        term4391 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GameModeCommand"));
        Object term4404 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term4391, term4391.getClass(), "gameMode", enum7);
        setField(term4404, term4404.getClass(), "targetString", "SPtPatHeOm");
        setField(term4391, term4391.getClass(), "target", term4404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GameModeCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameMode", argTypes, term4391, args);
    }

};


