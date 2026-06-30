package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DivaCustomize_getName_12988261402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28848;

    public DivaCustomize_getName_12988261402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term28863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28878 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28848, term28848.getClass(), "id", -1556527718);
        setField(term28848, term28848.getClass(), "name", "QnZKCwkmMh");
        setIntField(term28848, term28848.getClass(), "price", 895255351);
        setIntField(term28864, term28864.getClass(), "year", 2019);
        setShortField(term28864, term28864.getClass(), "month", (short) 2);
        setShortField(term28864, term28864.getClass(), "day", (short) 21);
        setField(term28863, term28863.getClass(), "date", term28864);
        setByteField(term28868, term28868.getClass(), "hour", (byte) 5);
        setByteField(term28868, term28868.getClass(), "minute", (byte) 41);
        setByteField(term28868, term28868.getClass(), "second", (byte) 11);
        setIntField(term28868, term28868.getClass(), "nano", 859829782);
        setField(term28863, term28863.getClass(), "time", term28868);
        setField(term28848, term28848.getClass(), "releaseDate", term28863);
        setIntField(term28874, term28874.getClass(), "year", 2018);
        setShortField(term28874, term28874.getClass(), "month", (short) 9);
        setShortField(term28874, term28874.getClass(), "day", (short) 28);
        setField(term28873, term28873.getClass(), "date", term28874);
        setByteField(term28878, term28878.getClass(), "hour", (byte) 3);
        setByteField(term28878, term28878.getClass(), "minute", (byte) 37);
        setByteField(term28878, term28878.getClass(), "second", (byte) 46);
        setIntField(term28878, term28878.getClass(), "nano", 763326845);
        setField(term28873, term28873.getClass(), "time", term28878);
        setField(term28848, term28848.getClass(), "endDate", term28873);
        setIntField(term28848, term28848.getClass(), "sortOrder", -1317044799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28848, args);
    }

};


