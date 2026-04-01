package online.devupgrade.sezon2.dto;

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
import static online.devupgrade.sezon2.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class LoginCredentials_getLogin_11812523562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110;

    public LoginCredentials_getLogin_11812523562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term135 = new ArrayList();
        ((ArrayList) term135).add("RMFIsYGgne");
        ((ArrayList) term135).add("NRdvgJlhkX");
        ((ArrayList) term135).add("uuaPigETmJ");
        ((ArrayList) term135).add("MxlszYVzRf");
        ((ArrayList) term135).add("LQFpaHEwXR");
        ((ArrayList) term135).add("oVcInYnLWB");
        ((ArrayList) term135).add("aJlieCFVtF");
        ((ArrayList) term135).add("ZiaGIbnzTs");
        ((ArrayList) term135).add("tbcdzjIfER");
        term110 = newInstance(Class.forName("online.devupgrade.sezon2.dto.LoginCredentials"));
        setField(term110, term110.getClass(), "login", "MjGYSRKTNF");
        setField(term110, term110.getClass(), "password", "hRNSzYYIrc");
        setField(term110, term110.getClass(), "roles", term135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.LoginCredentials");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term110, args);
    }

};


