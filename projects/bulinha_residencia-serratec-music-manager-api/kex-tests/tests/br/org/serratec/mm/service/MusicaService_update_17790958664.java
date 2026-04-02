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

public class MusicaService_update_17790958664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1073;
     Object term1075;

    public MusicaService_update_17790958664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1073 = new Long(1967728129628047933L);
        Long term1076 = new Long(2120084523938730454L);
        Integer term1090 = new Integer(-522618178);
        term1075 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term1075, term1075.getClass(), "id", term1076);
        setField(term1075, term1075.getClass(), "titulo", "TEParAifyi");
        setField(term1075, term1075.getClass(), "minutos", term1090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.MusicaService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.org.serratec.mm.dto.MusicaDTO");
        Object[] args = new Object[2];
        args[0] = term1073;
        args[1] = term1075;
        callMethod(klass, "update", argTypes, null, args);
    }

};


