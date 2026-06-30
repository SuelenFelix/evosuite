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

public class HoverEvent_getAction_14801001210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;

    public HoverEvent_getAction_14801001210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1052 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term1065 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term1066 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term1052, term1052.getClass(), "action", "HBGNxdNURv");
        setField(term1066, term1066.getClass(), "text", "mfCpTPPQQm");
        setBooleanField(term1066, term1066.getClass(), "bold", false);
        setBooleanField(term1066, term1066.getClass(), "italic", true);
        setBooleanField(term1066, term1066.getClass(), "underlined", true);
        setBooleanField(term1066, term1066.getClass(), "striketrough", true);
        setBooleanField(term1066, term1066.getClass(), "obfuscated", false);
        setField(term1066, term1066.getClass(), "color", "OcJCIDNIXA");
        setElement(term1065, 0, term1066);
        setField(term1052, term1052.getClass(), "contents", term1065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term1052, args);
    }

};


