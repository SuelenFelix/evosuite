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

public class ZosLogItem_getReplyId_1122536596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1338;

    public ZosLogItem_getReplyId_1122536596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1459 = new Long(4872422362414183754L);
        term1338 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term1338, term1338.getClass(), "cart", "ieCtQFdkii");
        setField(term1338, term1338.getClass(), "color", "dEnhdmILtU");
        setField(term1338, term1338.getClass(), "jobName", "hoicvmsovO");
        setField(term1338, term1338.getClass(), "message", "eqJfYWRaEL");
        setField(term1338, term1338.getClass(), "messageId", "fhkbdRViHi");
        setField(term1338, term1338.getClass(), "replyId", "uWHnvSvaPl");
        setField(term1338, term1338.getClass(), "system", "kBdSllIBVz");
        setField(term1338, term1338.getClass(), "type", "TJmVBGfTML");
        setField(term1338, term1338.getClass(), "subType", "tPlsykYBqO");
        setField(term1338, term1338.getClass(), "time", "bLPjGVBhlX");
        setField(term1338, term1338.getClass(), "timeStamp", term1459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReplyId", argTypes, term1338, args);
    }

};


