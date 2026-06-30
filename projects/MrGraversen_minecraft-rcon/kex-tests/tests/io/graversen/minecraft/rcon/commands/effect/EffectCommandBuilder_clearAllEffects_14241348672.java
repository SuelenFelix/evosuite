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

public class EffectCommandBuilder_clearAllEffects_14241348672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415;

    public EffectCommandBuilder_clearAllEffects_14241348672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term416 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term416, term416.getClass(), "targetString", "MuLcgQHgqz");
        setField(term415, term415.getClass(), "target", term416);
        setField(term415, term415.getClass(), "clear", "");
        setField(term415, term415.getClass(), "effect", "xxtlPwDYFs");
        setIntField(term415, term415.getClass(), "seconds", 30);
        setIntField(term415, term415.getClass(), "amplifier", 1);
        setBooleanField(term415, term415.getClass(), "hideParticles", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "clearAllEffects", argTypes, term415, args);
    }

};


