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

public class PacienteRequest_PacienteRequestBuilder_cpf_12692769495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;

    public PacienteRequest_PacienteRequestBuilder_cpf_12692769495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term434 = new Long(7411271909051562686L);
        term433 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder"));
        setField(term433, term433.getClass(), "id", term434);
        setField(term433, term433.getClass(), "nome", "pCTimMblYc");
        setField(term433, term433.getClass(), "sobrenome", "hNxWaHcfhY");
        setField(term433, term433.getClass(), "email", "RkybSrpybU");
        setField(term433, term433.getClass(), "cpf", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "cpf", argTypes, term433, args);
    }

};


