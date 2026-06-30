package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MapEncountNpc_toString_72477278829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184567;

    public MapEncountNpc_toString_72477278829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184567 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc"));
        setLongField(term184567, term184567.getClass(), "id", 0L);
        setIntField(term184567, term184567.getClass(), "npcId", 0);
        setIntField(term184567, term184567.getClass(), "musicId", 0);
        setField(term184567, term184567.getClass(), "userExtend", null);
        setField(term184567, term184567.getClass(), "user", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term184567, args);
    }

};


