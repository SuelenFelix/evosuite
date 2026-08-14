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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class WorkflowCreateInputData_getAccessType_41698760612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10766;

    public WorkflowCreateInputData_getAccessType_41698760612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10817 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10817, term10817.getClass(), "name", "");
        setField(term10817, term10817.getClass(), "value", "");
        Object term10820 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10820, term10820.getClass(), "name", "");
        setField(term10820, term10820.getClass(), "value", "");
        Object term10823 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10823, term10823.getClass(), "name", "");
        setField(term10823, term10823.getClass(), "value", "");
        Object term10826 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10826, term10826.getClass(), "name", "");
        setField(term10826, term10826.getClass(), "value", "");
        Object term10829 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term10829, term10829.getClass(), "name", "");
        setField(term10829, term10829.getClass(), "value", "");
        ArrayList term10815 = new ArrayList();
        ((ArrayList) term10815).add(term10817);
        ((ArrayList) term10815).add(term10820);
        ((ArrayList) term10815).add(term10823);
        ((ArrayList) term10815).add(term10826);
        ((ArrayList) term10815).add(term10829);
        Boolean term10894 = new Boolean(true);
        ArrayList term10920 = new ArrayList();
        ((ArrayList) term10920).add("cSHGbqKqlN");
        ((ArrayList) term10920).add("pFAfANnxup");
        ((ArrayList) term10920).add("FbSIUZyBXZ");
        ((ArrayList) term10920).add("mhQDwIyrRi");
        ((ArrayList) term10920).add("HpZXWDPhlg");
        ((ArrayList) term10920).add("lBOokzEPfe");
        Boolean term10996 = new Boolean(true);
        Boolean term11010 = new Boolean(true);
        term10766 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term10766, term10766.getClass(), "workflowName", "IHqvyhMtuM");
        setField(term10766, term10766.getClass(), "workflowDefinitionFile", "dAldIGYAXV");
        setField(term10766, term10766.getClass(), "workflowDefinitionFileSystem", "mLwibAPEsa");
        setField(term10766, term10766.getClass(), "variableInputFile", "zsWKWiTFuo");
        setField(term10766, term10766.getClass(), "variables", term10815);
        setField(term10766, term10766.getClass(), "resolveGlobalConflictByUsing", "llRfwANcVF");
        setField(term10766, term10766.getClass(), "system", "sUEeHQTWkA");
        setField(term10766, term10766.getClass(), "owner", "BDIRCxAWLA");
        setField(term10766, term10766.getClass(), "workflowArchiveSAFID", "eOJfbiZLnb");
        setField(term10766, term10766.getClass(), "comments", "nKZKnxWYCK");
        setField(term10766, term10766.getClass(), "assignToOwner", term10894);
        setField(term10766, term10766.getClass(), "accessType", "JOqQxuzRuZ");
        setField(term10766, term10766.getClass(), "accountInfo", "RSaoipUlsg");
        setField(term10766, term10766.getClass(), "jobStatement", term10920);
        setField(term10766, term10766.getClass(), "deleteCompletedJobs", term10996);
        setField(term10766, term10766.getClass(), "jobsOutputDirectory", "dtGZCsKXbW");
        setField(term10766, term10766.getClass(), "autoDeleteOnCompletion", term11010);
        setField(term10766, term10766.getClass(), "targetSystemuid", "bdyhHbDAmJ");
        setField(term10766, term10766.getClass(), "targetSystempwd", "BBXiTNHqGE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessType", argTypes, term10766, args);
    }

};


