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

public class FollowedBy_determineWhetherCanMatchZeroChars_17626095536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19369;

    public FollowedBy_determineWhetherCanMatchZeroChars_17626095536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19369 = newInstance(Class.forName("pikaparser.clause.nonterminal.FollowedBy"));
        setField(term19369, term19369.getClass(), "labeledSubClauses", null);
        setField(term19369, term19369.getClass(), "rules", null);
        setField(term19369, term19369.getClass(), "seedParentClauses", null);
        setBooleanField(term19369, term19369.getClass(), "canMatchZeroChars", false);
        setIntField(term19369, term19369.getClass(), "clauseIdx", 0);
        setField(term19369, term19369.getClass(), "toStringCached", null);
        setField(term19369, term19369.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.FollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term19369, args);
    }

};


