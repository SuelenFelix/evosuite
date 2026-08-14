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

public class WorkflowGetPropertiesResponse_getWorkflowDefinitionFileMD5Value_18919892248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9412;

    public WorkflowGetPropertiesResponse_getWorkflowDefinitionFileMD5Value_18919892248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9593 = new Integer(-1955890973);
        Boolean term9595 = new Boolean(true);
        Boolean term9597 = new Boolean(false);
        Boolean term9623 = new Boolean(false);
        Long term9638 = new Long(-4325723315152823407L);
        Long term9640 = new Long(2535595959091595249L);
        Boolean term9702 = new Boolean(false);
        ArrayList term9860 = new ArrayList();
        ((ArrayList) term9860).add((Object)null);
        Object term9866 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9866, term9866.getClass(), "name", "");
        setField(term9866, term9866.getClass(), "scope", "");
        setField(term9866, term9866.getClass(), "type", "");
        setField(term9866, term9866.getClass(), "value", "");
        setField(term9866, term9866.getClass(), "visibility", "");
        Object term9872 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term9872, term9872.getClass(), "name", "");
        setField(term9872, term9872.getClass(), "scope", "");
        setField(term9872, term9872.getClass(), "type", "");
        setField(term9872, term9872.getClass(), "value", "");
        setField(term9872, term9872.getClass(), "visibility", "");
        ArrayList term9864 = new ArrayList();
        ((ArrayList) term9864).add(term9866);
        ((ArrayList) term9864).add(term9872);
        term9412 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term9625 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term9412, term9412.getClass(), "workflowName", "CAMnvfDLJL");
        setField(term9412, term9412.getClass(), "workflowKey", "mfHtgSbdjD");
        setField(term9412, term9412.getClass(), "workflowDescription", "cmuaUiHMVL");
        setField(term9412, term9412.getClass(), "workflowID", "xjoSGPWUgu");
        setField(term9412, term9412.getClass(), "workflowVersion", "uzmqjnOUXu");
        setField(term9412, term9412.getClass(), "workflowDefinitionFileMD5Value", "xeyjTOCOJb");
        setField(term9412, term9412.getClass(), "vendor", "DGRqjjdhzy");
        setField(term9412, term9412.getClass(), "owner", "lQFkjJUPAR");
        setField(term9412, term9412.getClass(), "workflowArchiveSAFID", "BsuVlGUUjV");
        setField(term9412, term9412.getClass(), "system", "bHHjfDCntT");
        setField(term9412, term9412.getClass(), "jobsOutputDirectory", "sEphiduvkv");
        setField(term9412, term9412.getClass(), "category", "PbLgCSAHce");
        setField(term9412, term9412.getClass(), "productID", "NWldOLAbqk");
        setField(term9412, term9412.getClass(), "productName", "qnYaYSpDwO");
        setField(term9412, term9412.getClass(), "productVersion", "dgbFDCdHtj");
        setField(term9412, term9412.getClass(), "percentComplete", term9593);
        setField(term9412, term9412.getClass(), "isCallable", term9595);
        setField(term9412, term9412.getClass(), "containsParallelSteps", term9597);
        setField(term9412, term9412.getClass(), "scope", "EKpdCBubDE");
        setField(term9412, term9412.getClass(), "statusName", "zMsSLTfGhl");
        setField(term9412, term9412.getClass(), "deleteCompletedJobs", term9623);
        setField(term9625, term9625.getClass(), "startUser", "bEmHScVZaQ");
        setField(term9625, term9625.getClass(), "startedTime", term9638);
        setField(term9625, term9625.getClass(), "stoppedTime", term9640);
        setField(term9625, term9625.getClass(), "currentStepName", "TcuXODkzBV");
        setField(term9625, term9625.getClass(), "currentStepNumber", "coJPjrBZNe");
        setField(term9625, term9625.getClass(), "currentStepTitle", "vMsWjuPTnO");
        setField(term9625, term9625.getClass(), "messageID", "zHvfKaOstO");
        setField(term9625, term9625.getClass(), "messageText", "tOszriqETr");
        setField(term9412, term9412.getClass(), "automationStatus", term9625);
        setField(term9412, term9412.getClass(), "autoDeleteOnCompletion", term9702);
        setField(term9412, term9412.getClass(), "access", "ncSPTkhKjO");
        setField(term9412, term9412.getClass(), "accountInfo", "jcWKHRWhyj");
        setField(term9412, term9412.getClass(), "jobStatement", "nrQjODRMLD");
        setField(term9412, term9412.getClass(), "templateID", "PNoWXrsFic");
        setField(term9412, term9412.getClass(), "actionID", "QZBHZqZope");
        setField(term9412, term9412.getClass(), "registryID", "VBUahCvyxC");
        setField(term9412, term9412.getClass(), "parentRegistryID", "MlzTkzKMCX");
        setField(term9412, term9412.getClass(), "domainID", "UqKUbMyPMJ");
        setField(term9412, term9412.getClass(), "tenantID", "QpYltHAdyY");
        setField(term9412, term9412.getClass(), "softwareServiceInstanceName", "lbmSGBwIiV");
        setField(term9412, term9412.getClass(), "templateName", "DAxyHoTLzZ");
        setField(term9412, term9412.getClass(), "globalVariableGroup", "fhZgTouhCC");
        setField(term9412, term9412.getClass(), "isInstanceVariableWithoutPrefix", "wrikqJwXvL");
        setField(term9412, term9412.getClass(), "steps", term9860);
        setField(term9412, term9412.getClass(), "variables", term9864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDefinitionFileMD5Value", argTypes, term9412, args);
    }

};


