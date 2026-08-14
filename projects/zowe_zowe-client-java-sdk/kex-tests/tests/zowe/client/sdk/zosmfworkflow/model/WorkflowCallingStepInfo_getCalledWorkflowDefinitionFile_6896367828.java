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

public class WorkflowCallingStepInfo_getCalledWorkflowDefinitionFile_6896367828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6800;

    public WorkflowCallingStepInfo_getCalledWorkflowDefinitionFile_6896367828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6957 = new Boolean(true);
        Boolean term6959 = new Boolean(false);
        ArrayList term6961 = new ArrayList();
        ((ArrayList) term6961).add("KgfsAwTFFn");
        Boolean term6977 = new Boolean(true);
        Boolean term6991 = new Boolean(true);
        Boolean term6993 = new Boolean(false);
        Boolean term7043 = new Boolean(false);
        Boolean term7045 = new Boolean(true);
        ArrayList term7047 = new ArrayList();
        ((ArrayList) term7047).add((Object)null);
        ((ArrayList) term7047).add((Object)null);
        ((ArrayList) term7047).add((Object)null);
        ((ArrayList) term7047).add((Object)null);
        ((ArrayList) term7047).add((Object)null);
        term6800 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term6800, term6800.getClass(), "calledInstanceKey", "DLpKfwPpvr");
        setField(term6800, term6800.getClass(), "calledInstanceScope", "DLFXidLbuT");
        setField(term6800, term6800.getClass(), "calledInstanceURI", "FjkxfTXGIH");
        setField(term6800, term6800.getClass(), "calledWorkflowID", "KJkWSFFnmR");
        setField(term6800, term6800.getClass(), "calledWorkflowVersion", "FBYRIDZvmW");
        setField(term6800, term6800.getClass(), "calledWorkflowMD5", "IyjLfrDZrV");
        setField(term6800, term6800.getClass(), "calledWorkflowDescription", "BRMTHqqoRg");
        setField(term6800, term6800.getClass(), "calledWorkflowDefinitionFile", "nOElYZBeyU");
        setField(term6800, term6800.getClass(), "name", "eUXPtGmoNg");
        setField(term6800, term6800.getClass(), "title", "ZjqXyUmAJY");
        setField(term6800, term6800.getClass(), "description", "pjEERkBbYo");
        setField(term6800, term6800.getClass(), "state", "FQPqmjhWog");
        setField(term6800, term6800.getClass(), "stepNumber", "sYtJsiIiSX");
        setField(term6800, term6800.getClass(), "optional", term6957);
        setField(term6800, term6800.getClass(), "autoEnable", term6959);
        setField(term6800, term6800.getClass(), "prereqStep", term6961);
        setField(term6800, term6800.getClass(), "userDefined", term6977);
        setField(term6800, term6800.getClass(), "runAsUser", "hFnFlgThhp");
        setField(term6800, term6800.getClass(), "runAsUserDynamic", term6991);
        setField(term6800, term6800.getClass(), "isRestStep", term6993);
        setField(term6800, term6800.getClass(), "owner", "aEZAnHuGSR");
        setField(term6800, term6800.getClass(), "assignees", "uMzGGnJFYF");
        setField(term6800, term6800.getClass(), "skills", "iAIRLRjFkP");
        setField(term6800, term6800.getClass(), "weight", "cdXvvxXVTz");
        setField(term6800, term6800.getClass(), "hasCalledWorkflow", term7043);
        setField(term6800, term6800.getClass(), "isConditionStep", term7045);
        setField(term6800, term6800.getClass(), "steps", term7047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledWorkflowDefinitionFile", argTypes, term6800, args);
    }

};


