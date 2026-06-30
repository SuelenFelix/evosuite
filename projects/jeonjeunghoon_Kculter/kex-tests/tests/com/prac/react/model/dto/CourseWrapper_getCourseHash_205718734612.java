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

public class CourseWrapper_getCourseHash_205718734612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15481;

    public CourseWrapper_getCourseHash_205718734612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15484 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15484, term15484.getClass(), "placeNum", -868676396);
        setField(term15484, term15484.getClass(), "keyHash", "");
        setIntField(term15484, term15484.getClass(), "placeType", 1922684808);
        setField(term15484, term15484.getClass(), "culture", "");
        setField(term15484, term15484.getClass(), "kpop", "");
        setDoubleField(term15484, term15484.getClass(), "lat", 0.2382345237223229);
        setDoubleField(term15484, term15484.getClass(), "lng", 0.6037093070161561);
        setIntField(term15484, term15484.getClass(), "status", -2005784375);
        setField(term15484, term15484.getClass(), "name", "");
        setField(term15484, term15484.getClass(), "explain", "");
        setField(term15484, term15484.getClass(), "address", "");
        setField(term15484, term15484.getClass(), "fileUrl", "");
        Object term15497 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15497, term15497.getClass(), "placeNum", -288604325);
        setField(term15497, term15497.getClass(), "keyHash", "");
        setIntField(term15497, term15497.getClass(), "placeType", -1268314569);
        setField(term15497, term15497.getClass(), "culture", "");
        setField(term15497, term15497.getClass(), "kpop", "");
        setDoubleField(term15497, term15497.getClass(), "lat", 0.48050706663913145);
        setDoubleField(term15497, term15497.getClass(), "lng", 0.4990217874180345);
        setIntField(term15497, term15497.getClass(), "status", 877649659);
        setField(term15497, term15497.getClass(), "name", "");
        setField(term15497, term15497.getClass(), "explain", "");
        setField(term15497, term15497.getClass(), "address", "");
        setField(term15497, term15497.getClass(), "fileUrl", "");
        Object term15510 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15510, term15510.getClass(), "placeNum", -1332748804);
        setField(term15510, term15510.getClass(), "keyHash", "");
        setIntField(term15510, term15510.getClass(), "placeType", 1774507971);
        setField(term15510, term15510.getClass(), "culture", "");
        setField(term15510, term15510.getClass(), "kpop", "");
        setDoubleField(term15510, term15510.getClass(), "lat", 0.22767631814145395);
        setDoubleField(term15510, term15510.getClass(), "lng", 0.4630082575704827);
        setIntField(term15510, term15510.getClass(), "status", -1420269858);
        setField(term15510, term15510.getClass(), "name", "");
        setField(term15510, term15510.getClass(), "explain", "");
        setField(term15510, term15510.getClass(), "address", "");
        setField(term15510, term15510.getClass(), "fileUrl", "");
        Object term15523 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15523, term15523.getClass(), "placeNum", -2119545015);
        setField(term15523, term15523.getClass(), "keyHash", "");
        setIntField(term15523, term15523.getClass(), "placeType", 1272542218);
        setField(term15523, term15523.getClass(), "culture", "");
        setField(term15523, term15523.getClass(), "kpop", "");
        setDoubleField(term15523, term15523.getClass(), "lat", 0.8732511635701926);
        setDoubleField(term15523, term15523.getClass(), "lng", 0.8977760608415547);
        setIntField(term15523, term15523.getClass(), "status", 1209799204);
        setField(term15523, term15523.getClass(), "name", "");
        setField(term15523, term15523.getClass(), "explain", "");
        setField(term15523, term15523.getClass(), "address", "");
        setField(term15523, term15523.getClass(), "fileUrl", "");
        Object term15536 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term15536, term15536.getClass(), "placeNum", 1094107751);
        setField(term15536, term15536.getClass(), "keyHash", "");
        setIntField(term15536, term15536.getClass(), "placeType", 844222656);
        setField(term15536, term15536.getClass(), "culture", "");
        setField(term15536, term15536.getClass(), "kpop", "");
        setDoubleField(term15536, term15536.getClass(), "lat", 0.3107086749915061);
        setDoubleField(term15536, term15536.getClass(), "lng", 0.18330246984174836);
        setIntField(term15536, term15536.getClass(), "status", -18216811);
        setField(term15536, term15536.getClass(), "name", "");
        setField(term15536, term15536.getClass(), "explain", "");
        setField(term15536, term15536.getClass(), "address", "");
        setField(term15536, term15536.getClass(), "fileUrl", "");
        ArrayList term15482 = new ArrayList();
        ((ArrayList) term15482).add(term15484);
        ((ArrayList) term15482).add(term15497);
        ((ArrayList) term15482).add(term15510);
        ((ArrayList) term15482).add(term15523);
        ((ArrayList) term15482).add(term15536);
        term15481 = newInstance(Class.forName("com.prac.react.model.dto.CourseWrapper"));
        setField(term15481, term15481.getClass(), "course", term15482);
        setField(term15481, term15481.getClass(), "courseName", "IDClvDZuqE");
        setIntField(term15481, term15481.getClass(), "memberNum", -1813280137);
        setField(term15481, term15481.getClass(), "memberHash", "cMvKxpZOvg");
        setIntField(term15481, term15481.getClass(), "courseNum", 719656595);
        setField(term15481, term15481.getClass(), "courseHash", "WWBYemIuiK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.CourseWrapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseHash", argTypes, term15481, args);
    }

};


