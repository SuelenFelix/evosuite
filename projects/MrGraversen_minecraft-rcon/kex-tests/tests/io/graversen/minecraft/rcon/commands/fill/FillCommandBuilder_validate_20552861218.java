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

public class FillCommandBuilder_validate_20552861218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3511;

    public FillCommandBuilder_validate_20552861218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3753 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term3752 = ((Class) term3753).getDeclaredField((String) "HOLLOW");
        ((Field) term3752).setAccessible(true);
        Object enum6 = ((Field) term3752).get((Object) null);
        term3511 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term3512 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term3513 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3526 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3539 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3552 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term3553 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3566 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3579 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term3592 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term3617 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term3513, term3513.getClass(), "coordinate", "PHvxnGHptP");
        setField(term3512, term3512.getClass(), "x", term3513);
        setField(term3526, term3526.getClass(), "coordinate", "TimdotUuNC");
        setField(term3512, term3512.getClass(), "y", term3526);
        setField(term3539, term3539.getClass(), "coordinate", "PkWMRdJcBb");
        setField(term3512, term3512.getClass(), "z", term3539);
        setField(term3511, term3511.getClass(), "position1", term3512);
        setField(term3553, term3553.getClass(), "coordinate", "jSpAteRute");
        setField(term3552, term3552.getClass(), "x", term3553);
        setField(term3566, term3566.getClass(), "coordinate", "swZVeJAxjt");
        setField(term3552, term3552.getClass(), "y", term3566);
        setField(term3579, term3579.getClass(), "coordinate", "xOcJIiQQDu");
        setField(term3552, term3552.getClass(), "z", term3579);
        setField(term3511, term3511.getClass(), "position2", term3552);
        setField(term3592, term3592.getClass(), "namespace", "GVizqqzXpy");
        setField(term3592, term3592.getClass(), "block", "JqXGgAhZPl");
        setField(term3511, term3511.getClass(), "block", term3592);
        setField(term3617, term3617.getClass(), "namespace", "jiKYgYHqIS");
        setField(term3617, term3617.getClass(), "block", "DfISiziTgG");
        setField(term3511, term3511.getClass(), "replaceBlock", term3617);
        setField(term3511, term3511.getClass(), "fillMode", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term3511, args);
    }

};


