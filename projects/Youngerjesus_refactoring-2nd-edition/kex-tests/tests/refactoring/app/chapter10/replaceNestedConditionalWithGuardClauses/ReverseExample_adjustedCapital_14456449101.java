package refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses;

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
import static refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReverseExample_adjustedCapital_14456449101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public ReverseExample_adjustedCapital_14456449101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.ReverseExample"));
        term2 = newInstance(Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Instrument"));
        setIntField(term2, term2.getClass(), "capital", 568599855);
        setDoubleField(term2, term2.getClass(), "interRate", 0.13238746331190498);
        setIntField(term2, term2.getClass(), "duration", 1162663216);
        setIntField(term2, term2.getClass(), "income", 1484323161);
        setDoubleField(term2, term2.getClass(), "adjustmentFactor", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.ReverseExample");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Instrument");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "adjustedCapital", argTypes, term1, args);
    }

};


