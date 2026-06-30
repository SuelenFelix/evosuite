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

public class TellRawCommandBuilder_italic_20597160476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3160;

    public TellRawCommandBuilder_italic_20597160476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3160 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3161 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3203 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3228 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3241 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 8);
        Object term3242 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3250 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3258 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3266 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3274 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3282 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3290 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3298 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3161, term3161.getClass(), "targetString", "PJcSNDruWd");
        setField(term3160, term3160.getClass(), "target", term3161);
        setField(term3160, term3160.getClass(), "text", "VVNNlAePXF");
        setBooleanField(term3160, term3160.getClass(), "bold", false);
        setBooleanField(term3160, term3160.getClass(), "italic", false);
        setBooleanField(term3160, term3160.getClass(), "underlined", true);
        setBooleanField(term3160, term3160.getClass(), "striketrough", false);
        setBooleanField(term3160, term3160.getClass(), "obfuscated", false);
        setField(term3160, term3160.getClass(), "color", "jnwVnmKAFv");
        setField(term3203, term3203.getClass(), "action", "TXyHhqeCjR");
        setField(term3203, term3203.getClass(), "value", "lZIgPZPgTu");
        setField(term3160, term3160.getClass(), "clickEvent", term3203);
        setField(term3228, term3228.getClass(), "action", "iuCxnHGMoW");
        setField(term3242, term3242.getClass(), "text", "");
        setBooleanField(term3242, term3242.getClass(), "bold", false);
        setBooleanField(term3242, term3242.getClass(), "italic", false);
        setBooleanField(term3242, term3242.getClass(), "underlined", true);
        setBooleanField(term3242, term3242.getClass(), "striketrough", false);
        setBooleanField(term3242, term3242.getClass(), "obfuscated", false);
        setField(term3242, term3242.getClass(), "color", "");
        setElement(term3241, 0, term3242);
        setField(term3250, term3250.getClass(), "text", "");
        setBooleanField(term3250, term3250.getClass(), "bold", true);
        setBooleanField(term3250, term3250.getClass(), "italic", true);
        setBooleanField(term3250, term3250.getClass(), "underlined", false);
        setBooleanField(term3250, term3250.getClass(), "striketrough", false);
        setBooleanField(term3250, term3250.getClass(), "obfuscated", true);
        setField(term3250, term3250.getClass(), "color", "");
        setElement(term3241, 1, term3250);
        setField(term3258, term3258.getClass(), "text", "");
        setBooleanField(term3258, term3258.getClass(), "bold", true);
        setBooleanField(term3258, term3258.getClass(), "italic", false);
        setBooleanField(term3258, term3258.getClass(), "underlined", true);
        setBooleanField(term3258, term3258.getClass(), "striketrough", false);
        setBooleanField(term3258, term3258.getClass(), "obfuscated", true);
        setField(term3258, term3258.getClass(), "color", "");
        setElement(term3241, 2, term3258);
        setField(term3266, term3266.getClass(), "text", "");
        setBooleanField(term3266, term3266.getClass(), "bold", true);
        setBooleanField(term3266, term3266.getClass(), "italic", true);
        setBooleanField(term3266, term3266.getClass(), "underlined", false);
        setBooleanField(term3266, term3266.getClass(), "striketrough", true);
        setBooleanField(term3266, term3266.getClass(), "obfuscated", true);
        setField(term3266, term3266.getClass(), "color", "");
        setElement(term3241, 3, term3266);
        setField(term3274, term3274.getClass(), "text", "");
        setBooleanField(term3274, term3274.getClass(), "bold", true);
        setBooleanField(term3274, term3274.getClass(), "italic", false);
        setBooleanField(term3274, term3274.getClass(), "underlined", false);
        setBooleanField(term3274, term3274.getClass(), "striketrough", false);
        setBooleanField(term3274, term3274.getClass(), "obfuscated", false);
        setField(term3274, term3274.getClass(), "color", "");
        setElement(term3241, 4, term3274);
        setField(term3282, term3282.getClass(), "text", "");
        setBooleanField(term3282, term3282.getClass(), "bold", false);
        setBooleanField(term3282, term3282.getClass(), "italic", false);
        setBooleanField(term3282, term3282.getClass(), "underlined", true);
        setBooleanField(term3282, term3282.getClass(), "striketrough", false);
        setBooleanField(term3282, term3282.getClass(), "obfuscated", false);
        setField(term3282, term3282.getClass(), "color", "");
        setElement(term3241, 5, term3282);
        setField(term3290, term3290.getClass(), "text", "");
        setBooleanField(term3290, term3290.getClass(), "bold", true);
        setBooleanField(term3290, term3290.getClass(), "italic", false);
        setBooleanField(term3290, term3290.getClass(), "underlined", false);
        setBooleanField(term3290, term3290.getClass(), "striketrough", false);
        setBooleanField(term3290, term3290.getClass(), "obfuscated", false);
        setField(term3290, term3290.getClass(), "color", "");
        setElement(term3241, 6, term3290);
        setField(term3298, term3298.getClass(), "text", "");
        setBooleanField(term3298, term3298.getClass(), "bold", true);
        setBooleanField(term3298, term3298.getClass(), "italic", true);
        setBooleanField(term3298, term3298.getClass(), "underlined", false);
        setBooleanField(term3298, term3298.getClass(), "striketrough", false);
        setBooleanField(term3298, term3298.getClass(), "obfuscated", true);
        setField(term3298, term3298.getClass(), "color", "");
        setElement(term3241, 7, term3298);
        setField(term3228, term3228.getClass(), "contents", term3241);
        setField(term3160, term3160.getClass(), "hoverEvent", term3228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "italic", argTypes, term3160, args);
    }

};


