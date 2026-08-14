package zowe.client.sdk.zosmfworkflow.response;

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
import static zowe.client.sdk.zosmfworkflow.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkflowListResponse_getOwner_2378231098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1768;

    public WorkflowListResponse_getOwner_2378231098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1768 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term1768, term1768.getClass(), "workflowName", "idgaQsnJpQ");
        setField(term1768, term1768.getClass(), "workflowKey", "VgZnGoIFwQ");
        setField(term1768, term1768.getClass(), "workflowDescription", "jUbSRrkrYZ");
        setField(term1768, term1768.getClass(), "workflowID", "bWWfajKbEX");
        setField(term1768, term1768.getClass(), "workflowVersion", "cAPeiZHKGJ");
        setField(term1768, term1768.getClass(), "workflowDefinitionFileMD5Value", "LvJFtLBaxj");
        setField(term1768, term1768.getClass(), "instanceURI", "PHvxnGHptP");
        setField(term1768, term1768.getClass(), "owner", "TimdotUuNC");
        setField(term1768, term1768.getClass(), "vendor", "PkWMRdJcBb");
        setField(term1768, term1768.getClass(), "access", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwner", argTypes, term1768, args);
    }

};


