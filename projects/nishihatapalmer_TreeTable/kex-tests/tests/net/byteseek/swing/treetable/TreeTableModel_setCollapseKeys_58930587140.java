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

public class TreeTableModel_setCollapseKeys_58930587140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98527;

    public TreeTableModel_setCollapseKeys_58930587140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98527 = (Object[]) newArray("javax.swing.KeyStroke", 7);
        Object term98528 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98533 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98538 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98543 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98548 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98553 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98558 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term98528, term98528.getClass(), "keyChar", (char) 65535);
        setIntField(term98528, term98528.getClass(), "keyCode", 1443855558);
        setIntField(term98528, term98528.getClass(), "modifiers", -1933419449);
        setBooleanField(term98528, term98528.getClass(), "onKeyRelease", false);
        setElement(term98527, 0, term98528);
        setCharField(term98533, term98533.getClass(), "keyChar", (char) 65535);
        setIntField(term98533, term98533.getClass(), "keyCode", -1804322375);
        setIntField(term98533, term98533.getClass(), "modifiers", 1595814906);
        setBooleanField(term98533, term98533.getClass(), "onKeyRelease", false);
        setElement(term98527, 1, term98533);
        setCharField(term98538, term98538.getClass(), "keyChar", (char) 65535);
        setIntField(term98538, term98538.getClass(), "keyCode", -834193529);
        setIntField(term98538, term98538.getClass(), "modifiers", 335780735);
        setBooleanField(term98538, term98538.getClass(), "onKeyRelease", false);
        setElement(term98527, 2, term98538);
        setCharField(term98543, term98543.getClass(), "keyChar", (char) 65535);
        setIntField(term98543, term98543.getClass(), "keyCode", -1541981599);
        setIntField(term98543, term98543.getClass(), "modifiers", 1605456363);
        setBooleanField(term98543, term98543.getClass(), "onKeyRelease", true);
        setElement(term98527, 3, term98543);
        setCharField(term98548, term98548.getClass(), "keyChar", (char) 65535);
        setIntField(term98548, term98548.getClass(), "keyCode", 2059896693);
        setIntField(term98548, term98548.getClass(), "modifiers", 2109912812);
        setBooleanField(term98548, term98548.getClass(), "onKeyRelease", false);
        setElement(term98527, 4, term98548);
        setCharField(term98553, term98553.getClass(), "keyChar", (char) 65535);
        setIntField(term98553, term98553.getClass(), "keyCode", 1841286431);
        setIntField(term98553, term98553.getClass(), "modifiers", -1723168189);
        setBooleanField(term98553, term98553.getClass(), "onKeyRelease", false);
        setElement(term98527, 5, term98553);
        setCharField(term98558, term98558.getClass(), "keyChar", (char) 65535);
        setIntField(term98558, term98558.getClass(), "keyCode", -675283917);
        setIntField(term98558, term98558.getClass(), "modifiers", -2093862988);
        setBooleanField(term98558, term98558.getClass(), "onKeyRelease", true);
        setElement(term98527, 6, term98558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98527;
        callMethod(klass, "setCollapseKeys", argTypes, null, args);
    }

};


