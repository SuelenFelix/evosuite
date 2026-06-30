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

public class EffectCommandBuilder_hideParticles_12352907308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1630;

    public EffectCommandBuilder_hideParticles_12352907308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1630 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term1631 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1631, term1631.getClass(), "targetString", "ZiaGIbnzTs");
        setField(term1630, term1630.getClass(), "target", term1631);
        setField(term1630, term1630.getClass(), "clear", "");
        setField(term1630, term1630.getClass(), "effect", "tbcdzjIfER");
        setIntField(term1630, term1630.getClass(), "seconds", 30);
        setIntField(term1630, term1630.getClass(), "amplifier", 1);
        setBooleanField(term1630, term1630.getClass(), "hideParticles", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hideParticles", argTypes, term1630, args);
    }

};


