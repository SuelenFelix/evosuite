package com.zxl.dailypractice.project.entity;

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
import static com.zxl.dailypractice.project.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meetings_getRemark_7131052385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public Meetings_getRemark_7131052385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term467 = new Integer(-616727354);
        term466 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term505 = newInstance(Class.forName("java.util.Date"));
        setField(term466, term466.getClass(), "id", term467);
        setField(term466, term466.getClass(), "people", "hNxWaHcfhY");
        setField(term466, term466.getClass(), "subject", "RkybSrpybU");
        setField(term466, term466.getClass(), "context", "xOEqzGAmDU");
        setLongField(term505, term505.getClass(), "fastTime", 1515890130018L);
        setField(term505, term505.getClass(), "cdate", null);
        setField(term466, term466.getClass(), "time", term505);
        setField(term466, term466.getClass(), "remark", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemark", argTypes, term466, args);
    }

};


