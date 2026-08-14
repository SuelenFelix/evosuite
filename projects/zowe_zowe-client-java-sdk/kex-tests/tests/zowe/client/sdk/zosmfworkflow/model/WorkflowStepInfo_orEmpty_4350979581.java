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
import java.util.LinkedList;
import java.lang.Object;

public class WorkflowStepInfo_orEmpty_4350979581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18322;

    public WorkflowStepInfo_orEmpty_4350979581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18325 = newInstance(Class.forName("java.lang.Object"));
        Object term18327 = newInstance(Class.forName("java.lang.Object"));
        Object term18329 = newInstance(Class.forName("java.lang.Object"));
        term18322 = new LinkedList();
        ((LinkedList) term18322).add(term18325);
        ((LinkedList) term18322).add(term18327);
        ((LinkedList) term18322).add(term18329);
        ((LinkedList) term18322).add((Object)null);
        ((LinkedList) term18322).add((Object)null);
        ((LinkedList) term18322).add((Object)null);
        ((LinkedList) term18322).add((Object)null);
        ((LinkedList) term18322).add((Object)null);
        ((LinkedList) term18322).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18322;
        callMethod(klass, "orEmpty", argTypes, null, args);
    }

};


