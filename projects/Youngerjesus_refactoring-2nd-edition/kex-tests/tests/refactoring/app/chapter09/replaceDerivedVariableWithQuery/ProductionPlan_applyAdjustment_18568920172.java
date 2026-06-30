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

public class ProductionPlan_applyAdjustment_18568920172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term11;

    public ProductionPlan_applyAdjustment_18568920172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7 = new ArrayList();
        term6 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.ProductionPlan"));
        setField(term6, term6.getClass(), "adjustments", term7);
        term11 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term11, term11.getClass(), "amount", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.ProductionPlan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment");
        Object[] args = new Object[1];
        args[0] = term11;
        callMethod(klass, "applyAdjustment", argTypes, term6, args);
    }

};


