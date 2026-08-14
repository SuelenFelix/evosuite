package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ParserInfo_printMatchesAndSubClauseMatches_19992192047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3609;

    public ParserInfo_printMatchesAndSubClauseMatches_19992192047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3613 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3613, term3613.getClass(), "ruleName", null);
        setIntField(term3613, term3613.getClass(), "precedence", -1435758764);
        setField(term3613, term3613.getClass(), "associativity", null);
        setField(term3613, term3613.getClass(), "labeledClause", null);
        Object term3615 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3615, term3615.getClass(), "ruleName", null);
        setIntField(term3615, term3615.getClass(), "precedence", 752858379);
        setField(term3615, term3615.getClass(), "associativity", null);
        setField(term3615, term3615.getClass(), "labeledClause", null);
        Object term3617 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3617, term3617.getClass(), "ruleName", null);
        setIntField(term3617, term3617.getClass(), "precedence", -370819357);
        setField(term3617, term3617.getClass(), "associativity", null);
        setField(term3617, term3617.getClass(), "labeledClause", null);
        Object term3619 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3619, term3619.getClass(), "ruleName", null);
        setIntField(term3619, term3619.getClass(), "precedence", -71819242);
        setField(term3619, term3619.getClass(), "associativity", null);
        setField(term3619, term3619.getClass(), "labeledClause", null);
        Object term3621 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3621, term3621.getClass(), "ruleName", null);
        setIntField(term3621, term3621.getClass(), "precedence", 1268893136);
        setField(term3621, term3621.getClass(), "associativity", null);
        setField(term3621, term3621.getClass(), "labeledClause", null);
        Object term3623 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3623, term3623.getClass(), "ruleName", null);
        setIntField(term3623, term3623.getClass(), "precedence", -1472700822);
        setField(term3623, term3623.getClass(), "associativity", null);
        setField(term3623, term3623.getClass(), "labeledClause", null);
        Object term3625 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3625, term3625.getClass(), "ruleName", null);
        setIntField(term3625, term3625.getClass(), "precedence", 1626670889);
        setField(term3625, term3625.getClass(), "associativity", null);
        setField(term3625, term3625.getClass(), "labeledClause", null);
        Object term3627 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3627, term3627.getClass(), "ruleName", null);
        setIntField(term3627, term3627.getClass(), "precedence", -2117361140);
        setField(term3627, term3627.getClass(), "associativity", null);
        setField(term3627, term3627.getClass(), "labeledClause", null);
        Object term3629 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3629, term3629.getClass(), "ruleName", null);
        setIntField(term3629, term3629.getClass(), "precedence", 407708341);
        setField(term3629, term3629.getClass(), "associativity", null);
        setField(term3629, term3629.getClass(), "labeledClause", null);
        ArrayList term3611 = new ArrayList();
        ((ArrayList) term3611).add(term3613);
        ((ArrayList) term3611).add(term3615);
        ((ArrayList) term3611).add(term3617);
        ((ArrayList) term3611).add(term3619);
        ((ArrayList) term3611).add(term3621);
        ((ArrayList) term3611).add(term3623);
        ((ArrayList) term3611).add(term3625);
        ((ArrayList) term3611).add(term3627);
        ((ArrayList) term3611).add(term3629);
        HashMap term3633 = new HashMap();
        ArrayList term3641 = new ArrayList();
        ((ArrayList) term3641).add((Object)null);
        ((ArrayList) term3641).add((Object)null);
        ((ArrayList) term3641).add((Object)null);
        ((ArrayList) term3641).add((Object)null);
        ((ArrayList) term3641).add((Object)null);
        ((ArrayList) term3641).add((Object)null);
        term3609 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3610 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3657 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3659 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3609, term3609.getClass(), "memoTable", null);
        setField(term3610, term3610.getClass(), "allRules", term3611);
        setField(term3610, term3610.getClass(), "ruleNameWithPrecedenceToRule", term3633);
        setField(term3610, term3610.getClass(), "allClauses", term3641);
        setField(term3609, term3609.getClass(), "grammar", term3610);
        setField(term3609, term3609.getClass(), "input", "iljANwuEjk");
        setIntField(term3657, term3657.getClass(), "value", -1955890973);
        setField(term3609, term3609.getClass(), "numMatchObjectsCreated", term3657);
        setIntField(term3659, term3659.getClass(), "value", -2038273078);
        setField(term3609, term3609.getClass(), "numMatchObjectsMemoized", term3659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3609;
        callMethod(klass, "printMatchesAndSubClauseMatches", argTypes, null, args);
    }

};


