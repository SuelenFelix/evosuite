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

public class WorkflowVariableDefinition_getType_33477143019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26481;

    public WorkflowVariableDefinition_getType_33477143019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26530 = new ArrayList();
        ((ArrayList) term26530).add("ltTwdndtbe");
        ((ArrayList) term26530).add("XaldiIeyMi");
        ((ArrayList) term26530).add("lkujDCFpdm");
        Integer term26570 = new Integer(454281060);
        Boolean term26596 = new Boolean(true);
        Integer term26598 = new Integer(-1786399638);
        Integer term26612 = new Integer(2055867847);
        Boolean term26626 = new Boolean(false);
        Boolean term26640 = new Boolean(true);
        Boolean term26666 = new Boolean(false);
        term26481 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term26481, term26481.getClass(), "name", "ZybsWgYCUR");
        setField(term26481, term26481.getClass(), "scope", "YZNLZnNFNI");
        setField(term26481, term26481.getClass(), "abstractInfo", "uHcUlIseio");
        setField(term26481, term26481.getClass(), "category", "bsmWXOcLZJ");
        setField(term26481, term26481.getClass(), "choice", term26530);
        setField(term26481, term26481.getClass(), "decimalPlaces", term26570);
        setField(term26481, term26481.getClass(), "defaultValue", "sGfzmhpQEH");
        setField(term26481, term26481.getClass(), "description", "FqGkFGXAbg");
        setField(term26481, term26481.getClass(), "exposeToUser", term26596);
        setField(term26481, term26481.getClass(), "maxLength", term26598);
        setField(term26481, term26481.getClass(), "maxValue", "SSWEZgFiFO");
        setField(term26481, term26481.getClass(), "minLength", term26612);
        setField(term26481, term26481.getClass(), "minValue", "spphrCslQA");
        setField(term26481, term26481.getClass(), "promptAtCreate", term26626);
        setField(term26481, term26481.getClass(), "regularExpression", "EPkEFVlZrY");
        setField(term26481, term26481.getClass(), "requiredAtCreate", term26640);
        setField(term26481, term26481.getClass(), "type", "jySnpYEVPv");
        setField(term26481, term26481.getClass(), "validationType", "VdHqujFzSo");
        setField(term26481, term26481.getClass(), "valueMustBeChoice", term26666);
        setField(term26481, term26481.getClass(), "visibility", "cZbOKEdKPs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term26481, args);
    }

};


