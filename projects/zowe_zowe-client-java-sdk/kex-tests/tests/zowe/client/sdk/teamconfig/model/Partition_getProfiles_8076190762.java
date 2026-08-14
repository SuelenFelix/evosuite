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

public class Partition_getProfiles_8076190762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3436;

    public Partition_getProfiles_8076190762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3449 = new HashMap();
        HashMap term3464 = new HashMap();
        ArrayList term3469 = new ArrayList();
        ((ArrayList) term3469).add((Object)null);
        ((ArrayList) term3469).add((Object)null);
        Object term3461 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3461, term3461.getClass(), "name", "");
        setField(term3461, term3461.getClass(), "type", "");
        setField(term3461, term3461.getClass(), "properties", term3464);
        setField(term3461, term3461.getClass(), "secure", term3469);
        HashMap term3475 = new HashMap();
        ArrayList term3480 = new ArrayList();
        ((ArrayList) term3480).add((Object)null);
        ((ArrayList) term3480).add((Object)null);
        ((ArrayList) term3480).add((Object)null);
        ((ArrayList) term3480).add((Object)null);
        ((ArrayList) term3480).add((Object)null);
        ((ArrayList) term3480).add((Object)null);
        Object term3472 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3472, term3472.getClass(), "name", "");
        setField(term3472, term3472.getClass(), "type", "");
        setField(term3472, term3472.getClass(), "properties", term3475);
        setField(term3472, term3472.getClass(), "secure", term3480);
        HashMap term3486 = new HashMap();
        ArrayList term3491 = new ArrayList();
        ((ArrayList) term3491).add((Object)null);
        Object term3483 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3483, term3483.getClass(), "name", "");
        setField(term3483, term3483.getClass(), "type", "");
        setField(term3483, term3483.getClass(), "properties", term3486);
        setField(term3483, term3483.getClass(), "secure", term3491);
        HashMap term3497 = new HashMap();
        ArrayList term3502 = new ArrayList();
        ((ArrayList) term3502).add((Object)null);
        ((ArrayList) term3502).add((Object)null);
        ((ArrayList) term3502).add((Object)null);
        ((ArrayList) term3502).add((Object)null);
        ((ArrayList) term3502).add((Object)null);
        ((ArrayList) term3502).add((Object)null);
        Object term3494 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3494, term3494.getClass(), "name", "");
        setField(term3494, term3494.getClass(), "type", "");
        setField(term3494, term3494.getClass(), "properties", term3497);
        setField(term3494, term3494.getClass(), "secure", term3502);
        HashMap term3508 = new HashMap();
        ArrayList term3513 = new ArrayList();
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        ((ArrayList) term3513).add((Object)null);
        Object term3505 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term3505, term3505.getClass(), "name", "");
        setField(term3505, term3505.getClass(), "type", "");
        setField(term3505, term3505.getClass(), "properties", term3508);
        setField(term3505, term3505.getClass(), "secure", term3513);
        ArrayList term3459 = new ArrayList();
        ((ArrayList) term3459).add(term3461);
        ((ArrayList) term3459).add(term3472);
        ((ArrayList) term3459).add(term3483);
        ((ArrayList) term3459).add(term3494);
        ((ArrayList) term3459).add(term3505);
        term3436 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Partition"));
        setField(term3436, term3436.getClass(), "name", "RsOfgdMCMv");
        setField(term3436, term3436.getClass(), "properties", term3449);
        setField(term3436, term3436.getClass(), "profiles", term3459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Partition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfiles", argTypes, term3436, args);
    }

};


