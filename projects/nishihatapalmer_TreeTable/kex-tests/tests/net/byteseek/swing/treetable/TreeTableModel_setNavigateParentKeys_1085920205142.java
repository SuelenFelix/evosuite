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

public class TreeTableModel_setNavigateParentKeys_1085920205142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98589;

    public TreeTableModel_setNavigateParentKeys_1085920205142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98589 = (Object[]) newArray("javax.swing.KeyStroke", 8);
        Object term98590 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98595 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98600 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98605 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98610 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98615 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98620 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98625 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term98590, term98590.getClass(), "keyChar", (char) 65535);
        setIntField(term98590, term98590.getClass(), "keyCode", 2073858334);
        setIntField(term98590, term98590.getClass(), "modifiers", -1693535639);
        setBooleanField(term98590, term98590.getClass(), "onKeyRelease", false);
        setElement(term98589, 0, term98590);
        setCharField(term98595, term98595.getClass(), "keyChar", (char) 65535);
        setIntField(term98595, term98595.getClass(), "keyCode", 1344744036);
        setIntField(term98595, term98595.getClass(), "modifiers", -98060427);
        setBooleanField(term98595, term98595.getClass(), "onKeyRelease", true);
        setElement(term98589, 1, term98595);
        setCharField(term98600, term98600.getClass(), "keyChar", (char) 65535);
        setIntField(term98600, term98600.getClass(), "keyCode", -1272268399);
        setIntField(term98600, term98600.getClass(), "modifiers", 1120271104);
        setBooleanField(term98600, term98600.getClass(), "onKeyRelease", false);
        setElement(term98589, 2, term98600);
        setCharField(term98605, term98605.getClass(), "keyChar", (char) 65535);
        setIntField(term98605, term98605.getClass(), "keyCode", -128435804);
        setIntField(term98605, term98605.getClass(), "modifiers", 2136158480);
        setBooleanField(term98605, term98605.getClass(), "onKeyRelease", true);
        setElement(term98589, 3, term98605);
        setCharField(term98610, term98610.getClass(), "keyChar", (char) 65535);
        setIntField(term98610, term98610.getClass(), "keyCode", 2118747457);
        setIntField(term98610, term98610.getClass(), "modifiers", 1868344256);
        setBooleanField(term98610, term98610.getClass(), "onKeyRelease", true);
        setElement(term98589, 4, term98610);
        setCharField(term98615, term98615.getClass(), "keyChar", (char) 65535);
        setIntField(term98615, term98615.getClass(), "keyCode", 1857693976);
        setIntField(term98615, term98615.getClass(), "modifiers", 1631305277);
        setBooleanField(term98615, term98615.getClass(), "onKeyRelease", true);
        setElement(term98589, 5, term98615);
        setCharField(term98620, term98620.getClass(), "keyChar", (char) 65535);
        setIntField(term98620, term98620.getClass(), "keyCode", 162113491);
        setIntField(term98620, term98620.getClass(), "modifiers", -932147928);
        setBooleanField(term98620, term98620.getClass(), "onKeyRelease", false);
        setElement(term98589, 6, term98620);
        setCharField(term98625, term98625.getClass(), "keyChar", (char) 65535);
        setIntField(term98625, term98625.getClass(), "keyCode", 487369012);
        setIntField(term98625, term98625.getClass(), "modifiers", -179238712);
        setBooleanField(term98625, term98625.getClass(), "onKeyRelease", true);
        setElement(term98589, 7, term98625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98589;
        callMethod(klass, "setNavigateParentKeys", argTypes, null, args);
    }

};


