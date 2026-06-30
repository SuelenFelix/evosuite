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

public class FillCommandBuilder_outline_16866914704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1415;
     Object term1557;

    public FillCommandBuilder_outline_16866914704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1683 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term1682 = ((Class) term1683).getDeclaredField((String) "DESTROY");
        ((Field) term1682).setAccessible(true);
        Object enum2 = ((Field) term1682).get((Object) null);
        term1415 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term1416 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term1417 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1430 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1443 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1456 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term1457 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1470 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1483 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1496 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term1521 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term1417, term1417.getClass(), "coordinate", "nyiiPDVjAc");
        setField(term1416, term1416.getClass(), "x", term1417);
        setField(term1430, term1430.getClass(), "coordinate", "aKnKipADSo");
        setField(term1416, term1416.getClass(), "y", term1430);
        setField(term1443, term1443.getClass(), "coordinate", "wSQxaModmm");
        setField(term1416, term1416.getClass(), "z", term1443);
        setField(term1415, term1415.getClass(), "position1", term1416);
        setField(term1457, term1457.getClass(), "coordinate", "UlajhuVLaP");
        setField(term1456, term1456.getClass(), "x", term1457);
        setField(term1470, term1470.getClass(), "coordinate", "gGSMzuGICf");
        setField(term1456, term1456.getClass(), "y", term1470);
        setField(term1483, term1483.getClass(), "coordinate", "hxCBltsObl");
        setField(term1456, term1456.getClass(), "z", term1483);
        setField(term1415, term1415.getClass(), "position2", term1456);
        setField(term1496, term1496.getClass(), "namespace", "BndsHwAFMv");
        setField(term1496, term1496.getClass(), "block", "GzFkzHGYFt");
        setField(term1415, term1415.getClass(), "block", term1496);
        setField(term1521, term1521.getClass(), "namespace", "tShwQLRGNe");
        setField(term1521, term1521.getClass(), "block", "LvtrsXUliU");
        setField(term1415, term1415.getClass(), "replaceBlock", term1521);
        setField(term1415, term1415.getClass(), "fillMode", enum2);
        term1557 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term1557, term1557.getClass(), "namespace", "xLbjWUgOIL");
        setField(term1557, term1557.getClass(), "block", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[1];
        args[0] = term1557;
        callMethod(klass, "outline", argTypes, term1415, args);
    }

};


