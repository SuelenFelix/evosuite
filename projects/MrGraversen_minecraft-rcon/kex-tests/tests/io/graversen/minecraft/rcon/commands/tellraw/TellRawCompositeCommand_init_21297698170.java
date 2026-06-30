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
import java.util.LinkedList;
import java.lang.Object;

public class TellRawCompositeCommand_init_21297698170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TellRawCompositeCommand_init_21297698170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term34 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term37 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term39 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 9);
        Object term40 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term4, term4.getClass(), "text", "PAEBtnZtTD");
        setBooleanField(term4, term4.getClass(), "bold", false);
        setBooleanField(term4, term4.getClass(), "italic", false);
        setBooleanField(term4, term4.getClass(), "underlined", false);
        setBooleanField(term4, term4.getClass(), "striketrough", false);
        setBooleanField(term4, term4.getClass(), "obfuscated", true);
        setField(term4, term4.getClass(), "color", "sjlJAEtRrb");
        setField(term34, term34.getClass(), "action", "");
        setField(term34, term34.getClass(), "value", "");
        setField(term4, term4.getClass(), "clickEvent", term34);
        setField(term37, term37.getClass(), "action", "");
        setField(term37, term37.getClass(), "contents", term39);
        setField(term4, term4.getClass(), "hoverEvent", term37);
        setField(term40, term40.getClass(), "targetString", "");
        setField(term4, term4.getClass(), "target", term40);
        Object term43 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term51 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term52 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term53 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term43, term43.getClass(), "text", "");
        setBooleanField(term43, term43.getClass(), "bold", false);
        setBooleanField(term43, term43.getClass(), "italic", false);
        setBooleanField(term43, term43.getClass(), "underlined", true);
        setBooleanField(term43, term43.getClass(), "striketrough", false);
        setBooleanField(term43, term43.getClass(), "obfuscated", true);
        setField(term43, term43.getClass(), "color", "");
        setField(term51, term51.getClass(), "action", null);
        setField(term51, term51.getClass(), "value", null);
        setField(term43, term43.getClass(), "clickEvent", term51);
        setField(term52, term52.getClass(), "action", null);
        setField(term52, term52.getClass(), "contents", null);
        setField(term43, term43.getClass(), "hoverEvent", term52);
        setField(term53, term53.getClass(), "targetString", null);
        setField(term43, term43.getClass(), "target", term53);
        Object term55 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        setField(term55, term55.getClass(), "text", null);
        setBooleanField(term55, term55.getClass(), "bold", false);
        setBooleanField(term55, term55.getClass(), "italic", false);
        setBooleanField(term55, term55.getClass(), "underlined", true);
        setBooleanField(term55, term55.getClass(), "striketrough", false);
        setBooleanField(term55, term55.getClass(), "obfuscated", false);
        setField(term55, term55.getClass(), "color", null);
        setField(term55, term55.getClass(), "clickEvent", null);
        setField(term55, term55.getClass(), "hoverEvent", null);
        setField(term55, term55.getClass(), "target", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term43);
        ((LinkedList) term1).add(term55);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCompositeCommand");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


