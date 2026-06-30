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
import java.lang.String;

public class TellRawCommandBuilder_withColor_7856374833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2198;
     Object enum1;

    public TellRawCommandBuilder_withColor_7856374833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2198 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term2199 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term2241 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term2266 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term2279 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 4);
        Object term2280 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2288 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2296 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2304 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term2199, term2199.getClass(), "targetString", "TtGbVmKcnX");
        setField(term2198, term2198.getClass(), "target", term2199);
        setField(term2198, term2198.getClass(), "text", "GJVkUrCVdD");
        setBooleanField(term2198, term2198.getClass(), "bold", false);
        setBooleanField(term2198, term2198.getClass(), "italic", false);
        setBooleanField(term2198, term2198.getClass(), "underlined", true);
        setBooleanField(term2198, term2198.getClass(), "striketrough", false);
        setBooleanField(term2198, term2198.getClass(), "obfuscated", false);
        setField(term2198, term2198.getClass(), "color", "zNdorvdUgu");
        setField(term2241, term2241.getClass(), "action", "oPxuZbkYio");
        setField(term2241, term2241.getClass(), "value", "vKitydDVnM");
        setField(term2198, term2198.getClass(), "clickEvent", term2241);
        setField(term2266, term2266.getClass(), "action", "urCiQnUFBM");
        setField(term2280, term2280.getClass(), "text", "");
        setBooleanField(term2280, term2280.getClass(), "bold", true);
        setBooleanField(term2280, term2280.getClass(), "italic", true);
        setBooleanField(term2280, term2280.getClass(), "underlined", false);
        setBooleanField(term2280, term2280.getClass(), "striketrough", false);
        setBooleanField(term2280, term2280.getClass(), "obfuscated", false);
        setField(term2280, term2280.getClass(), "color", "");
        setElement(term2279, 0, term2280);
        setField(term2288, term2288.getClass(), "text", "");
        setBooleanField(term2288, term2288.getClass(), "bold", false);
        setBooleanField(term2288, term2288.getClass(), "italic", false);
        setBooleanField(term2288, term2288.getClass(), "underlined", true);
        setBooleanField(term2288, term2288.getClass(), "striketrough", false);
        setBooleanField(term2288, term2288.getClass(), "obfuscated", true);
        setField(term2288, term2288.getClass(), "color", "");
        setElement(term2279, 1, term2288);
        setField(term2296, term2296.getClass(), "text", "");
        setBooleanField(term2296, term2296.getClass(), "bold", false);
        setBooleanField(term2296, term2296.getClass(), "italic", false);
        setBooleanField(term2296, term2296.getClass(), "underlined", true);
        setBooleanField(term2296, term2296.getClass(), "striketrough", true);
        setBooleanField(term2296, term2296.getClass(), "obfuscated", false);
        setField(term2296, term2296.getClass(), "color", "");
        setElement(term2279, 2, term2296);
        setField(term2304, term2304.getClass(), "text", "");
        setBooleanField(term2304, term2304.getClass(), "bold", true);
        setBooleanField(term2304, term2304.getClass(), "italic", false);
        setBooleanField(term2304, term2304.getClass(), "underlined", true);
        setBooleanField(term2304, term2304.getClass(), "striketrough", false);
        setBooleanField(term2304, term2304.getClass(), "obfuscated", false);
        setField(term2304, term2304.getClass(), "color", "");
        setElement(term2279, 3, term2304);
        setField(term2266, term2266.getClass(), "contents", term2279);
        setField(term2198, term2198.getClass(), "hoverEvent", term2266);
        Class<? extends Object> term2559 = Class.forName((String) "io.graversen.minecraft.rcon.util.Colors");
        Field term2558 = ((Class) term2559).getDeclaredField((String) "DARK_GREEN");
        ((Field) term2558).setAccessible(true);
        enum1 = ((Field) term2558).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Colors");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "withColor", argTypes, term2198, args);
    }

};


