package io.graversen.minecraft.rcon.commands.title;

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
import static io.graversen.minecraft.rcon.commands.title.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TitleCommandBuilder_bold_8104219806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613;

    public TitleCommandBuilder_bold_8104219806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1613 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1614 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1614, term1614.getClass(), "targetString", "xOEqzGAmDU");
        setField(term1613, term1613.getClass(), "target", term1614);
        setField(term1613, term1613.getClass(), "position", "eZFUvlxvGV");
        setField(term1613, term1613.getClass(), "text", "BYqFIqCKAV");
        setBooleanField(term1613, term1613.getClass(), "bold", false);
        setBooleanField(term1613, term1613.getClass(), "italic", false);
        setBooleanField(term1613, term1613.getClass(), "underlined", false);
        setBooleanField(term1613, term1613.getClass(), "striketrough", true);
        setBooleanField(term1613, term1613.getClass(), "obfuscated", true);
        setField(term1613, term1613.getClass(), "color", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bold", argTypes, term1613, args);
    }

};


