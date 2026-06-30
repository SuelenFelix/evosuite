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

public class TellRawCommandBuilder_targeting_12307544831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425;

    public TellRawCommandBuilder_targeting_12307544831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1425 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term1426 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term1468 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term1493 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term1506 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 4);
        Object term1507 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1515 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1523 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1531 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term1426, term1426.getClass(), "targetString", "NTlKJDDWlk");
        setField(term1425, term1425.getClass(), "target", term1426);
        setField(term1425, term1425.getClass(), "text", "vOuMEpOQAg");
        setBooleanField(term1425, term1425.getClass(), "bold", false);
        setBooleanField(term1425, term1425.getClass(), "italic", true);
        setBooleanField(term1425, term1425.getClass(), "underlined", true);
        setBooleanField(term1425, term1425.getClass(), "striketrough", true);
        setBooleanField(term1425, term1425.getClass(), "obfuscated", false);
        setField(term1425, term1425.getClass(), "color", "SIODFGaQhr");
        setField(term1468, term1468.getClass(), "action", "qYzsiuXOgS");
        setField(term1468, term1468.getClass(), "value", "bxrCBbrrct");
        setField(term1425, term1425.getClass(), "clickEvent", term1468);
        setField(term1493, term1493.getClass(), "action", "CKWpJaaaxX");
        setField(term1507, term1507.getClass(), "text", "");
        setBooleanField(term1507, term1507.getClass(), "bold", true);
        setBooleanField(term1507, term1507.getClass(), "italic", true);
        setBooleanField(term1507, term1507.getClass(), "underlined", true);
        setBooleanField(term1507, term1507.getClass(), "striketrough", false);
        setBooleanField(term1507, term1507.getClass(), "obfuscated", false);
        setField(term1507, term1507.getClass(), "color", "");
        setElement(term1506, 0, term1507);
        setField(term1515, term1515.getClass(), "text", "");
        setBooleanField(term1515, term1515.getClass(), "bold", true);
        setBooleanField(term1515, term1515.getClass(), "italic", false);
        setBooleanField(term1515, term1515.getClass(), "underlined", false);
        setBooleanField(term1515, term1515.getClass(), "striketrough", false);
        setBooleanField(term1515, term1515.getClass(), "obfuscated", false);
        setField(term1515, term1515.getClass(), "color", "");
        setElement(term1506, 1, term1515);
        setField(term1523, term1523.getClass(), "text", "");
        setBooleanField(term1523, term1523.getClass(), "bold", true);
        setBooleanField(term1523, term1523.getClass(), "italic", true);
        setBooleanField(term1523, term1523.getClass(), "underlined", false);
        setBooleanField(term1523, term1523.getClass(), "striketrough", false);
        setBooleanField(term1523, term1523.getClass(), "obfuscated", false);
        setField(term1523, term1523.getClass(), "color", "");
        setElement(term1506, 2, term1523);
        setField(term1531, term1531.getClass(), "text", "");
        setBooleanField(term1531, term1531.getClass(), "bold", false);
        setBooleanField(term1531, term1531.getClass(), "italic", false);
        setBooleanField(term1531, term1531.getClass(), "underlined", false);
        setBooleanField(term1531, term1531.getClass(), "striketrough", false);
        setBooleanField(term1531, term1531.getClass(), "obfuscated", false);
        setField(term1531, term1531.getClass(), "color", "");
        setElement(term1506, 3, term1531);
        setField(term1493, term1493.getClass(), "contents", term1506);
        setField(term1425, term1425.getClass(), "hoverEvent", term1493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "targeting", argTypes, term1425, args);
    }

};


