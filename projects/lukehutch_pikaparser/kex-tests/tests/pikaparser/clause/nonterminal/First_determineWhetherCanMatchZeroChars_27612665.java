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

public class First_determineWhetherCanMatchZeroChars_27612665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5709;

    public First_determineWhetherCanMatchZeroChars_27612665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5709 = newInstance(Class.forName("pikaparser.clause.nonterminal.First"));
        setField(term5709, term5709.getClass(), "labeledSubClauses", null);
        setField(term5709, term5709.getClass(), "rules", null);
        setField(term5709, term5709.getClass(), "seedParentClauses", null);
        setBooleanField(term5709, term5709.getClass(), "canMatchZeroChars", false);
        setIntField(term5709, term5709.getClass(), "clauseIdx", 0);
        setField(term5709, term5709.getClass(), "toStringCached", null);
        setField(term5709, term5709.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.First");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term5709, args);
    }

};


