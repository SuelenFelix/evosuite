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

public class Concert_setConcertHash_6160915515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18569;

    public Concert_setConcertHash_6160915515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18569 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term18607 = newInstance(Class.forName("java.util.Date"));
        Object term18609 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18569, term18569.getClass(), "concertNum", 243280944);
        setField(term18569, term18569.getClass(), "concertHash", "dHuWgRwLOm");
        setField(term18569, term18569.getClass(), "concertName", "PsTQDxNIld");
        setField(term18569, term18569.getClass(), "explain", "uoBijJjvaj");
        setLongField(term18607, term18607.getClass(), "fastTime", 1645834034896L);
        setField(term18607, term18607.getClass(), "cdate", null);
        setField(term18569, term18569.getClass(), "startDate", term18607);
        setLongField(term18609, term18609.getClass(), "fastTime", 1500721068023L);
        setField(term18609, term18609.getClass(), "cdate", null);
        setField(term18569, term18569.getClass(), "endDate", term18609);
        setDoubleField(term18569, term18569.getClass(), "lat", 0.8223115496053149);
        setDoubleField(term18569, term18569.getClass(), "lng", 0.06795505641704636);
        setIntField(term18569, term18569.getClass(), "starKey", -726681073);
        setField(term18569, term18569.getClass(), "starHash", "BdsLFSRWda");
        setField(term18569, term18569.getClass(), "imageUrl", "tMhhBYonAI");
        setIntField(term18569, term18569.getClass(), "status", -1724487863);
        setField(term18569, term18569.getClass(), "starName", "AaQRshwIQC");
        setField(term18569, term18569.getClass(), "placeName", "rHgKCfgCsg");
        setField(term18569, term18569.getClass(), "buySite", "AWtIUOuutt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jBgJZpHifl";
        callMethod(klass, "setConcertHash", argTypes, term18569, args);
    }

};


