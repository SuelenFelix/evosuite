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

public class AgendaResponse_setPaciente_105302537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4760;
     Object term4836;

    public AgendaResponse_setPaciente_105302537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4761 = new Long(-78240609295693193L);
        Long term4786 = new Long(3090901538358721367L);
        term4760 = newInstance(Class.forName("pdev.com.agenda.api.response.AgendaResponse"));
        Object term4775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4785 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4760, term4760.getClass(), "id", term4761);
        setField(term4760, term4760.getClass(), "descricao", "qFGKIJjlmV");
        setIntField(term4776, term4776.getClass(), "year", 2029);
        setShortField(term4776, term4776.getClass(), "month", (short) 8);
        setShortField(term4776, term4776.getClass(), "day", (short) 29);
        setField(term4775, term4775.getClass(), "date", term4776);
        setByteField(term4780, term4780.getClass(), "hour", (byte) 15);
        setByteField(term4780, term4780.getClass(), "minute", (byte) 50);
        setByteField(term4780, term4780.getClass(), "second", (byte) 1);
        setIntField(term4780, term4780.getClass(), "nano", 277971904);
        setField(term4775, term4775.getClass(), "time", term4780);
        setField(term4760, term4760.getClass(), "horario", term4775);
        setField(term4785, term4785.getClass(), "id", term4786);
        setField(term4785, term4785.getClass(), "nome", "IHqvyhMtuM");
        setField(term4785, term4785.getClass(), "sobrenome", "dAldIGYAXV");
        setField(term4785, term4785.getClass(), "email", "mLwibAPEsa");
        setField(term4785, term4785.getClass(), "cpf", "zsWKWiTFuo");
        setField(term4760, term4760.getClass(), "paciente", term4785);
        Long term4837 = new Long(-1677189124507026637L);
        term4836 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term4836, term4836.getClass(), "id", term4837);
        setField(term4836, term4836.getClass(), "nome", "UPUbwyHQKN");
        setField(term4836, term4836.getClass(), "sobrenome", "lgQkrXANyI");
        setField(term4836, term4836.getClass(), "email", "MeTmRZXErV");
        setField(term4836, term4836.getClass(), "cpf", "jNxbVmoZgq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.AgendaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Object[] args = new Object[1];
        args[0] = term4836;
        callMethod(klass, "setPaciente", argTypes, term4760, args);
    }

};


