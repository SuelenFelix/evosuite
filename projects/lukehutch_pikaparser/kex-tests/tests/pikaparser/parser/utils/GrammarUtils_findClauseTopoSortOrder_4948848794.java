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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class GrammarUtils_findClauseTopoSortOrder_4948848794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term92;
     Object term95;

    public GrammarUtils_findClauseTopoSortOrder_4948848794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term129 = ((Class) term130).getDeclaredField((String) "LEFT");
        ((Field) term129).setAccessible(true);
        Object enum0 = ((Field) term129).get((Object) null);
        term57 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term79 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term57, term57.getClass(), "ruleName", "PAEBtnZtTD");
        setIntField(term57, term57.getClass(), "precedence", 568599855);
        setField(term57, term57.getClass(), "associativity", enum0);
        setField(term79, term79.getClass(), "clause", null);
        setField(term79, term79.getClass(), "astNodeLabel", "sjlJAEtRrb");
        setField(term57, term57.getClass(), "labeledClause", term79);
        term92 = new LinkedList();
        term95 = new LinkedList();
        ((LinkedList) term95).add((Object)null);
        ((LinkedList) term95).add((Object)null);
        ((LinkedList) term95).add((Object)null);
        ((LinkedList) term95).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.GrammarUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.grammar.Rule");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term57;
        args[1] = term92;
        args[2] = term95;
        callMethod(klass, "findClauseTopoSortOrder", argTypes, null, args);
    }

};


