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

public class WorkflowRestStepInfo_getRequestBody_101376223410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14167;

    public WorkflowRestStepInfo_getRequestBody_101376223410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term14204 = new Boolean(false);
        Boolean term14230 = new Boolean(true);
        Boolean term14244 = new Boolean(false);
        Boolean term14258 = new Boolean(false);
        Boolean term14272 = new Boolean(true);
        Boolean term14286 = new Boolean(true);
        Boolean term14348 = new Boolean(false);
        Boolean term14350 = new Boolean(true);
        ArrayList term14352 = new ArrayList();
        ((ArrayList) term14352).add("lkPJVVXhDd");
        ((ArrayList) term14352).add("OpMnUyJTrb");
        ((ArrayList) term14352).add("ACBGZgugev");
        ((ArrayList) term14352).add("rcbQDpUkab");
        ((ArrayList) term14352).add("oZAbUeXmhW");
        ((ArrayList) term14352).add("NDSDpOeQda");
        Boolean term14428 = new Boolean(false);
        Boolean term14442 = new Boolean(true);
        Boolean term14444 = new Boolean(false);
        Boolean term14494 = new Boolean(false);
        Boolean term14496 = new Boolean(true);
        ArrayList term14498 = new ArrayList();
        ((ArrayList) term14498).add((Object)null);
        ((ArrayList) term14498).add((Object)null);
        ((ArrayList) term14498).add((Object)null);
        ((ArrayList) term14498).add((Object)null);
        term14167 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term14167, term14167.getClass(), "actualStatusCode", "govbBrRstA");
        setField(term14167, term14167.getClass(), "expectedStatusCode", "zSMUNzRRyM");
        setField(term14167, term14167.getClass(), "hostname", "aKwJiIZSjJ");
        setField(term14167, term14167.getClass(), "hostnameSub", term14204);
        setField(term14167, term14167.getClass(), "httpMethod", "lYbeaINKud");
        setField(term14167, term14167.getClass(), "port", "BrwuUkkatt");
        setField(term14167, term14167.getClass(), "portSub", term14230);
        setField(term14167, term14167.getClass(), "queryParameters", "NjmSJhbVEM");
        setField(term14167, term14167.getClass(), "queryParametersSub", term14244);
        setField(term14167, term14167.getClass(), "requestBody", "aftnGRjhKN");
        setField(term14167, term14167.getClass(), "requestBodySub", term14258);
        setField(term14167, term14167.getClass(), "schemeName", "TirWkyiCHh");
        setField(term14167, term14167.getClass(), "schemeNameSub", term14272);
        setField(term14167, term14167.getClass(), "uriPath", "lsQrIFMkgZ");
        setField(term14167, term14167.getClass(), "uriPathSub", term14286);
        setField(term14167, term14167.getClass(), "name", "VgAyBhgBhq");
        setField(term14167, term14167.getClass(), "title", "nhpssUKjpK");
        setField(term14167, term14167.getClass(), "description", "lnJVsFNsCN");
        setField(term14167, term14167.getClass(), "state", "CUagRkEuzN");
        setField(term14167, term14167.getClass(), "stepNumber", "eWIWfWobXm");
        setField(term14167, term14167.getClass(), "optional", term14348);
        setField(term14167, term14167.getClass(), "autoEnable", term14350);
        setField(term14167, term14167.getClass(), "prereqStep", term14352);
        setField(term14167, term14167.getClass(), "userDefined", term14428);
        setField(term14167, term14167.getClass(), "runAsUser", "HlKwxzAqTg");
        setField(term14167, term14167.getClass(), "runAsUserDynamic", term14442);
        setField(term14167, term14167.getClass(), "isRestStep", term14444);
        setField(term14167, term14167.getClass(), "owner", "xKjkdjTYfe");
        setField(term14167, term14167.getClass(), "assignees", "HcfabJkuEQ");
        setField(term14167, term14167.getClass(), "skills", "JlnoFYxLfk");
        setField(term14167, term14167.getClass(), "weight", "tMMLkDkFYW");
        setField(term14167, term14167.getClass(), "hasCalledWorkflow", term14494);
        setField(term14167, term14167.getClass(), "isConditionStep", term14496);
        setField(term14167, term14167.getClass(), "steps", term14498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestBody", argTypes, term14167, args);
    }

};


