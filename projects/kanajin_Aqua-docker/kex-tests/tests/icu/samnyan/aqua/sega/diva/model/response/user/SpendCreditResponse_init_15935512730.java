package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpendCreditResponse_init_15935512730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term51;
     Object term65;
     Object term67;

    public SpendCreditResponse_init_15935512730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new Integer(568599855);
        term51 = new Integer(1162663216);
        term65 = new Integer(1484323161);
        term67 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.SpendCreditResponse");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = "xxtlPwDYFs";
        args[4] = term49;
        args[5] = term51;
        args[6] = "jJCZpVmanW";
        args[7] = term65;
        args[8] = term67;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


