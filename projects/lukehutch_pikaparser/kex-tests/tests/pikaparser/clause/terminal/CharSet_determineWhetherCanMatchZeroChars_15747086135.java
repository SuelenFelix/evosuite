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

public class CharSet_determineWhetherCanMatchZeroChars_15747086135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13335;

    public CharSet_determineWhetherCanMatchZeroChars_15747086135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13454 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term13454, term13454.getClass(), "ruleName", null);
        setIntField(term13454, term13454.getClass(), "precedence", 0);
        setField(term13454, term13454.getClass(), "associativity", null);
        setField(term13454, term13454.getClass(), "labeledClause", null);
        Object term13456 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term13456, term13456.getClass(), "ruleName", null);
        setIntField(term13456, term13456.getClass(), "precedence", 0);
        setField(term13456, term13456.getClass(), "associativity", null);
        setField(term13456, term13456.getClass(), "labeledClause", null);
        Object term13458 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term13458, term13458.getClass(), "ruleName", null);
        setIntField(term13458, term13458.getClass(), "precedence", 0);
        setField(term13458, term13458.getClass(), "associativity", null);
        setField(term13458, term13458.getClass(), "labeledClause", null);
        Object term13460 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term13460, term13460.getClass(), "ruleName", null);
        setIntField(term13460, term13460.getClass(), "precedence", 0);
        setField(term13460, term13460.getClass(), "associativity", null);
        setField(term13460, term13460.getClass(), "labeledClause", null);
        Object term13462 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term13462, term13462.getClass(), "ruleName", null);
        setIntField(term13462, term13462.getClass(), "precedence", 0);
        setField(term13462, term13462.getClass(), "associativity", null);
        setField(term13462, term13462.getClass(), "labeledClause", null);
        ArrayList term13452 = new ArrayList();
        ((ArrayList) term13452).add(term13454);
        ((ArrayList) term13452).add(term13456);
        ((ArrayList) term13452).add(term13458);
        ((ArrayList) term13452).add(term13460);
        ((ArrayList) term13452).add(term13462);
        ArrayList term13466 = new ArrayList();
        ((ArrayList) term13466).add((Object)null);
        term13335 = newInstance(Class.forName("pikaparser.clause.terminal.CharSet"));
        Object term13336 = newInstance(Class.forName("java.util.BitSet"));
        long[] term13337 = (long[]) newLongArray(1);
        Object term13341 = newInstance(Class.forName("java.util.BitSet"));
        long[] term13342 = (long[]) newLongArray(1);
        Object[] term13346 = (Object[]) newArray("pikaparser.ast.LabeledClause", 9);
        Object term13347 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13360 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13373 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13386 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13399 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13412 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13425 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13438 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term13451 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term13336, term13336.getClass(), "words", term13337);
        setIntField(term13336, term13336.getClass(), "wordsInUse", -1464172784);
        setBooleanField(term13336, term13336.getClass(), "sizeIsSticky", false);
        setField(term13335, term13335.getClass(), "chars", term13336);
        setField(term13341, term13341.getClass(), "words", term13342);
        setIntField(term13341, term13341.getClass(), "wordsInUse", 32185364);
        setBooleanField(term13341, term13341.getClass(), "sizeIsSticky", true);
        setField(term13335, term13335.getClass(), "invertedChars", term13341);
        setField(term13347, term13347.getClass(), "clause", null);
        setField(term13347, term13347.getClass(), "astNodeLabel", "zLMTXDQHYH");
        setElement(term13346, 0, term13347);
        setField(term13360, term13360.getClass(), "clause", null);
        setField(term13360, term13360.getClass(), "astNodeLabel", "PqywFWJlpE");
        setElement(term13346, 1, term13360);
        setField(term13373, term13373.getClass(), "clause", null);
        setField(term13373, term13373.getClass(), "astNodeLabel", "OzXRsFGTIp");
        setElement(term13346, 2, term13373);
        setField(term13386, term13386.getClass(), "clause", null);
        setField(term13386, term13386.getClass(), "astNodeLabel", "TjWpyghUWN");
        setElement(term13346, 3, term13386);
        setField(term13399, term13399.getClass(), "clause", null);
        setField(term13399, term13399.getClass(), "astNodeLabel", "dkZFDZxcde");
        setElement(term13346, 4, term13399);
        setField(term13412, term13412.getClass(), "clause", null);
        setField(term13412, term13412.getClass(), "astNodeLabel", "WXcZEtUKlI");
        setElement(term13346, 5, term13412);
        setField(term13425, term13425.getClass(), "clause", null);
        setField(term13425, term13425.getClass(), "astNodeLabel", "IkpjUOuWQU");
        setElement(term13346, 6, term13425);
        setField(term13438, term13438.getClass(), "clause", null);
        setField(term13438, term13438.getClass(), "astNodeLabel", "boSSpezHeU");
        setElement(term13346, 7, term13438);
        setField(term13451, term13451.getClass(), "clause", null);
        setField(term13451, term13451.getClass(), "astNodeLabel", null);
        setElement(term13346, 8, term13451);
        setField(term13335, term13335.getClass(), "labeledSubClauses", term13346);
        setField(term13335, term13335.getClass(), "rules", term13452);
        setField(term13335, term13335.getClass(), "seedParentClauses", term13466);
        setBooleanField(term13335, term13335.getClass(), "canMatchZeroChars", true);
        setIntField(term13335, term13335.getClass(), "clauseIdx", 1768204942);
        setField(term13335, term13335.getClass(), "toStringCached", "OUeBWNTQDh");
        setField(term13335, term13335.getClass(), "toStringWithRuleNameCached", "gltJarNuUk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term13335, args);
    }

};


