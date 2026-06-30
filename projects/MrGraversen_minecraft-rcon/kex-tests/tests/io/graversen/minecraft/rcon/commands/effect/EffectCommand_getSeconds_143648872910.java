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

public class EffectCommand_getSeconds_143648872910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2342;

    public EffectCommand_getSeconds_143648872910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2342 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        setField(term2342, term2342.getClass(), "clear", null);
        setField(term2342, term2342.getClass(), "effect", null);
        setIntField(term2342, term2342.getClass(), "seconds", 0);
        setIntField(term2342, term2342.getClass(), "amplifier", 0);
        setBooleanField(term2342, term2342.getClass(), "hideParticles", false);
        setField(term2342, term2342.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeconds", argTypes, term2342, args);
    }

};


