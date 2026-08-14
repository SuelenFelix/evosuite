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

public class OneOrMore_toString_19740718957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2901;

    public OneOrMore_toString_19740718957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2901 = newInstance(Class.forName("pikaparser.clause.nonterminal.OneOrMore"));
        setField(term2901, term2901.getClass(), "labeledSubClauses", null);
        setField(term2901, term2901.getClass(), "rules", null);
        setField(term2901, term2901.getClass(), "seedParentClauses", null);
        setBooleanField(term2901, term2901.getClass(), "canMatchZeroChars", false);
        setIntField(term2901, term2901.getClass(), "clauseIdx", 0);
        setField(term2901, term2901.getClass(), "toStringCached", null);
        setField(term2901, term2901.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.OneOrMore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2901, args);
    }

};


