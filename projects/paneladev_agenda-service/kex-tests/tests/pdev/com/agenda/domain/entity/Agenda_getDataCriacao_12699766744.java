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

public class Agenda_getDataCriacao_12699766744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1459;

    public Agenda_getDataCriacao_12699766744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1460 = new Long(4784595517102746672L);
        Long term1495 = new Long(-7612550318181586304L);
        Long term1548 = new Long(-2170847986967241072L);
        Long term1550 = new Long(4044358158040652353L);
        Object term1547 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1547, term1547.getClass(), "id", term1548);
        setField(term1547, term1547.getClass(), "rua", null);
        setField(term1547, term1547.getClass(), "numero", term1550);
        setField(term1547, term1547.getClass(), "complemento", null);
        setField(term1547, term1547.getClass(), "bairro", null);
        Long term1553 = new Long(-4443169559037975007L);
        Long term1555 = new Long(-3842548265506930260L);
        Object term1552 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1552, term1552.getClass(), "id", term1553);
        setField(term1552, term1552.getClass(), "rua", null);
        setField(term1552, term1552.getClass(), "numero", term1555);
        setField(term1552, term1552.getClass(), "complemento", null);
        setField(term1552, term1552.getClass(), "bairro", null);
        Long term1558 = new Long(-5788180182343976541L);
        Long term1560 = new Long(2936323121573284007L);
        Object term1557 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1557, term1557.getClass(), "id", term1558);
        setField(term1557, term1557.getClass(), "rua", null);
        setField(term1557, term1557.getClass(), "numero", term1560);
        setField(term1557, term1557.getClass(), "complemento", null);
        setField(term1557, term1557.getClass(), "bairro", null);
        Long term1563 = new Long(-1154553077993834885L);
        Long term1565 = new Long(-2850532706972744550L);
        Object term1562 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1562, term1562.getClass(), "id", term1563);
        setField(term1562, term1562.getClass(), "rua", null);
        setField(term1562, term1562.getClass(), "numero", term1565);
        setField(term1562, term1562.getClass(), "complemento", null);
        setField(term1562, term1562.getClass(), "bairro", null);
        ArrayList term1545 = new ArrayList();
        ((ArrayList) term1545).add(term1547);
        ((ArrayList) term1545).add(term1552);
        ((ArrayList) term1545).add(term1557);
        ((ArrayList) term1545).add(term1562);
        term1459 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1494 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1459, term1459.getClass(), "id", term1460);
        setField(term1459, term1459.getClass(), "descricao", "JqXGgAhZPl");
        setIntField(term1475, term1475.getClass(), "year", 2025);
        setShortField(term1475, term1475.getClass(), "month", (short) 4);
        setShortField(term1475, term1475.getClass(), "day", (short) 24);
        setField(term1474, term1474.getClass(), "date", term1475);
        setByteField(term1479, term1479.getClass(), "hour", (byte) 18);
        setByteField(term1479, term1479.getClass(), "minute", (byte) 11);
        setByteField(term1479, term1479.getClass(), "second", (byte) 40);
        setIntField(term1479, term1479.getClass(), "nano", 137454929);
        setField(term1474, term1474.getClass(), "time", term1479);
        setField(term1459, term1459.getClass(), "horario", term1474);
        setIntField(term1485, term1485.getClass(), "year", 2024);
        setShortField(term1485, term1485.getClass(), "month", (short) 1);
        setShortField(term1485, term1485.getClass(), "day", (short) 24);
        setField(term1484, term1484.getClass(), "date", term1485);
        setByteField(term1489, term1489.getClass(), "hour", (byte) 20);
        setByteField(term1489, term1489.getClass(), "minute", (byte) 28);
        setByteField(term1489, term1489.getClass(), "second", (byte) 39);
        setIntField(term1489, term1489.getClass(), "nano", 952728177);
        setField(term1484, term1484.getClass(), "time", term1489);
        setField(term1459, term1459.getClass(), "dataCriacao", term1484);
        setField(term1494, term1494.getClass(), "id", term1495);
        setField(term1494, term1494.getClass(), "nome", "jiKYgYHqIS");
        setField(term1494, term1494.getClass(), "sobrenome", "DfISiziTgG");
        setField(term1494, term1494.getClass(), "email", "XqgfKFvPSD");
        setField(term1494, term1494.getClass(), "cpf", "JiVRgTZvKc");
        setField(term1494, term1494.getClass(), "enderecos", term1545);
        setField(term1459, term1459.getClass(), "paciente", term1494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCriacao", argTypes, term1459, args);
    }

};


