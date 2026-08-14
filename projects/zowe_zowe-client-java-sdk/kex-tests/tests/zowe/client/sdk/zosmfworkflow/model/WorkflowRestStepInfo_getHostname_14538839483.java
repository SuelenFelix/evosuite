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

public class WorkflowRestStepInfo_getHostname_14538839483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10116;

    public WorkflowRestStepInfo_getHostname_14538839483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10153 = new Boolean(false);
        Boolean term10179 = new Boolean(true);
        Boolean term10193 = new Boolean(false);
        Boolean term10207 = new Boolean(false);
        Boolean term10221 = new Boolean(true);
        Boolean term10235 = new Boolean(true);
        Boolean term10297 = new Boolean(true);
        Boolean term10299 = new Boolean(false);
        ArrayList term10301 = new ArrayList();
        ((ArrayList) term10301).add("FPablxseTr");
        ((ArrayList) term10301).add("wNndrIQDbr");
        ((ArrayList) term10301).add("JiSIFtJnYv");
        ((ArrayList) term10301).add("wxAHQRVgKc");
        ((ArrayList) term10301).add("bYsZEHeoeV");
        Boolean term10365 = new Boolean(true);
        Boolean term10379 = new Boolean(true);
        Boolean term10381 = new Boolean(true);
        Boolean term10431 = new Boolean(false);
        Boolean term10433 = new Boolean(false);
        ArrayList term10435 = new ArrayList();
        ((ArrayList) term10435).add((Object)null);
        ((ArrayList) term10435).add((Object)null);
        ((ArrayList) term10435).add((Object)null);
        term10116 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term10116, term10116.getClass(), "actualStatusCode", "oFBhNamtAs");
        setField(term10116, term10116.getClass(), "expectedStatusCode", "YURcpRjwSt");
        setField(term10116, term10116.getClass(), "hostname", "SXMdNSGPog");
        setField(term10116, term10116.getClass(), "hostnameSub", term10153);
        setField(term10116, term10116.getClass(), "httpMethod", "vsqwOLpDjj");
        setField(term10116, term10116.getClass(), "port", "rJgXQRsPCl");
        setField(term10116, term10116.getClass(), "portSub", term10179);
        setField(term10116, term10116.getClass(), "queryParameters", "RgqpoBknjN");
        setField(term10116, term10116.getClass(), "queryParametersSub", term10193);
        setField(term10116, term10116.getClass(), "requestBody", "nUDhadopHE");
        setField(term10116, term10116.getClass(), "requestBodySub", term10207);
        setField(term10116, term10116.getClass(), "schemeName", "vLrTnQTIPg");
        setField(term10116, term10116.getClass(), "schemeNameSub", term10221);
        setField(term10116, term10116.getClass(), "uriPath", "GsXvLZCFtf");
        setField(term10116, term10116.getClass(), "uriPathSub", term10235);
        setField(term10116, term10116.getClass(), "name", "JqSCTBGSUs");
        setField(term10116, term10116.getClass(), "title", "bZrrPiMnsr");
        setField(term10116, term10116.getClass(), "description", "IeromvfDmz");
        setField(term10116, term10116.getClass(), "state", "xJLHPTRSqe");
        setField(term10116, term10116.getClass(), "stepNumber", "OIFZYdbUZz");
        setField(term10116, term10116.getClass(), "optional", term10297);
        setField(term10116, term10116.getClass(), "autoEnable", term10299);
        setField(term10116, term10116.getClass(), "prereqStep", term10301);
        setField(term10116, term10116.getClass(), "userDefined", term10365);
        setField(term10116, term10116.getClass(), "runAsUser", "IwvwrQylib");
        setField(term10116, term10116.getClass(), "runAsUserDynamic", term10379);
        setField(term10116, term10116.getClass(), "isRestStep", term10381);
        setField(term10116, term10116.getClass(), "owner", "ZWJgSttNjg");
        setField(term10116, term10116.getClass(), "assignees", "LQTIjJLkXH");
        setField(term10116, term10116.getClass(), "skills", "RvkBwedFKx");
        setField(term10116, term10116.getClass(), "weight", "DYzWJljbaE");
        setField(term10116, term10116.getClass(), "hasCalledWorkflow", term10431);
        setField(term10116, term10116.getClass(), "isConditionStep", term10433);
        setField(term10116, term10116.getClass(), "steps", term10435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostname", argTypes, term10116, args);
    }

};


