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

public class TreeTableModel_setExpandKeys_1114716178139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98496;

    public TreeTableModel_setExpandKeys_1114716178139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98496 = (Object[]) newArray("javax.swing.KeyStroke", 6);
        Object term98497 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98502 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98507 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98512 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98517 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term98522 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term98497, term98497.getClass(), "keyChar", (char) 65535);
        setIntField(term98497, term98497.getClass(), "keyCode", 950322609);
        setIntField(term98497, term98497.getClass(), "modifiers", -2023791789);
        setBooleanField(term98497, term98497.getClass(), "onKeyRelease", false);
        setElement(term98496, 0, term98497);
        setCharField(term98502, term98502.getClass(), "keyChar", (char) 65535);
        setIntField(term98502, term98502.getClass(), "keyCode", 353974456);
        setIntField(term98502, term98502.getClass(), "modifiers", -485108462);
        setBooleanField(term98502, term98502.getClass(), "onKeyRelease", false);
        setElement(term98496, 1, term98502);
        setCharField(term98507, term98507.getClass(), "keyChar", (char) 65535);
        setIntField(term98507, term98507.getClass(), "keyCode", 1418551216);
        setIntField(term98507, term98507.getClass(), "modifiers", -626779272);
        setBooleanField(term98507, term98507.getClass(), "onKeyRelease", false);
        setElement(term98496, 2, term98507);
        setCharField(term98512, term98512.getClass(), "keyChar", (char) 65535);
        setIntField(term98512, term98512.getClass(), "keyCode", -1150062870);
        setIntField(term98512, term98512.getClass(), "modifiers", -886200503);
        setBooleanField(term98512, term98512.getClass(), "onKeyRelease", false);
        setElement(term98496, 3, term98512);
        setCharField(term98517, term98517.getClass(), "keyChar", (char) 65535);
        setIntField(term98517, term98517.getClass(), "keyCode", 1136393691);
        setIntField(term98517, term98517.getClass(), "modifiers", -1288536479);
        setBooleanField(term98517, term98517.getClass(), "onKeyRelease", true);
        setElement(term98496, 4, term98517);
        setCharField(term98522, term98522.getClass(), "keyChar", (char) 65535);
        setIntField(term98522, term98522.getClass(), "keyCode", 1092038167);
        setIntField(term98522, term98522.getClass(), "modifiers", 1879729823);
        setBooleanField(term98522, term98522.getClass(), "onKeyRelease", false);
        setElement(term98496, 5, term98522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98496;
        callMethod(klass, "setExpandKeys", argTypes, null, args);
    }

};


