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

public class WorkflowGetDefinitionResponse_getVendor_19007286097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41901;

    public WorkflowGetDefinitionResponse_getVendor_19007286097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term41986 = new Boolean(true);
        Boolean term42072 = new Boolean(true);
        ArrayList term42080 = new ArrayList();
        Boolean term42083 = new Boolean(true);
        ArrayList term42085 = new ArrayList();
        ArrayList term42088 = new ArrayList();
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        ((ArrayList) term42088).add((Object)null);
        Object term42076 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term42076, term42076.getClass(), "name", "");
        setField(term42076, term42076.getClass(), "title", "");
        setField(term42076, term42076.getClass(), "description", "");
        setField(term42076, term42076.getClass(), "prereqStep", term42080);
        setField(term42076, term42076.getClass(), "optional", term42083);
        setField(term42076, term42076.getClass(), "steps", term42085);
        setField(term42076, term42076.getClass(), "variableSpecifications", term42088);
        ArrayList term42074 = new ArrayList();
        ((ArrayList) term42074).add(term42076);
        ArrayList term42100 = new ArrayList();
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        ((ArrayList) term42100).add((Object)null);
        Integer term42103 = new Integer(-2015854073);
        Boolean term42107 = new Boolean(true);
        Integer term42109 = new Integer(538259104);
        Integer term42112 = new Integer(96566506);
        Boolean term42115 = new Boolean(true);
        Boolean term42118 = new Boolean(false);
        Boolean term42122 = new Boolean(true);
        Object term42095 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term42095, term42095.getClass(), "name", "");
        setField(term42095, term42095.getClass(), "scope", "");
        setField(term42095, term42095.getClass(), "abstractInfo", "");
        setField(term42095, term42095.getClass(), "category", "");
        setField(term42095, term42095.getClass(), "choice", term42100);
        setField(term42095, term42095.getClass(), "decimalPlaces", term42103);
        setField(term42095, term42095.getClass(), "defaultValue", "");
        setField(term42095, term42095.getClass(), "description", "");
        setField(term42095, term42095.getClass(), "exposeToUser", term42107);
        setField(term42095, term42095.getClass(), "maxLength", term42109);
        setField(term42095, term42095.getClass(), "maxValue", "");
        setField(term42095, term42095.getClass(), "minLength", term42112);
        setField(term42095, term42095.getClass(), "minValue", "");
        setField(term42095, term42095.getClass(), "promptAtCreate", term42115);
        setField(term42095, term42095.getClass(), "regularExpression", "");
        setField(term42095, term42095.getClass(), "requiredAtCreate", term42118);
        setField(term42095, term42095.getClass(), "type", "");
        setField(term42095, term42095.getClass(), "validationType", "");
        setField(term42095, term42095.getClass(), "valueMustBeChoice", term42122);
        setField(term42095, term42095.getClass(), "visibility", "");
        ArrayList term42130 = new ArrayList();
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        ((ArrayList) term42130).add((Object)null);
        Integer term42133 = new Integer(-343325701);
        Boolean term42137 = new Boolean(true);
        Integer term42139 = new Integer(107945604);
        Integer term42142 = new Integer(-1963464809);
        Boolean term42145 = new Boolean(true);
        Boolean term42148 = new Boolean(false);
        Boolean term42152 = new Boolean(true);
        Object term42125 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term42125, term42125.getClass(), "name", "");
        setField(term42125, term42125.getClass(), "scope", "");
        setField(term42125, term42125.getClass(), "abstractInfo", "");
        setField(term42125, term42125.getClass(), "category", "");
        setField(term42125, term42125.getClass(), "choice", term42130);
        setField(term42125, term42125.getClass(), "decimalPlaces", term42133);
        setField(term42125, term42125.getClass(), "defaultValue", "");
        setField(term42125, term42125.getClass(), "description", "");
        setField(term42125, term42125.getClass(), "exposeToUser", term42137);
        setField(term42125, term42125.getClass(), "maxLength", term42139);
        setField(term42125, term42125.getClass(), "maxValue", "");
        setField(term42125, term42125.getClass(), "minLength", term42142);
        setField(term42125, term42125.getClass(), "minValue", "");
        setField(term42125, term42125.getClass(), "promptAtCreate", term42145);
        setField(term42125, term42125.getClass(), "regularExpression", "");
        setField(term42125, term42125.getClass(), "requiredAtCreate", term42148);
        setField(term42125, term42125.getClass(), "type", "");
        setField(term42125, term42125.getClass(), "validationType", "");
        setField(term42125, term42125.getClass(), "valueMustBeChoice", term42152);
        setField(term42125, term42125.getClass(), "visibility", "");
        ArrayList term42093 = new ArrayList();
        ((ArrayList) term42093).add(term42095);
        ((ArrayList) term42093).add(term42125);
        term41901 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse"));
        setField(term41901, term41901.getClass(), "workflowDefaultName", "ZmwRRoQNPl");
        setField(term41901, term41901.getClass(), "workflowDescription", "prNciwKNKW");
        setField(term41901, term41901.getClass(), "workflowID", "VtfNPRNIuG");
        setField(term41901, term41901.getClass(), "workflowVersion", "ttqikiUUcN");
        setField(term41901, term41901.getClass(), "vendor", "NiLxAEvTVO");
        setField(term41901, term41901.getClass(), "workflowDefinitionFileMD5Value", "SffiObxUZK");
        setField(term41901, term41901.getClass(), "isCallable", "uzPbXEJVpP");
        setField(term41901, term41901.getClass(), "containsParallelSteps", term41986);
        setField(term41901, term41901.getClass(), "scope", "vDorZRqjUi");
        setField(term41901, term41901.getClass(), "jobsOutputDirectory", "pTjttMNuyX");
        setField(term41901, term41901.getClass(), "category", "fFPyzrPhJi");
        setField(term41901, term41901.getClass(), "productID", "tiYwzLkwHD");
        setField(term41901, term41901.getClass(), "productName", "vHPMbWTklV");
        setField(term41901, term41901.getClass(), "productVersion", "phgJprcnjd");
        setField(term41901, term41901.getClass(), "globalVariableGroup", "RRjrjGfCoC");
        setField(term41901, term41901.getClass(), "isInstanceVariableWithoutPrefix", term42072);
        setField(term41901, term41901.getClass(), "steps", term42074);
        setField(term41901, term41901.getClass(), "variables", term42093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowGetDefinitionResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVendor", argTypes, term41901, args);
    }

};


