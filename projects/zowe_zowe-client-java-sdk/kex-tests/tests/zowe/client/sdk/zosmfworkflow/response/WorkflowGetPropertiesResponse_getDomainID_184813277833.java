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

public class WorkflowGetPropertiesResponse_getDomainID_184813277833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30142;

    public WorkflowGetPropertiesResponse_getDomainID_184813277833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30323 = new Integer(-1179120542);
        Boolean term30325 = new Boolean(false);
        Boolean term30327 = new Boolean(false);
        Boolean term30353 = new Boolean(true);
        Long term30368 = new Long(2443640364875054177L);
        Long term30370 = new Long(-1610676979013636850L);
        Boolean term30432 = new Boolean(false);
        ArrayList term30590 = new ArrayList();
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        ((ArrayList) term30590).add((Object)null);
        Object term30596 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term30596, term30596.getClass(), "name", "");
        setField(term30596, term30596.getClass(), "scope", "");
        setField(term30596, term30596.getClass(), "type", "");
        setField(term30596, term30596.getClass(), "value", "");
        setField(term30596, term30596.getClass(), "visibility", "");
        Object term30602 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term30602, term30602.getClass(), "name", "");
        setField(term30602, term30602.getClass(), "scope", "");
        setField(term30602, term30602.getClass(), "type", "");
        setField(term30602, term30602.getClass(), "value", "");
        setField(term30602, term30602.getClass(), "visibility", "");
        Object term30608 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term30608, term30608.getClass(), "name", "");
        setField(term30608, term30608.getClass(), "scope", "");
        setField(term30608, term30608.getClass(), "type", "");
        setField(term30608, term30608.getClass(), "value", "");
        setField(term30608, term30608.getClass(), "visibility", "");
        ArrayList term30594 = new ArrayList();
        ((ArrayList) term30594).add(term30596);
        ((ArrayList) term30594).add(term30602);
        ((ArrayList) term30594).add(term30608);
        term30142 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term30355 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term30142, term30142.getClass(), "workflowName", "KoPzTuvIeK");
        setField(term30142, term30142.getClass(), "workflowKey", "SMoWUILIhn");
        setField(term30142, term30142.getClass(), "workflowDescription", "SvSKSCjgTM");
        setField(term30142, term30142.getClass(), "workflowID", "UFxnRbWtog");
        setField(term30142, term30142.getClass(), "workflowVersion", "NSxzAUSujy");
        setField(term30142, term30142.getClass(), "workflowDefinitionFileMD5Value", "FEezgglqXC");
        setField(term30142, term30142.getClass(), "vendor", "rvYqMRgiPA");
        setField(term30142, term30142.getClass(), "owner", "qOZXeUUmdz");
        setField(term30142, term30142.getClass(), "workflowArchiveSAFID", "FCovVZHqPx");
        setField(term30142, term30142.getClass(), "system", "jSTBfkWjge");
        setField(term30142, term30142.getClass(), "jobsOutputDirectory", "uKYhZULSHp");
        setField(term30142, term30142.getClass(), "category", "xdYuLllgpn");
        setField(term30142, term30142.getClass(), "productID", "ayonlqalLA");
        setField(term30142, term30142.getClass(), "productName", "fzzIOVxKdF");
        setField(term30142, term30142.getClass(), "productVersion", "cdvmxZaBEK");
        setField(term30142, term30142.getClass(), "percentComplete", term30323);
        setField(term30142, term30142.getClass(), "isCallable", term30325);
        setField(term30142, term30142.getClass(), "containsParallelSteps", term30327);
        setField(term30142, term30142.getClass(), "scope", "QHYZiyDyPC");
        setField(term30142, term30142.getClass(), "statusName", "kcHMyiheuH");
        setField(term30142, term30142.getClass(), "deleteCompletedJobs", term30353);
        setField(term30355, term30355.getClass(), "startUser", "DGMBBNDEYs");
        setField(term30355, term30355.getClass(), "startedTime", term30368);
        setField(term30355, term30355.getClass(), "stoppedTime", term30370);
        setField(term30355, term30355.getClass(), "currentStepName", "vpuKZSMmKQ");
        setField(term30355, term30355.getClass(), "currentStepNumber", "IXQQwaXITf");
        setField(term30355, term30355.getClass(), "currentStepTitle", "fNzFTiRCjp");
        setField(term30355, term30355.getClass(), "messageID", "yaCGGogKro");
        setField(term30355, term30355.getClass(), "messageText", "qxrRUnjshF");
        setField(term30142, term30142.getClass(), "automationStatus", term30355);
        setField(term30142, term30142.getClass(), "autoDeleteOnCompletion", term30432);
        setField(term30142, term30142.getClass(), "access", "WmVcapKAeJ");
        setField(term30142, term30142.getClass(), "accountInfo", "jevOVdQdpc");
        setField(term30142, term30142.getClass(), "jobStatement", "TLLVSGTNsz");
        setField(term30142, term30142.getClass(), "templateID", "mbBWfaHCrP");
        setField(term30142, term30142.getClass(), "actionID", "wFyiZloCxg");
        setField(term30142, term30142.getClass(), "registryID", "xYztJEIPWy");
        setField(term30142, term30142.getClass(), "parentRegistryID", "TDQIAXaJru");
        setField(term30142, term30142.getClass(), "domainID", "frPMFqGmrE");
        setField(term30142, term30142.getClass(), "tenantID", "DvfOYWcNBN");
        setField(term30142, term30142.getClass(), "softwareServiceInstanceName", "cvbvwpPlNk");
        setField(term30142, term30142.getClass(), "templateName", "uCdLbhvYeG");
        setField(term30142, term30142.getClass(), "globalVariableGroup", "ipoyEHBfoG");
        setField(term30142, term30142.getClass(), "isInstanceVariableWithoutPrefix", "iSBTpbiteU");
        setField(term30142, term30142.getClass(), "steps", term30590);
        setField(term30142, term30142.getClass(), "variables", term30594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomainID", argTypes, term30142, args);
    }

};


