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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MemoTable_lookUpBestMatch_7318170721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;
     Object term546;

    public MemoTable_lookUpBestMatch_7318170721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term502 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term502, term502.getClass(), "ruleName", null);
        setIntField(term502, term502.getClass(), "precedence", -655067527);
        setField(term502, term502.getClass(), "associativity", null);
        setField(term502, term502.getClass(), "labeledClause", null);
        Object term504 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term504, term504.getClass(), "ruleName", null);
        setIntField(term504, term504.getClass(), "precedence", -6029667);
        setField(term504, term504.getClass(), "associativity", null);
        setField(term504, term504.getClass(), "labeledClause", null);
        Object term506 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term506, term506.getClass(), "ruleName", null);
        setIntField(term506, term506.getClass(), "precedence", -2068769794);
        setField(term506, term506.getClass(), "associativity", null);
        setField(term506, term506.getClass(), "labeledClause", null);
        Object term508 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term508, term508.getClass(), "ruleName", null);
        setIntField(term508, term508.getClass(), "precedence", -117576464);
        setField(term508, term508.getClass(), "associativity", null);
        setField(term508, term508.getClass(), "labeledClause", null);
        Object term510 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term510, term510.getClass(), "ruleName", null);
        setIntField(term510, term510.getClass(), "precedence", -1007160944);
        setField(term510, term510.getClass(), "associativity", null);
        setField(term510, term510.getClass(), "labeledClause", null);
        Object term512 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term512, term512.getClass(), "ruleName", null);
        setIntField(term512, term512.getClass(), "precedence", 1135664017);
        setField(term512, term512.getClass(), "associativity", null);
        setField(term512, term512.getClass(), "labeledClause", null);
        Object term514 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term514, term514.getClass(), "ruleName", null);
        setIntField(term514, term514.getClass(), "precedence", 590364439);
        setField(term514, term514.getClass(), "associativity", null);
        setField(term514, term514.getClass(), "labeledClause", null);
        ArrayList term500 = new ArrayList();
        ((ArrayList) term500).add(term502);
        ((ArrayList) term500).add(term504);
        ((ArrayList) term500).add(term506);
        ((ArrayList) term500).add(term508);
        ((ArrayList) term500).add(term510);
        ((ArrayList) term500).add(term512);
        ((ArrayList) term500).add(term514);
        HashMap term518 = new HashMap();
        ArrayList term526 = new ArrayList();
        ((ArrayList) term526).add((Object)null);
        term498 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term499 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term542 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term544 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term498, term498.getClass(), "memoTable", null);
        setField(term499, term499.getClass(), "allRules", term500);
        setField(term499, term499.getClass(), "ruleNameWithPrecedenceToRule", term518);
        setField(term499, term499.getClass(), "allClauses", term526);
        setField(term498, term498.getClass(), "grammar", term499);
        setField(term498, term498.getClass(), "input", "eZFUvlxvGV");
        setIntField(term542, term542.getClass(), "value", 568599855);
        setField(term498, term498.getClass(), "numMatchObjectsCreated", term542);
        setIntField(term544, term544.getClass(), "value", 1162663216);
        setField(term498, term498.getClass(), "numMatchObjectsMemoized", term544);
        term546 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term546, term546.getClass(), "clause", null);
        setIntField(term546, term546.getClass(), "startPos", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        Object[] args = new Object[1];
        args[0] = term546;
        callMethod(klass, "lookUpBestMatch", argTypes, term498, args);
    }

};


