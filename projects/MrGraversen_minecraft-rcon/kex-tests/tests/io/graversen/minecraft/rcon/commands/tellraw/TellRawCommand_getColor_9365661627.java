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

public class TellRawCommand_getColor_9365661627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6365;

    public TellRawCommand_getColor_9365661627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6365 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6395 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6420 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6433 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term6434 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6442 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6365, term6365.getClass(), "text", "uzmqjnOUXu");
        setBooleanField(term6365, term6365.getClass(), "bold", false);
        setBooleanField(term6365, term6365.getClass(), "italic", false);
        setBooleanField(term6365, term6365.getClass(), "underlined", false);
        setBooleanField(term6365, term6365.getClass(), "striketrough", false);
        setBooleanField(term6365, term6365.getClass(), "obfuscated", false);
        setField(term6365, term6365.getClass(), "color", "xeyjTOCOJb");
        setField(term6395, term6395.getClass(), "action", "DGRqjjdhzy");
        setField(term6395, term6395.getClass(), "value", "lQFkjJUPAR");
        setField(term6365, term6365.getClass(), "clickEvent", term6395);
        setField(term6420, term6420.getClass(), "action", "BsuVlGUUjV");
        setField(term6434, term6434.getClass(), "text", "");
        setBooleanField(term6434, term6434.getClass(), "bold", false);
        setBooleanField(term6434, term6434.getClass(), "italic", true);
        setBooleanField(term6434, term6434.getClass(), "underlined", true);
        setBooleanField(term6434, term6434.getClass(), "striketrough", false);
        setBooleanField(term6434, term6434.getClass(), "obfuscated", true);
        setField(term6434, term6434.getClass(), "color", "");
        setElement(term6433, 0, term6434);
        setField(term6420, term6420.getClass(), "contents", term6433);
        setField(term6365, term6365.getClass(), "hoverEvent", term6420);
        setField(term6442, term6442.getClass(), "targetString", "PbLgCSAHce");
        setField(term6365, term6365.getClass(), "target", term6442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term6365, args);
    }

};


