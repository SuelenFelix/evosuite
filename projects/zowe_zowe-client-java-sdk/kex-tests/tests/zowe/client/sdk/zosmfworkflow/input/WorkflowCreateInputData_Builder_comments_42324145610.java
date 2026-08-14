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

public class WorkflowCreateInputData_Builder_comments_42324145610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19130;

    public WorkflowCreateInputData_Builder_comments_42324145610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19181 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19181, term19181.getClass(), "name", "");
        setField(term19181, term19181.getClass(), "value", "");
        Object term19184 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19184, term19184.getClass(), "name", "");
        setField(term19184, term19184.getClass(), "value", "");
        Object term19187 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19187, term19187.getClass(), "name", "");
        setField(term19187, term19187.getClass(), "value", "");
        Object term19190 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19190, term19190.getClass(), "name", "");
        setField(term19190, term19190.getClass(), "value", "");
        Object term19193 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19193, term19193.getClass(), "name", "");
        setField(term19193, term19193.getClass(), "value", "");
        Object term19196 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19196, term19196.getClass(), "name", "");
        setField(term19196, term19196.getClass(), "value", "");
        Object term19199 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19199, term19199.getClass(), "name", "");
        setField(term19199, term19199.getClass(), "value", "");
        Object term19202 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term19202, term19202.getClass(), "name", "");
        setField(term19202, term19202.getClass(), "value", "");
        ArrayList term19179 = new ArrayList();
        ((ArrayList) term19179).add(term19181);
        ((ArrayList) term19179).add(term19184);
        ((ArrayList) term19179).add(term19187);
        ((ArrayList) term19179).add(term19190);
        ((ArrayList) term19179).add(term19193);
        ((ArrayList) term19179).add(term19196);
        ((ArrayList) term19179).add(term19199);
        ((ArrayList) term19179).add(term19202);
        Boolean term19267 = new Boolean(true);
        ArrayList term19293 = new ArrayList();
        Boolean term19297 = new Boolean(false);
        Boolean term19311 = new Boolean(false);
        term19130 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder"));
        setField(term19130, term19130.getClass(), "workflowName", "Yrvtdcltri");
        setField(term19130, term19130.getClass(), "workflowDefinitionFile", "RxrsjXRVcT");
        setField(term19130, term19130.getClass(), "workflowDefinitionFileSystem", "cfRimmJxqA");
        setField(term19130, term19130.getClass(), "variableInputFile", "oOnRVGqFmy");
        setField(term19130, term19130.getClass(), "variables", term19179);
        setField(term19130, term19130.getClass(), "resolveGlobalConflictByUsing", "scpIQUfPKw");
        setField(term19130, term19130.getClass(), "system", "QKYBpCjuYt");
        setField(term19130, term19130.getClass(), "owner", "vjiRfoGdkl");
        setField(term19130, term19130.getClass(), "workflowArchiveSAFID", "TwaxeSHvnR");
        setField(term19130, term19130.getClass(), "comments", "paPzDETzIq");
        setField(term19130, term19130.getClass(), "assignToOwner", term19267);
        setField(term19130, term19130.getClass(), "accessType", "fufeuGfwpN");
        setField(term19130, term19130.getClass(), "accountInfo", "XJbkXbljvz");
        setField(term19130, term19130.getClass(), "jobStatement", term19293);
        setField(term19130, term19130.getClass(), "deleteCompletedJobs", term19297);
        setField(term19130, term19130.getClass(), "jobsOutputDirectory", "fuvdkDwBeH");
        setField(term19130, term19130.getClass(), "autoDeleteOnCompletion", term19311);
        setField(term19130, term19130.getClass(), "targetSystemuid", "NTefzwLPhx");
        setField(term19130, term19130.getClass(), "targetSystempwd", "dirFuhqyNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YVLRenzuoR";
        callMethod(klass, "comments", argTypes, term19130, args);
    }

};


