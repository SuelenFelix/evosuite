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

public class TellRawCommandBuilder_withClickEvent_169328563624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5117;

    public TellRawCommandBuilder_withClickEvent_169328563624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5117 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        setField(term5117, term5117.getClass(), "target", null);
        setField(term5117, term5117.getClass(), "text", null);
        setBooleanField(term5117, term5117.getClass(), "bold", false);
        setBooleanField(term5117, term5117.getClass(), "italic", false);
        setBooleanField(term5117, term5117.getClass(), "underlined", false);
        setBooleanField(term5117, term5117.getClass(), "striketrough", false);
        setBooleanField(term5117, term5117.getClass(), "obfuscated", false);
        setField(term5117, term5117.getClass(), "color", null);
        setField(term5117, term5117.getClass(), "clickEvent", null);
        setField(term5117, term5117.getClass(), "hoverEvent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.ClickEventActions");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "withClickEvent", argTypes, term5117, args);
    }

};


