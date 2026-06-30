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

public class TellRawCommandBuilder_withHoverTextEvent_108609317711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4431;
     Object term4513;

    public TellRawCommandBuilder_withHoverTextEvent_108609317711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4431 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        Object term4432 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        Object term4474 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term4499 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term4512 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 0);
        setField(term4432, term4432.getClass(), "targetString", "zjZYTddemL");
        setField(term4431, term4431.getClass(), "target", term4432);
        setField(term4431, term4431.getClass(), "text", "QtrylgCLiF");
        setBooleanField(term4431, term4431.getClass(), "bold", false);
        setBooleanField(term4431, term4431.getClass(), "italic", false);
        setBooleanField(term4431, term4431.getClass(), "underlined", false);
        setBooleanField(term4431, term4431.getClass(), "striketrough", true);
        setBooleanField(term4431, term4431.getClass(), "obfuscated", false);
        setField(term4431, term4431.getClass(), "color", "orEuhCStGM");
        setField(term4474, term4474.getClass(), "action", "HhEaSXWvrY");
        setField(term4474, term4474.getClass(), "value", "CVRGEomOth");
        setField(term4431, term4431.getClass(), "clickEvent", term4474);
        setField(term4499, term4499.getClass(), "action", "vSeruUyNWX");
        setField(term4499, term4499.getClass(), "contents", term4512);
        setField(term4431, term4431.getClass(), "hoverEvent", term4499);
        term4513 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        Object term4543 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        Object term4568 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.HoverEvent"));
        Object[] term4581 = (Object[]) newArray("io.graversen.minecraft.rcon.commands.tellraw.TextContent", 8);
        Object term4582 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4590 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4598 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4606 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4614 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4622 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4630 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4638 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        Object term4646 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term4513, term4513.getClass(), "text", "UkKvaeJfEC");
        setBooleanField(term4513, term4513.getClass(), "bold", true);
        setBooleanField(term4513, term4513.getClass(), "italic", true);
        setBooleanField(term4513, term4513.getClass(), "underlined", true);
        setBooleanField(term4513, term4513.getClass(), "striketrough", true);
        setBooleanField(term4513, term4513.getClass(), "obfuscated", false);
        setField(term4513, term4513.getClass(), "color", "WPxXsahPRq");
        setField(term4543, term4543.getClass(), "action", "IENRuqmwUU");
        setField(term4543, term4543.getClass(), "value", "GsWxOwXvSu");
        setField(term4513, term4513.getClass(), "clickEvent", term4543);
        setField(term4568, term4568.getClass(), "action", "bKBSncrMEZ");
        setField(term4582, term4582.getClass(), "text", "");
        setBooleanField(term4582, term4582.getClass(), "bold", false);
        setBooleanField(term4582, term4582.getClass(), "italic", false);
        setBooleanField(term4582, term4582.getClass(), "underlined", false);
        setBooleanField(term4582, term4582.getClass(), "striketrough", false);
        setBooleanField(term4582, term4582.getClass(), "obfuscated", true);
        setField(term4582, term4582.getClass(), "color", "");
        setElement(term4581, 0, term4582);
        setField(term4590, term4590.getClass(), "text", "");
        setBooleanField(term4590, term4590.getClass(), "bold", true);
        setBooleanField(term4590, term4590.getClass(), "italic", false);
        setBooleanField(term4590, term4590.getClass(), "underlined", false);
        setBooleanField(term4590, term4590.getClass(), "striketrough", false);
        setBooleanField(term4590, term4590.getClass(), "obfuscated", false);
        setField(term4590, term4590.getClass(), "color", "");
        setElement(term4581, 1, term4590);
        setField(term4598, term4598.getClass(), "text", "");
        setBooleanField(term4598, term4598.getClass(), "bold", false);
        setBooleanField(term4598, term4598.getClass(), "italic", false);
        setBooleanField(term4598, term4598.getClass(), "underlined", false);
        setBooleanField(term4598, term4598.getClass(), "striketrough", true);
        setBooleanField(term4598, term4598.getClass(), "obfuscated", true);
        setField(term4598, term4598.getClass(), "color", "");
        setElement(term4581, 2, term4598);
        setField(term4606, term4606.getClass(), "text", "");
        setBooleanField(term4606, term4606.getClass(), "bold", false);
        setBooleanField(term4606, term4606.getClass(), "italic", true);
        setBooleanField(term4606, term4606.getClass(), "underlined", true);
        setBooleanField(term4606, term4606.getClass(), "striketrough", true);
        setBooleanField(term4606, term4606.getClass(), "obfuscated", false);
        setField(term4606, term4606.getClass(), "color", "");
        setElement(term4581, 3, term4606);
        setField(term4614, term4614.getClass(), "text", "");
        setBooleanField(term4614, term4614.getClass(), "bold", true);
        setBooleanField(term4614, term4614.getClass(), "italic", true);
        setBooleanField(term4614, term4614.getClass(), "underlined", true);
        setBooleanField(term4614, term4614.getClass(), "striketrough", false);
        setBooleanField(term4614, term4614.getClass(), "obfuscated", true);
        setField(term4614, term4614.getClass(), "color", "");
        setElement(term4581, 4, term4614);
        setField(term4622, term4622.getClass(), "text", "");
        setBooleanField(term4622, term4622.getClass(), "bold", true);
        setBooleanField(term4622, term4622.getClass(), "italic", false);
        setBooleanField(term4622, term4622.getClass(), "underlined", false);
        setBooleanField(term4622, term4622.getClass(), "striketrough", true);
        setBooleanField(term4622, term4622.getClass(), "obfuscated", true);
        setField(term4622, term4622.getClass(), "color", "");
        setElement(term4581, 5, term4622);
        setField(term4630, term4630.getClass(), "text", "");
        setBooleanField(term4630, term4630.getClass(), "bold", true);
        setBooleanField(term4630, term4630.getClass(), "italic", false);
        setBooleanField(term4630, term4630.getClass(), "underlined", true);
        setBooleanField(term4630, term4630.getClass(), "striketrough", true);
        setBooleanField(term4630, term4630.getClass(), "obfuscated", true);
        setField(term4630, term4630.getClass(), "color", "");
        setElement(term4581, 6, term4630);
        setField(term4638, term4638.getClass(), "text", "");
        setBooleanField(term4638, term4638.getClass(), "bold", false);
        setBooleanField(term4638, term4638.getClass(), "italic", true);
        setBooleanField(term4638, term4638.getClass(), "underlined", false);
        setBooleanField(term4638, term4638.getClass(), "striketrough", true);
        setBooleanField(term4638, term4638.getClass(), "obfuscated", false);
        setField(term4638, term4638.getClass(), "color", "");
        setElement(term4581, 7, term4638);
        setField(term4568, term4568.getClass(), "contents", term4581);
        setField(term4513, term4513.getClass(), "hoverEvent", term4568);
        setField(term4646, term4646.getClass(), "targetString", "IpmgwHTgnG");
        setField(term4513, term4513.getClass(), "target", term4646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Object[] args = new Object[1];
        args[0] = term4513;
        callMethod(klass, "withHoverTextEvent", argTypes, term4431, args);
    }

};


