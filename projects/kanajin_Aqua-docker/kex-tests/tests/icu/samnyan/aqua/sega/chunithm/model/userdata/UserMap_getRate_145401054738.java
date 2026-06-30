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

public class UserMap_getRate_145401054738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291169;

    public UserMap_getRate_145401054738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291169 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        setLongField(term291169, term291169.getClass(), "id", 0L);
        setField(term291169, term291169.getClass(), "user", null);
        setIntField(term291169, term291169.getClass(), "mapId", 0);
        setIntField(term291169, term291169.getClass(), "position", 0);
        setBooleanField(term291169, term291169.getClass(), "isClear", false);
        setIntField(term291169, term291169.getClass(), "areaId", 0);
        setIntField(term291169, term291169.getClass(), "routeNumber", 0);
        setIntField(term291169, term291169.getClass(), "eventId", 0);
        setIntField(term291169, term291169.getClass(), "rate", 0);
        setIntField(term291169, term291169.getClass(), "statusCount", 0);
        setBooleanField(term291169, term291169.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term291169, args);
    }

};


