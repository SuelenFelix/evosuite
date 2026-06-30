package io.graversen.minecraft.rcon.commands.effect;

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
import static io.graversen.minecraft.rcon.commands.effect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EffectCommand_command_13181717766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2257;

    public EffectCommand_command_13181717766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2257 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term2285 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2257, term2257.getClass(), "clear", "wSQxaModmm");
        setField(term2257, term2257.getClass(), "effect", "UlajhuVLaP");
        setIntField(term2257, term2257.getClass(), "seconds", 597278769);
        setIntField(term2257, term2257.getClass(), "amplifier", -1685132342);
        setBooleanField(term2257, term2257.getClass(), "hideParticles", true);
        setField(term2285, term2285.getClass(), "targetString", "gGSMzuGICf");
        setField(term2257, term2257.getClass(), "target", term2285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term2257, args);
    }

};


