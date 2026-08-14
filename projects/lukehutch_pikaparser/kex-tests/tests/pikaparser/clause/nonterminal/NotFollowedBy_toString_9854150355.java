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

public class NotFollowedBy_toString_9854150355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10110;

    public NotFollowedBy_toString_9854150355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10301 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term10300 = ((Class) term10301).getDeclaredField((String) "RIGHT");
        ((Field) term10300).setAccessible(true);
        Object enum31 = ((Field) term10300).get((Object) null);
        Object term10192 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term10197 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term10192, term10192.getClass(), "ruleName", "");
        setIntField(term10192, term10192.getClass(), "precedence", 880977281);
        setField(term10192, term10192.getClass(), "associativity", enum31);
        setField(term10197, term10197.getClass(), "clause", null);
        setField(term10197, term10197.getClass(), "astNodeLabel", null);
        setField(term10192, term10192.getClass(), "labeledClause", term10197);
        Class<? extends Object> term10508 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term10507 = ((Class) term10508).getDeclaredField((String) "LEFT");
        ((Field) term10507).setAccessible(true);
        Object enum32 = ((Field) term10507).get((Object) null);
        Object term10198 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term10203 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term10198, term10198.getClass(), "ruleName", "");
        setIntField(term10198, term10198.getClass(), "precedence", 371943306);
        setField(term10198, term10198.getClass(), "associativity", enum32);
        setField(term10203, term10203.getClass(), "clause", null);
        setField(term10203, term10203.getClass(), "astNodeLabel", null);
        setField(term10198, term10198.getClass(), "labeledClause", term10203);
        Object term10204 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term10207 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term10204, term10204.getClass(), "ruleName", "");
        setIntField(term10204, term10204.getClass(), "precedence", 982388293);
        setField(term10204, term10204.getClass(), "associativity", enum31);
        setField(term10207, term10207.getClass(), "clause", null);
        setField(term10207, term10207.getClass(), "astNodeLabel", null);
        setField(term10204, term10204.getClass(), "labeledClause", term10207);
        ArrayList term10190 = new ArrayList();
        ((ArrayList) term10190).add(term10192);
        ((ArrayList) term10190).add(term10198);
        ((ArrayList) term10190).add(term10204);
        ArrayList term10210 = new ArrayList();
        ((ArrayList) term10210).add((Object)null);
        ((ArrayList) term10210).add((Object)null);
        ((ArrayList) term10210).add((Object)null);
        ((ArrayList) term10210).add((Object)null);
        ((ArrayList) term10210).add((Object)null);
        ((ArrayList) term10210).add((Object)null);
        term10110 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        Object[] term10111 = (Object[]) newArray("pikaparser.ast.LabeledClause", 6);
        Object term10112 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term10125 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term10138 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term10151 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term10164 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term10177 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term10112, term10112.getClass(), "clause", null);
        setField(term10112, term10112.getClass(), "astNodeLabel", "TtGbVmKcnX");
        setElement(term10111, 0, term10112);
        setField(term10125, term10125.getClass(), "clause", null);
        setField(term10125, term10125.getClass(), "astNodeLabel", "GJVkUrCVdD");
        setElement(term10111, 1, term10125);
        setField(term10138, term10138.getClass(), "clause", null);
        setField(term10138, term10138.getClass(), "astNodeLabel", "zNdorvdUgu");
        setElement(term10111, 2, term10138);
        setField(term10151, term10151.getClass(), "clause", null);
        setField(term10151, term10151.getClass(), "astNodeLabel", "oPxuZbkYio");
        setElement(term10111, 3, term10151);
        setField(term10164, term10164.getClass(), "clause", null);
        setField(term10164, term10164.getClass(), "astNodeLabel", "vKitydDVnM");
        setElement(term10111, 4, term10164);
        setField(term10177, term10177.getClass(), "clause", null);
        setField(term10177, term10177.getClass(), "astNodeLabel", "urCiQnUFBM");
        setElement(term10111, 5, term10177);
        setField(term10110, term10110.getClass(), "labeledSubClauses", term10111);
        setField(term10110, term10110.getClass(), "rules", term10190);
        setField(term10110, term10110.getClass(), "seedParentClauses", term10210);
        setBooleanField(term10110, term10110.getClass(), "canMatchZeroChars", true);
        setIntField(term10110, term10110.getClass(), "clauseIdx", -159494544);
        setField(term10110, term10110.getClass(), "toStringCached", "DPskuFUobI");
        setField(term10110, term10110.getClass(), "toStringWithRuleNameCached", "wBGfLpNNiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10110, args);
    }

};


