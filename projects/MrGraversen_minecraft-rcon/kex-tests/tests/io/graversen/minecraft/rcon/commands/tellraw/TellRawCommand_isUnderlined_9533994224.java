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

public class TellRawCommand_isUnderlined_9533994224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5867;

    public TellRawCommand_isUnderlined_9533994224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5867 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term5897 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term5922 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5935 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 0);
        Object term5936 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term5867, term5867.getClass(), "text", "MqICFYzDJj");
        setBooleanField(term5867, term5867.getClass(), "bold", false);
        setBooleanField(term5867, term5867.getClass(), "italic", false);
        setBooleanField(term5867, term5867.getClass(), "underlined", true);
        setBooleanField(term5867, term5867.getClass(), "striketrough", false);
        setBooleanField(term5867, term5867.getClass(), "obfuscated", true);
        setField(term5867, term5867.getClass(), "color", "YgQvdcBQKw");
        setField(term5897, term5897.getClass(), "action", "FiYYLuailz");
        setField(term5897, term5897.getClass(), "value", "XebAeSnCKZ");
        setField(term5867, term5867.getClass(), "clickEvent", term5897);
        setField(term5922, term5922.getClass(), "action", "GeddnXjHGy");
        setField(term5922, term5922.getClass(), "contents", term5935);
        setField(term5867, term5867.getClass(), "hoverEvent", term5922);
        setField(term5936, term5936.getClass(), "targetString", "vLTbaoAxBm");
        setField(term5867, term5867.getClass(), "target", term5936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUnderlined", argTypes, term5867, args);
    }

};


