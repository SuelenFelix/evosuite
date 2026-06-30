package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GamePresent_setMessage_209072009712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19447;

    public GamePresent_setMessage_209072009712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19447 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent"));
        setLongField(term19447, term19447.getClass(), "presentId", -3936701866695933852L);
        setField(term19447, term19447.getClass(), "presentName", "HNVOAXYNEZ");
        setIntField(term19447, term19447.getClass(), "rewardId", -1945706126);
        setIntField(term19447, term19447.getClass(), "stock", 1152356969);
        setField(term19447, term19447.getClass(), "message", "gbbYBYyfvr");
        setField(term19447, term19447.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term19447, term19447.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePresent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SrWMUlbtWV";
        callMethod(klass, "setMessage", argTypes, term19447, args);
    }

};


