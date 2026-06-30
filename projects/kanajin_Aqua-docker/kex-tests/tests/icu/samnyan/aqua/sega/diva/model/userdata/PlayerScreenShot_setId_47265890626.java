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
import java.lang.Long;

public class PlayerScreenShot_setId_47265890626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530481;
     Object term530484;

    public PlayerScreenShot_setId_47265890626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530481 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        setLongField(term530481, term530481.getClass(), "id", 0L);
        setField(term530481, term530481.getClass(), "pdId", null);
        setIntField(term530481, term530481.getClass(), "pvId", 0);
        setField(term530481, term530481.getClass(), "fileName", null);
        setField(term530481, term530481.getClass(), "moduleList", null);
        setField(term530481, term530481.getClass(), "customizeList", null);
        term530484 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term530484;
        callMethod(klass, "setId", argTypes, term530481, args);
    }

};


