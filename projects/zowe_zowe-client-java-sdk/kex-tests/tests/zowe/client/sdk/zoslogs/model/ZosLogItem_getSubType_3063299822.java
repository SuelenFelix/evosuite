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

public class ZosLogItem_getSubType_3063299822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2907;

    public ZosLogItem_getSubType_3063299822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2907 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2907, term2907.getClass(), "cart", null);
        setField(term2907, term2907.getClass(), "color", null);
        setField(term2907, term2907.getClass(), "jobName", null);
        setField(term2907, term2907.getClass(), "message", null);
        setField(term2907, term2907.getClass(), "messageId", null);
        setField(term2907, term2907.getClass(), "replyId", null);
        setField(term2907, term2907.getClass(), "system", null);
        setField(term2907, term2907.getClass(), "type", null);
        setField(term2907, term2907.getClass(), "subType", null);
        setField(term2907, term2907.getClass(), "time", null);
        setField(term2907, term2907.getClass(), "timeStamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubType", argTypes, term2907, args);
    }

};


