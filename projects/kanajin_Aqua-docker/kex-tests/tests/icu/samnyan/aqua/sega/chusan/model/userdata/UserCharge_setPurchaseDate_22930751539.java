package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCharge_setPurchaseDate_22930751539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68878;

    public UserCharge_setPurchaseDate_22930751539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68878 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge"));
        setLongField(term68878, term68878.getClass(), "id", 0L);
        setField(term68878, term68878.getClass(), "user", null);
        setIntField(term68878, term68878.getClass(), "chargeId", 0);
        setIntField(term68878, term68878.getClass(), "stock", 0);
        setField(term68878, term68878.getClass(), "purchaseDate", null);
        setField(term68878, term68878.getClass(), "validDate", null);
        setIntField(term68878, term68878.getClass(), "param1", 0);
        setIntField(term68878, term68878.getClass(), "param2", 0);
        setField(term68878, term68878.getClass(), "paramDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPurchaseDate", argTypes, term68878, args);
    }

};


