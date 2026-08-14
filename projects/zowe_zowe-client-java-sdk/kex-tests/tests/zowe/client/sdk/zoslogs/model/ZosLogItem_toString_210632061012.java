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

public class ZosLogItem_toString_210632061012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2676;

    public ZosLogItem_toString_210632061012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2797 = new Long(-4325723315152823407L);
        term2676 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2676, term2676.getClass(), "cart", "dpNsDgfPso");
        setField(term2676, term2676.getClass(), "color", "hCWPJQKpdc");
        setField(term2676, term2676.getClass(), "jobName", "WzMEhMXkKx");
        setField(term2676, term2676.getClass(), "message", "XOiDvlDhdc");
        setField(term2676, term2676.getClass(), "messageId", "AdxvLJhNLe");
        setField(term2676, term2676.getClass(), "replyId", "lHfTrWKMPk");
        setField(term2676, term2676.getClass(), "system", "JDaAnsVTGV");
        setField(term2676, term2676.getClass(), "type", "mLUZFTfjle");
        setField(term2676, term2676.getClass(), "subType", "xIeFjkHkOe");
        setField(term2676, term2676.getClass(), "time", "SdCKLMIYnX");
        setField(term2676, term2676.getClass(), "timeStamp", term2797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2676, args);
    }

};


