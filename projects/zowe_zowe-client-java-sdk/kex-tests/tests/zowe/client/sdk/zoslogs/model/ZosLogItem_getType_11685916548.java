package zowe.client.sdk.zoslogs.model;

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
import static zowe.client.sdk.zoslogs.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ZosLogItem_getType_11685916548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1784;

    public ZosLogItem_getType_11685916548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1905 = new Long(-7237588299778557629L);
        term1784 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term1784, term1784.getClass(), "cart", "idgaQsnJpQ");
        setField(term1784, term1784.getClass(), "color", "VgZnGoIFwQ");
        setField(term1784, term1784.getClass(), "jobName", "jUbSRrkrYZ");
        setField(term1784, term1784.getClass(), "message", "bWWfajKbEX");
        setField(term1784, term1784.getClass(), "messageId", "cAPeiZHKGJ");
        setField(term1784, term1784.getClass(), "replyId", "LvJFtLBaxj");
        setField(term1784, term1784.getClass(), "system", "PHvxnGHptP");
        setField(term1784, term1784.getClass(), "type", "TimdotUuNC");
        setField(term1784, term1784.getClass(), "subType", "PkWMRdJcBb");
        setField(term1784, term1784.getClass(), "time", "jSpAteRute");
        setField(term1784, term1784.getClass(), "timeStamp", term1905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1784, args);
    }

};


