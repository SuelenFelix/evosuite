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
import java.lang.Long;

public class UserMap_setId_161058212841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291202;
     Object term291213;

    public UserMap_setId_161058212841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291202 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291202, term291202.getClass(), "id", 0L);
        setField(term291202, term291202.getClass(), "user", null);
        setIntField(term291202, term291202.getClass(), "mapId", 0);
        setIntField(term291202, term291202.getClass(), "position", 0);
        setBooleanField(term291202, term291202.getClass(), "isClear", false);
        setIntField(term291202, term291202.getClass(), "areaId", 0);
        setIntField(term291202, term291202.getClass(), "routeNumber", 0);
        setIntField(term291202, term291202.getClass(), "eventId", 0);
        setIntField(term291202, term291202.getClass(), "rate", 0);
        setIntField(term291202, term291202.getClass(), "statusCount", 0);
        setBooleanField(term291202, term291202.getClass(), "isValid", false);
        term291213 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term291213;
        callMethod(klass, "setId", argTypes, term291202, args);
    }

};


