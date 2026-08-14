package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharSet_init_10908739783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12754;

    public CharSet_init_10908739783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12754 = newInstance(Class.forName("java.util.BitSet"));
        long[] term12755 = (long[]) newLongArray(1);
        setField(term12754, term12754.getClass(), "words", term12755);
        setIntField(term12754, term12754.getClass(), "wordsInUse", -919416536);
        setBooleanField(term12754, term12754.getClass(), "sizeIsSticky", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.BitSet");
        Object[] args = new Object[1];
        args[0] = term12754;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


