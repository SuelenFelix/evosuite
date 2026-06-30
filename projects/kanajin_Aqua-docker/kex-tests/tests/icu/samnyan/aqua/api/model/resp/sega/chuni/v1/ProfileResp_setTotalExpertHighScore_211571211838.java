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
import java.lang.Long;

public class ProfileResp_setTotalExpertHighScore_211571211838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3227;
     Object term3290;

    public ProfileResp_setTotalExpertHighScore_211571211838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3227 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3284 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3227, term3227.getClass(), "userName", "OWKQODBLzb");
        setIntField(term3227, term3227.getClass(), "level", 1501165033);
        setField(term3227, term3227.getClass(), "exp", "wGmYcqUkgE");
        setLongField(term3227, term3227.getClass(), "point", -6685235643232255177L);
        setLongField(term3227, term3227.getClass(), "totalPoint", -5656664340499957324L);
        setIntField(term3227, term3227.getClass(), "playCount", 510162332);
        setIntField(term3227, term3227.getClass(), "playerRating", 888506903);
        setIntField(term3227, term3227.getClass(), "highestRating", 200252898);
        setIntField(term3227, term3227.getClass(), "nameplateId", -1831826725);
        setIntField(term3227, term3227.getClass(), "frameId", 752152965);
        setIntField(term3227, term3227.getClass(), "characterId", -1577069773);
        setIntField(term3227, term3227.getClass(), "trophyId", -266625190);
        setIntField(term3227, term3227.getClass(), "totalMapNum", 489201218);
        setLongField(term3227, term3227.getClass(), "totalHiScore", -5460517064177800852L);
        setLongField(term3227, term3227.getClass(), "totalBasicHighScore", -5242567610844514867L);
        setLongField(term3227, term3227.getClass(), "totalAdvancedHighScore", -2951854704066477061L);
        setLongField(term3227, term3227.getClass(), "totalExpertHighScore", 174253963298276221L);
        setLongField(term3227, term3227.getClass(), "totalMasterHighScore", 3713624957161771816L);
        setIntField(term3227, term3227.getClass(), "friendCount", 464181937);
        setIntField(term3270, term3270.getClass(), "year", 2011);
        setShortField(term3270, term3270.getClass(), "month", (short) 8);
        setShortField(term3270, term3270.getClass(), "day", (short) 1);
        setField(term3269, term3269.getClass(), "date", term3270);
        setByteField(term3274, term3274.getClass(), "hour", (byte) 7);
        setByteField(term3274, term3274.getClass(), "minute", (byte) 2);
        setByteField(term3274, term3274.getClass(), "second", (byte) 46);
        setIntField(term3274, term3274.getClass(), "nano", 187178462);
        setField(term3269, term3269.getClass(), "time", term3274);
        setField(term3227, term3227.getClass(), "firstPlayDate", term3269);
        setIntField(term3280, term3280.getClass(), "year", 2020);
        setShortField(term3280, term3280.getClass(), "month", (short) 9);
        setShortField(term3280, term3280.getClass(), "day", (short) 3);
        setField(term3279, term3279.getClass(), "date", term3280);
        setByteField(term3284, term3284.getClass(), "hour", (byte) 10);
        setByteField(term3284, term3284.getClass(), "minute", (byte) 44);
        setByteField(term3284, term3284.getClass(), "second", (byte) 5);
        setIntField(term3284, term3284.getClass(), "nano", 572560230);
        setField(term3279, term3279.getClass(), "time", term3284);
        setField(term3227, term3227.getClass(), "lastPlayDate", term3279);
        setIntField(term3227, term3227.getClass(), "courseClass", -1455526612);
        term3290 = new Long(6130232388739280211L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3290;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term3227, args);
    }

};


