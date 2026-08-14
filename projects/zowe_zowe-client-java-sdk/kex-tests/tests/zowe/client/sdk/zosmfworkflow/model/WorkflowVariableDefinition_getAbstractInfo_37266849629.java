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

public class WorkflowVariableDefinition_getAbstractInfo_37266849629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28428;

    public WorkflowVariableDefinition_getAbstractInfo_37266849629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28428 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term28428, term28428.getClass(), "name", null);
        setField(term28428, term28428.getClass(), "scope", null);
        setField(term28428, term28428.getClass(), "abstractInfo", null);
        setField(term28428, term28428.getClass(), "category", null);
        setField(term28428, term28428.getClass(), "choice", null);
        setField(term28428, term28428.getClass(), "decimalPlaces", null);
        setField(term28428, term28428.getClass(), "defaultValue", null);
        setField(term28428, term28428.getClass(), "description", null);
        setField(term28428, term28428.getClass(), "exposeToUser", null);
        setField(term28428, term28428.getClass(), "maxLength", null);
        setField(term28428, term28428.getClass(), "maxValue", null);
        setField(term28428, term28428.getClass(), "minLength", null);
        setField(term28428, term28428.getClass(), "minValue", null);
        setField(term28428, term28428.getClass(), "promptAtCreate", null);
        setField(term28428, term28428.getClass(), "regularExpression", null);
        setField(term28428, term28428.getClass(), "requiredAtCreate", null);
        setField(term28428, term28428.getClass(), "type", null);
        setField(term28428, term28428.getClass(), "validationType", null);
        setField(term28428, term28428.getClass(), "valueMustBeChoice", null);
        setField(term28428, term28428.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbstractInfo", argTypes, term28428, args);
    }

};


