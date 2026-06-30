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

public class TellRawCommand_isItalic_13027076103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5693;

    public TellRawCommand_isItalic_13027076103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5693 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term5723 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term5748 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5761 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 4);
        Object term5762 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5770 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5778 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5786 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5794 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term5693, term5693.getClass(), "text", "wsysQLGFnl");
        setBooleanField(term5693, term5693.getClass(), "bold", false);
        setBooleanField(term5693, term5693.getClass(), "italic", true);
        setBooleanField(term5693, term5693.getClass(), "underlined", true);
        setBooleanField(term5693, term5693.getClass(), "striketrough", true);
        setBooleanField(term5693, term5693.getClass(), "obfuscated", false);
        setField(term5693, term5693.getClass(), "color", "ckQLZGFjMX");
        setField(term5723, term5723.getClass(), "action", "qphdrqUtNx");
        setField(term5723, term5723.getClass(), "value", "bwlLFAfNWx");
        setField(term5693, term5693.getClass(), "clickEvent", term5723);
        setField(term5748, term5748.getClass(), "action", "JWodNQzjjV");
        setField(term5762, term5762.getClass(), "text", "");
        setBooleanField(term5762, term5762.getClass(), "bold", false);
        setBooleanField(term5762, term5762.getClass(), "italic", true);
        setBooleanField(term5762, term5762.getClass(), "underlined", true);
        setBooleanField(term5762, term5762.getClass(), "striketrough", false);
        setBooleanField(term5762, term5762.getClass(), "obfuscated", false);
        setField(term5762, term5762.getClass(), "color", "");
        setElement(term5761, 0, term5762);
        setField(term5770, term5770.getClass(), "text", "");
        setBooleanField(term5770, term5770.getClass(), "bold", false);
        setBooleanField(term5770, term5770.getClass(), "italic", false);
        setBooleanField(term5770, term5770.getClass(), "underlined", true);
        setBooleanField(term5770, term5770.getClass(), "striketrough", true);
        setBooleanField(term5770, term5770.getClass(), "obfuscated", false);
        setField(term5770, term5770.getClass(), "color", "");
        setElement(term5761, 1, term5770);
        setField(term5778, term5778.getClass(), "text", "");
        setBooleanField(term5778, term5778.getClass(), "bold", true);
        setBooleanField(term5778, term5778.getClass(), "italic", false);
        setBooleanField(term5778, term5778.getClass(), "underlined", true);
        setBooleanField(term5778, term5778.getClass(), "striketrough", true);
        setBooleanField(term5778, term5778.getClass(), "obfuscated", false);
        setField(term5778, term5778.getClass(), "color", "");
        setElement(term5761, 2, term5778);
        setField(term5786, term5786.getClass(), "text", "");
        setBooleanField(term5786, term5786.getClass(), "bold", true);
        setBooleanField(term5786, term5786.getClass(), "italic", false);
        setBooleanField(term5786, term5786.getClass(), "underlined", false);
        setBooleanField(term5786, term5786.getClass(), "striketrough", false);
        setBooleanField(term5786, term5786.getClass(), "obfuscated", false);
        setField(term5786, term5786.getClass(), "color", "");
        setElement(term5761, 3, term5786);
        setField(term5748, term5748.getClass(), "contents", term5761);
        setField(term5693, term5693.getClass(), "hoverEvent", term5748);
        setField(term5794, term5794.getClass(), "targetString", "jiCGTTzKGB");
        setField(term5693, term5693.getClass(), "target", term5794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isItalic", argTypes, term5693, args);
    }

};


