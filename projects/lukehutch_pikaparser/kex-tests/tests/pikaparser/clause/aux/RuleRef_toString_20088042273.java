package pikaparser.clause.aux;

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
import static pikaparser.clause.aux.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class RuleRef_toString_20088042273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2301;

    public RuleRef_toString_20088042273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2533 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2532 = ((Class) term2533).getDeclaredField((String) "RIGHT");
        ((Field) term2532).setAccessible(true);
        Object enum6 = ((Field) term2532).get((Object) null);
        Object term2408 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2413 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2408, term2408.getClass(), "ruleName", "");
        setIntField(term2408, term2408.getClass(), "precedence", -2095575670);
        setField(term2408, term2408.getClass(), "associativity", enum6);
        setField(term2413, term2413.getClass(), "clause", null);
        setField(term2413, term2413.getClass(), "astNodeLabel", null);
        setField(term2408, term2408.getClass(), "labeledClause", term2413);
        Class<? extends Object> term2740 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2739 = ((Class) term2740).getDeclaredField((String) "RIGHT");
        ((Field) term2739).setAccessible(true);
        Object enum7 = ((Field) term2739).get((Object) null);
        Object term2414 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2419 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2414, term2414.getClass(), "ruleName", "");
        setIntField(term2414, term2414.getClass(), "precedence", 1225272962);
        setField(term2414, term2414.getClass(), "associativity", enum7);
        setField(term2419, term2419.getClass(), "clause", null);
        setField(term2419, term2419.getClass(), "astNodeLabel", null);
        setField(term2414, term2414.getClass(), "labeledClause", term2419);
        ArrayList term2406 = new ArrayList();
        ((ArrayList) term2406).add(term2408);
        ((ArrayList) term2406).add(term2414);
        ArrayList term2422 = new ArrayList();
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        ((ArrayList) term2422).add((Object)null);
        term2301 = newInstance(Class.forName("pikaparser.clause.aux.RuleRef"));
        Object[] term2314 = (Object[]) newArray("pikaparser.ast.LabeledClause", 7);
        Object term2315 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2328 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2341 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2354 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2367 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2380 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2393 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2301, term2301.getClass(), "refdRuleName", "GVizqqzXpy");
        setField(term2315, term2315.getClass(), "clause", null);
        setField(term2315, term2315.getClass(), "astNodeLabel", "JqXGgAhZPl");
        setElement(term2314, 0, term2315);
        setField(term2328, term2328.getClass(), "clause", null);
        setField(term2328, term2328.getClass(), "astNodeLabel", "jiKYgYHqIS");
        setElement(term2314, 1, term2328);
        setField(term2341, term2341.getClass(), "clause", null);
        setField(term2341, term2341.getClass(), "astNodeLabel", "DfISiziTgG");
        setElement(term2314, 2, term2341);
        setField(term2354, term2354.getClass(), "clause", null);
        setField(term2354, term2354.getClass(), "astNodeLabel", "XqgfKFvPSD");
        setElement(term2314, 3, term2354);
        setField(term2367, term2367.getClass(), "clause", null);
        setField(term2367, term2367.getClass(), "astNodeLabel", "JiVRgTZvKc");
        setElement(term2314, 4, term2367);
        setField(term2380, term2380.getClass(), "clause", null);
        setField(term2380, term2380.getClass(), "astNodeLabel", "XPKmummaqg");
        setElement(term2314, 5, term2380);
        setField(term2393, term2393.getClass(), "clause", null);
        setField(term2393, term2393.getClass(), "astNodeLabel", "BKLfkLiZTH");
        setElement(term2314, 6, term2393);
        setField(term2301, term2301.getClass(), "labeledSubClauses", term2314);
        setField(term2301, term2301.getClass(), "rules", term2406);
        setField(term2301, term2301.getClass(), "seedParentClauses", term2422);
        setBooleanField(term2301, term2301.getClass(), "canMatchZeroChars", true);
        setIntField(term2301, term2301.getClass(), "clauseIdx", 1324040357);
        setField(term2301, term2301.getClass(), "toStringCached", "AWRooQKkdW");
        setField(term2301, term2301.getClass(), "toStringWithRuleNameCached", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.RuleRef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2301, args);
    }

};


