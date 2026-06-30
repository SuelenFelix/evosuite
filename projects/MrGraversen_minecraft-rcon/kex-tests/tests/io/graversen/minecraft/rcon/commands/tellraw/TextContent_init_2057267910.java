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

public class TextContent_init_2057267910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;

    public TextContent_init_2057267910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term340 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term365 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term378 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term379 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term387 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term310, term310.getClass(), "text", "ZkMALXpEAZ");
        setBooleanField(term310, term310.getClass(), "bold", true);
        setBooleanField(term310, term310.getClass(), "italic", false);
        setBooleanField(term310, term310.getClass(), "underlined", false);
        setBooleanField(term310, term310.getClass(), "striketrough", false);
        setBooleanField(term310, term310.getClass(), "obfuscated", false);
        setField(term310, term310.getClass(), "color", "tXfQjSqDzN");
        setField(term340, term340.getClass(), "action", "BjugTaMcxJ");
        setField(term340, term340.getClass(), "value", "vGiuZVPJNH");
        setField(term310, term310.getClass(), "clickEvent", term340);
        setField(term365, term365.getClass(), "action", "tlzpzIjMib");
        setField(term379, term379.getClass(), "text", "");
        setBooleanField(term379, term379.getClass(), "bold", true);
        setBooleanField(term379, term379.getClass(), "italic", true);
        setBooleanField(term379, term379.getClass(), "underlined", true);
        setBooleanField(term379, term379.getClass(), "striketrough", true);
        setBooleanField(term379, term379.getClass(), "obfuscated", false);
        setField(term379, term379.getClass(), "color", "");
        setElement(term378, 0, term379);
        setField(term365, term365.getClass(), "contents", term378);
        setField(term310, term310.getClass(), "hoverEvent", term365);
        setField(term387, term387.getClass(), "targetString", "FwPbDZcHmB");
        setField(term310, term310.getClass(), "target", term387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Object[] args = new Object[1];
        args[0] = term310;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


