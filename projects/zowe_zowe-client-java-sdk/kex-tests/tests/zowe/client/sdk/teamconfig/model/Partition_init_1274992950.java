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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class Partition_init_1274992950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3088;
     Object term3179;

    public Partition_init_1274992950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3088 = new LinkedHashMap();
        HashMap term3207 = new HashMap();
        ArrayList term3213 = new ArrayList();
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        ((ArrayList) term3213).add((Object)null);
        Object term3182 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3182, term3182.getClass(), "name", "HegRNsidFg");
        setField(term3182, term3182.getClass(), "type", "udRdJkgXmH");
        setField(term3182, term3182.getClass(), "properties", term3207);
        setField(term3182, term3182.getClass(), "secure", term3213);
        HashMap term3221 = new HashMap();
        ArrayList term3226 = new ArrayList();
        ((ArrayList) term3226).add((Object)null);
        ((ArrayList) term3226).add((Object)null);
        Object term3218 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3218, term3218.getClass(), "name", "");
        setField(term3218, term3218.getClass(), "type", "");
        setField(term3218, term3218.getClass(), "properties", term3221);
        setField(term3218, term3218.getClass(), "secure", term3226);
        Object term3230 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3230, term3230.getClass(), "name", null);
        setField(term3230, term3230.getClass(), "type", null);
        setField(term3230, term3230.getClass(), "properties", null);
        setField(term3230, term3230.getClass(), "secure", null);
        term3179 = new LinkedList();
        ((LinkedList) term3179).add(term3182);
        ((LinkedList) term3179).add(term3218);
        ((LinkedList) term3179).add(term3230);
        ((LinkedList) term3179).add((Object)null);
        ((LinkedList) term3179).add((Object)null);
        ((LinkedList) term3179).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Partition");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "EyojsbSjWT";
        args[1] = term3088;
        args[2] = term3179;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


