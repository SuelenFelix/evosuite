package pikaparser.grammar;

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
import static pikaparser.grammar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Rule_toString_13888338352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;

    public Rule_toString_13888338352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term321 = ((Class) term322).getDeclaredField((String) "LEFT");
        ((Field) term321).setAccessible(true);
        Object enum1 = ((Field) term321).get((Object) null);
        term276 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term298 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term276, term276.getClass(), "ruleName", "MuLcgQHgqz");
        setIntField(term276, term276.getClass(), "precedence", 1162663216);
        setField(term276, term276.getClass(), "associativity", enum1);
        setField(term298, term298.getClass(), "clause", null);
        setField(term298, term298.getClass(), "astNodeLabel", "xxtlPwDYFs");
        setField(term276, term276.getClass(), "labeledClause", term298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.grammar.Rule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term276, args);
    }

};


