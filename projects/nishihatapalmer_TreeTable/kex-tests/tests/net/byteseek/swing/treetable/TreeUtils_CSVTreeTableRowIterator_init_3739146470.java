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
import java.lang.Integer;

public class TreeUtils_CSVTreeTableRowIterator_init_3739146470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term86;
     Object term88;

    public TreeUtils_CSVTreeTableRowIterator_init_3739146470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term69 = (char[]) newCharArray(6);
        Object term82 = newInstance(Class.forName("java.lang.Object"));
        char[] term83 = (char[]) newCharArray(2);
        setField(term68, term68.getClass(), "in", null);
        setCharElement(term69, 0, 'P');
        setCharElement(term69, 1, 'A');
        setCharElement(term69, 2, 'E');
        setCharElement(term69, 3, 'B');
        setCharElement(term69, 4, 't');
        setCharElement(term69, 5, 'n');
        setField(term68, term68.getClass(), "cb", term69);
        setIntField(term68, term68.getClass(), "nChars", 1134449235);
        setIntField(term68, term68.getClass(), "nextChar", -883034806);
        setIntField(term68, term68.getClass(), "markedChar", 1585847225);
        setIntField(term68, term68.getClass(), "readAheadLimit", 597278769);
        setBooleanField(term68, term68.getClass(), "skipLF", true);
        setBooleanField(term68, term68.getClass(), "markedSkipLF", false);
        setField(term68, term68.getClass(), "lock", term82);
        setCharElement(term83, 0, 'Z');
        setCharElement(term83, 1, 't');
        setField(term68, term68.getClass(), "skipBuffer", term83);
        term86 = new Integer(-1685132342);
        term88 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term68;
        args[1] = term86;
        args[2] = term88;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


