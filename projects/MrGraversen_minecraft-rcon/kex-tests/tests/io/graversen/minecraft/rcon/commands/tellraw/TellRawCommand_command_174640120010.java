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

public class TellRawCommand_command_174640120010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6855;

    public TellRawCommand_command_174640120010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6855 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6885 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6910 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6923 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 7);
        Object term6924 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6932 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6940 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6948 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6956 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6964 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6972 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6980 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6855, term6855.getClass(), "text", "ZrchvNGMtd");
        setBooleanField(term6855, term6855.getClass(), "bold", true);
        setBooleanField(term6855, term6855.getClass(), "italic", false);
        setBooleanField(term6855, term6855.getClass(), "underlined", false);
        setBooleanField(term6855, term6855.getClass(), "striketrough", false);
        setBooleanField(term6855, term6855.getClass(), "obfuscated", false);
        setField(term6855, term6855.getClass(), "color", "WaEcyVlcIx");
        setField(term6885, term6885.getClass(), "action", "ONcbPCQnHd");
        setField(term6885, term6885.getClass(), "value", "AobDaplFLl");
        setField(term6855, term6855.getClass(), "clickEvent", term6885);
        setField(term6910, term6910.getClass(), "action", "pDkMNnAGgv");
        setField(term6924, term6924.getClass(), "text", "");
        setBooleanField(term6924, term6924.getClass(), "bold", true);
        setBooleanField(term6924, term6924.getClass(), "italic", true);
        setBooleanField(term6924, term6924.getClass(), "underlined", false);
        setBooleanField(term6924, term6924.getClass(), "striketrough", true);
        setBooleanField(term6924, term6924.getClass(), "obfuscated", false);
        setField(term6924, term6924.getClass(), "color", "");
        setElement(term6923, 0, term6924);
        setField(term6932, term6932.getClass(), "text", "");
        setBooleanField(term6932, term6932.getClass(), "bold", false);
        setBooleanField(term6932, term6932.getClass(), "italic", false);
        setBooleanField(term6932, term6932.getClass(), "underlined", false);
        setBooleanField(term6932, term6932.getClass(), "striketrough", true);
        setBooleanField(term6932, term6932.getClass(), "obfuscated", true);
        setField(term6932, term6932.getClass(), "color", "");
        setElement(term6923, 1, term6932);
        setField(term6940, term6940.getClass(), "text", "");
        setBooleanField(term6940, term6940.getClass(), "bold", false);
        setBooleanField(term6940, term6940.getClass(), "italic", true);
        setBooleanField(term6940, term6940.getClass(), "underlined", false);
        setBooleanField(term6940, term6940.getClass(), "striketrough", true);
        setBooleanField(term6940, term6940.getClass(), "obfuscated", true);
        setField(term6940, term6940.getClass(), "color", "");
        setElement(term6923, 2, term6940);
        setField(term6948, term6948.getClass(), "text", "");
        setBooleanField(term6948, term6948.getClass(), "bold", false);
        setBooleanField(term6948, term6948.getClass(), "italic", false);
        setBooleanField(term6948, term6948.getClass(), "underlined", true);
        setBooleanField(term6948, term6948.getClass(), "striketrough", false);
        setBooleanField(term6948, term6948.getClass(), "obfuscated", true);
        setField(term6948, term6948.getClass(), "color", "");
        setElement(term6923, 3, term6948);
        setField(term6956, term6956.getClass(), "text", "");
        setBooleanField(term6956, term6956.getClass(), "bold", true);
        setBooleanField(term6956, term6956.getClass(), "italic", true);
        setBooleanField(term6956, term6956.getClass(), "underlined", true);
        setBooleanField(term6956, term6956.getClass(), "striketrough", true);
        setBooleanField(term6956, term6956.getClass(), "obfuscated", true);
        setField(term6956, term6956.getClass(), "color", "");
        setElement(term6923, 4, term6956);
        setField(term6964, term6964.getClass(), "text", "");
        setBooleanField(term6964, term6964.getClass(), "bold", true);
        setBooleanField(term6964, term6964.getClass(), "italic", true);
        setBooleanField(term6964, term6964.getClass(), "underlined", false);
        setBooleanField(term6964, term6964.getClass(), "striketrough", false);
        setBooleanField(term6964, term6964.getClass(), "obfuscated", false);
        setField(term6964, term6964.getClass(), "color", "");
        setElement(term6923, 5, term6964);
        setField(term6972, term6972.getClass(), "text", "");
        setBooleanField(term6972, term6972.getClass(), "bold", true);
        setBooleanField(term6972, term6972.getClass(), "italic", true);
        setBooleanField(term6972, term6972.getClass(), "underlined", true);
        setBooleanField(term6972, term6972.getClass(), "striketrough", true);
        setBooleanField(term6972, term6972.getClass(), "obfuscated", false);
        setField(term6972, term6972.getClass(), "color", "");
        setElement(term6923, 6, term6972);
        setField(term6910, term6910.getClass(), "contents", term6923);
        setField(term6855, term6855.getClass(), "hoverEvent", term6910);
        setField(term6980, term6980.getClass(), "targetString", "jlraKkBWFA");
        setField(term6855, term6855.getClass(), "target", term6980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term6855, args);
    }

};


