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

public class WorkflowVariableDefinition_getMaxLength_66280886136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28435;

    public WorkflowVariableDefinition_getMaxLength_66280886136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28435 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28435, term28435.getClass(), "name", null);
        setField(term28435, term28435.getClass(), "scope", null);
        setField(term28435, term28435.getClass(), "abstractInfo", null);
        setField(term28435, term28435.getClass(), "category", null);
        setField(term28435, term28435.getClass(), "choice", null);
        setField(term28435, term28435.getClass(), "decimalPlaces", null);
        setField(term28435, term28435.getClass(), "defaultValue", null);
        setField(term28435, term28435.getClass(), "description", null);
        setField(term28435, term28435.getClass(), "exposeToUser", null);
        setField(term28435, term28435.getClass(), "maxLength", null);
        setField(term28435, term28435.getClass(), "maxValue", null);
        setField(term28435, term28435.getClass(), "minLength", null);
        setField(term28435, term28435.getClass(), "minValue", null);
        setField(term28435, term28435.getClass(), "promptAtCreate", null);
        setField(term28435, term28435.getClass(), "regularExpression", null);
        setField(term28435, term28435.getClass(), "requiredAtCreate", null);
        setField(term28435, term28435.getClass(), "type", null);
        setField(term28435, term28435.getClass(), "validationType", null);
        setField(term28435, term28435.getClass(), "valueMustBeChoice", null);
        setField(term28435, term28435.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLength", argTypes, term28435, args);
    }

};


