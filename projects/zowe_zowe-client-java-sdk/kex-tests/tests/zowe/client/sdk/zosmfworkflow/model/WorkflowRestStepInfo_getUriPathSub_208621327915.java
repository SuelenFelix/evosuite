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

public class WorkflowRestStepInfo_getUriPathSub_208621327915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17048;

    public WorkflowRestStepInfo_getUriPathSub_208621327915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term17085 = new Boolean(false);
        Boolean term17111 = new Boolean(false);
        Boolean term17125 = new Boolean(false);
        Boolean term17139 = new Boolean(false);
        Boolean term17153 = new Boolean(true);
        Boolean term17167 = new Boolean(false);
        Boolean term17229 = new Boolean(false);
        Boolean term17231 = new Boolean(true);
        ArrayList term17233 = new ArrayList();
        ((ArrayList) term17233).add("FmWhAOGAMI");
        ((ArrayList) term17233).add("GdjCkRsIrS");
        ((ArrayList) term17233).add("MJNyYzLhkh");
        ((ArrayList) term17233).add("DEugGJIaYt");
        ((ArrayList) term17233).add("lzZIObOJmC");
        ((ArrayList) term17233).add("RFmGKwvSgz");
        Boolean term17309 = new Boolean(true);
        Boolean term17323 = new Boolean(false);
        Boolean term17325 = new Boolean(false);
        Boolean term17375 = new Boolean(true);
        Boolean term17377 = new Boolean(true);
        ArrayList term17379 = new ArrayList();
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        ((ArrayList) term17379).add((Object)null);
        term17048 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term17048, term17048.getClass(), "actualStatusCode", "nPfruizWey");
        setField(term17048, term17048.getClass(), "expectedStatusCode", "RvgkUqMUFX");
        setField(term17048, term17048.getClass(), "hostname", "nOqmldTbXj");
        setField(term17048, term17048.getClass(), "hostnameSub", term17085);
        setField(term17048, term17048.getClass(), "httpMethod", "xNDnWDGUNx");
        setField(term17048, term17048.getClass(), "port", "faGVqjLquQ");
        setField(term17048, term17048.getClass(), "portSub", term17111);
        setField(term17048, term17048.getClass(), "queryParameters", "MbsTNUmNqV");
        setField(term17048, term17048.getClass(), "queryParametersSub", term17125);
        setField(term17048, term17048.getClass(), "requestBody", "VdDIonpedU");
        setField(term17048, term17048.getClass(), "requestBodySub", term17139);
        setField(term17048, term17048.getClass(), "schemeName", "VjtXZcUFNx");
        setField(term17048, term17048.getClass(), "schemeNameSub", term17153);
        setField(term17048, term17048.getClass(), "uriPath", "bOZSTccXbt");
        setField(term17048, term17048.getClass(), "uriPathSub", term17167);
        setField(term17048, term17048.getClass(), "name", "MBSsxxeNUU");
        setField(term17048, term17048.getClass(), "title", "NmUhmPLSgG");
        setField(term17048, term17048.getClass(), "description", "WJosrfBMfA");
        setField(term17048, term17048.getClass(), "state", "ttlGywalKc");
        setField(term17048, term17048.getClass(), "stepNumber", "rQFBspqBzf");
        setField(term17048, term17048.getClass(), "optional", term17229);
        setField(term17048, term17048.getClass(), "autoEnable", term17231);
        setField(term17048, term17048.getClass(), "prereqStep", term17233);
        setField(term17048, term17048.getClass(), "userDefined", term17309);
        setField(term17048, term17048.getClass(), "runAsUser", "EUEUhZglna");
        setField(term17048, term17048.getClass(), "runAsUserDynamic", term17323);
        setField(term17048, term17048.getClass(), "isRestStep", term17325);
        setField(term17048, term17048.getClass(), "owner", "znDPtjpZrG");
        setField(term17048, term17048.getClass(), "assignees", "uodLjxczjr");
        setField(term17048, term17048.getClass(), "skills", "HJLVBQAtGs");
        setField(term17048, term17048.getClass(), "weight", "dxAxECMYEm");
        setField(term17048, term17048.getClass(), "hasCalledWorkflow", term17375);
        setField(term17048, term17048.getClass(), "isConditionStep", term17377);
        setField(term17048, term17048.getClass(), "steps", term17379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUriPathSub", argTypes, term17048, args);
    }

};


