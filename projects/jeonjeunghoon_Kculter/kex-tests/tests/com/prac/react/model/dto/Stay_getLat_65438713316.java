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

public class Stay_getLat_65438713316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821;

    public Stay_getLat_65438713316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2821 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term2821, term2821.getClass(), "addr1", "JDaAnsVTGV");
        setField(term2821, term2821.getClass(), "addr2", "mLUZFTfjle");
        setField(term2821, term2821.getClass(), "areaCode", "xIeFjkHkOe");
        setField(term2821, term2821.getClass(), "sigunguCode", "SdCKLMIYnX");
        setField(term2821, term2821.getClass(), "representImg", "OJJtVNPyKZ");
        setField(term2821, term2821.getClass(), "sumnail", "AKNapTAfmD");
        setDoubleField(term2821, term2821.getClass(), "lng", 0.6805867182029153);
        setDoubleField(term2821, term2821.getClass(), "lat", 0.2852810965221698);
        setField(term2821, term2821.getClass(), "tel", "xJgPlLxpgC");
        setField(term2821, term2821.getClass(), "title", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLat", argTypes, term2821, args);
    }

};


