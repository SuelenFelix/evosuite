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

public class AgendaResponse_setDescricao_4109255725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4476;

    public AgendaResponse_setDescricao_4109255725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4477 = new Long(-5724112525188606013L);
        Long term4502 = new Long(-6100012593724108983L);
        term4476 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4496 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4501 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4476, term4476.getClass(), "id", term4477);
        setField(term4476, term4476.getClass(), "descricao", "RCOqfVsRHt");
        setIntField(term4492, term4492.getClass(), "year", 2026);
        setShortField(term4492, term4492.getClass(), "month", (short) 12);
        setShortField(term4492, term4492.getClass(), "day", (short) 14);
        setField(term4491, term4491.getClass(), "date", term4492);
        setByteField(term4496, term4496.getClass(), "hour", (byte) 16);
        setByteField(term4496, term4496.getClass(), "minute", (byte) 34);
        setByteField(term4496, term4496.getClass(), "second", (byte) 9);
        setIntField(term4496, term4496.getClass(), "nano", 518326996);
        setField(term4491, term4491.getClass(), "time", term4496);
        setField(term4476, term4476.getClass(), "horario", term4491);
        setField(term4501, term4501.getClass(), "id", term4502);
        setField(term4501, term4501.getClass(), "nome", "TSyCeEZPaT");
        setField(term4501, term4501.getClass(), "sobrenome", "JeZFtaqkzW");
        setField(term4501, term4501.getClass(), "email", "vOVuNSCCLe");
        setField(term4501, term4501.getClass(), "cpf", "fzeqPnzpnt");
        setField(term4476, term4476.getClass(), "paciente", term4501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RxbhrFBjkO";
        callMethod(klass, "setDescricao", argTypes, term4476, args);
    }

};


