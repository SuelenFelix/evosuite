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

public class WorkflowCallingStepInfo_getCalledInstanceURI_1257943893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4287;

    public WorkflowCallingStepInfo_getCalledInstanceURI_1257943893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term4444 = new Boolean(true);
        Boolean term4446 = new Boolean(true);
        ArrayList term4448 = new ArrayList();
        ((ArrayList) term4448).add("TLjhFZbwKO");
        ((ArrayList) term4448).add("nxEbLIApFc");
        ((ArrayList) term4448).add("zzsdNZhejE");
        ((ArrayList) term4448).add("ILoodMZrgR");
        ((ArrayList) term4448).add("XQiKmsCacK");
        ((ArrayList) term4448).add("cTCixEbHYT");
        ((ArrayList) term4448).add("bqKksqtAdT");
        Boolean term4536 = new Boolean(true);
        Boolean term4550 = new Boolean(true);
        Boolean term4552 = new Boolean(true);
        Boolean term4602 = new Boolean(true);
        Boolean term4604 = new Boolean(true);
        ArrayList term4606 = new ArrayList();
        ((ArrayList) term4606).add((Object)null);
        ((ArrayList) term4606).add((Object)null);
        term4287 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term4287, term4287.getClass(), "calledInstanceKey", "FzyIShiOmb");
        setField(term4287, term4287.getClass(), "calledInstanceScope", "PEUfeJaZTk");
        setField(term4287, term4287.getClass(), "calledInstanceURI", "AIvyeIdskz");
        setField(term4287, term4287.getClass(), "calledWorkflowID", "iSQqMWMRlU");
        setField(term4287, term4287.getClass(), "calledWorkflowVersion", "djWEnlbOXu");
        setField(term4287, term4287.getClass(), "calledWorkflowMD5", "MvDMzQBWME");
        setField(term4287, term4287.getClass(), "calledWorkflowDescription", "sZyAwmdGVS");
        setField(term4287, term4287.getClass(), "calledWorkflowDefinitionFile", "VoKhXiLAaW");
        setField(term4287, term4287.getClass(), "name", "CaalXzRXQI");
        setField(term4287, term4287.getClass(), "title", "eRBnKPjyVg");
        setField(term4287, term4287.getClass(), "description", "svPqsHBvrm");
        setField(term4287, term4287.getClass(), "state", "sRzUJLYMmB");
        setField(term4287, term4287.getClass(), "stepNumber", "XxILklSDwz");
        setField(term4287, term4287.getClass(), "optional", term4444);
        setField(term4287, term4287.getClass(), "autoEnable", term4446);
        setField(term4287, term4287.getClass(), "prereqStep", term4448);
        setField(term4287, term4287.getClass(), "userDefined", term4536);
        setField(term4287, term4287.getClass(), "runAsUser", "jAIAdEmULK");
        setField(term4287, term4287.getClass(), "runAsUserDynamic", term4550);
        setField(term4287, term4287.getClass(), "isRestStep", term4552);
        setField(term4287, term4287.getClass(), "owner", "EuAshkmbna");
        setField(term4287, term4287.getClass(), "assignees", "JwQlbBbGJR");
        setField(term4287, term4287.getClass(), "skills", "HdWLwfVsAM");
        setField(term4287, term4287.getClass(), "weight", "SxeKEdHXSl");
        setField(term4287, term4287.getClass(), "hasCalledWorkflow", term4602);
        setField(term4287, term4287.getClass(), "isConditionStep", term4604);
        setField(term4287, term4287.getClass(), "steps", term4606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledInstanceURI", argTypes, term4287, args);
    }

};


