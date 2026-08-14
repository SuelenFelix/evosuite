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

public class WorkflowCreateInputData_Builder_system_15001580597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17947;

    public WorkflowCreateInputData_Builder_system_15001580597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17998 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term17998, term17998.getClass(), "name", "");
        setField(term17998, term17998.getClass(), "value", "");
        Object term18001 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18001, term18001.getClass(), "name", "");
        setField(term18001, term18001.getClass(), "value", "");
        Object term18004 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18004, term18004.getClass(), "name", "");
        setField(term18004, term18004.getClass(), "value", "");
        Object term18007 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18007, term18007.getClass(), "name", "");
        setField(term18007, term18007.getClass(), "value", "");
        Object term18010 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18010, term18010.getClass(), "name", "");
        setField(term18010, term18010.getClass(), "value", "");
        Object term18013 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18013, term18013.getClass(), "name", "");
        setField(term18013, term18013.getClass(), "value", "");
        Object term18016 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18016, term18016.getClass(), "name", "");
        setField(term18016, term18016.getClass(), "value", "");
        Object term18019 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18019, term18019.getClass(), "name", "");
        setField(term18019, term18019.getClass(), "value", "");
        Object term18022 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term18022, term18022.getClass(), "name", "");
        setField(term18022, term18022.getClass(), "value", "");
        ArrayList term17996 = new ArrayList();
        ((ArrayList) term17996).add(term17998);
        ((ArrayList) term17996).add(term18001);
        ((ArrayList) term17996).add(term18004);
        ((ArrayList) term17996).add(term18007);
        ((ArrayList) term17996).add(term18010);
        ((ArrayList) term17996).add(term18013);
        ((ArrayList) term17996).add(term18016);
        ((ArrayList) term17996).add(term18019);
        ((ArrayList) term17996).add(term18022);
        Boolean term18087 = new Boolean(true);
        ArrayList term18113 = new ArrayList();
        Boolean term18117 = new Boolean(false);
        Boolean term18131 = new Boolean(true);
        term17947 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term17947, term17947.getClass(), "workflowName", "pOuFRlHmbK");
        setField(term17947, term17947.getClass(), "workflowDefinitionFile", "WrzdBkinqV");
        setField(term17947, term17947.getClass(), "workflowDefinitionFileSystem", "vydWXHfFTw");
        setField(term17947, term17947.getClass(), "variableInputFile", "DRhkpDneCC");
        setField(term17947, term17947.getClass(), "variables", term17996);
        setField(term17947, term17947.getClass(), "resolveGlobalConflictByUsing", "iptRXVDoYE");
        setField(term17947, term17947.getClass(), "system", "kucsxnvbES");
        setField(term17947, term17947.getClass(), "owner", "IdGzDFfcZf");
        setField(term17947, term17947.getClass(), "workflowArchiveSAFID", "KDdRNhZmnU");
        setField(term17947, term17947.getClass(), "comments", "iMsqJaKlDC");
        setField(term17947, term17947.getClass(), "assignToOwner", term18087);
        setField(term17947, term17947.getClass(), "accessType", "aPkGHbZyjj");
        setField(term17947, term17947.getClass(), "accountInfo", "nSWdsVyJRI");
        setField(term17947, term17947.getClass(), "jobStatement", term18113);
        setField(term17947, term17947.getClass(), "deleteCompletedJobs", term18117);
        setField(term17947, term17947.getClass(), "jobsOutputDirectory", "JBOPGgGKnc");
        setField(term17947, term17947.getClass(), "autoDeleteOnCompletion", term18131);
        setField(term17947, term17947.getClass(), "targetSystemuid", "GlPTiCMCGP");
        setField(term17947, term17947.getClass(), "targetSystempwd", "jlcBpLoWfd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oYymmLqbfJ";
        callMethod(klass, "system", argTypes, term17947, args);
    }

};


