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

public class Agenda_setPaciente_188194078110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2473;
     Object term2568;

    public Agenda_setPaciente_188194078110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2474 = new Long(1215116475929634177L);
        Long term2509 = new Long(1597484336218508869L);
        Long term2562 = new Long(-685023850445639859L);
        Long term2564 = new Long(-6950146046121430355L);
        Object term2561 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2561, term2561.getClass(), "id", term2562);
        setField(term2561, term2561.getClass(), "rua", null);
        setField(term2561, term2561.getClass(), "numero", term2564);
        setField(term2561, term2561.getClass(), "complemento", null);
        setField(term2561, term2561.getClass(), "bairro", null);
        ArrayList term2559 = new ArrayList();
        ((ArrayList) term2559).add(term2561);
        term2473 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term2488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2508 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term2473, term2473.getClass(), "id", term2474);
        setField(term2473, term2473.getClass(), "descricao", "ZkMALXpEAZ");
        setIntField(term2489, term2489.getClass(), "year", 2014);
        setShortField(term2489, term2489.getClass(), "month", (short) 7);
        setShortField(term2489, term2489.getClass(), "day", (short) 13);
        setField(term2488, term2488.getClass(), "date", term2489);
        setByteField(term2493, term2493.getClass(), "hour", (byte) 21);
        setByteField(term2493, term2493.getClass(), "minute", (byte) 46);
        setByteField(term2493, term2493.getClass(), "second", (byte) 0);
        setIntField(term2493, term2493.getClass(), "nano", 887884128);
        setField(term2488, term2488.getClass(), "time", term2493);
        setField(term2473, term2473.getClass(), "horario", term2488);
        setIntField(term2499, term2499.getClass(), "year", 2023);
        setShortField(term2499, term2499.getClass(), "month", (short) 3);
        setShortField(term2499, term2499.getClass(), "day", (short) 7);
        setField(term2498, term2498.getClass(), "date", term2499);
        setByteField(term2503, term2503.getClass(), "hour", (byte) 21);
        setByteField(term2503, term2503.getClass(), "minute", (byte) 15);
        setByteField(term2503, term2503.getClass(), "second", (byte) 43);
        setIntField(term2503, term2503.getClass(), "nano", 639721472);
        setField(term2498, term2498.getClass(), "time", term2503);
        setField(term2473, term2473.getClass(), "dataCriacao", term2498);
        setField(term2508, term2508.getClass(), "id", term2509);
        setField(term2508, term2508.getClass(), "nome", "tXfQjSqDzN");
        setField(term2508, term2508.getClass(), "sobrenome", "BjugTaMcxJ");
        setField(term2508, term2508.getClass(), "email", "vGiuZVPJNH");
        setField(term2508, term2508.getClass(), "cpf", "tlzpzIjMib");
        setField(term2508, term2508.getClass(), "enderecos", term2559);
        setField(term2473, term2473.getClass(), "paciente", term2508);
        Long term2569 = new Long(1667122142089513324L);
        Long term2622 = new Long(-6342139649364011743L);
        Long term2625 = new Long(-4924950707540628022L);
        Object term2621 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2621, term2621.getClass(), "id", term2622);
        setField(term2621, term2621.getClass(), "rua", "");
        setField(term2621, term2621.getClass(), "numero", term2625);
        setField(term2621, term2621.getClass(), "complemento", "");
        setField(term2621, term2621.getClass(), "bairro", "");
        Long term2630 = new Long(-4393710401270724527L);
        Long term2633 = new Long(-4822736661741380518L);
        Object term2629 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2629, term2629.getClass(), "id", term2630);
        setField(term2629, term2629.getClass(), "rua", "");
        setField(term2629, term2629.getClass(), "numero", term2633);
        setField(term2629, term2629.getClass(), "complemento", "");
        setField(term2629, term2629.getClass(), "bairro", "");
        Long term2638 = new Long(-5386201758403679145L);
        Long term2641 = new Long(-7268507582722666254L);
        Object term2637 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2637, term2637.getClass(), "id", term2638);
        setField(term2637, term2637.getClass(), "rua", "");
        setField(term2637, term2637.getClass(), "numero", term2641);
        setField(term2637, term2637.getClass(), "complemento", "");
        setField(term2637, term2637.getClass(), "bairro", "");
        Long term2646 = new Long(5671808784468963649L);
        Long term2649 = new Long(2297097306706899827L);
        Object term2645 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2645, term2645.getClass(), "id", term2646);
        setField(term2645, term2645.getClass(), "rua", "");
        setField(term2645, term2645.getClass(), "numero", term2649);
        setField(term2645, term2645.getClass(), "complemento", "");
        setField(term2645, term2645.getClass(), "bairro", "");
        Long term2654 = new Long(-900457279156388404L);
        Long term2657 = new Long(1084801489398441516L);
        Object term2653 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2653, term2653.getClass(), "id", term2654);
        setField(term2653, term2653.getClass(), "rua", "");
        setField(term2653, term2653.getClass(), "numero", term2657);
        setField(term2653, term2653.getClass(), "complemento", "");
        setField(term2653, term2653.getClass(), "bairro", "");
        Long term2662 = new Long(6273754186658578034L);
        Long term2665 = new Long(3620247240684476031L);
        Object term2661 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2661, term2661.getClass(), "id", term2662);
        setField(term2661, term2661.getClass(), "rua", "");
        setField(term2661, term2661.getClass(), "numero", term2665);
        setField(term2661, term2661.getClass(), "complemento", "");
        setField(term2661, term2661.getClass(), "bairro", "");
        ArrayList term2619 = new ArrayList();
        ((ArrayList) term2619).add(term2621);
        ((ArrayList) term2619).add(term2629);
        ((ArrayList) term2619).add(term2637);
        ((ArrayList) term2619).add(term2645);
        ((ArrayList) term2619).add(term2653);
        ((ArrayList) term2619).add(term2661);
        term2568 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term2568, term2568.getClass(), "id", term2569);
        setField(term2568, term2568.getClass(), "nome", "hOncybyCAH");
        setField(term2568, term2568.getClass(), "sobrenome", "QduALnDSVo");
        setField(term2568, term2568.getClass(), "email", "izPpKDErnQ");
        setField(term2568, term2568.getClass(), "cpf", "NnpwZBUTvx");
        setField(term2568, term2568.getClass(), "enderecos", term2619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[1];
        args[0] = term2568;
        callMethod(klass, "setPaciente", argTypes, term2473, args);
    }

};


