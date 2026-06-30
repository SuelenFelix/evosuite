package io.graversen.minecraft.rcon.commands.tellraw;

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
import static io.graversen.minecraft.rcon.commands.tellraw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HoverEvent_init_10711408002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;

    public HoverEvent_init_10711408002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1262 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 3);
        Object term1263 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1293 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1323 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term1263, term1263.getClass(), "text", "nghfqDXyCG");
        setBooleanField(term1263, term1263.getClass(), "bold", false);
        setBooleanField(term1263, term1263.getClass(), "italic", true);
        setBooleanField(term1263, term1263.getClass(), "underlined", true);
        setBooleanField(term1263, term1263.getClass(), "striketrough", true);
        setBooleanField(term1263, term1263.getClass(), "obfuscated", false);
        setField(term1263, term1263.getClass(), "color", "WBAOTqErtm");
        setElement(term1262, 0, term1263);
        setField(term1293, term1293.getClass(), "text", "PqtVXXZMqK");
        setBooleanField(term1293, term1293.getClass(), "bold", true);
        setBooleanField(term1293, term1293.getClass(), "italic", true);
        setBooleanField(term1293, term1293.getClass(), "underlined", false);
        setBooleanField(term1293, term1293.getClass(), "striketrough", true);
        setBooleanField(term1293, term1293.getClass(), "obfuscated", false);
        setField(term1293, term1293.getClass(), "color", "rYbtIDVdnd");
        setElement(term1262, 1, term1293);
        setField(term1323, term1323.getClass(), "text", "UKAReurpHG");
        setBooleanField(term1323, term1323.getClass(), "bold", true);
        setBooleanField(term1323, term1323.getClass(), "italic", false);
        setBooleanField(term1323, term1323.getClass(), "underlined", false);
        setBooleanField(term1323, term1323.getClass(), "striketrough", true);
        setBooleanField(term1323, term1323.getClass(), "obfuscated", false);
        setField(term1323, term1323.getClass(), "color", "WVRMUmrljA");
        setElement(term1262, 2, term1323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "iIRsCSYqXH";
        args[1] = term1262;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


