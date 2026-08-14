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
import java.lang.Long;

public class PessoaRs_getSobrenome_7784630896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public PessoaRs_getSobrenome_7784630896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term489 = new Long(4872422362414183754L);
        term488 = newInstance(Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRs"));
        setField(term488, term488.getClass(), "id", term489);
        setField(term488, term488.getClass(), "nome", "RkybSrpybU");
        setField(term488, term488.getClass(), "sobrenome", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.rodrigorahman.springbootcommysql.controller.dto.PessoaRs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSobrenome", argTypes, term488, args);
    }

};


