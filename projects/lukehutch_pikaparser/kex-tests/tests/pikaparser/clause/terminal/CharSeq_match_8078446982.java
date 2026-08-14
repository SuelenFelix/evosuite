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

public class CharSeq_match_8078446982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5840;
     Object term5960;
     Object term5996;

    public CharSeq_match_8078446982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6071 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6070 = ((Class) term6071).getDeclaredField((String) "LEFT");
        ((Field) term6070).setAccessible(true);
        Object enum18 = ((Field) term6070).get((Object) null);
        Object term5922 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5927 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5922, term5922.getClass(), "ruleName", "");
        setIntField(term5922, term5922.getClass(), "precedence", 1202361360);
        setField(term5922, term5922.getClass(), "associativity", enum18);
        setField(term5927, term5927.getClass(), "clause", null);
        setField(term5927, term5927.getClass(), "astNodeLabel", null);
        setField(term5922, term5922.getClass(), "labeledClause", term5927);
        ArrayList term5920 = new ArrayList();
        ((ArrayList) term5920).add(term5922);
        ArrayList term5930 = new ArrayList();
        term5840 = newInstance(Class.forName("pikaparser.clause.terminal.CharSeq"));
        Object[] term5854 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term5855 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5868 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5881 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5894 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5907 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5840, term5840.getClass(), "str", "vwbEQQNQrx");
        setBooleanField(term5840, term5840.getClass(), "ignoreCase", true);
        setField(term5855, term5855.getClass(), "clause", null);
        setField(term5855, term5855.getClass(), "astNodeLabel", "xtftXXMbem");
        setElement(term5854, 0, term5855);
        setField(term5868, term5868.getClass(), "clause", null);
        setField(term5868, term5868.getClass(), "astNodeLabel", "cudZvLMQon");
        setElement(term5854, 1, term5868);
        setField(term5881, term5881.getClass(), "clause", null);
        setField(term5881, term5881.getClass(), "astNodeLabel", "lihXWlGDxk");
        setElement(term5854, 2, term5881);
        setField(term5894, term5894.getClass(), "clause", null);
        setField(term5894, term5894.getClass(), "astNodeLabel", "JmcmxoGhIK");
        setElement(term5854, 3, term5894);
        setField(term5907, term5907.getClass(), "clause", null);
        setField(term5907, term5907.getClass(), "astNodeLabel", "jXzmYyrnnT");
        setElement(term5854, 4, term5907);
        setField(term5840, term5840.getClass(), "labeledSubClauses", term5854);
        setField(term5840, term5840.getClass(), "rules", term5920);
        setField(term5840, term5840.getClass(), "seedParentClauses", term5930);
        setBooleanField(term5840, term5840.getClass(), "canMatchZeroChars", false);
        setIntField(term5840, term5840.getClass(), "clauseIdx", -2015048153);
        setField(term5840, term5840.getClass(), "toStringCached", "VGizxZnyHX");
        setField(term5840, term5840.getClass(), "toStringWithRuleNameCached", "kVEZMHmRtR");
        Object term5964 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5964, term5964.getClass(), "ruleName", null);
        setIntField(term5964, term5964.getClass(), "precedence", -1498296052);
        setField(term5964, term5964.getClass(), "associativity", enum18);
        setField(term5964, term5964.getClass(), "labeledClause", null);
        ArrayList term5962 = new ArrayList();
        ((ArrayList) term5962).add(term5964);
        HashMap term5968 = new HashMap();
        ArrayList term5976 = new ArrayList();
        ((ArrayList) term5976).add((Object)null);
        ((ArrayList) term5976).add((Object)null);
        ((ArrayList) term5976).add((Object)null);
        ((ArrayList) term5976).add((Object)null);
        ((ArrayList) term5976).add((Object)null);
        ((ArrayList) term5976).add((Object)null);
        term5960 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term5961 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term5992 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term5994 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term5960, term5960.getClass(), "memoTable", null);
        setField(term5961, term5961.getClass(), "allRules", term5962);
        setField(term5961, term5961.getClass(), "ruleNameWithPrecedenceToRule", term5968);
        setField(term5961, term5961.getClass(), "allClauses", term5976);
        setField(term5960, term5960.getClass(), "grammar", term5961);
        setField(term5960, term5960.getClass(), "input", "JppkknKVOw");
        setIntField(term5992, term5992.getClass(), "value", -1955890973);
        setField(term5960, term5960.getClass(), "numMatchObjectsCreated", term5992);
        setIntField(term5994, term5994.getClass(), "value", -2038273078);
        setField(term5960, term5960.getClass(), "numMatchObjectsMemoized", term5994);
        term5996 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term5996, term5996.getClass(), "clause", null);
        setIntField(term5996, term5996.getClass(), "startPos", 1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSeq");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term5960;
        args[1] = term5996;
        args[2] = "iljANwuEjk";
        callMethod(klass, "match", argTypes, term5840, args);
    }

};


