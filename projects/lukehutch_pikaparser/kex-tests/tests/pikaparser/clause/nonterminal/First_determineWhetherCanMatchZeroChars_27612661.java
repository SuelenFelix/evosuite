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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class First_determineWhetherCanMatchZeroChars_27612661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4063;

    public First_determineWhetherCanMatchZeroChars_27612661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4170 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term4169 = ((Class) term4170).getDeclaredField((String) "RIGHT");
        ((Field) term4169).setAccessible(true);
        Object enum10 = ((Field) term4169).get((Object) null);
        Object term4093 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4098 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4093, term4093.getClass(), "ruleName", "");
        setIntField(term4093, term4093.getClass(), "precedence", -1547384488);
        setField(term4093, term4093.getClass(), "associativity", enum10);
        setField(term4098, term4098.getClass(), "clause", null);
        setField(term4098, term4098.getClass(), "astNodeLabel", null);
        setField(term4093, term4093.getClass(), "labeledClause", term4098);
        Object term4099 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4102 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4099, term4099.getClass(), "ruleName", "");
        setIntField(term4099, term4099.getClass(), "precedence", 1442160736);
        setField(term4099, term4099.getClass(), "associativity", enum10);
        setField(term4102, term4102.getClass(), "clause", null);
        setField(term4102, term4102.getClass(), "astNodeLabel", null);
        setField(term4099, term4099.getClass(), "labeledClause", term4102);
        Object term4103 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4106 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4103, term4103.getClass(), "ruleName", "");
        setIntField(term4103, term4103.getClass(), "precedence", 1114000454);
        setField(term4103, term4103.getClass(), "associativity", enum10);
        setField(term4106, term4106.getClass(), "clause", null);
        setField(term4106, term4106.getClass(), "astNodeLabel", null);
        setField(term4103, term4103.getClass(), "labeledClause", term4106);
        Class<? extends Object> term4377 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term4376 = ((Class) term4377).getDeclaredField((String) "LEFT");
        ((Field) term4376).setAccessible(true);
        Object enum11 = ((Field) term4376).get((Object) null);
        Object term4107 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4112 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4107, term4107.getClass(), "ruleName", "");
        setIntField(term4107, term4107.getClass(), "precedence", -556405712);
        setField(term4107, term4107.getClass(), "associativity", enum11);
        setField(term4112, term4112.getClass(), "clause", null);
        setField(term4112, term4112.getClass(), "astNodeLabel", null);
        setField(term4107, term4107.getClass(), "labeledClause", term4112);
        Object term4113 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4116 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4113, term4113.getClass(), "ruleName", "");
        setIntField(term4113, term4113.getClass(), "precedence", -1772434990);
        setField(term4113, term4113.getClass(), "associativity", enum10);
        setField(term4116, term4116.getClass(), "clause", null);
        setField(term4116, term4116.getClass(), "astNodeLabel", null);
        setField(term4113, term4113.getClass(), "labeledClause", term4116);
        ArrayList term4091 = new ArrayList();
        ((ArrayList) term4091).add(term4093);
        ((ArrayList) term4091).add(term4099);
        ((ArrayList) term4091).add(term4103);
        ((ArrayList) term4091).add(term4107);
        ((ArrayList) term4091).add(term4113);
        ArrayList term4119 = new ArrayList();
        term4063 = newInstance(Class.forName("pikaparser.clause.nonterminal.First"));
        Object[] term4064 = (Object[]) newArray("pikaparser.ast.LabeledClause", 2);
        Object term4065 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4078 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4065, term4065.getClass(), "clause", null);
        setField(term4065, term4065.getClass(), "astNodeLabel", "UfQtPRyWRC");
        setElement(term4064, 0, term4065);
        setField(term4078, term4078.getClass(), "clause", null);
        setField(term4078, term4078.getClass(), "astNodeLabel", "FPvxVzzSvD");
        setElement(term4064, 1, term4078);
        setField(term4063, term4063.getClass(), "labeledSubClauses", term4064);
        setField(term4063, term4063.getClass(), "rules", term4091);
        setField(term4063, term4063.getClass(), "seedParentClauses", term4119);
        setBooleanField(term4063, term4063.getClass(), "canMatchZeroChars", false);
        setIntField(term4063, term4063.getClass(), "clauseIdx", -1845499264);
        setField(term4063, term4063.getClass(), "toStringCached", "HWkpTmtlrc");
        setField(term4063, term4063.getClass(), "toStringWithRuleNameCached", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.First");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term4063, args);
    }

};


