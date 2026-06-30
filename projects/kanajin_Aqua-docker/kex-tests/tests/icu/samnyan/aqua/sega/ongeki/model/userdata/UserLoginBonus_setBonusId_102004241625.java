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
import java.lang.Integer;

public class UserLoginBonus_setBonusId_102004241625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308452;
     Object term308456;

    public UserLoginBonus_setBonusId_102004241625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        setLongField(term308452, term308452.getClass(), "id", 0L);
        setField(term308452, term308452.getClass(), "user", null);
        setIntField(term308452, term308452.getClass(), "bonusId", 0);
        setIntField(term308452, term308452.getClass(), "bonusCount", 0);
        setField(term308452, term308452.getClass(), "lastUpdateDate", null);
        term308456 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term308456;
        callMethod(klass, "setBonusId", argTypes, term308452, args);
    }

};


