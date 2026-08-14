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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class WorkflowGetPropertiesResponse_getWorkflowName_607161273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5236;

    public WorkflowGetPropertiesResponse_getWorkflowName_607161273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5417 = new Integer(1162663216);
        Boolean term5419 = new Boolean(true);
        Boolean term5421 = new Boolean(true);
        Boolean term5447 = new Boolean(true);
        Long term5462 = new Long(-8257434502486459194L);
        Long term5464 = new Long(-8400487765614892086L);
        Boolean term5526 = new Boolean(true);
        ArrayList term5684 = new ArrayList();
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ((ArrayList) term5684).add((Object)null);
        ArrayList term5688 = new ArrayList();
        term5236 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term5449 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term5236, term5236.getClass(), "workflowName", "uSUvKAyuvd");
        setField(term5236, term5236.getClass(), "workflowKey", "onQLVONGuf");
        setField(term5236, term5236.getClass(), "workflowDescription", "SOrEHbcbmn");
        setField(term5236, term5236.getClass(), "workflowID", "bnsyeQXFdu");
        setField(term5236, term5236.getClass(), "workflowVersion", "BwtdjiefJn");
        setField(term5236, term5236.getClass(), "workflowDefinitionFileMD5Value", "jDmhBrIoDa");
        setField(term5236, term5236.getClass(), "vendor", "SPtPatHeOm");
        setField(term5236, term5236.getClass(), "owner", "ywmcuThdfL");
        setField(term5236, term5236.getClass(), "workflowArchiveSAFID", "GBOEuByOfr");
        setField(term5236, term5236.getClass(), "system", "NHbOFFjyVK");
        setField(term5236, term5236.getClass(), "jobsOutputDirectory", "zaloBqlrSo");
        setField(term5236, term5236.getClass(), "category", "vvoLrMGCoN");
        setField(term5236, term5236.getClass(), "productID", "pXdglvyrQe");
        setField(term5236, term5236.getClass(), "productName", "OcfNzHYdki");
        setField(term5236, term5236.getClass(), "productVersion", "uPuCVuZYOI");
        setField(term5236, term5236.getClass(), "percentComplete", term5417);
        setField(term5236, term5236.getClass(), "isCallable", term5419);
        setField(term5236, term5236.getClass(), "containsParallelSteps", term5421);
        setField(term5236, term5236.getClass(), "scope", "TweMFhxNdj");
        setField(term5236, term5236.getClass(), "statusName", "NBrvVzvQHe");
        setField(term5236, term5236.getClass(), "deleteCompletedJobs", term5447);
        setField(term5449, term5449.getClass(), "startUser", "FjOiNAfBOc");
        setField(term5449, term5449.getClass(), "startedTime", term5462);
        setField(term5449, term5449.getClass(), "stoppedTime", term5464);
        setField(term5449, term5449.getClass(), "currentStepName", "iCCsaLHohG");
        setField(term5449, term5449.getClass(), "currentStepNumber", "NJhGgctbdj");
        setField(term5449, term5449.getClass(), "currentStepTitle", "MYWYUeLGOp");
        setField(term5449, term5449.getClass(), "messageID", "tsTGdgQYUL");
        setField(term5449, term5449.getClass(), "messageText", "TtGbVmKcnX");
        setField(term5236, term5236.getClass(), "automationStatus", term5449);
        setField(term5236, term5236.getClass(), "autoDeleteOnCompletion", term5526);
        setField(term5236, term5236.getClass(), "access", "GJVkUrCVdD");
        setField(term5236, term5236.getClass(), "accountInfo", "zNdorvdUgu");
        setField(term5236, term5236.getClass(), "jobStatement", "oPxuZbkYio");
        setField(term5236, term5236.getClass(), "templateID", "vKitydDVnM");
        setField(term5236, term5236.getClass(), "actionID", "urCiQnUFBM");
        setField(term5236, term5236.getClass(), "registryID", "EKjQdtKxAM");
        setField(term5236, term5236.getClass(), "parentRegistryID", "TXZAIPQJHt");
        setField(term5236, term5236.getClass(), "domainID", "DIbeDHICho");
        setField(term5236, term5236.getClass(), "tenantID", "dJGPlmSRnz");
        setField(term5236, term5236.getClass(), "softwareServiceInstanceName", "DPskuFUobI");
        setField(term5236, term5236.getClass(), "templateName", "wBGfLpNNiZ");
        setField(term5236, term5236.getClass(), "globalVariableGroup", "yUGCjlqgJE");
        setField(term5236, term5236.getClass(), "isInstanceVariableWithoutPrefix", "PXdVZyoJyC");
        setField(term5236, term5236.getClass(), "steps", term5684);
        setField(term5236, term5236.getClass(), "variables", term5688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowName", argTypes, term5236, args);
    }

};


