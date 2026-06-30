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
import java.lang.Integer;

public class EffectCommandBuilder_withAmplifier_46671803618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;
     Object term1815;

    public EffectCommandBuilder_withAmplifier_46671803618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        setField(term1811, term1811.getClass(), "target", null);
        setField(term1811, term1811.getClass(), "clear", null);
        setField(term1811, term1811.getClass(), "effect", null);
        setIntField(term1811, term1811.getClass(), "seconds", 0);
        setIntField(term1811, term1811.getClass(), "amplifier", 0);
        setBooleanField(term1811, term1811.getClass(), "hideParticles", false);
        term1815 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1815;
        callMethod(klass, "withAmplifier", argTypes, term1811, args);
    }

};


