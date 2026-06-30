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

public class UserTechEvent_hashCode_80222223742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361664;

    public UserTechEvent_hashCode_80222223742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361664 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361664, term361664.getClass(), "id", 0L);
        setField(term361664, term361664.getClass(), "user", null);
        setIntField(term361664, term361664.getClass(), "eventId", 0);
        setIntField(term361664, term361664.getClass(), "totalTechScore", 0);
        setIntField(term361664, term361664.getClass(), "totalPlatinumScore", 0);
        setField(term361664, term361664.getClass(), "techRecordDate", null);
        setBooleanField(term361664, term361664.getClass(), "isRankingRewarded", false);
        setBooleanField(term361664, term361664.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term361664, args);
    }

};


