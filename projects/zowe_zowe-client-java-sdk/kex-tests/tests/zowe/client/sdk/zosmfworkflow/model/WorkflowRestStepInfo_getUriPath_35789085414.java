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

public class WorkflowRestStepInfo_getUriPath_35789085414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16441;

    public WorkflowRestStepInfo_getUriPath_35789085414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term16478 = new Boolean(true);
        Boolean term16504 = new Boolean(false);
        Boolean term16518 = new Boolean(false);
        Boolean term16532 = new Boolean(true);
        Boolean term16546 = new Boolean(true);
        Boolean term16560 = new Boolean(false);
        Boolean term16622 = new Boolean(true);
        Boolean term16624 = new Boolean(true);
        ArrayList term16626 = new ArrayList();
        ((ArrayList) term16626).add("VsizBWhPWL");
        ((ArrayList) term16626).add("jAFSxnVMcD");
        ((ArrayList) term16626).add("BuNQAVaNCe");
        ((ArrayList) term16626).add("iaYiUQnOLD");
        ((ArrayList) term16626).add("upnleTLVdf");
        ((ArrayList) term16626).add("pvjlKAnxzJ");
        ((ArrayList) term16626).add("ejxUBDQQKB");
        Boolean term16714 = new Boolean(false);
        Boolean term16728 = new Boolean(false);
        Boolean term16730 = new Boolean(false);
        Boolean term16780 = new Boolean(false);
        Boolean term16782 = new Boolean(true);
        ArrayList term16784 = new ArrayList();
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        ((ArrayList) term16784).add((Object)null);
        term16441 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term16441, term16441.getClass(), "actualStatusCode", "dKoYnXLGEI");
        setField(term16441, term16441.getClass(), "expectedStatusCode", "MQvSpklpkB");
        setField(term16441, term16441.getClass(), "hostname", "SbTxRdDQQc");
        setField(term16441, term16441.getClass(), "hostnameSub", term16478);
        setField(term16441, term16441.getClass(), "httpMethod", "MrVdoUYAdO");
        setField(term16441, term16441.getClass(), "port", "schPUnVfDW");
        setField(term16441, term16441.getClass(), "portSub", term16504);
        setField(term16441, term16441.getClass(), "queryParameters", "CpdMEgjUka");
        setField(term16441, term16441.getClass(), "queryParametersSub", term16518);
        setField(term16441, term16441.getClass(), "requestBody", "WRisHdgnmm");
        setField(term16441, term16441.getClass(), "requestBodySub", term16532);
        setField(term16441, term16441.getClass(), "schemeName", "XxZiwWPLOx");
        setField(term16441, term16441.getClass(), "schemeNameSub", term16546);
        setField(term16441, term16441.getClass(), "uriPath", "nyqsjMHTba");
        setField(term16441, term16441.getClass(), "uriPathSub", term16560);
        setField(term16441, term16441.getClass(), "name", "ylUHzURWyg");
        setField(term16441, term16441.getClass(), "title", "VuAuFBlHxQ");
        setField(term16441, term16441.getClass(), "description", "nOLtCslMMH");
        setField(term16441, term16441.getClass(), "state", "dIQWOeKQVj");
        setField(term16441, term16441.getClass(), "stepNumber", "tHiDGaNXAL");
        setField(term16441, term16441.getClass(), "optional", term16622);
        setField(term16441, term16441.getClass(), "autoEnable", term16624);
        setField(term16441, term16441.getClass(), "prereqStep", term16626);
        setField(term16441, term16441.getClass(), "userDefined", term16714);
        setField(term16441, term16441.getClass(), "runAsUser", "IbOvZLmtSE");
        setField(term16441, term16441.getClass(), "runAsUserDynamic", term16728);
        setField(term16441, term16441.getClass(), "isRestStep", term16730);
        setField(term16441, term16441.getClass(), "owner", "AOsIglRFcp");
        setField(term16441, term16441.getClass(), "assignees", "bdONLhBZoA");
        setField(term16441, term16441.getClass(), "skills", "qPVeRcolUe");
        setField(term16441, term16441.getClass(), "weight", "AscZyfQFkU");
        setField(term16441, term16441.getClass(), "hasCalledWorkflow", term16780);
        setField(term16441, term16441.getClass(), "isConditionStep", term16782);
        setField(term16441, term16441.getClass(), "steps", term16784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUriPath", argTypes, term16441, args);
    }

};


