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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class Partition_toString_4143349914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3620;

    public Partition_toString_4143349914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3633 = new HashMap();
        HashMap term3648 = new HashMap();
        ArrayList term3653 = new ArrayList();
        ((ArrayList) term3653).add((Object)null);
        ((ArrayList) term3653).add((Object)null);
        ((ArrayList) term3653).add((Object)null);
        Object term3645 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3645, term3645.getClass(), "name", "");
        setField(term3645, term3645.getClass(), "type", "");
        setField(term3645, term3645.getClass(), "properties", term3648);
        setField(term3645, term3645.getClass(), "secure", term3653);
        HashMap term3659 = new HashMap();
        ArrayList term3664 = new ArrayList();
        ((ArrayList) term3664).add((Object)null);
        ((ArrayList) term3664).add((Object)null);
        ((ArrayList) term3664).add((Object)null);
        ((ArrayList) term3664).add((Object)null);
        Object term3656 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3656, term3656.getClass(), "name", "");
        setField(term3656, term3656.getClass(), "type", "");
        setField(term3656, term3656.getClass(), "properties", term3659);
        setField(term3656, term3656.getClass(), "secure", term3664);
        HashMap term3670 = new HashMap();
        ArrayList term3675 = new ArrayList();
        ((ArrayList) term3675).add((Object)null);
        ((ArrayList) term3675).add((Object)null);
        ((ArrayList) term3675).add((Object)null);
        ((ArrayList) term3675).add((Object)null);
        ((ArrayList) term3675).add((Object)null);
        ((ArrayList) term3675).add((Object)null);
        Object term3667 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3667, term3667.getClass(), "name", "");
        setField(term3667, term3667.getClass(), "type", "");
        setField(term3667, term3667.getClass(), "properties", term3670);
        setField(term3667, term3667.getClass(), "secure", term3675);
        ArrayList term3643 = new ArrayList();
        ((ArrayList) term3643).add(term3645);
        ((ArrayList) term3643).add(term3656);
        ((ArrayList) term3643).add(term3667);
        term3620 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term3620, term3620.getClass(), "name", "LFZNDELxUZ");
        setField(term3620, term3620.getClass(), "properties", term3633);
        setField(term3620, term3620.getClass(), "profiles", term3643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3620, args);
    }

};


