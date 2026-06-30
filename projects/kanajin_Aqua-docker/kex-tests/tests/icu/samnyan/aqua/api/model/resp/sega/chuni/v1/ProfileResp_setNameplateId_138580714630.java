package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setNameplateId_138580714630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;
     Object term2610;

    public ProfileResp_setNameplateId_138580714630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2547 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2604 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2547, term2547.getClass(), "userName", "hoicvmsovO");
        setIntField(term2547, term2547.getClass(), "level", -220791533);
        setField(term2547, term2547.getClass(), "exp", "eqJfYWRaEL");
        setLongField(term2547, term2547.getClass(), "point", -7698746988132548371L);
        setLongField(term2547, term2547.getClass(), "totalPoint", 2145420811068634601L);
        setIntField(term2547, term2547.getClass(), "playCount", 1741500243);
        setIntField(term2547, term2547.getClass(), "playerRating", -2070466617);
        setIntField(term2547, term2547.getClass(), "highestRating", -1127721881);
        setIntField(term2547, term2547.getClass(), "nameplateId", 1074848808);
        setIntField(term2547, term2547.getClass(), "frameId", -146054762);
        setIntField(term2547, term2547.getClass(), "characterId", 798043553);
        setIntField(term2547, term2547.getClass(), "trophyId", 533197381);
        setIntField(term2547, term2547.getClass(), "totalMapNum", 1048271679);
        setLongField(term2547, term2547.getClass(), "totalHiScore", 2191130532479601175L);
        setLongField(term2547, term2547.getClass(), "totalBasicHighScore", 860079646007397083L);
        setLongField(term2547, term2547.getClass(), "totalAdvancedHighScore", 3230472384687362867L);
        setLongField(term2547, term2547.getClass(), "totalExpertHighScore", -1145146470850585022L);
        setLongField(term2547, term2547.getClass(), "totalMasterHighScore", 1993646237353405740L);
        setIntField(term2547, term2547.getClass(), "friendCount", -1529797673);
        setIntField(term2590, term2590.getClass(), "year", 2016);
        setShortField(term2590, term2590.getClass(), "month", (short) 2);
        setShortField(term2590, term2590.getClass(), "day", (short) 25);
        setField(term2589, term2589.getClass(), "date", term2590);
        setByteField(term2594, term2594.getClass(), "hour", (byte) 8);
        setByteField(term2594, term2594.getClass(), "minute", (byte) 54);
        setByteField(term2594, term2594.getClass(), "second", (byte) 40);
        setIntField(term2594, term2594.getClass(), "nano", 124525896);
        setField(term2589, term2589.getClass(), "time", term2594);
        setField(term2547, term2547.getClass(), "firstPlayDate", term2589);
        setIntField(term2600, term2600.getClass(), "year", 2029);
        setShortField(term2600, term2600.getClass(), "month", (short) 1);
        setShortField(term2600, term2600.getClass(), "day", (short) 10);
        setField(term2599, term2599.getClass(), "date", term2600);
        setByteField(term2604, term2604.getClass(), "hour", (byte) 8);
        setByteField(term2604, term2604.getClass(), "minute", (byte) 46);
        setByteField(term2604, term2604.getClass(), "second", (byte) 35);
        setIntField(term2604, term2604.getClass(), "nano", 58807194);
        setField(term2599, term2599.getClass(), "time", term2604);
        setField(term2547, term2547.getClass(), "lastPlayDate", term2599);
        setIntField(term2547, term2547.getClass(), "courseClass", -868676396);
        term2610 = new Integer(1922684808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2610;
        callMethod(klass, "setNameplateId", argTypes, term2547, args);
    }

};


