package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowListResponse_getWorkflowKey_2146784882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;

    public WorkflowListResponse_getWorkflowKey_2146784882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term442, term442.getClass(), "workflowName", "hNxWaHcfhY");
        setField(term442, term442.getClass(), "workflowKey", "RkybSrpybU");
        setField(term442, term442.getClass(), "workflowDescription", "xOEqzGAmDU");
        setField(term442, term442.getClass(), "workflowID", "eZFUvlxvGV");
        setField(term442, term442.getClass(), "workflowVersion", "BYqFIqCKAV");
        setField(term442, term442.getClass(), "workflowDefinitionFileMD5Value", "vrQLuWIDJX");
        setField(term442, term442.getClass(), "instanceURI", "flxyYxBRtu");
        setField(term442, term442.getClass(), "owner", "OclPbYPkcH");
        setField(term442, term442.getClass(), "vendor", "IoAlmYsBwc");
        setField(term442, term442.getClass(), "access", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowKey", argTypes, term442, args);
    }

};


