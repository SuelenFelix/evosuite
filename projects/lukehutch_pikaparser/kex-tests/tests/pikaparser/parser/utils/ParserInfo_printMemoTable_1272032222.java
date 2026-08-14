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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ParserInfo_printMemoTable_1272032222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3268;

    public ParserInfo_printMemoTable_1272032222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3272 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3272, term3272.getClass(), "ruleName", null);
        setIntField(term3272, term3272.getClass(), "precedence", 339854490);
        setField(term3272, term3272.getClass(), "associativity", null);
        setField(term3272, term3272.getClass(), "labeledClause", null);
        Object term3274 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3274, term3274.getClass(), "ruleName", null);
        setIntField(term3274, term3274.getClass(), "precedence", -615654495);
        setField(term3274, term3274.getClass(), "associativity", null);
        setField(term3274, term3274.getClass(), "labeledClause", null);
        Object term3276 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3276, term3276.getClass(), "ruleName", null);
        setIntField(term3276, term3276.getClass(), "precedence", -1476117762);
        setField(term3276, term3276.getClass(), "associativity", null);
        setField(term3276, term3276.getClass(), "labeledClause", null);
        Object term3278 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3278, term3278.getClass(), "ruleName", null);
        setIntField(term3278, term3278.getClass(), "precedence", -341962980);
        setField(term3278, term3278.getClass(), "associativity", null);
        setField(term3278, term3278.getClass(), "labeledClause", null);
        Object term3280 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3280, term3280.getClass(), "ruleName", null);
        setIntField(term3280, term3280.getClass(), "precedence", 1532716628);
        setField(term3280, term3280.getClass(), "associativity", null);
        setField(term3280, term3280.getClass(), "labeledClause", null);
        Object term3282 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3282, term3282.getClass(), "ruleName", null);
        setIntField(term3282, term3282.getClass(), "precedence", -1801760683);
        setField(term3282, term3282.getClass(), "associativity", null);
        setField(term3282, term3282.getClass(), "labeledClause", null);
        Object term3284 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3284, term3284.getClass(), "ruleName", null);
        setIntField(term3284, term3284.getClass(), "precedence", 1141317871);
        setField(term3284, term3284.getClass(), "associativity", null);
        setField(term3284, term3284.getClass(), "labeledClause", null);
        ArrayList term3270 = new ArrayList();
        ((ArrayList) term3270).add(term3272);
        ((ArrayList) term3270).add(term3274);
        ((ArrayList) term3270).add(term3276);
        ((ArrayList) term3270).add(term3278);
        ((ArrayList) term3270).add(term3280);
        ((ArrayList) term3270).add(term3282);
        ((ArrayList) term3270).add(term3284);
        HashMap term3288 = new HashMap();
        ArrayList term3296 = new ArrayList();
        ((ArrayList) term3296).add((Object)null);
        ((ArrayList) term3296).add((Object)null);
        ((ArrayList) term3296).add((Object)null);
        term3268 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3269 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3312 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3314 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3268, term3268.getClass(), "memoTable", null);
        setField(term3269, term3269.getClass(), "allRules", term3270);
        setField(term3269, term3269.getClass(), "ruleNameWithPrecedenceToRule", term3288);
        setField(term3269, term3269.getClass(), "allClauses", term3296);
        setField(term3268, term3268.getClass(), "grammar", term3269);
        setField(term3268, term3268.getClass(), "input", "XYtryyobou");
        setIntField(term3312, term3312.getClass(), "value", 568599855);
        setField(term3268, term3268.getClass(), "numMatchObjectsCreated", term3312);
        setIntField(term3314, term3314.getClass(), "value", 1162663216);
        setField(term3268, term3268.getClass(), "numMatchObjectsMemoized", term3314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[1];
        args[0] = term3268;
        callMethod(klass, "printMemoTable", argTypes, null, args);
    }

};


