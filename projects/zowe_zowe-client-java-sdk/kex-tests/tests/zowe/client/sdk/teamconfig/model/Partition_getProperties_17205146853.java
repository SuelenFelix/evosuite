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

public class Partition_getProperties_17205146853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528;

    public Partition_getProperties_17205146853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3541 = new HashMap();
        HashMap term3556 = new HashMap();
        ArrayList term3561 = new ArrayList();
        ((ArrayList) term3561).add((Object)null);
        ((ArrayList) term3561).add((Object)null);
        Object term3553 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3553, term3553.getClass(), "name", "");
        setField(term3553, term3553.getClass(), "type", "");
        setField(term3553, term3553.getClass(), "properties", term3556);
        setField(term3553, term3553.getClass(), "secure", term3561);
        HashMap term3567 = new HashMap();
        ArrayList term3572 = new ArrayList();
        ((ArrayList) term3572).add((Object)null);
        ((ArrayList) term3572).add((Object)null);
        ((ArrayList) term3572).add((Object)null);
        ((ArrayList) term3572).add((Object)null);
        ((ArrayList) term3572).add((Object)null);
        ((ArrayList) term3572).add((Object)null);
        Object term3564 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3564, term3564.getClass(), "name", "");
        setField(term3564, term3564.getClass(), "type", "");
        setField(term3564, term3564.getClass(), "properties", term3567);
        setField(term3564, term3564.getClass(), "secure", term3572);
        HashMap term3578 = new HashMap();
        ArrayList term3583 = new ArrayList();
        ((ArrayList) term3583).add((Object)null);
        Object term3575 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3575, term3575.getClass(), "name", "");
        setField(term3575, term3575.getClass(), "type", "");
        setField(term3575, term3575.getClass(), "properties", term3578);
        setField(term3575, term3575.getClass(), "secure", term3583);
        HashMap term3589 = new HashMap();
        ArrayList term3594 = new ArrayList();
        ((ArrayList) term3594).add((Object)null);
        ((ArrayList) term3594).add((Object)null);
        Object term3586 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3586, term3586.getClass(), "name", "");
        setField(term3586, term3586.getClass(), "type", "");
        setField(term3586, term3586.getClass(), "properties", term3589);
        setField(term3586, term3586.getClass(), "secure", term3594);
        HashMap term3600 = new HashMap();
        ArrayList term3605 = new ArrayList();
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        ((ArrayList) term3605).add((Object)null);
        Object term3597 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3597, term3597.getClass(), "name", "");
        setField(term3597, term3597.getClass(), "type", "");
        setField(term3597, term3597.getClass(), "properties", term3600);
        setField(term3597, term3597.getClass(), "secure", term3605);
        ArrayList term3551 = new ArrayList();
        ((ArrayList) term3551).add(term3553);
        ((ArrayList) term3551).add(term3564);
        ((ArrayList) term3551).add(term3575);
        ((ArrayList) term3551).add(term3586);
        ((ArrayList) term3551).add(term3597);
        term3528 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term3528, term3528.getClass(), "name", "gbxMvhrWpA");
        setField(term3528, term3528.getClass(), "properties", term3541);
        setField(term3528, term3528.getClass(), "profiles", term3551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term3528, args);
    }

};


