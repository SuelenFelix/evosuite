package br.com.rodrigorahman.springbootcommysql.controller;

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
import static br.com.rodrigorahman.springbootcommysql.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PessoaController_updatePerson_9849672863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term50;

    public PessoaController_updatePerson_9849672863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = new Long(6375119433582206027L);
        term50 = newInstance(Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRq"));
        setField(term50, term50.getClass(), "nome", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "sobrenome", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.rodrigorahman.springbootcommysql.controller.PessoaController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRq");
        Object[] args = new Object[2];
        args[0] = term48;
        args[1] = term50;
        callMethod(klass, "updatePerson", argTypes, null, args);
    }

};


