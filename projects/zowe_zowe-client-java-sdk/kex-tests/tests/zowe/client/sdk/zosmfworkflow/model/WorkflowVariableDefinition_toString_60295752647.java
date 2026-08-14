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

public class WorkflowVariableDefinition_toString_60295752647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28446;

    public WorkflowVariableDefinition_toString_60295752647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28446 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28446, term28446.getClass(), "name", null);
        setField(term28446, term28446.getClass(), "scope", null);
        setField(term28446, term28446.getClass(), "abstractInfo", null);
        setField(term28446, term28446.getClass(), "category", null);
        setField(term28446, term28446.getClass(), "choice", null);
        setField(term28446, term28446.getClass(), "decimalPlaces", null);
        setField(term28446, term28446.getClass(), "defaultValue", null);
        setField(term28446, term28446.getClass(), "description", null);
        setField(term28446, term28446.getClass(), "exposeToUser", null);
        setField(term28446, term28446.getClass(), "maxLength", null);
        setField(term28446, term28446.getClass(), "maxValue", null);
        setField(term28446, term28446.getClass(), "minLength", null);
        setField(term28446, term28446.getClass(), "minValue", null);
        setField(term28446, term28446.getClass(), "promptAtCreate", null);
        setField(term28446, term28446.getClass(), "regularExpression", null);
        setField(term28446, term28446.getClass(), "requiredAtCreate", null);
        setField(term28446, term28446.getClass(), "type", null);
        setField(term28446, term28446.getClass(), "validationType", null);
        setField(term28446, term28446.getClass(), "valueMustBeChoice", null);
        setField(term28446, term28446.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28446, args);
    }

};


