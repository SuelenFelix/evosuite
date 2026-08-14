package pikaparser.clause.nonterminal;

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
import static pikaparser.clause.nonterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class NotFollowedBy_determineWhetherCanMatchZeroChars_1697795601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2904;

    public NotFollowedBy_determineWhetherCanMatchZeroChars_1697795601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2997 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2996 = ((Class) term2997).getDeclaredField((String) "LEFT");
        ((Field) term2996).setAccessible(true);
        Object enum7 = ((Field) term2996).get((Object) null);
        Object term2934 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2939 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2934, term2934.getClass(), "ruleName", "");
        setIntField(term2934, term2934.getClass(), "precedence", 292681826);
        setField(term2934, term2934.getClass(), "associativity", enum7);
        setField(term2939, term2939.getClass(), "clause", null);
        setField(term2939, term2939.getClass(), "astNodeLabel", null);
        setField(term2934, term2934.getClass(), "labeledClause", term2939);
        Object term2940 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2943 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2940, term2940.getClass(), "ruleName", "");
        setIntField(term2940, term2940.getClass(), "precedence", 458147407);
        setField(term2940, term2940.getClass(), "associativity", enum7);
        setField(term2943, term2943.getClass(), "clause", null);
        setField(term2943, term2943.getClass(), "astNodeLabel", null);
        setField(term2940, term2940.getClass(), "labeledClause", term2943);
        ArrayList term2932 = new ArrayList();
        ((ArrayList) term2932).add(term2934);
        ((ArrayList) term2932).add(term2940);
        ArrayList term2946 = new ArrayList();
        ((ArrayList) term2946).add((Object)null);
        term2904 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        Object[] term2905 = (Object[]) newArray("pikaparser.ast.LabeledClause", 2);
        Object term2906 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2919 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2906, term2906.getClass(), "clause", null);
        setField(term2906, term2906.getClass(), "astNodeLabel", "vjxIhXHxGR");
        setElement(term2905, 0, term2906);
        setField(term2919, term2919.getClass(), "clause", null);
        setField(term2919, term2919.getClass(), "astNodeLabel", "QXzGXbEXMu");
        setElement(term2905, 1, term2919);
        setField(term2904, term2904.getClass(), "labeledSubClauses", term2905);
        setField(term2904, term2904.getClass(), "rules", term2932);
        setField(term2904, term2904.getClass(), "seedParentClauses", term2946);
        setBooleanField(term2904, term2904.getClass(), "canMatchZeroChars", true);
        setIntField(term2904, term2904.getClass(), "clauseIdx", -184153539);
        setField(term2904, term2904.getClass(), "toStringCached", "fztQhjqwdP");
        setField(term2904, term2904.getClass(), "toStringWithRuleNameCached", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term2904, args);
    }

};


