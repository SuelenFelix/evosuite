package example.dto;

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
import static example.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class AuthorDto_AuthorDtoBuilder_lastName_10613465253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4057;

    public AuthorDto_AuthorDtoBuilder_lastName_10613465253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4058 = new Long(-2850532706972744550L);
        term4057 = newInstance(Class.forName("example.dto.AuthorDto$AuthorDtoBuilder"));
        setField(term4057, term4057.getClass(), "id", term4058);
        setField(term4057, term4057.getClass(), "firstName", "PtirvZmsGt");
        setField(term4057, term4057.getClass(), "lastName", "HWkpTmtlrc");
        setField(term4057, term4057.getClass(), "email", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto$AuthorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        callMethod(klass, "lastName", argTypes, term4057, args);
    }

};


