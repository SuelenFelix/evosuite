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

public class HoverEvent_getContents_13958823431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126;

    public HoverEvent_getContents_13958823431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1126 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term1139 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 2);
        Object term1140 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1170 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term1126, term1126.getClass(), "action", "XfRABIFVEp");
        setField(term1140, term1140.getClass(), "text", "MHGKyEnwKc");
        setBooleanField(term1140, term1140.getClass(), "bold", true);
        setBooleanField(term1140, term1140.getClass(), "italic", false);
        setBooleanField(term1140, term1140.getClass(), "underlined", true);
        setBooleanField(term1140, term1140.getClass(), "striketrough", true);
        setBooleanField(term1140, term1140.getClass(), "obfuscated", false);
        setField(term1140, term1140.getClass(), "color", "ShIELyuULw");
        setElement(term1139, 0, term1140);
        setField(term1170, term1170.getClass(), "text", "IpQuOGMgmj");
        setBooleanField(term1170, term1170.getClass(), "bold", false);
        setBooleanField(term1170, term1170.getClass(), "italic", false);
        setBooleanField(term1170, term1170.getClass(), "underlined", false);
        setBooleanField(term1170, term1170.getClass(), "striketrough", true);
        setBooleanField(term1170, term1170.getClass(), "obfuscated", true);
        setField(term1170, term1170.getClass(), "color", "pJbnHTYrxn");
        setElement(term1139, 1, term1170);
        setField(term1126, term1126.getClass(), "contents", term1139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContents", argTypes, term1126, args);
    }

};


