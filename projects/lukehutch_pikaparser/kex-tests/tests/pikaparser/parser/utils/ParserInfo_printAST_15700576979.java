package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ParserInfo_printAST_15700576979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4187;

    public ParserInfo_printAST_15700576979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4191 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4191, term4191.getClass(), "ruleName", null);
        setIntField(term4191, term4191.getClass(), "precedence", -2114034003);
        setField(term4191, term4191.getClass(), "associativity", null);
        setField(term4191, term4191.getClass(), "labeledClause", null);
        Object term4193 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4193, term4193.getClass(), "ruleName", null);
        setIntField(term4193, term4193.getClass(), "precedence", 207213904);
        setField(term4193, term4193.getClass(), "associativity", null);
        setField(term4193, term4193.getClass(), "labeledClause", null);
        Object term4195 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4195, term4195.getClass(), "ruleName", null);
        setIntField(term4195, term4195.getClass(), "precedence", -484303394);
        setField(term4195, term4195.getClass(), "associativity", null);
        setField(term4195, term4195.getClass(), "labeledClause", null);
        Object term4197 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4197, term4197.getClass(), "ruleName", null);
        setIntField(term4197, term4197.getClass(), "precedence", -31125530);
        setField(term4197, term4197.getClass(), "associativity", null);
        setField(term4197, term4197.getClass(), "labeledClause", null);
        Object term4199 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4199, term4199.getClass(), "ruleName", null);
        setIntField(term4199, term4199.getClass(), "precedence", 1909773180);
        setField(term4199, term4199.getClass(), "associativity", null);
        setField(term4199, term4199.getClass(), "labeledClause", null);
        Object term4201 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term4201, term4201.getClass(), "ruleName", null);
        setIntField(term4201, term4201.getClass(), "precedence", -970417907);
        setField(term4201, term4201.getClass(), "associativity", null);
        setField(term4201, term4201.getClass(), "labeledClause", null);
        ArrayList term4189 = new ArrayList();
        ((ArrayList) term4189).add(term4191);
        ((ArrayList) term4189).add(term4193);
        ((ArrayList) term4189).add(term4195);
        ((ArrayList) term4189).add(term4197);
        ((ArrayList) term4189).add(term4199);
        ((ArrayList) term4189).add(term4201);
        HashMap term4205 = new HashMap();
        ArrayList term4213 = new ArrayList();
        ((ArrayList) term4213).add((Object)null);
        ((ArrayList) term4213).add((Object)null);
        ((ArrayList) term4213).add((Object)null);
        ((ArrayList) term4213).add((Object)null);
        ((ArrayList) term4213).add((Object)null);
        ((ArrayList) term4213).add((Object)null);
        term4187 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term4188 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term4229 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term4231 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term4187, term4187.getClass(), "memoTable", null);
        setField(term4188, term4188.getClass(), "allRules", term4189);
        setField(term4188, term4188.getClass(), "ruleNameWithPrecedenceToRule", term4205);
        setField(term4188, term4188.getClass(), "allClauses", term4213);
        setField(term4187, term4187.getClass(), "grammar", term4188);
        setField(term4187, term4187.getClass(), "input", "PCipZnmBOF");
        setIntField(term4229, term4229.getClass(), "value", 1725571209);
        setField(term4187, term4187.getClass(), "numMatchObjectsCreated", term4229);
        setIntField(term4231, term4231.getClass(), "value", -522618178);
        setField(term4187, term4187.getClass(), "numMatchObjectsMemoized", term4231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("pikaparser.clause.Clause");
        argTypes[2] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[3];
        args[0] = "tlzpzIjMib";
        args[1] = null;
        args[2] = term4187;
        callMethod(klass, "printAST", argTypes, null, args);
    }

};


