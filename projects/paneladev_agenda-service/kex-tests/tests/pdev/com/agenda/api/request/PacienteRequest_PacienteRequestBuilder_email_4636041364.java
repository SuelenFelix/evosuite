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

public class PacienteRequest_PacienteRequestBuilder_email_4636041364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;

    public PacienteRequest_PacienteRequestBuilder_email_4636041364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321 = new Long(5270370404989704783L);
        term320 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder"));
        setField(term320, term320.getClass(), "id", term321);
        setField(term320, term320.getClass(), "nome", "oVcInYnLWB");
        setField(term320, term320.getClass(), "sobrenome", "aJlieCFVtF");
        setField(term320, term320.getClass(), "email", "ZiaGIbnzTs");
        setField(term320, term320.getClass(), "cpf", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "email", argTypes, term320, args);
    }

};


