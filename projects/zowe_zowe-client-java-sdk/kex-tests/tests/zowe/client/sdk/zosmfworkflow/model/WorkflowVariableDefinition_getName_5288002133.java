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

public class WorkflowVariableDefinition_getName_5288002133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20523;

    public WorkflowVariableDefinition_getName_5288002133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20572 = new ArrayList();
        ((ArrayList) term20572).add("UxVfWaXiSr");
        ((ArrayList) term20572).add("yTrvklotrs");
        ((ArrayList) term20572).add("kNkFIdfwqs");
        ((ArrayList) term20572).add("sHLdqoTjnP");
        Integer term20624 = new Integer(391863371);
        Boolean term20650 = new Boolean(false);
        Integer term20652 = new Integer(-1922583790);
        Integer term20666 = new Integer(-616727354);
        Boolean term20680 = new Boolean(false);
        Boolean term20694 = new Boolean(true);
        Boolean term20720 = new Boolean(false);
        term20523 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term20523, term20523.getClass(), "name", "siRXAywvyp");
        setField(term20523, term20523.getClass(), "scope", "ZRLaReQeFg");
        setField(term20523, term20523.getClass(), "abstractInfo", "cOcXspUxKR");
        setField(term20523, term20523.getClass(), "category", "JNzgWUmqtl");
        setField(term20523, term20523.getClass(), "choice", term20572);
        setField(term20523, term20523.getClass(), "decimalPlaces", term20624);
        setField(term20523, term20523.getClass(), "defaultValue", "UakuVGzEav");
        setField(term20523, term20523.getClass(), "description", "DxiwTTouEo");
        setField(term20523, term20523.getClass(), "exposeToUser", term20650);
        setField(term20523, term20523.getClass(), "maxLength", term20652);
        setField(term20523, term20523.getClass(), "maxValue", "ghoklPMuMt");
        setField(term20523, term20523.getClass(), "minLength", term20666);
        setField(term20523, term20523.getClass(), "minValue", "uAgfQbLPeZ");
        setField(term20523, term20523.getClass(), "promptAtCreate", term20680);
        setField(term20523, term20523.getClass(), "regularExpression", "aZiFZfzhQT");
        setField(term20523, term20523.getClass(), "requiredAtCreate", term20694);
        setField(term20523, term20523.getClass(), "type", "HbzAbCwWRh");
        setField(term20523, term20523.getClass(), "validationType", "yBgWgFtVxP");
        setField(term20523, term20523.getClass(), "valueMustBeChoice", term20720);
        setField(term20523, term20523.getClass(), "visibility", "NAwiEDVBcB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term20523, args);
    }

};


