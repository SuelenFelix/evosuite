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

public class ShopCatalogResponse_setShpctlg_13742557149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12884;

    public ShopCatalogResponse_setShpctlg_13742557149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12884 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse"));
        setField(term12884, term12884.getClass(), "shp_ctlg_lut", null);
        setField(term12884, term12884.getClass(), "shp_ctlg", null);
        setField(term12884, term12884.getClass(), "cmd", null);
        setField(term12884, term12884.getClass(), "req_id", null);
        setField(term12884, term12884.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShp_ctlg", argTypes, term12884, args);
    }

};


