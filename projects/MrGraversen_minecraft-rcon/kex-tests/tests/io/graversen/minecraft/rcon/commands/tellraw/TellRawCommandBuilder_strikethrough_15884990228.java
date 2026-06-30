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

public class TellRawCommandBuilder_strikethrough_15884990228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3564;

    public TellRawCommandBuilder_strikethrough_15884990228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3564 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term3565 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term3607 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term3632 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term3645 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 2);
        Object term3646 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term3654 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term3565, term3565.getClass(), "targetString", "FbSIUZyBXZ");
        setField(term3564, term3564.getClass(), "target", term3565);
        setField(term3564, term3564.getClass(), "text", "mhQDwIyrRi");
        setBooleanField(term3564, term3564.getClass(), "bold", true);
        setBooleanField(term3564, term3564.getClass(), "italic", true);
        setBooleanField(term3564, term3564.getClass(), "underlined", true);
        setBooleanField(term3564, term3564.getClass(), "striketrough", true);
        setBooleanField(term3564, term3564.getClass(), "obfuscated", true);
        setField(term3564, term3564.getClass(), "color", "HpZXWDPhlg");
        setField(term3607, term3607.getClass(), "action", "lBOokzEPfe");
        setField(term3607, term3607.getClass(), "value", "dtGZCsKXbW");
        setField(term3564, term3564.getClass(), "clickEvent", term3607);
        setField(term3632, term3632.getClass(), "action", "bdyhHbDAmJ");
        setField(term3646, term3646.getClass(), "text", "");
        setBooleanField(term3646, term3646.getClass(), "bold", true);
        setBooleanField(term3646, term3646.getClass(), "italic", true);
        setBooleanField(term3646, term3646.getClass(), "underlined", false);
        setBooleanField(term3646, term3646.getClass(), "striketrough", true);
        setBooleanField(term3646, term3646.getClass(), "obfuscated", false);
        setField(term3646, term3646.getClass(), "color", "");
        setElement(term3645, 0, term3646);
        setField(term3654, term3654.getClass(), "text", "");
        setBooleanField(term3654, term3654.getClass(), "bold", true);
        setBooleanField(term3654, term3654.getClass(), "italic", true);
        setBooleanField(term3654, term3654.getClass(), "underlined", true);
        setBooleanField(term3654, term3654.getClass(), "striketrough", false);
        setBooleanField(term3654, term3654.getClass(), "obfuscated", true);
        setField(term3654, term3654.getClass(), "color", "");
        setElement(term3645, 1, term3654);
        setField(term3632, term3632.getClass(), "contents", term3645);
        setField(term3564, term3564.getClass(), "hoverEvent", term3632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "strikethrough", argTypes, term3564, args);
    }

};


