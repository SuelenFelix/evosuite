package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Agenda_getPaciente_13794102615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1619;

    public Agenda_getPaciente_13794102615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1620 = new Long(-2644215923136513282L);
        Long term1655 = new Long(-1468719814009985452L);
        Long term1708 = new Long(-7738503207562305297L);
        Long term1710 = new Long(3825396310311739952L);
        Object term1707 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1707, term1707.getClass(), "id", term1708);
        setField(term1707, term1707.getClass(), "rua", null);
        setField(term1707, term1707.getClass(), "numero", term1710);
        setField(term1707, term1707.getClass(), "complemento", null);
        setField(term1707, term1707.getClass(), "bairro", null);
        ArrayList term1705 = new ArrayList();
        ((ArrayList) term1705).add(term1707);
        term1619 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1639 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1654 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1619, term1619.getClass(), "id", term1620);
        setField(term1619, term1619.getClass(), "descricao", "eVpkWxjuki");
        setIntField(term1635, term1635.getClass(), "year", 2029);
        setShortField(term1635, term1635.getClass(), "month", (short) 8);
        setShortField(term1635, term1635.getClass(), "day", (short) 29);
        setField(term1634, term1634.getClass(), "date", term1635);
        setByteField(term1639, term1639.getClass(), "hour", (byte) 15);
        setByteField(term1639, term1639.getClass(), "minute", (byte) 50);
        setByteField(term1639, term1639.getClass(), "second", (byte) 1);
        setIntField(term1639, term1639.getClass(), "nano", 277971904);
        setField(term1634, term1634.getClass(), "time", term1639);
        setField(term1619, term1619.getClass(), "horario", term1634);
        setIntField(term1645, term1645.getClass(), "year", 2022);
        setShortField(term1645, term1645.getClass(), "month", (short) 11);
        setShortField(term1645, term1645.getClass(), "day", (short) 16);
        setField(term1644, term1644.getClass(), "date", term1645);
        setByteField(term1649, term1649.getClass(), "hour", (byte) 15);
        setByteField(term1649, term1649.getClass(), "minute", (byte) 54);
        setByteField(term1649, term1649.getClass(), "second", (byte) 2);
        setIntField(term1649, term1649.getClass(), "nano", 733274103);
        setField(term1644, term1644.getClass(), "time", term1649);
        setField(term1619, term1619.getClass(), "dataCriacao", term1644);
        setField(term1654, term1654.getClass(), "id", term1655);
        setField(term1654, term1654.getClass(), "nome", "SJiQaLvSKv");
        setField(term1654, term1654.getClass(), "sobrenome", "OEXDRUKcFl");
        setField(term1654, term1654.getClass(), "email", "RYdKCNNMBR");
        setField(term1654, term1654.getClass(), "cpf", "yGtHPyvYiQ");
        setField(term1654, term1654.getClass(), "enderecos", term1705);
        setField(term1619, term1619.getClass(), "paciente", term1654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaciente", argTypes, term1619, args);
    }

};


