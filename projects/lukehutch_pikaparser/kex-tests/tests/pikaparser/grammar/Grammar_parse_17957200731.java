package pikaparser.grammar;

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
import static pikaparser.grammar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Grammar_parse_17957200731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829;

    public Grammar_parse_17957200731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term886 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term885 = ((Class) term886).getDeclaredField((String) "LEFT");
        ((Field) term885).setAccessible(true);
        Object enum2 = ((Field) term885).get((Object) null);
        Object term832 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term837 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term832, term832.getClass(), "ruleName", "");
        setIntField(term832, term832.getClass(), "precedence", -1530420153);
        setField(term832, term832.getClass(), "associativity", enum2);
        setField(term837, term837.getClass(), "clause", null);
        setField(term837, term837.getClass(), "astNodeLabel", null);
        setField(term832, term832.getClass(), "labeledClause", term837);
        Object term838 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term841 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term838, term838.getClass(), "ruleName", "");
        setIntField(term838, term838.getClass(), "precedence", -469968304);
        setField(term838, term838.getClass(), "associativity", enum2);
        setField(term841, term841.getClass(), "clause", null);
        setField(term841, term841.getClass(), "astNodeLabel", null);
        setField(term838, term838.getClass(), "labeledClause", term841);
        Class<? extends Object> term1090 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1089 = ((Class) term1090).getDeclaredField((String) "RIGHT");
        ((Field) term1089).setAccessible(true);
        Object enum3 = ((Field) term1089).get((Object) null);
        Object term842 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term847 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term842, term842.getClass(), "ruleName", "");
        setIntField(term842, term842.getClass(), "precedence", -1145578966);
        setField(term842, term842.getClass(), "associativity", enum3);
        setField(term847, term847.getClass(), "clause", null);
        setField(term847, term847.getClass(), "astNodeLabel", null);
        setField(term842, term842.getClass(), "labeledClause", term847);
        Object term848 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term851 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term848, term848.getClass(), "ruleName", "");
        setIntField(term848, term848.getClass(), "precedence", 679763016);
        setField(term848, term848.getClass(), "associativity", enum3);
        setField(term851, term851.getClass(), "clause", null);
        setField(term851, term851.getClass(), "astNodeLabel", null);
        setField(term848, term848.getClass(), "labeledClause", term851);
        Object term852 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term855 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term852, term852.getClass(), "ruleName", "");
        setIntField(term852, term852.getClass(), "precedence", 1962444399);
        setField(term852, term852.getClass(), "associativity", enum3);
        setField(term855, term855.getClass(), "clause", null);
        setField(term855, term855.getClass(), "astNodeLabel", null);
        setField(term852, term852.getClass(), "labeledClause", term855);
        ArrayList term830 = new ArrayList();
        ((ArrayList) term830).add(term832);
        ((ArrayList) term830).add(term838);
        ((ArrayList) term830).add(term842);
        ((ArrayList) term830).add(term848);
        ((ArrayList) term830).add(term852);
        HashMap term858 = new HashMap();
        ArrayList term869 = new ArrayList();
        ((ArrayList) term869).add((Object)null);
        ((ArrayList) term869).add((Object)null);
        ((ArrayList) term869).add((Object)null);
        ((ArrayList) term869).add((Object)null);
        term829 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term829, term829.getClass(), "allRules", term830);
        setField(term829, term829.getClass(), "ruleNameWithPrecedenceToRule", term858);
        setField(term829, term829.getClass(), "allClauses", term869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Grammar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "parse", argTypes, term829, args);
    }

};


