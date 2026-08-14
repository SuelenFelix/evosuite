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

public class WorkflowListResponse_getWorkflowDescription_17003818193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;

    public WorkflowListResponse_getWorkflowDescription_17003818193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse"));
        setField(term663, term663.getClass(), "workflowName", "OWDIEULEFu");
        setField(term663, term663.getClass(), "workflowKey", "dWRymuLBtr");
        setField(term663, term663.getClass(), "workflowDescription", "AijpHYOFuy");
        setField(term663, term663.getClass(), "workflowID", "SbAoxhfrkn");
        setField(term663, term663.getClass(), "workflowVersion", "kuTXqwMtDB");
        setField(term663, term663.getClass(), "workflowDefinitionFileMD5Value", "Ghbwtircqb");
        setField(term663, term663.getClass(), "instanceURI", "xrwlQZdwCp");
        setField(term663, term663.getClass(), "owner", "IDCWpPLRkE");
        setField(term663, term663.getClass(), "vendor", "nyiiPDVjAc");
        setField(term663, term663.getClass(), "access", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.response.WorkflowListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkflowDescription", argTypes, term663, args);
    }

};


