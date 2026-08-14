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

public class TreeTableModel_setNavigateChildrenKeys_1080612104143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98630;

    public TreeTableModel_setNavigateChildrenKeys_1080612104143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98630 = (Object[]) newArray("javax.swing.KeyStroke", 2);
        Object term98631 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98636 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term98631, term98631.getClass(), "keyChar", (char) 65535);
        setIntField(term98631, term98631.getClass(), "keyCode", -2018735535);
        setIntField(term98631, term98631.getClass(), "modifiers", -658524954);
        setBooleanField(term98631, term98631.getClass(), "onKeyRelease", true);
        setElement(term98630, 0, term98631);
        setCharField(term98636, term98636.getClass(), "keyChar", (char) 65535);
        setIntField(term98636, term98636.getClass(), "keyCode", -2009613557);
        setIntField(term98636, term98636.getClass(), "modifiers", 654195547);
        setBooleanField(term98636, term98636.getClass(), "onKeyRelease", true);
        setElement(term98630, 1, term98636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98630;
        callMethod(klass, "setNavigateChildrenKeys", argTypes, null, args);
    }

};


