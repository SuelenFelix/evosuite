package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Endereco_getRua_12228183912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2842;

    public Endereco_getRua_12228183912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2843 = new Long(-1804015692891701666L);
        Long term2857 = new Long(-6432617521836576658L);
        term2842 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2842, term2842.getClass(), "id", term2843);
        setField(term2842, term2842.getClass(), "rua", "XfRABIFVEp");
        setField(term2842, term2842.getClass(), "numero", term2857);
        setField(term2842, term2842.getClass(), "complemento", "MHGKyEnwKc");
        setField(term2842, term2842.getClass(), "bairro", "ShIELyuULw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRua", argTypes, term2842, args);
    }

};


