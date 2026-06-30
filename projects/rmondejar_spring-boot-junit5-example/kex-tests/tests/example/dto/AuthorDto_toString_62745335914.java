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

public class AuthorDto_toString_62745335914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3813;

    public AuthorDto_toString_62745335914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3814 = new Long(-3842548265506930260L);
        term3813 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3813, term3813.getClass(), "id", term3814);
        setField(term3813, term3813.getClass(), "firstName", "FPvxVzzSvD");
        setField(term3813, term3813.getClass(), "lastName", "WHcwFgsGFC");
        setField(term3813, term3813.getClass(), "email", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3813, args);
    }

};


