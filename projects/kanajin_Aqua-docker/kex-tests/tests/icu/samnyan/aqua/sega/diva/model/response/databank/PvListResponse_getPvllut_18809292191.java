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

public class PvListResponse_getPvllut_18809292191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16181;

    public PvListResponse_getPvllut_18809292191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16181 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse"));
        Object term16182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16187 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16183, term16183.getClass(), "year", 2027);
        setShortField(term16183, term16183.getClass(), "month", (short) 8);
        setShortField(term16183, term16183.getClass(), "day", (short) 26);
        setField(term16182, term16182.getClass(), "date", term16183);
        setByteField(term16187, term16187.getClass(), "hour", (byte) 5);
        setByteField(term16187, term16187.getClass(), "minute", (byte) 11);
        setByteField(term16187, term16187.getClass(), "second", (byte) 9);
        setIntField(term16187, term16187.getClass(), "nano", 219245092);
        setField(term16182, term16182.getClass(), "time", term16187);
        setField(term16181, term16181.getClass(), "pvl_lut", term16182);
        setField(term16181, term16181.getClass(), "pv_lst", "asMqnMNrZp");
        setField(term16181, term16181.getClass(), "cmd", "pqFUMTCKJd");
        setField(term16181, term16181.getClass(), "req_id", "PTEndmPMzk");
        setField(term16181, term16181.getClass(), "stat", "aJQuCOCvZs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvl_lut", argTypes, term16181, args);
    }

};


