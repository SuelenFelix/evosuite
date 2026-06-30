package pdev.com.agenda.api.mapper;

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
import static pdev.com.agenda.api.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class AgendaMapper_toAgendaResponse_11307687531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396;

    public AgendaMapper_toAgendaResponse_11307687531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term397 = new Long(8059786003080744426L);
        Long term432 = new Long(-4365849114644724155L);
        Long term485 = new Long(2486810210675247493L);
        Long term487 = new Long(7009926388951271268L);
        Object term484 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term484, term484.getClass(), "id", term485);
        setField(term484, term484.getClass(), "rua", null);
        setField(term484, term484.getClass(), "numero", term487);
        setField(term484, term484.getClass(), "complemento", null);
        setField(term484, term484.getClass(), "bairro", null);
        Long term490 = new Long(-7672528020740371001L);
        Long term492 = new Long(-4502405999831680926L);
        Object term489 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term489, term489.getClass(), "id", term490);
        setField(term489, term489.getClass(), "rua", null);
        setField(term489, term489.getClass(), "numero", term492);
        setField(term489, term489.getClass(), "complemento", null);
        setField(term489, term489.getClass(), "bairro", null);
        Long term495 = new Long(1967728129628047933L);
        Long term497 = new Long(2120084523938730454L);
        Object term494 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term494, term494.getClass(), "id", term495);
        setField(term494, term494.getClass(), "rua", null);
        setField(term494, term494.getClass(), "numero", term497);
        setField(term494, term494.getClass(), "complemento", null);
        setField(term494, term494.getClass(), "bairro", null);
        Long term500 = new Long(6855071767938501807L);
        Long term502 = new Long(-5892135042702373494L);
        Object term499 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term499, term499.getClass(), "id", term500);
        setField(term499, term499.getClass(), "rua", null);
        setField(term499, term499.getClass(), "numero", term502);
        setField(term499, term499.getClass(), "complemento", null);
        setField(term499, term499.getClass(), "bairro", null);
        ArrayList term482 = new ArrayList();
        ((ArrayList) term482).add(term484);
        ((ArrayList) term482).add(term489);
        ((ArrayList) term482).add(term494);
        ((ArrayList) term482).add(term499);
        term396 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term431 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term396, term396.getClass(), "id", term397);
        setField(term396, term396.getClass(), "descricao", "wSQxaModmm");
        setIntField(term412, term412.getClass(), "year", 2021);
        setShortField(term412, term412.getClass(), "month", (short) 1);
        setShortField(term412, term412.getClass(), "day", (short) 18);
        setField(term411, term411.getClass(), "date", term412);
        setByteField(term416, term416.getClass(), "hour", (byte) 13);
        setByteField(term416, term416.getClass(), "minute", (byte) 38);
        setByteField(term416, term416.getClass(), "second", (byte) 26);
        setIntField(term416, term416.getClass(), "nano", 544608644);
        setField(term411, term411.getClass(), "time", term416);
        setField(term396, term396.getClass(), "horario", term411);
        setIntField(term422, term422.getClass(), "year", 2015);
        setShortField(term422, term422.getClass(), "month", (short) 9);
        setShortField(term422, term422.getClass(), "day", (short) 19);
        setField(term421, term421.getClass(), "date", term422);
        setByteField(term426, term426.getClass(), "hour", (byte) 9);
        setByteField(term426, term426.getClass(), "minute", (byte) 4);
        setByteField(term426, term426.getClass(), "second", (byte) 10);
        setIntField(term426, term426.getClass(), "nano", 401765865);
        setField(term421, term421.getClass(), "time", term426);
        setField(term396, term396.getClass(), "dataCriacao", term421);
        setField(term431, term431.getClass(), "id", term432);
        setField(term431, term431.getClass(), "nome", "UlajhuVLaP");
        setField(term431, term431.getClass(), "sobrenome", "gGSMzuGICf");
        setField(term431, term431.getClass(), "email", "hxCBltsObl");
        setField(term431, term431.getClass(), "cpf", "BndsHwAFMv");
        setField(term431, term431.getClass(), "enderecos", term482);
        setField(term396, term396.getClass(), "paciente", term431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.mapper.AgendaMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Object[] args = new Object[1];
        args[0] = term396;
        callMethod(klass, "toAgendaResponse", argTypes, null, args);
    }

};


