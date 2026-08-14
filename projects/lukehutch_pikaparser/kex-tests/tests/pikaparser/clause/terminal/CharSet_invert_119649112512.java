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

public class CharSet_invert_119649112512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5146;

    public CharSet_invert_119649112512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5146 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        setField(term5146, term5146.getClass(), "chars", null);
        setField(term5146, term5146.getClass(), "invertedChars", null);
        setField(term5146, term5146.getClass(), "labeledSubClauses", null);
        setField(term5146, term5146.getClass(), "rules", null);
        setField(term5146, term5146.getClass(), "seedParentClauses", null);
        setBooleanField(term5146, term5146.getClass(), "canMatchZeroChars", false);
        setIntField(term5146, term5146.getClass(), "clauseIdx", 0);
        setField(term5146, term5146.getClass(), "toStringCached", null);
        setField(term5146, term5146.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "invert", argTypes, term5146, args);
    }

};


