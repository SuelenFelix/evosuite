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

public class ASTNodeLabel_determineWhetherCanMatchZeroChars_13264309791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public ASTNodeLabel_determineWhetherCanMatchZeroChars_13264309791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term231 = ((Class) term232).getDeclaredField((String) "RIGHT");
        ((Field) term231).setAccessible(true);
        Object enum0 = ((Field) term231).get((Object) null);
        Object term104 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term109 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term104, term104.getClass(), "ruleName", "");
        setIntField(term104, term104.getClass(), "precedence", 568599855);
        setField(term104, term104.getClass(), "associativity", enum0);
        setField(term109, term109.getClass(), "clause", null);
        setField(term109, term109.getClass(), "astNodeLabel", null);
        setField(term104, term104.getClass(), "labeledClause", term109);
        Object term110 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term113 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term110, term110.getClass(), "ruleName", "");
        setIntField(term110, term110.getClass(), "precedence", 1162663216);
        setField(term110, term110.getClass(), "associativity", enum0);
        setField(term113, term113.getClass(), "clause", null);
        setField(term113, term113.getClass(), "astNodeLabel", null);
        setField(term110, term110.getClass(), "labeledClause", term113);
        Object term114 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term117 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term114, term114.getClass(), "ruleName", "");
        setIntField(term114, term114.getClass(), "precedence", 1484323161);
        setField(term114, term114.getClass(), "associativity", enum0);
        setField(term117, term117.getClass(), "clause", null);
        setField(term117, term117.getClass(), "astNodeLabel", null);
        setField(term114, term114.getClass(), "labeledClause", term117);
        Object term118 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term121 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term118, term118.getClass(), "ruleName", "");
        setIntField(term118, term118.getClass(), "precedence", 391863371);
        setField(term118, term118.getClass(), "associativity", enum0);
        setField(term121, term121.getClass(), "clause", null);
        setField(term121, term121.getClass(), "astNodeLabel", null);
        setField(term118, term118.getClass(), "labeledClause", term121);
        ArrayList term102 = new ArrayList();
        ((ArrayList) term102).add(term104);
        ((ArrayList) term102).add(term110);
        ((ArrayList) term102).add(term114);
        ((ArrayList) term102).add(term118);
        ArrayList term124 = new ArrayList();
        ((ArrayList) term124).add((Object)null);
        ((ArrayList) term124).add((Object)null);
        ((ArrayList) term124).add((Object)null);
        term23 = newInstance(Class.forName("pikaparser.clause.aux.ASTNodeLabel"));
        Object[] term36 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term37 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term50 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term63 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term76 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term89 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term23, term23.getClass(), "astNodeLabel", "sjlJAEtRrb");
        setField(term37, term37.getClass(), "clause", null);
        setField(term37, term37.getClass(), "astNodeLabel", "MuLcgQHgqz");
        setElement(term36, 0, term37);
        setField(term50, term50.getClass(), "clause", null);
        setField(term50, term50.getClass(), "astNodeLabel", "xxtlPwDYFs");
        setElement(term36, 1, term50);
        setField(term63, term63.getClass(), "clause", null);
        setField(term63, term63.getClass(), "astNodeLabel", "jJCZpVmanW");
        setElement(term36, 2, term63);
        setField(term76, term76.getClass(), "clause", null);
        setField(term76, term76.getClass(), "astNodeLabel", "EGtDIRbSSb");
        setElement(term36, 3, term76);
        setField(term89, term89.getClass(), "clause", null);
        setField(term89, term89.getClass(), "astNodeLabel", "SzjVpOQTyS");
        setElement(term36, 4, term89);
        setField(term23, term23.getClass(), "labeledSubClauses", term36);
        setField(term23, term23.getClass(), "rules", term102);
        setField(term23, term23.getClass(), "seedParentClauses", term124);
        setBooleanField(term23, term23.getClass(), "canMatchZeroChars", false);
        setIntField(term23, term23.getClass(), "clauseIdx", -1922583790);
        setField(term23, term23.getClass(), "toStringCached", "LQFpaHEwXR");
        setField(term23, term23.getClass(), "toStringWithRuleNameCached", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.ASTNodeLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term23, args);
    }

};


