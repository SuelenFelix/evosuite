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

public class CourseWrapper_getCourseName_18855940694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14420;

    public CourseWrapper_getCourseName_18855940694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14423 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14423, term14423.getClass(), "placeNum", 1684998508);
        setField(term14423, term14423.getClass(), "keyHash", "");
        setIntField(term14423, term14423.getClass(), "placeType", -1476644457);
        setField(term14423, term14423.getClass(), "culture", "");
        setField(term14423, term14423.getClass(), "kpop", "");
        setDoubleField(term14423, term14423.getClass(), "lat", 0.9022041121474429);
        setDoubleField(term14423, term14423.getClass(), "lng", 0.6512870939318848);
        setIntField(term14423, term14423.getClass(), "status", 1270666529);
        setField(term14423, term14423.getClass(), "name", "");
        setField(term14423, term14423.getClass(), "explain", "");
        setField(term14423, term14423.getClass(), "address", "");
        setField(term14423, term14423.getClass(), "fileUrl", "");
        Object term14436 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14436, term14436.getClass(), "placeNum", -1146679443);
        setField(term14436, term14436.getClass(), "keyHash", "");
        setIntField(term14436, term14436.getClass(), "placeType", -860131894);
        setField(term14436, term14436.getClass(), "culture", "");
        setField(term14436, term14436.getClass(), "kpop", "");
        setDoubleField(term14436, term14436.getClass(), "lat", 0.8777038609128434);
        setDoubleField(term14436, term14436.getClass(), "lng", 0.008025683154629148);
        setIntField(term14436, term14436.getClass(), "status", -1022990421);
        setField(term14436, term14436.getClass(), "name", "");
        setField(term14436, term14436.getClass(), "explain", "");
        setField(term14436, term14436.getClass(), "address", "");
        setField(term14436, term14436.getClass(), "fileUrl", "");
        Object term14449 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14449, term14449.getClass(), "placeNum", 1045547089);
        setField(term14449, term14449.getClass(), "keyHash", "");
        setIntField(term14449, term14449.getClass(), "placeType", -1122880881);
        setField(term14449, term14449.getClass(), "culture", "");
        setField(term14449, term14449.getClass(), "kpop", "");
        setDoubleField(term14449, term14449.getClass(), "lat", 0.40598298281353484);
        setDoubleField(term14449, term14449.getClass(), "lng", 0.3710067290060264);
        setIntField(term14449, term14449.getClass(), "status", -542712742);
        setField(term14449, term14449.getClass(), "name", "");
        setField(term14449, term14449.getClass(), "explain", "");
        setField(term14449, term14449.getClass(), "address", "");
        setField(term14449, term14449.getClass(), "fileUrl", "");
        Object term14462 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14462, term14462.getClass(), "placeNum", -1254072822);
        setField(term14462, term14462.getClass(), "keyHash", "");
        setIntField(term14462, term14462.getClass(), "placeType", -1111249833);
        setField(term14462, term14462.getClass(), "culture", "");
        setField(term14462, term14462.getClass(), "kpop", "");
        setDoubleField(term14462, term14462.getClass(), "lat", 0.7818620200430967);
        setDoubleField(term14462, term14462.getClass(), "lng", 0.04640022995603543);
        setIntField(term14462, term14462.getClass(), "status", -1692331299);
        setField(term14462, term14462.getClass(), "name", "");
        setField(term14462, term14462.getClass(), "explain", "");
        setField(term14462, term14462.getClass(), "address", "");
        setField(term14462, term14462.getClass(), "fileUrl", "");
        ArrayList term14421 = new ArrayList();
        ((ArrayList) term14421).add(term14423);
        ((ArrayList) term14421).add(term14436);
        ((ArrayList) term14421).add(term14449);
        ((ArrayList) term14421).add(term14462);
        term14420 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term14420, term14420.getClass(), "course", term14421);
        setField(term14420, term14420.getClass(), "courseName", "rOfPCPHmtJ");
        setIntField(term14420, term14420.getClass(), "memberNum", 479531250);
        setField(term14420, term14420.getClass(), "memberHash", "EnmiAvfpJv");
        setIntField(term14420, term14420.getClass(), "courseNum", 1320570890);
        setField(term14420, term14420.getClass(), "courseHash", "AdYzLPMcwe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseName", argTypes, term14420, args);
    }

};


