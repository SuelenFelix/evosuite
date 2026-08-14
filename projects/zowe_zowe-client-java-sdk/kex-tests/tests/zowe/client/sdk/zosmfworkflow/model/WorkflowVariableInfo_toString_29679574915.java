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

public class WorkflowVariableInfo_toString_29679574915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8649;

    public WorkflowVariableInfo_toString_29679574915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8649 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term8649, term8649.getClass(), "name", null);
        setField(term8649, term8649.getClass(), "scope", null);
        setField(term8649, term8649.getClass(), "type", null);
        setField(term8649, term8649.getClass(), "value", null);
        setField(term8649, term8649.getClass(), "visibility", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8649, args);
    }

};


