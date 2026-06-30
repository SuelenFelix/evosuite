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

public class ModuleEntry_canEqual_6286902931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228862;

    public ModuleEntry_canEqual_6286902931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228862 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        setIntField(term4228862, term4228862.getClass(), "ID", 0);
        setField(term4228862, term4228862.getClass(), "Name", null);
        setIntField(term4228862, term4228862.getClass(), "Price", 0);
        setField(term4228862, term4228862.getClass(), "ReleaseDate", null);
        setField(term4228862, term4228862.getClass(), "EndDate", null);
        setIntField(term4228862, term4228862.getClass(), "SortOrder", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term4228862, args);
    }

};


