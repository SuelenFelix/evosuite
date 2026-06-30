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

public class UserPhoto_getUploadDate_20647159607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;

    public UserPhoto_getUploadDate_20647159607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term519, term519.getClass(), "orderId", -1087774327);
        setLongField(term519, term519.getClass(), "userId", -5476826692763582090L);
        setIntField(term519, term519.getClass(), "divNumber", -1530420153);
        setIntField(term519, term519.getClass(), "divLength", -469968304);
        setField(term519, term519.getClass(), "divData", "RkybSrpybU");
        setIntField(term519, term519.getClass(), "placeId", -1145578966);
        setField(term519, term519.getClass(), "clientId", "xOEqzGAmDU");
        setField(term519, term519.getClass(), "uploadDate", "eZFUvlxvGV");
        setLongField(term519, term519.getClass(), "playlogId", -872011222785455006L);
        setIntField(term519, term519.getClass(), "trackNo", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUploadDate", argTypes, term519, args);
    }

};


