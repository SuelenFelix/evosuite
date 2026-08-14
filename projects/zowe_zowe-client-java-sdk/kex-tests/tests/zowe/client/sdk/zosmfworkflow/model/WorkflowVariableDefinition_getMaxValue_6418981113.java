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

public class WorkflowVariableDefinition_getMaxValue_6418981113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24057;

    public WorkflowVariableDefinition_getMaxValue_6418981113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24106 = new ArrayList();
        ((ArrayList) term24106).add("YsWgGEhEmC");
        ((ArrayList) term24106).add("PBcepqkBBV");
        ((ArrayList) term24106).add("mukHRKZmND");
        ((ArrayList) term24106).add("WVPSokrFPV");
        ((ArrayList) term24106).add("jELmrpQCNf");
        ((ArrayList) term24106).add("NkjAcBXmmT");
        ((ArrayList) term24106).add("KgtGJGInhu");
        ((ArrayList) term24106).add("mVHDjrsMAV");
        Integer term24206 = new Integer(-226514366);
        Boolean term24232 = new Boolean(true);
        Integer term24234 = new Integer(1193880199);
        Integer term24248 = new Integer(-1087774327);
        Boolean term24262 = new Boolean(true);
        Boolean term24276 = new Boolean(false);
        Boolean term24302 = new Boolean(false);
        term24057 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term24057, term24057.getClass(), "name", "oTqQEKklHi");
        setField(term24057, term24057.getClass(), "scope", "riyKkxMvWm");
        setField(term24057, term24057.getClass(), "abstractInfo", "WENnGcBSTd");
        setField(term24057, term24057.getClass(), "category", "juEYcOCxLW");
        setField(term24057, term24057.getClass(), "choice", term24106);
        setField(term24057, term24057.getClass(), "decimalPlaces", term24206);
        setField(term24057, term24057.getClass(), "defaultValue", "rjWnqcjYuU");
        setField(term24057, term24057.getClass(), "description", "JhszTkUWCg");
        setField(term24057, term24057.getClass(), "exposeToUser", term24232);
        setField(term24057, term24057.getClass(), "maxLength", term24234);
        setField(term24057, term24057.getClass(), "maxValue", "gfNPCeiULY");
        setField(term24057, term24057.getClass(), "minLength", term24248);
        setField(term24057, term24057.getClass(), "minValue", "aUJLXfcWME");
        setField(term24057, term24057.getClass(), "promptAtCreate", term24262);
        setField(term24057, term24057.getClass(), "regularExpression", "ixeIpUaVug");
        setField(term24057, term24057.getClass(), "requiredAtCreate", term24276);
        setField(term24057, term24057.getClass(), "type", "TELyWFMBJv");
        setField(term24057, term24057.getClass(), "validationType", "bIqbgRdzpB");
        setField(term24057, term24057.getClass(), "valueMustBeChoice", term24302);
        setField(term24057, term24057.getClass(), "visibility", "FIUbHJmAEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxValue", argTypes, term24057, args);
    }

};


