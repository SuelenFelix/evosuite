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
import java.lang.Integer;

public class UserPhoto_setDivNumber_70013022812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term893;
     Object term937;

    public UserPhoto_setDivNumber_70013022812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term893 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto"));
        setIntField(term893, term893.getClass(), "orderId", 97029295);
        setLongField(term893, term893.getClass(), "userId", 7009926388951271268L);
        setIntField(term893, term893.getClass(), "divNumber", -1371869594);
        setIntField(term893, term893.getClass(), "divLength", -2095575670);
        setField(term893, term893.getClass(), "divData", "xrwlQZdwCp");
        setIntField(term893, term893.getClass(), "placeId", 1225272962);
        setField(term893, term893.getClass(), "clientId", "IDCWpPLRkE");
        setField(term893, term893.getClass(), "uploadDate", "nyiiPDVjAc");
        setLongField(term893, term893.getClass(), "playlogId", -7672528020740371001L);
        setIntField(term893, term893.getClass(), "trackNo", 1324040357);
        term937 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.request.data.UserPhoto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term937;
        callMethod(klass, "setDivNumber", argTypes, term893, args);
    }

};


