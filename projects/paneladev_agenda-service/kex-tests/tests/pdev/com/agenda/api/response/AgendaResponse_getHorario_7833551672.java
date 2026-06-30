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

public class AgendaResponse_getHorario_7833551672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public AgendaResponse_getHorario_7833551672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4097 = new Long(-8892586408602479513L);
        Long term4122 = new Long(4616440478358528406L);
        term4096 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4121 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4096, term4096.getClass(), "id", term4097);
        setField(term4096, term4096.getClass(), "descricao", "BbNeQJpYPr");
        setIntField(term4112, term4112.getClass(), "year", 2015);
        setShortField(term4112, term4112.getClass(), "month", (short) 9);
        setShortField(term4112, term4112.getClass(), "day", (short) 19);
        setField(term4111, term4111.getClass(), "date", term4112);
        setByteField(term4116, term4116.getClass(), "hour", (byte) 9);
        setByteField(term4116, term4116.getClass(), "minute", (byte) 4);
        setByteField(term4116, term4116.getClass(), "second", (byte) 10);
        setIntField(term4116, term4116.getClass(), "nano", 401765865);
        setField(term4111, term4111.getClass(), "time", term4116);
        setField(term4096, term4096.getClass(), "horario", term4111);
        setField(term4121, term4121.getClass(), "id", term4122);
        setField(term4121, term4121.getClass(), "nome", "riMtzCoxNj");
        setField(term4121, term4121.getClass(), "sobrenome", "YAXkVjQZcV");
        setField(term4121, term4121.getClass(), "email", "pumvwBWvpy");
        setField(term4121, term4121.getClass(), "cpf", "HwLHeGLyhe");
        setField(term4096, term4096.getClass(), "paciente", term4121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHorario", argTypes, term4096, args);
    }

};


