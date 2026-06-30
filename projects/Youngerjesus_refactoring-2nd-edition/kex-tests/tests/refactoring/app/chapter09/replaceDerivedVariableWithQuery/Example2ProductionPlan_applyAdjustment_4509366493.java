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

public class Example2ProductionPlan_applyAdjustment_4509366493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term59;

    public Example2ProductionPlan_applyAdjustment_4509366493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term51, term51.getClass(), "amount", 1585847225);
        Object term53 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term53, term53.getClass(), "amount", 597278769);
        Object term55 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term55, term55.getClass(), "amount", -1685132342);
        ArrayList term49 = new ArrayList();
        ((ArrayList) term49).add(term51);
        ((ArrayList) term49).add(term53);
        ((ArrayList) term49).add(term55);
        term47 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan"));
        setIntField(term47, term47.getClass(), "initialProduction", -883034806);
        setField(term47, term47.getClass(), "adjustments", term49);
        term59 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term59, term59.getClass(), "amount", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "applyAdjustment", argTypes, term47, args);
    }

};


