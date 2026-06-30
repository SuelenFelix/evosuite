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

public class Agenda_setDataCriacao_8794791789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2288;
     Object term2413;

    public Agenda_setDataCriacao_8794791789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2289 = new Long(-8463029266761149071L);
        Long term2324 = new Long(3133860696238261492L);
        Long term2377 = new Long(7247160664318067468L);
        Long term2379 = new Long(2135754395358000892L);
        Object term2376 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2376, term2376.getClass(), "id", term2377);
        setField(term2376, term2376.getClass(), "rua", null);
        setField(term2376, term2376.getClass(), "numero", term2379);
        setField(term2376, term2376.getClass(), "complemento", null);
        setField(term2376, term2376.getClass(), "bairro", null);
        Long term2382 = new Long(-8085190702504231560L);
        Long term2384 = new Long(1672578078364590450L);
        Object term2381 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2381, term2381.getClass(), "id", term2382);
        setField(term2381, term2381.getClass(), "rua", null);
        setField(term2381, term2381.getClass(), "numero", term2384);
        setField(term2381, term2381.getClass(), "complemento", null);
        setField(term2381, term2381.getClass(), "bairro", null);
        Long term2387 = new Long(4949335493504695457L);
        Long term2389 = new Long(-5216789073301458893L);
        Object term2386 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2386, term2386.getClass(), "id", term2387);
        setField(term2386, term2386.getClass(), "rua", null);
        setField(term2386, term2386.getClass(), "numero", term2389);
        setField(term2386, term2386.getClass(), "complemento", null);
        setField(term2386, term2386.getClass(), "bairro", null);
        Long term2392 = new Long(-1832940336320585644L);
        Long term2394 = new Long(-8033714905181142681L);
        Object term2391 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2391, term2391.getClass(), "id", term2392);
        setField(term2391, term2391.getClass(), "rua", null);
        setField(term2391, term2391.getClass(), "numero", term2394);
        setField(term2391, term2391.getClass(), "complemento", null);
        setField(term2391, term2391.getClass(), "bairro", null);
        Long term2397 = new Long(-9040825890007374809L);
        Long term2399 = new Long(1368340889161782793L);
        Object term2396 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2396, term2396.getClass(), "id", term2397);
        setField(term2396, term2396.getClass(), "rua", null);
        setField(term2396, term2396.getClass(), "numero", term2399);
        setField(term2396, term2396.getClass(), "complemento", null);
        setField(term2396, term2396.getClass(), "bairro", null);
        Long term2402 = new Long(-5786861555969446503L);
        Long term2404 = new Long(2354625302846375590L);
        Object term2401 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2401, term2401.getClass(), "id", term2402);
        setField(term2401, term2401.getClass(), "rua", null);
        setField(term2401, term2401.getClass(), "numero", term2404);
        setField(term2401, term2401.getClass(), "complemento", null);
        setField(term2401, term2401.getClass(), "bairro", null);
        Long term2407 = new Long(7276637106827860087L);
        Long term2409 = new Long(-3936701866695933852L);
        Object term2406 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2406, term2406.getClass(), "id", term2407);
        setField(term2406, term2406.getClass(), "rua", null);
        setField(term2406, term2406.getClass(), "numero", term2409);
        setField(term2406, term2406.getClass(), "complemento", null);
        setField(term2406, term2406.getClass(), "bairro", null);
        ArrayList term2374 = new ArrayList();
        ((ArrayList) term2374).add(term2376);
        ((ArrayList) term2374).add(term2381);
        ((ArrayList) term2374).add(term2386);
        ((ArrayList) term2374).add(term2391);
        ((ArrayList) term2374).add(term2396);
        ((ArrayList) term2374).add(term2401);
        ((ArrayList) term2374).add(term2406);
        term2288 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        Object term2303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2323 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term2288, term2288.getClass(), "id", term2289);
        setField(term2288, term2288.getClass(), "descricao", "lihXWlGDxk");
        setIntField(term2304, term2304.getClass(), "year", 2029);
        setShortField(term2304, term2304.getClass(), "month", (short) 6);
        setShortField(term2304, term2304.getClass(), "day", (short) 23);
        setField(term2303, term2303.getClass(), "date", term2304);
        setByteField(term2308, term2308.getClass(), "hour", (byte) 21);
        setByteField(term2308, term2308.getClass(), "minute", (byte) 55);
        setByteField(term2308, term2308.getClass(), "second", (byte) 27);
        setIntField(term2308, term2308.getClass(), "nano", 66889274);
        setField(term2303, term2303.getClass(), "time", term2308);
        setField(term2288, term2288.getClass(), "horario", term2303);
        setIntField(term2314, term2314.getClass(), "year", 2017);
        setShortField(term2314, term2314.getClass(), "month", (short) 3);
        setShortField(term2314, term2314.getClass(), "day", (short) 5);
        setField(term2313, term2313.getClass(), "date", term2314);
        setByteField(term2318, term2318.getClass(), "hour", (byte) 20);
        setByteField(term2318, term2318.getClass(), "minute", (byte) 34);
        setByteField(term2318, term2318.getClass(), "second", (byte) 55);
        setIntField(term2318, term2318.getClass(), "nano", 78024496);
        setField(term2313, term2313.getClass(), "time", term2318);
        setField(term2288, term2288.getClass(), "dataCriacao", term2313);
        setField(term2323, term2323.getClass(), "id", term2324);
        setField(term2323, term2323.getClass(), "nome", "JmcmxoGhIK");
        setField(term2323, term2323.getClass(), "sobrenome", "jXzmYyrnnT");
        setField(term2323, term2323.getClass(), "email", "igCAtimmYB");
        setField(term2323, term2323.getClass(), "cpf", "DyiXbeYIaN");
        setField(term2323, term2323.getClass(), "enderecos", term2374);
        setField(term2288, term2288.getClass(), "paciente", term2323);
        term2413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2418 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2414, term2414.getClass(), "year", 2020);
        setShortField(term2414, term2414.getClass(), "month", (short) 7);
        setShortField(term2414, term2414.getClass(), "day", (short) 24);
        setField(term2413, term2413.getClass(), "date", term2414);
        setByteField(term2418, term2418.getClass(), "hour", (byte) 0);
        setByteField(term2418, term2418.getClass(), "minute", (byte) 59);
        setByteField(term2418, term2418.getClass(), "second", (byte) 56);
        setIntField(term2418, term2418.getClass(), "nano", 320219201);
        setField(term2413, term2413.getClass(), "time", term2418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2413;
        callMethod(klass, "setDataCriacao", argTypes, term2288, args);
    }

};


