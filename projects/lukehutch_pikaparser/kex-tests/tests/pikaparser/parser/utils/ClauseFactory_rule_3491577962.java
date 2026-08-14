package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class ClauseFactory_rule_3491577962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;
     Object enum3;

    public ClauseFactory_rule_3491577962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2049 = new Integer(-1371869594);
        Class<? extends Object> term2071 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2070 = ((Class) term2071).getDeclaredField((String) "RIGHT");
        ((Field) term2070).setAccessible(true);
        enum3 = ((Field) term2070).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ClauseFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("pikaparser.grammar.Rule$Associativity");
        argTypes[3] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[4];
        args[0] = "eVpkWxjuki";
        args[1] = term2049;
        args[2] = enum3;
        args[3] = null;
        callMethod(klass, "rule", argTypes, null, args);
    }

};


