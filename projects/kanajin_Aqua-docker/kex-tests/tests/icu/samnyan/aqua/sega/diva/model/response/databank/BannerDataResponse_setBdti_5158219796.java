package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BannerDataResponse_setBdti_5158219796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743;

    public BannerDataResponse_setBdti_5158219796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term749 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term745, term745.getClass(), "year", 2024);
        setShortField(term745, term745.getClass(), "month", (short) 1);
        setShortField(term745, term745.getClass(), "day", (short) 24);
        setField(term744, term744.getClass(), "date", term745);
        setByteField(term749, term749.getClass(), "hour", (byte) 20);
        setByteField(term749, term749.getClass(), "minute", (byte) 28);
        setByteField(term749, term749.getClass(), "second", (byte) 39);
        setIntField(term749, term749.getClass(), "nano", 952728177);
        setField(term744, term744.getClass(), "time", term749);
        setField(term743, term743.getClass(), "bd_ut", term744);
        setField(term743, term743.getClass(), "bd_ti", "OWDIEULEFu");
        setField(term743, term743.getClass(), "bd_hs", "dWRymuLBtr");
        setIntField(term743, term743.getClass(), "bd_id", -1955890973);
        setField(term743, term743.getClass(), "cmd", "AijpHYOFuy");
        setField(term743, term743.getClass(), "req_id", "SbAoxhfrkn");
        setField(term743, term743.getClass(), "stat", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setBd_ti", argTypes, term743, args);
    }

};


