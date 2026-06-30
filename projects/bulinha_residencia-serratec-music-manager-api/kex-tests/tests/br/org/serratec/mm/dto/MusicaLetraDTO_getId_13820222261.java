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

public class MusicaLetraDTO_getId_13820222261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1411;

    public MusicaLetraDTO_getId_13820222261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1412 = new Long(-8257434502486459194L);
        Integer term1426 = new Integer(1162663216);
        term1411 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO"));
        setField(term1411, term1411.getClass(), "id", term1412);
        setField(term1411, term1411.getClass(), "titulo", "dEnhdmILtU");
        setField(term1411, term1411.getClass(), "minutos", term1426);
        setField(term1411, term1411.getClass(), "letra", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaLetraDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1411, args);
    }

};


