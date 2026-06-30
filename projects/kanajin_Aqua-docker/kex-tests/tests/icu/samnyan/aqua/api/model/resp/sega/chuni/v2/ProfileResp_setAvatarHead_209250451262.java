package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setAvatarHead_209250451262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121625;
     Object term121700;

    public ProfileResp_setAvatarHead_209250451262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121625 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121668 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121669 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121673 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121683 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121625, term121625.getClass(), "userName", "yShXFHBMjq");
        setIntField(term121625, term121625.getClass(), "level", 147639397);
        setField(term121625, term121625.getClass(), "exp", "PvSoEnEttM");
        setLongField(term121625, term121625.getClass(), "point", -1674803133573527773L);
        setLongField(term121625, term121625.getClass(), "totalPoint", -6412349450749439165L);
        setIntField(term121625, term121625.getClass(), "playCount", 1156150321);
        setIntField(term121625, term121625.getClass(), "playerRating", 1793521135);
        setIntField(term121625, term121625.getClass(), "highestRating", 414971920);
        setIntField(term121625, term121625.getClass(), "nameplateId", -1927655423);
        setIntField(term121625, term121625.getClass(), "frameId", -605697192);
        setIntField(term121625, term121625.getClass(), "characterId", 655439982);
        setIntField(term121625, term121625.getClass(), "trophyId", 243498213);
        setIntField(term121625, term121625.getClass(), "totalMapNum", -232125460);
        setLongField(term121625, term121625.getClass(), "totalHiScore", 3776816024579840928L);
        setLongField(term121625, term121625.getClass(), "totalBasicHighScore", -3393252029393706677L);
        setLongField(term121625, term121625.getClass(), "totalAdvancedHighScore", -1106562206887234717L);
        setLongField(term121625, term121625.getClass(), "totalExpertHighScore", -5249747777828118526L);
        setLongField(term121625, term121625.getClass(), "totalMasterHighScore", -821553075008672462L);
        setLongField(term121625, term121625.getClass(), "totalUltimaHighScore", -4766329145709812666L);
        setIntField(term121625, term121625.getClass(), "friendCount", 807545207);
        setIntField(term121669, term121669.getClass(), "year", 2014);
        setShortField(term121669, term121669.getClass(), "month", (short) 4);
        setShortField(term121669, term121669.getClass(), "day", (short) 9);
        setField(term121668, term121668.getClass(), "date", term121669);
        setByteField(term121673, term121673.getClass(), "hour", (byte) 15);
        setByteField(term121673, term121673.getClass(), "minute", (byte) 10);
        setByteField(term121673, term121673.getClass(), "second", (byte) 45);
        setIntField(term121673, term121673.getClass(), "nano", 720894353);
        setField(term121668, term121668.getClass(), "time", term121673);
        setField(term121625, term121625.getClass(), "firstPlayDate", term121668);
        setIntField(term121679, term121679.getClass(), "year", 2017);
        setShortField(term121679, term121679.getClass(), "month", (short) 4);
        setShortField(term121679, term121679.getClass(), "day", (short) 3);
        setField(term121678, term121678.getClass(), "date", term121679);
        setByteField(term121683, term121683.getClass(), "hour", (byte) 16);
        setByteField(term121683, term121683.getClass(), "minute", (byte) 59);
        setByteField(term121683, term121683.getClass(), "second", (byte) 40);
        setIntField(term121683, term121683.getClass(), "nano", 454625702);
        setField(term121678, term121678.getClass(), "time", term121683);
        setField(term121625, term121625.getClass(), "lastPlayDate", term121678);
        setIntField(term121625, term121625.getClass(), "courseClass", 1567302485);
        setIntField(term121625, term121625.getClass(), "overPowerPoint", -1993498644);
        setIntField(term121625, term121625.getClass(), "overPowerRate", -1975115936);
        setIntField(term121625, term121625.getClass(), "mapIconId", -161268059);
        setIntField(term121625, term121625.getClass(), "voiceId", -1840035932);
        setIntField(term121625, term121625.getClass(), "avatarWear", 1087439705);
        setIntField(term121625, term121625.getClass(), "avatarHead", 695042785);
        setIntField(term121625, term121625.getClass(), "avatarFace", -1381167447);
        setIntField(term121625, term121625.getClass(), "avatarSkin", -1974849051);
        setIntField(term121625, term121625.getClass(), "avatarItem", -1445298391);
        setIntField(term121625, term121625.getClass(), "avatarFront", -2103784563);
        setIntField(term121625, term121625.getClass(), "avatarBack", -749628481);
        term121700 = new Integer(-1625698396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121700;
        callMethod(klass, "setAvatarHead", argTypes, term121625, args);
    }

};


