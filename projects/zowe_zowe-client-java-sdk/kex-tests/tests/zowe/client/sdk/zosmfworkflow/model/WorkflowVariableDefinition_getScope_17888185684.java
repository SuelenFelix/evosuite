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

public class WorkflowVariableDefinition_getScope_17888185684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20894;

    public WorkflowVariableDefinition_getScope_17888185684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20943 = new ArrayList();
        ((ArrayList) term20943).add("JvKKIGdUWh");
        ((ArrayList) term20943).add("DInvDrzBtt");
        ((ArrayList) term20943).add("igZJubDPuK");
        ((ArrayList) term20943).add("qxBdFhLbAN");
        ((ArrayList) term20943).add("KyUmXHRrED");
        ((ArrayList) term20943).add("eOMBFVrNcf");
        ((ArrayList) term20943).add("gOwOIsocMB");
        ((ArrayList) term20943).add("GqTBOhQBgV");
        Integer term21043 = new Integer(-1955890973);
        Boolean term21069 = new Boolean(false);
        Integer term21071 = new Integer(-2038273078);
        Integer term21085 = new Integer(1227103734);
        Boolean term21099 = new Boolean(false);
        Boolean term21113 = new Boolean(false);
        Boolean term21139 = new Boolean(true);
        term20894 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition"));
        setField(term20894, term20894.getClass(), "name", "jxuVQHHLqy");
        setField(term20894, term20894.getClass(), "scope", "TnUXNtKOns");
        setField(term20894, term20894.getClass(), "abstractInfo", "umsYdaPflb");
        setField(term20894, term20894.getClass(), "category", "CnNmpSyiBE");
        setField(term20894, term20894.getClass(), "choice", term20943);
        setField(term20894, term20894.getClass(), "decimalPlaces", term21043);
        setField(term20894, term20894.getClass(), "defaultValue", "DQhxOWqEyi");
        setField(term20894, term20894.getClass(), "description", "dSszYGDwAk");
        setField(term20894, term20894.getClass(), "exposeToUser", term21069);
        setField(term20894, term20894.getClass(), "maxLength", term21071);
        setField(term20894, term20894.getClass(), "maxValue", "gNeMyGSVIG");
        setField(term20894, term20894.getClass(), "minLength", term21085);
        setField(term20894, term20894.getClass(), "minValue", "qxEkaqdKPG");
        setField(term20894, term20894.getClass(), "promptAtCreate", term21099);
        setField(term20894, term20894.getClass(), "regularExpression", "VclIptmKrF");
        setField(term20894, term20894.getClass(), "requiredAtCreate", term21113);
        setField(term20894, term20894.getClass(), "type", "wcTeSHCZwz");
        setField(term20894, term20894.getClass(), "validationType", "fxxnbYOiZZ");
        setField(term20894, term20894.getClass(), "valueMustBeChoice", term21139);
        setField(term20894, term20894.getClass(), "visibility", "CTnRYaYXia");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowVariableDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term20894, args);
    }

};


