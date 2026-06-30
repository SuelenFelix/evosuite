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
import java.lang.Float;

public class PlaySoundCommand_relativeTo_13866797382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13847;
     Object term13860;
     Object term13885;
     Object term13887;

    public PlaySoundCommand_relativeTo_13866797382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13847 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13847, term13847.getClass(), "targetString", "goAoCMhKBu");
        term13860 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        setField(term13860, term13860.getClass(), "namespace", "BWxJSgKHRT");
        setField(term13860, term13860.getClass(), "sound", "AGXoIndFnm");
        term13885 = new Float(0.3455959F);
        term13887 = new Float(0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Sound");
        argTypes[2] = float.class;
        argTypes[3] = float.class;
        Object[] args = new Object[4];
        args[0] = term13847;
        args[1] = term13860;
        args[2] = term13885;
        args[3] = term13887;
        callMethod(klass, "relativeTo", argTypes, null, args);
    }

};


