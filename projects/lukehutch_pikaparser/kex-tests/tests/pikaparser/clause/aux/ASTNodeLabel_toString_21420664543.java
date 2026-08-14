package pikaparser.clause.aux;

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
import static pikaparser.clause.aux.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class ASTNodeLabel_toString_21420664543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;

    public ASTNodeLabel_toString_21420664543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term897 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term896 = ((Class) term897).getDeclaredField((String) "LEFT");
        ((Field) term896).setAccessible(true);
        Object enum1 = ((Field) term896).get((Object) null);
        Object term792 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term797 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term792, term792.getClass(), "ruleName", "");
        setIntField(term792, term792.getClass(), "precedence", -6029667);
        setField(term792, term792.getClass(), "associativity", enum1);
        setField(term797, term797.getClass(), "clause", null);
        setField(term797, term797.getClass(), "astNodeLabel", null);
        setField(term792, term792.getClass(), "labeledClause", term797);
        Object term798 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term801 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term798, term798.getClass(), "ruleName", "");
        setIntField(term798, term798.getClass(), "precedence", -2068769794);
        setField(term798, term798.getClass(), "associativity", enum1);
        setField(term801, term801.getClass(), "clause", null);
        setField(term801, term801.getClass(), "astNodeLabel", null);
        setField(term798, term798.getClass(), "labeledClause", term801);
        Class<? extends Object> term1101 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1100 = ((Class) term1101).getDeclaredField((String) "LEFT");
        ((Field) term1100).setAccessible(true);
        Object enum2 = ((Field) term1100).get((Object) null);
        Object term802 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term807 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term802, term802.getClass(), "ruleName", "");
        setIntField(term802, term802.getClass(), "precedence", -117576464);
        setField(term802, term802.getClass(), "associativity", enum2);
        setField(term807, term807.getClass(), "clause", null);
        setField(term807, term807.getClass(), "astNodeLabel", null);
        setField(term802, term802.getClass(), "labeledClause", term807);
        Object term808 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term811 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term808, term808.getClass(), "ruleName", "");
        setIntField(term808, term808.getClass(), "precedence", -1007160944);
        setField(term808, term808.getClass(), "associativity", enum2);
        setField(term811, term811.getClass(), "clause", null);
        setField(term811, term811.getClass(), "astNodeLabel", null);
        setField(term808, term808.getClass(), "labeledClause", term811);
        Object term812 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term815 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term812, term812.getClass(), "ruleName", "");
        setIntField(term812, term812.getClass(), "precedence", 1135664017);
        setField(term812, term812.getClass(), "associativity", enum1);
        setField(term815, term815.getClass(), "clause", null);
        setField(term815, term815.getClass(), "astNodeLabel", null);
        setField(term812, term812.getClass(), "labeledClause", term815);
        Object term816 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term819 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term816, term816.getClass(), "ruleName", "");
        setIntField(term816, term816.getClass(), "precedence", 590364439);
        setField(term816, term816.getClass(), "associativity", enum1);
        setField(term819, term819.getClass(), "clause", null);
        setField(term819, term819.getClass(), "astNodeLabel", null);
        setField(term816, term816.getClass(), "labeledClause", term819);
        Object term820 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term823 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term820, term820.getClass(), "ruleName", "");
        setIntField(term820, term820.getClass(), "precedence", 865208305);
        setField(term820, term820.getClass(), "associativity", enum2);
        setField(term823, term823.getClass(), "clause", null);
        setField(term823, term823.getClass(), "astNodeLabel", null);
        setField(term820, term820.getClass(), "labeledClause", term823);
        ArrayList term790 = new ArrayList();
        ((ArrayList) term790).add(term792);
        ((ArrayList) term790).add(term798);
        ((ArrayList) term790).add(term802);
        ((ArrayList) term790).add(term808);
        ((ArrayList) term790).add(term812);
        ((ArrayList) term790).add(term816);
        ((ArrayList) term790).add(term820);
        ArrayList term826 = new ArrayList();
        term737 = newInstance(Class.forName("pikaparser.clause.aux.ASTNodeLabel"));
        Object[] term750 = (Object[]) newArray("pikaparser.ast.LabeledClause", 3);
        Object term751 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term764 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term777 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term737, term737.getClass(), "astNodeLabel", "aKnKipADSo");
        setField(term751, term751.getClass(), "clause", null);
        setField(term751, term751.getClass(), "astNodeLabel", "wSQxaModmm");
        setElement(term750, 0, term751);
        setField(term764, term764.getClass(), "clause", null);
        setField(term764, term764.getClass(), "astNodeLabel", "UlajhuVLaP");
        setElement(term750, 1, term764);
        setField(term777, term777.getClass(), "clause", null);
        setField(term777, term777.getClass(), "astNodeLabel", "gGSMzuGICf");
        setElement(term750, 2, term777);
        setField(term737, term737.getClass(), "labeledSubClauses", term750);
        setField(term737, term737.getClass(), "rules", term790);
        setField(term737, term737.getClass(), "seedParentClauses", term826);
        setBooleanField(term737, term737.getClass(), "canMatchZeroChars", false);
        setIntField(term737, term737.getClass(), "clauseIdx", -1275173084);
        setField(term737, term737.getClass(), "toStringCached", "onpbIeEKoi");
        setField(term737, term737.getClass(), "toStringWithRuleNameCached", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.ASTNodeLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term737, args);
    }

};


