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

public class UserPhoto_canEqual_198232379321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1636;
     Object term1680;

    public UserPhoto_canEqual_198232379321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1636 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term1636, term1636.getClass(), "orderId", -341962980);
        setLongField(term1636, term1636.getClass(), "userId", 4784595517102746672L);
        setIntField(term1636, term1636.getClass(), "divNumber", 1532716628);
        setIntField(term1636, term1636.getClass(), "divLength", -1801760683);
        setField(term1636, term1636.getClass(), "divData", "kBdSllIBVz");
        setIntField(term1636, term1636.getClass(), "placeId", 1141317871);
        setField(term1636, term1636.getClass(), "clientId", "TJmVBGfTML");
        setField(term1636, term1636.getClass(), "uploadDate", "tPlsykYBqO");
        setLongField(term1636, term1636.getClass(), "playlogId", -7612550318181586304L);
        setIntField(term1636, term1636.getClass(), "trackNo", 890669485);
        term1680 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1680;
        callMethod(klass, "canEqual", argTypes, term1636, args);
    }

};


