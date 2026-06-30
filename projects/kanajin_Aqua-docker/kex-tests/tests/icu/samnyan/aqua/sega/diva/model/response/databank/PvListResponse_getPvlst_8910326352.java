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

public class PvListResponse_getPvlst_8910326352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16280;

    public PvListResponse_getPvlst_8910326352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16280 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse"));
        Object term16281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16286 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16282, term16282.getClass(), "year", 2025);
        setShortField(term16282, term16282.getClass(), "month", (short) 3);
        setShortField(term16282, term16282.getClass(), "day", (short) 9);
        setField(term16281, term16281.getClass(), "date", term16282);
        setByteField(term16286, term16286.getClass(), "hour", (byte) 5);
        setByteField(term16286, term16286.getClass(), "minute", (byte) 49);
        setByteField(term16286, term16286.getClass(), "second", (byte) 12);
        setIntField(term16286, term16286.getClass(), "nano", 791695028);
        setField(term16281, term16281.getClass(), "time", term16286);
        setField(term16280, term16280.getClass(), "pvl_lut", term16281);
        setField(term16280, term16280.getClass(), "pv_lst", "lHYNCJRiOv");
        setField(term16280, term16280.getClass(), "cmd", "QVLresHoaP");
        setField(term16280, term16280.getClass(), "req_id", "IbxeAMwLVt");
        setField(term16280, term16280.getClass(), "stat", "bShlAqoTmZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPv_lst", argTypes, term16280, args);
    }

};


