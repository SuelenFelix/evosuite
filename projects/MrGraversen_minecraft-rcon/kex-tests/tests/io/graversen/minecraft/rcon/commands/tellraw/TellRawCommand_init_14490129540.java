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
import java.lang.Boolean;
import java.lang.Object;

public class TellRawCommand_init_14490129540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5141;
     Object term5166;
     Object term5168;
     Object term5170;
     Object term5172;
     Object term5174;
     Object term5188;
     Object term5213;

    public TellRawCommand_init_14490129540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5141 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term5141, term5141.getClass(), "targetString", "FlHzxEfFzI");
        term5166 = new Boolean(true);
        term5168 = new Boolean(false);
        term5170 = new Boolean(false);
        term5172 = new Boolean(true);
        term5174 = new Boolean(false);
        term5188 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        setField(term5188, term5188.getClass(), "action", "ubodzJoMGW");
        setField(term5188, term5188.getClass(), "value", "weddIktxOA");
        term5213 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5226 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term5227 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term5213, term5213.getClass(), "action", "uSlMeISsDD");
        setField(term5227, term5227.getClass(), "text", "WdCiTDUKqn");
        setBooleanField(term5227, term5227.getClass(), "bold", true);
        setBooleanField(term5227, term5227.getClass(), "italic", true);
        setBooleanField(term5227, term5227.getClass(), "underlined", true);
        setBooleanField(term5227, term5227.getClass(), "striketrough", false);
        setBooleanField(term5227, term5227.getClass(), "obfuscated", true);
        setField(term5227, term5227.getClass(), "color", "PSizQDoxxe");
        setElement(term5226, 0, term5227);
        setField(term5213, term5213.getClass(), "contents", term5226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent");
        argTypes[9] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent");
        Object[] args = new Object[10];
        args[0] = term5141;
        args[1] = "aSATgQUpoe";
        args[2] = term5166;
        args[3] = term5168;
        args[4] = term5170;
        args[5] = term5172;
        args[6] = term5174;
        args[7] = "VkPSXewZfB";
        args[8] = term5188;
        args[9] = term5213;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


