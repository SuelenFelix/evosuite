package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class MusicaService_insert_2716657523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1046;

    public MusicaService_insert_2716657523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1047 = new Long(-4502405999831680926L);
        Integer term1061 = new Integer(1725571209);
        term1046 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term1046, term1046.getClass(), "id", term1047);
        setField(term1046, term1046.getClass(), "titulo", "IoAlmYsBwc");
        setField(term1046, term1046.getClass(), "minutos", term1061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.MusicaService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.MusicaDTO");
        Object[] args = new Object[1];
        args[0] = term1046;
        callMethod(klass, "insert", argTypes, null, args);
    }

};


