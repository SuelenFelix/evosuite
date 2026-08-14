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

public class NotFollowedBy_determineWhetherCanMatchZeroChars_1697795602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9374;

    public NotFollowedBy_determineWhetherCanMatchZeroChars_1697795602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9374 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        setField(term9374, term9374.getClass(), "labeledSubClauses", null);
        setField(term9374, term9374.getClass(), "rules", null);
        setField(term9374, term9374.getClass(), "seedParentClauses", null);
        setBooleanField(term9374, term9374.getClass(), "canMatchZeroChars", false);
        setIntField(term9374, term9374.getClass(), "clauseIdx", 0);
        setField(term9374, term9374.getClass(), "toStringCached", null);
        setField(term9374, term9374.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term9374, args);
    }

};


