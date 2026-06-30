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

public class UserPhoto_setDivData_73650536814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045;

    public UserPhoto_setDivData_73650536814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1045 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1045, term1045.getClass(), "orderId", 1265463001);
        setLongField(term1045, term1045.getClass(), "userId", 2120084523938730454L);
        setIntField(term1045, term1045.getClass(), "divNumber", 335112684);
        setIntField(term1045, term1045.getClass(), "divLength", 1551099402);
        setField(term1045, term1045.getClass(), "divData", "gGSMzuGICf");
        setIntField(term1045, term1045.getClass(), "placeId", -2027534003);
        setField(term1045, term1045.getClass(), "clientId", "hxCBltsObl");
        setField(term1045, term1045.getClass(), "uploadDate", "BndsHwAFMv");
        setLongField(term1045, term1045.getClass(), "playlogId", 6855071767938501807L);
        setIntField(term1045, term1045.getClass(), "trackNo", 1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GzFkzHGYFt";
        callMethod(klass, "setDivData", argTypes, term1045, args);
    }

};


