package icu.samnyan.aqua.sega.maimai2.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPhoto_setUploadDate_78053020817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;

    public UserPhoto_setUploadDate_78053020817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1313, term1313.getClass(), "orderId", -556405712);
        setLongField(term1313, term1313.getClass(), "userId", 1233889271256172047L);
        setIntField(term1313, term1313.getClass(), "divNumber", -1772434990);
        setIntField(term1313, term1313.getClass(), "divLength", -1845499264);
        setField(term1313, term1313.getClass(), "divData", "JDswTTCZHV");
        setIntField(term1313, term1313.getClass(), "placeId", -505439934);
        setField(term1313, term1313.getClass(), "clientId", "onpbIeEKoi");
        setField(term1313, term1313.getClass(), "uploadDate", "YRHGsAkhxb");
        setLongField(term1313, term1313.getClass(), "playlogId", 6617340557564669657L);
        setIntField(term1313, term1313.getClass(), "trackNo", -344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setUploadDate", argTypes, term1313, args);
    }

};


