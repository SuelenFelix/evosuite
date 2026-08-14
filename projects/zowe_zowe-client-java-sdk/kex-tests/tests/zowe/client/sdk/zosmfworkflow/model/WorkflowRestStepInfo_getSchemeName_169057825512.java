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

public class WorkflowRestStepInfo_getSchemeName_169057825512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15315;

    public WorkflowRestStepInfo_getSchemeName_169057825512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term15352 = new Boolean(true);
        Boolean term15378 = new Boolean(false);
        Boolean term15392 = new Boolean(true);
        Boolean term15406 = new Boolean(true);
        Boolean term15420 = new Boolean(false);
        Boolean term15434 = new Boolean(true);
        Boolean term15496 = new Boolean(false);
        Boolean term15498 = new Boolean(false);
        ArrayList term15500 = new ArrayList();
        ((ArrayList) term15500).add("belyXxMqFm");
        ((ArrayList) term15500).add("LPotuCwkwB");
        ((ArrayList) term15500).add("zpCKXLOzse");
        ((ArrayList) term15500).add("qhlWSiHAHt");
        Boolean term15552 = new Boolean(true);
        Boolean term15566 = new Boolean(false);
        Boolean term15568 = new Boolean(false);
        Boolean term15618 = new Boolean(true);
        Boolean term15620 = new Boolean(false);
        ArrayList term15622 = new ArrayList();
        ((ArrayList) term15622).add((Object)null);
        term15315 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term15315, term15315.getClass(), "actualStatusCode", "pAIBwhAbDu");
        setField(term15315, term15315.getClass(), "expectedStatusCode", "iqhNUjVbRG");
        setField(term15315, term15315.getClass(), "hostname", "SSqIrPwJXd");
        setField(term15315, term15315.getClass(), "hostnameSub", term15352);
        setField(term15315, term15315.getClass(), "httpMethod", "jAxYagPvcV");
        setField(term15315, term15315.getClass(), "port", "ZXLgGUqgyW");
        setField(term15315, term15315.getClass(), "portSub", term15378);
        setField(term15315, term15315.getClass(), "queryParameters", "PdeSzTcBgY");
        setField(term15315, term15315.getClass(), "queryParametersSub", term15392);
        setField(term15315, term15315.getClass(), "requestBody", "PmSvMYNoIS");
        setField(term15315, term15315.getClass(), "requestBodySub", term15406);
        setField(term15315, term15315.getClass(), "schemeName", "zejWtMxJdV");
        setField(term15315, term15315.getClass(), "schemeNameSub", term15420);
        setField(term15315, term15315.getClass(), "uriPath", "YUIUZeZiMK");
        setField(term15315, term15315.getClass(), "uriPathSub", term15434);
        setField(term15315, term15315.getClass(), "name", "rrPETbKRef");
        setField(term15315, term15315.getClass(), "title", "viZRlrisPY");
        setField(term15315, term15315.getClass(), "description", "VSfRsPLslq");
        setField(term15315, term15315.getClass(), "state", "dwygneuBjP");
        setField(term15315, term15315.getClass(), "stepNumber", "LfKgkzPZpX");
        setField(term15315, term15315.getClass(), "optional", term15496);
        setField(term15315, term15315.getClass(), "autoEnable", term15498);
        setField(term15315, term15315.getClass(), "prereqStep", term15500);
        setField(term15315, term15315.getClass(), "userDefined", term15552);
        setField(term15315, term15315.getClass(), "runAsUser", "XrKIhxpIJD");
        setField(term15315, term15315.getClass(), "runAsUserDynamic", term15566);
        setField(term15315, term15315.getClass(), "isRestStep", term15568);
        setField(term15315, term15315.getClass(), "owner", "RSuRSjiLvm");
        setField(term15315, term15315.getClass(), "assignees", "aoeNWgMpNx");
        setField(term15315, term15315.getClass(), "skills", "RQvXfSweVs");
        setField(term15315, term15315.getClass(), "weight", "jGxArBjtep");
        setField(term15315, term15315.getClass(), "hasCalledWorkflow", term15618);
        setField(term15315, term15315.getClass(), "isConditionStep", term15620);
        setField(term15315, term15315.getClass(), "steps", term15622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemeName", argTypes, term15315, args);
    }

};


