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

public class FillCommandBuilder_bounds_6792204601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term181;

    public FillCommandBuilder_bounds_6792204601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term142 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term155 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term168 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term142, term142.getClass(), "coordinate", "SzjVpOQTyS");
        setField(term141, term141.getClass(), "x", term142);
        setField(term155, term155.getClass(), "coordinate", "MjGYSRKTNF");
        setField(term141, term141.getClass(), "y", term155);
        setField(term168, term168.getClass(), "coordinate", "hRNSzYYIrc");
        setField(term141, term141.getClass(), "z", term168);
        term181 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term182 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term195 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term208 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term182, term182.getClass(), "coordinate", "RMFIsYGgne");
        setField(term181, term181.getClass(), "x", term182);
        setField(term195, term195.getClass(), "coordinate", "NRdvgJlhkX");
        setField(term181, term181.getClass(), "y", term195);
        setField(term208, term208.getClass(), "coordinate", "uuaPigETmJ");
        setField(term181, term181.getClass(), "z", term208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Position");
        Object[] args = new Object[2];
        args[0] = term141;
        args[1] = term181;
        callMethod(klass, "bounds", argTypes, null, args);
    }

};


