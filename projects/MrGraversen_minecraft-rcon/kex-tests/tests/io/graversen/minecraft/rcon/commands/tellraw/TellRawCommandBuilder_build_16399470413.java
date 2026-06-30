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

public class TellRawCommandBuilder_build_16399470413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4921;

    public TellRawCommandBuilder_build_16399470413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4921 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term4922 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term4964 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term4989 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5002 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 0);
        setField(term4922, term4922.getClass(), "targetString", "YsUtbngnRO");
        setField(term4921, term4921.getClass(), "target", term4922);
        setField(term4921, term4921.getClass(), "text", "JisaWUxcNb");
        setBooleanField(term4921, term4921.getClass(), "bold", false);
        setBooleanField(term4921, term4921.getClass(), "italic", false);
        setBooleanField(term4921, term4921.getClass(), "underlined", true);
        setBooleanField(term4921, term4921.getClass(), "striketrough", true);
        setBooleanField(term4921, term4921.getClass(), "obfuscated", false);
        setField(term4921, term4921.getClass(), "color", "NxgmYPzWCI");
        setField(term4964, term4964.getClass(), "action", "SqjyKmayBx");
        setField(term4964, term4964.getClass(), "value", "XjDhvToxJy");
        setField(term4921, term4921.getClass(), "clickEvent", term4964);
        setField(term4989, term4989.getClass(), "action", "nxSTJflLQy");
        setField(term4989, term4989.getClass(), "contents", term5002);
        setField(term4921, term4921.getClass(), "hoverEvent", term4989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4921, args);
    }

};


