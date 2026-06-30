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

public class ModuleEntry_getEndDate_140027118022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228820;

    public ModuleEntry_getEndDate_140027118022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228820 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        setIntField(term4228820, term4228820.getClass(), "ID", 0);
        setField(term4228820, term4228820.getClass(), "Name", null);
        setIntField(term4228820, term4228820.getClass(), "Price", 0);
        setField(term4228820, term4228820.getClass(), "ReleaseDate", null);
        setField(term4228820, term4228820.getClass(), "EndDate", null);
        setIntField(term4228820, term4228820.getClass(), "SortOrder", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term4228820, args);
    }

};


