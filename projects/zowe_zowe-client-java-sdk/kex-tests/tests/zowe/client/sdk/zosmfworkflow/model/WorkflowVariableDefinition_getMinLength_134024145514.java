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
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class WorkflowVariableDefinition_getMinLength_134024145514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24516;

    public WorkflowVariableDefinition_getMinLength_134024145514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24565 = new ArrayList();
        ((ArrayList) term24565).add("XiAUBffMZP");
        ((ArrayList) term24565).add("pkfsHvqODq");
        Integer term24593 = new Integer(-1530420153);
        Boolean term24619 = new Boolean(false);
        Integer term24621 = new Integer(-469968304);
        Integer term24635 = new Integer(-1145578966);
        Boolean term24649 = new Boolean(false);
        Boolean term24663 = new Boolean(false);
        Boolean term24689 = new Boolean(false);
        term24516 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term24516, term24516.getClass(), "name", "mJrFDaDdyY");
        setField(term24516, term24516.getClass(), "scope", "HqyBQNuLnz");
        setField(term24516, term24516.getClass(), "abstractInfo", "xWkZKbrvmX");
        setField(term24516, term24516.getClass(), "category", "PTEWoxLNqQ");
        setField(term24516, term24516.getClass(), "choice", term24565);
        setField(term24516, term24516.getClass(), "decimalPlaces", term24593);
        setField(term24516, term24516.getClass(), "defaultValue", "OoRBUdwown");
        setField(term24516, term24516.getClass(), "description", "lSidZunNtu");
        setField(term24516, term24516.getClass(), "exposeToUser", term24619);
        setField(term24516, term24516.getClass(), "maxLength", term24621);
        setField(term24516, term24516.getClass(), "maxValue", "TLUhUnoanK");
        setField(term24516, term24516.getClass(), "minLength", term24635);
        setField(term24516, term24516.getClass(), "minValue", "JXyQTIyIrU");
        setField(term24516, term24516.getClass(), "promptAtCreate", term24649);
        setField(term24516, term24516.getClass(), "regularExpression", "uplmRQRGWr");
        setField(term24516, term24516.getClass(), "requiredAtCreate", term24663);
        setField(term24516, term24516.getClass(), "type", "ZEmNnaQFYB");
        setField(term24516, term24516.getClass(), "validationType", "FNxFpCZxLW");
        setField(term24516, term24516.getClass(), "valueMustBeChoice", term24689);
        setField(term24516, term24516.getClass(), "visibility", "sXMXSCUbRu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinLength", argTypes, term24516, args);
    }

};


