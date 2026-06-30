package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BannerDataHandler_handle_7852305263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8757;

    public BannerDataHandler_handle_7852305263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8757 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerDataHandler"));
        setField(term8757, term8757.getClass(), "mapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerDataHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handle", argTypes, term8757, args);
    }

};


