package com.example.pdf.model;

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
import static com.example.pdf.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Student_getEmail_15564508754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;

    public Student_getEmail_15564508754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term653 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term693 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term600, term600.getClass(), "id", "eZFUvlxvGV");
        setField(term600, term600.getClass(), "name", "BYqFIqCKAV");
        setField(term600, term600.getClass(), "email", "vrQLuWIDJX");
        setField(term600, term600.getClass(), "password", "flxyYxBRtu");
        setIntField(term649, term649.getClass(), "year", 2015);
        setShortField(term649, term649.getClass(), "month", (short) 9);
        setShortField(term649, term649.getClass(), "day", (short) 19);
        setField(term600, term600.getClass(), "birthday", term649);
        setField(term653, term653.getClass(), "id", "OclPbYPkcH");
        setField(term653, term653.getClass(), "name", "IoAlmYsBwc");
        setIntField(term679, term679.getClass(), "year", 2024);
        setShortField(term679, term679.getClass(), "month", (short) 1);
        setShortField(term679, term679.getClass(), "day", (short) 24);
        setField(term678, term678.getClass(), "date", term679);
        setByteField(term683, term683.getClass(), "hour", (byte) 20);
        setByteField(term683, term683.getClass(), "minute", (byte) 28);
        setByteField(term683, term683.getClass(), "second", (byte) 39);
        setIntField(term683, term683.getClass(), "nano", 952728177);
        setField(term678, term678.getClass(), "time", term683);
        setField(term653, term653.getClass(), "createdAt", term678);
        setField(term600, term600.getClass(), "school", term653);
        setIntField(term689, term689.getClass(), "year", 2029);
        setShortField(term689, term689.getClass(), "month", (short) 8);
        setShortField(term689, term689.getClass(), "day", (short) 29);
        setField(term688, term688.getClass(), "date", term689);
        setByteField(term693, term693.getClass(), "hour", (byte) 15);
        setByteField(term693, term693.getClass(), "minute", (byte) 50);
        setByteField(term693, term693.getClass(), "second", (byte) 1);
        setIntField(term693, term693.getClass(), "nano", 277971904);
        setField(term688, term688.getClass(), "time", term693);
        setField(term600, term600.getClass(), "createdAt", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term600, args);
    }

};


