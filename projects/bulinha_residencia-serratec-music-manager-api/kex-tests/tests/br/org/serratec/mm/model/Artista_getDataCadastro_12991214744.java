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

public class Artista_getDataCadastro_12991214744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8414;

    public Artista_getDataCadastro_12991214744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8415 = new Long(3412644969878030772L);
        Class<? extends Object> term8543 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term8542 = ((Class) term8543).getDeclaredField((String) "DUPLA");
        ((Field) term8542).setAccessible(true);
        Object enum3 = ((Field) term8542).get((Object) null);
        Long term8442 = new Long(6698455537431331246L);
        term8414 = newInstance(Class.forName("br.org.serratec.mm.model.Artista"));
        Object term8441 = newInstance(Class.forName("br.org.serratec.mm.model.Usuario"));
        Object term8492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8507 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8527 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8414, term8414.getClass(), "id", term8415);
        setField(term8414, term8414.getClass(), "nome", "MRFLbEGYKG");
        setField(term8414, term8414.getClass(), "tipo", enum3);
        setField(term8441, term8441.getClass(), "id", term8442);
        setField(term8441, term8441.getClass(), "email", "BYrGukTyof");
        setField(term8441, term8441.getClass(), "nome", "jiCGTTzKGB");
        setField(term8441, term8441.getClass(), "senha", "MqICFYzDJj");
        setField(term8441, term8441.getClass(), "perfilUsuario", "YgQvdcBQKw");
        setIntField(term8493, term8493.getClass(), "year", 2018);
        setShortField(term8493, term8493.getClass(), "month", (short) 2);
        setShortField(term8493, term8493.getClass(), "day", (short) 16);
        setField(term8492, term8492.getClass(), "date", term8493);
        setByteField(term8497, term8497.getClass(), "hour", (byte) 16);
        setByteField(term8497, term8497.getClass(), "minute", (byte) 32);
        setByteField(term8497, term8497.getClass(), "second", (byte) 46);
        setIntField(term8497, term8497.getClass(), "nano", 932915298);
        setField(term8492, term8492.getClass(), "time", term8497);
        setField(term8441, term8441.getClass(), "dataCadastro", term8492);
        setIntField(term8503, term8503.getClass(), "year", 2013);
        setShortField(term8503, term8503.getClass(), "month", (short) 11);
        setShortField(term8503, term8503.getClass(), "day", (short) 7);
        setField(term8502, term8502.getClass(), "date", term8503);
        setByteField(term8507, term8507.getClass(), "hour", (byte) 9);
        setByteField(term8507, term8507.getClass(), "minute", (byte) 3);
        setByteField(term8507, term8507.getClass(), "second", (byte) 32);
        setIntField(term8507, term8507.getClass(), "nano", 53548583);
        setField(term8502, term8502.getClass(), "time", term8507);
        setField(term8441, term8441.getClass(), "dataAlteracao", term8502);
        setField(term8414, term8414.getClass(), "usuario", term8441);
        setIntField(term8513, term8513.getClass(), "year", 2024);
        setShortField(term8513, term8513.getClass(), "month", (short) 11);
        setShortField(term8513, term8513.getClass(), "day", (short) 26);
        setField(term8512, term8512.getClass(), "date", term8513);
        setByteField(term8517, term8517.getClass(), "hour", (byte) 3);
        setByteField(term8517, term8517.getClass(), "minute", (byte) 8);
        setByteField(term8517, term8517.getClass(), "second", (byte) 47);
        setIntField(term8517, term8517.getClass(), "nano", 559634968);
        setField(term8512, term8512.getClass(), "time", term8517);
        setField(term8414, term8414.getClass(), "dataCadastro", term8512);
        setIntField(term8523, term8523.getClass(), "year", 2018);
        setShortField(term8523, term8523.getClass(), "month", (short) 4);
        setShortField(term8523, term8523.getClass(), "day", (short) 20);
        setField(term8522, term8522.getClass(), "date", term8523);
        setByteField(term8527, term8527.getClass(), "hour", (byte) 16);
        setByteField(term8527, term8527.getClass(), "minute", (byte) 13);
        setByteField(term8527, term8527.getClass(), "second", (byte) 15);
        setIntField(term8527, term8527.getClass(), "nano", 195741881);
        setField(term8522, term8522.getClass(), "time", term8527);
        setField(term8414, term8414.getClass(), "dataAlteracao", term8522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term8414, args);
    }

};


