package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ModuleEntry_hashCode_131571833314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228664;

    public ModuleEntry_hashCode_131571833314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228664 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228684 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228694 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228664, term4228664.getClass(), "ID", -1136355054);
        setField(term4228664, term4228664.getClass(), "Name", "KfDptparWv");
        setIntField(term4228664, term4228664.getClass(), "Price", 1112853126);
        setIntField(term4228680, term4228680.getClass(), "year", 2011);
        setShortField(term4228680, term4228680.getClass(), "month", (short) 10);
        setShortField(term4228680, term4228680.getClass(), "day", (short) 19);
        setField(term4228679, term4228679.getClass(), "date", term4228680);
        setByteField(term4228684, term4228684.getClass(), "hour", (byte) 7);
        setByteField(term4228684, term4228684.getClass(), "minute", (byte) 48);
        setByteField(term4228684, term4228684.getClass(), "second", (byte) 16);
        setIntField(term4228684, term4228684.getClass(), "nano", 744607752);
        setField(term4228679, term4228679.getClass(), "time", term4228684);
        setField(term4228664, term4228664.getClass(), "ReleaseDate", term4228679);
        setIntField(term4228690, term4228690.getClass(), "year", 2018);
        setShortField(term4228690, term4228690.getClass(), "month", (short) 10);
        setShortField(term4228690, term4228690.getClass(), "day", (short) 6);
        setField(term4228689, term4228689.getClass(), "date", term4228690);
        setByteField(term4228694, term4228694.getClass(), "hour", (byte) 18);
        setByteField(term4228694, term4228694.getClass(), "minute", (byte) 37);
        setByteField(term4228694, term4228694.getClass(), "second", (byte) 26);
        setIntField(term4228694, term4228694.getClass(), "nano", 590801873);
        setField(term4228689, term4228689.getClass(), "time", term4228694);
        setField(term4228664, term4228664.getClass(), "EndDate", term4228689);
        setIntField(term4228664, term4228664.getClass(), "SortOrder", -966964978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4228664, args);
    }

};


