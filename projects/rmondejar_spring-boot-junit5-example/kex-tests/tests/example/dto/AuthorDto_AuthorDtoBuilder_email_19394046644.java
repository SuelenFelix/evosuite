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

public class AuthorDto_AuthorDtoBuilder_email_19394046644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4148;

    public AuthorDto_AuthorDtoBuilder_email_19394046644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4149 = new Long(-2644215923136513282L);
        term4148 = newInstance(Class.forName("example.dto.AuthorDto$AuthorDtoBuilder"));
        setField(term4148, term4148.getClass(), "id", term4149);
        setField(term4148, term4148.getClass(), "firstName", "aWYOWZFyaX");
        setField(term4148, term4148.getClass(), "lastName", "BRIVNtfUWU");
        setField(term4148, term4148.getClass(), "email", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto$AuthorDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        callMethod(klass, "email", argTypes, term4148, args);
    }

};


