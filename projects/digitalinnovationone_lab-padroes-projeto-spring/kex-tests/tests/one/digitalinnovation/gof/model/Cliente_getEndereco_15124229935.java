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

public class Cliente_getEndereco_15124229935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009;

    public Cliente_getEndereco_15124229935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1010 = new Long(7411271909051562686L);
        term1009 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term1024 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term1009, term1009.getClass(), "id", term1010);
        setField(term1009, term1009.getClass(), "nome", "GzFkzHGYFt");
        setField(term1024, term1024.getClass(), "cep", "tShwQLRGNe");
        setField(term1024, term1024.getClass(), "logradouro", "LvtrsXUliU");
        setField(term1024, term1024.getClass(), "complemento", "xLbjWUgOIL");
        setField(term1024, term1024.getClass(), "bairro", "jDtqGUpnZN");
        setField(term1024, term1024.getClass(), "localidade", "nGKItKLYNC");
        setField(term1024, term1024.getClass(), "uf", "UiUYnPrcCi");
        setField(term1024, term1024.getClass(), "ibge", "UoYtihxVaS");
        setField(term1024, term1024.getClass(), "gia", "JDswTTCZHV");
        setField(term1024, term1024.getClass(), "ddd", "onpbIeEKoi");
        setField(term1024, term1024.getClass(), "siafi", "YRHGsAkhxb");
        setField(term1009, term1009.getClass(), "endereco", term1024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndereco", argTypes, term1009, args);
    }

};


