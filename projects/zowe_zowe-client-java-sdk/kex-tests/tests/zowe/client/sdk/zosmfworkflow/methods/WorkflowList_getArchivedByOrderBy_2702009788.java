package zowe.client.sdk.zosmfworkflow.methods;

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
import static zowe.client.sdk.zosmfworkflow.methods.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class WorkflowList_getArchivedByOrderBy_2702009788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942;
     Object enum2;

    public WorkflowList_getArchivedByOrderBy_2702009788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList"));
        setField(term942, term942.getClass(), "connection", null);
        setField(term942, term942.getClass(), "request", null);
        Class<? extends Object> term984 = Class.forName((String) "zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Field term983 = ((Class) term984).getDeclaredField((String) "DESC");
        ((Field) term983).setAccessible(true);
        enum2 = ((Field) term983).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.methods.WorkflowList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("zowe.client.sdk.zosmfworkflow.types.OrderByType");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "getArchivedByOrderBy", argTypes, term942, args);
    }

};


