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
import java.lang.Object;

public class Meeting_setMeetingTime_138426741821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30285;

    public Meeting_setMeetingTime_138426741821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30286 = new Integer(1320826206);
        Integer term30368 = new Integer(-933702401);
        Integer term30370 = new Integer(1670477259);
        Integer term30385 = new Integer(186917839);
        term30285 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term30288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30339 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30285, term30285.getClass(), "id", term30286);
        setIntField(term30289, term30289.getClass(), "year", 2022);
        setShortField(term30289, term30289.getClass(), "month", (short) 8);
        setShortField(term30289, term30289.getClass(), "day", (short) 26);
        setField(term30288, term30288.getClass(), "date", term30289);
        setByteField(term30293, term30293.getClass(), "hour", (byte) 20);
        setByteField(term30293, term30293.getClass(), "minute", (byte) 26);
        setByteField(term30293, term30293.getClass(), "second", (byte) 55);
        setIntField(term30293, term30293.getClass(), "nano", 380890210);
        setField(term30288, term30288.getClass(), "time", term30293);
        setField(term30285, term30285.getClass(), "createTime", term30288);
        setField(term30285, term30285.getClass(), "name", "ShePVDEcbi");
        setField(term30285, term30285.getClass(), "link", "NHvBJYqOtH");
        setField(term30285, term30285.getClass(), "introduce", "uYPZFggHjB");
        setIntField(term30335, term30335.getClass(), "year", 2010);
        setShortField(term30335, term30335.getClass(), "month", (short) 6);
        setShortField(term30335, term30335.getClass(), "day", (short) 21);
        setField(term30334, term30334.getClass(), "date", term30335);
        setByteField(term30339, term30339.getClass(), "hour", (byte) 4);
        setByteField(term30339, term30339.getClass(), "minute", (byte) 6);
        setByteField(term30339, term30339.getClass(), "second", (byte) 54);
        setIntField(term30339, term30339.getClass(), "nano", 837855935);
        setField(term30334, term30334.getClass(), "time", term30339);
        setField(term30285, term30285.getClass(), "updateTime", term30334);
        setField(term30285, term30285.getClass(), "meetingTime", "pSDmcqMGRt");
        setField(term30285, term30285.getClass(), "signTime", "QDFLegmnlp");
        setField(term30285, term30285.getClass(), "signNumber", term30368);
        setField(term30285, term30285.getClass(), "userNumber", term30370);
        setField(term30285, term30285.getClass(), "fileUrl", "dNReVcCEho");
        setBooleanField(term30285, term30285.getClass(), "online", true);
        setField(term30285, term30285.getClass(), "deleted", term30385);
        setField(term30285, term30285.getClass(), "host", "TDiMGhbiHQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yjaHcOpjcZ";
        callMethod(klass, "setMeetingTime", argTypes, term30285, args);
    }

};


