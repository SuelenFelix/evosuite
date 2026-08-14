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

public class NotFollowedBy_match_20821936386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4056;

    public NotFollowedBy_match_20821936386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4056 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        setField(term4056, term4056.getClass(), "labeledSubClauses", null);
        setField(term4056, term4056.getClass(), "rules", null);
        setField(term4056, term4056.getClass(), "seedParentClauses", null);
        setBooleanField(term4056, term4056.getClass(), "canMatchZeroChars", false);
        setIntField(term4056, term4056.getClass(), "clauseIdx", 0);
        setField(term4056, term4056.getClass(), "toStringCached", null);
        setField(term4056, term4056.getClass(), "toStringWithRuleNameCached", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "match", argTypes, term4056, args);
    }

};


