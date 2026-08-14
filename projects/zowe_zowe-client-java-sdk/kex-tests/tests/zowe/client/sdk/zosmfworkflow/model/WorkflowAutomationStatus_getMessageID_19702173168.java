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
import java.lang.Long;

public class WorkflowAutomationStatus_getMessageID_19702173168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29427;

    public WorkflowAutomationStatus_getMessageID_19702173168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29440 = new Long(-5476826692763582090L);
        Long term29442 = new Long(-872011222785455006L);
        term29427 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29427, term29427.getClass(), "startUser", "hxHKgOYyQD");
        setField(term29427, term29427.getClass(), "startedTime", term29440);
        setField(term29427, term29427.getClass(), "stoppedTime", term29442);
        setField(term29427, term29427.getClass(), "currentStepName", "opEyNuSzgs");
        setField(term29427, term29427.getClass(), "currentStepNumber", "YTnlgdIqfA");
        setField(term29427, term29427.getClass(), "currentStepTitle", "gcKmFclftu");
        setField(term29427, term29427.getClass(), "messageID", "lfREOBPEuD");
        setField(term29427, term29427.getClass(), "messageText", "JAGjDlTwTa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageID", argTypes, term29427, args);
    }

};


