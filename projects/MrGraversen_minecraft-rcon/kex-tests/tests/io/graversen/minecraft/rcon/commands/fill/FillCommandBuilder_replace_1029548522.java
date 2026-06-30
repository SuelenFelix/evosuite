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

public class FillCommandBuilder_replace_1029548522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term420;

    public FillCommandBuilder_replace_1029548522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term596 = ((Class) term597).getDeclaredField((String) "KEEP");
        ((Field) term596).setAccessible(true);
        Object enum0 = ((Field) term596).get((Object) null);
        term281 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term282 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term283 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term296 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term309 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term322 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term323 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term336 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term349 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term362 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term387 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term283, term283.getClass(), "coordinate", "MxlszYVzRf");
        setField(term282, term282.getClass(), "x", term283);
        setField(term296, term296.getClass(), "coordinate", "LQFpaHEwXR");
        setField(term282, term282.getClass(), "y", term296);
        setField(term309, term309.getClass(), "coordinate", "oVcInYnLWB");
        setField(term282, term282.getClass(), "z", term309);
        setField(term281, term281.getClass(), "position1", term282);
        setField(term323, term323.getClass(), "coordinate", "aJlieCFVtF");
        setField(term322, term322.getClass(), "x", term323);
        setField(term336, term336.getClass(), "coordinate", "ZiaGIbnzTs");
        setField(term322, term322.getClass(), "y", term336);
        setField(term349, term349.getClass(), "coordinate", "tbcdzjIfER");
        setField(term322, term322.getClass(), "z", term349);
        setField(term281, term281.getClass(), "position2", term322);
        setField(term362, term362.getClass(), "namespace", "HyxfbSQYBe");
        setField(term362, term362.getClass(), "block", "pCTimMblYc");
        setField(term281, term281.getClass(), "block", term362);
        setField(term387, term387.getClass(), "namespace", "hNxWaHcfhY");
        setField(term387, term387.getClass(), "block", "RkybSrpybU");
        setField(term281, term281.getClass(), "replaceBlock", term387);
        setField(term281, term281.getClass(), "fillMode", enum0);
        term420 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term420, term420.getClass(), "namespace", "xOEqzGAmDU");
        setField(term420, term420.getClass(), "block", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[1];
        args[0] = term420;
        callMethod(klass, "replace", argTypes, term281, args);
    }

};


