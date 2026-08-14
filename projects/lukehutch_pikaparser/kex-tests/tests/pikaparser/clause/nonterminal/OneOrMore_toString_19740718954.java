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

public class OneOrMore_toString_19740718954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8728;

    public OneOrMore_toString_19740718954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8728 = newInstance(Class.forName("pikaparser.clause.nonterminal.OneOrMore"));
        setField(term8728, term8728.getClass(), "labeledSubClauses", null);
        setField(term8728, term8728.getClass(), "rules", null);
        setField(term8728, term8728.getClass(), "seedParentClauses", null);
        setBooleanField(term8728, term8728.getClass(), "canMatchZeroChars", false);
        setIntField(term8728, term8728.getClass(), "clauseIdx", 0);
        setField(term8728, term8728.getClass(), "toStringCached", null);
        setField(term8728, term8728.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.OneOrMore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8728, args);
    }

};


