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

public class ZosLogItem_getMessageId_11823305585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1115;

    public ZosLogItem_getMessageId_11823305585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1236 = new Long(7411271909051562686L);
        term1115 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term1115, term1115.getClass(), "cart", "nGKItKLYNC");
        setField(term1115, term1115.getClass(), "color", "UiUYnPrcCi");
        setField(term1115, term1115.getClass(), "jobName", "UoYtihxVaS");
        setField(term1115, term1115.getClass(), "message", "JDswTTCZHV");
        setField(term1115, term1115.getClass(), "messageId", "onpbIeEKoi");
        setField(term1115, term1115.getClass(), "replyId", "YRHGsAkhxb");
        setField(term1115, term1115.getClass(), "system", "ffYhPOzlUs");
        setField(term1115, term1115.getClass(), "type", "MLqYREekMl");
        setField(term1115, term1115.getClass(), "subType", "ytSBIKXogI");
        setField(term1115, term1115.getClass(), "time", "nHXjMycHlU");
        setField(term1115, term1115.getClass(), "timeStamp", term1236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageId", argTypes, term1115, args);
    }

};


