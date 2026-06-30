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

public class PlaySoundCommand_relativeTo_4815815621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13779;
     Object term13792;

    public PlaySoundCommand_relativeTo_4815815621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13779 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13779, term13779.getClass(), "targetString", "bwlLFAfNWx");
        term13792 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        setField(term13792, term13792.getClass(), "namespace", "JWodNQzjjV");
        setField(term13792, term13792.getClass(), "sound", "CAgxWjhxNf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Sound");
        Object[] args = new Object[2];
        args[0] = term13779;
        args[1] = term13792;
        callMethod(klass, "relativeTo", argTypes, null, args);
    }

};


