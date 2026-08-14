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

public class ASTNodeLabel_determineWhetherCanMatchZeroChars_13264309795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324;

    public ASTNodeLabel_determineWhetherCanMatchZeroChars_13264309795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1324 = newInstance(Class.forName("pikaparser.clause.aux.ASTNodeLabel"));
        setField(term1324, term1324.getClass(), "astNodeLabel", null);
        setField(term1324, term1324.getClass(), "labeledSubClauses", null);
        setField(term1324, term1324.getClass(), "rules", null);
        setField(term1324, term1324.getClass(), "seedParentClauses", null);
        setBooleanField(term1324, term1324.getClass(), "canMatchZeroChars", false);
        setIntField(term1324, term1324.getClass(), "clauseIdx", 0);
        setField(term1324, term1324.getClass(), "toStringCached", null);
        setField(term1324, term1324.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.ASTNodeLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1324, args);
    }

};


