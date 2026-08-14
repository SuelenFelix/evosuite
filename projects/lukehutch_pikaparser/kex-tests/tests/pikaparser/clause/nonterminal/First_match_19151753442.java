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
import java.util.HashMap;

public class First_match_19151753442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4600;
     Object term4737;
     Object term4785;

    public First_match_19151753442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4870 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term4869 = ((Class) term4870).getDeclaredField((String) "RIGHT");
        ((Field) term4869).setAccessible(true);
        Object enum12 = ((Field) term4869).get((Object) null);
        Object term4695 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4700 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4695, term4695.getClass(), "ruleName", "");
        setIntField(term4695, term4695.getClass(), "precedence", -505439934);
        setField(term4695, term4695.getClass(), "associativity", enum12);
        setField(term4700, term4700.getClass(), "clause", null);
        setField(term4700, term4700.getClass(), "astNodeLabel", null);
        setField(term4695, term4695.getClass(), "labeledClause", term4700);
        Object term4701 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4704 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4701, term4701.getClass(), "ruleName", "");
        setIntField(term4701, term4701.getClass(), "precedence", -344842608);
        setField(term4701, term4701.getClass(), "associativity", enum12);
        setField(term4704, term4704.getClass(), "clause", null);
        setField(term4704, term4704.getClass(), "astNodeLabel", null);
        setField(term4701, term4701.getClass(), "labeledClause", term4704);
        ArrayList term4693 = new ArrayList();
        ((ArrayList) term4693).add(term4695);
        ((ArrayList) term4693).add(term4701);
        ArrayList term4707 = new ArrayList();
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        ((ArrayList) term4707).add((Object)null);
        term4600 = newInstance(Class.forName("pikaparser.clause.nonterminal.First"));
        Object[] term4601 = (Object[]) newArray("pikaparser.ast.LabeledClause", 7);
        Object term4602 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4615 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4628 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4641 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4654 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4667 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4680 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4602, term4602.getClass(), "clause", null);
        setField(term4602, term4602.getClass(), "astNodeLabel", "VeDtgDzGAN");
        setElement(term4601, 0, term4602);
        setField(term4615, term4615.getClass(), "clause", null);
        setField(term4615, term4615.getClass(), "astNodeLabel", "aWYOWZFyaX");
        setElement(term4601, 1, term4615);
        setField(term4628, term4628.getClass(), "clause", null);
        setField(term4628, term4628.getClass(), "astNodeLabel", "BRIVNtfUWU");
        setElement(term4601, 2, term4628);
        setField(term4641, term4641.getClass(), "clause", null);
        setField(term4641, term4641.getClass(), "astNodeLabel", "DbiCVtPPCT");
        setElement(term4601, 3, term4641);
        setField(term4654, term4654.getClass(), "clause", null);
        setField(term4654, term4654.getClass(), "astNodeLabel", "WzFopsaDuG");
        setElement(term4601, 4, term4654);
        setField(term4667, term4667.getClass(), "clause", null);
        setField(term4667, term4667.getClass(), "astNodeLabel", "PapWxkhEWe");
        setElement(term4601, 5, term4667);
        setField(term4680, term4680.getClass(), "clause", null);
        setField(term4680, term4680.getClass(), "astNodeLabel", "smnHEqRFRx");
        setElement(term4601, 6, term4680);
        setField(term4600, term4600.getClass(), "labeledSubClauses", term4601);
        setField(term4600, term4600.getClass(), "rules", term4693);
        setField(term4600, term4600.getClass(), "seedParentClauses", term4707);
        setBooleanField(term4600, term4600.getClass(), "canMatchZeroChars", true);
        setIntField(term4600, term4600.getClass(), "clauseIdx", 941650513);
        setField(term4600, term4600.getClass(), "toStringCached", "DSNsTGYXDF");
        setField(term4600, term4600.getClass(), "toStringWithRuleNameCached", "sQvGcVjdEx");
        Object term4741 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4741, term4741.getClass(), "ruleName", null);
        setIntField(term4741, term4741.getClass(), "precedence", 339854490);
        setField(term4741, term4741.getClass(), "associativity", null);
        setField(term4741, term4741.getClass(), "labeledClause", null);
        Object term4743 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4743, term4743.getClass(), "ruleName", null);
        setIntField(term4743, term4743.getClass(), "precedence", -615654495);
        setField(term4743, term4743.getClass(), "associativity", enum12);
        setField(term4743, term4743.getClass(), "labeledClause", null);
        Object term4745 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4745, term4745.getClass(), "ruleName", null);
        setIntField(term4745, term4745.getClass(), "precedence", -1476117762);
        setField(term4745, term4745.getClass(), "associativity", null);
        setField(term4745, term4745.getClass(), "labeledClause", null);
        Object term4747 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4747, term4747.getClass(), "ruleName", null);
        setIntField(term4747, term4747.getClass(), "precedence", -341962980);
        setField(term4747, term4747.getClass(), "associativity", enum12);
        setField(term4747, term4747.getClass(), "labeledClause", null);
        Object term4749 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4749, term4749.getClass(), "ruleName", null);
        setIntField(term4749, term4749.getClass(), "precedence", 1532716628);
        setField(term4749, term4749.getClass(), "associativity", enum12);
        setField(term4749, term4749.getClass(), "labeledClause", null);
        Object term4751 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4751, term4751.getClass(), "ruleName", null);
        setIntField(term4751, term4751.getClass(), "precedence", -1801760683);
        setField(term4751, term4751.getClass(), "associativity", null);
        setField(term4751, term4751.getClass(), "labeledClause", null);
        Object term4753 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4753, term4753.getClass(), "ruleName", null);
        setIntField(term4753, term4753.getClass(), "precedence", 1141317871);
        setField(term4753, term4753.getClass(), "associativity", enum12);
        setField(term4753, term4753.getClass(), "labeledClause", null);
        ArrayList term4739 = new ArrayList();
        ((ArrayList) term4739).add(term4741);
        ((ArrayList) term4739).add(term4743);
        ((ArrayList) term4739).add(term4745);
        ((ArrayList) term4739).add(term4747);
        ((ArrayList) term4739).add(term4749);
        ((ArrayList) term4739).add(term4751);
        ((ArrayList) term4739).add(term4753);
        HashMap term4757 = new HashMap();
        ArrayList term4765 = new ArrayList();
        ((ArrayList) term4765).add((Object)null);
        ((ArrayList) term4765).add((Object)null);
        ((ArrayList) term4765).add((Object)null);
        ((ArrayList) term4765).add((Object)null);
        ((ArrayList) term4765).add((Object)null);
        ((ArrayList) term4765).add((Object)null);
        term4737 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term4738 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term4781 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term4783 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term4737, term4737.getClass(), "memoTable", null);
        setField(term4738, term4738.getClass(), "allRules", term4739);
        setField(term4738, term4738.getClass(), "ruleNameWithPrecedenceToRule", term4757);
        setField(term4738, term4738.getClass(), "allClauses", term4765);
        setField(term4737, term4737.getClass(), "grammar", term4738);
        setField(term4737, term4737.getClass(), "input", "DyiXbeYIaN");
        setIntField(term4781, term4781.getClass(), "value", -1955890973);
        setField(term4737, term4737.getClass(), "numMatchObjectsCreated", term4781);
        setIntField(term4783, term4783.getClass(), "value", -2038273078);
        setField(term4737, term4737.getClass(), "numMatchObjectsMemoized", term4783);
        term4785 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term4785, term4785.getClass(), "clause", null);
        setIntField(term4785, term4785.getClass(), "startPos", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.First");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term4737;
        args[1] = term4785;
        args[2] = "VGizxZnyHX";
        callMethod(klass, "match", argTypes, term4600, args);
    }

};


