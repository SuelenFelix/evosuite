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

public class WorkflowVariableDefinition_getVisibility_205949963422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27660;

    public WorkflowVariableDefinition_getVisibility_205949963422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27709 = new ArrayList();
        ((ArrayList) term27709).add("YNXFGgstqj");
        ((ArrayList) term27709).add("xZTWqxWsAc");
        ((ArrayList) term27709).add("sWchglYniO");
        ((ArrayList) term27709).add("lohegbXyjA");
        ((ArrayList) term27709).add("HlddItIexw");
        Integer term27773 = new Integer(1596070772);
        Boolean term27799 = new Boolean(false);
        Integer term27801 = new Integer(97029295);
        Integer term27815 = new Integer(-1371869594);
        Boolean term27829 = new Boolean(false);
        Boolean term27843 = new Boolean(true);
        Boolean term27869 = new Boolean(false);
        term27660 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term27660, term27660.getClass(), "name", "iHtqLPNWTt");
        setField(term27660, term27660.getClass(), "scope", "TQgECVDMEf");
        setField(term27660, term27660.getClass(), "abstractInfo", "KIBOVYItqe");
        setField(term27660, term27660.getClass(), "category", "GUztJeVeCc");
        setField(term27660, term27660.getClass(), "choice", term27709);
        setField(term27660, term27660.getClass(), "decimalPlaces", term27773);
        setField(term27660, term27660.getClass(), "defaultValue", "HnpLvemmRI");
        setField(term27660, term27660.getClass(), "description", "dHrIcaTbcS");
        setField(term27660, term27660.getClass(), "exposeToUser", term27799);
        setField(term27660, term27660.getClass(), "maxLength", term27801);
        setField(term27660, term27660.getClass(), "maxValue", "tAqyToqusS");
        setField(term27660, term27660.getClass(), "minLength", term27815);
        setField(term27660, term27660.getClass(), "minValue", "MwiFLgdSDA");
        setField(term27660, term27660.getClass(), "promptAtCreate", term27829);
        setField(term27660, term27660.getClass(), "regularExpression", "VhnistEcCA");
        setField(term27660, term27660.getClass(), "requiredAtCreate", term27843);
        setField(term27660, term27660.getClass(), "type", "hlPKLObFBU");
        setField(term27660, term27660.getClass(), "validationType", "oNGVAyjCob");
        setField(term27660, term27660.getClass(), "valueMustBeChoice", term27869);
        setField(term27660, term27660.getClass(), "visibility", "lzqPLDonds");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVisibility", argTypes, term27660, args);
    }

};


