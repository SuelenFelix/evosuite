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

public class FillCommandBuilder_replace_793266983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;
     Object term987;
     Object term1012;

    public FillCommandBuilder_replace_793266983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1138 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term1137 = ((Class) term1138).getDeclaredField((String) "OUTLINE");
        ((Field) term1137).setAccessible(true);
        Object enum1 = ((Field) term1137).get((Object) null);
        term845 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term846 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term847 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term860 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term873 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term886 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term887 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term900 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term913 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term926 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term951 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term847, term847.getClass(), "coordinate", "BYqFIqCKAV");
        setField(term846, term846.getClass(), "x", term847);
        setField(term860, term860.getClass(), "coordinate", "vrQLuWIDJX");
        setField(term846, term846.getClass(), "y", term860);
        setField(term873, term873.getClass(), "coordinate", "flxyYxBRtu");
        setField(term846, term846.getClass(), "z", term873);
        setField(term845, term845.getClass(), "position1", term846);
        setField(term887, term887.getClass(), "coordinate", "OclPbYPkcH");
        setField(term886, term886.getClass(), "x", term887);
        setField(term900, term900.getClass(), "coordinate", "IoAlmYsBwc");
        setField(term886, term886.getClass(), "y", term900);
        setField(term913, term913.getClass(), "coordinate", "TEParAifyi");
        setField(term886, term886.getClass(), "z", term913);
        setField(term845, term845.getClass(), "position2", term886);
        setField(term926, term926.getClass(), "namespace", "OWDIEULEFu");
        setField(term926, term926.getClass(), "block", "dWRymuLBtr");
        setField(term845, term845.getClass(), "block", term926);
        setField(term951, term951.getClass(), "namespace", "AijpHYOFuy");
        setField(term951, term951.getClass(), "block", "SbAoxhfrkn");
        setField(term845, term845.getClass(), "replaceBlock", term951);
        setField(term845, term845.getClass(), "fillMode", enum1);
        term987 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term987, term987.getClass(), "namespace", "kuTXqwMtDB");
        setField(term987, term987.getClass(), "block", "Ghbwtircqb");
        term1012 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term1012, term1012.getClass(), "namespace", "xrwlQZdwCp");
        setField(term1012, term1012.getClass(), "block", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[2];
        args[0] = term987;
        args[1] = term1012;
        callMethod(klass, "replace", argTypes, term845, args);
    }

};


