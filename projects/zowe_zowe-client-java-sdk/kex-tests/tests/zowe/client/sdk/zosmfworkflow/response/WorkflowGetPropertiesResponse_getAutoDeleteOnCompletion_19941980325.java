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

public class WorkflowGetPropertiesResponse_getAutoDeleteOnCompletion_19941980325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23548;

    public WorkflowGetPropertiesResponse_getAutoDeleteOnCompletion_19941980325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23729 = new Integer(-117576464);
        Boolean term23731 = new Boolean(true);
        Boolean term23733 = new Boolean(true);
        Boolean term23759 = new Boolean(false);
        Long term23774 = new Long(-2170847986967241072L);
        Long term23776 = new Long(4044358158040652353L);
        Boolean term23838 = new Boolean(false);
        ArrayList term23996 = new ArrayList();
        ((ArrayList) term23996).add((Object)null);
        ((ArrayList) term23996).add((Object)null);
        ((ArrayList) term23996).add((Object)null);
        ((ArrayList) term23996).add((Object)null);
        ((ArrayList) term23996).add((Object)null);
        Object term24002 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term24002, term24002.getClass(), "name", "");
        setField(term24002, term24002.getClass(), "scope", "");
        setField(term24002, term24002.getClass(), "type", "");
        setField(term24002, term24002.getClass(), "value", "");
        setField(term24002, term24002.getClass(), "visibility", "");
        ArrayList term24000 = new ArrayList();
        ((ArrayList) term24000).add(term24002);
        term23548 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term23761 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term23548, term23548.getClass(), "workflowName", "zUXaSvayQe");
        setField(term23548, term23548.getClass(), "workflowKey", "bPVcnnQPSC");
        setField(term23548, term23548.getClass(), "workflowDescription", "PQLyoEKWSa");
        setField(term23548, term23548.getClass(), "workflowID", "HOgkhttJZS");
        setField(term23548, term23548.getClass(), "workflowVersion", "goqNSmXSSS");
        setField(term23548, term23548.getClass(), "workflowDefinitionFileMD5Value", "AkViBLdqXM");
        setField(term23548, term23548.getClass(), "vendor", "UlxGFzEifL");
        setField(term23548, term23548.getClass(), "owner", "HilHTbDKDF");
        setField(term23548, term23548.getClass(), "workflowArchiveSAFID", "IaEqlVwmNS");
        setField(term23548, term23548.getClass(), "system", "ljNOgdPWrL");
        setField(term23548, term23548.getClass(), "jobsOutputDirectory", "oBlIZiyRMS");
        setField(term23548, term23548.getClass(), "category", "QUYAkhtCNh");
        setField(term23548, term23548.getClass(), "productID", "kOaAQOLyqd");
        setField(term23548, term23548.getClass(), "productName", "ICBWiKaeHC");
        setField(term23548, term23548.getClass(), "productVersion", "WAljagiCzu");
        setField(term23548, term23548.getClass(), "percentComplete", term23729);
        setField(term23548, term23548.getClass(), "isCallable", term23731);
        setField(term23548, term23548.getClass(), "containsParallelSteps", term23733);
        setField(term23548, term23548.getClass(), "scope", "XKMXfDZajw");
        setField(term23548, term23548.getClass(), "statusName", "avZoBQSrBy");
        setField(term23548, term23548.getClass(), "deleteCompletedJobs", term23759);
        setField(term23761, term23761.getClass(), "startUser", "KIXGeHXdwi");
        setField(term23761, term23761.getClass(), "startedTime", term23774);
        setField(term23761, term23761.getClass(), "stoppedTime", term23776);
        setField(term23761, term23761.getClass(), "currentStepName", "tTfdvLMwEE");
        setField(term23761, term23761.getClass(), "currentStepNumber", "DiSkERzqOE");
        setField(term23761, term23761.getClass(), "currentStepTitle", "hPSZZeYqHQ");
        setField(term23761, term23761.getClass(), "messageID", "scReMUKyGq");
        setField(term23761, term23761.getClass(), "messageText", "FmIpnxjRxA");
        setField(term23548, term23548.getClass(), "automationStatus", term23761);
        setField(term23548, term23548.getClass(), "autoDeleteOnCompletion", term23838);
        setField(term23548, term23548.getClass(), "access", "FTjxxGvyun");
        setField(term23548, term23548.getClass(), "accountInfo", "qsjXSwKloH");
        setField(term23548, term23548.getClass(), "jobStatement", "DDZHUPglvb");
        setField(term23548, term23548.getClass(), "templateID", "rWoaXvNyVg");
        setField(term23548, term23548.getClass(), "actionID", "FLzaBCFjGv");
        setField(term23548, term23548.getClass(), "registryID", "OLYhTSqTqJ");
        setField(term23548, term23548.getClass(), "parentRegistryID", "AIHoadcpQz");
        setField(term23548, term23548.getClass(), "domainID", "fWMsLtuOEV");
        setField(term23548, term23548.getClass(), "tenantID", "fvgZQBalnd");
        setField(term23548, term23548.getClass(), "softwareServiceInstanceName", "tViQSKUCLE");
        setField(term23548, term23548.getClass(), "templateName", "QbaeHheqiP");
        setField(term23548, term23548.getClass(), "globalVariableGroup", "gASHxChKwn");
        setField(term23548, term23548.getClass(), "isInstanceVariableWithoutPrefix", "iasolXlEEn");
        setField(term23548, term23548.getClass(), "steps", term23996);
        setField(term23548, term23548.getClass(), "variables", term24000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutoDeleteOnCompletion", argTypes, term23548, args);
    }

};


