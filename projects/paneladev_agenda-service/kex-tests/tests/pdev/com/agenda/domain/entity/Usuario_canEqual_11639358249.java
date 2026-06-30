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

public class Usuario_canEqual_11639358249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term730;

    public Usuario_canEqual_11639358249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term692 = new Long(-2813493605142626659L);
        term691 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Usuario"));
        setField(term691, term691.getClass(), "id", term692);
        setField(term691, term691.getClass(), "nome", "OWDIEULEFu");
        setField(term691, term691.getClass(), "usuario", "dWRymuLBtr");
        setField(term691, term691.getClass(), "senha", "AijpHYOFuy");
        term730 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term730;
        callMethod(klass, "canEqual", argTypes, term691, args);
    }

};


