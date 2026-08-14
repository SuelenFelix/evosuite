package zowe.client.sdk.zosmfworkflow.model;

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
import static zowe.client.sdk.zosmfworkflow.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.util.ArrayList;

public class WorkflowCallingStepInfo_getCalledWorkflowID_14738846384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4860;

    public WorkflowCallingStepInfo_getCalledWorkflowID_14738846384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term5017 = new Boolean(false);
        Boolean term5019 = new Boolean(false);
        ArrayList term5021 = new ArrayList();
        ((ArrayList) term5021).add("CGeclMyIOP");
        ((ArrayList) term5021).add("yyWOYvIBsp");
        Boolean term5049 = new Boolean(false);
        Boolean term5063 = new Boolean(true);
        Boolean term5065 = new Boolean(true);
        Boolean term5115 = new Boolean(false);
        Boolean term5117 = new Boolean(false);
        ArrayList term5119 = new ArrayList();
        term4860 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term4860, term4860.getClass(), "calledInstanceKey", "BCAlJpNjIX");
        setField(term4860, term4860.getClass(), "calledInstanceScope", "PKClfBAwUr");
        setField(term4860, term4860.getClass(), "calledInstanceURI", "JqbKrmVEMy");
        setField(term4860, term4860.getClass(), "calledWorkflowID", "VygCEWaefB");
        setField(term4860, term4860.getClass(), "calledWorkflowVersion", "PqhYfEyDDA");
        setField(term4860, term4860.getClass(), "calledWorkflowMD5", "fSLHLeuNoa");
        setField(term4860, term4860.getClass(), "calledWorkflowDescription", "IwgPFurObw");
        setField(term4860, term4860.getClass(), "calledWorkflowDefinitionFile", "WLaHlrYQyz");
        setField(term4860, term4860.getClass(), "name", "CaeIUTuUFo");
        setField(term4860, term4860.getClass(), "title", "rzoDGjHkzG");
        setField(term4860, term4860.getClass(), "description", "NsphHxYiuC");
        setField(term4860, term4860.getClass(), "state", "XYJztkznbY");
        setField(term4860, term4860.getClass(), "stepNumber", "NeTiWVoyjZ");
        setField(term4860, term4860.getClass(), "optional", term5017);
        setField(term4860, term4860.getClass(), "autoEnable", term5019);
        setField(term4860, term4860.getClass(), "prereqStep", term5021);
        setField(term4860, term4860.getClass(), "userDefined", term5049);
        setField(term4860, term4860.getClass(), "runAsUser", "mmpgARMYFV");
        setField(term4860, term4860.getClass(), "runAsUserDynamic", term5063);
        setField(term4860, term4860.getClass(), "isRestStep", term5065);
        setField(term4860, term4860.getClass(), "owner", "NUqhsZprdZ");
        setField(term4860, term4860.getClass(), "assignees", "jkzgCqWJrA");
        setField(term4860, term4860.getClass(), "skills", "rawiXxuyRn");
        setField(term4860, term4860.getClass(), "weight", "ZyAecZGope");
        setField(term4860, term4860.getClass(), "hasCalledWorkflow", term5115);
        setField(term4860, term4860.getClass(), "isConditionStep", term5117);
        setField(term4860, term4860.getClass(), "steps", term5119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowID", argTypes, term4860, args);
    }

};


