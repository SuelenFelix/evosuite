package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class MusicaAlbumDTO_init_2108175100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1611;
     Object term1719;

    public MusicaAlbumDTO_init_2108175100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1612 = new Long(4872422362414183754L);
        Integer term1626 = new Integer(-616727354);
        Long term1629 = new Long(6811161968424632369L);
        term1611 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term1628 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term1679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1684 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1694 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1709 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1710 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1714 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1611, term1611.getClass(), "id", term1612);
        setField(term1611, term1611.getClass(), "titulo", "bLPjGVBhlX");
        setField(term1611, term1611.getClass(), "minutos", term1626);
        setField(term1628, term1628.getClass(), "id", term1629);
        setField(term1628, term1628.getClass(), "email", "whBvTVIIlC");
        setField(term1628, term1628.getClass(), "nome", "IgRJUzaCwW");
        setField(term1628, term1628.getClass(), "senha", "JUmudUmaaV");
        setField(term1628, term1628.getClass(), "perfilUsuario", "KoyGrUJeJW");
        setIntField(term1680, term1680.getClass(), "year", 2022);
        setShortField(term1680, term1680.getClass(), "month", (short) 2);
        setShortField(term1680, term1680.getClass(), "day", (short) 26);
        setField(term1679, term1679.getClass(), "date", term1680);
        setByteField(term1684, term1684.getClass(), "hour", (byte) 11);
        setByteField(term1684, term1684.getClass(), "minute", (byte) 42);
        setByteField(term1684, term1684.getClass(), "second", (byte) 15);
        setIntField(term1684, term1684.getClass(), "nano", 377731937);
        setField(term1679, term1679.getClass(), "time", term1684);
        setField(term1628, term1628.getClass(), "dataCadastro", term1679);
        setIntField(term1690, term1690.getClass(), "year", 2026);
        setShortField(term1690, term1690.getClass(), "month", (short) 12);
        setShortField(term1690, term1690.getClass(), "day", (short) 14);
        setField(term1689, term1689.getClass(), "date", term1690);
        setByteField(term1694, term1694.getClass(), "hour", (byte) 16);
        setByteField(term1694, term1694.getClass(), "minute", (byte) 34);
        setByteField(term1694, term1694.getClass(), "second", (byte) 9);
        setIntField(term1694, term1694.getClass(), "nano", 518326996);
        setField(term1689, term1689.getClass(), "time", term1694);
        setField(term1628, term1628.getClass(), "dataAlteracao", term1689);
        setField(term1611, term1611.getClass(), "usuario", term1628);
        setIntField(term1700, term1700.getClass(), "year", 2025);
        setShortField(term1700, term1700.getClass(), "month", (short) 4);
        setShortField(term1700, term1700.getClass(), "day", (short) 24);
        setField(term1699, term1699.getClass(), "date", term1700);
        setByteField(term1704, term1704.getClass(), "hour", (byte) 18);
        setByteField(term1704, term1704.getClass(), "minute", (byte) 11);
        setByteField(term1704, term1704.getClass(), "second", (byte) 40);
        setIntField(term1704, term1704.getClass(), "nano", 137454929);
        setField(term1699, term1699.getClass(), "time", term1704);
        setField(term1611, term1611.getClass(), "dataCadastro", term1699);
        setIntField(term1710, term1710.getClass(), "year", 2024);
        setShortField(term1710, term1710.getClass(), "month", (short) 1);
        setShortField(term1710, term1710.getClass(), "day", (short) 24);
        setField(term1709, term1709.getClass(), "date", term1710);
        setByteField(term1714, term1714.getClass(), "hour", (byte) 20);
        setByteField(term1714, term1714.getClass(), "minute", (byte) 28);
        setByteField(term1714, term1714.getClass(), "second", (byte) 39);
        setIntField(term1714, term1714.getClass(), "nano", 952728177);
        setField(term1709, term1709.getClass(), "time", term1714);
        setField(term1611, term1611.getClass(), "dataAlteracao", term1709);
        term1719 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaAlbumDTO");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Musica");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1611;
        args[1] = term1719;
        args[2] = "HqBOwkVqjD";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


