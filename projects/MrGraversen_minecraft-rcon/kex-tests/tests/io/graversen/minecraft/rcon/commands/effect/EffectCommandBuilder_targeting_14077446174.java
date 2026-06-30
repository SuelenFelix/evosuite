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

public class EffectCommandBuilder_targeting_14077446174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object enum1;

    public EffectCommandBuilder_targeting_14077446174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term562 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term562, term562.getClass(), "targetString", "hRNSzYYIrc");
        setField(term561, term561.getClass(), "target", term562);
        setField(term561, term561.getClass(), "clear", "");
        setField(term561, term561.getClass(), "effect", "RMFIsYGgne");
        setIntField(term561, term561.getClass(), "seconds", 30);
        setIntField(term561, term561.getClass(), "amplifier", 1);
        setBooleanField(term561, term561.getClass(), "hideParticles", false);
        Class<? extends Object> term634 = Class.forName((String) "io.graversen.minecraft.rcon.util.Selectors");
        Field term633 = ((Class) term634).getDeclaredField((String) "RANDOM_PLAYER");
        ((Field) term633).setAccessible(true);
        enum1 = ((Field) term633).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Selectors");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "targeting", argTypes, term561, args);
    }

};


