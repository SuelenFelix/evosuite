package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserKop_setAuthKey_164448617637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282632;

    public UserKop_setAuthKey_164448617637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282632 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282632, term282632.getClass(), "id", 0L);
        setField(term282632, term282632.getClass(), "user", null);
        setField(term282632, term282632.getClass(), "authKey", null);
        setIntField(term282632, term282632.getClass(), "kopId", 0);
        setIntField(term282632, term282632.getClass(), "areaId", 0);
        setIntField(term282632, term282632.getClass(), "totalTechScore", 0);
        setIntField(term282632, term282632.getClass(), "totalPlatinumScore", 0);
        setField(term282632, term282632.getClass(), "techRecordDate", null);
        setBooleanField(term282632, term282632.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAuthKey", argTypes, term282632, args);
    }

};


