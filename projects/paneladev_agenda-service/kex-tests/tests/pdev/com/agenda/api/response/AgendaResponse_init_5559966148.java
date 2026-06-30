package pdev.com.agenda.api.response;

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
import static pdev.com.agenda.api.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AgendaResponse_init_5559966148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4977;
     Object term4991;
     Object term5001;

    public AgendaResponse_init_5559966148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4977 = new Long(4795660804170399986L);
        term4991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4996 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4992, term4992.getClass(), "year", 2022);
        setShortField(term4992, term4992.getClass(), "month", (short) 11);
        setShortField(term4992, term4992.getClass(), "day", (short) 16);
        setField(term4991, term4991.getClass(), "date", term4992);
        setByteField(term4996, term4996.getClass(), "hour", (byte) 15);
        setByteField(term4996, term4996.getClass(), "minute", (byte) 54);
        setByteField(term4996, term4996.getClass(), "second", (byte) 2);
        setIntField(term4996, term4996.getClass(), "nano", 733274103);
        setField(term4991, term4991.getClass(), "time", term4996);
        Long term5002 = new Long(-4030863184426321096L);
        term5001 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term5001, term5001.getClass(), "id", term5002);
        setField(term5001, term5001.getClass(), "nome", "hulYxtowxw");
        setField(term5001, term5001.getClass(), "sobrenome", "GNEmuHPNcU");
        setField(term5001, term5001.getClass(), "email", "IoSfuKDFRe");
        setField(term5001, term5001.getClass(), "cpf", "AWYyZiNfsm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Object[] args = new Object[4];
        args[0] = term4977;
        args[1] = "PvmBHIXaMY";
        args[2] = term4991;
        args[3] = term5001;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


