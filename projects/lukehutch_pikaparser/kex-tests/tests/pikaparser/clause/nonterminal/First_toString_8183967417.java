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

public class First_toString_8183967417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5715;

    public First_toString_8183967417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5715 = newInstance(Class.forName("pikaparser.clause.nonterminal.First"));
        setField(term5715, term5715.getClass(), "labeledSubClauses", null);
        setField(term5715, term5715.getClass(), "rules", null);
        setField(term5715, term5715.getClass(), "seedParentClauses", null);
        setBooleanField(term5715, term5715.getClass(), "canMatchZeroChars", false);
        setIntField(term5715, term5715.getClass(), "clauseIdx", 0);
        setField(term5715, term5715.getClass(), "toStringCached", null);
        setField(term5715, term5715.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.First");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5715, args);
    }

};


