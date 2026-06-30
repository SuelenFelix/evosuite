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

public class FillCommandBuilder_build_7951968169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987;

    public FillCommandBuilder_build_7951968169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4230 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term4229 = ((Class) term4230).getDeclaredField((String) "REPLACE");
        ((Field) term4229).setAccessible(true);
        Object enum7 = ((Field) term4229).get((Object) null);
        term3987 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term3988 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term3989 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4002 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4015 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4028 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term4029 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4042 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4055 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term4068 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term4093 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term3989, term3989.getClass(), "coordinate", "XqgfKFvPSD");
        setField(term3988, term3988.getClass(), "x", term3989);
        setField(term4002, term4002.getClass(), "coordinate", "JiVRgTZvKc");
        setField(term3988, term3988.getClass(), "y", term4002);
        setField(term4015, term4015.getClass(), "coordinate", "XPKmummaqg");
        setField(term3988, term3988.getClass(), "z", term4015);
        setField(term3987, term3987.getClass(), "position1", term3988);
        setField(term4029, term4029.getClass(), "coordinate", "BKLfkLiZTH");
        setField(term4028, term4028.getClass(), "x", term4029);
        setField(term4042, term4042.getClass(), "coordinate", "SPpkrGcPRr");
        setField(term4028, term4028.getClass(), "y", term4042);
        setField(term4055, term4055.getClass(), "coordinate", "sEccwbJKYE");
        setField(term4028, term4028.getClass(), "z", term4055);
        setField(term3987, term3987.getClass(), "position2", term4028);
        setField(term4068, term4068.getClass(), "namespace", "AWRooQKkdW");
        setField(term4068, term4068.getClass(), "block", "vjxIhXHxGR");
        setField(term3987, term3987.getClass(), "block", term4068);
        setField(term4093, term4093.getClass(), "namespace", "QXzGXbEXMu");
        setField(term4093, term4093.getClass(), "block", "qxSDVejjiY");
        setField(term3987, term3987.getClass(), "replaceBlock", term4093);
        setField(term3987, term3987.getClass(), "fillMode", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3987, args);
    }

};


