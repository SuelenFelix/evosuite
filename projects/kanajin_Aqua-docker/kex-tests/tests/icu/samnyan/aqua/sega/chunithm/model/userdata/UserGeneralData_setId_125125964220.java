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

public class UserGeneralData_setId_125125964220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309585;
     Object term309587;

    public UserGeneralData_setId_125125964220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309585 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        setLongField(term309585, term309585.getClass(), "id", 0L);
        setField(term309585, term309585.getClass(), "user", null);
        setField(term309585, term309585.getClass(), "propertyKey", null);
        setField(term309585, term309585.getClass(), "propertyValue", null);
        term309587 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term309587;
        callMethod(klass, "setId", argTypes, term309585, args);
    }

};


