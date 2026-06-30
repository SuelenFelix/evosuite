package icu.samnyan.aqua.api.controller.sega.game.ongeki;

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
import static icu.samnyan.aqua.api.controller.sega.game.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class ApiOngekiGameDataController_getEventList_10289965377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;

    public ApiOngekiGameDataController_getEventList_10289965377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term443 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameEvent"));
        setLongField(term443, term443.getClass(), "id", -8885298608300233488L);
        term440 = new LinkedList();
        ((LinkedList) term440).add(term443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.controller.sega.game.ongeki.ApiOngekiGameDataController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term440;
        callMethod(klass, "getEventList", argTypes, null, args);
    }

};


