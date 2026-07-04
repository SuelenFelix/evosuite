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

public class Room_setRoomName_18700128668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5063;

    public Room_setRoomName_18700128668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5064 = new Integer(30837706);
        Integer term5090 = new Integer(379523101);
        Integer term5092 = new Integer(1017354215);
        Integer term5097 = new Integer(695330987);
        Object term5096 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5101 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5096, term5096.getClass(), "id", term5097);
        setField(term5096, term5096.getClass(), "facilityName", "");
        setField(term5096, term5096.getClass(), "facilityState", "");
        setField(term5101, term5101.getClass(), "date", null);
        setField(term5101, term5101.getClass(), "time", null);
        setField(term5096, term5096.getClass(), "buyTime", term5101);
        Integer term5103 = new Integer(-267289967);
        Object term5102 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5107 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5102, term5102.getClass(), "id", term5103);
        setField(term5102, term5102.getClass(), "facilityName", "");
        setField(term5102, term5102.getClass(), "facilityState", "");
        setField(term5107, term5107.getClass(), "date", null);
        setField(term5107, term5107.getClass(), "time", null);
        setField(term5102, term5102.getClass(), "buyTime", term5107);
        Integer term5109 = new Integer(773432822);
        Object term5108 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5113 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5108, term5108.getClass(), "id", term5109);
        setField(term5108, term5108.getClass(), "facilityName", "");
        setField(term5108, term5108.getClass(), "facilityState", "");
        setField(term5113, term5113.getClass(), "date", null);
        setField(term5113, term5113.getClass(), "time", null);
        setField(term5108, term5108.getClass(), "buyTime", term5113);
        Integer term5115 = new Integer(-488294922);
        Object term5114 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5119 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5114, term5114.getClass(), "id", term5115);
        setField(term5114, term5114.getClass(), "facilityName", "");
        setField(term5114, term5114.getClass(), "facilityState", "");
        setField(term5119, term5119.getClass(), "date", null);
        setField(term5119, term5119.getClass(), "time", null);
        setField(term5114, term5114.getClass(), "buyTime", term5119);
        Integer term5121 = new Integer(-397161164);
        Object term5120 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5125 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5120, term5120.getClass(), "id", term5121);
        setField(term5120, term5120.getClass(), "facilityName", "");
        setField(term5120, term5120.getClass(), "facilityState", "");
        setField(term5125, term5125.getClass(), "date", null);
        setField(term5125, term5125.getClass(), "time", null);
        setField(term5120, term5120.getClass(), "buyTime", term5125);
        Integer term5127 = new Integer(-703717191);
        Object term5126 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5131 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5126, term5126.getClass(), "id", term5127);
        setField(term5126, term5126.getClass(), "facilityName", "");
        setField(term5126, term5126.getClass(), "facilityState", "");
        setField(term5131, term5131.getClass(), "date", null);
        setField(term5131, term5131.getClass(), "time", null);
        setField(term5126, term5126.getClass(), "buyTime", term5131);
        Integer term5133 = new Integer(-1255535445);
        Object term5132 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5137 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5132, term5132.getClass(), "id", term5133);
        setField(term5132, term5132.getClass(), "facilityName", "");
        setField(term5132, term5132.getClass(), "facilityState", "");
        setField(term5137, term5137.getClass(), "date", null);
        setField(term5137, term5137.getClass(), "time", null);
        setField(term5132, term5132.getClass(), "buyTime", term5137);
        ArrayList term5094 = new ArrayList();
        ((ArrayList) term5094).add(term5096);
        ((ArrayList) term5094).add(term5102);
        ((ArrayList) term5094).add(term5108);
        ((ArrayList) term5094).add(term5114);
        ((ArrayList) term5094).add(term5120);
        ((ArrayList) term5094).add(term5126);
        ((ArrayList) term5094).add(term5132);
        term5063 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5063, term5063.getClass(), "id", term5064);
        setField(term5063, term5063.getClass(), "roomName", "usnNnhdlFi");
        setField(term5063, term5063.getClass(), "roomAddr", "QXQboaRWMP");
        setField(term5063, term5063.getClass(), "peoples", term5090);
        setField(term5063, term5063.getClass(), "meetroomState", term5092);
        setField(term5063, term5063.getClass(), "facilities", term5094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hESiinBBOz";
        callMethod(klass, "setRoomName", argTypes, term5063, args);
    }

};


