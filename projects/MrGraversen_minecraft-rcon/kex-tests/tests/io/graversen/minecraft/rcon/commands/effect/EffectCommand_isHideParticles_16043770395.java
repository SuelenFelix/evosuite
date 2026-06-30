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

public class EffectCommand_isHideParticles_16043770395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2186;

    public EffectCommand_isHideParticles_16043770395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2186 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand"));
        Object term2214 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2186, term2186.getClass(), "clear", "IDCWpPLRkE");
        setField(term2186, term2186.getClass(), "effect", "nyiiPDVjAc");
        setIntField(term2186, term2186.getClass(), "seconds", -883034806);
        setIntField(term2186, term2186.getClass(), "amplifier", 1585847225);
        setBooleanField(term2186, term2186.getClass(), "hideParticles", false);
        setField(term2214, term2214.getClass(), "targetString", "aKnKipADSo");
        setField(term2186, term2186.getClass(), "target", term2214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHideParticles", argTypes, term2186, args);
    }

};


