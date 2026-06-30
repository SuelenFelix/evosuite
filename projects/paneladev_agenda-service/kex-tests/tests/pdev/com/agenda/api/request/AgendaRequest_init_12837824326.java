package pdev.com.agenda.api.request;

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
import static pdev.com.agenda.api.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class AgendaRequest_init_12837824326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term1001;

    public AgendaRequest_init_12837824326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term996 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term992, term992.getClass(), "year", 2024);
        setShortField(term992, term992.getClass(), "month", (short) 1);
        setShortField(term992, term992.getClass(), "day", (short) 24);
        setField(term991, term991.getClass(), "date", term992);
        setByteField(term996, term996.getClass(), "hour", (byte) 20);
        setByteField(term996, term996.getClass(), "minute", (byte) 28);
        setByteField(term996, term996.getClass(), "second", (byte) 39);
        setIntField(term996, term996.getClass(), "nano", 952728177);
        setField(term991, term991.getClass(), "time", term996);
        term1001 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.AgendaRequest");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = Class.forName("java.lang.Long");
        Object[] args = new Object[3];
        args[0] = "aKnKipADSo";
        args[1] = term991;
        args[2] = term1001;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


