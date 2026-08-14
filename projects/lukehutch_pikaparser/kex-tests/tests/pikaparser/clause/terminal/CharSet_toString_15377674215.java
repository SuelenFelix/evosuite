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

public class CharSet_toString_15377674215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5155;
     Object term5158;
     Object term5160;

    public CharSet_toString_15377674215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5155 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        setField(term5155, term5155.getClass(), "chars", null);
        setField(term5155, term5155.getClass(), "invertedChars", null);
        setField(term5155, term5155.getClass(), "labeledSubClauses", null);
        setField(term5155, term5155.getClass(), "rules", null);
        setField(term5155, term5155.getClass(), "seedParentClauses", null);
        setBooleanField(term5155, term5155.getClass(), "canMatchZeroChars", false);
        setIntField(term5155, term5155.getClass(), "clauseIdx", 0);
        setField(term5155, term5155.getClass(), "toStringCached", null);
        setField(term5155, term5155.getClass(), "toStringWithRuleNameCached", null);
        term5158 = new Integer(0);
        term5160 = new Boolean(false);
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
        args[1] = term5158;
        args[2] = term5160;
        args[3] = null;
        callMethod(klass, "toString", argTypes, term5155, args);
    }

};


