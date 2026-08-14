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

public class WorkflowListResponse_getAccess_28849162410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210;

    public WorkflowListResponse_getAccess_28849162410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2210 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term2210, term2210.getClass(), "workflowName", "SPpkrGcPRr");
        setField(term2210, term2210.getClass(), "workflowKey", "sEccwbJKYE");
        setField(term2210, term2210.getClass(), "workflowDescription", "AWRooQKkdW");
        setField(term2210, term2210.getClass(), "workflowID", "vjxIhXHxGR");
        setField(term2210, term2210.getClass(), "workflowVersion", "QXzGXbEXMu");
        setField(term2210, term2210.getClass(), "workflowDefinitionFileMD5Value", "qxSDVejjiY");
        setField(term2210, term2210.getClass(), "instanceURI", "xBsXSDjXYK");
        setField(term2210, term2210.getClass(), "owner", "sEnIVFtZuQ");
        setField(term2210, term2210.getClass(), "vendor", "ZVecLZMLHF");
        setField(term2210, term2210.getClass(), "access", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccess", argTypes, term2210, args);
    }

};


