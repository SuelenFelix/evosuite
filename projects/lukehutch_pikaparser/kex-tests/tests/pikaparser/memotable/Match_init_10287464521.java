package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Match_init_10287464521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term1003;
     Object term1005;

    public Match_init_10287464521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1001 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term1001, term1001.getClass(), "clause", null);
        setIntField(term1001, term1001.getClass(), "startPos", -1239406390);
        term1003 = new Integer(1557431527);
        term1005 = (Object[]) newArray("pikaparser.memotable.Match", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.Match");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("pikaparser.memotable.Match"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1001;
        args[1] = term1003;
        args[2] = term1005;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


