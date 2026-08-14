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

public class First_toString_8183967413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5116;

    public First_toString_8183967413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5279 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5278 = ((Class) term5279).getDeclaredField((String) "LEFT");
        ((Field) term5278).setAccessible(true);
        Object enum13 = ((Field) term5278).get((Object) null);
        Object term5172 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5177 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5172, term5172.getClass(), "ruleName", "");
        setIntField(term5172, term5172.getClass(), "precedence", -893623680);
        setField(term5172, term5172.getClass(), "associativity", enum13);
        setField(term5177, term5177.getClass(), "clause", null);
        setField(term5177, term5177.getClass(), "astNodeLabel", null);
        setField(term5172, term5172.getClass(), "labeledClause", term5177);
        Object term5178 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5181 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5178, term5178.getClass(), "ruleName", "");
        setIntField(term5178, term5178.getClass(), "precedence", -1963434938);
        setField(term5178, term5178.getClass(), "associativity", enum13);
        setField(term5181, term5181.getClass(), "clause", null);
        setField(term5181, term5181.getClass(), "astNodeLabel", null);
        setField(term5178, term5178.getClass(), "labeledClause", term5181);
        Class<? extends Object> term5483 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5482 = ((Class) term5483).getDeclaredField((String) "RIGHT");
        ((Field) term5482).setAccessible(true);
        Object enum14 = ((Field) term5482).get((Object) null);
        Object term5182 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5187 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5182, term5182.getClass(), "ruleName", "");
        setIntField(term5182, term5182.getClass(), "precedence", 906181092);
        setField(term5182, term5182.getClass(), "associativity", enum14);
        setField(term5187, term5187.getClass(), "clause", null);
        setField(term5187, term5187.getClass(), "astNodeLabel", null);
        setField(term5182, term5182.getClass(), "labeledClause", term5187);
        Object term5188 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5191 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5188, term5188.getClass(), "ruleName", "");
        setIntField(term5188, term5188.getClass(), "precedence", 1045657203);
        setField(term5188, term5188.getClass(), "associativity", enum14);
        setField(term5191, term5191.getClass(), "clause", null);
        setField(term5191, term5191.getClass(), "astNodeLabel", null);
        setField(term5188, term5188.getClass(), "labeledClause", term5191);
        Object term5192 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5195 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5192, term5192.getClass(), "ruleName", "");
        setIntField(term5192, term5192.getClass(), "precedence", 1386130016);
        setField(term5192, term5192.getClass(), "associativity", enum13);
        setField(term5195, term5195.getClass(), "clause", null);
        setField(term5195, term5195.getClass(), "astNodeLabel", null);
        setField(term5192, term5192.getClass(), "labeledClause", term5195);
        Object term5196 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5199 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5196, term5196.getClass(), "ruleName", "");
        setIntField(term5196, term5196.getClass(), "precedence", 1072005683);
        setField(term5196, term5196.getClass(), "associativity", enum13);
        setField(term5199, term5199.getClass(), "clause", null);
        setField(term5199, term5199.getClass(), "astNodeLabel", null);
        setField(term5196, term5196.getClass(), "labeledClause", term5199);
        Object term5200 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5200, term5200.getClass(), "ruleName", "");
        setIntField(term5200, term5200.getClass(), "precedence", 1861318859);
        setField(term5200, term5200.getClass(), "associativity", enum14);
        setField(term5200, term5200.getClass(), "labeledClause", term5191);
        Object term5203 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5203, term5203.getClass(), "ruleName", "");
        setIntField(term5203, term5203.getClass(), "precedence", 1474524152);
        setField(term5203, term5203.getClass(), "associativity", enum14);
        setField(term5203, term5203.getClass(), "labeledClause", term5195);
        ArrayList term5170 = new ArrayList();
        ((ArrayList) term5170).add(term5172);
        ((ArrayList) term5170).add(term5178);
        ((ArrayList) term5170).add(term5182);
        ((ArrayList) term5170).add(term5188);
        ((ArrayList) term5170).add(term5192);
        ((ArrayList) term5170).add(term5196);
        ((ArrayList) term5170).add(term5200);
        ((ArrayList) term5170).add(term5203);
        ArrayList term5208 = new ArrayList();
        term5116 = newInstance(Class.forName("pikaparser.clause.nonterminal.First"));
        Object[] term5117 = (Object[]) newArray("pikaparser.ast.LabeledClause", 4);
        Object term5118 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5131 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5144 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5157 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5118, term5118.getClass(), "clause", null);
        setField(term5118, term5118.getClass(), "astNodeLabel", "kVEZMHmRtR");
        setElement(term5117, 0, term5118);
        setField(term5131, term5131.getClass(), "clause", null);
        setField(term5131, term5131.getClass(), "astNodeLabel", "ekxGuOYIwi");
        setElement(term5117, 1, term5131);
        setField(term5144, term5144.getClass(), "clause", null);
        setField(term5144, term5144.getClass(), "astNodeLabel", "RbVQXSpxXy");
        setElement(term5117, 2, term5144);
        setField(term5157, term5157.getClass(), "clause", null);
        setField(term5157, term5157.getClass(), "astNodeLabel", "YpJbIgJWWv");
        setElement(term5117, 3, term5157);
        setField(term5116, term5116.getClass(), "labeledSubClauses", term5117);
        setField(term5116, term5116.getClass(), "rules", term5170);
        setField(term5116, term5116.getClass(), "seedParentClauses", term5208);
        setBooleanField(term5116, term5116.getClass(), "canMatchZeroChars", false);
        setIntField(term5116, term5116.getClass(), "clauseIdx", 568954359);
        setField(term5116, term5116.getClass(), "toStringCached", "kGMQdqJYyB");
        setField(term5116, term5116.getClass(), "toStringWithRuleNameCached", "XJJNClzHRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.First");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5116, args);
    }

};


