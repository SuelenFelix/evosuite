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

public class TellRawCommandBuilder_obfuscated_19599496679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3722;

    public TellRawCommandBuilder_obfuscated_19599496679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3722 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3723 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3765 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3790 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3803 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 2);
        Object term3804 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3812 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3723, term3723.getClass(), "targetString", "mGRiYhnMcR");
        setField(term3722, term3722.getClass(), "target", term3723);
        setField(term3722, term3722.getClass(), "text", "NFlvfJCVPO");
        setBooleanField(term3722, term3722.getClass(), "bold", false);
        setBooleanField(term3722, term3722.getClass(), "italic", true);
        setBooleanField(term3722, term3722.getClass(), "underlined", true);
        setBooleanField(term3722, term3722.getClass(), "striketrough", false);
        setBooleanField(term3722, term3722.getClass(), "obfuscated", false);
        setField(term3722, term3722.getClass(), "color", "KarbTXFmUU");
        setField(term3765, term3765.getClass(), "action", "jiUSjqwSIQ");
        setField(term3765, term3765.getClass(), "value", "MgLCedQfoj");
        setField(term3722, term3722.getClass(), "clickEvent", term3765);
        setField(term3790, term3790.getClass(), "action", "zgKiINdgNu");
        setField(term3804, term3804.getClass(), "text", "");
        setBooleanField(term3804, term3804.getClass(), "bold", true);
        setBooleanField(term3804, term3804.getClass(), "italic", false);
        setBooleanField(term3804, term3804.getClass(), "underlined", true);
        setBooleanField(term3804, term3804.getClass(), "striketrough", false);
        setBooleanField(term3804, term3804.getClass(), "obfuscated", false);
        setField(term3804, term3804.getClass(), "color", "");
        setElement(term3803, 0, term3804);
        setField(term3812, term3812.getClass(), "text", "");
        setBooleanField(term3812, term3812.getClass(), "bold", false);
        setBooleanField(term3812, term3812.getClass(), "italic", true);
        setBooleanField(term3812, term3812.getClass(), "underlined", false);
        setBooleanField(term3812, term3812.getClass(), "striketrough", false);
        setBooleanField(term3812, term3812.getClass(), "obfuscated", false);
        setField(term3812, term3812.getClass(), "color", "");
        setElement(term3803, 1, term3812);
        setField(term3790, term3790.getClass(), "contents", term3803);
        setField(term3722, term3722.getClass(), "hoverEvent", term3790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "obfuscated", argTypes, term3722, args);
    }

};


