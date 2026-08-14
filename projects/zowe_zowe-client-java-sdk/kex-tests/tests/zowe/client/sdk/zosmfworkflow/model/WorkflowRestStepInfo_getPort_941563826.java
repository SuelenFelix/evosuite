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

public class WorkflowRestStepInfo_getPort_941563826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11827;

    public WorkflowRestStepInfo_getPort_941563826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term11864 = new Boolean(false);
        Boolean term11890 = new Boolean(true);
        Boolean term11904 = new Boolean(true);
        Boolean term11918 = new Boolean(false);
        Boolean term11932 = new Boolean(true);
        Boolean term11946 = new Boolean(false);
        Boolean term12008 = new Boolean(true);
        Boolean term12010 = new Boolean(true);
        ArrayList term12012 = new ArrayList();
        ((ArrayList) term12012).add("NMANMKfctU");
        ((ArrayList) term12012).add("mQsaqUltLU");
        ((ArrayList) term12012).add("jwENwZiGlR");
        ((ArrayList) term12012).add("rfFHGPcfpz");
        ((ArrayList) term12012).add("fViQeyMrrL");
        ((ArrayList) term12012).add("zzeaToyLmI");
        ((ArrayList) term12012).add("sKYWhmRMLx");
        Boolean term12100 = new Boolean(false);
        Boolean term12114 = new Boolean(false);
        Boolean term12116 = new Boolean(true);
        Boolean term12166 = new Boolean(false);
        Boolean term12168 = new Boolean(false);
        ArrayList term12170 = new ArrayList();
        ((ArrayList) term12170).add((Object)null);
        ((ArrayList) term12170).add((Object)null);
        ((ArrayList) term12170).add((Object)null);
        ((ArrayList) term12170).add((Object)null);
        ((ArrayList) term12170).add((Object)null);
        ((ArrayList) term12170).add((Object)null);
        term11827 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term11827, term11827.getClass(), "actualStatusCode", "HLzuMxigqS");
        setField(term11827, term11827.getClass(), "expectedStatusCode", "wiBOoDCyzd");
        setField(term11827, term11827.getClass(), "hostname", "TIaFKUJELS");
        setField(term11827, term11827.getClass(), "hostnameSub", term11864);
        setField(term11827, term11827.getClass(), "httpMethod", "IPmndzGjtG");
        setField(term11827, term11827.getClass(), "port", "pkQiBgYrkQ");
        setField(term11827, term11827.getClass(), "portSub", term11890);
        setField(term11827, term11827.getClass(), "queryParameters", "SJLRFsNagf");
        setField(term11827, term11827.getClass(), "queryParametersSub", term11904);
        setField(term11827, term11827.getClass(), "requestBody", "UsCZaSgXzI");
        setField(term11827, term11827.getClass(), "requestBodySub", term11918);
        setField(term11827, term11827.getClass(), "schemeName", "IXZCeVwvBM");
        setField(term11827, term11827.getClass(), "schemeNameSub", term11932);
        setField(term11827, term11827.getClass(), "uriPath", "ElTdyUVQYi");
        setField(term11827, term11827.getClass(), "uriPathSub", term11946);
        setField(term11827, term11827.getClass(), "name", "KkgJnxXxVl");
        setField(term11827, term11827.getClass(), "title", "TGnzPlGFMb");
        setField(term11827, term11827.getClass(), "description", "yEvLMSpdHy");
        setField(term11827, term11827.getClass(), "state", "qdErlZeTVv");
        setField(term11827, term11827.getClass(), "stepNumber", "OCCDQbndDE");
        setField(term11827, term11827.getClass(), "optional", term12008);
        setField(term11827, term11827.getClass(), "autoEnable", term12010);
        setField(term11827, term11827.getClass(), "prereqStep", term12012);
        setField(term11827, term11827.getClass(), "userDefined", term12100);
        setField(term11827, term11827.getClass(), "runAsUser", "SOJpgWUZCf");
        setField(term11827, term11827.getClass(), "runAsUserDynamic", term12114);
        setField(term11827, term11827.getClass(), "isRestStep", term12116);
        setField(term11827, term11827.getClass(), "owner", "jgywFOzBDw");
        setField(term11827, term11827.getClass(), "assignees", "yKIXLtCWYi");
        setField(term11827, term11827.getClass(), "skills", "EhuyRKrUJu");
        setField(term11827, term11827.getClass(), "weight", "UlBxuoBXcJ");
        setField(term11827, term11827.getClass(), "hasCalledWorkflow", term12166);
        setField(term11827, term11827.getClass(), "isConditionStep", term12168);
        setField(term11827, term11827.getClass(), "steps", term12170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term11827, args);
    }

};


