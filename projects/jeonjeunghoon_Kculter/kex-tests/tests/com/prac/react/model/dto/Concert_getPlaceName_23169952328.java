package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Concert_getPlaceName_23169952328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22991;

    public Concert_getPlaceName_23169952328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22991 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term23029 = newInstance(Class.forName("java.util.Date"));
        Object term23031 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22991, term22991.getClass(), "concertNum", -1428063820);
        setField(term22991, term22991.getClass(), "concertHash", "gDGZwlpOZx");
        setField(term22991, term22991.getClass(), "concertName", "gkDpxkHPDg");
        setField(term22991, term22991.getClass(), "explain", "pADwkrWiMW");
        setLongField(term23029, term23029.getClass(), "fastTime", 1628695316832L);
        setField(term23029, term23029.getClass(), "cdate", null);
        setField(term22991, term22991.getClass(), "startDate", term23029);
        setLongField(term23031, term23031.getClass(), "fastTime", 1393200035243L);
        setField(term23031, term23031.getClass(), "cdate", null);
        setField(term22991, term22991.getClass(), "endDate", term23031);
        setDoubleField(term22991, term22991.getClass(), "lat", 0.6704848280926606);
        setDoubleField(term22991, term22991.getClass(), "lng", 0.6213122016266206);
        setIntField(term22991, term22991.getClass(), "starKey", -1271375703);
        setField(term22991, term22991.getClass(), "starHash", "FDORDJuAXQ");
        setField(term22991, term22991.getClass(), "imageUrl", "yjqoDeLBLg");
        setIntField(term22991, term22991.getClass(), "status", 1136208236);
        setField(term22991, term22991.getClass(), "starName", "DCepDqVwas");
        setField(term22991, term22991.getClass(), "placeName", "wKIBUlfNCx");
        setField(term22991, term22991.getClass(), "buySite", "iGfMUWRvod");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term22991, args);
    }

};


