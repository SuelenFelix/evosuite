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

public class TellRawCommand_getClickEvent_5880620118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6515;

    public TellRawCommand_getClickEvent_5880620118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6515 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term6545 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term6570 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term6583 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 6);
        Object term6584 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6592 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6600 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6608 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6616 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6624 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term6632 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term6515, term6515.getClass(), "text", "NWldOLAbqk");
        setBooleanField(term6515, term6515.getClass(), "bold", false);
        setBooleanField(term6515, term6515.getClass(), "italic", false);
        setBooleanField(term6515, term6515.getClass(), "underlined", false);
        setBooleanField(term6515, term6515.getClass(), "striketrough", true);
        setBooleanField(term6515, term6515.getClass(), "obfuscated", false);
        setField(term6515, term6515.getClass(), "color", "qnYaYSpDwO");
        setField(term6545, term6545.getClass(), "action", "dgbFDCdHtj");
        setField(term6545, term6545.getClass(), "value", "EKpdCBubDE");
        setField(term6515, term6515.getClass(), "clickEvent", term6545);
        setField(term6570, term6570.getClass(), "action", "zMsSLTfGhl");
        setField(term6584, term6584.getClass(), "text", "");
        setBooleanField(term6584, term6584.getClass(), "bold", false);
        setBooleanField(term6584, term6584.getClass(), "italic", false);
        setBooleanField(term6584, term6584.getClass(), "underlined", false);
        setBooleanField(term6584, term6584.getClass(), "striketrough", false);
        setBooleanField(term6584, term6584.getClass(), "obfuscated", false);
        setField(term6584, term6584.getClass(), "color", "");
        setElement(term6583, 0, term6584);
        setField(term6592, term6592.getClass(), "text", "");
        setBooleanField(term6592, term6592.getClass(), "bold", true);
        setBooleanField(term6592, term6592.getClass(), "italic", false);
        setBooleanField(term6592, term6592.getClass(), "underlined", true);
        setBooleanField(term6592, term6592.getClass(), "striketrough", true);
        setBooleanField(term6592, term6592.getClass(), "obfuscated", false);
        setField(term6592, term6592.getClass(), "color", "");
        setElement(term6583, 1, term6592);
        setField(term6600, term6600.getClass(), "text", "");
        setBooleanField(term6600, term6600.getClass(), "bold", false);
        setBooleanField(term6600, term6600.getClass(), "italic", true);
        setBooleanField(term6600, term6600.getClass(), "underlined", true);
        setBooleanField(term6600, term6600.getClass(), "striketrough", true);
        setBooleanField(term6600, term6600.getClass(), "obfuscated", true);
        setField(term6600, term6600.getClass(), "color", "");
        setElement(term6583, 2, term6600);
        setField(term6608, term6608.getClass(), "text", "");
        setBooleanField(term6608, term6608.getClass(), "bold", true);
        setBooleanField(term6608, term6608.getClass(), "italic", true);
        setBooleanField(term6608, term6608.getClass(), "underlined", true);
        setBooleanField(term6608, term6608.getClass(), "striketrough", false);
        setBooleanField(term6608, term6608.getClass(), "obfuscated", true);
        setField(term6608, term6608.getClass(), "color", "");
        setElement(term6583, 3, term6608);
        setField(term6616, term6616.getClass(), "text", "");
        setBooleanField(term6616, term6616.getClass(), "bold", true);
        setBooleanField(term6616, term6616.getClass(), "italic", false);
        setBooleanField(term6616, term6616.getClass(), "underlined", false);
        setBooleanField(term6616, term6616.getClass(), "striketrough", true);
        setBooleanField(term6616, term6616.getClass(), "obfuscated", true);
        setField(term6616, term6616.getClass(), "color", "");
        setElement(term6583, 4, term6616);
        setField(term6624, term6624.getClass(), "text", "");
        setBooleanField(term6624, term6624.getClass(), "bold", false);
        setBooleanField(term6624, term6624.getClass(), "italic", false);
        setBooleanField(term6624, term6624.getClass(), "underlined", false);
        setBooleanField(term6624, term6624.getClass(), "striketrough", true);
        setBooleanField(term6624, term6624.getClass(), "obfuscated", true);
        setField(term6624, term6624.getClass(), "color", "");
        setElement(term6583, 5, term6624);
        setField(term6570, term6570.getClass(), "contents", term6583);
        setField(term6515, term6515.getClass(), "hoverEvent", term6570);
        setField(term6632, term6632.getClass(), "targetString", "MlzTkzKMCX");
        setField(term6515, term6515.getClass(), "target", term6632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClickEvent", argTypes, term6515, args);
    }

};


