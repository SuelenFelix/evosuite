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

public class WorkflowCallingStepInfo_getCalledInstanceKey_1171713361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3383;

    public WorkflowCallingStepInfo_getCalledInstanceKey_1171713361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3540 = new Boolean(false);
        Boolean term3542 = new Boolean(true);
        ArrayList term3544 = new ArrayList();
        Boolean term3548 = new Boolean(true);
        Boolean term3562 = new Boolean(false);
        Boolean term3564 = new Boolean(false);
        Boolean term3614 = new Boolean(false);
        Boolean term3616 = new Boolean(false);
        ArrayList term3618 = new ArrayList();
        ((ArrayList) term3618).add((Object)null);
        ((ArrayList) term3618).add((Object)null);
        ((ArrayList) term3618).add((Object)null);
        ((ArrayList) term3618).add((Object)null);
        ((ArrayList) term3618).add((Object)null);
        term3383 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo"));
        setField(term3383, term3383.getClass(), "calledInstanceKey", "hPSZZeYqHQ");
        setField(term3383, term3383.getClass(), "calledInstanceScope", "scReMUKyGq");
        setField(term3383, term3383.getClass(), "calledInstanceURI", "FmIpnxjRxA");
        setField(term3383, term3383.getClass(), "calledWorkflowID", "FTjxxGvyun");
        setField(term3383, term3383.getClass(), "calledWorkflowVersion", "qsjXSwKloH");
        setField(term3383, term3383.getClass(), "calledWorkflowMD5", "DDZHUPglvb");
        setField(term3383, term3383.getClass(), "calledWorkflowDescription", "rWoaXvNyVg");
        setField(term3383, term3383.getClass(), "calledWorkflowDefinitionFile", "FLzaBCFjGv");
        setField(term3383, term3383.getClass(), "name", "OLYhTSqTqJ");
        setField(term3383, term3383.getClass(), "title", "AIHoadcpQz");
        setField(term3383, term3383.getClass(), "description", "fWMsLtuOEV");
        setField(term3383, term3383.getClass(), "state", "fvgZQBalnd");
        setField(term3383, term3383.getClass(), "stepNumber", "tViQSKUCLE");
        setField(term3383, term3383.getClass(), "optional", term3540);
        setField(term3383, term3383.getClass(), "autoEnable", term3542);
        setField(term3383, term3383.getClass(), "prereqStep", term3544);
        setField(term3383, term3383.getClass(), "userDefined", term3548);
        setField(term3383, term3383.getClass(), "runAsUser", "QbaeHheqiP");
        setField(term3383, term3383.getClass(), "runAsUserDynamic", term3562);
        setField(term3383, term3383.getClass(), "isRestStep", term3564);
        setField(term3383, term3383.getClass(), "owner", "gASHxChKwn");
        setField(term3383, term3383.getClass(), "assignees", "iasolXlEEn");
        setField(term3383, term3383.getClass(), "skills", "cAObIvLmLo");
        setField(term3383, term3383.getClass(), "weight", "xwiCqRSWSe");
        setField(term3383, term3383.getClass(), "hasCalledWorkflow", term3614);
        setField(term3383, term3383.getClass(), "isConditionStep", term3616);
        setField(term3383, term3383.getClass(), "steps", term3618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowCallingStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCalledInstanceKey", argTypes, term3383, args);
    }

};


