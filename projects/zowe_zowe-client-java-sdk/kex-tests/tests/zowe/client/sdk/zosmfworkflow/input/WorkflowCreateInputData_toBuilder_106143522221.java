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

public class WorkflowCreateInputData_toBuilder_106143522221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14263;

    public WorkflowCreateInputData_toBuilder_106143522221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14314 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14314, term14314.getClass(), "name", "");
        setField(term14314, term14314.getClass(), "value", "");
        Object term14317 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14317, term14317.getClass(), "name", "");
        setField(term14317, term14317.getClass(), "value", "");
        Object term14320 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14320, term14320.getClass(), "name", "");
        setField(term14320, term14320.getClass(), "value", "");
        Object term14323 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term14323, term14323.getClass(), "name", "");
        setField(term14323, term14323.getClass(), "value", "");
        ArrayList term14312 = new ArrayList();
        ((ArrayList) term14312).add(term14314);
        ((ArrayList) term14312).add(term14317);
        ((ArrayList) term14312).add(term14320);
        ((ArrayList) term14312).add(term14323);
        Boolean term14388 = new Boolean(false);
        ArrayList term14414 = new ArrayList();
        ((ArrayList) term14414).add("mRBtFTxVdE");
        ((ArrayList) term14414).add("IVacFDAZcj");
        ((ArrayList) term14414).add("EEYmuwyVDP");
        ((ArrayList) term14414).add("EWFbEDAVrE");
        ((ArrayList) term14414).add("EMiMtYgfvr");
        ((ArrayList) term14414).add("OyYyYYnJuF");
        ((ArrayList) term14414).add("aYLvcxZohT");
        ((ArrayList) term14414).add("mnHyQbMyld");
        Boolean term14514 = new Boolean(false);
        Boolean term14528 = new Boolean(true);
        term14263 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term14263, term14263.getClass(), "workflowName", "WaEcyVlcIx");
        setField(term14263, term14263.getClass(), "workflowDefinitionFile", "ONcbPCQnHd");
        setField(term14263, term14263.getClass(), "workflowDefinitionFileSystem", "AobDaplFLl");
        setField(term14263, term14263.getClass(), "variableInputFile", "pDkMNnAGgv");
        setField(term14263, term14263.getClass(), "variables", term14312);
        setField(term14263, term14263.getClass(), "resolveGlobalConflictByUsing", "fbnKvthhOz");
        setField(term14263, term14263.getClass(), "system", "PGfCDJTBek");
        setField(term14263, term14263.getClass(), "owner", "ZwjARhAtHC");
        setField(term14263, term14263.getClass(), "workflowArchiveSAFID", "XXvscsYBWv");
        setField(term14263, term14263.getClass(), "comments", "uePedtiAfL");
        setField(term14263, term14263.getClass(), "assignToOwner", term14388);
        setField(term14263, term14263.getClass(), "accessType", "AdSHvysxQB");
        setField(term14263, term14263.getClass(), "accountInfo", "jlraKkBWFA");
        setField(term14263, term14263.getClass(), "jobStatement", term14414);
        setField(term14263, term14263.getClass(), "deleteCompletedJobs", term14514);
        setField(term14263, term14263.getClass(), "jobsOutputDirectory", "KHtaDOIcJZ");
        setField(term14263, term14263.getClass(), "autoDeleteOnCompletion", term14528);
        setField(term14263, term14263.getClass(), "targetSystemuid", "vgdwrCZczl");
        setField(term14263, term14263.getClass(), "targetSystempwd", "gKMNrpKBpu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term14263, args);
    }

};


