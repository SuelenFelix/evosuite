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

public class BannerDataResponse_getBdti_921535632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public BannerDataResponse_getBdti_921535632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        Object term246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term247, term247.getClass(), "year", 2015);
        setShortField(term247, term247.getClass(), "month", (short) 9);
        setShortField(term247, term247.getClass(), "day", (short) 19);
        setField(term246, term246.getClass(), "date", term247);
        setByteField(term251, term251.getClass(), "hour", (byte) 9);
        setByteField(term251, term251.getClass(), "minute", (byte) 4);
        setByteField(term251, term251.getClass(), "second", (byte) 10);
        setIntField(term251, term251.getClass(), "nano", 401765865);
        setField(term246, term246.getClass(), "time", term251);
        setField(term245, term245.getClass(), "bd_ut", term246);
        setField(term245, term245.getClass(), "bd_ti", "NRdvgJlhkX");
        setField(term245, term245.getClass(), "bd_hs", "uuaPigETmJ");
        setIntField(term245, term245.getClass(), "bd_id", 1484323161);
        setField(term245, term245.getClass(), "cmd", "MxlszYVzRf");
        setField(term245, term245.getClass(), "req_id", "LQFpaHEwXR");
        setField(term245, term245.getClass(), "stat", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_ti", argTypes, term245, args);
    }

};


