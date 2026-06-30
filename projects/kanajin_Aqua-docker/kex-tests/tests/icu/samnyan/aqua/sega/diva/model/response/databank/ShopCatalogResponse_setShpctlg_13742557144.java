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

public class ShopCatalogResponse_setShpctlg_13742557144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12760;

    public ShopCatalogResponse_setShpctlg_13742557144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12760 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse"));
        Object term12761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12766 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12762, term12762.getClass(), "year", 2017);
        setShortField(term12762, term12762.getClass(), "month", (short) 6);
        setShortField(term12762, term12762.getClass(), "day", (short) 8);
        setField(term12761, term12761.getClass(), "date", term12762);
        setByteField(term12766, term12766.getClass(), "hour", (byte) 0);
        setByteField(term12766, term12766.getClass(), "minute", (byte) 18);
        setByteField(term12766, term12766.getClass(), "second", (byte) 55);
        setIntField(term12766, term12766.getClass(), "nano", 680586717);
        setField(term12761, term12761.getClass(), "time", term12766);
        setField(term12760, term12760.getClass(), "shp_ctlg_lut", term12761);
        setField(term12760, term12760.getClass(), "shp_ctlg", "PaCpFXGzdX");
        setField(term12760, term12760.getClass(), "cmd", "FftYCNbnks");
        setField(term12760, term12760.getClass(), "req_id", "lJoltmsadS");
        setField(term12760, term12760.getClass(), "stat", "mvfDtZNEHr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bvSgmFUDOU";
        callMethod(klass, "setShp_ctlg", argTypes, term12760, args);
    }

};


