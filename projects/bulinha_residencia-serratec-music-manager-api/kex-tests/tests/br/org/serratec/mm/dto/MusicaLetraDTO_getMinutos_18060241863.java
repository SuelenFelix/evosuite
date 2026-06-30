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

public class MusicaLetraDTO_getMinutos_18060241863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1509;

    public MusicaLetraDTO_getMinutos_18060241863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1510 = new Long(5270370404989704783L);
        Integer term1524 = new Integer(391863371);
        term1509 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO"));
        setField(term1509, term1509.getClass(), "id", term1510);
        setField(term1509, term1509.getClass(), "titulo", "uWHnvSvaPl");
        setField(term1509, term1509.getClass(), "minutos", term1524);
        setField(term1509, term1509.getClass(), "letra", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinutos", argTypes, term1509, args);
    }

};


