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
import java.lang.Integer;

public class MapEncountNpc_setMusicId_132918932123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184541;
     Object term184545;

    public MapEncountNpc_setMusicId_132918932123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184541 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc"));
        setLongField(term184541, term184541.getClass(), "id", 0L);
        setIntField(term184541, term184541.getClass(), "npcId", 0);
        setIntField(term184541, term184541.getClass(), "musicId", 0);
        setField(term184541, term184541.getClass(), "userExtend", null);
        setField(term184541, term184541.getClass(), "user", null);
        term184545 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.MapEncountNpc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184545;
        callMethod(klass, "setMusicId", argTypes, term184541, args);
    }

};


