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

public class WorkflowRestStepInfo_toString_96725039116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17633;

    public WorkflowRestStepInfo_toString_96725039116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term17670 = new Boolean(false);
        Boolean term17696 = new Boolean(true);
        Boolean term17710 = new Boolean(false);
        Boolean term17724 = new Boolean(true);
        Boolean term17738 = new Boolean(true);
        Boolean term17752 = new Boolean(true);
        Boolean term17814 = new Boolean(false);
        Boolean term17816 = new Boolean(true);
        ArrayList term17818 = new ArrayList();
        ((ArrayList) term17818).add("qakIqInzyM");
        ((ArrayList) term17818).add("EOsBgwlmva");
        ((ArrayList) term17818).add("qcSJruZuJy");
        ((ArrayList) term17818).add("NOSJtfgqAs");
        ((ArrayList) term17818).add("SUDRrjpChc");
        ((ArrayList) term17818).add("pmpprxfFwy");
        ((ArrayList) term17818).add("AQbnQoJwOO");
        ((ArrayList) term17818).add("NnicBPzNzw");
        ((ArrayList) term17818).add("WADNPbexnT");
        Boolean term17930 = new Boolean(true);
        Boolean term17944 = new Boolean(true);
        Boolean term17946 = new Boolean(false);
        Boolean term17996 = new Boolean(false);
        Boolean term17998 = new Boolean(false);
        ArrayList term18000 = new ArrayList();
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        ((ArrayList) term18000).add((Object)null);
        term17633 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term17633, term17633.getClass(), "actualStatusCode", "ylGHeywyhx");
        setField(term17633, term17633.getClass(), "expectedStatusCode", "SqMpUczXhg");
        setField(term17633, term17633.getClass(), "hostname", "voDQuoTpgt");
        setField(term17633, term17633.getClass(), "hostnameSub", term17670);
        setField(term17633, term17633.getClass(), "httpMethod", "wgwSIKAsrj");
        setField(term17633, term17633.getClass(), "port", "aGJCHRHyCe");
        setField(term17633, term17633.getClass(), "portSub", term17696);
        setField(term17633, term17633.getClass(), "queryParameters", "WingwhSgfc");
        setField(term17633, term17633.getClass(), "queryParametersSub", term17710);
        setField(term17633, term17633.getClass(), "requestBody", "YEcmxINfnL");
        setField(term17633, term17633.getClass(), "requestBodySub", term17724);
        setField(term17633, term17633.getClass(), "schemeName", "EGytMwlDVe");
        setField(term17633, term17633.getClass(), "schemeNameSub", term17738);
        setField(term17633, term17633.getClass(), "uriPath", "GFQCmYZmcg");
        setField(term17633, term17633.getClass(), "uriPathSub", term17752);
        setField(term17633, term17633.getClass(), "name", "qPgbFtsgtk");
        setField(term17633, term17633.getClass(), "title", "nkmiePLZgp");
        setField(term17633, term17633.getClass(), "description", "VoCvDpwwFr");
        setField(term17633, term17633.getClass(), "state", "zYOmoQqDOd");
        setField(term17633, term17633.getClass(), "stepNumber", "kmgEVEqTGa");
        setField(term17633, term17633.getClass(), "optional", term17814);
        setField(term17633, term17633.getClass(), "autoEnable", term17816);
        setField(term17633, term17633.getClass(), "prereqStep", term17818);
        setField(term17633, term17633.getClass(), "userDefined", term17930);
        setField(term17633, term17633.getClass(), "runAsUser", "rMbsSfMKvX");
        setField(term17633, term17633.getClass(), "runAsUserDynamic", term17944);
        setField(term17633, term17633.getClass(), "isRestStep", term17946);
        setField(term17633, term17633.getClass(), "owner", "oCsqRJXMBc");
        setField(term17633, term17633.getClass(), "assignees", "npPxKNoqdS");
        setField(term17633, term17633.getClass(), "skills", "tGgCtmAQPu");
        setField(term17633, term17633.getClass(), "weight", "HokisXXNMR");
        setField(term17633, term17633.getClass(), "hasCalledWorkflow", term17996);
        setField(term17633, term17633.getClass(), "isConditionStep", term17998);
        setField(term17633, term17633.getClass(), "steps", term18000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17633, args);
    }

};


