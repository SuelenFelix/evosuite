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

public class ShopCatalogResponse_setShpctlglut_15698116823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12651;
     Object term12710;

    public ShopCatalogResponse_setShpctlglut_15698116823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12651 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse"));
        Object term12652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12657 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12653, term12653.getClass(), "year", 2021);
        setShortField(term12653, term12653.getClass(), "month", (short) 9);
        setShortField(term12653, term12653.getClass(), "day", (short) 7);
        setField(term12652, term12652.getClass(), "date", term12653);
        setByteField(term12657, term12657.getClass(), "hour", (byte) 5);
        setByteField(term12657, term12657.getClass(), "minute", (byte) 25);
        setByteField(term12657, term12657.getClass(), "second", (byte) 7);
        setIntField(term12657, term12657.getClass(), "nano", 755924076);
        setField(term12652, term12652.getClass(), "time", term12657);
        setField(term12651, term12651.getClass(), "shp_ctlg_lut", term12652);
        setField(term12651, term12651.getClass(), "shp_ctlg", "WaEcyVlcIx");
        setField(term12651, term12651.getClass(), "cmd", "ONcbPCQnHd");
        setField(term12651, term12651.getClass(), "req_id", "AobDaplFLl");
        setField(term12651, term12651.getClass(), "stat", "pDkMNnAGgv");
        term12710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12715 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12711, term12711.getClass(), "year", 2012);
        setShortField(term12711, term12711.getClass(), "month", (short) 2);
        setShortField(term12711, term12711.getClass(), "day", (short) 19);
        setField(term12710, term12710.getClass(), "date", term12711);
        setByteField(term12715, term12715.getClass(), "hour", (byte) 8);
        setByteField(term12715, term12715.getClass(), "minute", (byte) 4);
        setByteField(term12715, term12715.getClass(), "second", (byte) 43);
        setIntField(term12715, term12715.getClass(), "nano", 114930008);
        setField(term12710, term12710.getClass(), "time", term12715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term12710;
        callMethod(klass, "setShp_ctlg_lut", argTypes, term12651, args);
    }

};


