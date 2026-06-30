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

public class PvListResponse_setPvllut_5758998833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16379;
     Object term16438;

    public PvListResponse_setPvllut_5758998833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16379 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse"));
        Object term16380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16385 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16381, term16381.getClass(), "year", 2023);
        setShortField(term16381, term16381.getClass(), "month", (short) 9);
        setShortField(term16381, term16381.getClass(), "day", (short) 23);
        setField(term16380, term16380.getClass(), "date", term16381);
        setByteField(term16385, term16385.getClass(), "hour", (byte) 12);
        setByteField(term16385, term16385.getClass(), "minute", (byte) 55);
        setByteField(term16385, term16385.getClass(), "second", (byte) 58);
        setIntField(term16385, term16385.getClass(), "nano", 159178396);
        setField(term16380, term16380.getClass(), "time", term16385);
        setField(term16379, term16379.getClass(), "pvl_lut", term16380);
        setField(term16379, term16379.getClass(), "pv_lst", "nOKlKlNhtU");
        setField(term16379, term16379.getClass(), "cmd", "gXFNBHJSey");
        setField(term16379, term16379.getClass(), "req_id", "wUcSfItZgv");
        setField(term16379, term16379.getClass(), "stat", "rOfPCPHmtJ");
        term16438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16443 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16439, term16439.getClass(), "year", 2028);
        setShortField(term16439, term16439.getClass(), "month", (short) 10);
        setShortField(term16439, term16439.getClass(), "day", (short) 1);
        setField(term16438, term16438.getClass(), "date", term16439);
        setByteField(term16443, term16443.getClass(), "hour", (byte) 17);
        setByteField(term16443, term16443.getClass(), "minute", (byte) 29);
        setByteField(term16443, term16443.getClass(), "second", (byte) 30);
        setIntField(term16443, term16443.getClass(), "nano", 845472306);
        setField(term16438, term16438.getClass(), "time", term16443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term16438;
        callMethod(klass, "setPvl_lut", argTypes, term16379, args);
    }

};


