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

public class Musica_equals_112345443015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7116;
     Object term7224;

    public Musica_equals_112345443015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7117 = new Long(4699157009689333952L);
        Integer term7131 = new Integer(-1588772968);
        Long term7134 = new Long(-78240609295693193L);
        term7116 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term7133 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term7184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7219 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7116, term7116.getClass(), "id", term7117);
        setField(term7116, term7116.getClass(), "titulo", "QNjNTLlUaV");
        setField(term7116, term7116.getClass(), "minutos", term7131);
        setField(term7133, term7133.getClass(), "id", term7134);
        setField(term7133, term7133.getClass(), "email", "hIYsRyOZxk");
        setField(term7133, term7133.getClass(), "nome", "RjNoEywJbC");
        setField(term7133, term7133.getClass(), "senha", "RTTvrwwhou");
        setField(term7133, term7133.getClass(), "perfilUsuario", "lRORwXipuk");
        setIntField(term7185, term7185.getClass(), "year", 2017);
        setShortField(term7185, term7185.getClass(), "month", (short) 11);
        setShortField(term7185, term7185.getClass(), "day", (short) 19);
        setField(term7184, term7184.getClass(), "date", term7185);
        setByteField(term7189, term7189.getClass(), "hour", (byte) 2);
        setByteField(term7189, term7189.getClass(), "minute", (byte) 52);
        setByteField(term7189, term7189.getClass(), "second", (byte) 15);
        setIntField(term7189, term7189.getClass(), "nano", 625778933);
        setField(term7184, term7184.getClass(), "time", term7189);
        setField(term7133, term7133.getClass(), "dataCadastro", term7184);
        setIntField(term7195, term7195.getClass(), "year", 2015);
        setShortField(term7195, term7195.getClass(), "month", (short) 10);
        setShortField(term7195, term7195.getClass(), "day", (short) 3);
        setField(term7194, term7194.getClass(), "date", term7195);
        setByteField(term7199, term7199.getClass(), "hour", (byte) 10);
        setByteField(term7199, term7199.getClass(), "minute", (byte) 45);
        setByteField(term7199, term7199.getClass(), "second", (byte) 18);
        setIntField(term7199, term7199.getClass(), "nano", 333457081);
        setField(term7194, term7194.getClass(), "time", term7199);
        setField(term7133, term7133.getClass(), "dataAlteracao", term7194);
        setField(term7116, term7116.getClass(), "usuario", term7133);
        setIntField(term7205, term7205.getClass(), "year", 2013);
        setShortField(term7205, term7205.getClass(), "month", (short) 3);
        setShortField(term7205, term7205.getClass(), "day", (short) 3);
        setField(term7204, term7204.getClass(), "date", term7205);
        setByteField(term7209, term7209.getClass(), "hour", (byte) 22);
        setByteField(term7209, term7209.getClass(), "minute", (byte) 27);
        setByteField(term7209, term7209.getClass(), "second", (byte) 52);
        setIntField(term7209, term7209.getClass(), "nano", 968779154);
        setField(term7204, term7204.getClass(), "time", term7209);
        setField(term7116, term7116.getClass(), "dataCadastro", term7204);
        setIntField(term7215, term7215.getClass(), "year", 2019);
        setShortField(term7215, term7215.getClass(), "month", (short) 8);
        setShortField(term7215, term7215.getClass(), "day", (short) 31);
        setField(term7214, term7214.getClass(), "date", term7215);
        setByteField(term7219, term7219.getClass(), "hour", (byte) 22);
        setByteField(term7219, term7219.getClass(), "minute", (byte) 31);
        setByteField(term7219, term7219.getClass(), "second", (byte) 36);
        setIntField(term7219, term7219.getClass(), "nano", 403358328);
        setField(term7214, term7214.getClass(), "time", term7219);
        setField(term7116, term7116.getClass(), "dataAlteracao", term7214);
        term7224 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7224;
        callMethod(klass, "equals", argTypes, term7116, args);
    }

};


