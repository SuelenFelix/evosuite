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

public class EffectCommand_getClear_20741913081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;

    public EffectCommand_getClear_20741913081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1902 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term1930 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1902, term1902.getClass(), "clear", "vrQLuWIDJX");
        setField(term1902, term1902.getClass(), "effect", "flxyYxBRtu");
        setIntField(term1902, term1902.getClass(), "seconds", -616727354);
        setIntField(term1902, term1902.getClass(), "amplifier", -1955890973);
        setBooleanField(term1902, term1902.getClass(), "hideParticles", true);
        setField(term1930, term1930.getClass(), "targetString", "OclPbYPkcH");
        setField(term1902, term1902.getClass(), "target", term1930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClear", argTypes, term1902, args);
    }

};


