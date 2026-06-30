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

public class PlaySoundCommand_relativeTo_4815815629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14628;

    public PlaySoundCommand_relativeTo_4815815629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14628 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        setField(term14628, term14628.getClass(), "sound", null);
        setField(term14628, term14628.getClass(), "position", null);
        setFloatField(term14628, term14628.getClass(), "volume", 0.0F);
        setFloatField(term14628, term14628.getClass(), "pitch", 0.0F);
        setField(term14628, term14628.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Sound");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "relativeTo", argTypes, term14628, args);
    }

};


