package zowe.client.sdk.zoslogs.response;

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
import static zowe.client.sdk.zoslogs.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ZosLogResponse_getItems_234059855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;

    public ZosLogResponse_getItems_234059855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term769 = new ArrayList();
        term753 = newInstance(Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse"));
        setLongField(term753, term753.getClass(), "timeZone", -4325723315152823407L);
        setLongField(term753, term753.getClass(), "nextTimeStamp", 2535595959091595249L);
        setField(term753, term753.getClass(), "source", "XfRABIFVEp");
        setLongField(term753, term753.getClass(), "totalItems", -5476826692763582090L);
        setField(term753, term753.getClass(), "items", term769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.response.ZosLogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term753, args);
    }

};


