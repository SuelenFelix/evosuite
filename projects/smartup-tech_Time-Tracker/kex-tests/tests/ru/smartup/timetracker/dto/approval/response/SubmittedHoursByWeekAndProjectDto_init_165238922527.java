package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;

public class SubmittedHoursByWeekAndProjectDto_init_165238922527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13255;
     Object term13257;
     Object term13259;
     Object term13261;
     Object term13263;

    public SubmittedHoursByWeekAndProjectDto_init_165238922527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13255 = new Long(0L);
        term13257 = new Integer(0);
        term13259 = new Long(0L);
        term13261 = new Float(0.0F);
        term13263 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = float.class;
        argTypes[7] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        argTypes[8] = boolean.class;
        argTypes[9] = Class.forName("java.time.LocalDate");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term13255;
        args[1] = term13257;
        args[2] = null;
        args[3] = null;
        args[4] = term13259;
        args[5] = null;
        args[6] = term13261;
        args[7] = null;
        args[8] = term13263;
        args[9] = null;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


