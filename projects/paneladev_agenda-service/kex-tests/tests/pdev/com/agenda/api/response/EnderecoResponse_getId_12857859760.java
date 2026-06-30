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

public class EnderecoResponse_getId_12857859760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2984;

    public EnderecoResponse_getId_12857859760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2985 = new Long(-7115418542247301000L);
        Long term2999 = new Long(8034714140377562739L);
        term2984 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term2984, term2984.getClass(), "id", term2985);
        setField(term2984, term2984.getClass(), "rua", "vvoLrMGCoN");
        setField(term2984, term2984.getClass(), "numero", term2999);
        setField(term2984, term2984.getClass(), "complemento", "pXdglvyrQe");
        setField(term2984, term2984.getClass(), "bairro", "OcfNzHYdki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2984, args);
    }

};


