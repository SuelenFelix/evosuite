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

public class UserPhoto_getDivLength_5958523513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public UserPhoto_getDivLength_5958523513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term223, term223.getClass(), "orderId", 597278769);
        setLongField(term223, term223.getClass(), "userId", 4872422362414183754L);
        setIntField(term223, term223.getClass(), "divNumber", -1685132342);
        setIntField(term223, term223.getClass(), "divLength", -1456670397);
        setField(term223, term223.getClass(), "divData", "RMFIsYGgne");
        setIntField(term223, term223.getClass(), "placeId", 1622346318);
        setField(term223, term223.getClass(), "clientId", "NRdvgJlhkX");
        setField(term223, term223.getClass(), "uploadDate", "uuaPigETmJ");
        setLongField(term223, term223.getClass(), "playlogId", 6811161968424632369L);
        setIntField(term223, term223.getClass(), "trackNo", 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDivLength", argTypes, term223, args);
    }

};


