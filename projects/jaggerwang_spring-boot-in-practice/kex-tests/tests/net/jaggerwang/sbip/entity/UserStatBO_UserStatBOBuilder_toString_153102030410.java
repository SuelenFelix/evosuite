package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatBO_UserStatBOBuilder_toString_153102030410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12751;

    public UserStatBO_UserStatBOBuilder_toString_153102030410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12752 = new Long(-7904053112604879960L);
        Long term12754 = new Long(-6602460430714339690L);
        Long term12757 = new Long(21047099434645581L);
        Long term12760 = new Long(-8862087040734407227L);
        Long term12763 = new Long(-6394943900800506753L);
        Long term12766 = new Long(-4867941246533901410L);
        term12751 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12783 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12751, term12751.getClass(), "id", term12752);
        setField(term12751, term12751.getClass(), "userId", term12754);
        setBooleanField(term12751, term12751.getClass(), "postCount$set", true);
        setField(term12751, term12751.getClass(), "postCount$value", term12757);
        setBooleanField(term12751, term12751.getClass(), "likeCount$set", true);
        setField(term12751, term12751.getClass(), "likeCount$value", term12760);
        setBooleanField(term12751, term12751.getClass(), "followingCount$set", true);
        setField(term12751, term12751.getClass(), "followingCount$value", term12763);
        setBooleanField(term12751, term12751.getClass(), "followerCount$set", false);
        setField(term12751, term12751.getClass(), "followerCount$value", term12766);
        setIntField(term12769, term12769.getClass(), "year", 2019);
        setShortField(term12769, term12769.getClass(), "month", (short) 6);
        setShortField(term12769, term12769.getClass(), "day", (short) 12);
        setField(term12768, term12768.getClass(), "date", term12769);
        setByteField(term12773, term12773.getClass(), "hour", (byte) 5);
        setByteField(term12773, term12773.getClass(), "minute", (byte) 13);
        setByteField(term12773, term12773.getClass(), "second", (byte) 8);
        setIntField(term12773, term12773.getClass(), "nano", 838117658);
        setField(term12768, term12768.getClass(), "time", term12773);
        setField(term12751, term12751.getClass(), "createdAt", term12768);
        setIntField(term12779, term12779.getClass(), "year", 2014);
        setShortField(term12779, term12779.getClass(), "month", (short) 8);
        setShortField(term12779, term12779.getClass(), "day", (short) 13);
        setField(term12778, term12778.getClass(), "date", term12779);
        setByteField(term12783, term12783.getClass(), "hour", (byte) 13);
        setByteField(term12783, term12783.getClass(), "minute", (byte) 15);
        setByteField(term12783, term12783.getClass(), "second", (byte) 51);
        setIntField(term12783, term12783.getClass(), "nano", 433726678);
        setField(term12778, term12778.getClass(), "time", term12783);
        setField(term12751, term12751.getClass(), "updatedAt", term12778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12751, args);
    }

};


