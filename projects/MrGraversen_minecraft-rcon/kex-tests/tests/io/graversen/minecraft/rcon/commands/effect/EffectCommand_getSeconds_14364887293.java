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

public class EffectCommand_getSeconds_14364887293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2044;

    public EffectCommand_getSeconds_14364887293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2044 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term2072 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2044, term2044.getClass(), "clear", "dWRymuLBtr");
        setField(term2044, term2044.getClass(), "effect", "AijpHYOFuy");
        setIntField(term2044, term2044.getClass(), "seconds", -1339778481);
        setIntField(term2044, term2044.getClass(), "amplifier", 1725571209);
        setBooleanField(term2044, term2044.getClass(), "hideParticles", true);
        setField(term2072, term2072.getClass(), "targetString", "SbAoxhfrkn");
        setField(term2044, term2044.getClass(), "target", term2072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeconds", argTypes, term2044, args);
    }

};


