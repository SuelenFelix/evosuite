package pikaparser.clause.nonterminal;

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
import static pikaparser.clause.nonterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Seq_match_17081704638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1763;

    public Seq_match_17081704638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1763 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        setField(term1763, term1763.getClass(), "labeledSubClauses", null);
        setField(term1763, term1763.getClass(), "rules", null);
        setField(term1763, term1763.getClass(), "seedParentClauses", null);
        setBooleanField(term1763, term1763.getClass(), "canMatchZeroChars", false);
        setIntField(term1763, term1763.getClass(), "clauseIdx", 0);
        setField(term1763, term1763.getClass(), "toStringCached", null);
        setField(term1763, term1763.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "match", argTypes, term1763, args);
    }

};


