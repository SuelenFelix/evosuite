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

public class UserMap_setRouteNumber_69618098947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291278;
     Object term291289;

    public UserMap_setRouteNumber_69618098947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291278 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291278, term291278.getClass(), "id", 0L);
        setField(term291278, term291278.getClass(), "user", null);
        setIntField(term291278, term291278.getClass(), "mapId", 0);
        setIntField(term291278, term291278.getClass(), "position", 0);
        setBooleanField(term291278, term291278.getClass(), "isClear", false);
        setIntField(term291278, term291278.getClass(), "areaId", 0);
        setIntField(term291278, term291278.getClass(), "routeNumber", 0);
        setIntField(term291278, term291278.getClass(), "eventId", 0);
        setIntField(term291278, term291278.getClass(), "rate", 0);
        setIntField(term291278, term291278.getClass(), "statusCount", 0);
        setBooleanField(term291278, term291278.getClass(), "isValid", false);
        term291289 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291289;
        callMethod(klass, "setRouteNumber", argTypes, term291278, args);
    }

};


