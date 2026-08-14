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

public class CharSet_toString_1537767426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4451;
     Object term4456;
     Object term4458;
     Object term4460;

    public CharSet_toString_1537767426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4451 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4452 = (long[]) newLongArray(1);
        setField(term4451, term4451.getClass(), "words", term4452);
        setIntField(term4451, term4451.getClass(), "wordsInUse", -1963434938);
        setBooleanField(term4451, term4451.getClass(), "sizeIsSticky", true);
        term4456 = new Integer(906181092);
        term4458 = new Boolean(true);
        term4460 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4461 = (byte[]) newByteArray(16);
        setField(term4460, term4460.getClass(), "value", term4461);
        setByteField(term4460, term4460.getClass(), "coder", (byte) 47);
        setIntField(term4460, term4460.getClass(), "count", 1045657203);
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
        args[0] = term4451;
        args[1] = term4456;
        args[2] = term4458;
        args[3] = term4460;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


