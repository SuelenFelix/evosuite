package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_getUser_12596605192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33132;

    public UserCharacter_getUser_12596605192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33138 = new Long(-3936701866695933852L);
        term33132 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term33134 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term33136 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33157 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33167 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33132, term33132.getClass(), "id", -1145146470850585022L);
        setLongField(term33134, term33134.getClass(), "id", 1993646237353405740L);
        setLongField(term33136, term33136.getClass(), "id", -4043093655001688454L);
        setField(term33136, term33136.getClass(), "extId", term33138);
        setField(term33136, term33136.getClass(), "luid", "OTSPWPJefj");
        setIntField(term33153, term33153.getClass(), "year", 2010);
        setShortField(term33153, term33153.getClass(), "month", (short) 9);
        setShortField(term33153, term33153.getClass(), "day", (short) 20);
        setField(term33152, term33152.getClass(), "date", term33153);
        setByteField(term33157, term33157.getClass(), "hour", (byte) 3);
        setByteField(term33157, term33157.getClass(), "minute", (byte) 41);
        setByteField(term33157, term33157.getClass(), "second", (byte) 7);
        setIntField(term33157, term33157.getClass(), "nano", 796515800);
        setField(term33152, term33152.getClass(), "time", term33157);
        setField(term33136, term33136.getClass(), "registerTime", term33152);
        setIntField(term33163, term33163.getClass(), "year", 2015);
        setShortField(term33163, term33163.getClass(), "month", (short) 10);
        setShortField(term33163, term33163.getClass(), "day", (short) 2);
        setField(term33162, term33162.getClass(), "date", term33163);
        setByteField(term33167, term33167.getClass(), "hour", (byte) 21);
        setByteField(term33167, term33167.getClass(), "minute", (byte) 18);
        setByteField(term33167, term33167.getClass(), "second", (byte) 42);
        setIntField(term33167, term33167.getClass(), "nano", 185569616);
        setField(term33162, term33162.getClass(), "time", term33167);
        setField(term33136, term33136.getClass(), "accessTime", term33162);
        setField(term33134, term33134.getClass(), "card", term33136);
        setIntField(term33134, term33134.getClass(), "lastDataVersion", -860314891);
        setField(term33134, term33134.getClass(), "userName", "EOTYMqXRmE");
        setIntField(term33134, term33134.getClass(), "point", -444697262);
        setIntField(term33134, term33134.getClass(), "totalPoint", -460183304);
        setIntField(term33134, term33134.getClass(), "iconId", -2123879019);
        setIntField(term33134, term33134.getClass(), "nameplateId", -745063212);
        setIntField(term33134, term33134.getClass(), "frameId", 298277204);
        setIntField(term33134, term33134.getClass(), "trophyId", 1536563217);
        setIntField(term33134, term33134.getClass(), "playCount", -449582867);
        setIntField(term33134, term33134.getClass(), "playVsCount", -650176523);
        setIntField(term33134, term33134.getClass(), "playSyncCount", 2071056240);
        setIntField(term33134, term33134.getClass(), "winCount", 1894657425);
        setIntField(term33134, term33134.getClass(), "helpCount", -263942209);
        setIntField(term33134, term33134.getClass(), "comboCount", 820400430);
        setIntField(term33134, term33134.getClass(), "feverCount", -1841078275);
        setIntField(term33134, term33134.getClass(), "totalHiScore", -875421053);
        setIntField(term33134, term33134.getClass(), "totalEasyHighScore", 212464780);
        setIntField(term33134, term33134.getClass(), "totalBasicHighScore", -1698447008);
        setIntField(term33134, term33134.getClass(), "totalAdvancedHighScore", 1429592368);
        setIntField(term33134, term33134.getClass(), "totalExpertHighScore", -1997064536);
        setIntField(term33134, term33134.getClass(), "totalMasterHighScore", 798438929);
        setIntField(term33134, term33134.getClass(), "totalReMasterHighScore", 795184090);
        setIntField(term33134, term33134.getClass(), "totalHighSync", 1181730734);
        setIntField(term33134, term33134.getClass(), "totalEasySync", -668958857);
        setIntField(term33134, term33134.getClass(), "totalBasicSync", -427688960);
        setIntField(term33134, term33134.getClass(), "totalAdvancedSync", 343387902);
        setIntField(term33134, term33134.getClass(), "totalExpertSync", 1492345954);
        setIntField(term33134, term33134.getClass(), "totalMasterSync", 1891017572);
        setIntField(term33134, term33134.getClass(), "totalReMasterSync", -391361805);
        setIntField(term33134, term33134.getClass(), "playerRating", 1171290917);
        setIntField(term33134, term33134.getClass(), "highestRating", 267258768);
        setIntField(term33134, term33134.getClass(), "rankAuthTailId", 1779008869);
        setField(term33134, term33134.getClass(), "eventWatchedDate", "iTxNduwSjE");
        setField(term33134, term33134.getClass(), "webLimitDate", "MQUTfIiFnh");
        setIntField(term33134, term33134.getClass(), "challengeTrackPhase", -1058856035);
        setIntField(term33134, term33134.getClass(), "firstPlayBits", -91024448);
        setField(term33134, term33134.getClass(), "lastPlayDate", "JeyKRznnft");
        setIntField(term33134, term33134.getClass(), "lastPlaceId", -744517334);
        setField(term33134, term33134.getClass(), "lastPlaceName", "vQJUCtuYpK");
        setIntField(term33134, term33134.getClass(), "lastRegionId", -855464783);
        setField(term33134, term33134.getClass(), "lastRegionName", "GHtOeztAdz");
        setField(term33134, term33134.getClass(), "lastClientId", "gSAtqakaLY");
        setField(term33134, term33134.getClass(), "lastCountryCode", "taPBiMFNEZ");
        setIntField(term33134, term33134.getClass(), "eventPoint", 1496015170);
        setIntField(term33134, term33134.getClass(), "totalLv", 412507839);
        setIntField(term33134, term33134.getClass(), "lastLoginBonusDay", -143522206);
        setIntField(term33134, term33134.getClass(), "lastSurvivalBonusDay", 70726858);
        setIntField(term33134, term33134.getClass(), "loginBonusLv", -1883665560);
        setField(term33132, term33132.getClass(), "user", term33134);
        setIntField(term33132, term33132.getClass(), "characterId", -1304361419);
        setIntField(term33132, term33132.getClass(), "point", -1253063552);
        setIntField(term33132, term33132.getClass(), "level", 11874750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term33132, args);
    }

};


