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
import java.lang.Long;

public class PacienteRequest_setEmail_13277594129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;

    public PacienteRequest_setEmail_13277594129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1794 = new Long(7009926388951271268L);
        term1793 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1793, term1793.getClass(), "id", term1794);
        setField(term1793, term1793.getClass(), "nome", "HqBOwkVqjD");
        setField(term1793, term1793.getClass(), "sobrenome", "MAcUBcBckh");
        setField(term1793, term1793.getClass(), "email", "oVgzLbrsFr");
        setField(term1793, term1793.getClass(), "cpf", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setEmail", argTypes, term1793, args);
    }

};


