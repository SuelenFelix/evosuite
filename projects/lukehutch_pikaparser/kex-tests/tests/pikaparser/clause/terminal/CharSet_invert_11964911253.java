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

public class CharSet_invert_11964911253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;

    public CharSet_invert_11964911253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3020 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3019 = ((Class) term3020).getDeclaredField((String) "RIGHT");
        ((Field) term3019).setAccessible(true);
        Object enum9 = ((Field) term3019).get((Object) null);
        Object term2951 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2956 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2951, term2951.getClass(), "ruleName", "");
        setIntField(term2951, term2951.getClass(), "precedence", 1655935355);
        setField(term2951, term2951.getClass(), "associativity", enum9);
        setField(term2956, term2956.getClass(), "clause", null);
        setField(term2956, term2956.getClass(), "astNodeLabel", null);
        setField(term2951, term2951.getClass(), "labeledClause", term2956);
        Object term2957 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2960 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2957, term2957.getClass(), "ruleName", "");
        setIntField(term2957, term2957.getClass(), "precedence", -481533957);
        setField(term2957, term2957.getClass(), "associativity", enum9);
        setField(term2960, term2960.getClass(), "clause", null);
        setField(term2960, term2960.getClass(), "astNodeLabel", null);
        setField(term2957, term2957.getClass(), "labeledClause", term2960);
        Class<? extends Object> term3227 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3226 = ((Class) term3227).getDeclaredField((String) "RIGHT");
        ((Field) term3226).setAccessible(true);
        Object enum10 = ((Field) term3226).get((Object) null);
        Object term2961 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2966 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2961, term2961.getClass(), "ruleName", "");
        setIntField(term2961, term2961.getClass(), "precedence", 1240914516);
        setField(term2961, term2961.getClass(), "associativity", enum10);
        setField(term2966, term2966.getClass(), "clause", null);
        setField(term2966, term2966.getClass(), "astNodeLabel", null);
        setField(term2961, term2961.getClass(), "labeledClause", term2966);
        Object term2967 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2970 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2967, term2967.getClass(), "ruleName", "");
        setIntField(term2967, term2967.getClass(), "precedence", -1465035361);
        setField(term2967, term2967.getClass(), "associativity", enum10);
        setField(term2970, term2970.getClass(), "clause", null);
        setField(term2970, term2970.getClass(), "astNodeLabel", null);
        setField(term2967, term2967.getClass(), "labeledClause", term2970);
        Object term2971 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2974 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2971, term2971.getClass(), "ruleName", "");
        setIntField(term2971, term2971.getClass(), "precedence", 1090617576);
        setField(term2971, term2971.getClass(), "associativity", enum10);
        setField(term2974, term2974.getClass(), "clause", null);
        setField(term2974, term2974.getClass(), "astNodeLabel", null);
        setField(term2971, term2971.getClass(), "labeledClause", term2974);
        ArrayList term2949 = new ArrayList();
        ((ArrayList) term2949).add(term2951);
        ((ArrayList) term2949).add(term2957);
        ((ArrayList) term2949).add(term2961);
        ((ArrayList) term2949).add(term2967);
        ((ArrayList) term2949).add(term2971);
        ArrayList term2977 = new ArrayList();
        ((ArrayList) term2977).add((Object)null);
        ((ArrayList) term2977).add((Object)null);
        ((ArrayList) term2977).add((Object)null);
        ((ArrayList) term2977).add((Object)null);
        term2924 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        Object term2925 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2926 = (long[]) newLongArray(1);
        Object term2930 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2931 = (long[]) newLongArray(1);
        Object[] term2935 = (Object[]) newArray("pikaparser.ast.LabeledClause", 1);
        Object term2936 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2925, term2925.getClass(), "words", term2926);
        setIntField(term2925, term2925.getClass(), "wordsInUse", -478195677);
        setBooleanField(term2925, term2925.getClass(), "sizeIsSticky", true);
        setField(term2924, term2924.getClass(), "chars", term2925);
        setField(term2930, term2930.getClass(), "words", term2931);
        setIntField(term2930, term2930.getClass(), "wordsInUse", 972867650);
        setBooleanField(term2930, term2930.getClass(), "sizeIsSticky", true);
        setField(term2924, term2924.getClass(), "invertedChars", term2930);
        setField(term2936, term2936.getClass(), "clause", null);
        setField(term2936, term2936.getClass(), "astNodeLabel", "JiVRgTZvKc");
        setElement(term2935, 0, term2936);
        setField(term2924, term2924.getClass(), "labeledSubClauses", term2935);
        setField(term2924, term2924.getClass(), "rules", term2949);
        setField(term2924, term2924.getClass(), "seedParentClauses", term2977);
        setBooleanField(term2924, term2924.getClass(), "canMatchZeroChars", true);
        setIntField(term2924, term2924.getClass(), "clauseIdx", -1547384488);
        setField(term2924, term2924.getClass(), "toStringCached", "ZVecLZMLHF");
        setField(term2924, term2924.getClass(), "toStringWithRuleNameCached", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "invert", argTypes, term2924, args);
    }

};


