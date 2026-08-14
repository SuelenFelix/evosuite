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

public class WorkflowVariableDefinition_getDecimalPlaces_20475170028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22290;

    public WorkflowVariableDefinition_getDecimalPlaces_20475170028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22339 = new ArrayList();
        ((ArrayList) term22339).add("bacruLIvDW");
        ((ArrayList) term22339).add("ydbVEuslYx");
        ((ArrayList) term22339).add("DKWEhukBpG");
        ((ArrayList) term22339).add("YaowqyqxBH");
        ((ArrayList) term22339).add("dbxhsKyZWZ");
        Integer term22403 = new Integer(1622346318);
        Boolean term22429 = new Boolean(true);
        Integer term22431 = new Integer(1048535127);
        Integer term22445 = new Integer(-655067527);
        Boolean term22459 = new Boolean(false);
        Boolean term22473 = new Boolean(true);
        Boolean term22499 = new Boolean(true);
        term22290 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term22290, term22290.getClass(), "name", "kAbILlhsZw");
        setField(term22290, term22290.getClass(), "scope", "QsIOCSpRow");
        setField(term22290, term22290.getClass(), "abstractInfo", "gcFzvYOUch");
        setField(term22290, term22290.getClass(), "category", "NnFSMXLOUA");
        setField(term22290, term22290.getClass(), "choice", term22339);
        setField(term22290, term22290.getClass(), "decimalPlaces", term22403);
        setField(term22290, term22290.getClass(), "defaultValue", "oXxafKyyrx");
        setField(term22290, term22290.getClass(), "description", "TapDFGQNLY");
        setField(term22290, term22290.getClass(), "exposeToUser", term22429);
        setField(term22290, term22290.getClass(), "maxLength", term22431);
        setField(term22290, term22290.getClass(), "maxValue", "vgHeAegSfV");
        setField(term22290, term22290.getClass(), "minLength", term22445);
        setField(term22290, term22290.getClass(), "minValue", "qShfKMgKGs");
        setField(term22290, term22290.getClass(), "promptAtCreate", term22459);
        setField(term22290, term22290.getClass(), "regularExpression", "bLCaDnEUyS");
        setField(term22290, term22290.getClass(), "requiredAtCreate", term22473);
        setField(term22290, term22290.getClass(), "type", "yfHcOCDrGy");
        setField(term22290, term22290.getClass(), "validationType", "juKqILstcn");
        setField(term22290, term22290.getClass(), "valueMustBeChoice", term22499);
        setField(term22290, term22290.getClass(), "visibility", "QSCQJRyiPa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecimalPlaces", argTypes, term22290, args);
    }

};


