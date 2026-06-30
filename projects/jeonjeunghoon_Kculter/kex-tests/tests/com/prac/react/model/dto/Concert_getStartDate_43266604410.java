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

public class Concert_getStartDate_43266604410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19565;

    public Concert_getStartDate_43266604410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19565 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19603 = newInstance(Class.forName("java.util.Date"));
        Object term19605 = newInstance(Class.forName("java.util.Date"));
        setIntField(term19565, term19565.getClass(), "concertNum", -975748721);
        setField(term19565, term19565.getClass(), "concertHash", "GAPGgDekVG");
        setField(term19565, term19565.getClass(), "concertName", "WmTogHwGLE");
        setField(term19565, term19565.getClass(), "explain", "qYOIXsGycY");
        setLongField(term19603, term19603.getClass(), "fastTime", 1668569229825L);
        setField(term19603, term19603.getClass(), "cdate", null);
        setField(term19565, term19565.getClass(), "startDate", term19603);
        setLongField(term19605, term19605.getClass(), "fastTime", 1725122217647L);
        setField(term19605, term19605.getClass(), "cdate", null);
        setField(term19565, term19565.getClass(), "endDate", term19605);
        setDoubleField(term19565, term19565.getClass(), "lat", 0.9113409083257852);
        setDoubleField(term19565, term19565.getClass(), "lng", 0.7444535250398684);
        setIntField(term19565, term19565.getClass(), "starKey", 433248783);
        setField(term19565, term19565.getClass(), "starHash", "sJNXNshRLe");
        setField(term19565, term19565.getClass(), "imageUrl", "AYnbmgRCKr");
        setIntField(term19565, term19565.getClass(), "status", -507944154);
        setField(term19565, term19565.getClass(), "starName", "iQRfDlaoYD");
        setField(term19565, term19565.getClass(), "placeName", "kpcyrjDQzN");
        setField(term19565, term19565.getClass(), "buySite", "IyukykAHLQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term19565, args);
    }

};


