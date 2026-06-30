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

public class TellRawCommandBuilder_validate_119072984912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;

    public TellRawCommandBuilder_validate_119072984912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term4780 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term4822 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term4847 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term4860 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 0);
        setField(term4780, term4780.getClass(), "targetString", "tIpkeYIezR");
        setField(term4779, term4779.getClass(), "target", term4780);
        setField(term4779, term4779.getClass(), "text", "YkZtEtthvz");
        setBooleanField(term4779, term4779.getClass(), "bold", false);
        setBooleanField(term4779, term4779.getClass(), "italic", true);
        setBooleanField(term4779, term4779.getClass(), "underlined", false);
        setBooleanField(term4779, term4779.getClass(), "striketrough", false);
        setBooleanField(term4779, term4779.getClass(), "obfuscated", true);
        setField(term4779, term4779.getClass(), "color", "dwlZSxlXOo");
        setField(term4822, term4822.getClass(), "action", "lKrEAkypza");
        setField(term4822, term4822.getClass(), "value", "KtuuNAqGCQ");
        setField(term4779, term4779.getClass(), "clickEvent", term4822);
        setField(term4847, term4847.getClass(), "action", "OGQsfjmReM");
        setField(term4847, term4847.getClass(), "contents", term4860);
        setField(term4779, term4779.getClass(), "hoverEvent", term4847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term4779, args);
    }

};


