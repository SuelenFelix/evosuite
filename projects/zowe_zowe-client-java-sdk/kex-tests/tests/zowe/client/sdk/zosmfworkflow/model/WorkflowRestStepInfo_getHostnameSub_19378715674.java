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

public class WorkflowRestStepInfo_getHostnameSub_19378715674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10679;

    public WorkflowRestStepInfo_getHostnameSub_19378715674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term10716 = new Boolean(true);
        Boolean term10742 = new Boolean(false);
        Boolean term10756 = new Boolean(false);
        Boolean term10770 = new Boolean(false);
        Boolean term10784 = new Boolean(false);
        Boolean term10798 = new Boolean(true);
        Boolean term10860 = new Boolean(true);
        Boolean term10862 = new Boolean(false);
        ArrayList term10864 = new ArrayList();
        ((ArrayList) term10864).add("rvYqMRgiPA");
        ((ArrayList) term10864).add("qOZXeUUmdz");
        ((ArrayList) term10864).add("FCovVZHqPx");
        ((ArrayList) term10864).add("jSTBfkWjge");
        ((ArrayList) term10864).add("uKYhZULSHp");
        ((ArrayList) term10864).add("xdYuLllgpn");
        ((ArrayList) term10864).add("ayonlqalLA");
        ((ArrayList) term10864).add("fzzIOVxKdF");
        Boolean term10964 = new Boolean(false);
        Boolean term10978 = new Boolean(false);
        Boolean term10980 = new Boolean(false);
        Boolean term11030 = new Boolean(false);
        Boolean term11032 = new Boolean(false);
        ArrayList term11034 = new ArrayList();
        ((ArrayList) term11034).add((Object)null);
        ((ArrayList) term11034).add((Object)null);
        ((ArrayList) term11034).add((Object)null);
        ((ArrayList) term11034).add((Object)null);
        ((ArrayList) term11034).add((Object)null);
        ((ArrayList) term11034).add((Object)null);
        term10679 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term10679, term10679.getClass(), "actualStatusCode", "idwbHVHUcz");
        setField(term10679, term10679.getClass(), "expectedStatusCode", "sWJHIWZMuX");
        setField(term10679, term10679.getClass(), "hostname", "PwMdJRwzDW");
        setField(term10679, term10679.getClass(), "hostnameSub", term10716);
        setField(term10679, term10679.getClass(), "httpMethod", "sMiHxgXUuN");
        setField(term10679, term10679.getClass(), "port", "oVChCWWDag");
        setField(term10679, term10679.getClass(), "portSub", term10742);
        setField(term10679, term10679.getClass(), "queryParameters", "EteTxkDxin");
        setField(term10679, term10679.getClass(), "queryParametersSub", term10756);
        setField(term10679, term10679.getClass(), "requestBody", "mKgLwPdYbY");
        setField(term10679, term10679.getClass(), "requestBodySub", term10770);
        setField(term10679, term10679.getClass(), "schemeName", "zqykonsLIo");
        setField(term10679, term10679.getClass(), "schemeNameSub", term10784);
        setField(term10679, term10679.getClass(), "uriPath", "KoPzTuvIeK");
        setField(term10679, term10679.getClass(), "uriPathSub", term10798);
        setField(term10679, term10679.getClass(), "name", "SMoWUILIhn");
        setField(term10679, term10679.getClass(), "title", "SvSKSCjgTM");
        setField(term10679, term10679.getClass(), "description", "UFxnRbWtog");
        setField(term10679, term10679.getClass(), "state", "NSxzAUSujy");
        setField(term10679, term10679.getClass(), "stepNumber", "FEezgglqXC");
        setField(term10679, term10679.getClass(), "optional", term10860);
        setField(term10679, term10679.getClass(), "autoEnable", term10862);
        setField(term10679, term10679.getClass(), "prereqStep", term10864);
        setField(term10679, term10679.getClass(), "userDefined", term10964);
        setField(term10679, term10679.getClass(), "runAsUser", "cdvmxZaBEK");
        setField(term10679, term10679.getClass(), "runAsUserDynamic", term10978);
        setField(term10679, term10679.getClass(), "isRestStep", term10980);
        setField(term10679, term10679.getClass(), "owner", "QHYZiyDyPC");
        setField(term10679, term10679.getClass(), "assignees", "kcHMyiheuH");
        setField(term10679, term10679.getClass(), "skills", "DGMBBNDEYs");
        setField(term10679, term10679.getClass(), "weight", "vpuKZSMmKQ");
        setField(term10679, term10679.getClass(), "hasCalledWorkflow", term11030);
        setField(term10679, term10679.getClass(), "isConditionStep", term11032);
        setField(term10679, term10679.getClass(), "steps", term11034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostnameSub", argTypes, term10679, args);
    }

};


