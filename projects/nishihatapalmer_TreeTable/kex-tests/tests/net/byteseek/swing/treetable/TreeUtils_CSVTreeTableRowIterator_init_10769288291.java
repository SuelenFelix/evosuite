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
import java.lang.Character;

public class TreeUtils_CSVTreeTableRowIterator_init_10769288291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term121;
     Object term123;
     Object term125;

    public TreeUtils_CSVTreeTableRowIterator_init_10769288291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term99 = (char[]) newCharArray(6);
        Object term112 = newInstance(Class.forName("java.lang.Object"));
        char[] term113 = (char[]) newCharArray(7);
        setField(term98, term98.getClass(), "in", null);
        setCharElement(term99, 0, 'T');
        setCharElement(term99, 1, 'D');
        setCharElement(term99, 2, 's');
        setCharElement(term99, 3, 'j');
        setCharElement(term99, 4, 'l');
        setCharElement(term99, 5, 'J');
        setField(term98, term98.getClass(), "cb", term99);
        setIntField(term98, term98.getClass(), "nChars", 1622346318);
        setIntField(term98, term98.getClass(), "nextChar", 1048535127);
        setIntField(term98, term98.getClass(), "markedChar", -655067527);
        setIntField(term98, term98.getClass(), "readAheadLimit", -6029667);
        setBooleanField(term98, term98.getClass(), "skipLF", false);
        setBooleanField(term98, term98.getClass(), "markedSkipLF", true);
        setField(term98, term98.getClass(), "lock", term112);
        setCharElement(term113, 0, 'A');
        setCharElement(term113, 1, 'E');
        setCharElement(term113, 2, 't');
        setCharElement(term113, 3, 'R');
        setCharElement(term113, 4, 'r');
        setCharElement(term113, 5, 'b');
        setCharElement(term113, 6, 'M');
        setField(term98, term98.getClass(), "skipBuffer", term113);
        term121 = new Integer(-2068769794);
        term123 = new Integer(-117576464);
        term125 = new Character('u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$CSVTreeTableRowIterator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = char.class;
        Object[] args = new Object[4];
        args[0] = term98;
        args[1] = term121;
        args[2] = term123;
        args[3] = term125;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


