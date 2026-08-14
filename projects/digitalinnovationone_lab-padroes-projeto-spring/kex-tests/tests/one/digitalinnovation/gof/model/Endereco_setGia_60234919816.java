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

public class Endereco_setGia_60234919816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5197;

    public Endereco_setGia_60234919816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5197 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term5197, term5197.getClass(), "cep", "OcJCIDNIXA");
        setField(term5197, term5197.getClass(), "logradouro", "XfRABIFVEp");
        setField(term5197, term5197.getClass(), "complemento", "MHGKyEnwKc");
        setField(term5197, term5197.getClass(), "bairro", "ShIELyuULw");
        setField(term5197, term5197.getClass(), "localidade", "IpQuOGMgmj");
        setField(term5197, term5197.getClass(), "uf", "pJbnHTYrxn");
        setField(term5197, term5197.getClass(), "ibge", "iIRsCSYqXH");
        setField(term5197, term5197.getClass(), "gia", "nghfqDXyCG");
        setField(term5197, term5197.getClass(), "ddd", "WBAOTqErtm");
        setField(term5197, term5197.getClass(), "siafi", "PqtVXXZMqK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        callMethod(klass, "setGia", argTypes, term5197, args);
    }

};


