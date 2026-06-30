package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameMessage_setType_547920422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14315;
     Object term14318;

    public GameMessage_setType_547920422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14315 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        setIntField(term14315, term14315.getClass(), "id", 0);
        setIntField(term14315, term14315.getClass(), "type", 0);
        setField(term14315, term14315.getClass(), "message", null);
        setField(term14315, term14315.getClass(), "startDate", null);
        setField(term14315, term14315.getClass(), "endDate", null);
        term14318 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14318;
        callMethod(klass, "setType", argTypes, term14315, args);
    }

};


