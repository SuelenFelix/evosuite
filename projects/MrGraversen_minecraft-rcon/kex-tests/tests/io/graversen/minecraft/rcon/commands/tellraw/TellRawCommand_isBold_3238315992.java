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

public class TellRawCommand_isBold_3238315992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5519;

    public TellRawCommand_isBold_3238315992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5519 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term5549 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term5574 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5587 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 4);
        Object term5588 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5596 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5604 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5612 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5620 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term5519, term5519.getClass(), "text", "bxyfeicqrK");
        setBooleanField(term5519, term5519.getClass(), "bold", true);
        setBooleanField(term5519, term5519.getClass(), "italic", true);
        setBooleanField(term5519, term5519.getClass(), "underlined", true);
        setBooleanField(term5519, term5519.getClass(), "striketrough", false);
        setBooleanField(term5519, term5519.getClass(), "obfuscated", true);
        setField(term5519, term5519.getClass(), "color", "vBnWPlsZMk");
        setField(term5549, term5549.getClass(), "action", "fIZsWucfXz");
        setField(term5549, term5549.getClass(), "value", "IApvtmfhnq");
        setField(term5519, term5519.getClass(), "clickEvent", term5549);
        setField(term5574, term5574.getClass(), "action", "VSaNnhMpRc");
        setField(term5588, term5588.getClass(), "text", "");
        setBooleanField(term5588, term5588.getClass(), "bold", false);
        setBooleanField(term5588, term5588.getClass(), "italic", true);
        setBooleanField(term5588, term5588.getClass(), "underlined", false);
        setBooleanField(term5588, term5588.getClass(), "striketrough", true);
        setBooleanField(term5588, term5588.getClass(), "obfuscated", true);
        setField(term5588, term5588.getClass(), "color", "");
        setElement(term5587, 0, term5588);
        setField(term5596, term5596.getClass(), "text", "");
        setBooleanField(term5596, term5596.getClass(), "bold", true);
        setBooleanField(term5596, term5596.getClass(), "italic", false);
        setBooleanField(term5596, term5596.getClass(), "underlined", true);
        setBooleanField(term5596, term5596.getClass(), "striketrough", false);
        setBooleanField(term5596, term5596.getClass(), "obfuscated", false);
        setField(term5596, term5596.getClass(), "color", "");
        setElement(term5587, 1, term5596);
        setField(term5604, term5604.getClass(), "text", "");
        setBooleanField(term5604, term5604.getClass(), "bold", false);
        setBooleanField(term5604, term5604.getClass(), "italic", true);
        setBooleanField(term5604, term5604.getClass(), "underlined", true);
        setBooleanField(term5604, term5604.getClass(), "striketrough", false);
        setBooleanField(term5604, term5604.getClass(), "obfuscated", true);
        setField(term5604, term5604.getClass(), "color", "");
        setElement(term5587, 2, term5604);
        setField(term5612, term5612.getClass(), "text", "");
        setBooleanField(term5612, term5612.getClass(), "bold", false);
        setBooleanField(term5612, term5612.getClass(), "italic", true);
        setBooleanField(term5612, term5612.getClass(), "underlined", false);
        setBooleanField(term5612, term5612.getClass(), "striketrough", false);
        setBooleanField(term5612, term5612.getClass(), "obfuscated", false);
        setField(term5612, term5612.getClass(), "color", "");
        setElement(term5587, 3, term5612);
        setField(term5574, term5574.getClass(), "contents", term5587);
        setField(term5519, term5519.getClass(), "hoverEvent", term5574);
        setField(term5620, term5620.getClass(), "targetString", "fKhrQsJToZ");
        setField(term5519, term5519.getClass(), "target", term5620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBold", argTypes, term5519, args);
    }

};


