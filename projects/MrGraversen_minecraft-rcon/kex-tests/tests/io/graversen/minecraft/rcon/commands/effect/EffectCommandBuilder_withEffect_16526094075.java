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
import java.lang.Integer;

public class EffectCommandBuilder_withEffect_16526094075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;
     Object enum2;
     Object term938;

    public EffectCommandBuilder_withEffect_16526094075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder"));
        Object term890 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term890, term890.getClass(), "targetString", "NRdvgJlhkX");
        setField(term889, term889.getClass(), "target", term890);
        setField(term889, term889.getClass(), "clear", "");
        setField(term889, term889.getClass(), "effect", "uuaPigETmJ");
        setIntField(term889, term889.getClass(), "seconds", 30);
        setIntField(term889, term889.getClass(), "amplifier", 1);
        setBooleanField(term889, term889.getClass(), "hideParticles", true);
        Class<? extends Object> term1276 = Class.forName((String) "io.graversen.minecraft.rcon.util.Effects");
        Field term1275 = ((Class) term1276).getDeclaredField((String) "INSTANT_HEALTH");
        ((Field) term1275).setAccessible(true);
        enum2 = ((Field) term1275).get((Object) null);
        term938 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Effects");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = term938;
        callMethod(klass, "withEffect", argTypes, term889, args);
    }

};


