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

public class ZosLogItem_getTimeStamp_58068248111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2453;

    public ZosLogItem_getTimeStamp_58068248111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2574 = new Long(-8885298608300233488L);
        term2453 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2453, term2453.getClass(), "cart", "eVpkWxjuki");
        setField(term2453, term2453.getClass(), "color", "SJiQaLvSKv");
        setField(term2453, term2453.getClass(), "jobName", "OEXDRUKcFl");
        setField(term2453, term2453.getClass(), "message", "RYdKCNNMBR");
        setField(term2453, term2453.getClass(), "messageId", "yGtHPyvYiQ");
        setField(term2453, term2453.getClass(), "replyId", "MvRIxilFMJ");
        setField(term2453, term2453.getClass(), "system", "iNwOJRBEjp");
        setField(term2453, term2453.getClass(), "type", "XylxrMBraH");
        setField(term2453, term2453.getClass(), "subType", "pORebkoRdD");
        setField(term2453, term2453.getClass(), "time", "mXGCWJDOqA");
        setField(term2453, term2453.getClass(), "timeStamp", term2574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeStamp", argTypes, term2453, args);
    }

};


