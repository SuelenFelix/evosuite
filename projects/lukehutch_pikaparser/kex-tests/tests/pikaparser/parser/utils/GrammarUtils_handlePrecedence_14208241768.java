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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GrammarUtils_handlePrecedence_14208241768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;
     Object term750;
     Object term754;

    public GrammarUtils_handlePrecedence_14208241768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term866 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term865 = ((Class) term866).getDeclaredField((String) "RIGHT");
        ((Field) term865).setAccessible(true);
        Object enum2 = ((Field) term865).get((Object) null);
        Object term693 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term710 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term693, term693.getClass(), "ruleName", "hRNSzYYIrc");
        setIntField(term693, term693.getClass(), "precedence", 391863371);
        setField(term693, term693.getClass(), "associativity", enum2);
        setField(term710, term710.getClass(), "clause", null);
        setField(term710, term710.getClass(), "astNodeLabel", "");
        setField(term693, term693.getClass(), "labeledClause", term710);
        Object term713 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term716 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term713, term713.getClass(), "ruleName", "");
        setIntField(term713, term713.getClass(), "precedence", -1922583790);
        setField(term713, term713.getClass(), "associativity", enum2);
        setField(term716, term716.getClass(), "clause", null);
        setField(term716, term716.getClass(), "astNodeLabel", null);
        setField(term713, term713.getClass(), "labeledClause", term716);
        Object term718 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term718, term718.getClass(), "ruleName", null);
        setIntField(term718, term718.getClass(), "precedence", -616727354);
        setField(term718, term718.getClass(), "associativity", null);
        setField(term718, term718.getClass(), "labeledClause", null);
        term690 = new LinkedList();
        ((LinkedList) term690).add(term693);
        ((LinkedList) term690).add(term713);
        ((LinkedList) term690).add(term718);
        ((LinkedList) term690).add((Object)null);
        ((LinkedList) term690).add((Object)null);
        ((LinkedList) term690).add((Object)null);
        ((LinkedList) term690).add((Object)null);
        ((LinkedList) term690).add((Object)null);
        ((LinkedList) term690).add((Object)null);
        term750 = new ArrayList();
        term754 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.ArrayList");
        argTypes[3] = Class.forName("java.util.Map");
        Object[] args = new Object[4];
        args[0] = "MjGYSRKTNF";
        args[1] = term690;
        args[2] = term750;
        args[3] = term754;
        callMethod(klass, "handlePrecedence", argTypes, null, args);
    }

};


