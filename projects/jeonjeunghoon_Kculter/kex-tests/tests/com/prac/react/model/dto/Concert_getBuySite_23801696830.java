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

public class Concert_getBuySite_23801696830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23385;

    public Concert_getBuySite_23801696830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23385 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term23423 = newInstance(Class.forName("java.util.Date"));
        Object term23425 = newInstance(Class.forName("java.util.Date"));
        setIntField(term23385, term23385.getClass(), "concertNum", 1200440315);
        setField(term23385, term23385.getClass(), "concertHash", "ljNOgdPWrL");
        setField(term23385, term23385.getClass(), "concertName", "oBlIZiyRMS");
        setField(term23385, term23385.getClass(), "explain", "QUYAkhtCNh");
        setLongField(term23423, term23423.getClass(), "fastTime", 1466008719289L);
        setField(term23423, term23423.getClass(), "cdate", null);
        setField(term23385, term23385.getClass(), "startDate", term23423);
        setLongField(term23425, term23425.getClass(), "fastTime", 1535838449065L);
        setField(term23425, term23425.getClass(), "cdate", null);
        setField(term23385, term23385.getClass(), "endDate", term23425);
        setDoubleField(term23385, term23385.getClass(), "lat", 0.41934015614685227);
        setDoubleField(term23385, term23385.getClass(), "lng", 0.07298304401683597);
        setIntField(term23385, term23385.getClass(), "starKey", 40571662);
        setField(term23385, term23385.getClass(), "starHash", "kOaAQOLyqd");
        setField(term23385, term23385.getClass(), "imageUrl", "ICBWiKaeHC");
        setIntField(term23385, term23385.getClass(), "status", 1863910269);
        setField(term23385, term23385.getClass(), "starName", "WAljagiCzu");
        setField(term23385, term23385.getClass(), "placeName", "XKMXfDZajw");
        setField(term23385, term23385.getClass(), "buySite", "avZoBQSrBy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuySite", argTypes, term23385, args);
    }

};


