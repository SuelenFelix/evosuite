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

public class Seq_toString_14900182304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;

    public Seq_toString_14900182304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1324 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1323 = ((Class) term1324).getDeclaredField((String) "RIGHT");
        ((Field) term1323).setAccessible(true);
        Object enum3 = ((Field) term1323).get((Object) null);
        Object term1239 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1244 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1239, term1239.getClass(), "ruleName", "");
        setIntField(term1239, term1239.getClass(), "precedence", -2068769794);
        setField(term1239, term1239.getClass(), "associativity", enum3);
        setField(term1244, term1244.getClass(), "clause", null);
        setField(term1244, term1244.getClass(), "astNodeLabel", null);
        setField(term1239, term1239.getClass(), "labeledClause", term1244);
        Object term1245 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1248 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1245, term1245.getClass(), "ruleName", "");
        setIntField(term1245, term1245.getClass(), "precedence", -117576464);
        setField(term1245, term1245.getClass(), "associativity", enum3);
        setField(term1248, term1248.getClass(), "clause", null);
        setField(term1248, term1248.getClass(), "astNodeLabel", null);
        setField(term1245, term1245.getClass(), "labeledClause", term1248);
        Class<? extends Object> term1531 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1530 = ((Class) term1531).getDeclaredField((String) "RIGHT");
        ((Field) term1530).setAccessible(true);
        Object enum4 = ((Field) term1530).get((Object) null);
        Object term1249 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1254 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1249, term1249.getClass(), "ruleName", "");
        setIntField(term1249, term1249.getClass(), "precedence", -1007160944);
        setField(term1249, term1249.getClass(), "associativity", enum4);
        setField(term1254, term1254.getClass(), "clause", null);
        setField(term1254, term1254.getClass(), "astNodeLabel", null);
        setField(term1249, term1249.getClass(), "labeledClause", term1254);
        Object term1255 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1258 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1255, term1255.getClass(), "ruleName", "");
        setIntField(term1255, term1255.getClass(), "precedence", 1135664017);
        setField(term1255, term1255.getClass(), "associativity", enum4);
        setField(term1258, term1258.getClass(), "clause", null);
        setField(term1258, term1258.getClass(), "astNodeLabel", null);
        setField(term1255, term1255.getClass(), "labeledClause", term1258);
        Object term1259 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1262 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1259, term1259.getClass(), "ruleName", "");
        setIntField(term1259, term1259.getClass(), "precedence", 590364439);
        setField(term1259, term1259.getClass(), "associativity", enum3);
        setField(term1262, term1262.getClass(), "clause", null);
        setField(term1262, term1262.getClass(), "astNodeLabel", null);
        setField(term1259, term1259.getClass(), "labeledClause", term1262);
        Object term1263 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1266 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1263, term1263.getClass(), "ruleName", "");
        setIntField(term1263, term1263.getClass(), "precedence", 865208305);
        setField(term1263, term1263.getClass(), "associativity", enum3);
        setField(term1266, term1266.getClass(), "clause", null);
        setField(term1266, term1266.getClass(), "astNodeLabel", null);
        setField(term1263, term1263.getClass(), "labeledClause", term1266);
        Object term1267 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1270 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1267, term1267.getClass(), "ruleName", "");
        setIntField(term1267, term1267.getClass(), "precedence", -1275173084);
        setField(term1267, term1267.getClass(), "associativity", enum4);
        setField(term1270, term1270.getClass(), "clause", null);
        setField(term1270, term1270.getClass(), "astNodeLabel", null);
        setField(term1267, term1267.getClass(), "labeledClause", term1270);
        ArrayList term1237 = new ArrayList();
        ((ArrayList) term1237).add(term1239);
        ((ArrayList) term1237).add(term1245);
        ((ArrayList) term1237).add(term1249);
        ((ArrayList) term1237).add(term1255);
        ((ArrayList) term1237).add(term1259);
        ((ArrayList) term1237).add(term1263);
        ((ArrayList) term1237).add(term1267);
        ArrayList term1273 = new ArrayList();
        ((ArrayList) term1273).add((Object)null);
        term1209 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        Object[] term1210 = (Object[]) newArray("pikaparser.ast.LabeledClause", 2);
        Object term1211 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term1224 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1211, term1211.getClass(), "clause", null);
        setField(term1211, term1211.getClass(), "astNodeLabel", "LvtrsXUliU");
        setElement(term1210, 0, term1211);
        setField(term1224, term1224.getClass(), "clause", null);
        setField(term1224, term1224.getClass(), "astNodeLabel", "xLbjWUgOIL");
        setElement(term1210, 1, term1224);
        setField(term1209, term1209.getClass(), "labeledSubClauses", term1210);
        setField(term1209, term1209.getClass(), "rules", term1237);
        setField(term1209, term1209.getClass(), "seedParentClauses", term1273);
        setBooleanField(term1209, term1209.getClass(), "canMatchZeroChars", true);
        setIntField(term1209, term1209.getClass(), "clauseIdx", -244121226);
        setField(term1209, term1209.getClass(), "toStringCached", "dEnhdmILtU");
        setField(term1209, term1209.getClass(), "toStringWithRuleNameCached", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1209, args);
    }

};


