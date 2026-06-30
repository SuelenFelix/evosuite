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

public class UserKop_getId_25772478926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282553;

    public UserKop_getId_25772478926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282553 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        setLongField(term282553, term282553.getClass(), "id", 0L);
        setField(term282553, term282553.getClass(), "user", null);
        setField(term282553, term282553.getClass(), "authKey", null);
        setIntField(term282553, term282553.getClass(), "kopId", 0);
        setIntField(term282553, term282553.getClass(), "areaId", 0);
        setIntField(term282553, term282553.getClass(), "totalTechScore", 0);
        setIntField(term282553, term282553.getClass(), "totalPlatinumScore", 0);
        setField(term282553, term282553.getClass(), "techRecordDate", null);
        setBooleanField(term282553, term282553.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term282553, args);
    }

};


