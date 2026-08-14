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

public class Seq_addAsSeedParentClause_13165993502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;

    public Seq_addAsSeedParentClause_13165993502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term462 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term461 = ((Class) term462).getDeclaredField((String) "LEFT");
        ((Field) term461).setAccessible(true);
        Object enum1 = ((Field) term461).get((Object) null);
        Object term389 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term394 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term389, term389.getClass(), "ruleName", "");
        setIntField(term389, term389.getClass(), "precedence", -1922583790);
        setField(term389, term389.getClass(), "associativity", enum1);
        setField(term394, term394.getClass(), "clause", null);
        setField(term394, term394.getClass(), "astNodeLabel", null);
        setField(term389, term389.getClass(), "labeledClause", term394);
        Class<? extends Object> term666 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term665 = ((Class) term666).getDeclaredField((String) "RIGHT");
        ((Field) term665).setAccessible(true);
        Object enum2 = ((Field) term665).get((Object) null);
        Object term395 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term400 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term395, term395.getClass(), "ruleName", "");
        setIntField(term395, term395.getClass(), "precedence", -616727354);
        setField(term395, term395.getClass(), "associativity", enum2);
        setField(term400, term400.getClass(), "clause", null);
        setField(term400, term400.getClass(), "astNodeLabel", null);
        setField(term395, term395.getClass(), "labeledClause", term400);
        Object term401 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term404 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term401, term401.getClass(), "ruleName", "");
        setIntField(term401, term401.getClass(), "precedence", -1955890973);
        setField(term401, term401.getClass(), "associativity", enum2);
        setField(term404, term404.getClass(), "clause", null);
        setField(term404, term404.getClass(), "astNodeLabel", null);
        setField(term401, term401.getClass(), "labeledClause", term404);
        Object term405 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term408 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term405, term405.getClass(), "ruleName", "");
        setIntField(term405, term405.getClass(), "precedence", -2038273078);
        setField(term405, term405.getClass(), "associativity", enum2);
        setField(term408, term408.getClass(), "clause", null);
        setField(term408, term408.getClass(), "astNodeLabel", null);
        setField(term405, term405.getClass(), "labeledClause", term408);
        Object term409 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term412 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term409, term409.getClass(), "ruleName", "");
        setIntField(term409, term409.getClass(), "precedence", 1227103734);
        setField(term409, term409.getClass(), "associativity", enum2);
        setField(term412, term412.getClass(), "clause", null);
        setField(term412, term412.getClass(), "astNodeLabel", null);
        setField(term409, term409.getClass(), "labeledClause", term412);
        Object term413 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term416 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term413, term413.getClass(), "ruleName", "");
        setIntField(term413, term413.getClass(), "precedence", -1339778481);
        setField(term413, term413.getClass(), "associativity", enum1);
        setField(term416, term416.getClass(), "clause", null);
        setField(term416, term416.getClass(), "astNodeLabel", null);
        setField(term413, term413.getClass(), "labeledClause", term416);
        Object term417 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term420 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term417, term417.getClass(), "ruleName", "");
        setIntField(term417, term417.getClass(), "precedence", 1725571209);
        setField(term417, term417.getClass(), "associativity", enum2);
        setField(term420, term420.getClass(), "clause", null);
        setField(term420, term420.getClass(), "astNodeLabel", null);
        setField(term417, term417.getClass(), "labeledClause", term420);
        Object term421 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term424 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term421, term421.getClass(), "ruleName", "");
        setIntField(term421, term421.getClass(), "precedence", -522618178);
        setField(term421, term421.getClass(), "associativity", enum1);
        setField(term424, term424.getClass(), "clause", null);
        setField(term424, term424.getClass(), "astNodeLabel", null);
        setField(term421, term421.getClass(), "labeledClause", term424);
        Object term425 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term428 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term425, term425.getClass(), "ruleName", "");
        setIntField(term425, term425.getClass(), "precedence", 1134449235);
        setField(term425, term425.getClass(), "associativity", enum2);
        setField(term428, term428.getClass(), "clause", null);
        setField(term428, term428.getClass(), "astNodeLabel", null);
        setField(term425, term425.getClass(), "labeledClause", term428);
        ArrayList term387 = new ArrayList();
        ((ArrayList) term387).add(term389);
        ((ArrayList) term387).add(term395);
        ((ArrayList) term387).add(term401);
        ((ArrayList) term387).add(term405);
        ((ArrayList) term387).add(term409);
        ((ArrayList) term387).add(term413);
        ((ArrayList) term387).add(term417);
        ((ArrayList) term387).add(term421);
        ((ArrayList) term387).add(term425);
        ArrayList term431 = new ArrayList();
        term385 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        Object[] term386 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term385, term385.getClass(), "labeledSubClauses", term386);
        setField(term385, term385.getClass(), "rules", term387);
        setField(term385, term385.getClass(), "seedParentClauses", term431);
        setBooleanField(term385, term385.getClass(), "canMatchZeroChars", false);
        setIntField(term385, term385.getClass(), "clauseIdx", -883034806);
        setField(term385, term385.getClass(), "toStringCached", "IoAlmYsBwc");
        setField(term385, term385.getClass(), "toStringWithRuleNameCached", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addAsSeedParentClause", argTypes, term385, args);
    }

};


