package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Room_setRoomName_18700128669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064;

    public Room_setRoomName_18700128669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5065 = new Integer(30837706);
        Integer term5091 = new Integer(379523101);
        Integer term5093 = new Integer(1017354215);
        Integer term5098 = new Integer(695330987);
        Object term5097 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5102 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5097, term5097.getClass(), "id", term5098);
        setField(term5097, term5097.getClass(), "facilityName", "");
        setField(term5097, term5097.getClass(), "facilityState", "");
        setField(term5102, term5102.getClass(), "date", null);
        setField(term5102, term5102.getClass(), "time", null);
        setField(term5097, term5097.getClass(), "buyTime", term5102);
        Integer term5104 = new Integer(-267289967);
        Object term5103 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5108 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5103, term5103.getClass(), "id", term5104);
        setField(term5103, term5103.getClass(), "facilityName", "");
        setField(term5103, term5103.getClass(), "facilityState", "");
        setField(term5108, term5108.getClass(), "date", null);
        setField(term5108, term5108.getClass(), "time", null);
        setField(term5103, term5103.getClass(), "buyTime", term5108);
        Integer term5110 = new Integer(773432822);
        Object term5109 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5114 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5109, term5109.getClass(), "id", term5110);
        setField(term5109, term5109.getClass(), "facilityName", "");
        setField(term5109, term5109.getClass(), "facilityState", "");
        setField(term5114, term5114.getClass(), "date", null);
        setField(term5114, term5114.getClass(), "time", null);
        setField(term5109, term5109.getClass(), "buyTime", term5114);
        Integer term5116 = new Integer(-488294922);
        Object term5115 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5120 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5115, term5115.getClass(), "id", term5116);
        setField(term5115, term5115.getClass(), "facilityName", "");
        setField(term5115, term5115.getClass(), "facilityState", "");
        setField(term5120, term5120.getClass(), "date", null);
        setField(term5120, term5120.getClass(), "time", null);
        setField(term5115, term5115.getClass(), "buyTime", term5120);
        Integer term5122 = new Integer(-397161164);
        Object term5121 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5126 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5121, term5121.getClass(), "id", term5122);
        setField(term5121, term5121.getClass(), "facilityName", "");
        setField(term5121, term5121.getClass(), "facilityState", "");
        setField(term5126, term5126.getClass(), "date", null);
        setField(term5126, term5126.getClass(), "time", null);
        setField(term5121, term5121.getClass(), "buyTime", term5126);
        Integer term5128 = new Integer(-703717191);
        Object term5127 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5132 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5127, term5127.getClass(), "id", term5128);
        setField(term5127, term5127.getClass(), "facilityName", "");
        setField(term5127, term5127.getClass(), "facilityState", "");
        setField(term5132, term5132.getClass(), "date", null);
        setField(term5132, term5132.getClass(), "time", null);
        setField(term5127, term5127.getClass(), "buyTime", term5132);
        Integer term5134 = new Integer(-1255535445);
        Object term5133 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5138 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5133, term5133.getClass(), "id", term5134);
        setField(term5133, term5133.getClass(), "facilityName", "");
        setField(term5133, term5133.getClass(), "facilityState", "");
        setField(term5138, term5138.getClass(), "date", null);
        setField(term5138, term5138.getClass(), "time", null);
        setField(term5133, term5133.getClass(), "buyTime", term5138);
        ArrayList term5095 = new ArrayList();
        ((ArrayList) term5095).add(term5097);
        ((ArrayList) term5095).add(term5103);
        ((ArrayList) term5095).add(term5109);
        ((ArrayList) term5095).add(term5115);
        ((ArrayList) term5095).add(term5121);
        ((ArrayList) term5095).add(term5127);
        ((ArrayList) term5095).add(term5133);
        term5064 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5064, term5064.getClass(), "id", term5065);
        setField(term5064, term5064.getClass(), "roomName", "usnNnhdlFi");
        setField(term5064, term5064.getClass(), "roomAddr", "QXQboaRWMP");
        setField(term5064, term5064.getClass(), "peoples", term5091);
        setField(term5064, term5064.getClass(), "meetroomState", term5093);
        setField(term5064, term5064.getClass(), "facilities", term5095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hESiinBBOz";
        callMethod(klass, "setRoomName", argTypes, term5064, args);
    }

};


