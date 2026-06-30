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

public class TellRawCommand_getHoverEvent_17437310379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6705;

    public TellRawCommand_getHoverEvent_17437310379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6705 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6735 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6760 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6773 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 1);
        Object term6774 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6782 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6705, term6705.getClass(), "text", "UqKUbMyPMJ");
        setBooleanField(term6705, term6705.getClass(), "bold", false);
        setBooleanField(term6705, term6705.getClass(), "italic", false);
        setBooleanField(term6705, term6705.getClass(), "underlined", false);
        setBooleanField(term6705, term6705.getClass(), "striketrough", true);
        setBooleanField(term6705, term6705.getClass(), "obfuscated", false);
        setField(term6705, term6705.getClass(), "color", "QpYltHAdyY");
        setField(term6735, term6735.getClass(), "action", "lbmSGBwIiV");
        setField(term6735, term6735.getClass(), "value", "DAxyHoTLzZ");
        setField(term6705, term6705.getClass(), "clickEvent", term6735);
        setField(term6760, term6760.getClass(), "action", "fhZgTouhCC");
        setField(term6774, term6774.getClass(), "text", "");
        setBooleanField(term6774, term6774.getClass(), "bold", true);
        setBooleanField(term6774, term6774.getClass(), "italic", false);
        setBooleanField(term6774, term6774.getClass(), "underlined", true);
        setBooleanField(term6774, term6774.getClass(), "striketrough", true);
        setBooleanField(term6774, term6774.getClass(), "obfuscated", true);
        setField(term6774, term6774.getClass(), "color", "");
        setElement(term6773, 0, term6774);
        setField(term6760, term6760.getClass(), "contents", term6773);
        setField(term6705, term6705.getClass(), "hoverEvent", term6760);
        setField(term6782, term6782.getClass(), "targetString", "CgleElJNje");
        setField(term6705, term6705.getClass(), "target", term6782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoverEvent", argTypes, term6705, args);
    }

};


