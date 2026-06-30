package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlayList_getDataCadastro_21369922603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2434;

    public PlayList_getDataCadastro_21369922603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2435 = new Long(4178434741742309755L);
        Long term2452 = new Long(-2068172595987555756L);
        Integer term2455 = new Integer(-1339778481);
        Long term2458 = new Long(-6292278961887936280L);
        Object term2451 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term2457 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2461 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term2451, term2451.getClass(), "id", term2452);
        setField(term2451, term2451.getClass(), "titulo", "");
        setField(term2451, term2451.getClass(), "minutos", term2455);
        setField(term2457, term2457.getClass(), "id", term2458);
        setField(term2457, term2457.getClass(), "email", null);
        setField(term2457, term2457.getClass(), "nome", null);
        setField(term2457, term2457.getClass(), "senha", null);
        setField(term2457, term2457.getClass(), "perfilUsuario", null);
        setField(term2457, term2457.getClass(), "dataCadastro", null);
        setField(term2457, term2457.getClass(), "dataAlteracao", null);
        setField(term2451, term2451.getClass(), "usuario", term2457);
        setField(term2460, term2460.getClass(), "date", null);
        setField(term2460, term2460.getClass(), "time", null);
        setField(term2451, term2451.getClass(), "dataCadastro", term2460);
        setField(term2461, term2461.getClass(), "date", null);
        setField(term2461, term2461.getClass(), "time", null);
        setField(term2451, term2451.getClass(), "dataAlteracao", term2461);
        Long term2463 = new Long(-6645965768855543712L);
        Integer term2466 = new Integer(1725571209);
        Long term2469 = new Long(4784595517102746672L);
        Object term2462 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term2468 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2472 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term2462, term2462.getClass(), "id", term2463);
        setField(term2462, term2462.getClass(), "titulo", "");
        setField(term2462, term2462.getClass(), "minutos", term2466);
        setField(term2468, term2468.getClass(), "id", term2469);
        setField(term2468, term2468.getClass(), "email", null);
        setField(term2468, term2468.getClass(), "nome", null);
        setField(term2468, term2468.getClass(), "senha", null);
        setField(term2468, term2468.getClass(), "perfilUsuario", null);
        setField(term2468, term2468.getClass(), "dataCadastro", null);
        setField(term2468, term2468.getClass(), "dataAlteracao", null);
        setField(term2462, term2462.getClass(), "usuario", term2468);
        setField(term2471, term2471.getClass(), "date", null);
        setField(term2471, term2471.getClass(), "time", null);
        setField(term2462, term2462.getClass(), "dataCadastro", term2471);
        setField(term2472, term2472.getClass(), "date", null);
        setField(term2472, term2472.getClass(), "time", null);
        setField(term2462, term2462.getClass(), "dataAlteracao", term2472);
        Long term2474 = new Long(-7612550318181586304L);
        Integer term2477 = new Integer(-522618178);
        Long term2480 = new Long(-2170847986967241072L);
        Object term2473 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term2479 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2483 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term2473, term2473.getClass(), "id", term2474);
        setField(term2473, term2473.getClass(), "titulo", "");
        setField(term2473, term2473.getClass(), "minutos", term2477);
        setField(term2479, term2479.getClass(), "id", term2480);
        setField(term2479, term2479.getClass(), "email", null);
        setField(term2479, term2479.getClass(), "nome", null);
        setField(term2479, term2479.getClass(), "senha", null);
        setField(term2479, term2479.getClass(), "perfilUsuario", null);
        setField(term2479, term2479.getClass(), "dataCadastro", null);
        setField(term2479, term2479.getClass(), "dataAlteracao", null);
        setField(term2473, term2473.getClass(), "usuario", term2479);
        setField(term2482, term2482.getClass(), "date", null);
        setField(term2482, term2482.getClass(), "time", null);
        setField(term2473, term2473.getClass(), "dataCadastro", term2482);
        setField(term2483, term2483.getClass(), "date", null);
        setField(term2483, term2483.getClass(), "time", null);
        setField(term2473, term2473.getClass(), "dataAlteracao", term2483);
        ArrayList term2449 = new ArrayList();
        ((ArrayList) term2449).add(term2451);
        ((ArrayList) term2449).add(term2462);
        ((ArrayList) term2449).add(term2473);
        Long term2487 = new Long(4044358158040652353L);
        term2434 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        Object term2486 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term2537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2562 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2572 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2434, term2434.getClass(), "id", term2435);
        setField(term2434, term2434.getClass(), "nome", "mLUZFTfjle");
        setField(term2434, term2434.getClass(), "musicas", term2449);
        setField(term2486, term2486.getClass(), "id", term2487);
        setField(term2486, term2486.getClass(), "email", "pXOkjyeIRb");
        setField(term2486, term2486.getClass(), "nome", "GgZWSjxjyE");
        setField(term2486, term2486.getClass(), "senha", "EeBVbzjcCI");
        setField(term2486, term2486.getClass(), "perfilUsuario", "UfQtPRyWRC");
        setIntField(term2538, term2538.getClass(), "year", 2021);
        setShortField(term2538, term2538.getClass(), "month", (short) 4);
        setShortField(term2538, term2538.getClass(), "day", (short) 26);
        setField(term2537, term2537.getClass(), "date", term2538);
        setByteField(term2542, term2542.getClass(), "hour", (byte) 11);
        setByteField(term2542, term2542.getClass(), "minute", (byte) 34);
        setByteField(term2542, term2542.getClass(), "second", (byte) 15);
        setIntField(term2542, term2542.getClass(), "nano", 638206023);
        setField(term2537, term2537.getClass(), "time", term2542);
        setField(term2486, term2486.getClass(), "dataCadastro", term2537);
        setIntField(term2548, term2548.getClass(), "year", 2013);
        setShortField(term2548, term2548.getClass(), "month", (short) 9);
        setShortField(term2548, term2548.getClass(), "day", (short) 13);
        setField(term2547, term2547.getClass(), "date", term2548);
        setByteField(term2552, term2552.getClass(), "hour", (byte) 14);
        setByteField(term2552, term2552.getClass(), "minute", (byte) 36);
        setByteField(term2552, term2552.getClass(), "second", (byte) 59);
        setIntField(term2552, term2552.getClass(), "nano", 363124001);
        setField(term2547, term2547.getClass(), "time", term2552);
        setField(term2486, term2486.getClass(), "dataAlteracao", term2547);
        setField(term2434, term2434.getClass(), "usuario", term2486);
        setIntField(term2558, term2558.getClass(), "year", 2020);
        setShortField(term2558, term2558.getClass(), "month", (short) 12);
        setShortField(term2558, term2558.getClass(), "day", (short) 21);
        setField(term2557, term2557.getClass(), "date", term2558);
        setByteField(term2562, term2562.getClass(), "hour", (byte) 20);
        setByteField(term2562, term2562.getClass(), "minute", (byte) 16);
        setByteField(term2562, term2562.getClass(), "second", (byte) 59);
        setIntField(term2562, term2562.getClass(), "nano", 976524801);
        setField(term2557, term2557.getClass(), "time", term2562);
        setField(term2434, term2434.getClass(), "dataCadastro", term2557);
        setIntField(term2568, term2568.getClass(), "year", 2028);
        setShortField(term2568, term2568.getClass(), "month", (short) 5);
        setShortField(term2568, term2568.getClass(), "day", (short) 15);
        setField(term2567, term2567.getClass(), "date", term2568);
        setByteField(term2572, term2572.getClass(), "hour", (byte) 20);
        setByteField(term2572, term2572.getClass(), "minute", (byte) 31);
        setByteField(term2572, term2572.getClass(), "second", (byte) 49);
        setIntField(term2572, term2572.getClass(), "nano", 945744862);
        setField(term2567, term2567.getClass(), "time", term2572);
        setField(term2434, term2434.getClass(), "dataAlteracao", term2567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term2434, args);
    }

};


