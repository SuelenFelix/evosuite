package icu.samnyan.aqua.sega.maimai2.model.request;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UploadUserPhoto_hashCode_7754295554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;

    public UploadUserPhoto_hashCode_7754295554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2535 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto"));
        Object term2536 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term2536, term2536.getClass(), "orderId", 1598895173);
        setLongField(term2536, term2536.getClass(), "userId", 2443640364875054177L);
        setIntField(term2536, term2536.getClass(), "divNumber", 1830648570);
        setIntField(term2536, term2536.getClass(), "divLength", -227365013);
        setField(term2536, term2536.getClass(), "divData", "JqXGgAhZPl");
        setIntField(term2536, term2536.getClass(), "placeId", 11724947);
        setField(term2536, term2536.getClass(), "clientId", "jiKYgYHqIS");
        setField(term2536, term2536.getClass(), "uploadDate", "DfISiziTgG");
        setLongField(term2536, term2536.getClass(), "playlogId", -1610676979013636850L);
        setIntField(term2536, term2536.getClass(), "trackNo", 1953277050);
        setField(term2535, term2535.getClass(), "userPhoto", term2536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.UploadUserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2535, args);
    }

};


