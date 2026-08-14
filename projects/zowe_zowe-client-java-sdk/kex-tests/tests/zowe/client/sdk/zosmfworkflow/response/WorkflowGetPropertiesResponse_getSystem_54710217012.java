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

public class WorkflowGetPropertiesResponse_getSystem_54710217012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12730;

    public WorkflowGetPropertiesResponse_getSystem_54710217012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12911 = new Integer(1725571209);
        Boolean term12913 = new Boolean(false);
        Boolean term12915 = new Boolean(false);
        Boolean term12941 = new Boolean(true);
        Long term12956 = new Long(8428634514691209827L);
        Long term12958 = new Long(-2585684163342970173L);
        Boolean term13020 = new Boolean(true);
        ArrayList term13178 = new ArrayList();
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        ((ArrayList) term13178).add((Object)null);
        Object term13184 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term13184, term13184.getClass(), "name", "");
        setField(term13184, term13184.getClass(), "scope", "");
        setField(term13184, term13184.getClass(), "type", "");
        setField(term13184, term13184.getClass(), "value", "");
        setField(term13184, term13184.getClass(), "visibility", "");
        Object term13190 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term13190, term13190.getClass(), "name", "");
        setField(term13190, term13190.getClass(), "scope", "");
        setField(term13190, term13190.getClass(), "type", "");
        setField(term13190, term13190.getClass(), "value", "");
        setField(term13190, term13190.getClass(), "visibility", "");
        Object term13196 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term13196, term13196.getClass(), "name", "");
        setField(term13196, term13196.getClass(), "scope", "");
        setField(term13196, term13196.getClass(), "type", "");
        setField(term13196, term13196.getClass(), "value", "");
        setField(term13196, term13196.getClass(), "visibility", "");
        Object term13202 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableInfo"));
        setField(term13202, term13202.getClass(), "name", "");
        setField(term13202, term13202.getClass(), "scope", "");
        setField(term13202, term13202.getClass(), "type", "");
        setField(term13202, term13202.getClass(), "value", "");
        setField(term13202, term13202.getClass(), "visibility", "");
        ArrayList term13182 = new ArrayList();
        ((ArrayList) term13182).add(term13184);
        ((ArrayList) term13182).add(term13190);
        ((ArrayList) term13182).add(term13196);
        ((ArrayList) term13182).add(term13202);
        term12730 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse"));
        Object term12943 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term12730, term12730.getClass(), "workflowName", "ZEXFoMSKeG");
        setField(term12730, term12730.getClass(), "workflowKey", "HvxahUfZcJ");
        setField(term12730, term12730.getClass(), "workflowDescription", "WkLpmqoQxy");
        setField(term12730, term12730.getClass(), "workflowID", "XiNoscmYhd");
        setField(term12730, term12730.getClass(), "workflowVersion", "asMqnMNrZp");
        setField(term12730, term12730.getClass(), "workflowDefinitionFileMD5Value", "pqFUMTCKJd");
        setField(term12730, term12730.getClass(), "vendor", "PTEndmPMzk");
        setField(term12730, term12730.getClass(), "owner", "aJQuCOCvZs");
        setField(term12730, term12730.getClass(), "workflowArchiveSAFID", "lHYNCJRiOv");
        setField(term12730, term12730.getClass(), "system", "QVLresHoaP");
        setField(term12730, term12730.getClass(), "jobsOutputDirectory", "IbxeAMwLVt");
        setField(term12730, term12730.getClass(), "category", "bShlAqoTmZ");
        setField(term12730, term12730.getClass(), "productID", "nOKlKlNhtU");
        setField(term12730, term12730.getClass(), "productName", "gXFNBHJSey");
        setField(term12730, term12730.getClass(), "productVersion", "wUcSfItZgv");
        setField(term12730, term12730.getClass(), "percentComplete", term12911);
        setField(term12730, term12730.getClass(), "isCallable", term12913);
        setField(term12730, term12730.getClass(), "containsParallelSteps", term12915);
        setField(term12730, term12730.getClass(), "scope", "rOfPCPHmtJ");
        setField(term12730, term12730.getClass(), "statusName", "EnmiAvfpJv");
        setField(term12730, term12730.getClass(), "deleteCompletedJobs", term12941);
        setField(term12943, term12943.getClass(), "startUser", "AdYzLPMcwe");
        setField(term12943, term12943.getClass(), "startedTime", term12956);
        setField(term12943, term12943.getClass(), "stoppedTime", term12958);
        setField(term12943, term12943.getClass(), "currentStepName", "FrTZLybkKk");
        setField(term12943, term12943.getClass(), "currentStepNumber", "FlxVmiMYKP");
        setField(term12943, term12943.getClass(), "currentStepTitle", "fgOpAWlGYN");
        setField(term12943, term12943.getClass(), "messageID", "PNzNzzjSXM");
        setField(term12943, term12943.getClass(), "messageText", "ktKcSZiuGM");
        setField(term12730, term12730.getClass(), "automationStatus", term12943);
        setField(term12730, term12730.getClass(), "autoDeleteOnCompletion", term13020);
        setField(term12730, term12730.getClass(), "access", "PSOttyUeqv");
        setField(term12730, term12730.getClass(), "accountInfo", "HmEvTlmzXo");
        setField(term12730, term12730.getClass(), "jobStatement", "BMMonTIZgJ");
        setField(term12730, term12730.getClass(), "templateID", "QXyFXBjFde");
        setField(term12730, term12730.getClass(), "actionID", "xVFgeyYxZS");
        setField(term12730, term12730.getClass(), "registryID", "iQiGTulJiH");
        setField(term12730, term12730.getClass(), "parentRegistryID", "utCuuVCKqE");
        setField(term12730, term12730.getClass(), "domainID", "zSfoqzJbPT");
        setField(term12730, term12730.getClass(), "tenantID", "QUymMnsCIj");
        setField(term12730, term12730.getClass(), "softwareServiceInstanceName", "ikTtOgdVYS");
        setField(term12730, term12730.getClass(), "templateName", "JptuwlirlS");
        setField(term12730, term12730.getClass(), "globalVariableGroup", "TKOMaGswbU");
        setField(term12730, term12730.getClass(), "isInstanceVariableWithoutPrefix", "YcTbglHiUq");
        setField(term12730, term12730.getClass(), "steps", term13178);
        setField(term12730, term12730.getClass(), "variables", term13182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetPropertiesResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystem", argTypes, term12730, args);
    }

};


