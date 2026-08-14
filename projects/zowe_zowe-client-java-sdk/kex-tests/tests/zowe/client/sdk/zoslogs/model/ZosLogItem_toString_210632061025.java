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

public class ZosLogItem_toString_210632061025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2910;

    public ZosLogItem_toString_210632061025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2910 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2910, term2910.getClass(), "cart", null);
        setField(term2910, term2910.getClass(), "color", null);
        setField(term2910, term2910.getClass(), "jobName", null);
        setField(term2910, term2910.getClass(), "message", null);
        setField(term2910, term2910.getClass(), "messageId", null);
        setField(term2910, term2910.getClass(), "replyId", null);
        setField(term2910, term2910.getClass(), "system", null);
        setField(term2910, term2910.getClass(), "type", null);
        setField(term2910, term2910.getClass(), "subType", null);
        setField(term2910, term2910.getClass(), "time", null);
        setField(term2910, term2910.getClass(), "timeStamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2910, args);
    }

};


