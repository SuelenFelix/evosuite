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

public class ProfileResp_setFriendCount_180511067740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3397;
     Object term3460;

    public ProfileResp_setFriendCount_180511067740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3397 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3454 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3397, term3397.getClass(), "userName", "jUbSRrkrYZ");
        setIntField(term3397, term3397.getClass(), "level", 1168633950);
        setField(term3397, term3397.getClass(), "exp", "bWWfajKbEX");
        setLongField(term3397, term3397.getClass(), "point", 7017605765544766728L);
        setLongField(term3397, term3397.getClass(), "totalPoint", -6078481855513028760L);
        setIntField(term3397, term3397.getClass(), "playCount", 1607082164);
        setIntField(term3397, term3397.getClass(), "playerRating", 1890399366);
        setIntField(term3397, term3397.getClass(), "highestRating", -1867239125);
        setIntField(term3397, term3397.getClass(), "nameplateId", 952869601);
        setIntField(term3397, term3397.getClass(), "frameId", 91958879);
        setIntField(term3397, term3397.getClass(), "characterId", -645429025);
        setIntField(term3397, term3397.getClass(), "trophyId", -688213483);
        setIntField(term3397, term3397.getClass(), "totalMapNum", 644154104);
        setLongField(term3397, term3397.getClass(), "totalHiScore", -6985556670871089725L);
        setLongField(term3397, term3397.getClass(), "totalBasicHighScore", -8469818909085103606L);
        setLongField(term3397, term3397.getClass(), "totalAdvancedHighScore", 11315815278355083L);
        setLongField(term3397, term3397.getClass(), "totalExpertHighScore", 7735460540091431012L);
        setLongField(term3397, term3397.getClass(), "totalMasterHighScore", 1346299551708610248L);
        setIntField(term3397, term3397.getClass(), "friendCount", 76650923);
        setIntField(term3440, term3440.getClass(), "year", 2011);
        setShortField(term3440, term3440.getClass(), "month", (short) 4);
        setShortField(term3440, term3440.getClass(), "day", (short) 19);
        setField(term3439, term3439.getClass(), "date", term3440);
        setByteField(term3444, term3444.getClass(), "hour", (byte) 12);
        setByteField(term3444, term3444.getClass(), "minute", (byte) 0);
        setByteField(term3444, term3444.getClass(), "second", (byte) 14);
        setIntField(term3444, term3444.getClass(), "nano", 849079063);
        setField(term3439, term3439.getClass(), "time", term3444);
        setField(term3397, term3397.getClass(), "firstPlayDate", term3439);
        setIntField(term3450, term3450.getClass(), "year", 2014);
        setShortField(term3450, term3450.getClass(), "month", (short) 8);
        setShortField(term3450, term3450.getClass(), "day", (short) 17);
        setField(term3449, term3449.getClass(), "date", term3450);
        setByteField(term3454, term3454.getClass(), "hour", (byte) 19);
        setByteField(term3454, term3454.getClass(), "minute", (byte) 32);
        setByteField(term3454, term3454.getClass(), "second", (byte) 5);
        setIntField(term3454, term3454.getClass(), "nano", 604713831);
        setField(term3449, term3449.getClass(), "time", term3454);
        setField(term3397, term3397.getClass(), "lastPlayDate", term3449);
        setIntField(term3397, term3397.getClass(), "courseClass", 1003743923);
        term3460 = new Integer(1887772522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3460;
        callMethod(klass, "setFriendCount", argTypes, term3397, args);
    }

};


