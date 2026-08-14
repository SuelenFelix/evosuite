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

public class ZosLogItem_getSubType_306329989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007;

    public ZosLogItem_getSubType_306329989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2128 = new Long(6967924379644551255L);
        term2007 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2007, term2007.getClass(), "cart", "swZVeJAxjt");
        setField(term2007, term2007.getClass(), "color", "xOcJIiQQDu");
        setField(term2007, term2007.getClass(), "jobName", "GVizqqzXpy");
        setField(term2007, term2007.getClass(), "message", "JqXGgAhZPl");
        setField(term2007, term2007.getClass(), "messageId", "jiKYgYHqIS");
        setField(term2007, term2007.getClass(), "replyId", "DfISiziTgG");
        setField(term2007, term2007.getClass(), "system", "XqgfKFvPSD");
        setField(term2007, term2007.getClass(), "type", "JiVRgTZvKc");
        setField(term2007, term2007.getClass(), "subType", "XPKmummaqg");
        setField(term2007, term2007.getClass(), "time", "BKLfkLiZTH");
        setField(term2007, term2007.getClass(), "timeStamp", term2128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubType", argTypes, term2007, args);
    }

};


