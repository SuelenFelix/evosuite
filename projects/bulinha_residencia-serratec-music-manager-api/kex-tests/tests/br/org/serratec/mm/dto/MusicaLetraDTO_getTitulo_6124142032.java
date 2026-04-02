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

public class MusicaLetraDTO_getTitulo_6124142032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;

    public MusicaLetraDTO_getTitulo_6124142032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1461 = new Long(-8400487765614892086L);
        Integer term1475 = new Integer(1484323161);
        term1460 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO"));
        setField(term1460, term1460.getClass(), "id", term1461);
        setField(term1460, term1460.getClass(), "titulo", "eqJfYWRaEL");
        setField(term1460, term1460.getClass(), "minutos", term1475);
        setField(term1460, term1460.getClass(), "letra", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitulo", argTypes, term1460, args);
    }

};


