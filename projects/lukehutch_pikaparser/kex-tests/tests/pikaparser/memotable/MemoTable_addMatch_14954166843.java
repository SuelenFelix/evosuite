package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MemoTable_addMatch_14954166843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;
     Object term595;
     Object term597;
     Object term624;

    public MemoTable_addMatch_14954166843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term563 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term563, term563.getClass(), "ruleName", null);
        setIntField(term563, term563.getClass(), "precedence", -157887805);
        setField(term563, term563.getClass(), "associativity", null);
        setField(term563, term563.getClass(), "labeledClause", null);
        ArrayList term561 = new ArrayList();
        ((ArrayList) term561).add(term563);
        HashMap term567 = new HashMap();
        ArrayList term575 = new ArrayList();
        term559 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term560 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term591 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term593 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term559, term559.getClass(), "memoTable", null);
        setField(term560, term560.getClass(), "allRules", term561);
        setField(term560, term560.getClass(), "ruleNameWithPrecedenceToRule", term567);
        setField(term560, term560.getClass(), "allClauses", term575);
        setField(term559, term559.getClass(), "grammar", term560);
        setField(term559, term559.getClass(), "input", "OclPbYPkcH");
        setIntField(term591, term591.getClass(), "value", 1484323161);
        setField(term559, term559.getClass(), "numMatchObjectsCreated", term591);
        setIntField(term593, term593.getClass(), "value", 391863371);
        setField(term559, term559.getClass(), "numMatchObjectsMemoized", term593);
        term595 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term595, term595.getClass(), "clause", null);
        setIntField(term595, term595.getClass(), "startPos", -817164822);
        term597 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term598 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term602 = (Object[]) newArray("pikaparser.memotable.Match", 2);
        Object term603 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term604 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        Object[] term608 = (Object[]) newArray("pikaparser.memotable.Match", 8);
        Object term609 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term612 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term615 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term618 = newInstance(Class.forName("pikaparser.memotable.Match"));
        Object term621 = newInstance(Class.forName("pikaparser.memotable.Match"));
        setField(term598, term598.getClass(), "clause", null);
        setIntField(term598, term598.getClass(), "startPos", -1016503459);
        setField(term597, term597.getClass(), "memoKey", term598);
        setIntField(term597, term597.getClass(), "len", -1968847291);
        setIntField(term597, term597.getClass(), "firstMatchingSubClauseIdx", 579005622);
        setField(term604, term604.getClass(), "clause", null);
        setIntField(term604, term604.getClass(), "startPos", -14890619);
        setField(term603, term603.getClass(), "memoKey", term604);
        setIntField(term603, term603.getClass(), "len", 1632125673);
        setIntField(term603, term603.getClass(), "firstMatchingSubClauseIdx", 454281060);
        setField(term609, term609.getClass(), "memoKey", null);
        setIntField(term609, term609.getClass(), "len", 2055867847);
        setIntField(term609, term609.getClass(), "firstMatchingSubClauseIdx", -1048298087);
        setField(term609, term609.getClass(), "subClauseMatches", null);
        setElement(term608, 0, term609);
        setField(term612, term612.getClass(), "memoKey", null);
        setIntField(term612, term612.getClass(), "len", 0);
        setIntField(term612, term612.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term612, term612.getClass(), "subClauseMatches", null);
        setElement(term608, 1, term612);
        setField(term615, term615.getClass(), "memoKey", null);
        setIntField(term615, term615.getClass(), "len", 0);
        setIntField(term615, term615.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term615, term615.getClass(), "subClauseMatches", null);
        setElement(term608, 2, term615);
        setField(term618, term618.getClass(), "memoKey", null);
        setIntField(term618, term618.getClass(), "len", 0);
        setIntField(term618, term618.getClass(), "firstMatchingSubClauseIdx", 0);
        setField(term618, term618.getClass(), "subClauseMatches", null);
        setElement(term608, 3, term618);
        setElement(term608, 4, term609);
        setField(term621, term621.getClass(), "memoKey", null);
        setIntField(term621, term621.getClass(), "len", 493620644);
        setIntField(term621, term621.getClass(), "firstMatchingSubClauseIdx", 1328271830);
        setField(term621, term621.getClass(), "subClauseMatches", null);
        setElement(term608, 5, term621);
        setElement(term608, 6, term615);
        setElement(term608, 7, term612);
        setField(term603, term603.getClass(), "subClauseMatches", term608);
        setElement(term602, 0, term603);
        setElement(term602, 1, term612);
        setField(term597, term597.getClass(), "subClauseMatches", term602);
        term624 = newInstance(Class.forName("java.util.PriorityQueue"));
        Object[] term625 = (Object[]) newArray("java.lang.Object", 11);
        setField(term624, term624.getClass(), "queue", term625);
        setIntField(term624, term624.getClass(), "size", 0);
        setField(term624, term624.getClass(), "comparator", null);
        setIntField(term624, term624.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[1] = Class.forName("pikaparser.memotable.Match");
        argTypes[2] = Class.forName("java.util.PriorityQueue");
        Object[] args = new Object[3];
        args[0] = term595;
        args[1] = term597;
        args[2] = term624;
        callMethod(klass, "addMatch", argTypes, term559, args);
    }

};


