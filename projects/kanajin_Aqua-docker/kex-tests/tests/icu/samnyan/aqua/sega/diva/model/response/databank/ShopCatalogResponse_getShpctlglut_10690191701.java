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

public class ShopCatalogResponse_getShpctlglut_10690191701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12453;

    public ShopCatalogResponse_getShpctlglut_10690191701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12453 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse"));
        Object term12454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12459 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12455, term12455.getClass(), "year", 2018);
        setShortField(term12455, term12455.getClass(), "month", (short) 9);
        setShortField(term12455, term12455.getClass(), "day", (short) 28);
        setField(term12454, term12454.getClass(), "date", term12455);
        setByteField(term12459, term12459.getClass(), "hour", (byte) 3);
        setByteField(term12459, term12459.getClass(), "minute", (byte) 37);
        setByteField(term12459, term12459.getClass(), "second", (byte) 46);
        setIntField(term12459, term12459.getClass(), "nano", 763326845);
        setField(term12454, term12454.getClass(), "time", term12459);
        setField(term12453, term12453.getClass(), "shp_ctlg_lut", term12454);
        setField(term12453, term12453.getClass(), "shp_ctlg", "QpYltHAdyY");
        setField(term12453, term12453.getClass(), "cmd", "lbmSGBwIiV");
        setField(term12453, term12453.getClass(), "req_id", "DAxyHoTLzZ");
        setField(term12453, term12453.getClass(), "stat", "fhZgTouhCC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_ctlg_lut", argTypes, term12453, args);
    }

};


