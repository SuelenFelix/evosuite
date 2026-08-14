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
import java.util.HashMap;

public class CharSet_match_8078446055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3967;
     Object term4097;
     Object term4131;

    public CharSet_match_8078446055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4208 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term4207 = ((Class) term4208).getDeclaredField((String) "LEFT");
        ((Field) term4207).setAccessible(true);
        Object enum13 = ((Field) term4207).get((Object) null);
        Object term4059 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term4064 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4059, term4059.getClass(), "ruleName", "");
        setIntField(term4059, term4059.getClass(), "precedence", 304775596);
        setField(term4059, term4059.getClass(), "associativity", enum13);
        setField(term4064, term4064.getClass(), "clause", null);
        setField(term4064, term4064.getClass(), "astNodeLabel", null);
        setField(term4059, term4059.getClass(), "labeledClause", term4064);
        ArrayList term4057 = new ArrayList();
        ((ArrayList) term4057).add(term4059);
        ArrayList term4067 = new ArrayList();
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        ((ArrayList) term4067).add((Object)null);
        term3967 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        Object term3968 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3969 = (long[]) newLongArray(1);
        Object term3973 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3974 = (long[]) newLongArray(1);
        Object[] term3978 = (Object[]) newArray("pikaparser.ast.LabeledClause", 6);
        Object term3979 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3992 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4005 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4018 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4031 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term4044 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3968, term3968.getClass(), "words", term3969);
        setIntField(term3968, term3968.getClass(), "wordsInUse", -1263114719);
        setBooleanField(term3968, term3968.getClass(), "sizeIsSticky", false);
        setField(term3967, term3967.getClass(), "chars", term3968);
        setField(term3973, term3973.getClass(), "words", term3974);
        setIntField(term3973, term3973.getClass(), "wordsInUse", -894662986);
        setBooleanField(term3973, term3973.getClass(), "sizeIsSticky", true);
        setField(term3967, term3967.getClass(), "invertedChars", term3973);
        setField(term3979, term3979.getClass(), "clause", null);
        setField(term3979, term3979.getClass(), "astNodeLabel", "JDaAnsVTGV");
        setElement(term3978, 0, term3979);
        setField(term3992, term3992.getClass(), "clause", null);
        setField(term3992, term3992.getClass(), "astNodeLabel", "mLUZFTfjle");
        setElement(term3978, 1, term3992);
        setField(term4005, term4005.getClass(), "clause", null);
        setField(term4005, term4005.getClass(), "astNodeLabel", "xIeFjkHkOe");
        setElement(term3978, 2, term4005);
        setField(term4018, term4018.getClass(), "clause", null);
        setField(term4018, term4018.getClass(), "astNodeLabel", "SdCKLMIYnX");
        setElement(term3978, 3, term4018);
        setField(term4031, term4031.getClass(), "clause", null);
        setField(term4031, term4031.getClass(), "astNodeLabel", "OJJtVNPyKZ");
        setElement(term3978, 4, term4031);
        setField(term4044, term4044.getClass(), "clause", null);
        setField(term4044, term4044.getClass(), "astNodeLabel", "AKNapTAfmD");
        setElement(term3978, 5, term4044);
        setField(term3967, term3967.getClass(), "labeledSubClauses", term3978);
        setField(term3967, term3967.getClass(), "rules", term4057);
        setField(term3967, term3967.getClass(), "seedParentClauses", term4067);
        setBooleanField(term3967, term3967.getClass(), "canMatchZeroChars", true);
        setIntField(term3967, term3967.getClass(), "clauseIdx", -1347665717);
        setField(term3967, term3967.getClass(), "toStringCached", "gCWtLVKVVe");
        setField(term3967, term3967.getClass(), "toStringWithRuleNameCached", "fWKJoSoCwE");
        ArrayList term4099 = new ArrayList();
        HashMap term4103 = new HashMap();
        ArrayList term4111 = new ArrayList();
        ((ArrayList) term4111).add((Object)null);
        ((ArrayList) term4111).add((Object)null);
        ((ArrayList) term4111).add((Object)null);
        ((ArrayList) term4111).add((Object)null);
        term4097 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term4098 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term4127 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term4129 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term4097, term4097.getClass(), "memoTable", null);
        setField(term4098, term4098.getClass(), "allRules", term4099);
        setField(term4098, term4098.getClass(), "ruleNameWithPrecedenceToRule", term4103);
        setField(term4098, term4098.getClass(), "allClauses", term4111);
        setField(term4097, term4097.getClass(), "grammar", term4098);
        setField(term4097, term4097.getClass(), "input", "PznxWXsZME");
        setIntField(term4127, term4127.getClass(), "value", -1922583790);
        setField(term4097, term4097.getClass(), "numMatchObjectsCreated", term4127);
        setIntField(term4129, term4129.getClass(), "value", -616727354);
        setField(term4097, term4097.getClass(), "numMatchObjectsMemoized", term4129);
        term4131 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term4131, term4131.getClass(), "clause", null);
        setIntField(term4131, term4131.getClass(), "startPos", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term4097;
        args[1] = term4131;
        args[2] = "ZzIujlwVsw";
        callMethod(klass, "match", argTypes, term3967, args);
    }

};


