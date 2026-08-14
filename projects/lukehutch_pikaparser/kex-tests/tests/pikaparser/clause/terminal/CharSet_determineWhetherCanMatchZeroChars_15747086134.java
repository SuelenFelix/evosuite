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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class CharSet_determineWhetherCanMatchZeroChars_15747086134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3453;

    public CharSet_determineWhetherCanMatchZeroChars_15747086134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3534 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3533 = ((Class) term3534).getDeclaredField((String) "RIGHT");
        ((Field) term3533).setAccessible(true);
        Object enum11 = ((Field) term3533).get((Object) null);
        Object term3467 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3472 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3467, term3467.getClass(), "ruleName", "");
        setIntField(term3467, term3467.getClass(), "precedence", -556405712);
        setField(term3467, term3467.getClass(), "associativity", enum11);
        setField(term3472, term3472.getClass(), "clause", null);
        setField(term3472, term3472.getClass(), "astNodeLabel", null);
        setField(term3467, term3467.getClass(), "labeledClause", term3472);
        Object term3473 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3476 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3473, term3473.getClass(), "ruleName", "");
        setIntField(term3473, term3473.getClass(), "precedence", -1772434990);
        setField(term3473, term3473.getClass(), "associativity", enum11);
        setField(term3476, term3476.getClass(), "clause", null);
        setField(term3476, term3476.getClass(), "astNodeLabel", null);
        setField(term3473, term3473.getClass(), "labeledClause", term3476);
        Class<? extends Object> term3741 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3740 = ((Class) term3741).getDeclaredField((String) "RIGHT");
        ((Field) term3740).setAccessible(true);
        Object enum12 = ((Field) term3740).get((Object) null);
        Object term3477 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3482 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3477, term3477.getClass(), "ruleName", "");
        setIntField(term3477, term3477.getClass(), "precedence", -1845499264);
        setField(term3477, term3477.getClass(), "associativity", enum12);
        setField(term3482, term3482.getClass(), "clause", null);
        setField(term3482, term3482.getClass(), "astNodeLabel", null);
        setField(term3477, term3477.getClass(), "labeledClause", term3482);
        Object term3483 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3486 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3483, term3483.getClass(), "ruleName", "");
        setIntField(term3483, term3483.getClass(), "precedence", -505439934);
        setField(term3483, term3483.getClass(), "associativity", enum11);
        setField(term3486, term3486.getClass(), "clause", null);
        setField(term3486, term3486.getClass(), "astNodeLabel", null);
        setField(term3483, term3483.getClass(), "labeledClause", term3486);
        Object term3487 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3490 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3487, term3487.getClass(), "ruleName", "");
        setIntField(term3487, term3487.getClass(), "precedence", -344842608);
        setField(term3487, term3487.getClass(), "associativity", enum11);
        setField(term3490, term3490.getClass(), "clause", null);
        setField(term3490, term3490.getClass(), "astNodeLabel", null);
        setField(term3487, term3487.getClass(), "labeledClause", term3490);
        Object term3491 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3494 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3491, term3491.getClass(), "ruleName", "");
        setIntField(term3491, term3491.getClass(), "precedence", 941650513);
        setField(term3491, term3491.getClass(), "associativity", enum11);
        setField(term3494, term3494.getClass(), "clause", null);
        setField(term3494, term3494.getClass(), "astNodeLabel", null);
        setField(term3491, term3491.getClass(), "labeledClause", term3494);
        Object term3495 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3498 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3495, term3495.getClass(), "ruleName", "");
        setIntField(term3495, term3495.getClass(), "precedence", 444029505);
        setField(term3495, term3495.getClass(), "associativity", enum12);
        setField(term3498, term3498.getClass(), "clause", null);
        setField(term3498, term3498.getClass(), "astNodeLabel", null);
        setField(term3495, term3495.getClass(), "labeledClause", term3498);
        ArrayList term3465 = new ArrayList();
        ((ArrayList) term3465).add(term3467);
        ((ArrayList) term3465).add(term3473);
        ((ArrayList) term3465).add(term3477);
        ((ArrayList) term3465).add(term3483);
        ((ArrayList) term3465).add(term3487);
        ((ArrayList) term3465).add(term3491);
        ((ArrayList) term3465).add(term3495);
        ArrayList term3501 = new ArrayList();
        ((ArrayList) term3501).add((Object)null);
        ((ArrayList) term3501).add((Object)null);
        term3453 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        Object term3454 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3455 = (long[]) newLongArray(1);
        Object term3459 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3460 = (long[]) newLongArray(1);
        Object[] term3464 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term3454, term3454.getClass(), "words", term3455);
        setIntField(term3454, term3454.getClass(), "wordsInUse", 1442160736);
        setBooleanField(term3454, term3454.getClass(), "sizeIsSticky", true);
        setField(term3453, term3453.getClass(), "chars", term3454);
        setField(term3459, term3459.getClass(), "words", term3460);
        setIntField(term3459, term3459.getClass(), "wordsInUse", 1114000454);
        setBooleanField(term3459, term3459.getClass(), "sizeIsSticky", false);
        setField(term3453, term3453.getClass(), "invertedChars", term3459);
        setField(term3453, term3453.getClass(), "labeledSubClauses", term3464);
        setField(term3453, term3453.getClass(), "rules", term3465);
        setField(term3453, term3453.getClass(), "seedParentClauses", term3501);
        setBooleanField(term3453, term3453.getClass(), "canMatchZeroChars", false);
        setIntField(term3453, term3453.getClass(), "clauseIdx", -1034506028);
        setField(term3453, term3453.getClass(), "toStringCached", "AdxvLJhNLe");
        setField(term3453, term3453.getClass(), "toStringWithRuleNameCached", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term3453, args);
    }

};


