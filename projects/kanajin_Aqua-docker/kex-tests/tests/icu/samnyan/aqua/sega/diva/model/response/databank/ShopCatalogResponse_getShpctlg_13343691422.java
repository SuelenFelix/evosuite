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

public class ShopCatalogResponse_getShpctlg_13343691422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12552;

    public ShopCatalogResponse_getShpctlg_13343691422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12552 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse"));
        Object term12553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12558 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12554, term12554.getClass(), "year", 2012);
        setShortField(term12554, term12554.getClass(), "month", (short) 9);
        setShortField(term12554, term12554.getClass(), "day", (short) 11);
        setField(term12553, term12553.getClass(), "date", term12554);
        setByteField(term12558, term12558.getClass(), "hour", (byte) 22);
        setByteField(term12558, term12558.getClass(), "minute", (byte) 10);
        setByteField(term12558, term12558.getClass(), "second", (byte) 8);
        setIntField(term12558, term12558.getClass(), "nano", 380008862);
        setField(term12553, term12553.getClass(), "time", term12558);
        setField(term12552, term12552.getClass(), "shp_ctlg_lut", term12553);
        setField(term12552, term12552.getClass(), "shp_ctlg", "wrikqJwXvL");
        setField(term12552, term12552.getClass(), "cmd", "UiWhvbypdr");
        setField(term12552, term12552.getClass(), "req_id", "CgleElJNje");
        setField(term12552, term12552.getClass(), "stat", "ZrchvNGMtd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_ctlg", argTypes, term12552, args);
    }

};


