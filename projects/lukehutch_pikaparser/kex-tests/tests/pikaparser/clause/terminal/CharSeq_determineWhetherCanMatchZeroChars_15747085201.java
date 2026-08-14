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

public class CharSeq_determineWhetherCanMatchZeroChars_15747085201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5186;

    public CharSeq_determineWhetherCanMatchZeroChars_15747085201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5410 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5409 = ((Class) term5410).getDeclaredField((String) "LEFT");
        ((Field) term5409).setAccessible(true);
        Object enum16 = ((Field) term5409).get((Object) null);
        Object term5281 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5286 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5281, term5281.getClass(), "ruleName", "");
        setIntField(term5281, term5281.getClass(), "precedence", -2015854073);
        setField(term5281, term5281.getClass(), "associativity", enum16);
        setField(term5286, term5286.getClass(), "clause", null);
        setField(term5286, term5286.getClass(), "astNodeLabel", null);
        setField(term5281, term5281.getClass(), "labeledClause", term5286);
        Object term5287 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5290 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5287, term5287.getClass(), "ruleName", "");
        setIntField(term5287, term5287.getClass(), "precedence", 538259104);
        setField(term5287, term5287.getClass(), "associativity", enum16);
        setField(term5290, term5290.getClass(), "clause", null);
        setField(term5290, term5290.getClass(), "astNodeLabel", null);
        setField(term5287, term5287.getClass(), "labeledClause", term5290);
        Object term5291 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5294 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5291, term5291.getClass(), "ruleName", "");
        setIntField(term5291, term5291.getClass(), "precedence", 96566506);
        setField(term5291, term5291.getClass(), "associativity", enum16);
        setField(term5294, term5294.getClass(), "clause", null);
        setField(term5294, term5294.getClass(), "astNodeLabel", null);
        setField(term5291, term5291.getClass(), "labeledClause", term5294);
        Object term5295 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term5298 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5295, term5295.getClass(), "ruleName", "");
        setIntField(term5295, term5295.getClass(), "precedence", -343325701);
        setField(term5295, term5295.getClass(), "associativity", enum16);
        setField(term5298, term5298.getClass(), "clause", null);
        setField(term5298, term5298.getClass(), "astNodeLabel", null);
        setField(term5295, term5295.getClass(), "labeledClause", term5298);
        Class<? extends Object> term5614 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term5613 = ((Class) term5614).getDeclaredField((String) "RIGHT");
        ((Field) term5613).setAccessible(true);
        Object enum17 = ((Field) term5613).get((Object) null);
        Object term5299 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5299, term5299.getClass(), "ruleName", "");
        setIntField(term5299, term5299.getClass(), "precedence", 107945604);
        setField(term5299, term5299.getClass(), "associativity", enum17);
        setField(term5299, term5299.getClass(), "labeledClause", term5290);
        Object term5304 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term5304, term5304.getClass(), "ruleName", "");
        setIntField(term5304, term5304.getClass(), "precedence", -1963464809);
        setField(term5304, term5304.getClass(), "associativity", enum17);
        setField(term5304, term5304.getClass(), "labeledClause", term5294);
        ArrayList term5279 = new ArrayList();
        ((ArrayList) term5279).add(term5281);
        ((ArrayList) term5279).add(term5287);
        ((ArrayList) term5279).add(term5291);
        ((ArrayList) term5279).add(term5295);
        ((ArrayList) term5279).add(term5299);
        ((ArrayList) term5279).add(term5304);
        ArrayList term5309 = new ArrayList();
        term5186 = newInstance(Class.forName("pikaparser.clause.terminal.CharSeq"));
        Object[] term5200 = (Object[]) newArray("pikaparser.ast.LabeledClause", 6);
        Object term5201 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5214 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5227 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5240 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5253 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term5266 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5186, term5186.getClass(), "str", "PtirvZmsGt");
        setBooleanField(term5186, term5186.getClass(), "ignoreCase", true);
        setField(term5201, term5201.getClass(), "clause", null);
        setField(term5201, term5201.getClass(), "astNodeLabel", "HWkpTmtlrc");
        setElement(term5200, 0, term5201);
        setField(term5214, term5214.getClass(), "clause", null);
        setField(term5214, term5214.getClass(), "astNodeLabel", "hMmaoREuCK");
        setElement(term5200, 1, term5214);
        setField(term5227, term5227.getClass(), "clause", null);
        setField(term5227, term5227.getClass(), "astNodeLabel", "VeDtgDzGAN");
        setElement(term5200, 2, term5227);
        setField(term5240, term5240.getClass(), "clause", null);
        setField(term5240, term5240.getClass(), "astNodeLabel", "aWYOWZFyaX");
        setElement(term5200, 3, term5240);
        setField(term5253, term5253.getClass(), "clause", null);
        setField(term5253, term5253.getClass(), "astNodeLabel", "BRIVNtfUWU");
        setElement(term5200, 4, term5253);
        setField(term5266, term5266.getClass(), "clause", null);
        setField(term5266, term5266.getClass(), "astNodeLabel", "DbiCVtPPCT");
        setElement(term5200, 5, term5266);
        setField(term5186, term5186.getClass(), "labeledSubClauses", term5200);
        setField(term5186, term5186.getClass(), "rules", term5279);
        setField(term5186, term5186.getClass(), "seedParentClauses", term5309);
        setBooleanField(term5186, term5186.getClass(), "canMatchZeroChars", true);
        setIntField(term5186, term5186.getClass(), "clauseIdx", 71190297);
        setField(term5186, term5186.getClass(), "toStringCached", "rLHAoqXgPh");
        setField(term5186, term5186.getClass(), "toStringWithRuleNameCached", "zUlRdimJtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSeq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term5186, args);
    }

};


