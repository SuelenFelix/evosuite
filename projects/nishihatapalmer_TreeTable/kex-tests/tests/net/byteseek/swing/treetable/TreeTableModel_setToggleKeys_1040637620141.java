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
     Object term98563;

    public TreeTableModel_setToggleKeys_1040637620141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98563 = (Object[]) newArray("javax.swing.KeyStroke", 5);
        Object term98564 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98569 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98574 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98579 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98584 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term98564, term98564.getClass(), "keyChar", (char) 65535);
        setIntField(term98564, term98564.getClass(), "keyCode", 1337828646);
        setIntField(term98564, term98564.getClass(), "modifiers", 532666604);
        setBooleanField(term98564, term98564.getClass(), "onKeyRelease", true);
        setElement(term98563, 0, term98564);
        setCharField(term98569, term98569.getClass(), "keyChar", (char) 65535);
        setIntField(term98569, term98569.getClass(), "keyCode", -13725716);
        setIntField(term98569, term98569.getClass(), "modifiers", -1695750603);
        setBooleanField(term98569, term98569.getClass(), "onKeyRelease", false);
        setElement(term98563, 1, term98569);
        setCharField(term98574, term98574.getClass(), "keyChar", (char) 65535);
        setIntField(term98574, term98574.getClass(), "keyCode", 63677360);
        setIntField(term98574, term98574.getClass(), "modifiers", 1478914037);
        setBooleanField(term98574, term98574.getClass(), "onKeyRelease", false);
        setElement(term98563, 2, term98574);
        setCharField(term98579, term98579.getClass(), "keyChar", (char) 65535);
        setIntField(term98579, term98579.getClass(), "keyCode", 1630231519);
        setIntField(term98579, term98579.getClass(), "modifiers", 1460702778);
        setBooleanField(term98579, term98579.getClass(), "onKeyRelease", true);
        setElement(term98563, 3, term98579);
        setCharField(term98584, term98584.getClass(), "keyChar", (char) 65535);
        setIntField(term98584, term98584.getClass(), "keyCode", -1398142433);
        setIntField(term98584, term98584.getClass(), "modifiers", -1112119058);
        setBooleanField(term98584, term98584.getClass(), "onKeyRelease", true);
        setElement(term98563, 4, term98584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98563;
        callMethod(klass, "setToggleKeys", argTypes, null, args);
    }

};


