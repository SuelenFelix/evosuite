package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AdminCreationResponse_getLastName_2925275013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21885;

    public AdminCreationResponse_getLastName_2925275013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21984 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term21983 = ((Class) term21984).getDeclaredField((String) "ADMIN");
        ((Field) term21983).setAccessible(true);
        Object enum79 = ((Field) term21983).get((Object) null);
        term21885 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term21885, term21885.getClass(), "id", "zjZYTddemL");
        setField(term21885, term21885.getClass(), "firstName", "QtrylgCLiF");
        setField(term21885, term21885.getClass(), "lastName", "orEuhCStGM");
        setField(term21885, term21885.getClass(), "email", "HhEaSXWvrY");
        setField(term21885, term21885.getClass(), "role", enum79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term21885, args);
    }

};


