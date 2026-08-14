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

public class WorkflowRestStepInfo_getRequestBodySub_148792281511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14752;

    public WorkflowRestStepInfo_getRequestBodySub_148792281511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term14789 = new Boolean(true);
        Boolean term14815 = new Boolean(true);
        Boolean term14829 = new Boolean(false);
        Boolean term14843 = new Boolean(false);
        Boolean term14857 = new Boolean(true);
        Boolean term14871 = new Boolean(true);
        Boolean term14933 = new Boolean(false);
        Boolean term14935 = new Boolean(true);
        ArrayList term14937 = new ArrayList();
        ((ArrayList) term14937).add("lmZBCmpOeb");
        ((ArrayList) term14937).add("cPlYOAUqsP");
        ((ArrayList) term14937).add("ritBUyuuKt");
        ((ArrayList) term14937).add("YfziBBiPvL");
        ((ArrayList) term14937).add("lNBaHEkYui");
        Boolean term15001 = new Boolean(false);
        Boolean term15015 = new Boolean(true);
        Boolean term15017 = new Boolean(false);
        Boolean term15067 = new Boolean(false);
        Boolean term15069 = new Boolean(false);
        ArrayList term15071 = new ArrayList();
        ((ArrayList) term15071).add((Object)null);
        ((ArrayList) term15071).add((Object)null);
        ((ArrayList) term15071).add((Object)null);
        ((ArrayList) term15071).add((Object)null);
        term14752 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term14752, term14752.getClass(), "actualStatusCode", "EYJXMlkLoO");
        setField(term14752, term14752.getClass(), "expectedStatusCode", "qJtkJJhOSV");
        setField(term14752, term14752.getClass(), "hostname", "vQbiGKncal");
        setField(term14752, term14752.getClass(), "hostnameSub", term14789);
        setField(term14752, term14752.getClass(), "httpMethod", "NTSNSiYeUu");
        setField(term14752, term14752.getClass(), "port", "SBTEFDmQVY");
        setField(term14752, term14752.getClass(), "portSub", term14815);
        setField(term14752, term14752.getClass(), "queryParameters", "ohZpRiNDZM");
        setField(term14752, term14752.getClass(), "queryParametersSub", term14829);
        setField(term14752, term14752.getClass(), "requestBody", "qEXIxhmUwz");
        setField(term14752, term14752.getClass(), "requestBodySub", term14843);
        setField(term14752, term14752.getClass(), "schemeName", "RlyxtfCqKY");
        setField(term14752, term14752.getClass(), "schemeNameSub", term14857);
        setField(term14752, term14752.getClass(), "uriPath", "kyTUkLCRYm");
        setField(term14752, term14752.getClass(), "uriPathSub", term14871);
        setField(term14752, term14752.getClass(), "name", "oAotZgNUFH");
        setField(term14752, term14752.getClass(), "title", "TowhQcovXu");
        setField(term14752, term14752.getClass(), "description", "UFGOnIMOzf");
        setField(term14752, term14752.getClass(), "state", "ySiyRlAQpt");
        setField(term14752, term14752.getClass(), "stepNumber", "MiankJgKCp");
        setField(term14752, term14752.getClass(), "optional", term14933);
        setField(term14752, term14752.getClass(), "autoEnable", term14935);
        setField(term14752, term14752.getClass(), "prereqStep", term14937);
        setField(term14752, term14752.getClass(), "userDefined", term15001);
        setField(term14752, term14752.getClass(), "runAsUser", "BqxRCYZwmn");
        setField(term14752, term14752.getClass(), "runAsUserDynamic", term15015);
        setField(term14752, term14752.getClass(), "isRestStep", term15017);
        setField(term14752, term14752.getClass(), "owner", "KHPDZjrXQp");
        setField(term14752, term14752.getClass(), "assignees", "fpyUFzdCwQ");
        setField(term14752, term14752.getClass(), "skills", "OQqBkSGDem");
        setField(term14752, term14752.getClass(), "weight", "vZzZOvsIYn");
        setField(term14752, term14752.getClass(), "hasCalledWorkflow", term15067);
        setField(term14752, term14752.getClass(), "isConditionStep", term15069);
        setField(term14752, term14752.getClass(), "steps", term15071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestBodySub", argTypes, term14752, args);
    }

};


