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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class MemoTable_init_19359476420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MemoTable_init_19359476420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term74 = ((Class) term75).getDeclaredField((String) "RIGHT");
        ((Field) term74).setAccessible(true);
        Object enum0 = ((Field) term74).get((Object) null);
        Object term4 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term9 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4, term4.getClass(), "ruleName", "");
        setIntField(term4, term4.getClass(), "precedence", 568599855);
        setField(term4, term4.getClass(), "associativity", enum0);
        setField(term9, term9.getClass(), "clause", null);
        setField(term9, term9.getClass(), "astNodeLabel", null);
        setField(term4, term4.getClass(), "labeledClause", term9);
        Object term10 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term13 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term10, term10.getClass(), "ruleName", "");
        setIntField(term10, term10.getClass(), "precedence", 1162663216);
        setField(term10, term10.getClass(), "associativity", enum0);
        setField(term13, term13.getClass(), "clause", null);
        setField(term13, term13.getClass(), "astNodeLabel", null);
        setField(term10, term10.getClass(), "labeledClause", term13);
        Object term14 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term17 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term14, term14.getClass(), "ruleName", "");
        setIntField(term14, term14.getClass(), "precedence", 1484323161);
        setField(term14, term14.getClass(), "associativity", enum0);
        setField(term17, term17.getClass(), "clause", null);
        setField(term17, term17.getClass(), "astNodeLabel", null);
        setField(term14, term14.getClass(), "labeledClause", term17);
        Object term18 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term21 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term18, term18.getClass(), "ruleName", "");
        setIntField(term18, term18.getClass(), "precedence", 391863371);
        setField(term18, term18.getClass(), "associativity", enum0);
        setField(term21, term21.getClass(), "clause", null);
        setField(term21, term21.getClass(), "astNodeLabel", null);
        setField(term18, term18.getClass(), "labeledClause", term21);
        Class<? extends Object> term282 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term281 = ((Class) term282).getDeclaredField((String) "RIGHT");
        ((Field) term281).setAccessible(true);
        Object enum1 = ((Field) term281).get((Object) null);
        Object term22 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term27 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term22, term22.getClass(), "ruleName", "");
        setIntField(term22, term22.getClass(), "precedence", -1922583790);
        setField(term22, term22.getClass(), "associativity", enum1);
        setField(term27, term27.getClass(), "clause", null);
        setField(term27, term27.getClass(), "astNodeLabel", null);
        setField(term22, term22.getClass(), "labeledClause", term27);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term10);
        ((ArrayList) term2).add(term14);
        ((ArrayList) term2).add(term18);
        ((ArrayList) term2).add(term22);
        HashMap term30 = new HashMap();
        ArrayList term41 = new ArrayList();
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        ((ArrayList) term41).add((Object)null);
        term1 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term1, term1.getClass(), "allRules", term2);
        setField(term1, term1.getClass(), "ruleNameWithPrecedenceToRule", term30);
        setField(term1, term1.getClass(), "allClauses", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.grammar.Grammar");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = "LQFpaHEwXR";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


