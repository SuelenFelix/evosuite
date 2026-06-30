package icu.samnyan.aqua.api.model.resp.sega.diva;

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
import static icu.samnyan.aqua.api.model.resp.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PvRankRecord_getAttain_13276081623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public PvRankRecord_getAttain_13276081623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PvRankRecord"));
        setLongField(term79, term79.getClass(), "id", -8400487765614892086L);
        setField(term79, term79.getClass(), "playerName", "xxtlPwDYFs");
        setIntField(term79, term79.getClass(), "score", -1955890973);
        setIntField(term79, term79.getClass(), "attain", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PvRankRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttain", argTypes, term79, args);
    }

};


