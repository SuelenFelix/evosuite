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
import java.lang.Character;

public class TreeUtils_processCSVHeaders_12473675453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369306;
     Object term369355;

    public TreeUtils_processCSVHeaders_12473675453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369306 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term369307 = (char[]) newCharArray(7);
        Object term369321 = newInstance(Class.forName("java.lang.Object"));
        char[] term369322 = (char[]) newCharArray(8);
        setField(term369306, term369306.getClass(), "in", null);
        setCharElement(term369307, 0, 'D');
        setCharElement(term369307, 1, 'Y');
        setCharElement(term369307, 2, 'F');
        setCharElement(term369307, 3, 's');
        setCharElement(term369307, 4, 'j');
        setCharElement(term369307, 5, 'J');
        setCharElement(term369307, 6, 'C');
        setField(term369306, term369306.getClass(), "cb", term369307);
        setIntField(term369306, term369306.getClass(), "nChars", 1071163503);
        setIntField(term369306, term369306.getClass(), "nextChar", -1507726422);
        setIntField(term369306, term369306.getClass(), "markedChar", 171429081);
        setIntField(term369306, term369306.getClass(), "readAheadLimit", 1552107519);
        setBooleanField(term369306, term369306.getClass(), "skipLF", true);
        setBooleanField(term369306, term369306.getClass(), "markedSkipLF", true);
        setField(term369306, term369306.getClass(), "lock", term369321);
        setCharElement(term369322, 0, 'Z');
        setCharElement(term369322, 1, 'p');
        setCharElement(term369322, 2, 'V');
        setCharElement(term369322, 3, 'm');
        setCharElement(term369322, 4, 'a');
        setCharElement(term369322, 5, 'n');
        setCharElement(term369322, 6, 'W');
        setCharElement(term369322, 7, 'E');
        setField(term369306, term369306.getClass(), "skipBuffer", term369322);
        term369355 = new Character('G');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = char.class;
        Object[] args = new Object[4];
        args[0] = term369306;
        args[1] = "RYdKCNNMBR";
        args[2] = "yGtHPyvYiQ";
        args[3] = term369355;
        callMethod(klass, "processCSVHeaders", argTypes, null, args);
    }

};


