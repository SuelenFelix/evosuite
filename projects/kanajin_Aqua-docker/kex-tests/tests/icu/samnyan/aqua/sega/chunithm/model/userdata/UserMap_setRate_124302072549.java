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
import java.lang.Integer;

public class UserMap_setRate_124302072549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291304;
     Object term291315;

    public UserMap_setRate_124302072549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291304 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291304, term291304.getClass(), "id", 0L);
        setField(term291304, term291304.getClass(), "user", null);
        setIntField(term291304, term291304.getClass(), "mapId", 0);
        setIntField(term291304, term291304.getClass(), "position", 0);
        setBooleanField(term291304, term291304.getClass(), "isClear", false);
        setIntField(term291304, term291304.getClass(), "areaId", 0);
        setIntField(term291304, term291304.getClass(), "routeNumber", 0);
        setIntField(term291304, term291304.getClass(), "eventId", 0);
        setIntField(term291304, term291304.getClass(), "rate", 0);
        setIntField(term291304, term291304.getClass(), "statusCount", 0);
        setBooleanField(term291304, term291304.getClass(), "isValid", false);
        term291315 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291315;
        callMethod(klass, "setRate", argTypes, term291304, args);
    }

};


