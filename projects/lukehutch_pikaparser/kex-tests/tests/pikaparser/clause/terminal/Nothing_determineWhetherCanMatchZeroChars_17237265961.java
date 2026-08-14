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

public class Nothing_determineWhetherCanMatchZeroChars_17237265961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1376;

    public Nothing_determineWhetherCanMatchZeroChars_17237265961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1419 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1418 = ((Class) term1419).getDeclaredField((String) "LEFT");
        ((Field) term1418).setAccessible(true);
        Object enum5 = ((Field) term1418).get((Object) null);
        Object term1380 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1385 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1380, term1380.getClass(), "ruleName", "");
        setIntField(term1380, term1380.getClass(), "precedence", 767834723);
        setField(term1380, term1380.getClass(), "associativity", enum5);
        setField(term1385, term1385.getClass(), "clause", null);
        setField(term1385, term1385.getClass(), "astNodeLabel", null);
        setField(term1380, term1380.getClass(), "labeledClause", term1385);
        ArrayList term1378 = new ArrayList();
        ((ArrayList) term1378).add(term1380);
        ArrayList term1388 = new ArrayList();
        term1376 = newInstance(Class.forName("pikaparser.clause.terminal.Nothing"));
        Object[] term1377 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term1376, term1376.getClass(), "labeledSubClauses", term1377);
        setField(term1376, term1376.getClass(), "rules", term1378);
        setField(term1376, term1376.getClass(), "seedParentClauses", term1388);
        setBooleanField(term1376, term1376.getClass(), "canMatchZeroChars", true);
        setIntField(term1376, term1376.getClass(), "clauseIdx", -602026508);
        setField(term1376, term1376.getClass(), "toStringCached", "jDtqGUpnZN");
        setField(term1376, term1376.getClass(), "toStringWithRuleNameCached", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Nothing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1376, args);
    }

};


