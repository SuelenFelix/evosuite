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
import java.lang.String;
import java.lang.Object;

public class WhiteListCommand_command_12539367282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8197;

    public WhiteListCommand_command_12539367282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8222 = Class.forName((String) "io.graversen.minecraft.rcon.util.WhiteListModes");
        Field term8221 = ((Class) term8222).getDeclaredField((String) "RELOAD");
        ((Field) term8221).setAccessible(true);
        Object enum14 = ((Field) term8221).get((Object) null);
        term8197 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.WhiteListCommand"));
        Object term8208 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8197, term8197.getClass(), "whiteListMode", enum14);
        setField(term8208, term8208.getClass(), "targetString", "fzeqPnzpnt");
        setField(term8197, term8197.getClass(), "target", term8208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WhiteListCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term8197, args);
    }

};


