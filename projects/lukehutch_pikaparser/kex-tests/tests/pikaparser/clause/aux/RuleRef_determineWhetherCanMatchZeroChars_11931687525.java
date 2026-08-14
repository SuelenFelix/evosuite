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

public class RuleRef_determineWhetherCanMatchZeroChars_11931687525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2966;

    public RuleRef_determineWhetherCanMatchZeroChars_11931687525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2966 = newInstance(Class.forName("pikaparser.clause.aux.RuleRef"));
        setField(term2966, term2966.getClass(), "refdRuleName", null);
        setField(term2966, term2966.getClass(), "labeledSubClauses", null);
        setField(term2966, term2966.getClass(), "rules", null);
        setField(term2966, term2966.getClass(), "seedParentClauses", null);
        setBooleanField(term2966, term2966.getClass(), "canMatchZeroChars", false);
        setIntField(term2966, term2966.getClass(), "clauseIdx", 0);
        setField(term2966, term2966.getClass(), "toStringCached", null);
        setField(term2966, term2966.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.RuleRef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term2966, args);
    }

};


