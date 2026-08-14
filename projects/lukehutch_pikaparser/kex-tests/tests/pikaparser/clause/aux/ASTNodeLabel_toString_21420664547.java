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

public class ASTNodeLabel_toString_21420664547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1330;

    public ASTNodeLabel_toString_21420664547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1330 = newInstance(Class.forName("pikaparser.clause.aux.ASTNodeLabel"));
        setField(term1330, term1330.getClass(), "astNodeLabel", null);
        setField(term1330, term1330.getClass(), "labeledSubClauses", null);
        setField(term1330, term1330.getClass(), "rules", null);
        setField(term1330, term1330.getClass(), "seedParentClauses", null);
        setBooleanField(term1330, term1330.getClass(), "canMatchZeroChars", false);
        setIntField(term1330, term1330.getClass(), "clauseIdx", 0);
        setField(term1330, term1330.getClass(), "toStringCached", null);
        setField(term1330, term1330.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.ASTNodeLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1330, args);
    }

};


