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
import java.lang.Object;

public class WorkflowCallingStepInfo_getCalledInstanceScope_4082926692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3802;

    public WorkflowCallingStepInfo_getCalledInstanceScope_4082926692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3959 = new Boolean(false);
        Boolean term3961 = new Boolean(false);
        ArrayList term3963 = new ArrayList();
        ((ArrayList) term3963).add("KDrRQWVXok");
        ((ArrayList) term3963).add("oOOwvWgxtf");
        ((ArrayList) term3963).add("ywoADeiUfF");
        Boolean term4003 = new Boolean(false);
        Boolean term4017 = new Boolean(true);
        Boolean term4019 = new Boolean(true);
        Boolean term4069 = new Boolean(false);
        Boolean term4071 = new Boolean(true);
        ArrayList term4073 = new ArrayList();
        ((ArrayList) term4073).add((Object)null);
        ((ArrayList) term4073).add((Object)null);
        ((ArrayList) term4073).add((Object)null);
        term3802 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term3802, term3802.getClass(), "calledInstanceKey", "IbUFkzIgzq");
        setField(term3802, term3802.getClass(), "calledInstanceScope", "dTOUSTDdbw");
        setField(term3802, term3802.getClass(), "calledInstanceURI", "PECfBejlfo");
        setField(term3802, term3802.getClass(), "calledWorkflowID", "SDbDgydVpg");
        setField(term3802, term3802.getClass(), "calledWorkflowVersion", "EEMaiNkiOH");
        setField(term3802, term3802.getClass(), "calledWorkflowMD5", "sFdmTylvqh");
        setField(term3802, term3802.getClass(), "calledWorkflowDescription", "rgniLaOaiz");
        setField(term3802, term3802.getClass(), "calledWorkflowDefinitionFile", "fzQzzdIOMC");
        setField(term3802, term3802.getClass(), "name", "hLVDOhfCKX");
        setField(term3802, term3802.getClass(), "title", "yXLTfzOgfX");
        setField(term3802, term3802.getClass(), "description", "MANlfBKTPY");
        setField(term3802, term3802.getClass(), "state", "mRoEmuCJhW");
        setField(term3802, term3802.getClass(), "stepNumber", "JJUWbMXpyM");
        setField(term3802, term3802.getClass(), "optional", term3959);
        setField(term3802, term3802.getClass(), "autoEnable", term3961);
        setField(term3802, term3802.getClass(), "prereqStep", term3963);
        setField(term3802, term3802.getClass(), "userDefined", term4003);
        setField(term3802, term3802.getClass(), "runAsUser", "loHiudJxbt");
        setField(term3802, term3802.getClass(), "runAsUserDynamic", term4017);
        setField(term3802, term3802.getClass(), "isRestStep", term4019);
        setField(term3802, term3802.getClass(), "owner", "lRbxbybNew");
        setField(term3802, term3802.getClass(), "assignees", "WzGudiEARD");
        setField(term3802, term3802.getClass(), "skills", "IoefPqGtaj");
        setField(term3802, term3802.getClass(), "weight", "YMmtjELJuB");
        setField(term3802, term3802.getClass(), "hasCalledWorkflow", term4069);
        setField(term3802, term3802.getClass(), "isConditionStep", term4071);
        setField(term3802, term3802.getClass(), "steps", term4073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledInstanceScope", argTypes, term3802, args);
    }

};


