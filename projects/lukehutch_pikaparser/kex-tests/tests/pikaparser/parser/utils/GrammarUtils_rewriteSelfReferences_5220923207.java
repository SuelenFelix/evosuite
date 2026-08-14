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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class GrammarUtils_rewriteSelfReferences_5220923207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;
     Object term402;
     Object term404;
     Object term418;

    public GrammarUtils_rewriteSelfReferences_5220923207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term445 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term444 = ((Class) term445).getDeclaredField((String) "LEFT");
        ((Field) term444).setAccessible(true);
        enum1 = ((Field) term444).get((Object) null);
        term402 = new Integer(1162663216);
        term404 = new Integer(1484323161);
        term418 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        argTypes[1] = Class.forName("pikaparser.grammar.Rule$Associativity");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = enum1;
        args[2] = term402;
        args[3] = term404;
        args[4] = "jJCZpVmanW";
        args[5] = term418;
        args[6] = "EGtDIRbSSb";
        args[7] = "SzjVpOQTyS";
        callMethod(klass, "rewriteSelfReferences", argTypes, null, args);
    }

};


