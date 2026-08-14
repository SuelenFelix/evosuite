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

public class NotFollowedBy_toString_9854150357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4059;

    public NotFollowedBy_toString_9854150357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4059 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        setField(term4059, term4059.getClass(), "labeledSubClauses", null);
        setField(term4059, term4059.getClass(), "rules", null);
        setField(term4059, term4059.getClass(), "seedParentClauses", null);
        setBooleanField(term4059, term4059.getClass(), "canMatchZeroChars", false);
        setIntField(term4059, term4059.getClass(), "clauseIdx", 0);
        setField(term4059, term4059.getClass(), "toStringCached", null);
        setField(term4059, term4059.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4059, args);
    }

};


