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

public class Profile_getName_19071034291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;

    public Profile_getName_19071034291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term239 = new HashMap();
        ArrayList term249 = new ArrayList();
        ((ArrayList) term249).add("xOEqzGAmDU");
        ((ArrayList) term249).add("eZFUvlxvGV");
        ((ArrayList) term249).add("BYqFIqCKAV");
        ((ArrayList) term249).add("vrQLuWIDJX");
        term214 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term214, term214.getClass(), "name", "HyxfbSQYBe");
        setField(term214, term214.getClass(), "type", "pCTimMblYc");
        setField(term214, term214.getClass(), "properties", term239);
        setField(term214, term214.getClass(), "secure", term249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term214, args);
    }

};


