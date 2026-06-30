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

public class TellRawCommandBuilder_underlined_2283262177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3366;

    public TellRawCommandBuilder_underlined_2283262177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3366 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3367 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3409 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3434 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3447 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 7);
        Object term3448 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3456 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3464 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3472 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3480 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3488 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3496 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3367, term3367.getClass(), "targetString", "zsWKWiTFuo");
        setField(term3366, term3366.getClass(), "target", term3367);
        setField(term3366, term3366.getClass(), "text", "UPUbwyHQKN");
        setBooleanField(term3366, term3366.getClass(), "bold", true);
        setBooleanField(term3366, term3366.getClass(), "italic", true);
        setBooleanField(term3366, term3366.getClass(), "underlined", true);
        setBooleanField(term3366, term3366.getClass(), "striketrough", false);
        setBooleanField(term3366, term3366.getClass(), "obfuscated", false);
        setField(term3366, term3366.getClass(), "color", "lgQkrXANyI");
        setField(term3409, term3409.getClass(), "action", "MeTmRZXErV");
        setField(term3409, term3409.getClass(), "value", "jNxbVmoZgq");
        setField(term3366, term3366.getClass(), "clickEvent", term3409);
        setField(term3434, term3434.getClass(), "action", "PvmBHIXaMY");
        setField(term3448, term3448.getClass(), "text", "");
        setBooleanField(term3448, term3448.getClass(), "bold", false);
        setBooleanField(term3448, term3448.getClass(), "italic", true);
        setBooleanField(term3448, term3448.getClass(), "underlined", false);
        setBooleanField(term3448, term3448.getClass(), "striketrough", true);
        setBooleanField(term3448, term3448.getClass(), "obfuscated", false);
        setField(term3448, term3448.getClass(), "color", "");
        setElement(term3447, 0, term3448);
        setField(term3456, term3456.getClass(), "text", "");
        setBooleanField(term3456, term3456.getClass(), "bold", true);
        setBooleanField(term3456, term3456.getClass(), "italic", true);
        setBooleanField(term3456, term3456.getClass(), "underlined", false);
        setBooleanField(term3456, term3456.getClass(), "striketrough", true);
        setBooleanField(term3456, term3456.getClass(), "obfuscated", false);
        setField(term3456, term3456.getClass(), "color", "");
        setElement(term3447, 1, term3456);
        setField(term3464, term3464.getClass(), "text", "");
        setBooleanField(term3464, term3464.getClass(), "bold", true);
        setBooleanField(term3464, term3464.getClass(), "italic", false);
        setBooleanField(term3464, term3464.getClass(), "underlined", false);
        setBooleanField(term3464, term3464.getClass(), "striketrough", true);
        setBooleanField(term3464, term3464.getClass(), "obfuscated", false);
        setField(term3464, term3464.getClass(), "color", "");
        setElement(term3447, 2, term3464);
        setField(term3472, term3472.getClass(), "text", "");
        setBooleanField(term3472, term3472.getClass(), "bold", false);
        setBooleanField(term3472, term3472.getClass(), "italic", false);
        setBooleanField(term3472, term3472.getClass(), "underlined", false);
        setBooleanField(term3472, term3472.getClass(), "striketrough", false);
        setBooleanField(term3472, term3472.getClass(), "obfuscated", true);
        setField(term3472, term3472.getClass(), "color", "");
        setElement(term3447, 3, term3472);
        setField(term3480, term3480.getClass(), "text", "");
        setBooleanField(term3480, term3480.getClass(), "bold", false);
        setBooleanField(term3480, term3480.getClass(), "italic", true);
        setBooleanField(term3480, term3480.getClass(), "underlined", false);
        setBooleanField(term3480, term3480.getClass(), "striketrough", true);
        setBooleanField(term3480, term3480.getClass(), "obfuscated", true);
        setField(term3480, term3480.getClass(), "color", "");
        setElement(term3447, 4, term3480);
        setField(term3488, term3488.getClass(), "text", "");
        setBooleanField(term3488, term3488.getClass(), "bold", false);
        setBooleanField(term3488, term3488.getClass(), "italic", false);
        setBooleanField(term3488, term3488.getClass(), "underlined", false);
        setBooleanField(term3488, term3488.getClass(), "striketrough", false);
        setBooleanField(term3488, term3488.getClass(), "obfuscated", false);
        setField(term3488, term3488.getClass(), "color", "");
        setElement(term3447, 5, term3488);
        setField(term3496, term3496.getClass(), "text", "");
        setBooleanField(term3496, term3496.getClass(), "bold", false);
        setBooleanField(term3496, term3496.getClass(), "italic", false);
        setBooleanField(term3496, term3496.getClass(), "underlined", true);
        setBooleanField(term3496, term3496.getClass(), "striketrough", true);
        setBooleanField(term3496, term3496.getClass(), "obfuscated", true);
        setField(term3496, term3496.getClass(), "color", "");
        setElement(term3447, 6, term3496);
        setField(term3434, term3434.getClass(), "contents", term3447);
        setField(term3366, term3366.getClass(), "hoverEvent", term3434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "underlined", argTypes, term3366, args);
    }

};


