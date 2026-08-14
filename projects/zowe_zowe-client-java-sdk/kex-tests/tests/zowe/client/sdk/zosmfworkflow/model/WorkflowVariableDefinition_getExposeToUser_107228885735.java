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

public class WorkflowVariableDefinition_getExposeToUser_107228885735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28434;

    public WorkflowVariableDefinition_getExposeToUser_107228885735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28434 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28434, term28434.getClass(), "name", null);
        setField(term28434, term28434.getClass(), "scope", null);
        setField(term28434, term28434.getClass(), "abstractInfo", null);
        setField(term28434, term28434.getClass(), "category", null);
        setField(term28434, term28434.getClass(), "choice", null);
        setField(term28434, term28434.getClass(), "decimalPlaces", null);
        setField(term28434, term28434.getClass(), "defaultValue", null);
        setField(term28434, term28434.getClass(), "description", null);
        setField(term28434, term28434.getClass(), "exposeToUser", null);
        setField(term28434, term28434.getClass(), "maxLength", null);
        setField(term28434, term28434.getClass(), "maxValue", null);
        setField(term28434, term28434.getClass(), "minLength", null);
        setField(term28434, term28434.getClass(), "minValue", null);
        setField(term28434, term28434.getClass(), "promptAtCreate", null);
        setField(term28434, term28434.getClass(), "regularExpression", null);
        setField(term28434, term28434.getClass(), "requiredAtCreate", null);
        setField(term28434, term28434.getClass(), "type", null);
        setField(term28434, term28434.getClass(), "validationType", null);
        setField(term28434, term28434.getClass(), "valueMustBeChoice", null);
        setField(term28434, term28434.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExposeToUser", argTypes, term28434, args);
    }

};


