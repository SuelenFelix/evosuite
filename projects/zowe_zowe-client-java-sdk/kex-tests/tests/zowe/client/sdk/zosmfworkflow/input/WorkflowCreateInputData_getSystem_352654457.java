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

public class WorkflowCreateInputData_getSystem_352654457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8799;

    public WorkflowCreateInputData_getSystem_352654457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8850 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8850, term8850.getClass(), "name", "");
        setField(term8850, term8850.getClass(), "value", "");
        Object term8853 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8853, term8853.getClass(), "name", "");
        setField(term8853, term8853.getClass(), "value", "");
        Object term8856 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term8856, term8856.getClass(), "name", "");
        setField(term8856, term8856.getClass(), "value", "");
        ArrayList term8848 = new ArrayList();
        ((ArrayList) term8848).add(term8850);
        ((ArrayList) term8848).add(term8853);
        ((ArrayList) term8848).add(term8856);
        Boolean term8921 = new Boolean(true);
        ArrayList term8947 = new ArrayList();
        ((ArrayList) term8947).add("IpQuOGMgmj");
        Boolean term8963 = new Boolean(true);
        Boolean term8977 = new Boolean(true);
        term8799 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term8799, term8799.getClass(), "workflowName", "OIHoJeysUi");
        setField(term8799, term8799.getClass(), "workflowDefinitionFile", "WXMWFDGcLB");
        setField(term8799, term8799.getClass(), "workflowDefinitionFileSystem", "wKWbJssZuG");
        setField(term8799, term8799.getClass(), "variableInputFile", "NzBMMhkhpT");
        setField(term8799, term8799.getClass(), "variables", term8848);
        setField(term8799, term8799.getClass(), "resolveGlobalConflictByUsing", "xvkbvaEGYd");
        setField(term8799, term8799.getClass(), "system", "HBGNxdNURv");
        setField(term8799, term8799.getClass(), "owner", "mfCpTPPQQm");
        setField(term8799, term8799.getClass(), "workflowArchiveSAFID", "OcJCIDNIXA");
        setField(term8799, term8799.getClass(), "comments", "XfRABIFVEp");
        setField(term8799, term8799.getClass(), "assignToOwner", term8921);
        setField(term8799, term8799.getClass(), "accessType", "MHGKyEnwKc");
        setField(term8799, term8799.getClass(), "accountInfo", "ShIELyuULw");
        setField(term8799, term8799.getClass(), "jobStatement", term8947);
        setField(term8799, term8799.getClass(), "deleteCompletedJobs", term8963);
        setField(term8799, term8799.getClass(), "jobsOutputDirectory", "pJbnHTYrxn");
        setField(term8799, term8799.getClass(), "autoDeleteOnCompletion", term8977);
        setField(term8799, term8799.getClass(), "targetSystemuid", "iIRsCSYqXH");
        setField(term8799, term8799.getClass(), "targetSystempwd", "nghfqDXyCG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystem", argTypes, term8799, args);
    }

};


