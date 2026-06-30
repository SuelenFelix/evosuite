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

public class TellRawCommandBuilder_bold_3864645405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3010;

    public TellRawCommandBuilder_bold_3864645405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3010 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3011 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3053 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3078 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3091 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term3092 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3011, term3011.getClass(), "targetString", "BbNeQJpYPr");
        setField(term3010, term3010.getClass(), "target", term3011);
        setField(term3010, term3010.getClass(), "text", "riMtzCoxNj");
        setBooleanField(term3010, term3010.getClass(), "bold", true);
        setBooleanField(term3010, term3010.getClass(), "italic", false);
        setBooleanField(term3010, term3010.getClass(), "underlined", false);
        setBooleanField(term3010, term3010.getClass(), "striketrough", true);
        setBooleanField(term3010, term3010.getClass(), "obfuscated", true);
        setField(term3010, term3010.getClass(), "color", "YAXkVjQZcV");
        setField(term3053, term3053.getClass(), "action", "pumvwBWvpy");
        setField(term3053, term3053.getClass(), "value", "HwLHeGLyhe");
        setField(term3010, term3010.getClass(), "clickEvent", term3053);
        setField(term3078, term3078.getClass(), "action", "RDnkgWkcbz");
        setField(term3092, term3092.getClass(), "text", "");
        setBooleanField(term3092, term3092.getClass(), "bold", false);
        setBooleanField(term3092, term3092.getClass(), "italic", true);
        setBooleanField(term3092, term3092.getClass(), "underlined", true);
        setBooleanField(term3092, term3092.getClass(), "striketrough", false);
        setBooleanField(term3092, term3092.getClass(), "obfuscated", false);
        setField(term3092, term3092.getClass(), "color", "");
        setElement(term3091, 0, term3092);
        setField(term3078, term3078.getClass(), "contents", term3091);
        setField(term3010, term3010.getClass(), "hoverEvent", term3078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bold", argTypes, term3010, args);
    }

};


