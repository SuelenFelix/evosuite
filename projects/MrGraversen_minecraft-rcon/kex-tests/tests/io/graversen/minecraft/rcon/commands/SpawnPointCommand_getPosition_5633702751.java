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

public class SpawnPointCommand_getPosition_5633702751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2371;

    public SpawnPointCommand_getPosition_5633702751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2371 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.SpawnPointCommand"));
        Object term2372 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2373 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2386 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2399 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2412 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2373, term2373.getClass(), "coordinate", "OcJCIDNIXA");
        setField(term2372, term2372.getClass(), "x", term2373);
        setField(term2386, term2386.getClass(), "coordinate", "XfRABIFVEp");
        setField(term2372, term2372.getClass(), "y", term2386);
        setField(term2399, term2399.getClass(), "coordinate", "MHGKyEnwKc");
        setField(term2372, term2372.getClass(), "z", term2399);
        setField(term2371, term2371.getClass(), "position", term2372);
        setField(term2412, term2412.getClass(), "targetString", "ShIELyuULw");
        setField(term2371, term2371.getClass(), "target", term2412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SpawnPointCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term2371, args);
    }

};


