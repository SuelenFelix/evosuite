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

public class TellRawCommand_isObfuscated_12348764626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6207;

    public TellRawCommand_isObfuscated_12348764626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6207 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6237 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6262 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6275 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 2);
        Object term6276 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6284 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6292 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6207, term6207.getClass(), "text", "EULDrUNQvw");
        setBooleanField(term6207, term6207.getClass(), "bold", false);
        setBooleanField(term6207, term6207.getClass(), "italic", false);
        setBooleanField(term6207, term6207.getClass(), "underlined", false);
        setBooleanField(term6207, term6207.getClass(), "striketrough", true);
        setBooleanField(term6207, term6207.getClass(), "obfuscated", true);
        setField(term6207, term6207.getClass(), "color", "BtvAvsJSei");
        setField(term6237, term6237.getClass(), "action", "vqnBkkxoIa");
        setField(term6237, term6237.getClass(), "value", "bycpZjxXFn");
        setField(term6207, term6207.getClass(), "clickEvent", term6237);
        setField(term6262, term6262.getClass(), "action", "jQWttOAiwL");
        setField(term6276, term6276.getClass(), "text", "");
        setBooleanField(term6276, term6276.getClass(), "bold", true);
        setBooleanField(term6276, term6276.getClass(), "italic", false);
        setBooleanField(term6276, term6276.getClass(), "underlined", true);
        setBooleanField(term6276, term6276.getClass(), "striketrough", true);
        setBooleanField(term6276, term6276.getClass(), "obfuscated", true);
        setField(term6276, term6276.getClass(), "color", "");
        setElement(term6275, 0, term6276);
        setField(term6284, term6284.getClass(), "text", "");
        setBooleanField(term6284, term6284.getClass(), "bold", false);
        setBooleanField(term6284, term6284.getClass(), "italic", false);
        setBooleanField(term6284, term6284.getClass(), "underlined", true);
        setBooleanField(term6284, term6284.getClass(), "striketrough", true);
        setBooleanField(term6284, term6284.getClass(), "obfuscated", false);
        setField(term6284, term6284.getClass(), "color", "");
        setElement(term6275, 1, term6284);
        setField(term6262, term6262.getClass(), "contents", term6275);
        setField(term6207, term6207.getClass(), "hoverEvent", term6262);
        setField(term6292, term6292.getClass(), "targetString", "xjoSGPWUgu");
        setField(term6207, term6207.getClass(), "target", term6292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObfuscated", argTypes, term6207, args);
    }

};


