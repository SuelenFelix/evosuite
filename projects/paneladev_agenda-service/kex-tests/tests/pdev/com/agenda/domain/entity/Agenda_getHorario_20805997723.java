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

public class Agenda_getHorario_20805997723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304;

    public Agenda_getHorario_20805997723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1305 = new Long(6617340557564669657L);
        Long term1340 = new Long(1439298019805881866L);
        Long term1393 = new Long(-8708192233349544946L);
        Long term1395 = new Long(5907001541142728739L);
        Object term1392 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1392, term1392.getClass(), "id", term1393);
        setField(term1392, term1392.getClass(), "rua", null);
        setField(term1392, term1392.getClass(), "numero", term1395);
        setField(term1392, term1392.getClass(), "complemento", null);
        setField(term1392, term1392.getClass(), "bairro", null);
        Long term1398 = new Long(4178434741742309755L);
        Long term1400 = new Long(-2068172595987555756L);
        Object term1397 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1397, term1397.getClass(), "id", term1398);
        setField(term1397, term1397.getClass(), "rua", null);
        setField(term1397, term1397.getClass(), "numero", term1400);
        setField(term1397, term1397.getClass(), "complemento", null);
        setField(term1397, term1397.getClass(), "bairro", null);
        Long term1403 = new Long(-6292278961887936280L);
        Long term1405 = new Long(-6645965768855543712L);
        Object term1402 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term1402, term1402.getClass(), "id", term1403);
        setField(term1402, term1402.getClass(), "rua", null);
        setField(term1402, term1402.getClass(), "numero", term1405);
        setField(term1402, term1402.getClass(), "complemento", null);
        setField(term1402, term1402.getClass(), "bairro", null);
        ArrayList term1390 = new ArrayList();
        ((ArrayList) term1390).add(term1392);
        ((ArrayList) term1390).add(term1397);
        ((ArrayList) term1390).add(term1402);
        term1304 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term1319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1339 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term1304, term1304.getClass(), "id", term1305);
        setField(term1304, term1304.getClass(), "descricao", "wGmYcqUkgE");
        setIntField(term1320, term1320.getClass(), "year", 2022);
        setShortField(term1320, term1320.getClass(), "month", (short) 2);
        setShortField(term1320, term1320.getClass(), "day", (short) 26);
        setField(term1319, term1319.getClass(), "date", term1320);
        setByteField(term1324, term1324.getClass(), "hour", (byte) 11);
        setByteField(term1324, term1324.getClass(), "minute", (byte) 42);
        setByteField(term1324, term1324.getClass(), "second", (byte) 15);
        setIntField(term1324, term1324.getClass(), "nano", 377731937);
        setField(term1319, term1319.getClass(), "time", term1324);
        setField(term1304, term1304.getClass(), "horario", term1319);
        setIntField(term1330, term1330.getClass(), "year", 2026);
        setShortField(term1330, term1330.getClass(), "month", (short) 12);
        setShortField(term1330, term1330.getClass(), "day", (short) 14);
        setField(term1329, term1329.getClass(), "date", term1330);
        setByteField(term1334, term1334.getClass(), "hour", (byte) 16);
        setByteField(term1334, term1334.getClass(), "minute", (byte) 34);
        setByteField(term1334, term1334.getClass(), "second", (byte) 9);
        setIntField(term1334, term1334.getClass(), "nano", 518326996);
        setField(term1329, term1329.getClass(), "time", term1334);
        setField(term1304, term1304.getClass(), "dataCriacao", term1329);
        setField(term1339, term1339.getClass(), "id", term1340);
        setField(term1339, term1339.getClass(), "nome", "idgaQsnJpQ");
        setField(term1339, term1339.getClass(), "sobrenome", "VgZnGoIFwQ");
        setField(term1339, term1339.getClass(), "email", "jUbSRrkrYZ");
        setField(term1339, term1339.getClass(), "cpf", "bWWfajKbEX");
        setField(term1339, term1339.getClass(), "enderecos", term1390);
        setField(term1304, term1304.getClass(), "paciente", term1339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHorario", argTypes, term1304, args);
    }

};


