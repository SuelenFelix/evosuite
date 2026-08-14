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

public class ParserInfo_printParseTreeInMemoTableForm_12068876944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3480;

    public ParserInfo_printParseTreeInMemoTableForm_12068876944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3484 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3484, term3484.getClass(), "ruleName", null);
        setIntField(term3484, term3484.getClass(), "precedence", -1515977761);
        setField(term3484, term3484.getClass(), "associativity", null);
        setField(term3484, term3484.getClass(), "labeledClause", null);
        Object term3486 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3486, term3486.getClass(), "ruleName", null);
        setIntField(term3486, term3486.getClass(), "precedence", -1476037190);
        setField(term3486, term3486.getClass(), "associativity", null);
        setField(term3486, term3486.getClass(), "labeledClause", null);
        ArrayList term3482 = new ArrayList();
        ((ArrayList) term3482).add(term3484);
        ((ArrayList) term3482).add(term3486);
        HashMap term3490 = new HashMap();
        ArrayList term3498 = new ArrayList();
        ((ArrayList) term3498).add((Object)null);
        term3480 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3481 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3514 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3516 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3480, term3480.getClass(), "memoTable", null);
        setField(term3481, term3481.getClass(), "allRules", term3482);
        setField(term3481, term3481.getClass(), "ruleNameWithPrecedenceToRule", term3490);
        setField(term3481, term3481.getClass(), "allClauses", term3498);
        setField(term3480, term3480.getClass(), "grammar", term3481);
        setField(term3480, term3480.getClass(), "input", "zUlRdimJtU");
        setIntField(term3514, term3514.getClass(), "value", 1484323161);
        setField(term3480, term3480.getClass(), "numMatchObjectsCreated", term3514);
        setIntField(term3516, term3516.getClass(), "value", 391863371);
        setField(term3480, term3480.getClass(), "numMatchObjectsMemoized", term3516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[1];
        args[0] = term3480;
        callMethod(klass, "printParseTreeInMemoTableForm", argTypes, null, args);
    }

};


