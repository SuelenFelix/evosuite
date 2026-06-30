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

public class Concert_setStarName_31903636427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22783;

    public Concert_setStarName_31903636427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22783 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term22821 = newInstance(Class.forName("java.util.Date"));
        Object term22823 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22783, term22783.getClass(), "concertNum", -1556527718);
        setField(term22783, term22783.getClass(), "concertHash", "UqSNWSoTRy");
        setField(term22783, term22783.getClass(), "concertName", "VesRqDfjMa");
        setField(term22783, term22783.getClass(), "explain", "AQTTebOiZR");
        setLongField(term22821, term22821.getClass(), "fastTime", 1802995433545L);
        setField(term22821, term22821.getClass(), "cdate", null);
        setField(term22783, term22783.getClass(), "startDate", term22821);
        setLongField(term22823, term22823.getClass(), "fastTime", 1843214817357L);
        setField(term22823, term22823.getClass(), "cdate", null);
        setField(term22783, term22783.getClass(), "endDate", term22823);
        setDoubleField(term22783, term22783.getClass(), "lat", 0.9172358414700745);
        setDoubleField(term22783, term22783.getClass(), "lng", 0.3804251745476508);
        setIntField(term22783, term22783.getClass(), "starKey", 895255351);
        setField(term22783, term22783.getClass(), "starHash", "mgeIhswNtk");
        setField(term22783, term22783.getClass(), "imageUrl", "QwKYpiVQlL");
        setIntField(term22783, term22783.getClass(), "status", -1317044799);
        setField(term22783, term22783.getClass(), "starName", "kSGsHNQQoW");
        setField(term22783, term22783.getClass(), "placeName", "MWezlyjdaG");
        setField(term22783, term22783.getClass(), "buySite", "drpBJuEKQG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GGpORnLrOW";
        callMethod(klass, "setStarName", argTypes, term22783, args);
    }

};


