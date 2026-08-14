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

public class CharSeq_match_8078446986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6869;

    public CharSeq_match_8078446986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6869 = newInstance(Class.forName("pikaparser.clause.terminal.CharSeq"));
        setField(term6869, term6869.getClass(), "str", null);
        setBooleanField(term6869, term6869.getClass(), "ignoreCase", false);
        setField(term6869, term6869.getClass(), "labeledSubClauses", null);
        setField(term6869, term6869.getClass(), "rules", null);
        setField(term6869, term6869.getClass(), "seedParentClauses", null);
        setBooleanField(term6869, term6869.getClass(), "canMatchZeroChars", false);
        setIntField(term6869, term6869.getClass(), "clauseIdx", 0);
        setField(term6869, term6869.getClass(), "toStringCached", null);
        setField(term6869, term6869.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSeq");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "match", argTypes, term6869, args);
    }

};


