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

public class WorkflowVariableDefinition_getExposeToUser_107228885711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23425;

    public WorkflowVariableDefinition_getExposeToUser_107228885711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23474 = new ArrayList();
        ((ArrayList) term23474).add("oVkgUUfHis");
        Integer term23490 = new Integer(865208305);
        Boolean term23516 = new Boolean(false);
        Integer term23518 = new Integer(-1275173084);
        Integer term23532 = new Integer(-244121226);
        Boolean term23546 = new Boolean(false);
        Boolean term23560 = new Boolean(false);
        Boolean term23586 = new Boolean(false);
        term23425 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term23425, term23425.getClass(), "name", "bMQUwQqyMc");
        setField(term23425, term23425.getClass(), "scope", "CVaGhXmAUN");
        setField(term23425, term23425.getClass(), "abstractInfo", "KnclcuNYRb");
        setField(term23425, term23425.getClass(), "category", "UDZJbJPmCC");
        setField(term23425, term23425.getClass(), "choice", term23474);
        setField(term23425, term23425.getClass(), "decimalPlaces", term23490);
        setField(term23425, term23425.getClass(), "defaultValue", "hoCKQzIOhx");
        setField(term23425, term23425.getClass(), "description", "znUxTdEvUD");
        setField(term23425, term23425.getClass(), "exposeToUser", term23516);
        setField(term23425, term23425.getClass(), "maxLength", term23518);
        setField(term23425, term23425.getClass(), "maxValue", "PvtJhtGffh");
        setField(term23425, term23425.getClass(), "minLength", term23532);
        setField(term23425, term23425.getClass(), "minValue", "KReGJTSQuY");
        setField(term23425, term23425.getClass(), "promptAtCreate", term23546);
        setField(term23425, term23425.getClass(), "regularExpression", "hqZmoXoMuS");
        setField(term23425, term23425.getClass(), "requiredAtCreate", term23560);
        setField(term23425, term23425.getClass(), "type", "PUPJWadLXP");
        setField(term23425, term23425.getClass(), "validationType", "TBNsemBBKA");
        setField(term23425, term23425.getClass(), "valueMustBeChoice", term23586);
        setField(term23425, term23425.getClass(), "visibility", "DpNDxwXKkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExposeToUser", argTypes, term23425, args);
    }

};


