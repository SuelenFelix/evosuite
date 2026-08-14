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
import java.lang.Boolean;
import java.lang.Object;

public class WorkflowStepDefinition_getOptional_9252977617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1777;

    public WorkflowStepDefinition_getOptional_9252977617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1814 = new ArrayList();
        ((ArrayList) term1814).add("MQUTfIiFnh");
        ((ArrayList) term1814).add("JeyKRznnft");
        ((ArrayList) term1814).add("vQJUCtuYpK");
        ((ArrayList) term1814).add("GHtOeztAdz");
        ((ArrayList) term1814).add("gSAtqakaLY");
        Boolean term1878 = new Boolean(true);
        ArrayList term1886 = new ArrayList();
        ((ArrayList) term1886).add((Object)null);
        ((ArrayList) term1886).add((Object)null);
        ((ArrayList) term1886).add((Object)null);
        Boolean term1889 = new Boolean(false);
        ArrayList term1891 = new ArrayList();
        ((ArrayList) term1891).add((Object)null);
        ((ArrayList) term1891).add((Object)null);
        ((ArrayList) term1891).add((Object)null);
        ((ArrayList) term1891).add((Object)null);
        ((ArrayList) term1891).add((Object)null);
        ArrayList term1894 = new ArrayList();
        ((ArrayList) term1894).add((Object)null);
        ((ArrayList) term1894).add((Object)null);
        ((ArrayList) term1894).add((Object)null);
        ((ArrayList) term1894).add((Object)null);
        ((ArrayList) term1894).add((Object)null);
        ((ArrayList) term1894).add((Object)null);
        Object term1882 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term1882, term1882.getClass(), "name", "");
        setField(term1882, term1882.getClass(), "title", "");
        setField(term1882, term1882.getClass(), "description", "");
        setField(term1882, term1882.getClass(), "prereqStep", term1886);
        setField(term1882, term1882.getClass(), "optional", term1889);
        setField(term1882, term1882.getClass(), "steps", term1891);
        setField(term1882, term1882.getClass(), "variableSpecifications", term1894);
        ArrayList term1901 = new ArrayList();
        Boolean term1904 = new Boolean(true);
        ArrayList term1906 = new ArrayList();
        ((ArrayList) term1906).add((Object)null);
        ((ArrayList) term1906).add((Object)null);
        ((ArrayList) term1906).add((Object)null);
        ArrayList term1909 = new ArrayList();
        ((ArrayList) term1909).add((Object)null);
        ((ArrayList) term1909).add((Object)null);
        ((ArrayList) term1909).add((Object)null);
        ((ArrayList) term1909).add((Object)null);
        Object term1897 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term1897, term1897.getClass(), "name", "");
        setField(term1897, term1897.getClass(), "title", "");
        setField(term1897, term1897.getClass(), "description", "");
        setField(term1897, term1897.getClass(), "prereqStep", term1901);
        setField(term1897, term1897.getClass(), "optional", term1904);
        setField(term1897, term1897.getClass(), "steps", term1906);
        setField(term1897, term1897.getClass(), "variableSpecifications", term1909);
        ArrayList term1916 = new ArrayList();
        ((ArrayList) term1916).add((Object)null);
        ((ArrayList) term1916).add((Object)null);
        ((ArrayList) term1916).add((Object)null);
        ((ArrayList) term1916).add((Object)null);
        ((ArrayList) term1916).add((Object)null);
        Boolean term1919 = new Boolean(true);
        ArrayList term1921 = new ArrayList();
        ArrayList term1924 = new ArrayList();
        ((ArrayList) term1924).add((Object)null);
        Object term1912 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term1912, term1912.getClass(), "name", "");
        setField(term1912, term1912.getClass(), "title", "");
        setField(term1912, term1912.getClass(), "description", "");
        setField(term1912, term1912.getClass(), "prereqStep", term1916);
        setField(term1912, term1912.getClass(), "optional", term1919);
        setField(term1912, term1912.getClass(), "steps", term1921);
        setField(term1912, term1912.getClass(), "variableSpecifications", term1924);
        ArrayList term1880 = new ArrayList();
        ((ArrayList) term1880).add(term1882);
        ((ArrayList) term1880).add(term1777);
        ((ArrayList) term1880).add(term1897);
        ((ArrayList) term1880).add(term1912);
        ArrayList term1929 = new ArrayList();
        term1777 = newInstance(Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition"));
        setField(term1777, term1777.getClass(), "name", "OTSPWPJefj");
        setField(term1777, term1777.getClass(), "title", "EOTYMqXRmE");
        setField(term1777, term1777.getClass(), "description", "iTxNduwSjE");
        setField(term1777, term1777.getClass(), "prereqStep", term1814);
        setField(term1777, term1777.getClass(), "optional", term1878);
        setField(term1777, term1777.getClass(), "steps", term1880);
        setField(term1777, term1777.getClass(), "variableSpecifications", term1929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfworkflow.model.WorkflowStepDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptional", argTypes, term1777, args);
    }

};


