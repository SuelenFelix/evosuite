package pikaparser.clause.aux;

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
import static pikaparser.clause.aux.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RuleRef_toString_20088042277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2972;

    public RuleRef_toString_20088042277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2972 = newInstance(Class.forName("pikaparser.clause.aux.RuleRef"));
        setField(term2972, term2972.getClass(), "refdRuleName", null);
        setField(term2972, term2972.getClass(), "labeledSubClauses", null);
        setField(term2972, term2972.getClass(), "rules", null);
        setField(term2972, term2972.getClass(), "seedParentClauses", null);
        setBooleanField(term2972, term2972.getClass(), "canMatchZeroChars", false);
        setIntField(term2972, term2972.getClass(), "clauseIdx", 0);
        setField(term2972, term2972.getClass(), "toStringCached", null);
        setField(term2972, term2972.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.RuleRef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2972, args);
    }

};


