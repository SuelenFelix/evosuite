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

public class TellRawCommand_toTextContent_144770152211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7053;

    public TellRawCommand_toTextContent_144770152211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7053 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term7083 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term7108 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term7121 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 7);
        Object term7122 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7130 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7138 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7146 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7154 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7162 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7170 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term7178 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7053, term7053.getClass(), "text", "mRBtFTxVdE");
        setBooleanField(term7053, term7053.getClass(), "bold", false);
        setBooleanField(term7053, term7053.getClass(), "italic", true);
        setBooleanField(term7053, term7053.getClass(), "underlined", true);
        setBooleanField(term7053, term7053.getClass(), "striketrough", true);
        setBooleanField(term7053, term7053.getClass(), "obfuscated", false);
        setField(term7053, term7053.getClass(), "color", "IVacFDAZcj");
        setField(term7083, term7083.getClass(), "action", "EEYmuwyVDP");
        setField(term7083, term7083.getClass(), "value", "EWFbEDAVrE");
        setField(term7053, term7053.getClass(), "clickEvent", term7083);
        setField(term7108, term7108.getClass(), "action", "EMiMtYgfvr");
        setField(term7122, term7122.getClass(), "text", "");
        setBooleanField(term7122, term7122.getClass(), "bold", false);
        setBooleanField(term7122, term7122.getClass(), "italic", true);
        setBooleanField(term7122, term7122.getClass(), "underlined", false);
        setBooleanField(term7122, term7122.getClass(), "striketrough", true);
        setBooleanField(term7122, term7122.getClass(), "obfuscated", false);
        setField(term7122, term7122.getClass(), "color", "");
        setElement(term7121, 0, term7122);
        setField(term7130, term7130.getClass(), "text", "");
        setBooleanField(term7130, term7130.getClass(), "bold", false);
        setBooleanField(term7130, term7130.getClass(), "italic", false);
        setBooleanField(term7130, term7130.getClass(), "underlined", false);
        setBooleanField(term7130, term7130.getClass(), "striketrough", true);
        setBooleanField(term7130, term7130.getClass(), "obfuscated", true);
        setField(term7130, term7130.getClass(), "color", "");
        setElement(term7121, 1, term7130);
        setField(term7138, term7138.getClass(), "text", "");
        setBooleanField(term7138, term7138.getClass(), "bold", false);
        setBooleanField(term7138, term7138.getClass(), "italic", false);
        setBooleanField(term7138, term7138.getClass(), "underlined", true);
        setBooleanField(term7138, term7138.getClass(), "striketrough", false);
        setBooleanField(term7138, term7138.getClass(), "obfuscated", true);
        setField(term7138, term7138.getClass(), "color", "");
        setElement(term7121, 2, term7138);
        setField(term7146, term7146.getClass(), "text", "");
        setBooleanField(term7146, term7146.getClass(), "bold", false);
        setBooleanField(term7146, term7146.getClass(), "italic", true);
        setBooleanField(term7146, term7146.getClass(), "underlined", true);
        setBooleanField(term7146, term7146.getClass(), "striketrough", true);
        setBooleanField(term7146, term7146.getClass(), "obfuscated", false);
        setField(term7146, term7146.getClass(), "color", "");
        setElement(term7121, 3, term7146);
        setField(term7154, term7154.getClass(), "text", "");
        setBooleanField(term7154, term7154.getClass(), "bold", false);
        setBooleanField(term7154, term7154.getClass(), "italic", false);
        setBooleanField(term7154, term7154.getClass(), "underlined", true);
        setBooleanField(term7154, term7154.getClass(), "striketrough", false);
        setBooleanField(term7154, term7154.getClass(), "obfuscated", false);
        setField(term7154, term7154.getClass(), "color", "");
        setElement(term7121, 4, term7154);
        setField(term7162, term7162.getClass(), "text", "");
        setBooleanField(term7162, term7162.getClass(), "bold", false);
        setBooleanField(term7162, term7162.getClass(), "italic", false);
        setBooleanField(term7162, term7162.getClass(), "underlined", true);
        setBooleanField(term7162, term7162.getClass(), "striketrough", true);
        setBooleanField(term7162, term7162.getClass(), "obfuscated", true);
        setField(term7162, term7162.getClass(), "color", "");
        setElement(term7121, 5, term7162);
        setField(term7170, term7170.getClass(), "text", "");
        setBooleanField(term7170, term7170.getClass(), "bold", false);
        setBooleanField(term7170, term7170.getClass(), "italic", true);
        setBooleanField(term7170, term7170.getClass(), "underlined", true);
        setBooleanField(term7170, term7170.getClass(), "striketrough", false);
        setBooleanField(term7170, term7170.getClass(), "obfuscated", true);
        setField(term7170, term7170.getClass(), "color", "");
        setElement(term7121, 6, term7170);
        setField(term7108, term7108.getClass(), "contents", term7121);
        setField(term7053, term7053.getClass(), "hoverEvent", term7108);
        setField(term7178, term7178.getClass(), "targetString", "CVZnTiJucs");
        setField(term7053, term7053.getClass(), "target", term7178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toTextContent", argTypes, term7053, args);
    }

};


