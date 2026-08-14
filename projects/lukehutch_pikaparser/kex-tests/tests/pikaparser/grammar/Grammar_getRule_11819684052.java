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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Grammar_getRule_11819684052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;

    public Grammar_getRule_11819684052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1351 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1350 = ((Class) term1351).getDeclaredField((String) "RIGHT");
        ((Field) term1350).setAccessible(true);
        Object enum4 = ((Field) term1350).get((Object) null);
        Object term1309 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1314 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1309, term1309.getClass(), "ruleName", "");
        setIntField(term1309, term1309.getClass(), "precedence", -602026508);
        setField(term1309, term1309.getClass(), "associativity", enum4);
        setField(term1314, term1314.getClass(), "clause", null);
        setField(term1314, term1314.getClass(), "astNodeLabel", null);
        setField(term1309, term1309.getClass(), "labeledClause", term1314);
        Class<? extends Object> term1558 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1557 = ((Class) term1558).getDeclaredField((String) "LEFT");
        ((Field) term1557).setAccessible(true);
        Object enum5 = ((Field) term1557).get((Object) null);
        Object term1315 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1320 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1315, term1315.getClass(), "ruleName", "");
        setIntField(term1315, term1315.getClass(), "precedence", -157887805);
        setField(term1315, term1315.getClass(), "associativity", enum5);
        setField(term1320, term1320.getClass(), "clause", null);
        setField(term1320, term1320.getClass(), "astNodeLabel", null);
        setField(term1315, term1315.getClass(), "labeledClause", term1320);
        ArrayList term1307 = new ArrayList();
        ((ArrayList) term1307).add(term1309);
        ((ArrayList) term1307).add(term1315);
        HashMap term1323 = new HashMap();
        ArrayList term1334 = new ArrayList();
        ((ArrayList) term1334).add((Object)null);
        ((ArrayList) term1334).add((Object)null);
        ((ArrayList) term1334).add((Object)null);
        ((ArrayList) term1334).add((Object)null);
        ((ArrayList) term1334).add((Object)null);
        ((ArrayList) term1334).add((Object)null);
        term1306 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term1306, term1306.getClass(), "allRules", term1307);
        setField(term1306, term1306.getClass(), "ruleNameWithPrecedenceToRule", term1323);
        setField(term1306, term1306.getClass(), "allClauses", term1334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Grammar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "getRule", argTypes, term1306, args);
    }

};


