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

public class Profile_getProperties_9040114923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;

    public Profile_getProperties_9040114923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term511 = new HashMap();
        ArrayList term521 = new ArrayList();
        ((ArrayList) term521).add("IDCWpPLRkE");
        ((ArrayList) term521).add("nyiiPDVjAc");
        ((ArrayList) term521).add("aKnKipADSo");
        ((ArrayList) term521).add("wSQxaModmm");
        term486 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term486, term486.getClass(), "name", "SbAoxhfrkn");
        setField(term486, term486.getClass(), "type", "kuTXqwMtDB");
        setField(term486, term486.getClass(), "properties", term511);
        setField(term486, term486.getClass(), "secure", term521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term486, args);
    }

};


