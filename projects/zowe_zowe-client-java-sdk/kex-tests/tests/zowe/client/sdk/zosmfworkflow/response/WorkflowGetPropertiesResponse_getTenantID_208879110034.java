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

public class WorkflowGetPropertiesResponse_getTenantID_208879110034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30976;

    public WorkflowGetPropertiesResponse_getTenantID_208879110034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31157 = new Integer(-73683645);
        Boolean term31159 = new Boolean(false);
        Boolean term31161 = new Boolean(true);
        Boolean term31187 = new Boolean(true);
        Long term31202 = new Long(2062173786000223358L);
        Long term31204 = new Long(-8658027316505137504L);
        Boolean term31266 = new Boolean(false);
        ArrayList term31424 = new ArrayList();
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        ((ArrayList) term31424).add((Object)null);
        Object term31430 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term31430, term31430.getClass(), "name", "");
        setField(term31430, term31430.getClass(), "scope", "");
        setField(term31430, term31430.getClass(), "type", "");
        setField(term31430, term31430.getClass(), "value", "");
        setField(term31430, term31430.getClass(), "visibility", "");
        Object term31436 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term31436, term31436.getClass(), "name", "");
        setField(term31436, term31436.getClass(), "scope", "");
        setField(term31436, term31436.getClass(), "type", "");
        setField(term31436, term31436.getClass(), "value", "");
        setField(term31436, term31436.getClass(), "visibility", "");
        Object term31442 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term31442, term31442.getClass(), "name", "");
        setField(term31442, term31442.getClass(), "scope", "");
        setField(term31442, term31442.getClass(), "type", "");
        setField(term31442, term31442.getClass(), "value", "");
        setField(term31442, term31442.getClass(), "visibility", "");
        Object term31448 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term31448, term31448.getClass(), "name", "");
        setField(term31448, term31448.getClass(), "scope", "");
        setField(term31448, term31448.getClass(), "type", "");
        setField(term31448, term31448.getClass(), "value", "");
        setField(term31448, term31448.getClass(), "visibility", "");
        Object term31454 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term31454, term31454.getClass(), "name", "");
        setField(term31454, term31454.getClass(), "scope", "");
        setField(term31454, term31454.getClass(), "type", "");
        setField(term31454, term31454.getClass(), "value", "");
        setField(term31454, term31454.getClass(), "visibility", "");
        ArrayList term31428 = new ArrayList();
        ((ArrayList) term31428).add(term31430);
        ((ArrayList) term31428).add(term31436);
        ((ArrayList) term31428).add(term31442);
        ((ArrayList) term31428).add(term31448);
        ((ArrayList) term31428).add(term31454);
        term30976 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term31189 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term30976, term30976.getClass(), "workflowName", "TGnzPlGFMb");
        setField(term30976, term30976.getClass(), "workflowKey", "yEvLMSpdHy");
        setField(term30976, term30976.getClass(), "workflowDescription", "qdErlZeTVv");
        setField(term30976, term30976.getClass(), "workflowID", "OCCDQbndDE");
        setField(term30976, term30976.getClass(), "workflowVersion", "NMANMKfctU");
        setField(term30976, term30976.getClass(), "workflowDefinitionFileMD5Value", "mQsaqUltLU");
        setField(term30976, term30976.getClass(), "vendor", "jwENwZiGlR");
        setField(term30976, term30976.getClass(), "owner", "rfFHGPcfpz");
        setField(term30976, term30976.getClass(), "workflowArchiveSAFID", "fViQeyMrrL");
        setField(term30976, term30976.getClass(), "system", "zzeaToyLmI");
        setField(term30976, term30976.getClass(), "jobsOutputDirectory", "sKYWhmRMLx");
        setField(term30976, term30976.getClass(), "category", "SOJpgWUZCf");
        setField(term30976, term30976.getClass(), "productID", "jgywFOzBDw");
        setField(term30976, term30976.getClass(), "productName", "yKIXLtCWYi");
        setField(term30976, term30976.getClass(), "productVersion", "EhuyRKrUJu");
        setField(term30976, term30976.getClass(), "percentComplete", term31157);
        setField(term30976, term30976.getClass(), "isCallable", term31159);
        setField(term30976, term30976.getClass(), "containsParallelSteps", term31161);
        setField(term30976, term30976.getClass(), "scope", "UlBxuoBXcJ");
        setField(term30976, term30976.getClass(), "statusName", "PqduvNFXXw");
        setField(term30976, term30976.getClass(), "deleteCompletedJobs", term31187);
        setField(term31189, term31189.getClass(), "startUser", "bMQrxvaBAI");
        setField(term31189, term31189.getClass(), "startedTime", term31202);
        setField(term31189, term31189.getClass(), "stoppedTime", term31204);
        setField(term31189, term31189.getClass(), "currentStepName", "StFtysZlWm");
        setField(term31189, term31189.getClass(), "currentStepNumber", "CoqUcmjnkF");
        setField(term31189, term31189.getClass(), "currentStepTitle", "oOrXvGaFwa");
        setField(term31189, term31189.getClass(), "messageID", "KJSTLGsSvO");
        setField(term31189, term31189.getClass(), "messageText", "kSkiIpaepq");
        setField(term30976, term30976.getClass(), "automationStatus", term31189);
        setField(term30976, term30976.getClass(), "autoDeleteOnCompletion", term31266);
        setField(term30976, term30976.getClass(), "access", "FzJhDecyvI");
        setField(term30976, term30976.getClass(), "accountInfo", "zOxseYMSdY");
        setField(term30976, term30976.getClass(), "jobStatement", "jEKlkqpHMQ");
        setField(term30976, term30976.getClass(), "templateID", "QpEVWispEh");
        setField(term30976, term30976.getClass(), "actionID", "STofGrqXqL");
        setField(term30976, term30976.getClass(), "registryID", "IoRhBfdSuN");
        setField(term30976, term30976.getClass(), "parentRegistryID", "JGdxVjQzts");
        setField(term30976, term30976.getClass(), "domainID", "jEdjRikQtN");
        setField(term30976, term30976.getClass(), "tenantID", "fSNUaokVWs");
        setField(term30976, term30976.getClass(), "softwareServiceInstanceName", "dTxnMmHoVm");
        setField(term30976, term30976.getClass(), "templateName", "iswxaQUQgT");
        setField(term30976, term30976.getClass(), "globalVariableGroup", "MxUSQqhNse");
        setField(term30976, term30976.getClass(), "isInstanceVariableWithoutPrefix", "skwxdosvQV");
        setField(term30976, term30976.getClass(), "steps", term31424);
        setField(term30976, term30976.getClass(), "variables", term31428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTenantID", argTypes, term30976, args);
    }

};


