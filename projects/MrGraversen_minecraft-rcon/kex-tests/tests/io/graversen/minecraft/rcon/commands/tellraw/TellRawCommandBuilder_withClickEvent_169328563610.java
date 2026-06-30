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
import java.lang.String;

public class TellRawCommandBuilder_withClickEvent_169328563610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3880;
     Object enum2;

    public TellRawCommandBuilder_withClickEvent_169328563610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3880 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3881 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3923 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3948 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3961 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term3962 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3881, term3881.getClass(), "targetString", "dkZFDZxcde");
        setField(term3880, term3880.getClass(), "target", term3881);
        setField(term3880, term3880.getClass(), "text", "WXcZEtUKlI");
        setBooleanField(term3880, term3880.getClass(), "bold", true);
        setBooleanField(term3880, term3880.getClass(), "italic", true);
        setBooleanField(term3880, term3880.getClass(), "underlined", false);
        setBooleanField(term3880, term3880.getClass(), "striketrough", true);
        setBooleanField(term3880, term3880.getClass(), "obfuscated", true);
        setField(term3880, term3880.getClass(), "color", "IkpjUOuWQU");
        setField(term3923, term3923.getClass(), "action", "boSSpezHeU");
        setField(term3923, term3923.getClass(), "value", "OUeBWNTQDh");
        setField(term3880, term3880.getClass(), "clickEvent", term3923);
        setField(term3948, term3948.getClass(), "action", "gltJarNuUk");
        setField(term3962, term3962.getClass(), "text", "");
        setBooleanField(term3962, term3962.getClass(), "bold", false);
        setBooleanField(term3962, term3962.getClass(), "italic", false);
        setBooleanField(term3962, term3962.getClass(), "underlined", true);
        setBooleanField(term3962, term3962.getClass(), "striketrough", false);
        setBooleanField(term3962, term3962.getClass(), "obfuscated", true);
        setField(term3962, term3962.getClass(), "color", "");
        setElement(term3961, 0, term3962);
        setField(term3948, term3948.getClass(), "contents", term3961);
        setField(term3880, term3880.getClass(), "hoverEvent", term3948);
        Class<? extends Object> term4132 = Class.forName((String) "io.graversen.minecraft.rcon.util.ClickEventActions");
        Field term4131 = ((Class) term4132).getDeclaredField((String) "RUN_COMMAND");
        ((Field) term4131).setAccessible(true);
        enum2 = ((Field) term4131).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.ClickEventActions");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = enum2;
        args[1] = "oKwCDqywym";
        callMethod(klass, "withClickEvent", argTypes, term3880, args);
    }

};


