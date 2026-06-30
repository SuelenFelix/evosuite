package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendResponse_getAtndlut_15560337044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572;

    public AttendResponse_getAtndlut_15560337044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse"));
        Object term609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term614 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term572, term572.getClass(), "atnd_prm1", "BYqFIqCKAV");
        setField(term572, term572.getClass(), "atnd_prm2", "vrQLuWIDJX");
        setField(term572, term572.getClass(), "atnd_prm3", "flxyYxBRtu");
        setIntField(term610, term610.getClass(), "year", 2022);
        setShortField(term610, term610.getClass(), "month", (short) 2);
        setShortField(term610, term610.getClass(), "day", (short) 26);
        setField(term609, term609.getClass(), "date", term610);
        setByteField(term614, term614.getClass(), "hour", (byte) 11);
        setByteField(term614, term614.getClass(), "minute", (byte) 42);
        setByteField(term614, term614.getClass(), "second", (byte) 15);
        setIntField(term614, term614.getClass(), "nano", 377731937);
        setField(term609, term609.getClass(), "time", term614);
        setField(term572, term572.getClass(), "atnd_lut", term609);
        setField(term572, term572.getClass(), "cmd", "OclPbYPkcH");
        setField(term572, term572.getClass(), "req_id", "IoAlmYsBwc");
        setField(term572, term572.getClass(), "stat", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_lut", argTypes, term572, args);
    }

};


