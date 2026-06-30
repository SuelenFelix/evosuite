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

public class FillCommand_getReplaceBlock_10373501952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5411;

    public FillCommand_getReplaceBlock_10373501952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5594 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term5593 = ((Class) term5594).getDeclaredField((String) "REPLACE");
        ((Field) term5593).setAccessible(true);
        Object enum10 = ((Field) term5593).get((Object) null);
        term5411 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand"));
        Object term5412 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term5437 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term5473 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5474 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5487 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5500 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5513 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5514 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5527 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5540 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term5412, term5412.getClass(), "namespace", "JDaAnsVTGV");
        setField(term5412, term5412.getClass(), "block", "mLUZFTfjle");
        setField(term5411, term5411.getClass(), "block", term5412);
        setField(term5437, term5437.getClass(), "namespace", "xIeFjkHkOe");
        setField(term5437, term5437.getClass(), "block", "SdCKLMIYnX");
        setField(term5411, term5411.getClass(), "replaceBlock", term5437);
        setField(term5411, term5411.getClass(), "fillMode", enum10);
        setField(term5474, term5474.getClass(), "coordinate", "OJJtVNPyKZ");
        setField(term5473, term5473.getClass(), "x", term5474);
        setField(term5487, term5487.getClass(), "coordinate", "AKNapTAfmD");
        setField(term5473, term5473.getClass(), "y", term5487);
        setField(term5500, term5500.getClass(), "coordinate", "xJgPlLxpgC");
        setField(term5473, term5473.getClass(), "z", term5500);
        setField(term5411, term5411.getClass(), "position1", term5473);
        setField(term5514, term5514.getClass(), "coordinate", "EYtfuJaxiM");
        setField(term5513, term5513.getClass(), "x", term5514);
        setField(term5527, term5527.getClass(), "coordinate", "gCWtLVKVVe");
        setField(term5513, term5513.getClass(), "y", term5527);
        setField(term5540, term5540.getClass(), "coordinate", "fWKJoSoCwE");
        setField(term5513, term5513.getClass(), "z", term5540);
        setField(term5411, term5411.getClass(), "position2", term5513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReplaceBlock", argTypes, term5411, args);
    }

};


