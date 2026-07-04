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

public class Meeting_getSignTime_8222008248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27805;

    public Meeting_getSignTime_8222008248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27806 = new Integer(73609068);
        Integer term27888 = new Integer(-1150137872);
        Integer term27890 = new Integer(-781333853);
        Integer term27905 = new Integer(158137467);
        term27805 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27813 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27859 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27805, term27805.getClass(), "id", term27806);
        setIntField(term27809, term27809.getClass(), "year", 2010);
        setShortField(term27809, term27809.getClass(), "month", (short) 8);
        setShortField(term27809, term27809.getClass(), "day", (short) 25);
        setField(term27808, term27808.getClass(), "date", term27809);
        setByteField(term27813, term27813.getClass(), "hour", (byte) 7);
        setByteField(term27813, term27813.getClass(), "minute", (byte) 13);
        setByteField(term27813, term27813.getClass(), "second", (byte) 16);
        setIntField(term27813, term27813.getClass(), "nano", 196716483);
        setField(term27808, term27808.getClass(), "time", term27813);
        setField(term27805, term27805.getClass(), "createTime", term27808);
        setField(term27805, term27805.getClass(), "name", "WeWWdLzBLg");
        setField(term27805, term27805.getClass(), "link", "bFRkUYAxoi");
        setField(term27805, term27805.getClass(), "introduce", "ibOCzSlAfB");
        setIntField(term27855, term27855.getClass(), "year", 2016);
        setShortField(term27855, term27855.getClass(), "month", (short) 2);
        setShortField(term27855, term27855.getClass(), "day", (short) 19);
        setField(term27854, term27854.getClass(), "date", term27855);
        setByteField(term27859, term27859.getClass(), "hour", (byte) 1);
        setByteField(term27859, term27859.getClass(), "minute", (byte) 32);
        setByteField(term27859, term27859.getClass(), "second", (byte) 43);
        setIntField(term27859, term27859.getClass(), "nano", 671735228);
        setField(term27854, term27854.getClass(), "time", term27859);
        setField(term27805, term27805.getClass(), "updateTime", term27854);
        setField(term27805, term27805.getClass(), "meetingTime", "FVWEzQNAbm");
        setField(term27805, term27805.getClass(), "signTime", "otxUlpZpcf");
        setField(term27805, term27805.getClass(), "signNumber", term27888);
        setField(term27805, term27805.getClass(), "userNumber", term27890);
        setField(term27805, term27805.getClass(), "fileUrl", "QjEwBIXDUi");
        setBooleanField(term27805, term27805.getClass(), "online", true);
        setField(term27805, term27805.getClass(), "deleted", term27905);
        setField(term27805, term27805.getClass(), "host", "mIyJMumZKG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignTime", argTypes, term27805, args);
    }

};


