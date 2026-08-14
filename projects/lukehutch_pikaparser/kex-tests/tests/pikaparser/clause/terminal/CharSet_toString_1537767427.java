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
import java.lang.Integer;
import java.lang.Boolean;

public class CharSet_toString_1537767427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14218;
     Object term14223;
     Object term14225;
     Object term14227;

    public CharSet_toString_1537767427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14218 = newInstance(Class.forName("java.util.BitSet"));
        long[] term14219 = (long[]) newLongArray(1);
        setField(term14218, term14218.getClass(), "words", term14219);
        setIntField(term14218, term14218.getClass(), "wordsInUse", -2070466617);
        setBooleanField(term14218, term14218.getClass(), "sizeIsSticky", false);
        term14223 = new Integer(-1127721881);
        term14225 = new Boolean(false);
        term14227 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term14228 = (byte[]) newByteArray(16);
        setField(term14227, term14227.getClass(), "value", term14228);
        setByteField(term14227, term14227.getClass(), "coder", (byte) 47);
        setIntField(term14227, term14227.getClass(), "count", 1074848808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[4];
        args[0] = term14218;
        args[1] = term14223;
        args[2] = term14225;
        args[3] = term14227;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


