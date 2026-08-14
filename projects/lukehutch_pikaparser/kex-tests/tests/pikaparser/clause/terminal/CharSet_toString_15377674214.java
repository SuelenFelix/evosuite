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
import java.lang.Integer;
import java.lang.Boolean;

public class CharSet_toString_15377674214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14532;
     Object term14535;
     Object term14537;

    public CharSet_toString_15377674214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14532 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        setField(term14532, term14532.getClass(), "chars", null);
        setField(term14532, term14532.getClass(), "invertedChars", null);
        setField(term14532, term14532.getClass(), "labeledSubClauses", null);
        setField(term14532, term14532.getClass(), "rules", null);
        setField(term14532, term14532.getClass(), "seedParentClauses", null);
        setBooleanField(term14532, term14532.getClass(), "canMatchZeroChars", false);
        setIntField(term14532, term14532.getClass(), "clauseIdx", 0);
        setField(term14532, term14532.getClass(), "toStringCached", null);
        setField(term14532, term14532.getClass(), "toStringWithRuleNameCached", null);
        term14535 = new Integer(0);
        term14537 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term14535;
        args[2] = term14537;
        args[3] = null;
        callMethod(klass, "toString", argTypes, term14532, args);
    }

};


