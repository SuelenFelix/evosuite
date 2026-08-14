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

public class Nothing_toString_17556052253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2197;

    public Nothing_toString_17556052253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2244 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2243 = ((Class) term2244).getDeclaredField((String) "RIGHT");
        ((Field) term2243).setAccessible(true);
        Object enum8 = ((Field) term2243).get((Object) null);
        Object term2201 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2206 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2201, term2201.getClass(), "ruleName", "");
        setIntField(term2201, term2201.getClass(), "precedence", 493620644);
        setField(term2201, term2201.getClass(), "associativity", enum8);
        setField(term2206, term2206.getClass(), "clause", null);
        setField(term2206, term2206.getClass(), "astNodeLabel", null);
        setField(term2201, term2201.getClass(), "labeledClause", term2206);
        Object term2207 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2210 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2207, term2207.getClass(), "ruleName", "");
        setIntField(term2207, term2207.getClass(), "precedence", 1328271830);
        setField(term2207, term2207.getClass(), "associativity", enum8);
        setField(term2210, term2210.getClass(), "clause", null);
        setField(term2210, term2210.getClass(), "astNodeLabel", null);
        setField(term2207, term2207.getClass(), "labeledClause", term2210);
        ArrayList term2199 = new ArrayList();
        ((ArrayList) term2199).add(term2201);
        ((ArrayList) term2199).add(term2207);
        ArrayList term2213 = new ArrayList();
        term2197 = newInstance(Class.forName("pikaparser.clause.terminal.Nothing"));
        Object[] term2198 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term2197, term2197.getClass(), "labeledSubClauses", term2198);
        setField(term2197, term2197.getClass(), "rules", term2199);
        setField(term2197, term2197.getClass(), "seedParentClauses", term2213);
        setBooleanField(term2197, term2197.getClass(), "canMatchZeroChars", true);
        setIntField(term2197, term2197.getClass(), "clauseIdx", 1596070772);
        setField(term2197, term2197.getClass(), "toStringCached", "IgRJUzaCwW");
        setField(term2197, term2197.getClass(), "toStringWithRuleNameCached", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Nothing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2197, args);
    }

};


