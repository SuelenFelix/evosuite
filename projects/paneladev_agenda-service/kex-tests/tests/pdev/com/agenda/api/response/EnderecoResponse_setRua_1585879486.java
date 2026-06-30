package pdev.com.agenda.api.response;

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
import static pdev.com.agenda.api.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class EnderecoResponse_setRua_1585879486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3412;

    public EnderecoResponse_setRua_1585879486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3413 = new Long(3452833434644634217L);
        Long term3427 = new Long(-8603648071751666348L);
        term3412 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3412, term3412.getClass(), "id", term3413);
        setField(term3412, term3412.getClass(), "rua", "TXZAIPQJHt");
        setField(term3412, term3412.getClass(), "numero", term3427);
        setField(term3412, term3412.getClass(), "complemento", "DIbeDHICho");
        setField(term3412, term3412.getClass(), "bairro", "dJGPlmSRnz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DPskuFUobI";
        callMethod(klass, "setRua", argTypes, term3412, args);
    }

};


