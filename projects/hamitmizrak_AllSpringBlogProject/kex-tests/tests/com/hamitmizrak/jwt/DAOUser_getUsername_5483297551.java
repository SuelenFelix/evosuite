package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class DAOUser_getUsername_5483297551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;

    public DAOUser_getUsername_5483297551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term760 = new Long(2442117782898005296L);
        term733 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term758 = newInstance(Class.forName("java.util.Date"));
        Object term774 = newInstance(Class.forName("java.util.Date"));
        Object term788 = newInstance(Class.forName("java.util.Date"));
        setField(term733, term733.getClass(), "username", "AijpHYOFuy");
        setField(term733, term733.getClass(), "password", "SbAoxhfrkn");
        setLongField(term758, term758.getClass(), "fastTime", 1345871412244L);
        setField(term758, term758.getClass(), "cdate", null);
        setField(term733, term733.getClass(), "date", term758);
        setField(term733, term733.getClass(), "id", term760);
        setField(term733, term733.getClass(), "createdBy", "kuTXqwMtDB");
        setLongField(term774, term774.getClass(), "fastTime", 1480438351369L);
        setField(term774, term774.getClass(), "cdate", null);
        setField(term733, term733.getClass(), "createdDate", term774);
        setField(term733, term733.getClass(), "updateBy", "Ghbwtircqb");
        setLongField(term788, term788.getClass(), "fastTime", 1610940182830L);
        setField(term788, term788.getClass(), "cdate", null);
        setField(term733, term733.getClass(), "updateDate", term788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term733, args);
    }

};


