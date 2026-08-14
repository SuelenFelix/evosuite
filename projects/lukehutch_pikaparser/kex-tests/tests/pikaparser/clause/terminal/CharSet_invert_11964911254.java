package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class CharSet_invert_11964911254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12760;

    public CharSet_invert_11964911254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12902 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term12901 = ((Class) term12902).getDeclaredField((String) "RIGHT");
        ((Field) term12901).setAccessible(true);
        Object enum39 = ((Field) term12901).get((Object) null);
        Object term12813 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term12818 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12813, term12813.getClass(), "ruleName", "");
        setIntField(term12813, term12813.getClass(), "precedence", -123338791);
        setField(term12813, term12813.getClass(), "associativity", enum39);
        setField(term12818, term12818.getClass(), "clause", null);
        setField(term12818, term12818.getClass(), "astNodeLabel", null);
        setField(term12813, term12813.getClass(), "labeledClause", term12818);
        Class<? extends Object> term13109 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term13108 = ((Class) term13109).getDeclaredField((String) "RIGHT");
        ((Field) term13108).setAccessible(true);
        Object enum40 = ((Field) term13108).get((Object) null);
        Object term12819 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term12824 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12819, term12819.getClass(), "ruleName", "");
        setIntField(term12819, term12819.getClass(), "precedence", -1467089634);
        setField(term12819, term12819.getClass(), "associativity", enum40);
        setField(term12824, term12824.getClass(), "clause", null);
        setField(term12824, term12824.getClass(), "astNodeLabel", null);
        setField(term12819, term12819.getClass(), "labeledClause", term12824);
        Object term12825 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term12828 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12825, term12825.getClass(), "ruleName", "");
        setIntField(term12825, term12825.getClass(), "precedence", 413548937);
        setField(term12825, term12825.getClass(), "associativity", enum39);
        setField(term12828, term12828.getClass(), "clause", null);
        setField(term12828, term12828.getClass(), "astNodeLabel", null);
        setField(term12825, term12825.getClass(), "labeledClause", term12828);
        Object term12829 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term12832 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12829, term12829.getClass(), "ruleName", "");
        setIntField(term12829, term12829.getClass(), "precedence", 1901317214);
        setField(term12829, term12829.getClass(), "associativity", enum39);
        setField(term12832, term12832.getClass(), "clause", null);
        setField(term12832, term12832.getClass(), "astNodeLabel", null);
        setField(term12829, term12829.getClass(), "labeledClause", term12832);
        Object term12833 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term12836 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12833, term12833.getClass(), "ruleName", "");
        setIntField(term12833, term12833.getClass(), "precedence", 1166710220);
        setField(term12833, term12833.getClass(), "associativity", enum39);
        setField(term12836, term12836.getClass(), "clause", null);
        setField(term12836, term12836.getClass(), "astNodeLabel", null);
        setField(term12833, term12833.getClass(), "labeledClause", term12836);
        ArrayList term12811 = new ArrayList();
        ((ArrayList) term12811).add(term12813);
        ((ArrayList) term12811).add(term12819);
        ((ArrayList) term12811).add(term12825);
        ((ArrayList) term12811).add(term12829);
        ((ArrayList) term12811).add(term12833);
        ArrayList term12839 = new ArrayList();
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        ((ArrayList) term12839).add((Object)null);
        term12760 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        Object term12761 = newInstance(Class.forName("java.util.BitSet"));
        long[] term12762 = (long[]) newLongArray(1);
        Object term12766 = newInstance(Class.forName("java.util.BitSet"));
        long[] term12767 = (long[]) newLongArray(1);
        Object[] term12771 = (Object[]) newArray("pikaparser.ast.LabeledClause", 3);
        Object term12772 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term12785 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term12798 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term12761, term12761.getClass(), "words", term12762);
        setIntField(term12761, term12761.getClass(), "wordsInUse", -43417861);
        setBooleanField(term12761, term12761.getClass(), "sizeIsSticky", false);
        setField(term12760, term12760.getClass(), "chars", term12761);
        setField(term12766, term12766.getClass(), "words", term12767);
        setIntField(term12766, term12766.getClass(), "wordsInUse", -1533843432);
        setBooleanField(term12766, term12766.getClass(), "sizeIsSticky", true);
        setField(term12760, term12760.getClass(), "invertedChars", term12766);
        setField(term12772, term12772.getClass(), "clause", null);
        setField(term12772, term12772.getClass(), "astNodeLabel", "HpZXWDPhlg");
        setElement(term12771, 0, term12772);
        setField(term12785, term12785.getClass(), "clause", null);
        setField(term12785, term12785.getClass(), "astNodeLabel", "lBOokzEPfe");
        setElement(term12771, 1, term12785);
        setField(term12798, term12798.getClass(), "clause", null);
        setField(term12798, term12798.getClass(), "astNodeLabel", "dtGZCsKXbW");
        setElement(term12771, 2, term12798);
        setField(term12760, term12760.getClass(), "labeledSubClauses", term12771);
        setField(term12760, term12760.getClass(), "rules", term12811);
        setField(term12760, term12760.getClass(), "seedParentClauses", term12839);
        setBooleanField(term12760, term12760.getClass(), "canMatchZeroChars", true);
        setIntField(term12760, term12760.getClass(), "clauseIdx", -1070592289);
        setField(term12760, term12760.getClass(), "toStringCached", "MgLCedQfoj");
        setField(term12760, term12760.getClass(), "toStringWithRuleNameCached", "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "invert", argTypes, term12760, args);
    }

};


