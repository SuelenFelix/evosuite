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

public class EffectCommandBuilder_validate_14997162659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681;

    public EffectCommandBuilder_validate_14997162659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1681 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term1682 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1682, term1682.getClass(), "targetString", "HyxfbSQYBe");
        setField(term1681, term1681.getClass(), "target", term1682);
        setField(term1681, term1681.getClass(), "clear", "");
        setField(term1681, term1681.getClass(), "effect", "pCTimMblYc");
        setIntField(term1681, term1681.getClass(), "seconds", 30);
        setIntField(term1681, term1681.getClass(), "amplifier", 1);
        setBooleanField(term1681, term1681.getClass(), "hideParticles", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term1681, args);
    }

};


