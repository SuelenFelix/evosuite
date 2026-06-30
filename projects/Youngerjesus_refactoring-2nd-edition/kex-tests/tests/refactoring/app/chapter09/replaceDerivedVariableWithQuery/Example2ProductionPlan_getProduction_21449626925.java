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

public class Example2ProductionPlan_getProduction_21449626925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;

    public Example2ProductionPlan_getProduction_21449626925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan"));
        setIntField(term63, term63.getClass(), "initialProduction", 0);
        setField(term63, term63.getClass(), "adjustments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter09.replaceDerivedVariableWithQuery.Example2ProductionPlan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduction", argTypes, term63, args);
    }

};


