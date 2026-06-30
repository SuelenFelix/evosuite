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

public class UserMap_getAreaId_110751714735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291136;

    public UserMap_getAreaId_110751714735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291136 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291136, term291136.getClass(), "id", 0L);
        setField(term291136, term291136.getClass(), "user", null);
        setIntField(term291136, term291136.getClass(), "mapId", 0);
        setIntField(term291136, term291136.getClass(), "position", 0);
        setBooleanField(term291136, term291136.getClass(), "isClear", false);
        setIntField(term291136, term291136.getClass(), "areaId", 0);
        setIntField(term291136, term291136.getClass(), "routeNumber", 0);
        setIntField(term291136, term291136.getClass(), "eventId", 0);
        setIntField(term291136, term291136.getClass(), "rate", 0);
        setIntField(term291136, term291136.getClass(), "statusCount", 0);
        setBooleanField(term291136, term291136.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreaId", argTypes, term291136, args);
    }

};


