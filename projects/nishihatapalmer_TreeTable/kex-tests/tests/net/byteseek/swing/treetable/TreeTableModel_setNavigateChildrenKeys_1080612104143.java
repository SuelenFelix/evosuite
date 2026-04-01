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
     Object term99463;

    public TreeTableModel_setNavigateChildrenKeys_1080612104143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99463 = (Object[]) newArray("javax.swing.KeyStroke", 8);
        Object term99464 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99469 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99474 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99479 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99484 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99489 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99494 = newInstance(Class.forName("javax.swing.KeyStroke"));
        Object term99499 = newInstance(Class.forName("javax.swing.KeyStroke"));
        setCharField(term99464, term99464.getClass(), "keyChar", (char) 65535);
        setIntField(term99464, term99464.getClass(), "keyCode", 1611734632);
        setIntField(term99464, term99464.getClass(), "modifiers", 868908117);
        setBooleanField(term99464, term99464.getClass(), "onKeyRelease", true);
        setElement(term99463, 0, term99464);
        setCharField(term99469, term99469.getClass(), "keyChar", (char) 65535);
        setIntField(term99469, term99469.getClass(), "keyCode", 1789351397);
        setIntField(term99469, term99469.getClass(), "modifiers", 2145528170);
        setBooleanField(term99469, term99469.getClass(), "onKeyRelease", false);
        setElement(term99463, 1, term99469);
        setCharField(term99474, term99474.getClass(), "keyChar", (char) 65535);
        setIntField(term99474, term99474.getClass(), "keyCode", -585773976);
        setIntField(term99474, term99474.getClass(), "modifiers", 852806940);
        setBooleanField(term99474, term99474.getClass(), "onKeyRelease", false);
        setElement(term99463, 2, term99474);
        setCharField(term99479, term99479.getClass(), "keyChar", (char) 65535);
        setIntField(term99479, term99479.getClass(), "keyCode", 698551724);
        setIntField(term99479, term99479.getClass(), "modifiers", -1631048635);
        setBooleanField(term99479, term99479.getClass(), "onKeyRelease", true);
        setElement(term99463, 3, term99479);
        setCharField(term99484, term99484.getClass(), "keyChar", (char) 65535);
        setIntField(term99484, term99484.getClass(), "keyCode", 1342808731);
        setIntField(term99484, term99484.getClass(), "modifiers", -64893740);
        setBooleanField(term99484, term99484.getClass(), "onKeyRelease", true);
        setElement(term99463, 4, term99484);
        setCharField(term99489, term99489.getClass(), "keyChar", (char) 65535);
        setIntField(term99489, term99489.getClass(), "keyCode", -222012928);
        setIntField(term99489, term99489.getClass(), "modifiers", -146564963);
        setBooleanField(term99489, term99489.getClass(), "onKeyRelease", false);
        setElement(term99463, 5, term99489);
        setCharField(term99494, term99494.getClass(), "keyChar", (char) 65535);
        setIntField(term99494, term99494.getClass(), "keyCode", -83178716);
        setIntField(term99494, term99494.getClass(), "modifiers", -1292704466);
        setBooleanField(term99494, term99494.getClass(), "onKeyRelease", false);
        setElement(term99463, 6, term99494);
        setCharField(term99499, term99499.getClass(), "keyChar", (char) 65535);
        setIntField(term99499, term99499.getClass(), "keyCode", 1991858584);
        setIntField(term99499, term99499.getClass(), "modifiers", -1300947782);
        setBooleanField(term99499, term99499.getClass(), "onKeyRelease", true);
        setElement(term99463, 7, term99499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.KeyStroke"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99463;
        callMethod(klass, "setNavigateChildrenKeys", argTypes, null, args);
    }

};


