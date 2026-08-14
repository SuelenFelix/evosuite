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

public class Seq_determineWhetherCanMatchZeroChars_6743827556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757;

    public Seq_determineWhetherCanMatchZeroChars_6743827556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1757 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        setField(term1757, term1757.getClass(), "labeledSubClauses", null);
        setField(term1757, term1757.getClass(), "rules", null);
        setField(term1757, term1757.getClass(), "seedParentClauses", null);
        setBooleanField(term1757, term1757.getClass(), "canMatchZeroChars", false);
        setIntField(term1757, term1757.getClass(), "clauseIdx", 0);
        setField(term1757, term1757.getClass(), "toStringCached", null);
        setField(term1757, term1757.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1757, args);
    }

};


