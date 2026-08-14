package pikaparser.grammar;

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
import static pikaparser.grammar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class Rule_init_13827060620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object enum0;

    public Rule_init_13827060620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Integer(568599855);
        Class<? extends Object> term51 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term50 = ((Class) term51).getDeclaredField((String) "LEFT");
        ((Field) term50).setAccessible(true);
        enum0 = ((Field) term50).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Rule");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("pikaparser.grammar.Rule$Associativity");
        argTypes[3] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = enum0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


