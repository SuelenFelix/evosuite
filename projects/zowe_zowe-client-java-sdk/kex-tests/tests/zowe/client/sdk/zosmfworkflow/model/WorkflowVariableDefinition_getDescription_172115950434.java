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

public class WorkflowVariableDefinition_getDescription_172115950434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28433;

    public WorkflowVariableDefinition_getDescription_172115950434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28433 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28433, term28433.getClass(), "name", null);
        setField(term28433, term28433.getClass(), "scope", null);
        setField(term28433, term28433.getClass(), "abstractInfo", null);
        setField(term28433, term28433.getClass(), "category", null);
        setField(term28433, term28433.getClass(), "choice", null);
        setField(term28433, term28433.getClass(), "decimalPlaces", null);
        setField(term28433, term28433.getClass(), "defaultValue", null);
        setField(term28433, term28433.getClass(), "description", null);
        setField(term28433, term28433.getClass(), "exposeToUser", null);
        setField(term28433, term28433.getClass(), "maxLength", null);
        setField(term28433, term28433.getClass(), "maxValue", null);
        setField(term28433, term28433.getClass(), "minLength", null);
        setField(term28433, term28433.getClass(), "minValue", null);
        setField(term28433, term28433.getClass(), "promptAtCreate", null);
        setField(term28433, term28433.getClass(), "regularExpression", null);
        setField(term28433, term28433.getClass(), "requiredAtCreate", null);
        setField(term28433, term28433.getClass(), "type", null);
        setField(term28433, term28433.getClass(), "validationType", null);
        setField(term28433, term28433.getClass(), "valueMustBeChoice", null);
        setField(term28433, term28433.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term28433, args);
    }

};


