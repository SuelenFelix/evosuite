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

public class AuthorDto_AuthorDtoBuilder_build_14741314565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4239;

    public AuthorDto_AuthorDtoBuilder_build_14741314565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4240 = new Long(-1468719814009985452L);
        term4239 = newInstance(Class.forName("example.dto.AuthorDto$AuthorDtoBuilder"));
        setField(term4239, term4239.getClass(), "id", term4240);
        setField(term4239, term4239.getClass(), "firstName", "PapWxkhEWe");
        setField(term4239, term4239.getClass(), "lastName", "smnHEqRFRx");
        setField(term4239, term4239.getClass(), "email", "XYtryyobou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto$AuthorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4239, args);
    }

};


