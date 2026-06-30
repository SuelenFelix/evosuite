package pdev.com.agenda.domain.service;

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
import static pdev.com.agenda.domain.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class AgendaService_salvar_20764473012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public AgendaService_salvar_20764473012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283 = new Long(7009926388951271268L);
        Long term318 = new Long(-7672528020740371001L);
        Long term371 = new Long(-4502405999831680926L);
        Long term373 = new Long(1967728129628047933L);
        Object term370 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term370, term370.getClass(), "id", term371);
        setField(term370, term370.getClass(), "rua", null);
        setField(term370, term370.getClass(), "numero", term373);
        setField(term370, term370.getClass(), "complemento", null);
        setField(term370, term370.getClass(), "bairro", null);
        Long term376 = new Long(2120084523938730454L);
        Long term378 = new Long(6855071767938501807L);
        Object term375 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term375, term375.getClass(), "id", term376);
        setField(term375, term375.getClass(), "rua", null);
        setField(term375, term375.getClass(), "numero", term378);
        setField(term375, term375.getClass(), "complemento", null);
        setField(term375, term375.getClass(), "bairro", null);
        Long term381 = new Long(-5892135042702373494L);
        Long term383 = new Long(5262507301787091109L);
        Object term380 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term380, term380.getClass(), "id", term381);
        setField(term380, term380.getClass(), "rua", null);
        setField(term380, term380.getClass(), "numero", term383);
        setField(term380, term380.getClass(), "complemento", null);
        setField(term380, term380.getClass(), "bairro", null);
        ArrayList term368 = new ArrayList();
        ((ArrayList) term368).add(term370);
        ((ArrayList) term368).add(term375);
        ((ArrayList) term368).add(term380);
        term282 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term282, term282.getClass(), "id", term283);
        setField(term282, term282.getClass(), "descricao", "Ghbwtircqb");
        setIntField(term298, term298.getClass(), "year", 2012);
        setShortField(term298, term298.getClass(), "month", (short) 8);
        setShortField(term298, term298.getClass(), "day", (short) 25);
        setField(term297, term297.getClass(), "date", term298);
        setByteField(term302, term302.getClass(), "hour", (byte) 5);
        setByteField(term302, term302.getClass(), "minute", (byte) 20);
        setByteField(term302, term302.getClass(), "second", (byte) 50);
        setIntField(term302, term302.getClass(), "nano", 345595912);
        setField(term297, term297.getClass(), "time", term302);
        setField(term282, term282.getClass(), "horario", term297);
        setIntField(term308, term308.getClass(), "year", 2021);
        setShortField(term308, term308.getClass(), "month", (short) 1);
        setShortField(term308, term308.getClass(), "day", (short) 18);
        setField(term307, term307.getClass(), "date", term308);
        setByteField(term312, term312.getClass(), "hour", (byte) 13);
        setByteField(term312, term312.getClass(), "minute", (byte) 38);
        setByteField(term312, term312.getClass(), "second", (byte) 26);
        setIntField(term312, term312.getClass(), "nano", 544608644);
        setField(term307, term307.getClass(), "time", term312);
        setField(term282, term282.getClass(), "dataCriacao", term307);
        setField(term317, term317.getClass(), "id", term318);
        setField(term317, term317.getClass(), "nome", "xrwlQZdwCp");
        setField(term317, term317.getClass(), "sobrenome", "IDCWpPLRkE");
        setField(term317, term317.getClass(), "email", "nyiiPDVjAc");
        setField(term317, term317.getClass(), "cpf", "aKnKipADSo");
        setField(term317, term317.getClass(), "enderecos", term368);
        setField(term282, term282.getClass(), "paciente", term317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.service.AgendaService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Object[] args = new Object[1];
        args[0] = term282;
        callMethod(klass, "salvar", argTypes, null, args);
    }

};


