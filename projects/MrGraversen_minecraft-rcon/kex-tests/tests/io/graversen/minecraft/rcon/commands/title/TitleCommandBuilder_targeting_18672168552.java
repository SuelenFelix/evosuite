package io.graversen.minecraft.rcon.commands.title;

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
import static io.graversen.minecraft.rcon.commands.title.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TitleCommandBuilder_targeting_18672168552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object enum0;

    public TitleCommandBuilder_targeting_18672168552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term119 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term119, term119.getClass(), "targetString", "EGtDIRbSSb");
        setField(term118, term118.getClass(), "target", term119);
        setField(term118, term118.getClass(), "position", "SzjVpOQTyS");
        setField(term118, term118.getClass(), "text", "MjGYSRKTNF");
        setBooleanField(term118, term118.getClass(), "bold", true);
        setBooleanField(term118, term118.getClass(), "italic", true);
        setBooleanField(term118, term118.getClass(), "underlined", true);
        setBooleanField(term118, term118.getClass(), "striketrough", false);
        setBooleanField(term118, term118.getClass(), "obfuscated", true);
        setField(term118, term118.getClass(), "color", "hRNSzYYIrc");
        Class<? extends Object> term327 = Class.forName((String) "io.graversen.minecraft.rcon.util.Selectors");
        Field term326 = ((Class) term327).getDeclaredField((String) "ALL_PLAYERS");
        ((Field) term326).setAccessible(true);
        enum0 = ((Field) term326).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Selectors");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "targeting", argTypes, term118, args);
    }

};


