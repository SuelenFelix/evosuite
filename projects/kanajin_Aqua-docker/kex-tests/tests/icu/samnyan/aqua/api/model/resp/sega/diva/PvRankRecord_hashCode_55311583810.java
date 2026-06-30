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

public class PvRankRecord_hashCode_55311583810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public PvRankRecord_hashCode_55311583810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PvRankRecord"));
        setLongField(term291, term291.getClass(), "id", -8885298608300233488L);
        setField(term291, term291.getClass(), "playerName", "uuaPigETmJ");
        setIntField(term291, term291.getClass(), "score", -2068769794);
        setIntField(term291, term291.getClass(), "attain", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.diva.PvRankRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term291, args);
    }

};


