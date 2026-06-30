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

public class FillCommandBuilder_hollow_508269756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2465;
     Object term2607;

    public FillCommandBuilder_hollow_508269756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2733 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term2732 = ((Class) term2733).getDeclaredField((String) "OUTLINE");
        ((Field) term2732).setAccessible(true);
        Object enum4 = ((Field) term2732).get((Object) null);
        term2465 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term2466 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2467 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2480 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2493 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2506 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2507 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2520 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2533 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2546 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term2571 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term2467, term2467.getClass(), "coordinate", "hoicvmsovO");
        setField(term2466, term2466.getClass(), "x", term2467);
        setField(term2480, term2480.getClass(), "coordinate", "eqJfYWRaEL");
        setField(term2466, term2466.getClass(), "y", term2480);
        setField(term2493, term2493.getClass(), "coordinate", "fhkbdRViHi");
        setField(term2466, term2466.getClass(), "z", term2493);
        setField(term2465, term2465.getClass(), "position1", term2466);
        setField(term2507, term2507.getClass(), "coordinate", "uWHnvSvaPl");
        setField(term2506, term2506.getClass(), "x", term2507);
        setField(term2520, term2520.getClass(), "coordinate", "kBdSllIBVz");
        setField(term2506, term2506.getClass(), "y", term2520);
        setField(term2533, term2533.getClass(), "coordinate", "TJmVBGfTML");
        setField(term2506, term2506.getClass(), "z", term2533);
        setField(term2465, term2465.getClass(), "position2", term2506);
        setField(term2546, term2546.getClass(), "namespace", "tPlsykYBqO");
        setField(term2546, term2546.getClass(), "block", "bLPjGVBhlX");
        setField(term2465, term2465.getClass(), "block", term2546);
        setField(term2571, term2571.getClass(), "namespace", "whBvTVIIlC");
        setField(term2571, term2571.getClass(), "block", "IgRJUzaCwW");
        setField(term2465, term2465.getClass(), "replaceBlock", term2571);
        setField(term2465, term2465.getClass(), "fillMode", enum4);
        term2607 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term2607, term2607.getClass(), "namespace", "JUmudUmaaV");
        setField(term2607, term2607.getClass(), "block", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[1];
        args[0] = term2607;
        callMethod(klass, "hollow", argTypes, term2465, args);
    }

};


