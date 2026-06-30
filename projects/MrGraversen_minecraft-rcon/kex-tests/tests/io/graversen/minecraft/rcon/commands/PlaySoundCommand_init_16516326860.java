package io.graversen.minecraft.rcon.commands;

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
import static io.graversen.minecraft.rcon.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Float;

public class PlaySoundCommand_init_16516326860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13637;
     Object term13650;
     Object term13675;
     Object term13715;
     Object term13717;

    public PlaySoundCommand_init_16516326860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13637 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13637, term13637.getClass(), "targetString", "wwAwLLcLPp");
        term13650 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        setField(term13650, term13650.getClass(), "namespace", "nHpMKOmlpQ");
        setField(term13650, term13650.getClass(), "sound", "fKhrQsJToZ");
        term13675 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term13676 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term13689 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term13702 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term13676, term13676.getClass(), "coordinate", "wsysQLGFnl");
        setField(term13675, term13675.getClass(), "x", term13676);
        setField(term13689, term13689.getClass(), "coordinate", "ckQLZGFjMX");
        setField(term13675, term13675.getClass(), "y", term13689);
        setField(term13702, term13702.getClass(), "coordinate", "qphdrqUtNx");
        setField(term13675, term13675.getClass(), "z", term13702);
        term13715 = new Float(0.13238746F);
        term13717 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Sound");
        argTypes[2] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[3] = float.class;
        argTypes[4] = float.class;
        Object[] args = new Object[5];
        args[0] = term13637;
        args[1] = term13650;
        args[2] = term13675;
        args[3] = term13715;
        args[4] = term13717;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


