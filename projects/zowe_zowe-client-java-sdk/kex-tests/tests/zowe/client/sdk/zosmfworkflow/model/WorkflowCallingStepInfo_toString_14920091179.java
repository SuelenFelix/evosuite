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

public class WorkflowCallingStepInfo_toString_14920091179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7241;

    public WorkflowCallingStepInfo_toString_14920091179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term7398 = new Boolean(true);
        Boolean term7400 = new Boolean(false);
        ArrayList term7402 = new ArrayList();
        ((ArrayList) term7402).add("OPJlqMJxdq");
        ((ArrayList) term7402).add("COhzwXcfds");
        ((ArrayList) term7402).add("anncJTnzrg");
        ((ArrayList) term7402).add("GMylOocLnB");
        ((ArrayList) term7402).add("spOehuHwSl");
        ((ArrayList) term7402).add("cyobgydTWP");
        ((ArrayList) term7402).add("moHYQFfLnp");
        ((ArrayList) term7402).add("BrPqlvIbEQ");
        Boolean term7502 = new Boolean(true);
        Boolean term7516 = new Boolean(true);
        Boolean term7518 = new Boolean(false);
        Boolean term7568 = new Boolean(true);
        Boolean term7570 = new Boolean(true);
        ArrayList term7572 = new ArrayList();
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        ((ArrayList) term7572).add((Object)null);
        term7241 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term7241, term7241.getClass(), "calledInstanceKey", "tXsfWIqIPn");
        setField(term7241, term7241.getClass(), "calledInstanceScope", "tDmfqEyHaN");
        setField(term7241, term7241.getClass(), "calledInstanceURI", "mTSMXFkWRr");
        setField(term7241, term7241.getClass(), "calledWorkflowID", "qdIiMKwfzT");
        setField(term7241, term7241.getClass(), "calledWorkflowVersion", "qrmUWIxufo");
        setField(term7241, term7241.getClass(), "calledWorkflowMD5", "SeWCUkXfZv");
        setField(term7241, term7241.getClass(), "calledWorkflowDescription", "woQcQRYwNH");
        setField(term7241, term7241.getClass(), "calledWorkflowDefinitionFile", "uQjzusifTg");
        setField(term7241, term7241.getClass(), "name", "mOulGkUjOk");
        setField(term7241, term7241.getClass(), "title", "hNWRuNEgOf");
        setField(term7241, term7241.getClass(), "description", "CEtjGBplmv");
        setField(term7241, term7241.getClass(), "state", "XosDTAzIAT");
        setField(term7241, term7241.getClass(), "stepNumber", "lcCEhCpiZM");
        setField(term7241, term7241.getClass(), "optional", term7398);
        setField(term7241, term7241.getClass(), "autoEnable", term7400);
        setField(term7241, term7241.getClass(), "prereqStep", term7402);
        setField(term7241, term7241.getClass(), "userDefined", term7502);
        setField(term7241, term7241.getClass(), "runAsUser", "JDTrhGRsDT");
        setField(term7241, term7241.getClass(), "runAsUserDynamic", term7516);
        setField(term7241, term7241.getClass(), "isRestStep", term7518);
        setField(term7241, term7241.getClass(), "owner", "vHxsVQImjS");
        setField(term7241, term7241.getClass(), "assignees", "jkVaRrZHQX");
        setField(term7241, term7241.getClass(), "skills", "gSFFUuJipG");
        setField(term7241, term7241.getClass(), "weight", "bQWfIFvxkQ");
        setField(term7241, term7241.getClass(), "hasCalledWorkflow", term7568);
        setField(term7241, term7241.getClass(), "isConditionStep", term7570);
        setField(term7241, term7241.getClass(), "steps", term7572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7241, args);
    }

};


