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

public class AuthorDto_setFirstName_2211296108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3331;

    public AuthorDto_setFirstName_2211296108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3332 = new Long(-6645965768855543712L);
        term3331 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term3331, term3331.getClass(), "id", term3332);
        setField(term3331, term3331.getClass(), "firstName", "JDaAnsVTGV");
        setField(term3331, term3331.getClass(), "lastName", "mLUZFTfjle");
        setField(term3331, term3331.getClass(), "email", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.AuthorDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setFirstName", argTypes, term3331, args);
    }

};


