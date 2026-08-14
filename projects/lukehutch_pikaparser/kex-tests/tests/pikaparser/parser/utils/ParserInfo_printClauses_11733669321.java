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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class ParserInfo_printClauses_11733669321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2809;

    public ParserInfo_printClauses_11733669321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2858 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2857 = ((Class) term2858).getDeclaredField((String) "LEFT");
        ((Field) term2857).setAccessible(true);
        Object enum4 = ((Field) term2857).get((Object) null);
        Object term2812 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2817 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2812, term2812.getClass(), "ruleName", "");
        setIntField(term2812, term2812.getClass(), "precedence", 1114000454);
        setField(term2812, term2812.getClass(), "associativity", enum4);
        setField(term2817, term2817.getClass(), "clause", null);
        setField(term2817, term2817.getClass(), "astNodeLabel", null);
        setField(term2812, term2812.getClass(), "labeledClause", term2817);
        Object term2818 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2821 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2818, term2818.getClass(), "ruleName", "");
        setIntField(term2818, term2818.getClass(), "precedence", -556405712);
        setField(term2818, term2818.getClass(), "associativity", enum4);
        setField(term2821, term2821.getClass(), "clause", null);
        setField(term2821, term2821.getClass(), "astNodeLabel", null);
        setField(term2818, term2818.getClass(), "labeledClause", term2821);
        Object term2822 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2825 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2822, term2822.getClass(), "ruleName", "");
        setIntField(term2822, term2822.getClass(), "precedence", -1772434990);
        setField(term2822, term2822.getClass(), "associativity", enum4);
        setField(term2825, term2825.getClass(), "clause", null);
        setField(term2825, term2825.getClass(), "astNodeLabel", null);
        setField(term2822, term2822.getClass(), "labeledClause", term2825);
        Class<? extends Object> term3062 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3061 = ((Class) term3062).getDeclaredField((String) "RIGHT");
        ((Field) term3061).setAccessible(true);
        Object enum5 = ((Field) term3061).get((Object) null);
        Object term2826 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2831 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2826, term2826.getClass(), "ruleName", "");
        setIntField(term2826, term2826.getClass(), "precedence", -1845499264);
        setField(term2826, term2826.getClass(), "associativity", enum5);
        setField(term2831, term2831.getClass(), "clause", null);
        setField(term2831, term2831.getClass(), "astNodeLabel", null);
        setField(term2826, term2826.getClass(), "labeledClause", term2831);
        Object term2832 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2835 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2832, term2832.getClass(), "ruleName", "");
        setIntField(term2832, term2832.getClass(), "precedence", -505439934);
        setField(term2832, term2832.getClass(), "associativity", enum4);
        setField(term2835, term2835.getClass(), "clause", null);
        setField(term2835, term2835.getClass(), "astNodeLabel", null);
        setField(term2832, term2832.getClass(), "labeledClause", term2835);
        Object term2836 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2839 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2836, term2836.getClass(), "ruleName", "");
        setIntField(term2836, term2836.getClass(), "precedence", -344842608);
        setField(term2836, term2836.getClass(), "associativity", enum4);
        setField(term2839, term2839.getClass(), "clause", null);
        setField(term2839, term2839.getClass(), "astNodeLabel", null);
        setField(term2836, term2836.getClass(), "labeledClause", term2839);
        ArrayList term2810 = new ArrayList();
        ((ArrayList) term2810).add(term2812);
        ((ArrayList) term2810).add(term2818);
        ((ArrayList) term2810).add(term2822);
        ((ArrayList) term2810).add(term2826);
        ((ArrayList) term2810).add(term2832);
        ((ArrayList) term2810).add(term2836);
        HashMap term2842 = new HashMap();
        ArrayList term2853 = new ArrayList();
        ((ArrayList) term2853).add((Object)null);
        ((ArrayList) term2853).add((Object)null);
        term2809 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        setField(term2809, term2809.getClass(), "allRules", term2810);
        setField(term2809, term2809.getClass(), "ruleNameWithPrecedenceToRule", term2842);
        setField(term2809, term2809.getClass(), "allClauses", term2853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.grammar.Grammar");
        Object[] args = new Object[1];
        args[0] = term2809;
        callMethod(klass, "printClauses", argTypes, null, args);
    }

};


