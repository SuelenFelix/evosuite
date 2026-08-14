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

public class WorkflowGetDefinitionResponse_getProductID_29731653314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45513;

    public WorkflowGetDefinitionResponse_getProductID_29731653314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term45598 = new Boolean(true);
        Boolean term45684 = new Boolean(false);
        ArrayList term45686 = new ArrayList();
        ArrayList term45697 = new ArrayList();
        ((ArrayList) term45697).add((Object)null);
        ((ArrayList) term45697).add((Object)null);
        ((ArrayList) term45697).add((Object)null);
        ((ArrayList) term45697).add((Object)null);
        ((ArrayList) term45697).add((Object)null);
        ((ArrayList) term45697).add((Object)null);
        Integer term45700 = new Integer(-1022990421);
        Boolean term45704 = new Boolean(false);
        Integer term45706 = new Integer(1045547089);
        Integer term45709 = new Integer(-1122880881);
        Boolean term45712 = new Boolean(false);
        Boolean term45715 = new Boolean(false);
        Boolean term45719 = new Boolean(false);
        Object term45692 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term45692, term45692.getClass(), "name", "");
        setField(term45692, term45692.getClass(), "scope", "");
        setField(term45692, term45692.getClass(), "abstractInfo", "");
        setField(term45692, term45692.getClass(), "category", "");
        setField(term45692, term45692.getClass(), "choice", term45697);
        setField(term45692, term45692.getClass(), "decimalPlaces", term45700);
        setField(term45692, term45692.getClass(), "defaultValue", "");
        setField(term45692, term45692.getClass(), "description", "");
        setField(term45692, term45692.getClass(), "exposeToUser", term45704);
        setField(term45692, term45692.getClass(), "maxLength", term45706);
        setField(term45692, term45692.getClass(), "maxValue", "");
        setField(term45692, term45692.getClass(), "minLength", term45709);
        setField(term45692, term45692.getClass(), "minValue", "");
        setField(term45692, term45692.getClass(), "promptAtCreate", term45712);
        setField(term45692, term45692.getClass(), "regularExpression", "");
        setField(term45692, term45692.getClass(), "requiredAtCreate", term45715);
        setField(term45692, term45692.getClass(), "type", "");
        setField(term45692, term45692.getClass(), "validationType", "");
        setField(term45692, term45692.getClass(), "valueMustBeChoice", term45719);
        setField(term45692, term45692.getClass(), "visibility", "");
        ArrayList term45727 = new ArrayList();
        ((ArrayList) term45727).add((Object)null);
        ((ArrayList) term45727).add((Object)null);
        ((ArrayList) term45727).add((Object)null);
        Integer term45730 = new Integer(-542712742);
        Boolean term45734 = new Boolean(true);
        Integer term45736 = new Integer(-1254072822);
        Integer term45739 = new Integer(-1111249833);
        Boolean term45742 = new Boolean(false);
        Boolean term45745 = new Boolean(true);
        Boolean term45749 = new Boolean(false);
        Object term45722 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term45722, term45722.getClass(), "name", "");
        setField(term45722, term45722.getClass(), "scope", "");
        setField(term45722, term45722.getClass(), "abstractInfo", "");
        setField(term45722, term45722.getClass(), "category", "");
        setField(term45722, term45722.getClass(), "choice", term45727);
        setField(term45722, term45722.getClass(), "decimalPlaces", term45730);
        setField(term45722, term45722.getClass(), "defaultValue", "");
        setField(term45722, term45722.getClass(), "description", "");
        setField(term45722, term45722.getClass(), "exposeToUser", term45734);
        setField(term45722, term45722.getClass(), "maxLength", term45736);
        setField(term45722, term45722.getClass(), "maxValue", "");
        setField(term45722, term45722.getClass(), "minLength", term45739);
        setField(term45722, term45722.getClass(), "minValue", "");
        setField(term45722, term45722.getClass(), "promptAtCreate", term45742);
        setField(term45722, term45722.getClass(), "regularExpression", "");
        setField(term45722, term45722.getClass(), "requiredAtCreate", term45745);
        setField(term45722, term45722.getClass(), "type", "");
        setField(term45722, term45722.getClass(), "validationType", "");
        setField(term45722, term45722.getClass(), "valueMustBeChoice", term45749);
        setField(term45722, term45722.getClass(), "visibility", "");
        ArrayList term45690 = new ArrayList();
        ((ArrayList) term45690).add(term45692);
        ((ArrayList) term45690).add(term45722);
        term45513 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term45513, term45513.getClass(), "workflowDefaultName", "iYRIEjEhxB");
        setField(term45513, term45513.getClass(), "workflowDescription", "EyLarnQiro");
        setField(term45513, term45513.getClass(), "workflowID", "xPXCillnkF");
        setField(term45513, term45513.getClass(), "workflowVersion", "UQdNECYgYF");
        setField(term45513, term45513.getClass(), "vendor", "tWKRqEdXvq");
        setField(term45513, term45513.getClass(), "workflowDefinitionFileMD5Value", "IzICHEiRZJ");
        setField(term45513, term45513.getClass(), "isCallable", "OVdPWRdMle");
        setField(term45513, term45513.getClass(), "containsParallelSteps", term45598);
        setField(term45513, term45513.getClass(), "scope", "oimCfCnzdd");
        setField(term45513, term45513.getClass(), "jobsOutputDirectory", "kDhZwzBdJr");
        setField(term45513, term45513.getClass(), "category", "lGNwldURrK");
        setField(term45513, term45513.getClass(), "productID", "AfRMrnPQsz");
        setField(term45513, term45513.getClass(), "productName", "ilHCxxLSlR");
        setField(term45513, term45513.getClass(), "productVersion", "KINWoNPskz");
        setField(term45513, term45513.getClass(), "globalVariableGroup", "ThcARbQtxE");
        setField(term45513, term45513.getClass(), "isInstanceVariableWithoutPrefix", term45684);
        setField(term45513, term45513.getClass(), "steps", term45686);
        setField(term45513, term45513.getClass(), "variables", term45690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductID", argTypes, term45513, args);
    }

};


