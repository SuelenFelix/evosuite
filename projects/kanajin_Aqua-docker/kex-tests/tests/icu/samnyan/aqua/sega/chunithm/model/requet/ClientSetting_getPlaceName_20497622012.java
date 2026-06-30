package icu.samnyan.aqua.sega.chunithm.model.requet;

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
import static icu.samnyan.aqua.sega.chunithm.model.requet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientSetting_getPlaceName_20497622012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75906;

    public ClientSetting_getPlaceName_20497622012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75906 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term75906, term75906.getClass(), "placeId", "kmMUYIoNgE");
        setField(term75906, term75906.getClass(), "clientId", "PfONuRjuSj");
        setField(term75906, term75906.getClass(), "placeName", "BxmcTjXInn");
        setField(term75906, term75906.getClass(), "regionId", "aVPQtBXJuy");
        setField(term75906, term75906.getClass(), "regionName", "SWtqfxdgNg");
        setField(term75906, term75906.getClass(), "allNetId", "jsgrwgnbEn");
        setField(term75906, term75906.getClass(), "bordId", "vwbyoYQzvo");
        setField(term75906, term75906.getClass(), "romVersion", "RtAsTvbELo");
        setField(term75906, term75906.getClass(), "dataVersion", "reFozIJLZz");
        setField(term75906, term75906.getClass(), "dumpFileNum", "oGDahLAYSF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term75906, args);
    }

};


