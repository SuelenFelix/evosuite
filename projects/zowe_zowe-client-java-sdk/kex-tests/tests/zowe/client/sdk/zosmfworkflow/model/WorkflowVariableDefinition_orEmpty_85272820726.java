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

public class WorkflowVariableDefinition_orEmpty_85272820726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28425;

    public WorkflowVariableDefinition_orEmpty_85272820726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28425 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28425, term28425.getClass(), "name", null);
        setField(term28425, term28425.getClass(), "scope", null);
        setField(term28425, term28425.getClass(), "abstractInfo", null);
        setField(term28425, term28425.getClass(), "category", null);
        setField(term28425, term28425.getClass(), "choice", null);
        setField(term28425, term28425.getClass(), "decimalPlaces", null);
        setField(term28425, term28425.getClass(), "defaultValue", null);
        setField(term28425, term28425.getClass(), "description", null);
        setField(term28425, term28425.getClass(), "exposeToUser", null);
        setField(term28425, term28425.getClass(), "maxLength", null);
        setField(term28425, term28425.getClass(), "maxValue", null);
        setField(term28425, term28425.getClass(), "minLength", null);
        setField(term28425, term28425.getClass(), "minValue", null);
        setField(term28425, term28425.getClass(), "promptAtCreate", null);
        setField(term28425, term28425.getClass(), "regularExpression", null);
        setField(term28425, term28425.getClass(), "requiredAtCreate", null);
        setField(term28425, term28425.getClass(), "type", null);
        setField(term28425, term28425.getClass(), "validationType", null);
        setField(term28425, term28425.getClass(), "valueMustBeChoice", null);
        setField(term28425, term28425.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "orEmpty", argTypes, term28425, args);
    }

};


