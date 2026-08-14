package one.digitalinnovation.gof.model;

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
import static one.digitalinnovation.gof.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Cliente_getNome_16164684693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;

    public Cliente_getNome_16164684693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term496 = new Long(-8400487765614892086L);
        term495 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term510 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term495, term495.getClass(), "id", term496);
        setField(term495, term495.getClass(), "nome", "xOEqzGAmDU");
        setField(term510, term510.getClass(), "cep", "eZFUvlxvGV");
        setField(term510, term510.getClass(), "logradouro", "BYqFIqCKAV");
        setField(term510, term510.getClass(), "complemento", "vrQLuWIDJX");
        setField(term510, term510.getClass(), "bairro", "flxyYxBRtu");
        setField(term510, term510.getClass(), "localidade", "OclPbYPkcH");
        setField(term510, term510.getClass(), "uf", "IoAlmYsBwc");
        setField(term510, term510.getClass(), "ibge", "TEParAifyi");
        setField(term510, term510.getClass(), "gia", "OWDIEULEFu");
        setField(term510, term510.getClass(), "ddd", "dWRymuLBtr");
        setField(term510, term510.getClass(), "siafi", "AijpHYOFuy");
        setField(term495, term495.getClass(), "endereco", term510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term495, args);
    }

};


