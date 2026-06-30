package icu.samnyan.aqua.sega.general.service;

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
import static icu.samnyan.aqua.sega.general.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClientSettingService_writeSetting_18888425560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ClientSettingService_writeSetting_18888425560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term38 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "uuid", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "romVersion", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "dataVersion", "MuLcgQHgqz");
        setIntField(term39, term39.getClass(), "year", 2012);
        setShortField(term39, term39.getClass(), "month", (short) 8);
        setShortField(term39, term39.getClass(), "day", (short) 25);
        setField(term38, term38.getClass(), "date", term39);
        setByteField(term43, term43.getClass(), "hour", (byte) 5);
        setByteField(term43, term43.getClass(), "minute", (byte) 20);
        setByteField(term43, term43.getClass(), "second", (byte) 50);
        setIntField(term43, term43.getClass(), "nano", 345595912);
        setField(term38, term38.getClass(), "time", term43);
        setField(term1, term1.getClass(), "lastTime", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.service.ClientSettingService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "writeSetting", argTypes, null, args);
    }

};


