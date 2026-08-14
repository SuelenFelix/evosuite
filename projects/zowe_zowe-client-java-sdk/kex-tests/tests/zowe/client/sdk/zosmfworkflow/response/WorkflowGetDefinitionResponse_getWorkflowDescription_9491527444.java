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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class WorkflowGetDefinitionResponse_getWorkflowDescription_9491527444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40398;

    public WorkflowGetDefinitionResponse_getWorkflowDescription_9491527444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term40483 = new Boolean(true);
        Boolean term40569 = new Boolean(false);
        ArrayList term40577 = new ArrayList();
        ((ArrayList) term40577).add((Object)null);
        ((ArrayList) term40577).add((Object)null);
        ((ArrayList) term40577).add((Object)null);
        ((ArrayList) term40577).add((Object)null);
        ((ArrayList) term40577).add((Object)null);
        Boolean term40580 = new Boolean(false);
        ArrayList term40582 = new ArrayList();
        ((ArrayList) term40582).add((Object)null);
        ArrayList term40585 = new ArrayList();
        ((ArrayList) term40585).add((Object)null);
        ((ArrayList) term40585).add((Object)null);
        ((ArrayList) term40585).add((Object)null);
        ((ArrayList) term40585).add((Object)null);
        ((ArrayList) term40585).add((Object)null);
        ((ArrayList) term40585).add((Object)null);
        Object term40573 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term40573, term40573.getClass(), "name", "");
        setField(term40573, term40573.getClass(), "title", "");
        setField(term40573, term40573.getClass(), "description", "");
        setField(term40573, term40573.getClass(), "prereqStep", term40577);
        setField(term40573, term40573.getClass(), "optional", term40580);
        setField(term40573, term40573.getClass(), "steps", term40582);
        setField(term40573, term40573.getClass(), "variableSpecifications", term40585);
        ArrayList term40592 = new ArrayList();
        ((ArrayList) term40592).add((Object)null);
        ((ArrayList) term40592).add((Object)null);
        Boolean term40595 = new Boolean(false);
        ArrayList term40597 = new ArrayList();
        ((ArrayList) term40597).add((Object)null);
        ((ArrayList) term40597).add((Object)null);
        ArrayList term40600 = new ArrayList();
        ((ArrayList) term40600).add((Object)null);
        ((ArrayList) term40600).add((Object)null);
        ((ArrayList) term40600).add((Object)null);
        Object term40588 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term40588, term40588.getClass(), "name", "");
        setField(term40588, term40588.getClass(), "title", "");
        setField(term40588, term40588.getClass(), "description", "");
        setField(term40588, term40588.getClass(), "prereqStep", term40592);
        setField(term40588, term40588.getClass(), "optional", term40595);
        setField(term40588, term40588.getClass(), "steps", term40597);
        setField(term40588, term40588.getClass(), "variableSpecifications", term40600);
        ArrayList term40571 = new ArrayList();
        ((ArrayList) term40571).add(term40573);
        ((ArrayList) term40571).add(term40588);
        ArrayList term40612 = new ArrayList();
        ((ArrayList) term40612).add((Object)null);
        ((ArrayList) term40612).add((Object)null);
        Integer term40615 = new Integer(1090617576);
        Boolean term40619 = new Boolean(false);
        Integer term40621 = new Integer(-1547384488);
        Integer term40624 = new Integer(1442160736);
        Boolean term40627 = new Boolean(false);
        Boolean term40630 = new Boolean(true);
        Boolean term40634 = new Boolean(false);
        Object term40607 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term40607, term40607.getClass(), "name", "");
        setField(term40607, term40607.getClass(), "scope", "");
        setField(term40607, term40607.getClass(), "abstractInfo", "");
        setField(term40607, term40607.getClass(), "category", "");
        setField(term40607, term40607.getClass(), "choice", term40612);
        setField(term40607, term40607.getClass(), "decimalPlaces", term40615);
        setField(term40607, term40607.getClass(), "defaultValue", "");
        setField(term40607, term40607.getClass(), "description", "");
        setField(term40607, term40607.getClass(), "exposeToUser", term40619);
        setField(term40607, term40607.getClass(), "maxLength", term40621);
        setField(term40607, term40607.getClass(), "maxValue", "");
        setField(term40607, term40607.getClass(), "minLength", term40624);
        setField(term40607, term40607.getClass(), "minValue", "");
        setField(term40607, term40607.getClass(), "promptAtCreate", term40627);
        setField(term40607, term40607.getClass(), "regularExpression", "");
        setField(term40607, term40607.getClass(), "requiredAtCreate", term40630);
        setField(term40607, term40607.getClass(), "type", "");
        setField(term40607, term40607.getClass(), "validationType", "");
        setField(term40607, term40607.getClass(), "valueMustBeChoice", term40634);
        setField(term40607, term40607.getClass(), "visibility", "");
        ArrayList term40605 = new ArrayList();
        ((ArrayList) term40605).add(term40607);
        term40398 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term40398, term40398.getClass(), "workflowDefaultName", "YvjPnZyRnw");
        setField(term40398, term40398.getClass(), "workflowDescription", "IKmMfqFPku");
        setField(term40398, term40398.getClass(), "workflowID", "NACnGDmVPl");
        setField(term40398, term40398.getClass(), "workflowVersion", "SfWiFjkLGW");
        setField(term40398, term40398.getClass(), "vendor", "urBahuOkUQ");
        setField(term40398, term40398.getClass(), "workflowDefinitionFileMD5Value", "zHcZrTMdOT");
        setField(term40398, term40398.getClass(), "isCallable", "zIAIXHeKXt");
        setField(term40398, term40398.getClass(), "containsParallelSteps", term40483);
        setField(term40398, term40398.getClass(), "scope", "fVkSkOqFEO");
        setField(term40398, term40398.getClass(), "jobsOutputDirectory", "DLfgyAqDDu");
        setField(term40398, term40398.getClass(), "category", "ryuQaXtwNj");
        setField(term40398, term40398.getClass(), "productID", "OutjKNDSgR");
        setField(term40398, term40398.getClass(), "productName", "brfLLGXcwA");
        setField(term40398, term40398.getClass(), "productVersion", "zoVKwYYMOI");
        setField(term40398, term40398.getClass(), "globalVariableGroup", "DGCeQsmIOU");
        setField(term40398, term40398.getClass(), "isInstanceVariableWithoutPrefix", term40569);
        setField(term40398, term40398.getClass(), "steps", term40571);
        setField(term40398, term40398.getClass(), "variables", term40605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDescription", argTypes, term40398, args);
    }

};


