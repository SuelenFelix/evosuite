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

public class Start_toString_8775654063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865;

    public Start_toString_8775654063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term934 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term933 = ((Class) term934).getDeclaredField((String) "RIGHT");
        ((Field) term933).setAccessible(true);
        Object enum3 = ((Field) term933).get((Object) null);
        Object term869 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term874 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term869, term869.getClass(), "ruleName", "");
        setIntField(term869, term869.getClass(), "precedence", -226514366);
        setField(term869, term869.getClass(), "associativity", enum3);
        setField(term874, term874.getClass(), "clause", null);
        setField(term874, term874.getClass(), "astNodeLabel", null);
        setField(term869, term869.getClass(), "labeledClause", term874);
        Object term875 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term878 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term875, term875.getClass(), "ruleName", "");
        setIntField(term875, term875.getClass(), "precedence", 1193880199);
        setField(term875, term875.getClass(), "associativity", enum3);
        setField(term878, term878.getClass(), "clause", null);
        setField(term878, term878.getClass(), "astNodeLabel", null);
        setField(term875, term875.getClass(), "labeledClause", term878);
        Class<? extends Object> term1141 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1140 = ((Class) term1141).getDeclaredField((String) "RIGHT");
        ((Field) term1140).setAccessible(true);
        Object enum4 = ((Field) term1140).get((Object) null);
        Object term879 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term884 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term879, term879.getClass(), "ruleName", "");
        setIntField(term879, term879.getClass(), "precedence", -1087774327);
        setField(term879, term879.getClass(), "associativity", enum4);
        setField(term884, term884.getClass(), "clause", null);
        setField(term884, term884.getClass(), "astNodeLabel", null);
        setField(term879, term879.getClass(), "labeledClause", term884);
        Object term885 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term888 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term885, term885.getClass(), "ruleName", "");
        setIntField(term885, term885.getClass(), "precedence", -1530420153);
        setField(term885, term885.getClass(), "associativity", enum4);
        setField(term888, term888.getClass(), "clause", null);
        setField(term888, term888.getClass(), "astNodeLabel", null);
        setField(term885, term885.getClass(), "labeledClause", term888);
        Object term889 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term892 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term889, term889.getClass(), "ruleName", "");
        setIntField(term889, term889.getClass(), "precedence", -469968304);
        setField(term889, term889.getClass(), "associativity", enum3);
        setField(term892, term892.getClass(), "clause", null);
        setField(term892, term892.getClass(), "astNodeLabel", null);
        setField(term889, term889.getClass(), "labeledClause", term892);
        Object term893 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term896 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term893, term893.getClass(), "ruleName", "");
        setIntField(term893, term893.getClass(), "precedence", -1145578966);
        setField(term893, term893.getClass(), "associativity", enum3);
        setField(term896, term896.getClass(), "clause", null);
        setField(term896, term896.getClass(), "astNodeLabel", null);
        setField(term893, term893.getClass(), "labeledClause", term896);
        Object term897 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term900 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term897, term897.getClass(), "ruleName", "");
        setIntField(term897, term897.getClass(), "precedence", 679763016);
        setField(term897, term897.getClass(), "associativity", enum3);
        setField(term900, term900.getClass(), "clause", null);
        setField(term900, term900.getClass(), "astNodeLabel", null);
        setField(term897, term897.getClass(), "labeledClause", term900);
        ArrayList term867 = new ArrayList();
        ((ArrayList) term867).add(term869);
        ((ArrayList) term867).add(term875);
        ((ArrayList) term867).add(term879);
        ((ArrayList) term867).add(term885);
        ((ArrayList) term867).add(term889);
        ((ArrayList) term867).add(term893);
        ((ArrayList) term867).add(term897);
        ArrayList term903 = new ArrayList();
        term865 = newInstance(Class.forName("pikaparser.clause.terminal.Start"));
        Object[] term866 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term865, term865.getClass(), "labeledSubClauses", term866);
        setField(term865, term865.getClass(), "rules", term867);
        setField(term865, term865.getClass(), "seedParentClauses", term903);
        setBooleanField(term865, term865.getClass(), "canMatchZeroChars", false);
        setIntField(term865, term865.getClass(), "clauseIdx", 1962444399);
        setField(term865, term865.getClass(), "toStringCached", "GzFkzHGYFt");
        setField(term865, term865.getClass(), "toStringWithRuleNameCached", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Start");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term865, args);
    }

};


