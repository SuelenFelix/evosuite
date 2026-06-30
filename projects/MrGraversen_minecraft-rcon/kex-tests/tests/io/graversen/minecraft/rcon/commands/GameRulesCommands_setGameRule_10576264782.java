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
import java.lang.Boolean;

public class GameRulesCommands_setGameRule_10576264782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum41;
     Object term25717;

    public GameRulesCommands_setGameRule_10576264782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25720 = Class.forName((String) "io.graversen.minecraft.rcon.util.GameRules");
        Field term25719 = ((Class) term25720).getDeclaredField((String) "DO_MOB_LOOT");
        ((Field) term25719).setAccessible(true);
        enum41 = ((Field) term25719).get((Object) null);
        term25717 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GameRulesCommands");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.GameRules");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum41;
        args[1] = term25717;
        callMethod(klass, "setGameRule", argTypes, null, args);
    }

};


