package one.digitalinnovation.gof.service.impl;

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
import static one.digitalinnovation.gof.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ClienteServiceImpl_salvarClienteComCep_12643901196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;

    public ClienteServiceImpl_salvarClienteComCep_12643901196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term500 = new Long(7411271909051562686L);
        term499 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term514 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term499, term499.getClass(), "id", term500);
        setField(term499, term499.getClass(), "nome", "xOEqzGAmDU");
        setField(term514, term514.getClass(), "cep", "eZFUvlxvGV");
        setField(term514, term514.getClass(), "logradouro", "BYqFIqCKAV");
        setField(term514, term514.getClass(), "complemento", "vrQLuWIDJX");
        setField(term514, term514.getClass(), "bairro", "flxyYxBRtu");
        setField(term514, term514.getClass(), "localidade", "OclPbYPkcH");
        setField(term514, term514.getClass(), "uf", "IoAlmYsBwc");
        setField(term514, term514.getClass(), "ibge", "TEParAifyi");
        setField(term514, term514.getClass(), "gia", "OWDIEULEFu");
        setField(term514, term514.getClass(), "ddd", "dWRymuLBtr");
        setField(term514, term514.getClass(), "siafi", "AijpHYOFuy");
        setField(term499, term499.getClass(), "endereco", term514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.service.impl.ClienteServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Object[] args = new Object[1];
        args[0] = term499;
        callMethod(klass, "salvarClienteComCep", argTypes, null, args);
    }

};


