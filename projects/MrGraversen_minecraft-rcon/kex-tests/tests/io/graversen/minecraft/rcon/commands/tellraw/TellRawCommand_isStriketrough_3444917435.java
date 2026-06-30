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

public class TellRawCommand_isStriketrough_3444917435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6009;

    public TellRawCommand_isStriketrough_3444917435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6009 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6039 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6064 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6077 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 7);
        Object term6078 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6086 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6094 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6102 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6110 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6118 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6126 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6134 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6009, term6009.getClass(), "text", "BXTjEyEZxD");
        setBooleanField(term6009, term6009.getClass(), "bold", true);
        setBooleanField(term6009, term6009.getClass(), "italic", true);
        setBooleanField(term6009, term6009.getClass(), "underlined", true);
        setBooleanField(term6009, term6009.getClass(), "striketrough", false);
        setBooleanField(term6009, term6009.getClass(), "obfuscated", false);
        setField(term6009, term6009.getClass(), "color", "oKhVzOKUFW");
        setField(term6039, term6039.getClass(), "action", "mNHyqmOAFy");
        setField(term6039, term6039.getClass(), "value", "UxgSdhxPCH");
        setField(term6009, term6009.getClass(), "clickEvent", term6039);
        setField(term6064, term6064.getClass(), "action", "DAujxZPHJC");
        setField(term6078, term6078.getClass(), "text", "");
        setBooleanField(term6078, term6078.getClass(), "bold", false);
        setBooleanField(term6078, term6078.getClass(), "italic", false);
        setBooleanField(term6078, term6078.getClass(), "underlined", true);
        setBooleanField(term6078, term6078.getClass(), "striketrough", false);
        setBooleanField(term6078, term6078.getClass(), "obfuscated", false);
        setField(term6078, term6078.getClass(), "color", "");
        setElement(term6077, 0, term6078);
        setField(term6086, term6086.getClass(), "text", "");
        setBooleanField(term6086, term6086.getClass(), "bold", true);
        setBooleanField(term6086, term6086.getClass(), "italic", true);
        setBooleanField(term6086, term6086.getClass(), "underlined", false);
        setBooleanField(term6086, term6086.getClass(), "striketrough", true);
        setBooleanField(term6086, term6086.getClass(), "obfuscated", true);
        setField(term6086, term6086.getClass(), "color", "");
        setElement(term6077, 1, term6086);
        setField(term6094, term6094.getClass(), "text", "");
        setBooleanField(term6094, term6094.getClass(), "bold", false);
        setBooleanField(term6094, term6094.getClass(), "italic", true);
        setBooleanField(term6094, term6094.getClass(), "underlined", false);
        setBooleanField(term6094, term6094.getClass(), "striketrough", true);
        setBooleanField(term6094, term6094.getClass(), "obfuscated", true);
        setField(term6094, term6094.getClass(), "color", "");
        setElement(term6077, 2, term6094);
        setField(term6102, term6102.getClass(), "text", "");
        setBooleanField(term6102, term6102.getClass(), "bold", false);
        setBooleanField(term6102, term6102.getClass(), "italic", false);
        setBooleanField(term6102, term6102.getClass(), "underlined", true);
        setBooleanField(term6102, term6102.getClass(), "striketrough", false);
        setBooleanField(term6102, term6102.getClass(), "obfuscated", false);
        setField(term6102, term6102.getClass(), "color", "");
        setElement(term6077, 3, term6102);
        setField(term6110, term6110.getClass(), "text", "");
        setBooleanField(term6110, term6110.getClass(), "bold", true);
        setBooleanField(term6110, term6110.getClass(), "italic", false);
        setBooleanField(term6110, term6110.getClass(), "underlined", true);
        setBooleanField(term6110, term6110.getClass(), "striketrough", true);
        setBooleanField(term6110, term6110.getClass(), "obfuscated", false);
        setField(term6110, term6110.getClass(), "color", "");
        setElement(term6077, 4, term6110);
        setField(term6118, term6118.getClass(), "text", "");
        setBooleanField(term6118, term6118.getClass(), "bold", true);
        setBooleanField(term6118, term6118.getClass(), "italic", false);
        setBooleanField(term6118, term6118.getClass(), "underlined", false);
        setBooleanField(term6118, term6118.getClass(), "striketrough", false);
        setBooleanField(term6118, term6118.getClass(), "obfuscated", true);
        setField(term6118, term6118.getClass(), "color", "");
        setElement(term6077, 5, term6118);
        setField(term6126, term6126.getClass(), "text", "");
        setBooleanField(term6126, term6126.getClass(), "bold", true);
        setBooleanField(term6126, term6126.getClass(), "italic", false);
        setBooleanField(term6126, term6126.getClass(), "underlined", true);
        setBooleanField(term6126, term6126.getClass(), "striketrough", false);
        setBooleanField(term6126, term6126.getClass(), "obfuscated", false);
        setField(term6126, term6126.getClass(), "color", "");
        setElement(term6077, 6, term6126);
        setField(term6064, term6064.getClass(), "contents", term6077);
        setField(term6009, term6009.getClass(), "hoverEvent", term6064);
        setField(term6134, term6134.getClass(), "targetString", "ZUdnQXfzCI");
        setField(term6009, term6009.getClass(), "target", term6134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStriketrough", argTypes, term6009, args);
    }

};


