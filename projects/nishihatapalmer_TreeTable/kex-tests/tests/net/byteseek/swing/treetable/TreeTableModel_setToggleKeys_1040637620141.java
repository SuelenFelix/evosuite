package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeTableModel_setToggleKeys_1040637620141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99416;

    public TreeTableModel_setToggleKeys_1040637620141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99416 = (Object[]) newArray("javax.swing.KeyStroke", 7);
        Object term99417 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99422 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99427 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99432 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99437 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99442 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99447 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term99417, term99417.getClass(), "keyChar", (char) 65535);
        setIntField(term99417, term99417.getClass(), "keyCode", 1137154606);
        setIntField(term99417, term99417.getClass(), "modifiers", -100681578);
        setBooleanField(term99417, term99417.getClass(), "onKeyRelease", false);
        setElement(term99416, 0, term99417);
        setCharField(term99422, term99422.getClass(), "keyChar", (char) 65535);
        setIntField(term99422, term99422.getClass(), "keyCode", 296568835);
        setIntField(term99422, term99422.getClass(), "modifiers", 1431951992);
        setBooleanField(term99422, term99422.getClass(), "onKeyRelease", false);
        setElement(term99416, 1, term99422);
        setCharField(term99427, term99427.getClass(), "keyChar", (char) 65535);
        setIntField(term99427, term99427.getClass(), "keyCode", -1608123016);
        setIntField(term99427, term99427.getClass(), "modifiers", -896473214);
        setBooleanField(term99427, term99427.getClass(), "onKeyRelease", false);
        setElement(term99416, 2, term99427);
        setCharField(term99432, term99432.getClass(), "keyChar", (char) 65535);
        setIntField(term99432, term99432.getClass(), "keyCode", 401203924);
        setIntField(term99432, term99432.getClass(), "modifiers", -1212399479);
        setBooleanField(term99432, term99432.getClass(), "onKeyRelease", false);
        setElement(term99416, 3, term99432);
        setCharField(term99437, term99437.getClass(), "keyChar", (char) 65535);
        setIntField(term99437, term99437.getClass(), "keyCode", 2107679041);
        setIntField(term99437, term99437.getClass(), "modifiers", 2040965507);
        setBooleanField(term99437, term99437.getClass(), "onKeyRelease", true);
        setElement(term99416, 4, term99437);
        setCharField(term99442, term99442.getClass(), "keyChar", (char) 65535);
        setIntField(term99442, term99442.getClass(), "keyCode", -1281083262);
        setIntField(term99442, term99442.getClass(), "modifiers", 1059930704);
        setBooleanField(term99442, term99442.getClass(), "onKeyRelease", false);
        setElement(term99416, 5, term99442);
        setCharField(term99447, term99447.getClass(), "keyChar", (char) 65535);
        setIntField(term99447, term99447.getClass(), "keyCode", -1967153290);
        setIntField(term99447, term99447.getClass(), "modifiers", -1397251956);
        setBooleanField(term99447, term99447.getClass(), "onKeyRelease", false);
        setElement(term99416, 6, term99447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99416;
        callMethod(klass, "setToggleKeys", argTypes, null, args);
    }

};


