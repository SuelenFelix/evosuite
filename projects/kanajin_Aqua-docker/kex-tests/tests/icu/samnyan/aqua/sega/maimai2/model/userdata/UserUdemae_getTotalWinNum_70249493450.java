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

public class UserUdemae_getTotalWinNum_70249493450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119704;

    public UserUdemae_getTotalWinNum_70249493450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119704 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119704, term119704.getClass(), "id", 0L);
        setField(term119704, term119704.getClass(), "user", null);
        setIntField(term119704, term119704.getClass(), "rate", 0);
        setIntField(term119704, term119704.getClass(), "maxRate", 0);
        setIntField(term119704, term119704.getClass(), "classValue", 0);
        setIntField(term119704, term119704.getClass(), "maxClassValue", 0);
        setIntField(term119704, term119704.getClass(), "totalWinNum", 0);
        setIntField(term119704, term119704.getClass(), "totalLoseNum", 0);
        setIntField(term119704, term119704.getClass(), "maxWinNum", 0);
        setIntField(term119704, term119704.getClass(), "maxLoseNum", 0);
        setIntField(term119704, term119704.getClass(), "winNum", 0);
        setIntField(term119704, term119704.getClass(), "loseNum", 0);
        setIntField(term119704, term119704.getClass(), "npcTotalWinNum", 0);
        setIntField(term119704, term119704.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119704, term119704.getClass(), "npcMaxWinNum", 0);
        setIntField(term119704, term119704.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119704, term119704.getClass(), "npcWinNum", 0);
        setIntField(term119704, term119704.getClass(), "npcLoseNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalWinNum", argTypes, term119704, args);
    }

};


