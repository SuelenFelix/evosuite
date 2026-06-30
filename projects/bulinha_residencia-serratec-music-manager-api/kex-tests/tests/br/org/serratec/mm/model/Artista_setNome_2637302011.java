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
import java.lang.String;
import java.lang.Object;

public class Artista_setNome_2637302011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11010;

    public Artista_setNome_2637302011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11011 = new Long(-1885698929232124806L);
        Class<? extends Object> term11151 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term11150 = ((Class) term11151).getDeclaredField((String) "BANDA");
        ((Field) term11150).setAccessible(true);
        Object enum10 = ((Field) term11150).get((Object) null);
        Long term11038 = new Long(5731563613239387113L);
        term11010 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term11037 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term11088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11113 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11123 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11010, term11010.getClass(), "id", term11011);
        setField(term11010, term11010.getClass(), "nome", "CAMnvfDLJL");
        setField(term11010, term11010.getClass(), "tipo", enum10);
        setField(term11037, term11037.getClass(), "id", term11038);
        setField(term11037, term11037.getClass(), "email", "mfHtgSbdjD");
        setField(term11037, term11037.getClass(), "nome", "cmuaUiHMVL");
        setField(term11037, term11037.getClass(), "senha", "xjoSGPWUgu");
        setField(term11037, term11037.getClass(), "perfilUsuario", "uzmqjnOUXu");
        setIntField(term11089, term11089.getClass(), "year", 2020);
        setShortField(term11089, term11089.getClass(), "month", (short) 2);
        setShortField(term11089, term11089.getClass(), "day", (short) 22);
        setField(term11088, term11088.getClass(), "date", term11089);
        setByteField(term11093, term11093.getClass(), "hour", (byte) 5);
        setByteField(term11093, term11093.getClass(), "minute", (byte) 45);
        setByteField(term11093, term11093.getClass(), "second", (byte) 53);
        setIntField(term11093, term11093.getClass(), "nano", 933056720);
        setField(term11088, term11088.getClass(), "time", term11093);
        setField(term11037, term11037.getClass(), "dataCadastro", term11088);
        setIntField(term11099, term11099.getClass(), "year", 2012);
        setShortField(term11099, term11099.getClass(), "month", (short) 11);
        setShortField(term11099, term11099.getClass(), "day", (short) 26);
        setField(term11098, term11098.getClass(), "date", term11099);
        setByteField(term11103, term11103.getClass(), "hour", (byte) 23);
        setByteField(term11103, term11103.getClass(), "minute", (byte) 32);
        setByteField(term11103, term11103.getClass(), "second", (byte) 25);
        setIntField(term11103, term11103.getClass(), "nano", 47326173);
        setField(term11098, term11098.getClass(), "time", term11103);
        setField(term11037, term11037.getClass(), "dataAlteracao", term11098);
        setField(term11010, term11010.getClass(), "usuario", term11037);
        setIntField(term11109, term11109.getClass(), "year", 2010);
        setShortField(term11109, term11109.getClass(), "month", (short) 2);
        setShortField(term11109, term11109.getClass(), "day", (short) 22);
        setField(term11108, term11108.getClass(), "date", term11109);
        setByteField(term11113, term11113.getClass(), "hour", (byte) 10);
        setByteField(term11113, term11113.getClass(), "minute", (byte) 57);
        setByteField(term11113, term11113.getClass(), "second", (byte) 47);
        setIntField(term11113, term11113.getClass(), "nano", 236871229);
        setField(term11108, term11108.getClass(), "time", term11113);
        setField(term11010, term11010.getClass(), "dataCadastro", term11108);
        setIntField(term11119, term11119.getClass(), "year", 2028);
        setShortField(term11119, term11119.getClass(), "month", (short) 10);
        setShortField(term11119, term11119.getClass(), "day", (short) 4);
        setField(term11118, term11118.getClass(), "date", term11119);
        setByteField(term11123, term11123.getClass(), "hour", (byte) 7);
        setByteField(term11123, term11123.getClass(), "minute", (byte) 45);
        setByteField(term11123, term11123.getClass(), "second", (byte) 52);
        setIntField(term11123, term11123.getClass(), "nano", 886309979);
        setField(term11118, term11118.getClass(), "time", term11123);
        setField(term11010, term11010.getClass(), "dataAlteracao", term11118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xeyjTOCOJb";
        callMethod(klass, "setNome", argTypes, term11010, args);
    }

};


