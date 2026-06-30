package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsuarioUpdateDTO_getSenha_4546316187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;

    public UsuarioUpdateDTO_getSenha_4546316187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO"));
        setField(term733, term733.getClass(), "nome", "SbAoxhfrkn");
        setField(term733, term733.getClass(), "email", "kuTXqwMtDB");
        setField(term733, term733.getClass(), "perfilUsuario", "Ghbwtircqb");
        setField(term733, term733.getClass(), "senha", "xrwlQZdwCp");
        setField(term733, term733.getClass(), "confirmaSenha", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSenha", argTypes, term733, args);
    }

};


