package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ExternalUserData_setMasterTutorialCancelNum_117179116473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29410;
     Object term29661;

    public ExternalUserData_setMasterTutorialCancelNum_117179116473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29410 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term29435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29501 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29595 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29410, term29410.getClass(), "accessCode", "HvbkjsQyDy");
        setField(term29410, term29410.getClass(), "userName", "wzSukELQFL");
        setIntField(term29436, term29436.getClass(), "year", 2015);
        setShortField(term29436, term29436.getClass(), "month", (short) 8);
        setShortField(term29436, term29436.getClass(), "day", (short) 6);
        setField(term29435, term29435.getClass(), "date", term29436);
        setByteField(term29440, term29440.getClass(), "hour", (byte) 16);
        setByteField(term29440, term29440.getClass(), "minute", (byte) 16);
        setByteField(term29440, term29440.getClass(), "second", (byte) 21);
        setIntField(term29440, term29440.getClass(), "nano", 274900303);
        setField(term29435, term29435.getClass(), "time", term29440);
        setField(term29410, term29410.getClass(), "lastLoginDate", term29435);
        setBooleanField(term29410, term29410.getClass(), "isWebJoin", false);
        setField(term29410, term29410.getClass(), "webLimitDate", "VZyeaOWYEj");
        setIntField(term29410, term29410.getClass(), "level", 340500914);
        setIntField(term29410, term29410.getClass(), "reincarnationNum", -2061712635);
        setField(term29410, term29410.getClass(), "exp", "PErxMBQSUv");
        setLongField(term29410, term29410.getClass(), "point", 5047215164896153648L);
        setLongField(term29410, term29410.getClass(), "totalPoint", 6695041041196724237L);
        setIntField(term29410, term29410.getClass(), "playCount", 1182911731);
        setIntField(term29410, term29410.getClass(), "multiPlayCount", 644726932);
        setIntField(term29410, term29410.getClass(), "multiWinCount", -1515977761);
        setIntField(term29410, term29410.getClass(), "requestResCount", -1476037190);
        setIntField(term29410, term29410.getClass(), "acceptResCount", -718204437);
        setIntField(term29410, term29410.getClass(), "successResCount", 468974358);
        setIntField(term29410, term29410.getClass(), "playerRating", 346282818);
        setIntField(term29410, term29410.getClass(), "highestRating", -857876056);
        setIntField(term29410, term29410.getClass(), "nameplateId", 1392910876);
        setIntField(term29410, term29410.getClass(), "frameId", 1086383182);
        setIntField(term29410, term29410.getClass(), "characterId", 1425319286);
        setIntField(term29410, term29410.getClass(), "trophyId", 1729919228);
        setIntField(term29410, term29410.getClass(), "playedTutorialBit", 872351195);
        setIntField(term29410, term29410.getClass(), "firstTutorialCancelNum", -1664328399);
        setIntField(term29410, term29410.getClass(), "masterTutorialCancelNum", 1422430512);
        setIntField(term29410, term29410.getClass(), "totalRepertoireCount", 1796581482);
        setIntField(term29410, term29410.getClass(), "totalMapNum", 1286440081);
        setLongField(term29410, term29410.getClass(), "totalHiScore", -9133417318192430290L);
        setLongField(term29410, term29410.getClass(), "totalBasicHighScore", 3447455321955655601L);
        setLongField(term29410, term29410.getClass(), "totalAdvancedHighScore", -6503611645609982617L);
        setLongField(term29410, term29410.getClass(), "totalExpertHighScore", -7574091101944828886L);
        setLongField(term29410, term29410.getClass(), "totalMasterHighScore", -6792339614909987294L);
        setIntField(term29497, term29497.getClass(), "year", 2022);
        setShortField(term29497, term29497.getClass(), "month", (short) 5);
        setShortField(term29497, term29497.getClass(), "day", (short) 28);
        setField(term29496, term29496.getClass(), "date", term29497);
        setByteField(term29501, term29501.getClass(), "hour", (byte) 20);
        setByteField(term29501, term29501.getClass(), "minute", (byte) 42);
        setByteField(term29501, term29501.getClass(), "second", (byte) 20);
        setIntField(term29501, term29501.getClass(), "nano", 528388661);
        setField(term29496, term29496.getClass(), "time", term29501);
        setField(term29410, term29410.getClass(), "eventWatchedDate", term29496);
        setIntField(term29410, term29410.getClass(), "friendCount", -928538452);
        setBooleanField(term29410, term29410.getClass(), "isMaimai", false);
        setField(term29410, term29410.getClass(), "firstGameId", "KZQwbvujui");
        setField(term29410, term29410.getClass(), "firstRomVersion", "JPUZuGxKlI");
        setField(term29410, term29410.getClass(), "firstDataVersion", "xqIbVsUspl");
        setIntField(term29545, term29545.getClass(), "year", 2029);
        setShortField(term29545, term29545.getClass(), "month", (short) 5);
        setShortField(term29545, term29545.getClass(), "day", (short) 12);
        setField(term29544, term29544.getClass(), "date", term29545);
        setByteField(term29549, term29549.getClass(), "hour", (byte) 23);
        setByteField(term29549, term29549.getClass(), "minute", (byte) 20);
        setByteField(term29549, term29549.getClass(), "second", (byte) 4);
        setIntField(term29549, term29549.getClass(), "nano", 378307890);
        setField(term29544, term29544.getClass(), "time", term29549);
        setField(term29410, term29410.getClass(), "firstPlayDate", term29544);
        setField(term29410, term29410.getClass(), "lastGameId", "GnjLRtJywq");
        setField(term29410, term29410.getClass(), "lastRomVersion", "TDaodpHTRK");
        setField(term29410, term29410.getClass(), "lastDataVersion", "JayazbYDLK");
        setIntField(term29591, term29591.getClass(), "year", 2020);
        setShortField(term29591, term29591.getClass(), "month", (short) 4);
        setShortField(term29591, term29591.getClass(), "day", (short) 16);
        setField(term29590, term29590.getClass(), "date", term29591);
        setByteField(term29595, term29595.getClass(), "hour", (byte) 7);
        setByteField(term29595, term29595.getClass(), "minute", (byte) 46);
        setByteField(term29595, term29595.getClass(), "second", (byte) 47);
        setIntField(term29595, term29595.getClass(), "nano", 687690824);
        setField(term29590, term29590.getClass(), "time", term29595);
        setField(term29410, term29410.getClass(), "lastPlayDate", term29590);
        setIntField(term29410, term29410.getClass(), "lastPlaceId", -1313207353);
        setField(term29410, term29410.getClass(), "lastPlaceName", "ORDuSTrpNA");
        setField(term29410, term29410.getClass(), "lastRegionId", "hysThIPoEJ");
        setField(term29410, term29410.getClass(), "lastRegionName", "dfZepHfGwh");
        setField(term29410, term29410.getClass(), "lastAllNetId", "zjfMxUERFZ");
        setField(term29410, term29410.getClass(), "lastClientId", "ooVlhmiOff");
        term29661 = new Integer(402612318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29661;
        callMethod(klass, "setMasterTutorialCancelNum", argTypes, term29410, args);
    }

};


