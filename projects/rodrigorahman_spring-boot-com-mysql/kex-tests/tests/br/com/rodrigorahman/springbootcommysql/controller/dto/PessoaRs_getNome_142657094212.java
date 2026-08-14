package br.com.rodrigorahman.springbootcommysql.controller.dto;

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
import static br.com.rodrigorahman.springbootcommysql.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PessoaRs_getNome_142657094212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;

    public PessoaRs_getNome_142657094212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607 = newInstance(Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRs"));
        setField(term607, term607.getClass(), "id", null);
        setField(term607, term607.getClass(), "nome", null);
        setField(term607, term607.getClass(), "sobrenome", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term607, args);
    }

};


