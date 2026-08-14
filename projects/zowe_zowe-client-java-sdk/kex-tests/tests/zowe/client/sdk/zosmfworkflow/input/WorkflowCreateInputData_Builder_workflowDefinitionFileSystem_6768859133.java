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

public class WorkflowCreateInputData_Builder_workflowDefinitionFileSystem_6768859133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16155;

    public WorkflowCreateInputData_Builder_workflowDefinitionFileSystem_6768859133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16206 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16206, term16206.getClass(), "name", "");
        setField(term16206, term16206.getClass(), "value", "");
        Object term16209 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16209, term16209.getClass(), "name", "");
        setField(term16209, term16209.getClass(), "value", "");
        Object term16212 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16212, term16212.getClass(), "name", "");
        setField(term16212, term16212.getClass(), "value", "");
        Object term16215 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16215, term16215.getClass(), "name", "");
        setField(term16215, term16215.getClass(), "value", "");
        Object term16218 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16218, term16218.getClass(), "name", "");
        setField(term16218, term16218.getClass(), "value", "");
        Object term16221 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16221, term16221.getClass(), "name", "");
        setField(term16221, term16221.getClass(), "value", "");
        Object term16224 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16224, term16224.getClass(), "name", "");
        setField(term16224, term16224.getClass(), "value", "");
        Object term16227 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16227, term16227.getClass(), "name", "");
        setField(term16227, term16227.getClass(), "value", "");
        Object term16230 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term16230, term16230.getClass(), "name", "");
        setField(term16230, term16230.getClass(), "value", "");
        ArrayList term16204 = new ArrayList();
        ((ArrayList) term16204).add(term16206);
        ((ArrayList) term16204).add(term16209);
        ((ArrayList) term16204).add(term16212);
        ((ArrayList) term16204).add(term16215);
        ((ArrayList) term16204).add(term16218);
        ((ArrayList) term16204).add(term16221);
        ((ArrayList) term16204).add(term16224);
        ((ArrayList) term16204).add(term16227);
        ((ArrayList) term16204).add(term16230);
        Boolean term16295 = new Boolean(false);
        ArrayList term16321 = new ArrayList();
        ((ArrayList) term16321).add("PTEndmPMzk");
        ((ArrayList) term16321).add("aJQuCOCvZs");
        ((ArrayList) term16321).add("lHYNCJRiOv");
        ((ArrayList) term16321).add("QVLresHoaP");
        ((ArrayList) term16321).add("IbxeAMwLVt");
        ((ArrayList) term16321).add("bShlAqoTmZ");
        ((ArrayList) term16321).add("nOKlKlNhtU");
        Boolean term16409 = new Boolean(false);
        Boolean term16423 = new Boolean(false);
        term16155 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term16155, term16155.getClass(), "workflowName", "dQxXGBtDLZ");
        setField(term16155, term16155.getClass(), "workflowDefinitionFile", "EgSgEFIyyN");
        setField(term16155, term16155.getClass(), "workflowDefinitionFileSystem", "iAOFcXaLSf");
        setField(term16155, term16155.getClass(), "variableInputFile", "EHoNUaeyvT");
        setField(term16155, term16155.getClass(), "variables", term16204);
        setField(term16155, term16155.getClass(), "resolveGlobalConflictByUsing", "tvxYdqiyGc");
        setField(term16155, term16155.getClass(), "system", "ZEXFoMSKeG");
        setField(term16155, term16155.getClass(), "owner", "HvxahUfZcJ");
        setField(term16155, term16155.getClass(), "workflowArchiveSAFID", "WkLpmqoQxy");
        setField(term16155, term16155.getClass(), "comments", "XiNoscmYhd");
        setField(term16155, term16155.getClass(), "assignToOwner", term16295);
        setField(term16155, term16155.getClass(), "accessType", "asMqnMNrZp");
        setField(term16155, term16155.getClass(), "accountInfo", "pqFUMTCKJd");
        setField(term16155, term16155.getClass(), "jobStatement", term16321);
        setField(term16155, term16155.getClass(), "deleteCompletedJobs", term16409);
        setField(term16155, term16155.getClass(), "jobsOutputDirectory", "gXFNBHJSey");
        setField(term16155, term16155.getClass(), "autoDeleteOnCompletion", term16423);
        setField(term16155, term16155.getClass(), "targetSystemuid", "wUcSfItZgv");
        setField(term16155, term16155.getClass(), "targetSystempwd", "rOfPCPHmtJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EnmiAvfpJv";
        callMethod(klass, "workflowDefinitionFileSystem", argTypes, term16155, args);
    }

};


