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

public class UserPhoto_toString_21871479923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1785;

    public UserPhoto_toString_21871479923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1785 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1785, term1785.getClass(), "orderId", 1386130016);
        setLongField(term1785, term1785.getClass(), "userId", -4443169559037975007L);
        setIntField(term1785, term1785.getClass(), "divNumber", 1072005683);
        setIntField(term1785, term1785.getClass(), "divLength", 1861318859);
        setField(term1785, term1785.getClass(), "divData", "JUmudUmaaV");
        setIntField(term1785, term1785.getClass(), "placeId", 1474524152);
        setField(term1785, term1785.getClass(), "clientId", "KoyGrUJeJW");
        setField(term1785, term1785.getClass(), "uploadDate", "HqBOwkVqjD");
        setLongField(term1785, term1785.getClass(), "playlogId", -3842548265506930260L);
        setIntField(term1785, term1785.getClass(), "trackNo", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1785, args);
    }

};


