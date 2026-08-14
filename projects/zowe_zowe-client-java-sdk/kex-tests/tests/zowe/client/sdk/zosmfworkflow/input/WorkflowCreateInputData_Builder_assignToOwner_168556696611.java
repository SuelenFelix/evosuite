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

public class WorkflowCreateInputData_Builder_assignToOwner_168556696611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19499;
     Object term19757;

    public WorkflowCreateInputData_Builder_assignToOwner_168556696611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19550 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19550, term19550.getClass(), "name", "");
        setField(term19550, term19550.getClass(), "value", "");
        Object term19553 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19553, term19553.getClass(), "name", "");
        setField(term19553, term19553.getClass(), "value", "");
        Object term19556 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19556, term19556.getClass(), "name", "");
        setField(term19556, term19556.getClass(), "value", "");
        Object term19559 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19559, term19559.getClass(), "name", "");
        setField(term19559, term19559.getClass(), "value", "");
        Object term19562 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19562, term19562.getClass(), "name", "");
        setField(term19562, term19562.getClass(), "value", "");
        Object term19565 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19565, term19565.getClass(), "name", "");
        setField(term19565, term19565.getClass(), "value", "");
        Object term19568 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19568, term19568.getClass(), "name", "");
        setField(term19568, term19568.getClass(), "value", "");
        Object term19571 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19571, term19571.getClass(), "name", "");
        setField(term19571, term19571.getClass(), "value", "");
        Object term19574 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19574, term19574.getClass(), "name", "");
        setField(term19574, term19574.getClass(), "value", "");
        ArrayList term19548 = new ArrayList();
        ((ArrayList) term19548).add(term19550);
        ((ArrayList) term19548).add(term19553);
        ((ArrayList) term19548).add(term19556);
        ((ArrayList) term19548).add(term19559);
        ((ArrayList) term19548).add(term19562);
        ((ArrayList) term19548).add(term19565);
        ((ArrayList) term19548).add(term19568);
        ((ArrayList) term19548).add(term19571);
        ((ArrayList) term19548).add(term19574);
        Boolean term19639 = new Boolean(true);
        ArrayList term19665 = new ArrayList();
        ((ArrayList) term19665).add("TbiwoiebNe");
        ((ArrayList) term19665).add("laTITSWZuc");
        ((ArrayList) term19665).add("fkzRpxlAqS");
        ((ArrayList) term19665).add("VYvbTGKslj");
        Boolean term19717 = new Boolean(true);
        Boolean term19731 = new Boolean(true);
        term19499 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term19499, term19499.getClass(), "workflowName", "JukEMhPWql");
        setField(term19499, term19499.getClass(), "workflowDefinitionFile", "ZdNcodHERG");
        setField(term19499, term19499.getClass(), "workflowDefinitionFileSystem", "CLHomjAqIM");
        setField(term19499, term19499.getClass(), "variableInputFile", "mzCFLzFuSj");
        setField(term19499, term19499.getClass(), "variables", term19548);
        setField(term19499, term19499.getClass(), "resolveGlobalConflictByUsing", "lRaSlqzqNY");
        setField(term19499, term19499.getClass(), "system", "TiEyxWXsra");
        setField(term19499, term19499.getClass(), "owner", "TuLgwTZsPP");
        setField(term19499, term19499.getClass(), "workflowArchiveSAFID", "KoasxTJGpx");
        setField(term19499, term19499.getClass(), "comments", "ceGeARYMoa");
        setField(term19499, term19499.getClass(), "assignToOwner", term19639);
        setField(term19499, term19499.getClass(), "accessType", "fFWllaiFvh");
        setField(term19499, term19499.getClass(), "accountInfo", "PFTdEDSbvZ");
        setField(term19499, term19499.getClass(), "jobStatement", term19665);
        setField(term19499, term19499.getClass(), "deleteCompletedJobs", term19717);
        setField(term19499, term19499.getClass(), "jobsOutputDirectory", "owLqDDnwZA");
        setField(term19499, term19499.getClass(), "autoDeleteOnCompletion", term19731);
        setField(term19499, term19499.getClass(), "targetSystemuid", "eBcTbweeYp");
        setField(term19499, term19499.getClass(), "targetSystempwd", "drcmjfQUDq");
        term19757 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term19757;
        callMethod(klass, "assignToOwner", argTypes, term19499, args);
    }

};


