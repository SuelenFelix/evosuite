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

public class RuleRef_toString_20088042274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5127;

    public RuleRef_toString_20088042274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5307 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5306 = ((Class) term5307).getDeclaredField((String) "LEFT");
        ((Field) term5306).setAccessible(true);
        Object enum15 = ((Field) term5306).get((Object) null);
        Object term5208 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5213 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5208, term5208.getClass(), "ruleName", "");
        setIntField(term5208, term5208.getClass(), "precedence", -1263114719);
        setField(term5208, term5208.getClass(), "associativity", enum15);
        setField(term5213, term5213.getClass(), "clause", null);
        setField(term5213, term5213.getClass(), "astNodeLabel", null);
        setField(term5208, term5208.getClass(), "labeledClause", term5213);
        ArrayList term5206 = new ArrayList();
        ((ArrayList) term5206).add(term5208);
        ArrayList term5216 = new ArrayList();
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        ((ArrayList) term5216).add((Object)null);
        term5127 = newInstance(Class.forName("pikaparser.clause.aux.RuleRef"));
        Object[] term5140 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term5141 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5154 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5167 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5180 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5193 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5127, term5127.getClass(), "refdRuleName", "wfaXBpWAUH");
        setField(term5141, term5141.getClass(), "clause", null);
        setField(term5141, term5141.getClass(), "astNodeLabel", "VMeAzAHwZj");
        setElement(term5140, 0, term5141);
        setField(term5154, term5154.getClass(), "clause", null);
        setField(term5154, term5154.getClass(), "astNodeLabel", "PznxWXsZME");
        setElement(term5140, 1, term5154);
        setField(term5167, term5167.getClass(), "clause", null);
        setField(term5167, term5167.getClass(), "astNodeLabel", "ZzIujlwVsw");
        setElement(term5140, 2, term5167);
        setField(term5180, term5180.getClass(), "clause", null);
        setField(term5180, term5180.getClass(), "astNodeLabel", "LWyEaeIyAo");
        setElement(term5140, 3, term5180);
        setField(term5193, term5193.getClass(), "clause", null);
        setField(term5193, term5193.getClass(), "astNodeLabel", "yVMkkQhvmN");
        setElement(term5140, 4, term5193);
        setField(term5127, term5127.getClass(), "labeledSubClauses", term5140);
        setField(term5127, term5127.getClass(), "rules", term5206);
        setField(term5127, term5127.getClass(), "seedParentClauses", term5216);
        setBooleanField(term5127, term5127.getClass(), "canMatchZeroChars", true);
        setIntField(term5127, term5127.getClass(), "clauseIdx", -894662986);
        setField(term5127, term5127.getClass(), "toStringCached", "GgZWSjxjyE");
        setField(term5127, term5127.getClass(), "toStringWithRuleNameCached", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.RuleRef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5127, args);
    }

};


