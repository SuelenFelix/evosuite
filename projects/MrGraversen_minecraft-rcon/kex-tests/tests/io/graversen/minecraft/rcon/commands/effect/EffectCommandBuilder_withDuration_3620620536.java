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

public class EffectCommandBuilder_withDuration_3620620536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1524;
     Object term1555;

    public EffectCommandBuilder_withDuration_3620620536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1524 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term1525 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1525, term1525.getClass(), "targetString", "MxlszYVzRf");
        setField(term1524, term1524.getClass(), "target", term1525);
        setField(term1524, term1524.getClass(), "clear", "");
        setField(term1524, term1524.getClass(), "effect", "LQFpaHEwXR");
        setIntField(term1524, term1524.getClass(), "seconds", 30);
        setIntField(term1524, term1524.getClass(), "amplifier", 1);
        setBooleanField(term1524, term1524.getClass(), "hideParticles", true);
        term1555 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1555;
        callMethod(klass, "withDuration", argTypes, term1524, args);
    }

};


