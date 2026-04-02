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

public class AuthorDto_AuthorDtoBuilder_id_14423283641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3895;
     Object term3934;

    public AuthorDto_AuthorDtoBuilder_id_14423283641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3896 = new Long(-5788180182343976541L);
        term3895 = newInstance(Class.forName("example.dto.AuthorDto$AuthorDtoBuilder"));
        setField(term3895, term3895.getClass(), "id", term3896);
        setField(term3895, term3895.getClass(), "firstName", "jwsfVjMoJT");
        setField(term3895, term3895.getClass(), "lastName", "ZfdXfCCFDf");
        setField(term3895, term3895.getClass(), "email", "MwwjNtdOFT");
        term3934 = new Long(2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto$AuthorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3934;
        callMethod(klass, "id", argTypes, term3895, args);
    }

};


