package io.graversen.minecraft.rcon.commands.fill;

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
import static io.graversen.minecraft.rcon.commands.fill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FillCommand_init_19912277400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4476;
     Object term4516;
     Object term4556;
     Object term4581;
     Object enum8;

    public FillCommand_init_19912277400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4476 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term4477 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4490 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4503 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term4477, term4477.getClass(), "coordinate", "xBsXSDjXYK");
        setField(term4476, term4476.getClass(), "x", term4477);
        setField(term4490, term4490.getClass(), "coordinate", "sEnIVFtZuQ");
        setField(term4476, term4476.getClass(), "y", term4490);
        setField(term4503, term4503.getClass(), "coordinate", "ZVecLZMLHF");
        setField(term4476, term4476.getClass(), "z", term4503);
        term4516 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term4517 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4530 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4543 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term4517, term4517.getClass(), "coordinate", "fztQhjqwdP");
        setField(term4516, term4516.getClass(), "x", term4517);
        setField(term4530, term4530.getClass(), "coordinate", "eVpkWxjuki");
        setField(term4516, term4516.getClass(), "y", term4530);
        setField(term4543, term4543.getClass(), "coordinate", "SJiQaLvSKv");
        setField(term4516, term4516.getClass(), "z", term4543);
        term4556 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term4556, term4556.getClass(), "namespace", "OEXDRUKcFl");
        setField(term4556, term4556.getClass(), "block", "RYdKCNNMBR");
        term4581 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term4581, term4581.getClass(), "namespace", "yGtHPyvYiQ");
        setField(term4581, term4581.getClass(), "block", "MvRIxilFMJ");
        Class<? extends Object> term4715 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term4714 = ((Class) term4715).getDeclaredField((String) "KEEP");
        ((Field) term4714).setAccessible(true);
        enum8 = ((Field) term4714).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[2] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        argTypes[3] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        argTypes[4] = Class.forName("io.graversen.minecraft.rcon.util.FillModes");
        Object[] args = new Object[5];
        args[0] = term4476;
        args[1] = term4516;
        args[2] = term4556;
        args[3] = term4581;
        args[4] = enum8;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


