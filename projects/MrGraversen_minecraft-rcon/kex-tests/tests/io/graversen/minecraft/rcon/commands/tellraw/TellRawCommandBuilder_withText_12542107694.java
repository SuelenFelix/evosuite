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

public class TellRawCommandBuilder_withText_12542107694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;

    public TellRawCommandBuilder_withText_12542107694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2790 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term2791 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term2833 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term2858 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term2871 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 7);
        Object term2872 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2880 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2888 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2896 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2904 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2912 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term2920 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term2791, term2791.getClass(), "targetString", "vLerpqavFM");
        setField(term2790, term2790.getClass(), "target", term2791);
        setField(term2790, term2790.getClass(), "text", "qnvxzwuGKX");
        setBooleanField(term2790, term2790.getClass(), "bold", true);
        setBooleanField(term2790, term2790.getClass(), "italic", true);
        setBooleanField(term2790, term2790.getClass(), "underlined", true);
        setBooleanField(term2790, term2790.getClass(), "striketrough", false);
        setBooleanField(term2790, term2790.getClass(), "obfuscated", false);
        setField(term2790, term2790.getClass(), "color", "EdPAvpluZg");
        setField(term2833, term2833.getClass(), "action", "DzHVBMqWtE");
        setField(term2833, term2833.getClass(), "value", "THZSpzBRYP");
        setField(term2790, term2790.getClass(), "clickEvent", term2833);
        setField(term2858, term2858.getClass(), "action", "ZfBIVGBQOE");
        setField(term2872, term2872.getClass(), "text", "");
        setBooleanField(term2872, term2872.getClass(), "bold", true);
        setBooleanField(term2872, term2872.getClass(), "italic", true);
        setBooleanField(term2872, term2872.getClass(), "underlined", false);
        setBooleanField(term2872, term2872.getClass(), "striketrough", true);
        setBooleanField(term2872, term2872.getClass(), "obfuscated", false);
        setField(term2872, term2872.getClass(), "color", "");
        setElement(term2871, 0, term2872);
        setField(term2880, term2880.getClass(), "text", "");
        setBooleanField(term2880, term2880.getClass(), "bold", true);
        setBooleanField(term2880, term2880.getClass(), "italic", false);
        setBooleanField(term2880, term2880.getClass(), "underlined", false);
        setBooleanField(term2880, term2880.getClass(), "striketrough", false);
        setBooleanField(term2880, term2880.getClass(), "obfuscated", true);
        setField(term2880, term2880.getClass(), "color", "");
        setElement(term2871, 1, term2880);
        setField(term2888, term2888.getClass(), "text", "");
        setBooleanField(term2888, term2888.getClass(), "bold", false);
        setBooleanField(term2888, term2888.getClass(), "italic", true);
        setBooleanField(term2888, term2888.getClass(), "underlined", true);
        setBooleanField(term2888, term2888.getClass(), "striketrough", false);
        setBooleanField(term2888, term2888.getClass(), "obfuscated", true);
        setField(term2888, term2888.getClass(), "color", "");
        setElement(term2871, 2, term2888);
        setField(term2896, term2896.getClass(), "text", "");
        setBooleanField(term2896, term2896.getClass(), "bold", false);
        setBooleanField(term2896, term2896.getClass(), "italic", false);
        setBooleanField(term2896, term2896.getClass(), "underlined", true);
        setBooleanField(term2896, term2896.getClass(), "striketrough", false);
        setBooleanField(term2896, term2896.getClass(), "obfuscated", false);
        setField(term2896, term2896.getClass(), "color", "");
        setElement(term2871, 3, term2896);
        setField(term2904, term2904.getClass(), "text", "");
        setBooleanField(term2904, term2904.getClass(), "bold", true);
        setBooleanField(term2904, term2904.getClass(), "italic", false);
        setBooleanField(term2904, term2904.getClass(), "underlined", true);
        setBooleanField(term2904, term2904.getClass(), "striketrough", false);
        setBooleanField(term2904, term2904.getClass(), "obfuscated", false);
        setField(term2904, term2904.getClass(), "color", "");
        setElement(term2871, 4, term2904);
        setField(term2912, term2912.getClass(), "text", "");
        setBooleanField(term2912, term2912.getClass(), "bold", true);
        setBooleanField(term2912, term2912.getClass(), "italic", true);
        setBooleanField(term2912, term2912.getClass(), "underlined", true);
        setBooleanField(term2912, term2912.getClass(), "striketrough", false);
        setBooleanField(term2912, term2912.getClass(), "obfuscated", true);
        setField(term2912, term2912.getClass(), "color", "");
        setElement(term2871, 5, term2912);
        setField(term2920, term2920.getClass(), "text", "");
        setBooleanField(term2920, term2920.getClass(), "bold", true);
        setBooleanField(term2920, term2920.getClass(), "italic", false);
        setBooleanField(term2920, term2920.getClass(), "underlined", false);
        setBooleanField(term2920, term2920.getClass(), "striketrough", true);
        setBooleanField(term2920, term2920.getClass(), "obfuscated", false);
        setField(term2920, term2920.getClass(), "color", "");
        setElement(term2871, 6, term2920);
        setField(term2858, term2858.getClass(), "contents", term2871);
        setField(term2790, term2790.getClass(), "hoverEvent", term2858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nRvKihUSPj";
        callMethod(klass, "withText", argTypes, term2790, args);
    }

};


