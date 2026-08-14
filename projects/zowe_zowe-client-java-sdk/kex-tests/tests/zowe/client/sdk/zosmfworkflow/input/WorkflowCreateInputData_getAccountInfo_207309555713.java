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

public class WorkflowCreateInputData_getAccountInfo_207309555713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11236;

    public WorkflowCreateInputData_getAccountInfo_207309555713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11287 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11287, term11287.getClass(), "name", "");
        setField(term11287, term11287.getClass(), "value", "");
        Object term11290 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11290, term11290.getClass(), "name", "");
        setField(term11290, term11290.getClass(), "value", "");
        Object term11293 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11293, term11293.getClass(), "name", "");
        setField(term11293, term11293.getClass(), "value", "");
        Object term11296 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11296, term11296.getClass(), "name", "");
        setField(term11296, term11296.getClass(), "value", "");
        Object term11299 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariable"));
        setField(term11299, term11299.getClass(), "name", "");
        setField(term11299, term11299.getClass(), "value", "");
        ArrayList term11285 = new ArrayList();
        ((ArrayList) term11285).add(term11287);
        ((ArrayList) term11285).add(term11290);
        ((ArrayList) term11285).add(term11293);
        ((ArrayList) term11285).add(term11296);
        ((ArrayList) term11285).add(term11299);
        Boolean term11364 = new Boolean(false);
        ArrayList term11390 = new ArrayList();
        ((ArrayList) term11390).add("oKwCDqywym");
        ((ArrayList) term11390).add("zjZYTddemL");
        ((ArrayList) term11390).add("QtrylgCLiF");
        Boolean term11430 = new Boolean(false);
        Boolean term11444 = new Boolean(false);
        term11236 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData"));
        setField(term11236, term11236.getClass(), "workflowName", "IEYhJmgCVd");
        setField(term11236, term11236.getClass(), "workflowDefinitionFile", "KSJeYkkvpk");
        setField(term11236, term11236.getClass(), "workflowDefinitionFileSystem", "qUtkFGMNUV");
        setField(term11236, term11236.getClass(), "variableInputFile", "mGRiYhnMcR");
        setField(term11236, term11236.getClass(), "variables", term11285);
        setField(term11236, term11236.getClass(), "resolveGlobalConflictByUsing", "WXcZEtUKlI");
        setField(term11236, term11236.getClass(), "system", "IkpjUOuWQU");
        setField(term11236, term11236.getClass(), "owner", "boSSpezHeU");
        setField(term11236, term11236.getClass(), "workflowArchiveSAFID", "OUeBWNTQDh");
        setField(term11236, term11236.getClass(), "comments", "gltJarNuUk");
        setField(term11236, term11236.getClass(), "assignToOwner", term11364);
        setField(term11236, term11236.getClass(), "accessType", "ZwZIDwYcSW");
        setField(term11236, term11236.getClass(), "accountInfo", "sOdkipUKRu");
        setField(term11236, term11236.getClass(), "jobStatement", term11390);
        setField(term11236, term11236.getClass(), "deleteCompletedJobs", term11430);
        setField(term11236, term11236.getClass(), "jobsOutputDirectory", "orEuhCStGM");
        setField(term11236, term11236.getClass(), "autoDeleteOnCompletion", term11444);
        setField(term11236, term11236.getClass(), "targetSystemuid", "HhEaSXWvrY");
        setField(term11236, term11236.getClass(), "targetSystempwd", "CVRGEomOth");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.input.WorkflowCreateInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountInfo", argTypes, term11236, args);
    }

};


