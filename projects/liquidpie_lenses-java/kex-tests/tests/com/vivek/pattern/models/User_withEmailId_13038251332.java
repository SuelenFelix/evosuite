package com.vivek.pattern.models;

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
import static com.vivek.pattern.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class User_withEmailId_13038251332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614;

    public User_withEmailId_13038251332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term653 = new Integer(-2038273078);
        term614 = newInstance(Class.forName("com.vivek.pattern.models.User"));
        Object term639 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term640 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term641 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term648 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term614, term614.getClass(), "username", "RkybSrpybU");
        setField(term614, term614.getClass(), "emailId", "xOEqzGAmDU");
        setField(term641, term641.getClass(), "title", "");
        setField(term640, term640.getClass(), "movie", term641);
        setIntField(term644, term644.getClass(), "year", 2012);
        setShortField(term644, term644.getClass(), "month", (short) 9);
        setShortField(term644, term644.getClass(), "day", (short) 11);
        setField(term643, term643.getClass(), "date", term644);
        setByteField(term648, term648.getClass(), "hour", (byte) 22);
        setByteField(term648, term648.getClass(), "minute", (byte) 10);
        setByteField(term648, term648.getClass(), "second", (byte) 8);
        setIntField(term648, term648.getClass(), "nano", 380008862);
        setField(term643, term643.getClass(), "time", term648);
        setField(term640, term640.getClass(), "dateTime", term643);
        setField(term639, term639.getClass(), "show", term640);
        setField(term639, term639.getClass(), "numSeats", term653);
        setField(term614, term614.getClass(), "booking", term639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "withEmailId", argTypes, term614, args);
    }

};


