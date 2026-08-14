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

public class WorkflowRestStepInfo_getSchemeNameSub_96167137213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15856;

    public WorkflowRestStepInfo_getSchemeNameSub_96167137213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term15893 = new Boolean(true);
        Boolean term15919 = new Boolean(false);
        Boolean term15933 = new Boolean(false);
        Boolean term15947 = new Boolean(true);
        Boolean term15961 = new Boolean(true);
        Boolean term15975 = new Boolean(true);
        Boolean term16037 = new Boolean(false);
        Boolean term16039 = new Boolean(true);
        ArrayList term16041 = new ArrayList();
        ((ArrayList) term16041).add("iQCLduwSPi");
        ((ArrayList) term16041).add("ZcODLNhxqg");
        ((ArrayList) term16041).add("iNtHOROBMq");
        ((ArrayList) term16041).add("GbvfbbsrOl");
        ((ArrayList) term16041).add("IIZlqzOmtY");
        ((ArrayList) term16041).add("iRFRSxtnkr");
        Boolean term16117 = new Boolean(true);
        Boolean term16131 = new Boolean(false);
        Boolean term16133 = new Boolean(false);
        Boolean term16183 = new Boolean(true);
        Boolean term16185 = new Boolean(false);
        ArrayList term16187 = new ArrayList();
        term15856 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo"));
        setField(term15856, term15856.getClass(), "actualStatusCode", "dUXsPNSUez");
        setField(term15856, term15856.getClass(), "expectedStatusCode", "PxGDfPOAFS");
        setField(term15856, term15856.getClass(), "hostname", "dZVxzYEeZe");
        setField(term15856, term15856.getClass(), "hostnameSub", term15893);
        setField(term15856, term15856.getClass(), "httpMethod", "TnCQRmzwPf");
        setField(term15856, term15856.getClass(), "port", "ZGnUKGTWCn");
        setField(term15856, term15856.getClass(), "portSub", term15919);
        setField(term15856, term15856.getClass(), "queryParameters", "cHRLXsgRzr");
        setField(term15856, term15856.getClass(), "queryParametersSub", term15933);
        setField(term15856, term15856.getClass(), "requestBody", "QpqQKmCtoC");
        setField(term15856, term15856.getClass(), "requestBodySub", term15947);
        setField(term15856, term15856.getClass(), "schemeName", "AYRvbRJxWI");
        setField(term15856, term15856.getClass(), "schemeNameSub", term15961);
        setField(term15856, term15856.getClass(), "uriPath", "MGNiaVqEDc");
        setField(term15856, term15856.getClass(), "uriPathSub", term15975);
        setField(term15856, term15856.getClass(), "name", "qeVNCFrTbT");
        setField(term15856, term15856.getClass(), "title", "sreEtRBWQl");
        setField(term15856, term15856.getClass(), "description", "UKQejaeJWY");
        setField(term15856, term15856.getClass(), "state", "lNbVasLAKL");
        setField(term15856, term15856.getClass(), "stepNumber", "wKeyHBCSLZ");
        setField(term15856, term15856.getClass(), "optional", term16037);
        setField(term15856, term15856.getClass(), "autoEnable", term16039);
        setField(term15856, term15856.getClass(), "prereqStep", term16041);
        setField(term15856, term15856.getClass(), "userDefined", term16117);
        setField(term15856, term15856.getClass(), "runAsUser", "iGWkLjLGBY");
        setField(term15856, term15856.getClass(), "runAsUserDynamic", term16131);
        setField(term15856, term15856.getClass(), "isRestStep", term16133);
        setField(term15856, term15856.getClass(), "owner", "jUkXaNkoAg");
        setField(term15856, term15856.getClass(), "assignees", "mZsPsRzyhQ");
        setField(term15856, term15856.getClass(), "skills", "IExlbTemvJ");
        setField(term15856, term15856.getClass(), "weight", "zaljyXXCoy");
        setField(term15856, term15856.getClass(), "hasCalledWorkflow", term16183);
        setField(term15856, term15856.getClass(), "isConditionStep", term16185);
        setField(term15856, term15856.getClass(), "steps", term16187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowRestStepInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemeNameSub", argTypes, term15856, args);
    }

};


