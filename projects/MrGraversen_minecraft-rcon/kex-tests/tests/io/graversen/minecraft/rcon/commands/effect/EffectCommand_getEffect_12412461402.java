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

public class EffectCommand_getEffect_12412461402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973;

    public EffectCommand_getEffect_12412461402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1973 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term2001 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1973, term1973.getClass(), "clear", "IoAlmYsBwc");
        setField(term1973, term1973.getClass(), "effect", "TEParAifyi");
        setIntField(term1973, term1973.getClass(), "seconds", -2038273078);
        setIntField(term1973, term1973.getClass(), "amplifier", 1227103734);
        setBooleanField(term1973, term1973.getClass(), "hideParticles", false);
        setField(term2001, term2001.getClass(), "targetString", "OWDIEULEFu");
        setField(term1973, term1973.getClass(), "target", term2001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffect", argTypes, term1973, args);
    }

};


