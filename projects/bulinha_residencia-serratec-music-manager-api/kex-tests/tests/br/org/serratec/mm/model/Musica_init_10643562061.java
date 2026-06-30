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

public class Musica_init_10643562061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4878;

    public Musica_init_10643562061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4879 = new Long(5381386339318883012L);
        Integer term4893 = new Integer(454281060);
        term4878 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term4878, term4878.getClass(), "id", term4879);
        setField(term4878, term4878.getClass(), "titulo", "sOdkipUKRu");
        setField(term4878, term4878.getClass(), "minutos", term4893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.MusicaDTO");
        Object[] args = new Object[1];
        args[0] = term4878;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


