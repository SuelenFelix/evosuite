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

public class FillCommandBuilder_destroy_17498329187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2990;
     Object term3131;

    public FillCommandBuilder_destroy_17498329187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3257 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term3256 = ((Class) term3257).getDeclaredField((String) "HOLLOW");
        ((Field) term3256).setAccessible(true);
        Object enum5 = ((Field) term3256).get((Object) null);
        term2990 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term2991 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term2992 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3005 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3018 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3031 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term3032 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3045 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3058 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3071 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term3096 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term2992, term2992.getClass(), "coordinate", "HqBOwkVqjD");
        setField(term2991, term2991.getClass(), "x", term2992);
        setField(term3005, term3005.getClass(), "coordinate", "MAcUBcBckh");
        setField(term2991, term2991.getClass(), "y", term3005);
        setField(term3018, term3018.getClass(), "coordinate", "oVgzLbrsFr");
        setField(term2991, term2991.getClass(), "z", term3018);
        setField(term2990, term2990.getClass(), "position1", term2991);
        setField(term3032, term3032.getClass(), "coordinate", "vQVyKLdtaz");
        setField(term3031, term3031.getClass(), "x", term3032);
        setField(term3045, term3045.getClass(), "coordinate", "OWKQODBLzb");
        setField(term3031, term3031.getClass(), "y", term3045);
        setField(term3058, term3058.getClass(), "coordinate", "wGmYcqUkgE");
        setField(term3031, term3031.getClass(), "z", term3058);
        setField(term2990, term2990.getClass(), "position2", term3031);
        setField(term3071, term3071.getClass(), "namespace", "idgaQsnJpQ");
        setField(term3071, term3071.getClass(), "block", "VgZnGoIFwQ");
        setField(term2990, term2990.getClass(), "block", term3071);
        setField(term3096, term3096.getClass(), "namespace", "jUbSRrkrYZ");
        setField(term3096, term3096.getClass(), "block", "bWWfajKbEX");
        setField(term2990, term2990.getClass(), "replaceBlock", term3096);
        setField(term2990, term2990.getClass(), "fillMode", enum5);
        term3131 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term3131, term3131.getClass(), "namespace", "cAPeiZHKGJ");
        setField(term3131, term3131.getClass(), "block", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[1];
        args[0] = term3131;
        callMethod(klass, "destroy", argTypes, term2990, args);
    }

};


