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
import java.util.ArrayList;
import java.lang.Object;

public class TellRawCompositeCommand_command_8705789452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;

    public TellRawCompositeCommand_command_8705789452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term229 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term237 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term238 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term239 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term229, term229.getClass(), "text", "");
        setBooleanField(term229, term229.getClass(), "bold", true);
        setBooleanField(term229, term229.getClass(), "italic", false);
        setBooleanField(term229, term229.getClass(), "underlined", false);
        setBooleanField(term229, term229.getClass(), "striketrough", true);
        setBooleanField(term229, term229.getClass(), "obfuscated", false);
        setField(term229, term229.getClass(), "color", "");
        setField(term237, term237.getClass(), "action", null);
        setField(term237, term237.getClass(), "value", null);
        setField(term229, term229.getClass(), "clickEvent", term237);
        setField(term238, term238.getClass(), "action", null);
        setField(term238, term238.getClass(), "contents", null);
        setField(term229, term229.getClass(), "hoverEvent", term238);
        setField(term239, term239.getClass(), "targetString", null);
        setField(term229, term229.getClass(), "target", term239);
        Object term240 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term248 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term249 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term250 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term240, term240.getClass(), "text", "");
        setBooleanField(term240, term240.getClass(), "bold", false);
        setBooleanField(term240, term240.getClass(), "italic", false);
        setBooleanField(term240, term240.getClass(), "underlined", true);
        setBooleanField(term240, term240.getClass(), "striketrough", true);
        setBooleanField(term240, term240.getClass(), "obfuscated", true);
        setField(term240, term240.getClass(), "color", "");
        setField(term248, term248.getClass(), "action", null);
        setField(term248, term248.getClass(), "value", null);
        setField(term240, term240.getClass(), "clickEvent", term248);
        setField(term249, term249.getClass(), "action", null);
        setField(term249, term249.getClass(), "contents", null);
        setField(term240, term240.getClass(), "hoverEvent", term249);
        setField(term250, term250.getClass(), "targetString", null);
        setField(term240, term240.getClass(), "target", term250);
        Object term251 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term259 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term260 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term261 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term251, term251.getClass(), "text", "");
        setBooleanField(term251, term251.getClass(), "bold", false);
        setBooleanField(term251, term251.getClass(), "italic", false);
        setBooleanField(term251, term251.getClass(), "underlined", false);
        setBooleanField(term251, term251.getClass(), "striketrough", false);
        setBooleanField(term251, term251.getClass(), "obfuscated", true);
        setField(term251, term251.getClass(), "color", "");
        setField(term259, term259.getClass(), "action", null);
        setField(term259, term259.getClass(), "value", null);
        setField(term251, term251.getClass(), "clickEvent", term259);
        setField(term260, term260.getClass(), "action", null);
        setField(term260, term260.getClass(), "contents", null);
        setField(term251, term251.getClass(), "hoverEvent", term260);
        setField(term261, term261.getClass(), "targetString", null);
        setField(term251, term251.getClass(), "target", term261);
        Object term262 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term270 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term271 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term272 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term262, term262.getClass(), "text", "");
        setBooleanField(term262, term262.getClass(), "bold", false);
        setBooleanField(term262, term262.getClass(), "italic", false);
        setBooleanField(term262, term262.getClass(), "underlined", false);
        setBooleanField(term262, term262.getClass(), "striketrough", false);
        setBooleanField(term262, term262.getClass(), "obfuscated", false);
        setField(term262, term262.getClass(), "color", "");
        setField(term270, term270.getClass(), "action", null);
        setField(term270, term270.getClass(), "value", null);
        setField(term262, term262.getClass(), "clickEvent", term270);
        setField(term271, term271.getClass(), "action", null);
        setField(term271, term271.getClass(), "contents", null);
        setField(term262, term262.getClass(), "hoverEvent", term271);
        setField(term272, term272.getClass(), "targetString", null);
        setField(term262, term262.getClass(), "target", term272);
        Object term273 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term281 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term282 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term283 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term273, term273.getClass(), "text", "");
        setBooleanField(term273, term273.getClass(), "bold", true);
        setBooleanField(term273, term273.getClass(), "italic", true);
        setBooleanField(term273, term273.getClass(), "underlined", false);
        setBooleanField(term273, term273.getClass(), "striketrough", true);
        setBooleanField(term273, term273.getClass(), "obfuscated", true);
        setField(term273, term273.getClass(), "color", "");
        setField(term281, term281.getClass(), "action", null);
        setField(term281, term281.getClass(), "value", null);
        setField(term273, term273.getClass(), "clickEvent", term281);
        setField(term282, term282.getClass(), "action", null);
        setField(term282, term282.getClass(), "contents", null);
        setField(term273, term273.getClass(), "hoverEvent", term282);
        setField(term283, term283.getClass(), "targetString", null);
        setField(term273, term273.getClass(), "target", term283);
        Object term284 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term292 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term293 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term294 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term284, term284.getClass(), "text", "");
        setBooleanField(term284, term284.getClass(), "bold", true);
        setBooleanField(term284, term284.getClass(), "italic", true);
        setBooleanField(term284, term284.getClass(), "underlined", true);
        setBooleanField(term284, term284.getClass(), "striketrough", true);
        setBooleanField(term284, term284.getClass(), "obfuscated", true);
        setField(term284, term284.getClass(), "color", "");
        setField(term292, term292.getClass(), "action", null);
        setField(term292, term292.getClass(), "value", null);
        setField(term284, term284.getClass(), "clickEvent", term292);
        setField(term293, term293.getClass(), "action", null);
        setField(term293, term293.getClass(), "contents", null);
        setField(term284, term284.getClass(), "hoverEvent", term293);
        setField(term294, term294.getClass(), "targetString", null);
        setField(term284, term284.getClass(), "target", term294);
        Object term295 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term303 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term304 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object term305 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term295, term295.getClass(), "text", "");
        setBooleanField(term295, term295.getClass(), "bold", true);
        setBooleanField(term295, term295.getClass(), "italic", false);
        setBooleanField(term295, term295.getClass(), "underlined", false);
        setBooleanField(term295, term295.getClass(), "striketrough", false);
        setBooleanField(term295, term295.getClass(), "obfuscated", true);
        setField(term295, term295.getClass(), "color", "");
        setField(term303, term303.getClass(), "action", null);
        setField(term303, term303.getClass(), "value", null);
        setField(term295, term295.getClass(), "clickEvent", term303);
        setField(term304, term304.getClass(), "action", null);
        setField(term304, term304.getClass(), "contents", null);
        setField(term295, term295.getClass(), "hoverEvent", term304);
        setField(term305, term305.getClass(), "targetString", null);
        setField(term295, term295.getClass(), "target", term305);
        ArrayList term227 = new ArrayList();
        ((ArrayList) term227).add(term229);
        ((ArrayList) term227).add(term240);
        ((ArrayList) term227).add(term251);
        ((ArrayList) term227).add(term262);
        ((ArrayList) term227).add(term273);
        ((ArrayList) term227).add(term284);
        ((ArrayList) term227).add(term295);
        term226 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCompositeCommand"));
        setField(term226, term226.getClass(), "tellRawCommands", term227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCompositeCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term226, args);
    }

};


