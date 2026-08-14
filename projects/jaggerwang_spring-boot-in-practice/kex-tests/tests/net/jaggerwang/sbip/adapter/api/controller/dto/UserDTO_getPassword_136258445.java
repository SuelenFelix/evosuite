package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_getPassword_136258445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;

    public UserDTO_getPassword_136258445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1787 = new Long(1233889271256172047L);
        Long term1837 = new Long(6617340557564669657L);
        Long term1872 = new Long(1439298019805881866L);
        Long term1874 = new Long(-8708192233349544946L);
        Class<? extends Object> term2062 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term2061 = ((Class) term2062).getDeclaredField((String) "LOCAL");
        ((Field) term2061).setAccessible(true);
        Object enum3 = ((Field) term2061).get((Object) null);
        Long term1922 = new Long(5907001541142728739L);
        HashMap term1968 = new HashMap();
        Long term1977 = new Long(4178434741742309755L);
        Long term1979 = new Long(-2068172595987555756L);
        Long term1981 = new Long(-6292278961887936280L);
        Long term1983 = new Long(-6645965768855543712L);
        Long term1985 = new Long(4784595517102746672L);
        Long term1987 = new Long(-7612550318181586304L);
        Boolean term2009 = new Boolean(false);
        term1786 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term1851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1871 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term1909 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1976 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term1989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2004 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1786, term1786.getClass(), "id", term1787);
        setField(term1786, term1786.getClass(), "username", "nyiiPDVjAc");
        setField(term1786, term1786.getClass(), "password", "aKnKipADSo");
        setField(term1786, term1786.getClass(), "mobile", "wSQxaModmm");
        setField(term1786, term1786.getClass(), "email", "UlajhuVLaP");
        setField(term1786, term1786.getClass(), "avatarId", term1837);
        setField(term1786, term1786.getClass(), "intro", "gGSMzuGICf");
        setIntField(term1852, term1852.getClass(), "year", 2014);
        setShortField(term1852, term1852.getClass(), "month", (short) 7);
        setShortField(term1852, term1852.getClass(), "day", (short) 13);
        setField(term1851, term1851.getClass(), "date", term1852);
        setByteField(term1856, term1856.getClass(), "hour", (byte) 21);
        setByteField(term1856, term1856.getClass(), "minute", (byte) 46);
        setByteField(term1856, term1856.getClass(), "second", (byte) 0);
        setIntField(term1856, term1856.getClass(), "nano", 887884128);
        setField(term1851, term1851.getClass(), "time", term1856);
        setField(term1786, term1786.getClass(), "createdAt", term1851);
        setIntField(term1862, term1862.getClass(), "year", 2023);
        setShortField(term1862, term1862.getClass(), "month", (short) 3);
        setShortField(term1862, term1862.getClass(), "day", (short) 7);
        setField(term1861, term1861.getClass(), "date", term1862);
        setByteField(term1866, term1866.getClass(), "hour", (byte) 21);
        setByteField(term1866, term1866.getClass(), "minute", (byte) 15);
        setByteField(term1866, term1866.getClass(), "second", (byte) 43);
        setIntField(term1866, term1866.getClass(), "nano", 639721472);
        setField(term1861, term1861.getClass(), "time", term1866);
        setField(term1786, term1786.getClass(), "updatedAt", term1861);
        setField(term1871, term1871.getClass(), "id", term1872);
        setField(term1871, term1871.getClass(), "userId", term1874);
        setField(term1871, term1871.getClass(), "region", enum3);
        setField(term1871, term1871.getClass(), "bucket", "hxCBltsObl");
        setField(term1871, term1871.getClass(), "path", "BndsHwAFMv");
        setField(term1909, term1909.getClass(), "name", "GzFkzHGYFt");
        setField(term1909, term1909.getClass(), "size", term1922);
        setField(term1909, term1909.getClass(), "type", "tShwQLRGNe");
        setField(term1871, term1871.getClass(), "meta", term1909);
        setIntField(term1937, term1937.getClass(), "year", 2015);
        setShortField(term1937, term1937.getClass(), "month", (short) 3);
        setShortField(term1937, term1937.getClass(), "day", (short) 10);
        setField(term1936, term1936.getClass(), "date", term1937);
        setByteField(term1941, term1941.getClass(), "hour", (byte) 23);
        setByteField(term1941, term1941.getClass(), "minute", (byte) 34);
        setByteField(term1941, term1941.getClass(), "second", (byte) 44);
        setIntField(term1941, term1941.getClass(), "nano", 587322824);
        setField(term1936, term1936.getClass(), "time", term1941);
        setField(term1871, term1871.getClass(), "createdAt", term1936);
        setIntField(term1947, term1947.getClass(), "year", 2027);
        setShortField(term1947, term1947.getClass(), "month", (short) 8);
        setShortField(term1947, term1947.getClass(), "day", (short) 26);
        setField(term1946, term1946.getClass(), "date", term1947);
        setByteField(term1951, term1951.getClass(), "hour", (byte) 5);
        setByteField(term1951, term1951.getClass(), "minute", (byte) 11);
        setByteField(term1951, term1951.getClass(), "second", (byte) 9);
        setIntField(term1951, term1951.getClass(), "nano", 219245092);
        setField(term1946, term1946.getClass(), "time", term1951);
        setField(term1871, term1871.getClass(), "updatedAt", term1946);
        setField(term1871, term1871.getClass(), "url", "LvtrsXUliU");
        setField(term1871, term1871.getClass(), "thumbs", term1968);
        setField(term1786, term1786.getClass(), "avatar", term1871);
        setField(term1976, term1976.getClass(), "id", term1977);
        setField(term1976, term1976.getClass(), "userId", term1979);
        setField(term1976, term1976.getClass(), "postCount", term1981);
        setField(term1976, term1976.getClass(), "likeCount", term1983);
        setField(term1976, term1976.getClass(), "followingCount", term1985);
        setField(term1976, term1976.getClass(), "followerCount", term1987);
        setIntField(term1990, term1990.getClass(), "year", 2025);
        setShortField(term1990, term1990.getClass(), "month", (short) 3);
        setShortField(term1990, term1990.getClass(), "day", (short) 9);
        setField(term1989, term1989.getClass(), "date", term1990);
        setByteField(term1994, term1994.getClass(), "hour", (byte) 5);
        setByteField(term1994, term1994.getClass(), "minute", (byte) 49);
        setByteField(term1994, term1994.getClass(), "second", (byte) 12);
        setIntField(term1994, term1994.getClass(), "nano", 791695028);
        setField(term1989, term1989.getClass(), "time", term1994);
        setField(term1976, term1976.getClass(), "createdAt", term1989);
        setIntField(term2000, term2000.getClass(), "year", 2023);
        setShortField(term2000, term2000.getClass(), "month", (short) 9);
        setShortField(term2000, term2000.getClass(), "day", (short) 23);
        setField(term1999, term1999.getClass(), "date", term2000);
        setByteField(term2004, term2004.getClass(), "hour", (byte) 12);
        setByteField(term2004, term2004.getClass(), "minute", (byte) 55);
        setByteField(term2004, term2004.getClass(), "second", (byte) 58);
        setIntField(term2004, term2004.getClass(), "nano", 159178396);
        setField(term1999, term1999.getClass(), "time", term2004);
        setField(term1976, term1976.getClass(), "updatedAt", term1999);
        setField(term1786, term1786.getClass(), "stat", term1976);
        setField(term1786, term1786.getClass(), "following", term2009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1786, args);
    }

};


