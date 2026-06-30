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

public class UserMap_setEventId_202476757848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291291;
     Object term291302;

    public UserMap_setEventId_202476757848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291291 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291291, term291291.getClass(), "id", 0L);
        setField(term291291, term291291.getClass(), "user", null);
        setIntField(term291291, term291291.getClass(), "mapId", 0);
        setIntField(term291291, term291291.getClass(), "position", 0);
        setBooleanField(term291291, term291291.getClass(), "isClear", false);
        setIntField(term291291, term291291.getClass(), "areaId", 0);
        setIntField(term291291, term291291.getClass(), "routeNumber", 0);
        setIntField(term291291, term291291.getClass(), "eventId", 0);
        setIntField(term291291, term291291.getClass(), "rate", 0);
        setIntField(term291291, term291291.getClass(), "statusCount", 0);
        setBooleanField(term291291, term291291.getClass(), "isValid", false);
        term291302 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291302;
        callMethod(klass, "setEventId", argTypes, term291291, args);
    }

};


