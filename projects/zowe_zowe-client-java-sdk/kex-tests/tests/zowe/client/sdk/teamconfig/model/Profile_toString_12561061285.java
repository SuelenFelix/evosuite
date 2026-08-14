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

public class Profile_toString_12561061285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714;

    public Profile_toString_12561061285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term739 = new HashMap();
        ArrayList term749 = new ArrayList();
        ((ArrayList) term749).add("nGKItKLYNC");
        ((ArrayList) term749).add("UiUYnPrcCi");
        ((ArrayList) term749).add("UoYtihxVaS");
        ((ArrayList) term749).add("JDswTTCZHV");
        ((ArrayList) term749).add("onpbIeEKoi");
        ((ArrayList) term749).add("YRHGsAkhxb");
        term714 = newInstance(Class.forName("zowe.client.sdk.teamconfig.model.Profile"));
        setField(term714, term714.getClass(), "name", "tShwQLRGNe");
        setField(term714, term714.getClass(), "type", "LvtrsXUliU");
        setField(term714, term714.getClass(), "properties", term739);
        setField(term714, term714.getClass(), "secure", term749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.teamconfig.model.Profile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term714, args);
    }

};


