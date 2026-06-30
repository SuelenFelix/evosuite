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

public class UserMap_setMapId_21481700043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291226;
     Object term291237;

    public UserMap_setMapId_21481700043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291226 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291226, term291226.getClass(), "id", 0L);
        setField(term291226, term291226.getClass(), "user", null);
        setIntField(term291226, term291226.getClass(), "mapId", 0);
        setIntField(term291226, term291226.getClass(), "position", 0);
        setBooleanField(term291226, term291226.getClass(), "isClear", false);
        setIntField(term291226, term291226.getClass(), "areaId", 0);
        setIntField(term291226, term291226.getClass(), "routeNumber", 0);
        setIntField(term291226, term291226.getClass(), "eventId", 0);
        setIntField(term291226, term291226.getClass(), "rate", 0);
        setIntField(term291226, term291226.getClass(), "statusCount", 0);
        setBooleanField(term291226, term291226.getClass(), "isValid", false);
        term291237 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291237;
        callMethod(klass, "setMapId", argTypes, term291226, args);
    }

};


