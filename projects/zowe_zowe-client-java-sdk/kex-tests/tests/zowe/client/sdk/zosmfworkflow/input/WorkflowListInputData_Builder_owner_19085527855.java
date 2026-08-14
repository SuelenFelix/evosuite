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

public class WorkflowListInputData_Builder_owner_19085527855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3372;

    public WorkflowListInputData_Builder_owner_19085527855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3498 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.CategoryType");
        Field term3497 = ((Class) term3498).getDeclaredField((String) "CONFIGURATION");
        ((Field) term3497).setAccessible(true);
        Object enum9 = ((Field) term3497).get((Object) null);
        Class<? extends Object> term3794 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.StatusNameType");
        Field term3793 = ((Class) term3794).getDeclaredField((String) "CANCELED");
        ((Field) term3793).setAccessible(true);
        Object enum10 = ((Field) term3793).get((Object) null);
        term3372 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder"));
        setField(term3372, term3372.getClass(), "workflowName", "HyxfbSQYBe");
        setField(term3372, term3372.getClass(), "category", enum9);
        setField(term3372, term3372.getClass(), "system", "pCTimMblYc");
        setField(term3372, term3372.getClass(), "statusName", enum10);
        setField(term3372, term3372.getClass(), "owner", "hNxWaHcfhY");
        setField(term3372, term3372.getClass(), "vendor", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "owner", argTypes, term3372, args);
    }

};


