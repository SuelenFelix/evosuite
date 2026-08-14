package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharSet_toString_19046232088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5143;

    public CharSet_toString_19046232088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5143 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        setField(term5143, term5143.getClass(), "chars", null);
        setField(term5143, term5143.getClass(), "invertedChars", null);
        setField(term5143, term5143.getClass(), "labeledSubClauses", null);
        setField(term5143, term5143.getClass(), "rules", null);
        setField(term5143, term5143.getClass(), "seedParentClauses", null);
        setBooleanField(term5143, term5143.getClass(), "canMatchZeroChars", false);
        setIntField(term5143, term5143.getClass(), "clauseIdx", 0);
        setField(term5143, term5143.getClass(), "toStringCached", null);
        setField(term5143, term5143.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5143, args);
    }

};


