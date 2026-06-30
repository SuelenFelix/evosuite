package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameCharge_equals_143918895720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1891;
     Object term1949;

    public GameCharge_equals_143918895720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1891 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1932 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1891, term1891.getClass(), "id", -2585684163342970173L);
        setIntField(term1891, term1891.getClass(), "orderId", -893623680);
        setIntField(term1891, term1891.getClass(), "chargeId", -1963434938);
        setIntField(term1891, term1891.getClass(), "price", 906181092);
        setIntField(term1897, term1897.getClass(), "year", 2022);
        setShortField(term1897, term1897.getClass(), "month", (short) 11);
        setShortField(term1897, term1897.getClass(), "day", (short) 5);
        setField(term1896, term1896.getClass(), "date", term1897);
        setByteField(term1901, term1901.getClass(), "hour", (byte) 0);
        setByteField(term1901, term1901.getClass(), "minute", (byte) 51);
        setByteField(term1901, term1901.getClass(), "second", (byte) 23);
        setIntField(term1901, term1901.getClass(), "nano", 1140962);
        setField(term1896, term1896.getClass(), "time", term1901);
        setField(term1891, term1891.getClass(), "startDate", term1896);
        setIntField(term1907, term1907.getClass(), "year", 2020);
        setShortField(term1907, term1907.getClass(), "month", (short) 5);
        setShortField(term1907, term1907.getClass(), "day", (short) 24);
        setField(term1906, term1906.getClass(), "date", term1907);
        setByteField(term1911, term1911.getClass(), "hour", (byte) 2);
        setByteField(term1911, term1911.getClass(), "minute", (byte) 9);
        setByteField(term1911, term1911.getClass(), "second", (byte) 52);
        setIntField(term1911, term1911.getClass(), "nano", 653329393);
        setField(term1906, term1906.getClass(), "time", term1911);
        setField(term1891, term1891.getClass(), "endDate", term1906);
        setIntField(term1891, term1891.getClass(), "salePrice", 1045657203);
        setIntField(term1918, term1918.getClass(), "year", 2024);
        setShortField(term1918, term1918.getClass(), "month", (short) 9);
        setShortField(term1918, term1918.getClass(), "day", (short) 22);
        setField(term1917, term1917.getClass(), "date", term1918);
        setByteField(term1922, term1922.getClass(), "hour", (byte) 0);
        setByteField(term1922, term1922.getClass(), "minute", (byte) 11);
        setByteField(term1922, term1922.getClass(), "second", (byte) 7);
        setIntField(term1922, term1922.getClass(), "nano", 56643259);
        setField(term1917, term1917.getClass(), "time", term1922);
        setField(term1891, term1891.getClass(), "saleStartDate", term1917);
        setIntField(term1928, term1928.getClass(), "year", 2021);
        setShortField(term1928, term1928.getClass(), "month", (short) 12);
        setShortField(term1928, term1928.getClass(), "day", (short) 21);
        setField(term1927, term1927.getClass(), "date", term1928);
        setByteField(term1932, term1932.getClass(), "hour", (byte) 12);
        setByteField(term1932, term1932.getClass(), "minute", (byte) 59);
        setByteField(term1932, term1932.getClass(), "second", (byte) 52);
        setIntField(term1932, term1932.getClass(), "nano", 47081639);
        setField(term1927, term1927.getClass(), "time", term1932);
        setField(term1891, term1891.getClass(), "saleEndDate", term1927);
        setField(term1891, term1891.getClass(), "remarks", "RkybSrpybU");
        term1949 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1949;
        callMethod(klass, "equals", argTypes, term1891, args);
    }

};


