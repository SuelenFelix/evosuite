package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AvatarAcc_setName_206303034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15820;

    public AvatarAcc_setName_206303034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15820 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.AvatarAcc"));
        setLongField(term15820, term15820.getClass(), "id", -8862087040734407227L);
        setField(term15820, term15820.getClass(), "name", "eoEvZbdLjL");
        setIntField(term15820, term15820.getClass(), "category", 868908117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.AvatarAcc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BkIxsyPkGy";
        callMethod(klass, "setName", argTypes, term15820, args);
    }

};


