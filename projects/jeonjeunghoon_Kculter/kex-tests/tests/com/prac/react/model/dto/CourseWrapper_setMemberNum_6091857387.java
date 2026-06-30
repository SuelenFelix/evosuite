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
import java.lang.Integer;

public class CourseWrapper_setMemberNum_6091857387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14804;
     Object term14873;

    public CourseWrapper_setMemberNum_6091857387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14807 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14807, term14807.getClass(), "placeNum", 1593461795);
        setField(term14807, term14807.getClass(), "keyHash", "");
        setIntField(term14807, term14807.getClass(), "placeType", 515182546);
        setField(term14807, term14807.getClass(), "culture", "");
        setField(term14807, term14807.getClass(), "kpop", "");
        setDoubleField(term14807, term14807.getClass(), "lat", 0.9276995636844321);
        setDoubleField(term14807, term14807.getClass(), "lng", 0.7636130748477434);
        setIntField(term14807, term14807.getClass(), "status", -936895502);
        setField(term14807, term14807.getClass(), "name", "");
        setField(term14807, term14807.getClass(), "explain", "");
        setField(term14807, term14807.getClass(), "address", "");
        setField(term14807, term14807.getClass(), "fileUrl", "");
        Object term14820 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term14820, term14820.getClass(), "placeNum", -129547140);
        setField(term14820, term14820.getClass(), "keyHash", "");
        setIntField(term14820, term14820.getClass(), "placeType", 199287428);
        setField(term14820, term14820.getClass(), "culture", "");
        setField(term14820, term14820.getClass(), "kpop", "");
        setDoubleField(term14820, term14820.getClass(), "lat", 0.07901636960861558);
        setDoubleField(term14820, term14820.getClass(), "lng", 0.18717846301066243);
        setIntField(term14820, term14820.getClass(), "status", -1195339592);
        setField(term14820, term14820.getClass(), "name", "");
        setField(term14820, term14820.getClass(), "explain", "");
        setField(term14820, term14820.getClass(), "address", "");
        setField(term14820, term14820.getClass(), "fileUrl", "");
        ArrayList term14805 = new ArrayList();
        ((ArrayList) term14805).add(term14807);
        ((ArrayList) term14805).add(term14820);
        term14804 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term14804, term14804.getClass(), "course", term14805);
        setField(term14804, term14804.getClass(), "courseName", "KbwxawvYsw");
        setIntField(term14804, term14804.getClass(), "memberNum", -376422566);
        setField(term14804, term14804.getClass(), "memberHash", "gvjdfHNzOa");
        setIntField(term14804, term14804.getClass(), "courseNum", 306847454);
        setField(term14804, term14804.getClass(), "courseHash", "HqitWglYWX");
        term14873 = new Integer(1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14873;
        callMethod(klass, "setMemberNum", argTypes, term14804, args);
    }

};


