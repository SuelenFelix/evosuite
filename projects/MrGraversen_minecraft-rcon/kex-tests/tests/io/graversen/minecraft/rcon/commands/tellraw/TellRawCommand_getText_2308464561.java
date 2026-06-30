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

public class TellRawCommand_getText_2308464561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5337;

    public TellRawCommand_getText_2308464561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5337 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term5367 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term5392 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term5405 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 5);
        Object term5406 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5414 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5422 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5430 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5438 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term5446 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term5337, term5337.getClass(), "text", "mKaHyMybrK");
        setBooleanField(term5337, term5337.getClass(), "bold", false);
        setBooleanField(term5337, term5337.getClass(), "italic", false);
        setBooleanField(term5337, term5337.getClass(), "underlined", false);
        setBooleanField(term5337, term5337.getClass(), "striketrough", false);
        setBooleanField(term5337, term5337.getClass(), "obfuscated", false);
        setField(term5337, term5337.getClass(), "color", "AyrEXuGrEj");
        setField(term5367, term5367.getClass(), "action", "yevIIoVYHq");
        setField(term5367, term5367.getClass(), "value", "UuYWMTqWTV");
        setField(term5337, term5337.getClass(), "clickEvent", term5367);
        setField(term5392, term5392.getClass(), "action", "DSFGlcaXUb");
        setField(term5406, term5406.getClass(), "text", "");
        setBooleanField(term5406, term5406.getClass(), "bold", true);
        setBooleanField(term5406, term5406.getClass(), "italic", false);
        setBooleanField(term5406, term5406.getClass(), "underlined", false);
        setBooleanField(term5406, term5406.getClass(), "striketrough", true);
        setBooleanField(term5406, term5406.getClass(), "obfuscated", false);
        setField(term5406, term5406.getClass(), "color", "");
        setElement(term5405, 0, term5406);
        setField(term5414, term5414.getClass(), "text", "");
        setBooleanField(term5414, term5414.getClass(), "bold", true);
        setBooleanField(term5414, term5414.getClass(), "italic", true);
        setBooleanField(term5414, term5414.getClass(), "underlined", true);
        setBooleanField(term5414, term5414.getClass(), "striketrough", true);
        setBooleanField(term5414, term5414.getClass(), "obfuscated", true);
        setField(term5414, term5414.getClass(), "color", "");
        setElement(term5405, 1, term5414);
        setField(term5422, term5422.getClass(), "text", "");
        setBooleanField(term5422, term5422.getClass(), "bold", false);
        setBooleanField(term5422, term5422.getClass(), "italic", true);
        setBooleanField(term5422, term5422.getClass(), "underlined", false);
        setBooleanField(term5422, term5422.getClass(), "striketrough", false);
        setBooleanField(term5422, term5422.getClass(), "obfuscated", false);
        setField(term5422, term5422.getClass(), "color", "");
        setElement(term5405, 2, term5422);
        setField(term5430, term5430.getClass(), "text", "");
        setBooleanField(term5430, term5430.getClass(), "bold", false);
        setBooleanField(term5430, term5430.getClass(), "italic", false);
        setBooleanField(term5430, term5430.getClass(), "underlined", true);
        setBooleanField(term5430, term5430.getClass(), "striketrough", true);
        setBooleanField(term5430, term5430.getClass(), "obfuscated", true);
        setField(term5430, term5430.getClass(), "color", "");
        setElement(term5405, 3, term5430);
        setField(term5438, term5438.getClass(), "text", "");
        setBooleanField(term5438, term5438.getClass(), "bold", true);
        setBooleanField(term5438, term5438.getClass(), "italic", false);
        setBooleanField(term5438, term5438.getClass(), "underlined", false);
        setBooleanField(term5438, term5438.getClass(), "striketrough", false);
        setBooleanField(term5438, term5438.getClass(), "obfuscated", true);
        setField(term5438, term5438.getClass(), "color", "");
        setElement(term5405, 4, term5438);
        setField(term5392, term5392.getClass(), "contents", term5405);
        setField(term5337, term5337.getClass(), "hoverEvent", term5392);
        setField(term5446, term5446.getClass(), "targetString", "JeZbrwZmsP");
        setField(term5337, term5337.getClass(), "target", term5446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term5337, args);
    }

};


