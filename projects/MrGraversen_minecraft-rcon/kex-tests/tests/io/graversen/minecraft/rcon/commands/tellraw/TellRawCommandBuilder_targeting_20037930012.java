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
import java.lang.String;

public class TellRawCommandBuilder_targeting_20037930012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1621;
     Object enum0;

    public TellRawCommandBuilder_targeting_20037930012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1621 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term1622 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term1664 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term1689 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term1702 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 9);
        Object term1703 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1711 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1719 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1727 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1735 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1743 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1751 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1759 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term1767 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term1622, term1622.getClass(), "targetString", "pvDEABOxLt");
        setField(term1621, term1621.getClass(), "target", term1622);
        setField(term1621, term1621.getClass(), "text", "beAMpkroCQ");
        setBooleanField(term1621, term1621.getClass(), "bold", true);
        setBooleanField(term1621, term1621.getClass(), "italic", true);
        setBooleanField(term1621, term1621.getClass(), "underlined", true);
        setBooleanField(term1621, term1621.getClass(), "striketrough", true);
        setBooleanField(term1621, term1621.getClass(), "obfuscated", false);
        setField(term1621, term1621.getClass(), "color", "uSUvKAyuvd");
        setField(term1664, term1664.getClass(), "action", "onQLVONGuf");
        setField(term1664, term1664.getClass(), "value", "SOrEHbcbmn");
        setField(term1621, term1621.getClass(), "clickEvent", term1664);
        setField(term1689, term1689.getClass(), "action", "bnsyeQXFdu");
        setField(term1703, term1703.getClass(), "text", "");
        setBooleanField(term1703, term1703.getClass(), "bold", false);
        setBooleanField(term1703, term1703.getClass(), "italic", false);
        setBooleanField(term1703, term1703.getClass(), "underlined", true);
        setBooleanField(term1703, term1703.getClass(), "striketrough", false);
        setBooleanField(term1703, term1703.getClass(), "obfuscated", false);
        setField(term1703, term1703.getClass(), "color", "");
        setElement(term1702, 0, term1703);
        setField(term1711, term1711.getClass(), "text", "");
        setBooleanField(term1711, term1711.getClass(), "bold", false);
        setBooleanField(term1711, term1711.getClass(), "italic", false);
        setBooleanField(term1711, term1711.getClass(), "underlined", true);
        setBooleanField(term1711, term1711.getClass(), "striketrough", true);
        setBooleanField(term1711, term1711.getClass(), "obfuscated", false);
        setField(term1711, term1711.getClass(), "color", "");
        setElement(term1702, 1, term1711);
        setField(term1719, term1719.getClass(), "text", "");
        setBooleanField(term1719, term1719.getClass(), "bold", true);
        setBooleanField(term1719, term1719.getClass(), "italic", false);
        setBooleanField(term1719, term1719.getClass(), "underlined", true);
        setBooleanField(term1719, term1719.getClass(), "striketrough", true);
        setBooleanField(term1719, term1719.getClass(), "obfuscated", false);
        setField(term1719, term1719.getClass(), "color", "");
        setElement(term1702, 2, term1719);
        setField(term1727, term1727.getClass(), "text", "");
        setBooleanField(term1727, term1727.getClass(), "bold", false);
        setBooleanField(term1727, term1727.getClass(), "italic", true);
        setBooleanField(term1727, term1727.getClass(), "underlined", false);
        setBooleanField(term1727, term1727.getClass(), "striketrough", false);
        setBooleanField(term1727, term1727.getClass(), "obfuscated", true);
        setField(term1727, term1727.getClass(), "color", "");
        setElement(term1702, 3, term1727);
        setField(term1735, term1735.getClass(), "text", "");
        setBooleanField(term1735, term1735.getClass(), "bold", false);
        setBooleanField(term1735, term1735.getClass(), "italic", false);
        setBooleanField(term1735, term1735.getClass(), "underlined", false);
        setBooleanField(term1735, term1735.getClass(), "striketrough", false);
        setBooleanField(term1735, term1735.getClass(), "obfuscated", false);
        setField(term1735, term1735.getClass(), "color", "");
        setElement(term1702, 4, term1735);
        setField(term1743, term1743.getClass(), "text", "");
        setBooleanField(term1743, term1743.getClass(), "bold", false);
        setBooleanField(term1743, term1743.getClass(), "italic", true);
        setBooleanField(term1743, term1743.getClass(), "underlined", false);
        setBooleanField(term1743, term1743.getClass(), "striketrough", true);
        setBooleanField(term1743, term1743.getClass(), "obfuscated", true);
        setField(term1743, term1743.getClass(), "color", "");
        setElement(term1702, 5, term1743);
        setField(term1751, term1751.getClass(), "text", "");
        setBooleanField(term1751, term1751.getClass(), "bold", false);
        setBooleanField(term1751, term1751.getClass(), "italic", false);
        setBooleanField(term1751, term1751.getClass(), "underlined", true);
        setBooleanField(term1751, term1751.getClass(), "striketrough", true);
        setBooleanField(term1751, term1751.getClass(), "obfuscated", true);
        setField(term1751, term1751.getClass(), "color", "");
        setElement(term1702, 6, term1751);
        setField(term1759, term1759.getClass(), "text", "");
        setBooleanField(term1759, term1759.getClass(), "bold", true);
        setBooleanField(term1759, term1759.getClass(), "italic", false);
        setBooleanField(term1759, term1759.getClass(), "underlined", false);
        setBooleanField(term1759, term1759.getClass(), "striketrough", false);
        setBooleanField(term1759, term1759.getClass(), "obfuscated", true);
        setField(term1759, term1759.getClass(), "color", "");
        setElement(term1702, 7, term1759);
        setField(term1767, term1767.getClass(), "text", "");
        setBooleanField(term1767, term1767.getClass(), "bold", true);
        setBooleanField(term1767, term1767.getClass(), "italic", false);
        setBooleanField(term1767, term1767.getClass(), "underlined", true);
        setBooleanField(term1767, term1767.getClass(), "striketrough", true);
        setBooleanField(term1767, term1767.getClass(), "obfuscated", false);
        setField(term1767, term1767.getClass(), "color", "");
        setElement(term1702, 8, term1767);
        setField(term1689, term1689.getClass(), "contents", term1702);
        setField(term1621, term1621.getClass(), "hoverEvent", term1689);
        Class<? extends Object> term1949 = Class.forName((String) "io.graversen.minecraft.rcon.util.Selectors");
        Field term1948 = ((Class) term1949).getDeclaredField((String) "ALL_PLAYERS");
        ((Field) term1948).setAccessible(true);
        enum0 = ((Field) term1948).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Selectors");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "targeting", argTypes, term1621, args);
    }

};


