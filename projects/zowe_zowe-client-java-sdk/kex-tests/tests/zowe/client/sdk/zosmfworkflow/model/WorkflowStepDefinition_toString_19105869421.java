package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowStepDefinition_toString_19105869421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2703;

    public WorkflowStepDefinition_toString_19105869421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2703 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term2703, term2703.getClass(), "name", null);
        setField(term2703, term2703.getClass(), "title", null);
        setField(term2703, term2703.getClass(), "description", null);
        setField(term2703, term2703.getClass(), "prereqStep", null);
        setField(term2703, term2703.getClass(), "optional", null);
        setField(term2703, term2703.getClass(), "steps", null);
        setField(term2703, term2703.getClass(), "variableSpecifications", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2703, args);
    }

};


