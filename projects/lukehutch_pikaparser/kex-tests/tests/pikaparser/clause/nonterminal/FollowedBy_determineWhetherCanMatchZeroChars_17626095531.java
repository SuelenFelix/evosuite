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

public class FollowedBy_determineWhetherCanMatchZeroChars_17626095531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5718;

    public FollowedBy_determineWhetherCanMatchZeroChars_17626095531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5840 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5839 = ((Class) term5840).getDeclaredField((String) "RIGHT");
        ((Field) term5839).setAccessible(true);
        Object enum15 = ((Field) term5839).get((Object) null);
        Object term5748 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5753 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5748, term5748.getClass(), "ruleName", "");
        setIntField(term5748, term5748.getClass(), "precedence", 53410913);
        setField(term5748, term5748.getClass(), "associativity", enum15);
        setField(term5753, term5753.getClass(), "clause", null);
        setField(term5753, term5753.getClass(), "astNodeLabel", null);
        setField(term5748, term5748.getClass(), "labeledClause", term5753);
        Class<? extends Object> term6047 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6046 = ((Class) term6047).getDeclaredField((String) "LEFT");
        ((Field) term6046).setAccessible(true);
        Object enum16 = ((Field) term6046).get((Object) null);
        Object term5754 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5759 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5754, term5754.getClass(), "ruleName", "");
        setIntField(term5754, term5754.getClass(), "precedence", -375014958);
        setField(term5754, term5754.getClass(), "associativity", enum16);
        setField(term5759, term5759.getClass(), "clause", null);
        setField(term5759, term5759.getClass(), "astNodeLabel", null);
        setField(term5754, term5754.getClass(), "labeledClause", term5759);
        Object term5760 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5763 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5760, term5760.getClass(), "ruleName", "");
        setIntField(term5760, term5760.getClass(), "precedence", 1107176718);
        setField(term5760, term5760.getClass(), "associativity", enum16);
        setField(term5763, term5763.getClass(), "clause", null);
        setField(term5763, term5763.getClass(), "astNodeLabel", null);
        setField(term5760, term5760.getClass(), "labeledClause", term5763);
        Object term5764 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5767 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5764, term5764.getClass(), "ruleName", "");
        setIntField(term5764, term5764.getClass(), "precedence", 480137250);
        setField(term5764, term5764.getClass(), "associativity", enum16);
        setField(term5767, term5767.getClass(), "clause", null);
        setField(term5767, term5767.getClass(), "astNodeLabel", null);
        setField(term5764, term5764.getClass(), "labeledClause", term5767);
        Object term5768 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5771 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5768, term5768.getClass(), "ruleName", "");
        setIntField(term5768, term5768.getClass(), "precedence", -341152642);
        setField(term5768, term5768.getClass(), "associativity", enum16);
        setField(term5771, term5771.getClass(), "clause", null);
        setField(term5771, term5771.getClass(), "astNodeLabel", null);
        setField(term5768, term5768.getClass(), "labeledClause", term5771);
        Object term5772 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5775 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5772, term5772.getClass(), "ruleName", "");
        setIntField(term5772, term5772.getClass(), "precedence", -2015854073);
        setField(term5772, term5772.getClass(), "associativity", enum16);
        setField(term5775, term5775.getClass(), "clause", null);
        setField(term5775, term5775.getClass(), "astNodeLabel", null);
        setField(term5772, term5772.getClass(), "labeledClause", term5775);
        Object term5776 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5779 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5776, term5776.getClass(), "ruleName", "");
        setIntField(term5776, term5776.getClass(), "precedence", 538259104);
        setField(term5776, term5776.getClass(), "associativity", enum16);
        setField(term5779, term5779.getClass(), "clause", null);
        setField(term5779, term5779.getClass(), "astNodeLabel", null);
        setField(term5776, term5776.getClass(), "labeledClause", term5779);
        Object term5780 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5783 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5780, term5780.getClass(), "ruleName", "");
        setIntField(term5780, term5780.getClass(), "precedence", 96566506);
        setField(term5780, term5780.getClass(), "associativity", enum16);
        setField(term5783, term5783.getClass(), "clause", null);
        setField(term5783, term5783.getClass(), "astNodeLabel", null);
        setField(term5780, term5780.getClass(), "labeledClause", term5783);
        Object term5784 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5784, term5784.getClass(), "ruleName", "");
        setIntField(term5784, term5784.getClass(), "precedence", -343325701);
        setField(term5784, term5784.getClass(), "associativity", enum15);
        setField(term5784, term5784.getClass(), "labeledClause", term5775);
        ArrayList term5746 = new ArrayList();
        ((ArrayList) term5746).add(term5748);
        ((ArrayList) term5746).add(term5754);
        ((ArrayList) term5746).add(term5760);
        ((ArrayList) term5746).add(term5764);
        ((ArrayList) term5746).add(term5768);
        ((ArrayList) term5746).add(term5772);
        ((ArrayList) term5746).add(term5776);
        ((ArrayList) term5746).add(term5780);
        ((ArrayList) term5746).add(term5784);
        ArrayList term5789 = new ArrayList();
        ((ArrayList) term5789).add((Object)null);
        ((ArrayList) term5789).add((Object)null);
        ((ArrayList) term5789).add((Object)null);
        term5718 = newInstance(Class.forName("pikaparser.clause.nonterminal.FollowedBy"));
        Object[] term5719 = (Object[]) newArray("pikaparser.ast.LabeledClause", 2);
        Object term5720 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5733 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5720, term5720.getClass(), "clause", null);
        setField(term5720, term5720.getClass(), "astNodeLabel", "HDaezxQfQR");
        setElement(term5719, 0, term5720);
        setField(term5733, term5733.getClass(), "clause", null);
        setField(term5733, term5733.getClass(), "astNodeLabel", "iikZEapDlu");
        setElement(term5719, 1, term5733);
        setField(term5718, term5718.getClass(), "labeledSubClauses", term5719);
        setField(term5718, term5718.getClass(), "rules", term5746);
        setField(term5718, term5718.getClass(), "seedParentClauses", term5789);
        setBooleanField(term5718, term5718.getClass(), "canMatchZeroChars", false);
        setIntField(term5718, term5718.getClass(), "clauseIdx", 107945604);
        setField(term5718, term5718.getClass(), "toStringCached", "PCipZnmBOF");
        setField(term5718, term5718.getClass(), "toStringWithRuleNameCached", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.FollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term5718, args);
    }

};


