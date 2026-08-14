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

public class WorkflowAutomationStatus_toString_131846460410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29701;

    public WorkflowAutomationStatus_toString_131846460410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29714 = new Long(-6573104506744284592L);
        Long term29716 = new Long(-4920224193275732920L);
        term29701 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29701, term29701.getClass(), "startUser", "CFojehEtAR");
        setField(term29701, term29701.getClass(), "startedTime", term29714);
        setField(term29701, term29701.getClass(), "stoppedTime", term29716);
        setField(term29701, term29701.getClass(), "currentStepName", "EYeLeoxDrM");
        setField(term29701, term29701.getClass(), "currentStepNumber", "zIPJJJubgX");
        setField(term29701, term29701.getClass(), "currentStepTitle", "WRbxmSFTaO");
        setField(term29701, term29701.getClass(), "messageID", "ZekQCuvPXT");
        setField(term29701, term29701.getClass(), "messageText", "GUXdlpmVNQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29701, args);
    }

};


