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

public class PvListRequest_setCreationDate_113707088921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091513;

    public PvListRequest_setCreationDate_113707088921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4091513 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        setField(term4091513, term4091513.getClass(), "CreationDate", null);
        setField(term4091513, term4091513.getClass(), "Easy", null);
        setField(term4091513, term4091513.getClass(), "Normal", null);
        setField(term4091513, term4091513.getClass(), "Hard", null);
        setField(term4091513, term4091513.getClass(), "Extreme", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreationDate", argTypes, term4091513, args);
    }

};


