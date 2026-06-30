package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserUdemae_getId_144105969744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119596;

    public UserUdemae_getId_144105969744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119596 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119596, term119596.getClass(), "id", 0L);
        setField(term119596, term119596.getClass(), "user", null);
        setIntField(term119596, term119596.getClass(), "rate", 0);
        setIntField(term119596, term119596.getClass(), "maxRate", 0);
        setIntField(term119596, term119596.getClass(), "classValue", 0);
        setIntField(term119596, term119596.getClass(), "maxClassValue", 0);
        setIntField(term119596, term119596.getClass(), "totalWinNum", 0);
        setIntField(term119596, term119596.getClass(), "totalLoseNum", 0);
        setIntField(term119596, term119596.getClass(), "maxWinNum", 0);
        setIntField(term119596, term119596.getClass(), "maxLoseNum", 0);
        setIntField(term119596, term119596.getClass(), "winNum", 0);
        setIntField(term119596, term119596.getClass(), "loseNum", 0);
        setIntField(term119596, term119596.getClass(), "npcTotalWinNum", 0);
        setIntField(term119596, term119596.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119596, term119596.getClass(), "npcMaxWinNum", 0);
        setIntField(term119596, term119596.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119596, term119596.getClass(), "npcWinNum", 0);
        setIntField(term119596, term119596.getClass(), "npcLoseNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term119596, args);
    }

};


