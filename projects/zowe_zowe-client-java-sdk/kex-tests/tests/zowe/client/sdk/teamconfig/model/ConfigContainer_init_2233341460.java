package zowe.client.sdk.teamconfig.model;

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
import static zowe.client.sdk.teamconfig.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Boolean;

public class ConfigContainer_init_2233341460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;
     Object term987;
     Object term990;
     Object term1055;

    public ConfigContainer_init_2233341460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term926 = new HashMap();
        ArrayList term932 = new ArrayList();
        Object term913 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term913, term913.getClass(), "name", "ffYhPOzlUs");
        setField(term913, term913.getClass(), "properties", term926);
        setField(term913, term913.getClass(), "profiles", term932);
        HashMap term939 = new HashMap();
        ArrayList term944 = new ArrayList();
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        ((ArrayList) term944).add((Object)null);
        Object term937 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term937, term937.getClass(), "name", "");
        setField(term937, term937.getClass(), "properties", term939);
        setField(term937, term937.getClass(), "profiles", term944);
        Object term948 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term948, term948.getClass(), "name", null);
        setField(term948, term948.getClass(), "properties", null);
        setField(term948, term948.getClass(), "profiles", null);
        term910 = new LinkedList();
        ((LinkedList) term910).add(term913);
        ((LinkedList) term910).add(term937);
        ((LinkedList) term910).add(term948);
        ((LinkedList) term910).add((Object)null);
        ((LinkedList) term910).add((Object)null);
        term987 = new LinkedList();
        term990 = new LinkedHashMap();
        term1055 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.ConfigContainer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[5];
        args[0] = term910;
        args[1] = "PgPzMSEjjX";
        args[2] = term987;
        args[3] = term990;
        args[4] = term1055;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


