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

public class Start_toString_8775654067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373;

    public Start_toString_8775654067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1373 = newInstance(Class.forName("pikaparser.clause.terminal.Start"));
        setField(term1373, term1373.getClass(), "labeledSubClauses", null);
        setField(term1373, term1373.getClass(), "rules", null);
        setField(term1373, term1373.getClass(), "seedParentClauses", null);
        setBooleanField(term1373, term1373.getClass(), "canMatchZeroChars", false);
        setIntField(term1373, term1373.getClass(), "clauseIdx", 0);
        setField(term1373, term1373.getClass(), "toStringCached", null);
        setField(term1373, term1373.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Start");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1373, args);
    }

};


