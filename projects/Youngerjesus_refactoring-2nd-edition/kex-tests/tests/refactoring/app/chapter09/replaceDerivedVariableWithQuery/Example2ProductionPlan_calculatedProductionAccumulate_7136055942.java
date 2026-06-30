package refactoring.app.chapter09.replaceDerivedVariableWithQuery;

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
import static refactoring.app.chapter09.replaceDerivedVariableWithQuery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Example2ProductionPlan_calculatedProductionAccumulate_7136055942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public Example2ProductionPlan_calculatedProductionAccumulate_7136055942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term37, term37.getClass(), "amount", -1339778481);
        Object term39 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term39, term39.getClass(), "amount", 1725571209);
        Object term41 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term41, term41.getClass(), "amount", -522618178);
        Object term43 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term43, term43.getClass(), "amount", 1134449235);
        ArrayList term35 = new ArrayList();
        ((ArrayList) term35).add(term37);
        ((ArrayList) term35).add(term39);
        ((ArrayList) term35).add(term41);
        ((ArrayList) term35).add(term43);
        term33 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan"));
        setIntField(term33, term33.getClass(), "initialProduction", 1227103734);
        setField(term33, term33.getClass(), "adjustments", term35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculatedProductionAccumulate", argTypes, term33, args);
    }

};


