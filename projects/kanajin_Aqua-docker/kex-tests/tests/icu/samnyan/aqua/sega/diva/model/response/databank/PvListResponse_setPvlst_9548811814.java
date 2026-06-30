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

public class PvListResponse_setPvlst_9548811814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16488;

    public PvListResponse_setPvlst_9548811814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16488 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse"));
        Object term16489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16494 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16490, term16490.getClass(), "year", 2027);
        setShortField(term16490, term16490.getClass(), "month", (short) 2);
        setShortField(term16490, term16490.getClass(), "day", (short) 19);
        setField(term16489, term16489.getClass(), "date", term16490);
        setByteField(term16494, term16494.getClass(), "hour", (byte) 17);
        setByteField(term16494, term16494.getClass(), "minute", (byte) 37);
        setByteField(term16494, term16494.getClass(), "second", (byte) 27);
        setIntField(term16494, term16494.getClass(), "nano", 920380537);
        setField(term16489, term16489.getClass(), "time", term16494);
        setField(term16488, term16488.getClass(), "pvl_lut", term16489);
        setField(term16488, term16488.getClass(), "pv_lst", "EnmiAvfpJv");
        setField(term16488, term16488.getClass(), "cmd", "AdYzLPMcwe");
        setField(term16488, term16488.getClass(), "req_id", "FrTZLybkKk");
        setField(term16488, term16488.getClass(), "stat", "FlxVmiMYKP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fgOpAWlGYN";
        callMethod(klass, "setPv_lst", argTypes, term16488, args);
    }

};


