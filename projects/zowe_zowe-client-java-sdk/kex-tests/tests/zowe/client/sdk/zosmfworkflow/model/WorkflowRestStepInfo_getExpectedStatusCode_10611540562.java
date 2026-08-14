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

public class WorkflowRestStepInfo_getExpectedStatusCode_10611540562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9597;

    public WorkflowRestStepInfo_getExpectedStatusCode_10611540562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term9634 = new Boolean(true);
        Boolean term9660 = new Boolean(false);
        Boolean term9674 = new Boolean(true);
        Boolean term9688 = new Boolean(true);
        Boolean term9702 = new Boolean(true);
        Boolean term9716 = new Boolean(false);
        Boolean term9778 = new Boolean(true);
        Boolean term9780 = new Boolean(true);
        ArrayList term9782 = new ArrayList();
        ((ArrayList) term9782).add("xjKxECGyLT");
        ((ArrayList) term9782).add("ffKeJGEXBT");
        ((ArrayList) term9782).add("rsnXTpfhqf");
        Boolean term9822 = new Boolean(false);
        Boolean term9836 = new Boolean(true);
        Boolean term9838 = new Boolean(false);
        Boolean term9888 = new Boolean(true);
        Boolean term9890 = new Boolean(false);
        ArrayList term9892 = new ArrayList();
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        ((ArrayList) term9892).add((Object)null);
        term9597 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term9597, term9597.getClass(), "actualStatusCode", "jleFBTYSNb");
        setField(term9597, term9597.getClass(), "expectedStatusCode", "WmSSWHEELj");
        setField(term9597, term9597.getClass(), "hostname", "ggFhMyQvdw");
        setField(term9597, term9597.getClass(), "hostnameSub", term9634);
        setField(term9597, term9597.getClass(), "httpMethod", "vZpMxQNHKu");
        setField(term9597, term9597.getClass(), "port", "QLMSDWYwBC");
        setField(term9597, term9597.getClass(), "portSub", term9660);
        setField(term9597, term9597.getClass(), "queryParameters", "feyxNWUenU");
        setField(term9597, term9597.getClass(), "queryParametersSub", term9674);
        setField(term9597, term9597.getClass(), "requestBody", "qvqwmSUIiP");
        setField(term9597, term9597.getClass(), "requestBodySub", term9688);
        setField(term9597, term9597.getClass(), "schemeName", "eNOEXYoAtV");
        setField(term9597, term9597.getClass(), "schemeNameSub", term9702);
        setField(term9597, term9597.getClass(), "uriPath", "SNqwfZGLFh");
        setField(term9597, term9597.getClass(), "uriPathSub", term9716);
        setField(term9597, term9597.getClass(), "name", "sMqpXbgEga");
        setField(term9597, term9597.getClass(), "title", "nYJlDpoMcL");
        setField(term9597, term9597.getClass(), "description", "SQnbnBmbcf");
        setField(term9597, term9597.getClass(), "state", "jaNVteZrZi");
        setField(term9597, term9597.getClass(), "stepNumber", "bMRkDiPUGu");
        setField(term9597, term9597.getClass(), "optional", term9778);
        setField(term9597, term9597.getClass(), "autoEnable", term9780);
        setField(term9597, term9597.getClass(), "prereqStep", term9782);
        setField(term9597, term9597.getClass(), "userDefined", term9822);
        setField(term9597, term9597.getClass(), "runAsUser", "gzvlGZVfnZ");
        setField(term9597, term9597.getClass(), "runAsUserDynamic", term9836);
        setField(term9597, term9597.getClass(), "isRestStep", term9838);
        setField(term9597, term9597.getClass(), "owner", "rmSqCaXWHi");
        setField(term9597, term9597.getClass(), "assignees", "ScztqspySK");
        setField(term9597, term9597.getClass(), "skills", "IvYxGwWoVu");
        setField(term9597, term9597.getClass(), "weight", "XnZHOhTfxL");
        setField(term9597, term9597.getClass(), "hasCalledWorkflow", term9888);
        setField(term9597, term9597.getClass(), "isConditionStep", term9890);
        setField(term9597, term9597.getClass(), "steps", term9892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpectedStatusCode", argTypes, term9597, args);
    }

};


