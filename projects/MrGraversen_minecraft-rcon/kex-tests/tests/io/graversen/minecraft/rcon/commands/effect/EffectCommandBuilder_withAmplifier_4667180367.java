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
import java.lang.Integer;

public class EffectCommandBuilder_withAmplifier_4667180367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;
     Object term1608;

    public EffectCommandBuilder_withAmplifier_4667180367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term1578 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1578, term1578.getClass(), "targetString", "oVcInYnLWB");
        setField(term1577, term1577.getClass(), "target", term1578);
        setField(term1577, term1577.getClass(), "clear", "");
        setField(term1577, term1577.getClass(), "effect", "aJlieCFVtF");
        setIntField(term1577, term1577.getClass(), "seconds", 30);
        setIntField(term1577, term1577.getClass(), "amplifier", 1);
        setBooleanField(term1577, term1577.getClass(), "hideParticles", true);
        term1608 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1608;
        callMethod(klass, "withAmplifier", argTypes, term1577, args);
    }

};


