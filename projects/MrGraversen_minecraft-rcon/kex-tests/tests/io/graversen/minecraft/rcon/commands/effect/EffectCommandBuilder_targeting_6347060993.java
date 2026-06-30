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

public class EffectCommandBuilder_targeting_6347060993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public EffectCommandBuilder_targeting_6347060993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term489 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term489, term489.getClass(), "targetString", "EGtDIRbSSb");
        setField(term488, term488.getClass(), "target", term489);
        setField(term488, term488.getClass(), "clear", "");
        setField(term488, term488.getClass(), "effect", "SzjVpOQTyS");
        setIntField(term488, term488.getClass(), "seconds", 30);
        setIntField(term488, term488.getClass(), "amplifier", 1);
        setBooleanField(term488, term488.getClass(), "hideParticles", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "targeting", argTypes, term488, args);
    }

};


