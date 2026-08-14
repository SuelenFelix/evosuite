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

public class WorkflowCreateInputData_getDeleteCompletedJobs_34393069315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12028;

    public WorkflowCreateInputData_getDeleteCompletedJobs_34393069315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12079 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12079, term12079.getClass(), "name", "");
        setField(term12079, term12079.getClass(), "value", "");
        Object term12082 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12082, term12082.getClass(), "name", "");
        setField(term12082, term12082.getClass(), "value", "");
        Object term12085 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12085, term12085.getClass(), "name", "");
        setField(term12085, term12085.getClass(), "value", "");
        Object term12088 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12088, term12088.getClass(), "name", "");
        setField(term12088, term12088.getClass(), "value", "");
        Object term12091 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12091, term12091.getClass(), "name", "");
        setField(term12091, term12091.getClass(), "value", "");
        Object term12094 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term12094, term12094.getClass(), "name", "");
        setField(term12094, term12094.getClass(), "value", "");
        ArrayList term12077 = new ArrayList();
        ((ArrayList) term12077).add(term12079);
        ((ArrayList) term12077).add(term12082);
        ((ArrayList) term12077).add(term12085);
        ((ArrayList) term12077).add(term12088);
        ((ArrayList) term12077).add(term12091);
        ((ArrayList) term12077).add(term12094);
        Boolean term12159 = new Boolean(true);
        ArrayList term12185 = new ArrayList();
        ((ArrayList) term12185).add("McpzErOcYb");
        ((ArrayList) term12185).add("jqrVEUvYEz");
        ((ArrayList) term12185).add("QITgiBrmfj");
        ((ArrayList) term12185).add("pXxkiXgQnq");
        ((ArrayList) term12185).add("tKmrUDURku");
        ((ArrayList) term12185).add("JeZbrwZmsP");
        Boolean term12261 = new Boolean(true);
        Boolean term12275 = new Boolean(true);
        term12028 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term12028, term12028.getClass(), "workflowName", "JisaWUxcNb");
        setField(term12028, term12028.getClass(), "workflowDefinitionFile", "NxgmYPzWCI");
        setField(term12028, term12028.getClass(), "workflowDefinitionFileSystem", "SqjyKmayBx");
        setField(term12028, term12028.getClass(), "variableInputFile", "XjDhvToxJy");
        setField(term12028, term12028.getClass(), "variables", term12077);
        setField(term12028, term12028.getClass(), "resolveGlobalConflictByUsing", "UuYWMTqWTV");
        setField(term12028, term12028.getClass(), "system", "DSFGlcaXUb");
        setField(term12028, term12028.getClass(), "owner", "sHMXNUzNeM");
        setField(term12028, term12028.getClass(), "workflowArchiveSAFID", "gPzGDOEPPw");
        setField(term12028, term12028.getClass(), "comments", "rwKoAngzCu");
        setField(term12028, term12028.getClass(), "assignToOwner", term12159);
        setField(term12028, term12028.getClass(), "accessType", "VUkRVwROTl");
        setField(term12028, term12028.getClass(), "accountInfo", "UDlkdccCRn");
        setField(term12028, term12028.getClass(), "jobStatement", term12185);
        setField(term12028, term12028.getClass(), "deleteCompletedJobs", term12261);
        setField(term12028, term12028.getClass(), "jobsOutputDirectory", "bxyfeicqrK");
        setField(term12028, term12028.getClass(), "autoDeleteOnCompletion", term12275);
        setField(term12028, term12028.getClass(), "targetSystemuid", "vBnWPlsZMk");
        setField(term12028, term12028.getClass(), "targetSystempwd", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleteCompletedJobs", argTypes, term12028, args);
    }

};


