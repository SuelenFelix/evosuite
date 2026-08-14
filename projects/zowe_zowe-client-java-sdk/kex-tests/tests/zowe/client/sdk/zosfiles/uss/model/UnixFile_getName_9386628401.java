package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixFile_getName_9386628401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3146;

    public UnixFile_getName_9386628401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3171 = new Long(5246058710498845622L);
        Long term3173 = new Long(4394651392080968777L);
        Long term3187 = new Long(-7310273014364148916L);
        term3146 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3146, term3146.getClass(), "name", "AdxvLJhNLe");
        setField(term3146, term3146.getClass(), "mode", "lHfTrWKMPk");
        setField(term3146, term3146.getClass(), "size", term3171);
        setField(term3146, term3146.getClass(), "uid", term3173);
        setField(term3146, term3146.getClass(), "user", "JDaAnsVTGV");
        setField(term3146, term3146.getClass(), "gid", term3187);
        setField(term3146, term3146.getClass(), "group", "mLUZFTfjle");
        setField(term3146, term3146.getClass(), "mtime", "xIeFjkHkOe");
        setField(term3146, term3146.getClass(), "target", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3146, args);
    }

};


