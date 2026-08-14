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

public class Cliente_setNome_1034080994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public Cliente_setNome_1034080994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term742 = new Long(5270370404989704783L);
        term741 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term756 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term741, term741.getClass(), "id", term742);
        setField(term741, term741.getClass(), "nome", "SbAoxhfrkn");
        setField(term756, term756.getClass(), "cep", "kuTXqwMtDB");
        setField(term756, term756.getClass(), "logradouro", "Ghbwtircqb");
        setField(term756, term756.getClass(), "complemento", "xrwlQZdwCp");
        setField(term756, term756.getClass(), "bairro", "IDCWpPLRkE");
        setField(term756, term756.getClass(), "localidade", "nyiiPDVjAc");
        setField(term756, term756.getClass(), "uf", "aKnKipADSo");
        setField(term756, term756.getClass(), "ibge", "wSQxaModmm");
        setField(term756, term756.getClass(), "gia", "UlajhuVLaP");
        setField(term756, term756.getClass(), "ddd", "gGSMzuGICf");
        setField(term756, term756.getClass(), "siafi", "hxCBltsObl");
        setField(term741, term741.getClass(), "endereco", term756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setNome", argTypes, term741, args);
    }

};


