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

public class Example2ProductionPlan_getProduction_21449626921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public Example2ProductionPlan_getProduction_21449626921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term21, term21.getClass(), "amount", 391863371);
        Object term23 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term23, term23.getClass(), "amount", -1922583790);
        Object term25 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term25, term25.getClass(), "amount", -616727354);
        Object term27 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term27, term27.getClass(), "amount", -1955890973);
        Object term29 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Adjustment"));
        setIntField(term29, term29.getClass(), "amount", -2038273078);
        ArrayList term19 = new ArrayList();
        ((ArrayList) term19).add(term21);
        ((ArrayList) term19).add(term23);
        ((ArrayList) term19).add(term25);
        ((ArrayList) term19).add(term27);
        ((ArrayList) term19).add(term29);
        term17 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan"));
        setIntField(term17, term17.getClass(), "initialProduction", 1484323161);
        setField(term17, term17.getClass(), "adjustments", term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduction", argTypes, term17, args);
    }

};


