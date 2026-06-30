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
import java.lang.Integer;
import java.lang.Object;

public class Musica_setDataCadastro_170362410211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6464;
     Object term6572;

    public Musica_setDataCadastro_170362410211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6465 = new Long(3427570961451840069L);
        Integer term6479 = new Integer(-1371869594);
        Long term6482 = new Long(4502292577098212311L);
        term6464 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term6481 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term6532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6547 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6567 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6464, term6464.getClass(), "id", term6465);
        setField(term6464, term6464.getClass(), "titulo", "AyrEXuGrEj");
        setField(term6464, term6464.getClass(), "minutos", term6479);
        setField(term6481, term6481.getClass(), "id", term6482);
        setField(term6481, term6481.getClass(), "email", "yevIIoVYHq");
        setField(term6481, term6481.getClass(), "nome", "UuYWMTqWTV");
        setField(term6481, term6481.getClass(), "senha", "DSFGlcaXUb");
        setField(term6481, term6481.getClass(), "perfilUsuario", "sHMXNUzNeM");
        setIntField(term6533, term6533.getClass(), "year", 2023);
        setShortField(term6533, term6533.getClass(), "month", (short) 12);
        setShortField(term6533, term6533.getClass(), "day", (short) 3);
        setField(term6532, term6532.getClass(), "date", term6533);
        setByteField(term6537, term6537.getClass(), "hour", (byte) 14);
        setByteField(term6537, term6537.getClass(), "minute", (byte) 6);
        setByteField(term6537, term6537.getClass(), "second", (byte) 20);
        setIntField(term6537, term6537.getClass(), "nano", 660325634);
        setField(term6532, term6532.getClass(), "time", term6537);
        setField(term6481, term6481.getClass(), "dataCadastro", term6532);
        setIntField(term6543, term6543.getClass(), "year", 2019);
        setShortField(term6543, term6543.getClass(), "month", (short) 2);
        setShortField(term6543, term6543.getClass(), "day", (short) 13);
        setField(term6542, term6542.getClass(), "date", term6543);
        setByteField(term6547, term6547.getClass(), "hour", (byte) 5);
        setByteField(term6547, term6547.getClass(), "minute", (byte) 59);
        setByteField(term6547, term6547.getClass(), "second", (byte) 42);
        setIntField(term6547, term6547.getClass(), "nano", 720385556);
        setField(term6542, term6542.getClass(), "time", term6547);
        setField(term6481, term6481.getClass(), "dataAlteracao", term6542);
        setField(term6464, term6464.getClass(), "usuario", term6481);
        setIntField(term6553, term6553.getClass(), "year", 2016);
        setShortField(term6553, term6553.getClass(), "month", (short) 2);
        setShortField(term6553, term6553.getClass(), "day", (short) 12);
        setField(term6552, term6552.getClass(), "date", term6553);
        setByteField(term6557, term6557.getClass(), "hour", (byte) 7);
        setByteField(term6557, term6557.getClass(), "minute", (byte) 16);
        setByteField(term6557, term6557.getClass(), "second", (byte) 55);
        setIntField(term6557, term6557.getClass(), "nano", 690063047);
        setField(term6552, term6552.getClass(), "time", term6557);
        setField(term6464, term6464.getClass(), "dataCadastro", term6552);
        setIntField(term6563, term6563.getClass(), "year", 2019);
        setShortField(term6563, term6563.getClass(), "month", (short) 3);
        setShortField(term6563, term6563.getClass(), "day", (short) 19);
        setField(term6562, term6562.getClass(), "date", term6563);
        setByteField(term6567, term6567.getClass(), "hour", (byte) 19);
        setByteField(term6567, term6567.getClass(), "minute", (byte) 24);
        setByteField(term6567, term6567.getClass(), "second", (byte) 21);
        setIntField(term6567, term6567.getClass(), "nano", 765889037);
        setField(term6562, term6562.getClass(), "time", term6567);
        setField(term6464, term6464.getClass(), "dataAlteracao", term6562);
        term6572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6577 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6573, term6573.getClass(), "year", 2021);
        setShortField(term6573, term6573.getClass(), "month", (short) 7);
        setShortField(term6573, term6573.getClass(), "day", (short) 2);
        setField(term6572, term6572.getClass(), "date", term6573);
        setByteField(term6577, term6577.getClass(), "hour", (byte) 21);
        setByteField(term6577, term6577.getClass(), "minute", (byte) 55);
        setByteField(term6577, term6577.getClass(), "second", (byte) 54);
        setIntField(term6577, term6577.getClass(), "nano", 731983440);
        setField(term6572, term6572.getClass(), "time", term6577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term6572;
        callMethod(klass, "setDataCadastro", argTypes, term6464, args);
    }

};


