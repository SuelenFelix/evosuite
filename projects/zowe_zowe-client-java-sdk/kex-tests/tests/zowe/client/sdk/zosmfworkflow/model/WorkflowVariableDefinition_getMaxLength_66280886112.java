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

public class WorkflowVariableDefinition_getMaxLength_66280886112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23730;

    public WorkflowVariableDefinition_getMaxLength_66280886112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23779 = new ArrayList();
        ((ArrayList) term23779).add("skVZETaBKX");
        ((ArrayList) term23779).add("jcJNIBACPb");
        Integer term23807 = new Integer(-203030934);
        Boolean term23833 = new Boolean(true);
        Integer term23835 = new Integer(-1179120542);
        Integer term23849 = new Integer(-73683645);
        Boolean term23863 = new Boolean(false);
        Boolean term23877 = new Boolean(true);
        Boolean term23903 = new Boolean(false);
        term23730 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term23730, term23730.getClass(), "name", "uxoFwkPfXf");
        setField(term23730, term23730.getClass(), "scope", "OoVnZTvxUt");
        setField(term23730, term23730.getClass(), "abstractInfo", "MnqnyndkhF");
        setField(term23730, term23730.getClass(), "category", "MZzoPKpFlh");
        setField(term23730, term23730.getClass(), "choice", term23779);
        setField(term23730, term23730.getClass(), "decimalPlaces", term23807);
        setField(term23730, term23730.getClass(), "defaultValue", "mPQmjoknqi");
        setField(term23730, term23730.getClass(), "description", "gLgvePQRQT");
        setField(term23730, term23730.getClass(), "exposeToUser", term23833);
        setField(term23730, term23730.getClass(), "maxLength", term23835);
        setField(term23730, term23730.getClass(), "maxValue", "SCmsfHIEPK");
        setField(term23730, term23730.getClass(), "minLength", term23849);
        setField(term23730, term23730.getClass(), "minValue", "dFOuezLNWb");
        setField(term23730, term23730.getClass(), "promptAtCreate", term23863);
        setField(term23730, term23730.getClass(), "regularExpression", "PUWJnLuyiR");
        setField(term23730, term23730.getClass(), "requiredAtCreate", term23877);
        setField(term23730, term23730.getClass(), "type", "ADhJCRgHaS");
        setField(term23730, term23730.getClass(), "validationType", "qociGUMzem");
        setField(term23730, term23730.getClass(), "valueMustBeChoice", term23903);
        setField(term23730, term23730.getClass(), "visibility", "HHAfSjIdNi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLength", argTypes, term23730, args);
    }

};


