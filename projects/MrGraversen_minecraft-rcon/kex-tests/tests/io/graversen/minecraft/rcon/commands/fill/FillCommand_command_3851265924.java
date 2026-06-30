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

public class FillCommand_command_3851265924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6371;

    public FillCommand_command_3851265924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6551 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term6550 = ((Class) term6551).getDeclaredField((String) "KEEP");
        ((Field) term6550).setAccessible(true);
        Object enum12 = ((Field) term6550).get((Object) null);
        term6371 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand"));
        Object term6372 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term6397 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term6430 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term6431 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6444 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6457 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6470 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term6471 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6484 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6497 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term6372, term6372.getClass(), "namespace", "UfQtPRyWRC");
        setField(term6372, term6372.getClass(), "block", "FPvxVzzSvD");
        setField(term6371, term6371.getClass(), "block", term6372);
        setField(term6397, term6397.getClass(), "namespace", "WHcwFgsGFC");
        setField(term6397, term6397.getClass(), "block", "HzqpegHiRq");
        setField(term6371, term6371.getClass(), "replaceBlock", term6397);
        setField(term6371, term6371.getClass(), "fillMode", enum12);
        setField(term6431, term6431.getClass(), "coordinate", "jwsfVjMoJT");
        setField(term6430, term6430.getClass(), "x", term6431);
        setField(term6444, term6444.getClass(), "coordinate", "ZfdXfCCFDf");
        setField(term6430, term6430.getClass(), "y", term6444);
        setField(term6457, term6457.getClass(), "coordinate", "MwwjNtdOFT");
        setField(term6430, term6430.getClass(), "z", term6457);
        setField(term6371, term6371.getClass(), "position1", term6430);
        setField(term6471, term6471.getClass(), "coordinate", "VYkqXKVlAJ");
        setField(term6470, term6470.getClass(), "x", term6471);
        setField(term6484, term6484.getClass(), "coordinate", "XkIoWJRNwN");
        setField(term6470, term6470.getClass(), "y", term6484);
        setField(term6497, term6497.getClass(), "coordinate", "aNWLJdrZMq");
        setField(term6470, term6470.getClass(), "z", term6497);
        setField(term6371, term6371.getClass(), "position2", term6470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term6371, args);
    }

};


