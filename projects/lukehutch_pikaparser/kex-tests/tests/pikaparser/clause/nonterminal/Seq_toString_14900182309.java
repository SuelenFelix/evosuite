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

public class Seq_toString_14900182309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1766;

    public Seq_toString_14900182309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1766 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        setField(term1766, term1766.getClass(), "labeledSubClauses", null);
        setField(term1766, term1766.getClass(), "rules", null);
        setField(term1766, term1766.getClass(), "seedParentClauses", null);
        setBooleanField(term1766, term1766.getClass(), "canMatchZeroChars", false);
        setIntField(term1766, term1766.getClass(), "clauseIdx", 0);
        setField(term1766, term1766.getClass(), "toStringCached", null);
        setField(term1766, term1766.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1766, args);
    }

};


