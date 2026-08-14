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

public class WorkflowVariableDefinition_getRequiredAtCreate_171147529342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28441;

    public WorkflowVariableDefinition_getRequiredAtCreate_171147529342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28441 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28441, term28441.getClass(), "name", null);
        setField(term28441, term28441.getClass(), "scope", null);
        setField(term28441, term28441.getClass(), "abstractInfo", null);
        setField(term28441, term28441.getClass(), "category", null);
        setField(term28441, term28441.getClass(), "choice", null);
        setField(term28441, term28441.getClass(), "decimalPlaces", null);
        setField(term28441, term28441.getClass(), "defaultValue", null);
        setField(term28441, term28441.getClass(), "description", null);
        setField(term28441, term28441.getClass(), "exposeToUser", null);
        setField(term28441, term28441.getClass(), "maxLength", null);
        setField(term28441, term28441.getClass(), "maxValue", null);
        setField(term28441, term28441.getClass(), "minLength", null);
        setField(term28441, term28441.getClass(), "minValue", null);
        setField(term28441, term28441.getClass(), "promptAtCreate", null);
        setField(term28441, term28441.getClass(), "regularExpression", null);
        setField(term28441, term28441.getClass(), "requiredAtCreate", null);
        setField(term28441, term28441.getClass(), "type", null);
        setField(term28441, term28441.getClass(), "validationType", null);
        setField(term28441, term28441.getClass(), "valueMustBeChoice", null);
        setField(term28441, term28441.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredAtCreate", argTypes, term28441, args);
    }

};


