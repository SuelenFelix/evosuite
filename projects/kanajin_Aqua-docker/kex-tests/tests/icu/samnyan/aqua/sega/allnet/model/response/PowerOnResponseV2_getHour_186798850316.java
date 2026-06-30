package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_getHour_186798850316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20935;

    public PowerOnResponseV2_getHour_186798850316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20935 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term20935, term20935.getClass(), "stat", 2098647989);
        setField(term20935, term20935.getClass(), "uri", "pbqJjeooBM");
        setField(term20935, term20935.getClass(), "host", "ccnotFfPXt");
        setField(term20935, term20935.getClass(), "place_id", "plWlgdgIhn");
        setField(term20935, term20935.getClass(), "name", "RZaKVKWtND");
        setField(term20935, term20935.getClass(), "nickname", "vXiaNiquft");
        setField(term20935, term20935.getClass(), "region0", "lucCeiVnYe");
        setField(term20935, term20935.getClass(), "region_name0", "iYwkCLMsbJ");
        setField(term20935, term20935.getClass(), "region_name1", "MXLsVQWrwc");
        setField(term20935, term20935.getClass(), "region_name2", "lRaSlqzqNY");
        setField(term20935, term20935.getClass(), "region_name3", "TiEyxWXsra");
        setField(term20935, term20935.getClass(), "country", "TuLgwTZsPP");
        setIntField(term20935, term20935.getClass(), "year", 1598895173);
        setIntField(term20935, term20935.getClass(), "month", 1830648570);
        setIntField(term20935, term20935.getClass(), "day", -227365013);
        setIntField(term20935, term20935.getClass(), "hour", 11724947);
        setIntField(term20935, term20935.getClass(), "minute", 1953277050);
        setIntField(term20935, term20935.getClass(), "second", 1283079251);
        setField(term20935, term20935.getClass(), "setting", "KoasxTJGpx");
        setField(term20935, term20935.getClass(), "timezone", "ceGeARYMoa");
        setField(term20935, term20935.getClass(), "res_class", "fFWllaiFvh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHour", argTypes, term20935, args);
    }

};


