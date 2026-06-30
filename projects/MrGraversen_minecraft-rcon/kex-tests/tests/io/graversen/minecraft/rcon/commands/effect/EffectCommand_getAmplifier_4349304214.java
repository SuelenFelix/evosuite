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

public class EffectCommand_getAmplifier_4349304214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;

    public EffectCommand_getAmplifier_4349304214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2115 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term2143 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2115, term2115.getClass(), "clear", "kuTXqwMtDB");
        setField(term2115, term2115.getClass(), "effect", "Ghbwtircqb");
        setIntField(term2115, term2115.getClass(), "seconds", -522618178);
        setIntField(term2115, term2115.getClass(), "amplifier", 1134449235);
        setBooleanField(term2115, term2115.getClass(), "hideParticles", false);
        setField(term2143, term2143.getClass(), "targetString", "xrwlQZdwCp");
        setField(term2115, term2115.getClass(), "target", term2143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmplifier", argTypes, term2115, args);
    }

};


