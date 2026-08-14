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

public class NotFollowedBy_match_20821936382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;
     Object term3296;
     Object term3336;

    public NotFollowedBy_match_20821936382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3351 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3350 = ((Class) term3351).getDeclaredField((String) "LEFT");
        ((Field) term3350).setAccessible(true);
        Object enum8 = ((Field) term3350).get((Object) null);
        Object term3224 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3229 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3224, term3224.getClass(), "ruleName", "");
        setIntField(term3224, term3224.getClass(), "precedence", 493620644);
        setField(term3224, term3224.getClass(), "associativity", enum8);
        setField(term3229, term3229.getClass(), "clause", null);
        setField(term3229, term3229.getClass(), "astNodeLabel", null);
        setField(term3224, term3224.getClass(), "labeledClause", term3229);
        Object term3230 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3233 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3230, term3230.getClass(), "ruleName", "");
        setIntField(term3230, term3230.getClass(), "precedence", 1328271830);
        setField(term3230, term3230.getClass(), "associativity", enum8);
        setField(term3233, term3233.getClass(), "clause", null);
        setField(term3233, term3233.getClass(), "astNodeLabel", null);
        setField(term3230, term3230.getClass(), "labeledClause", term3233);
        Class<? extends Object> term3555 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3554 = ((Class) term3555).getDeclaredField((String) "LEFT");
        ((Field) term3554).setAccessible(true);
        Object enum9 = ((Field) term3554).get((Object) null);
        Object term3234 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3239 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3234, term3234.getClass(), "ruleName", "");
        setIntField(term3234, term3234.getClass(), "precedence", 1596070772);
        setField(term3234, term3234.getClass(), "associativity", enum9);
        setField(term3239, term3239.getClass(), "clause", null);
        setField(term3239, term3239.getClass(), "astNodeLabel", null);
        setField(term3234, term3234.getClass(), "labeledClause", term3239);
        Object term3240 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3243 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3240, term3240.getClass(), "ruleName", "");
        setIntField(term3240, term3240.getClass(), "precedence", 97029295);
        setField(term3240, term3240.getClass(), "associativity", enum8);
        setField(term3243, term3243.getClass(), "clause", null);
        setField(term3243, term3243.getClass(), "astNodeLabel", null);
        setField(term3240, term3240.getClass(), "labeledClause", term3243);
        Object term3244 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3247 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3244, term3244.getClass(), "ruleName", "");
        setIntField(term3244, term3244.getClass(), "precedence", -1371869594);
        setField(term3244, term3244.getClass(), "associativity", enum8);
        setField(term3247, term3247.getClass(), "clause", null);
        setField(term3247, term3247.getClass(), "astNodeLabel", null);
        setField(term3244, term3244.getClass(), "labeledClause", term3247);
        Object term3248 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3251 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3248, term3248.getClass(), "ruleName", "");
        setIntField(term3248, term3248.getClass(), "precedence", -2095575670);
        setField(term3248, term3248.getClass(), "associativity", enum8);
        setField(term3251, term3251.getClass(), "clause", null);
        setField(term3251, term3251.getClass(), "astNodeLabel", null);
        setField(term3248, term3248.getClass(), "labeledClause", term3251);
        Object term3252 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3255 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3252, term3252.getClass(), "ruleName", "");
        setIntField(term3252, term3252.getClass(), "precedence", 1225272962);
        setField(term3252, term3252.getClass(), "associativity", enum8);
        setField(term3255, term3255.getClass(), "clause", null);
        setField(term3255, term3255.getClass(), "astNodeLabel", null);
        setField(term3252, term3252.getClass(), "labeledClause", term3255);
        Object term3256 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3259 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3256, term3256.getClass(), "ruleName", "");
        setIntField(term3256, term3256.getClass(), "precedence", 1324040357);
        setField(term3256, term3256.getClass(), "associativity", enum9);
        setField(term3259, term3259.getClass(), "clause", null);
        setField(term3259, term3259.getClass(), "astNodeLabel", null);
        setField(term3256, term3256.getClass(), "labeledClause", term3259);
        Object term3260 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3263 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3260, term3260.getClass(), "ruleName", "");
        setIntField(term3260, term3260.getClass(), "precedence", -1588772968);
        setField(term3260, term3260.getClass(), "associativity", enum9);
        setField(term3263, term3263.getClass(), "clause", null);
        setField(term3263, term3263.getClass(), "astNodeLabel", null);
        setField(term3260, term3260.getClass(), "labeledClause", term3263);
        ArrayList term3222 = new ArrayList();
        ((ArrayList) term3222).add(term3224);
        ((ArrayList) term3222).add(term3230);
        ((ArrayList) term3222).add(term3234);
        ((ArrayList) term3222).add(term3240);
        ((ArrayList) term3222).add(term3244);
        ((ArrayList) term3222).add(term3248);
        ((ArrayList) term3222).add(term3252);
        ((ArrayList) term3222).add(term3256);
        ((ArrayList) term3222).add(term3260);
        ArrayList term3266 = new ArrayList();
        ((ArrayList) term3266).add((Object)null);
        ((ArrayList) term3266).add((Object)null);
        ((ArrayList) term3266).add((Object)null);
        ((ArrayList) term3266).add((Object)null);
        term3220 = newInstance(Class.forName("pikaparser.clause.nonterminal.NotFollowedBy"));
        Object[] term3221 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term3220, term3220.getClass(), "labeledSubClauses", term3221);
        setField(term3220, term3220.getClass(), "rules", term3222);
        setField(term3220, term3220.getClass(), "seedParentClauses", term3266);
        setBooleanField(term3220, term3220.getClass(), "canMatchZeroChars", false);
        setIntField(term3220, term3220.getClass(), "clauseIdx", -93135961);
        setField(term3220, term3220.getClass(), "toStringCached", "mLUZFTfjle");
        setField(term3220, term3220.getClass(), "toStringWithRuleNameCached", "xIeFjkHkOe");
        Object term3300 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3300, term3300.getClass(), "ruleName", null);
        setIntField(term3300, term3300.getClass(), "precedence", 972867650);
        setField(term3300, term3300.getClass(), "associativity", enum9);
        setField(term3300, term3300.getClass(), "labeledClause", null);
        Object term3302 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3302, term3302.getClass(), "ruleName", null);
        setIntField(term3302, term3302.getClass(), "precedence", 1655935355);
        setField(term3302, term3302.getClass(), "associativity", enum8);
        setField(term3302, term3302.getClass(), "labeledClause", null);
        Object term3304 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3304, term3304.getClass(), "ruleName", null);
        setIntField(term3304, term3304.getClass(), "precedence", -481533957);
        setField(term3304, term3304.getClass(), "associativity", enum8);
        setField(term3304, term3304.getClass(), "labeledClause", null);
        ArrayList term3298 = new ArrayList();
        ((ArrayList) term3298).add(term3300);
        ((ArrayList) term3298).add(term3302);
        ((ArrayList) term3298).add(term3304);
        HashMap term3308 = new HashMap();
        ArrayList term3316 = new ArrayList();
        ((ArrayList) term3316).add((Object)null);
        ((ArrayList) term3316).add((Object)null);
        ((ArrayList) term3316).add((Object)null);
        ((ArrayList) term3316).add((Object)null);
        ((ArrayList) term3316).add((Object)null);
        ((ArrayList) term3316).add((Object)null);
        term3296 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3297 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3332 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3334 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3296, term3296.getClass(), "memoTable", null);
        setField(term3297, term3297.getClass(), "allRules", term3298);
        setField(term3297, term3297.getClass(), "ruleNameWithPrecedenceToRule", term3308);
        setField(term3297, term3297.getClass(), "allClauses", term3316);
        setField(term3296, term3296.getClass(), "grammar", term3297);
        setField(term3296, term3296.getClass(), "input", "gCWtLVKVVe");
        setIntField(term3332, term3332.getClass(), "value", -1922583790);
        setField(term3296, term3296.getClass(), "numMatchObjectsCreated", term3332);
        setIntField(term3334, term3334.getClass(), "value", -616727354);
        setField(term3296, term3296.getClass(), "numMatchObjectsMemoized", term3334);
        term3336 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term3336, term3336.getClass(), "clause", null);
        setIntField(term3336, term3336.getClass(), "startPos", -1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.NotFollowedBy");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term3296;
        args[1] = term3336;
        args[2] = "fWKJoSoCwE";
        callMethod(klass, "match", argTypes, term3220, args);
    }

};


