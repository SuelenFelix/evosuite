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
import java.lang.Integer;

public class GameRulesCommands_setGameRule_10576274701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum40;
     Object term24946;

    public GameRulesCommands_setGameRule_10576274701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25447 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameRules");
        Field term25446 = ((Class) term25447).getDeclaredField((String) "DO_TILE_DROPS");
        ((Field) term25446).setAccessible(true);
        enum40 = ((Field) term25446).get((Object) null);
        term24946 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GameRulesCommands");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.GameRules");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum40;
        args[1] = term24946;
        callMethod(klass, "setGameRule", argTypes, null, args);
    }

};


