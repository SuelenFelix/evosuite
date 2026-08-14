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

public class WorkflowGetPropertiesResponse_getProductName_54140617116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16078;

    public WorkflowGetPropertiesResponse_getProductName_54140617116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16259 = new Integer(1585847225);
        Boolean term16261 = new Boolean(false);
        Boolean term16263 = new Boolean(true);
        Boolean term16289 = new Boolean(false);
        Long term16304 = new Long(1967728129628047933L);
        Long term16306 = new Long(2120084523938730454L);
        Boolean term16368 = new Boolean(false);
        ArrayList term16526 = new ArrayList();
        ((ArrayList) term16526).add((Object)null);
        ArrayList term16530 = new ArrayList();
        term16078 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term16291 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term16078, term16078.getClass(), "workflowName", "mzCFLzFuSj");
        setField(term16078, term16078.getClass(), "workflowKey", "WQnMpDlSfA");
        setField(term16078, term16078.getClass(), "workflowDescription", "aOIvTQtXiv");
        setField(term16078, term16078.getClass(), "workflowID", "IyjDiknqhA");
        setField(term16078, term16078.getClass(), "workflowVersion", "IHsXSAFYKi");
        setField(term16078, term16078.getClass(), "workflowDefinitionFileMD5Value", "KyGbLglqbW");
        setField(term16078, term16078.getClass(), "vendor", "ZKVeStsSNT");
        setField(term16078, term16078.getClass(), "owner", "cqCXYaAnFB");
        setField(term16078, term16078.getClass(), "workflowArchiveSAFID", "UPLNFZHXjw");
        setField(term16078, term16078.getClass(), "system", "CwrrJlrGmg");
        setField(term16078, term16078.getClass(), "jobsOutputDirectory", "HejzvyejjG");
        setField(term16078, term16078.getClass(), "category", "pbqJjeooBM");
        setField(term16078, term16078.getClass(), "productID", "ccnotFfPXt");
        setField(term16078, term16078.getClass(), "productName", "plWlgdgIhn");
        setField(term16078, term16078.getClass(), "productVersion", "RZaKVKWtND");
        setField(term16078, term16078.getClass(), "percentComplete", term16259);
        setField(term16078, term16078.getClass(), "isCallable", term16261);
        setField(term16078, term16078.getClass(), "containsParallelSteps", term16263);
        setField(term16078, term16078.getClass(), "scope", "vXiaNiquft");
        setField(term16078, term16078.getClass(), "statusName", "lucCeiVnYe");
        setField(term16078, term16078.getClass(), "deleteCompletedJobs", term16289);
        setField(term16291, term16291.getClass(), "startUser", "iYwkCLMsbJ");
        setField(term16291, term16291.getClass(), "startedTime", term16304);
        setField(term16291, term16291.getClass(), "stoppedTime", term16306);
        setField(term16291, term16291.getClass(), "currentStepName", "MXLsVQWrwc");
        setField(term16291, term16291.getClass(), "currentStepNumber", "lRaSlqzqNY");
        setField(term16291, term16291.getClass(), "currentStepTitle", "TiEyxWXsra");
        setField(term16291, term16291.getClass(), "messageID", "TuLgwTZsPP");
        setField(term16291, term16291.getClass(), "messageText", "KoasxTJGpx");
        setField(term16078, term16078.getClass(), "automationStatus", term16291);
        setField(term16078, term16078.getClass(), "autoDeleteOnCompletion", term16368);
        setField(term16078, term16078.getClass(), "access", "ceGeARYMoa");
        setField(term16078, term16078.getClass(), "accountInfo", "fFWllaiFvh");
        setField(term16078, term16078.getClass(), "jobStatement", "PFTdEDSbvZ");
        setField(term16078, term16078.getClass(), "templateID", "TbiwoiebNe");
        setField(term16078, term16078.getClass(), "actionID", "laTITSWZuc");
        setField(term16078, term16078.getClass(), "registryID", "fkzRpxlAqS");
        setField(term16078, term16078.getClass(), "parentRegistryID", "VYvbTGKslj");
        setField(term16078, term16078.getClass(), "domainID", "owLqDDnwZA");
        setField(term16078, term16078.getClass(), "tenantID", "eBcTbweeYp");
        setField(term16078, term16078.getClass(), "softwareServiceInstanceName", "drcmjfQUDq");
        setField(term16078, term16078.getClass(), "templateName", "GjdWUoUSyA");
        setField(term16078, term16078.getClass(), "globalVariableGroup", "YEkxWsWaUl");
        setField(term16078, term16078.getClass(), "isInstanceVariableWithoutPrefix", "RINhPkhhct");
        setField(term16078, term16078.getClass(), "steps", term16526);
        setField(term16078, term16078.getClass(), "variables", term16530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductName", argTypes, term16078, args);
    }

};


