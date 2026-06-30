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

public class Musica_setTitulo_4514162845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5381;

    public Musica_setTitulo_4514162845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5382 = new Long(-7278883608542636188L);
        Integer term5396 = new Integer(292681826);
        Long term5399 = new Long(-1539859611880912454L);
        term5381 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        Object term5398 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term5449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5464 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5484 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5381, term5381.getClass(), "id", term5382);
        setField(term5381, term5381.getClass(), "titulo", "cdHYQDgUZR");
        setField(term5381, term5381.getClass(), "minutos", term5396);
        setField(term5398, term5398.getClass(), "id", term5399);
        setField(term5398, term5398.getClass(), "email", "KAORSSPSeV");
        setField(term5398, term5398.getClass(), "nome", "UimMMORkzd");
        setField(term5398, term5398.getClass(), "senha", "huVIXUWLtI");
        setField(term5398, term5398.getClass(), "perfilUsuario", "vhKzFyKPOT");
        setIntField(term5450, term5450.getClass(), "year", 2014);
        setShortField(term5450, term5450.getClass(), "month", (short) 5);
        setShortField(term5450, term5450.getClass(), "day", (short) 18);
        setField(term5449, term5449.getClass(), "date", term5450);
        setByteField(term5454, term5454.getClass(), "hour", (byte) 19);
        setByteField(term5454, term5454.getClass(), "minute", (byte) 25);
        setByteField(term5454, term5454.getClass(), "second", (byte) 8);
        setIntField(term5454, term5454.getClass(), "nano", 217186771);
        setField(term5449, term5449.getClass(), "time", term5454);
        setField(term5398, term5398.getClass(), "dataCadastro", term5449);
        setIntField(term5460, term5460.getClass(), "year", 2023);
        setShortField(term5460, term5460.getClass(), "month", (short) 2);
        setShortField(term5460, term5460.getClass(), "day", (short) 27);
        setField(term5459, term5459.getClass(), "date", term5460);
        setByteField(term5464, term5464.getClass(), "hour", (byte) 5);
        setByteField(term5464, term5464.getClass(), "minute", (byte) 50);
        setByteField(term5464, term5464.getClass(), "second", (byte) 50);
        setIntField(term5464, term5464.getClass(), "nano", 528521692);
        setField(term5459, term5459.getClass(), "time", term5464);
        setField(term5398, term5398.getClass(), "dataAlteracao", term5459);
        setField(term5381, term5381.getClass(), "usuario", term5398);
        setIntField(term5470, term5470.getClass(), "year", 2017);
        setShortField(term5470, term5470.getClass(), "month", (short) 1);
        setShortField(term5470, term5470.getClass(), "day", (short) 4);
        setField(term5469, term5469.getClass(), "date", term5470);
        setByteField(term5474, term5474.getClass(), "hour", (byte) 17);
        setByteField(term5474, term5474.getClass(), "minute", (byte) 39);
        setByteField(term5474, term5474.getClass(), "second", (byte) 5);
        setIntField(term5474, term5474.getClass(), "nano", 712424493);
        setField(term5469, term5469.getClass(), "time", term5474);
        setField(term5381, term5381.getClass(), "dataCadastro", term5469);
        setIntField(term5480, term5480.getClass(), "year", 2012);
        setShortField(term5480, term5480.getClass(), "month", (short) 1);
        setShortField(term5480, term5480.getClass(), "day", (short) 27);
        setField(term5479, term5479.getClass(), "date", term5480);
        setByteField(term5484, term5484.getClass(), "hour", (byte) 3);
        setByteField(term5484, term5484.getClass(), "minute", (byte) 30);
        setByteField(term5484, term5484.getClass(), "second", (byte) 25);
        setIntField(term5484, term5484.getClass(), "nano", 460782173);
        setField(term5479, term5479.getClass(), "time", term5484);
        setField(term5381, term5381.getClass(), "dataAlteracao", term5479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nQhIgWXdRc";
        callMethod(klass, "setTitulo", argTypes, term5381, args);
    }

};


