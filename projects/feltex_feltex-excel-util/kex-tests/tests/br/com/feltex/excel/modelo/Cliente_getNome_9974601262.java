package br.com.feltex.excel.modelo;

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
import static br.com.feltex.excel.modelo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Cliente_getNome_9974601262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;

    public Cliente_getNome_9974601262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term559 = new Integer(1227103734);
        term558 = newInstance(Class.forName("br.com.feltex.excel.modelo.Cliente"));
        setField(term558, term558.getClass(), "id", term559);
        setField(term558, term558.getClass(), "nome", "BYqFIqCKAV");
        setField(term558, term558.getClass(), "email", "vrQLuWIDJX");
        setField(term558, term558.getClass(), "telefone", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.feltex.excel.modelo.Cliente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term558, args);
    }

};


