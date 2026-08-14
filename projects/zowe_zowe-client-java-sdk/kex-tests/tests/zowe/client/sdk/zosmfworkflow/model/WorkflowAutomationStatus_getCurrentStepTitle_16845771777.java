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

public class WorkflowAutomationStatus_getCurrentStepTitle_16845771777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29290;

    public WorkflowAutomationStatus_getCurrentStepTitle_16845771777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29303 = new Long(-4325723315152823407L);
        Long term29305 = new Long(2535595959091595249L);
        term29290 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus"));
        setField(term29290, term29290.getClass(), "startUser", "DfKWXfTINQ");
        setField(term29290, term29290.getClass(), "startedTime", term29303);
        setField(term29290, term29290.getClass(), "stoppedTime", term29305);
        setField(term29290, term29290.getClass(), "currentStepName", "KqusFIxuyo");
        setField(term29290, term29290.getClass(), "currentStepNumber", "CDpvEYMuDg");
        setField(term29290, term29290.getClass(), "currentStepTitle", "YaZCAiIUPe");
        setField(term29290, term29290.getClass(), "messageID", "KsCWHUcJDd");
        setField(term29290, term29290.getClass(), "messageText", "zkYsnzzwJu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowAutomationStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentStepTitle", argTypes, term29290, args);
    }

};


