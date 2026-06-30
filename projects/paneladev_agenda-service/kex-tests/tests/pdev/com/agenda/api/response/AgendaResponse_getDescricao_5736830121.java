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

public class AgendaResponse_getDescricao_5736830121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3970;

    public AgendaResponse_getDescricao_5736830121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3971 = new Long(-8471550651709805183L);
        Long term3996 = new Long(-948292411727204525L);
        term3970 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term3985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3995 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term3970, term3970.getClass(), "id", term3971);
        setField(term3970, term3970.getClass(), "descricao", "HHQcYMSBVc");
        setIntField(term3986, term3986.getClass(), "year", 2021);
        setShortField(term3986, term3986.getClass(), "month", (short) 1);
        setShortField(term3986, term3986.getClass(), "day", (short) 18);
        setField(term3985, term3985.getClass(), "date", term3986);
        setByteField(term3990, term3990.getClass(), "hour", (byte) 13);
        setByteField(term3990, term3990.getClass(), "minute", (byte) 38);
        setByteField(term3990, term3990.getClass(), "second", (byte) 26);
        setIntField(term3990, term3990.getClass(), "nano", 544608644);
        setField(term3985, term3985.getClass(), "time", term3990);
        setField(term3970, term3970.getClass(), "horario", term3985);
        setField(term3995, term3995.getClass(), "id", term3996);
        setField(term3995, term3995.getClass(), "nome", "wdoqITnaAP");
        setField(term3995, term3995.getClass(), "sobrenome", "rIPMBcrNqB");
        setField(term3995, term3995.getClass(), "email", "UDaboHZHhz");
        setField(term3995, term3995.getClass(), "cpf", "nRvKihUSPj");
        setField(term3970, term3970.getClass(), "paciente", term3995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescricao", argTypes, term3970, args);
    }

};


