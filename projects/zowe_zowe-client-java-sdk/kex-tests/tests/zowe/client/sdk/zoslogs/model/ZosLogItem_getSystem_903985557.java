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

public class ZosLogItem_getSystem_903985557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561;

    public ZosLogItem_getSystem_903985557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1682 = new Long(6811161968424632369L);
        term1561 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term1561, term1561.getClass(), "cart", "whBvTVIIlC");
        setField(term1561, term1561.getClass(), "color", "IgRJUzaCwW");
        setField(term1561, term1561.getClass(), "jobName", "JUmudUmaaV");
        setField(term1561, term1561.getClass(), "message", "KoyGrUJeJW");
        setField(term1561, term1561.getClass(), "messageId", "HqBOwkVqjD");
        setField(term1561, term1561.getClass(), "replyId", "MAcUBcBckh");
        setField(term1561, term1561.getClass(), "system", "oVgzLbrsFr");
        setField(term1561, term1561.getClass(), "type", "vQVyKLdtaz");
        setField(term1561, term1561.getClass(), "subType", "OWKQODBLzb");
        setField(term1561, term1561.getClass(), "time", "wGmYcqUkgE");
        setField(term1561, term1561.getClass(), "timeStamp", term1682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystem", argTypes, term1561, args);
    }

};


