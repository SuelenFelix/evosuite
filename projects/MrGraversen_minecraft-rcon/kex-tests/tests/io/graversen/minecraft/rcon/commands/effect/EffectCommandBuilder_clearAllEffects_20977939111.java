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
import java.lang.String;

public class EffectCommandBuilder_clearAllEffects_20977939111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;

    public EffectCommandBuilder_clearAllEffects_20977939111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term2 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2, term2.getClass(), "targetString", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "target", term2);
        setField(term1, term1.getClass(), "clear", "");
        setField(term1, term1.getClass(), "effect", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "seconds", 30);
        setIntField(term1, term1.getClass(), "amplifier", 1);
        setBooleanField(term1, term1.getClass(), "hideParticles", false);
        Class<? extends Object> term166 = Class.forName((String) "io.graversen.minecraft.rcon.util.Selectors");
        Field term165 = ((Class) term166).getDeclaredField((String) "ALL_PLAYERS");
        ((Field) term165).setAccessible(true);
        enum0 = ((Field) term165).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Selectors");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "clearAllEffects", argTypes, term1, args);
    }

};


