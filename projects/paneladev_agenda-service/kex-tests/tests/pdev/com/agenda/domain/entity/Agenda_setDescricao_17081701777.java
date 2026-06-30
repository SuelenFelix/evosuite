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

public class Agenda_setDescricao_17081701777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1936;

    public Agenda_setDescricao_17081701777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1937 = new Long(6682528376118987775L);
        Long term1972 = new Long(682356318767179819L);
        Long term2025 = new Long(-7291743527973326814L);
        Long term2027 = new Long(-5963439350418910964L);
        Object term2024 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2024, term2024.getClass(), "id", term2025);
        setField(term2024, term2024.getClass(), "rua", null);
        setField(term2024, term2024.getClass(), "numero", term2027);
        setField(term2024, term2024.getClass(), "complemento", null);
        setField(term2024, term2024.getClass(), "bairro", null);
        Long term2030 = new Long(9013624480170062917L);
        Long term2032 = new Long(7862575738391801707L);
        Object term2029 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2029, term2029.getClass(), "id", term2030);
        setField(term2029, term2029.getClass(), "rua", null);
        setField(term2029, term2029.getClass(), "numero", term2032);
        setField(term2029, term2029.getClass(), "complemento", null);
        setField(term2029, term2029.getClass(), "bairro", null);
        ArrayList term2022 = new ArrayList();
        ((ArrayList) term2022).add(term2024);
        ((ArrayList) term2022).add(term2029);
        term1936 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1971 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1936, term1936.getClass(), "id", term1937);
        setField(term1936, term1936.getClass(), "descricao", "yVMkkQhvmN");
        setIntField(term1952, term1952.getClass(), "year", 2012);
        setShortField(term1952, term1952.getClass(), "month", (short) 9);
        setShortField(term1952, term1952.getClass(), "day", (short) 11);
        setField(term1951, term1951.getClass(), "date", term1952);
        setByteField(term1956, term1956.getClass(), "hour", (byte) 22);
        setByteField(term1956, term1956.getClass(), "minute", (byte) 10);
        setByteField(term1956, term1956.getClass(), "second", (byte) 8);
        setIntField(term1956, term1956.getClass(), "nano", 380008862);
        setField(term1951, term1951.getClass(), "time", term1956);
        setField(term1936, term1936.getClass(), "horario", term1951);
        setIntField(term1962, term1962.getClass(), "year", 2021);
        setShortField(term1962, term1962.getClass(), "month", (short) 9);
        setShortField(term1962, term1962.getClass(), "day", (short) 7);
        setField(term1961, term1961.getClass(), "date", term1962);
        setByteField(term1966, term1966.getClass(), "hour", (byte) 5);
        setByteField(term1966, term1966.getClass(), "minute", (byte) 25);
        setByteField(term1966, term1966.getClass(), "second", (byte) 7);
        setIntField(term1966, term1966.getClass(), "nano", 755924076);
        setField(term1961, term1961.getClass(), "time", term1966);
        setField(term1936, term1936.getClass(), "dataCriacao", term1961);
        setField(term1971, term1971.getClass(), "id", term1972);
        setField(term1971, term1971.getClass(), "nome", "mvrkADEgpp");
        setField(term1971, term1971.getClass(), "sobrenome", "pXOkjyeIRb");
        setField(term1971, term1971.getClass(), "email", "GgZWSjxjyE");
        setField(term1971, term1971.getClass(), "cpf", "EeBVbzjcCI");
        setField(term1971, term1971.getClass(), "enderecos", term2022);
        setField(term1936, term1936.getClass(), "paciente", term1971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        callMethod(klass, "setDescricao", argTypes, term1936, args);
    }

};


