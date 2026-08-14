package zowe.client.sdk.zosmfworkflow.input;

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
import static zowe.client.sdk.zosmfworkflow.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class WorkflowListInputData_Builder_vendor_13279019566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4104;

    public WorkflowListInputData_Builder_vendor_13279019566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4258 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term4257 = ((Class) term4258).getDeclaredField((String) "CONFIGURATION");
        ((Field) term4257).setAccessible(true);
        Object enum11 = ((Field) term4257).get((Object) null);
        Class<? extends Object> term4554 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term4553 = ((Class) term4554).getDeclaredField((String) "AUTOMATION_IN_PROGRESS");
        ((Field) term4553).setAccessible(true);
        Object enum12 = ((Field) term4553).get((Object) null);
        term4104 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term4104, term4104.getClass(), "workflowName", "eZFUvlxvGV");
        setField(term4104, term4104.getClass(), "category", enum11);
        setField(term4104, term4104.getClass(), "system", "BYqFIqCKAV");
        setField(term4104, term4104.getClass(), "statusName", enum12);
        setField(term4104, term4104.getClass(), "owner", "vrQLuWIDJX");
        setField(term4104, term4104.getClass(), "vendor", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        callMethod(klass, "vendor", argTypes, term4104, args);
    }

};


