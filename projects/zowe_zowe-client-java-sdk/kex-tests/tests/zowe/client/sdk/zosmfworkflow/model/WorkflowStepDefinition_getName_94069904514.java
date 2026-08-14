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

public class WorkflowStepDefinition_getName_94069904514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2696;

    public WorkflowStepDefinition_getName_94069904514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2696 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term2696, term2696.getClass(), "name", null);
        setField(term2696, term2696.getClass(), "title", null);
        setField(term2696, term2696.getClass(), "description", null);
        setField(term2696, term2696.getClass(), "prereqStep", null);
        setField(term2696, term2696.getClass(), "optional", null);
        setField(term2696, term2696.getClass(), "steps", null);
        setField(term2696, term2696.getClass(), "variableSpecifications", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2696, args);
    }

};


