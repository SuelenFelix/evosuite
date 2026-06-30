package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class BuyModuleResponse_setMdlid_10728109807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7409;
     Object term7472;

    public BuyModuleResponse_setMdlid_10728109807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7475 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term7474 = ((Class) term7475).getDeclaredField((String) "SUCCESS");
        ((Field) term7474).setAccessible(true);
        Object enum21 = ((Field) term7474).get((Object) null);
        term7409 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term7409, term7409.getClass(), "shp_rslt", enum21);
        setIntField(term7409, term7409.getClass(), "mdl_id", -73683645);
        setField(term7409, term7409.getClass(), "mdl_have", "oVgzLbrsFr");
        setIntField(term7409, term7409.getClass(), "vcld_pts", -226514366);
        setField(term7409, term7409.getClass(), "cmd", "vQVyKLdtaz");
        setField(term7409, term7409.getClass(), "req_id", "OWKQODBLzb");
        setField(term7409, term7409.getClass(), "stat", "wGmYcqUkgE");
        term7472 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7472;
        callMethod(klass, "setMdl_id", argTypes, term7409, args);
    }

};


