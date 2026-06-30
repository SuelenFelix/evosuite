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
import java.util.LinkedList;

public class LoginCredentials_setRoles_1459712737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term932;

    public LoginCredentials_setRoles_1459712737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term820 = new ArrayList();
        ((ArrayList) term820).add("aKnKipADSo");
        ((ArrayList) term820).add("wSQxaModmm");
        ((ArrayList) term820).add("UlajhuVLaP");
        ((ArrayList) term820).add("gGSMzuGICf");
        ((ArrayList) term820).add("hxCBltsObl");
        ((ArrayList) term820).add("BndsHwAFMv");
        ((ArrayList) term820).add("GzFkzHGYFt");
        ((ArrayList) term820).add("tShwQLRGNe");
        ((ArrayList) term820).add("LvtrsXUliU");
        term795 = newInstance(Class.forName("online.devupgrade.sezon2.dto.LoginCredentials"));
        setField(term795, term795.getClass(), "login", "IDCWpPLRkE");
        setField(term795, term795.getClass(), "password", "nyiiPDVjAc");
        setField(term795, term795.getClass(), "roles", term820);
        term932 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.dto.LoginCredentials");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term932;
        callMethod(klass, "setRoles", argTypes, term795, args);
    }

};


