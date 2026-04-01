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
     Object term369413;
     Object term369452;

    public TreeUtils_processCSVHeaders_12473675453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369413 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term369414 = (char[]) newCharArray(4);
        Object term369425 = newInstance(Class.forName("java.lang.Object"));
        char[] term369426 = (char[]) newCharArray(1);
        setField(term369413, term369413.getClass(), "in", null);
        setCharElement(term369414, 0, 'D');
        setCharElement(term369414, 1, 'Y');
        setCharElement(term369414, 2, 'F');
        setCharElement(term369414, 3, 's');
        setField(term369413, term369413.getClass(), "cb", term369414);
        setIntField(term369413, term369413.getClass(), "nChars", 12697707);
        setIntField(term369413, term369413.getClass(), "nextChar", -971143668);
        setIntField(term369413, term369413.getClass(), "markedChar", 127763053);
        setIntField(term369413, term369413.getClass(), "readAheadLimit", 968035207);
        setBooleanField(term369413, term369413.getClass(), "skipLF", false);
        setBooleanField(term369413, term369413.getClass(), "markedSkipLF", false);
        setField(term369413, term369413.getClass(), "lock", term369425);
        setCharElement(term369426, 0, 'j');
        setField(term369413, term369413.getClass(), "skipBuffer", term369426);
        term369452 = new Character('J');
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
        args[0] = term369413;
        args[1] = "RYdKCNNMBR";
        args[2] = "yGtHPyvYiQ";
        args[3] = term369452;
        callMethod(klass, "processCSVHeaders", argTypes, null, args);
    }

};


