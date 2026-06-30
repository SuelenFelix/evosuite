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
import java.lang.Boolean;

public class UserMap_setClear_23520415845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291252;
     Object term291263;

    public UserMap_setClear_23520415845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291252 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291252, term291252.getClass(), "id", 0L);
        setField(term291252, term291252.getClass(), "user", null);
        setIntField(term291252, term291252.getClass(), "mapId", 0);
        setIntField(term291252, term291252.getClass(), "position", 0);
        setBooleanField(term291252, term291252.getClass(), "isClear", false);
        setIntField(term291252, term291252.getClass(), "areaId", 0);
        setIntField(term291252, term291252.getClass(), "routeNumber", 0);
        setIntField(term291252, term291252.getClass(), "eventId", 0);
        setIntField(term291252, term291252.getClass(), "rate", 0);
        setIntField(term291252, term291252.getClass(), "statusCount", 0);
        setBooleanField(term291252, term291252.getClass(), "isValid", false);
        term291263 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term291263;
        callMethod(klass, "setClear", argTypes, term291252, args);
    }

};


