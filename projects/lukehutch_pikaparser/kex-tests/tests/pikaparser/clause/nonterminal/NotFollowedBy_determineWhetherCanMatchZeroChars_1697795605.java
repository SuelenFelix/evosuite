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

public class NotFollowedBy_determineWhetherCanMatchZeroChars_1697795605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4053;

    public NotFollowedBy_determineWhetherCanMatchZeroChars_1697795605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4053 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        setField(term4053, term4053.getClass(), "labeledSubClauses", null);
        setField(term4053, term4053.getClass(), "rules", null);
        setField(term4053, term4053.getClass(), "seedParentClauses", null);
        setBooleanField(term4053, term4053.getClass(), "canMatchZeroChars", false);
        setIntField(term4053, term4053.getClass(), "clauseIdx", 0);
        setField(term4053, term4053.getClass(), "toStringCached", null);
        setField(term4053, term4053.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term4053, args);
    }

};


