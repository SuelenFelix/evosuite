package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMap_canEqual_214343659253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291354;

    public UserMap_canEqual_214343659253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291354 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291354, term291354.getClass(), "id", 0L);
        setField(term291354, term291354.getClass(), "user", null);
        setIntField(term291354, term291354.getClass(), "mapId", 0);
        setIntField(term291354, term291354.getClass(), "position", 0);
        setBooleanField(term291354, term291354.getClass(), "isClear", false);
        setIntField(term291354, term291354.getClass(), "areaId", 0);
        setIntField(term291354, term291354.getClass(), "routeNumber", 0);
        setIntField(term291354, term291354.getClass(), "eventId", 0);
        setIntField(term291354, term291354.getClass(), "rate", 0);
        setIntField(term291354, term291354.getClass(), "statusCount", 0);
        setBooleanField(term291354, term291354.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term291354, args);
    }

};


