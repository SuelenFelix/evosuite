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
     Object term99452;

    public TreeTableModel_setNavigateParentKeys_1085920205142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99452 = (Object[]) newArray("javax.swing.KeyStroke", 2);
        Object term99453 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99458 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term99453, term99453.getClass(), "keyChar", (char) 65535);
        setIntField(term99453, term99453.getClass(), "keyCode", -796934571);
        setIntField(term99453, term99453.getClass(), "modifiers", 405295896);
        setBooleanField(term99453, term99453.getClass(), "onKeyRelease", false);
        setElement(term99452, 0, term99453);
        setCharField(term99458, term99458.getClass(), "keyChar", (char) 65535);
        setIntField(term99458, term99458.getClass(), "keyCode", -814977075);
        setIntField(term99458, term99458.getClass(), "modifiers", 808614267);
        setBooleanField(term99458, term99458.getClass(), "onKeyRelease", false);
        setElement(term99452, 1, term99458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99452;
        callMethod(klass, "setNavigateParentKeys", argTypes, null, args);
    }

};


