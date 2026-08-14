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

public class ZosLogItem_getTime_115372594510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2230;

    public ZosLogItem_getTime_115372594510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2351 = new Long(-2813493605142626659L);
        term2230 = newInstance(Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem"));
        setField(term2230, term2230.getClass(), "cart", "SPpkrGcPRr");
        setField(term2230, term2230.getClass(), "color", "sEccwbJKYE");
        setField(term2230, term2230.getClass(), "jobName", "AWRooQKkdW");
        setField(term2230, term2230.getClass(), "message", "vjxIhXHxGR");
        setField(term2230, term2230.getClass(), "messageId", "QXzGXbEXMu");
        setField(term2230, term2230.getClass(), "replyId", "qxSDVejjiY");
        setField(term2230, term2230.getClass(), "system", "xBsXSDjXYK");
        setField(term2230, term2230.getClass(), "type", "sEnIVFtZuQ");
        setField(term2230, term2230.getClass(), "subType", "ZVecLZMLHF");
        setField(term2230, term2230.getClass(), "time", "fztQhjqwdP");
        setField(term2230, term2230.getClass(), "timeStamp", term2351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zoslogs.model.ZosLogItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term2230, args);
    }

};


