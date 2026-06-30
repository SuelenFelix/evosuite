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
import java.lang.Float;

public class PlaySoundCommand_relativeTo_138667973810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14631;
     Object term14634;
     Object term14636;

    public PlaySoundCommand_relativeTo_138667973810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14631 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        setField(term14631, term14631.getClass(), "sound", null);
        setField(term14631, term14631.getClass(), "position", null);
        setFloatField(term14631, term14631.getClass(), "volume", 0.0F);
        setFloatField(term14631, term14631.getClass(), "pitch", 0.0F);
        setField(term14631, term14631.getClass(), "target", null);
        term14634 = new Float(0.0F);
        term14636 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Sound");
        argTypes[2] = float.class;
        argTypes[3] = float.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term14634;
        args[3] = term14636;
        callMethod(klass, "relativeTo", argTypes, term14631, args);
    }

};


