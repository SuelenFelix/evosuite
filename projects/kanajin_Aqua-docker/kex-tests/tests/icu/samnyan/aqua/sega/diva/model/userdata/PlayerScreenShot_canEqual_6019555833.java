package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerScreenShot_canEqual_6019555833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530506;

    public PlayerScreenShot_canEqual_6019555833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530506 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        setLongField(term530506, term530506.getClass(), "id", 0L);
        setField(term530506, term530506.getClass(), "pdId", null);
        setIntField(term530506, term530506.getClass(), "pvId", 0);
        setField(term530506, term530506.getClass(), "fileName", null);
        setField(term530506, term530506.getClass(), "moduleList", null);
        setField(term530506, term530506.getClass(), "customizeList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term530506, args);
    }

};


