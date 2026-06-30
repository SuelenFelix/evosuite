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
import java.util.ArrayList;
import java.lang.Object;

public class CourseWrapper_toString_134099029914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15779;

    public CourseWrapper_toString_134099029914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15782 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15782, term15782.getClass(), "placeNum", -100825168);
        setField(term15782, term15782.getClass(), "keyHash", "");
        setIntField(term15782, term15782.getClass(), "placeType", 768407648);
        setField(term15782, term15782.getClass(), "culture", "");
        setField(term15782, term15782.getClass(), "kpop", "");
        setDoubleField(term15782, term15782.getClass(), "lat", 0.1187814206908886);
        setDoubleField(term15782, term15782.getClass(), "lng", 0.04662501176438627);
        setIntField(term15782, term15782.getClass(), "status", -350454594);
        setField(term15782, term15782.getClass(), "name", "");
        setField(term15782, term15782.getClass(), "explain", "");
        setField(term15782, term15782.getClass(), "address", "");
        setField(term15782, term15782.getClass(), "fileUrl", "");
        Object term15795 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15795, term15795.getClass(), "placeNum", -1148142995);
        setField(term15795, term15795.getClass(), "keyHash", "");
        setIntField(term15795, term15795.getClass(), "placeType", -233024044);
        setField(term15795, term15795.getClass(), "culture", "");
        setField(term15795, term15795.getClass(), "kpop", "");
        setDoubleField(term15795, term15795.getClass(), "lat", 0.17512426723256447);
        setDoubleField(term15795, term15795.getClass(), "lng", 0.9379214810416256);
        setIntField(term15795, term15795.getClass(), "status", 1820784228);
        setField(term15795, term15795.getClass(), "name", "");
        setField(term15795, term15795.getClass(), "explain", "");
        setField(term15795, term15795.getClass(), "address", "");
        setField(term15795, term15795.getClass(), "fileUrl", "");
        ArrayList term15780 = new ArrayList();
        ((ArrayList) term15780).add(term15782);
        ((ArrayList) term15780).add(term15795);
        term15779 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15779, term15779.getClass(), "course", term15780);
        setField(term15779, term15779.getClass(), "courseName", "kXnpLIZTAr");
        setIntField(term15779, term15779.getClass(), "memberNum", 1390820006);
        setField(term15779, term15779.getClass(), "memberHash", "ZiMAmqpbzk");
        setIntField(term15779, term15779.getClass(), "courseNum", -828982065);
        setField(term15779, term15779.getClass(), "courseHash", "UwJtBPAtSU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15779, args);
    }

};


