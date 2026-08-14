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

public class WorkflowListArchivedInputData_Builder_view_5558357872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32235;
     Object enum35;

    public WorkflowListArchivedInputData_Builder_view_5558357872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32269 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term32268 = ((Class) term32269).getDeclaredField((String) "DESC");
        ((Field) term32268).setAccessible(true);
        Object enum34 = ((Field) term32268).get((Object) null);
        Class<? extends Object> term32523 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.ViewType");
        Field term32522 = ((Class) term32523).getDeclaredField((String) "DOMAIN");
        ((Field) term32522).setAccessible(true);
        enum35 = ((Field) term32522).get((Object) null);
        term32235 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder"));
        setField(term32235, term32235.getClass(), "orderBy", enum34);
        setField(term32235, term32235.getClass(), "view", enum35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowListArchivedInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.ViewType");
        Object[] args = new Object[1];
        args[0] = enum35;
        callMethod(klass, "view", argTypes, term32235, args);
    }

};


