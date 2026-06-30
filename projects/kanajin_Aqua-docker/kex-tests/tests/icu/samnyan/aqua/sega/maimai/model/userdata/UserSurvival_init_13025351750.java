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

public class UserSurvival_init_13025351750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101889;

    public UserSurvival_init_13025351750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101893 = new Long(-7632759764262745126L);
        term101889 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term101891 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101922 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101889, term101889.getClass(), "id", 8327650518139070689L);
        setLongField(term101891, term101891.getClass(), "id", 928851110761968932L);
        setField(term101891, term101891.getClass(), "extId", term101893);
        setField(term101891, term101891.getClass(), "luid", "NUkHqaKZhA");
        setIntField(term101908, term101908.getClass(), "year", 2023);
        setShortField(term101908, term101908.getClass(), "month", (short) 11);
        setShortField(term101908, term101908.getClass(), "day", (short) 25);
        setField(term101907, term101907.getClass(), "date", term101908);
        setByteField(term101912, term101912.getClass(), "hour", (byte) 1);
        setByteField(term101912, term101912.getClass(), "minute", (byte) 27);
        setByteField(term101912, term101912.getClass(), "second", (byte) 54);
        setIntField(term101912, term101912.getClass(), "nano", 382362839);
        setField(term101907, term101907.getClass(), "time", term101912);
        setField(term101891, term101891.getClass(), "registerTime", term101907);
        setIntField(term101918, term101918.getClass(), "year", 2019);
        setShortField(term101918, term101918.getClass(), "month", (short) 7);
        setShortField(term101918, term101918.getClass(), "day", (short) 3);
        setField(term101917, term101917.getClass(), "date", term101918);
        setByteField(term101922, term101922.getClass(), "hour", (byte) 1);
        setByteField(term101922, term101922.getClass(), "minute", (byte) 7);
        setByteField(term101922, term101922.getClass(), "second", (byte) 43);
        setIntField(term101922, term101922.getClass(), "nano", 632872277);
        setField(term101917, term101917.getClass(), "time", term101922);
        setField(term101891, term101891.getClass(), "accessTime", term101917);
        setField(term101889, term101889.getClass(), "card", term101891);
        setIntField(term101889, term101889.getClass(), "lastDataVersion", -1606779427);
        setField(term101889, term101889.getClass(), "userName", "kHSkpGasYO");
        setIntField(term101889, term101889.getClass(), "point", -1122707604);
        setIntField(term101889, term101889.getClass(), "totalPoint", -172568076);
        setIntField(term101889, term101889.getClass(), "iconId", -794505441);
        setIntField(term101889, term101889.getClass(), "nameplateId", 791807465);
        setIntField(term101889, term101889.getClass(), "frameId", -359105);
        setIntField(term101889, term101889.getClass(), "trophyId", 868346311);
        setIntField(term101889, term101889.getClass(), "playCount", 897972978);
        setIntField(term101889, term101889.getClass(), "playVsCount", -2099349449);
        setIntField(term101889, term101889.getClass(), "playSyncCount", 1719182097);
        setIntField(term101889, term101889.getClass(), "winCount", -689383574);
        setIntField(term101889, term101889.getClass(), "helpCount", -203297975);
        setIntField(term101889, term101889.getClass(), "comboCount", -306200799);
        setIntField(term101889, term101889.getClass(), "feverCount", -1669655541);
        setIntField(term101889, term101889.getClass(), "totalHiScore", 1688587497);
        setIntField(term101889, term101889.getClass(), "totalEasyHighScore", -607264868);
        setIntField(term101889, term101889.getClass(), "totalBasicHighScore", -1460647226);
        setIntField(term101889, term101889.getClass(), "totalAdvancedHighScore", 862264056);
        setIntField(term101889, term101889.getClass(), "totalExpertHighScore", 1933933027);
        setIntField(term101889, term101889.getClass(), "totalMasterHighScore", 1995024241);
        setIntField(term101889, term101889.getClass(), "totalReMasterHighScore", 364896764);
        setIntField(term101889, term101889.getClass(), "totalHighSync", -509113815);
        setIntField(term101889, term101889.getClass(), "totalEasySync", -1978644575);
        setIntField(term101889, term101889.getClass(), "totalBasicSync", 1079520989);
        setIntField(term101889, term101889.getClass(), "totalAdvancedSync", -495579516);
        setIntField(term101889, term101889.getClass(), "totalExpertSync", -1364226663);
        setIntField(term101889, term101889.getClass(), "totalMasterSync", -255671701);
        setIntField(term101889, term101889.getClass(), "totalReMasterSync", 454414154);
        setIntField(term101889, term101889.getClass(), "playerRating", 1716689023);
        setIntField(term101889, term101889.getClass(), "highestRating", -185240752);
        setIntField(term101889, term101889.getClass(), "rankAuthTailId", 1276298262);
        setField(term101889, term101889.getClass(), "eventWatchedDate", "OvTdHngAsq");
        setField(term101889, term101889.getClass(), "webLimitDate", "dlLhtWVZjw");
        setIntField(term101889, term101889.getClass(), "challengeTrackPhase", 861694073);
        setIntField(term101889, term101889.getClass(), "firstPlayBits", 257279265);
        setField(term101889, term101889.getClass(), "lastPlayDate", "bGfglrDSXT");
        setIntField(term101889, term101889.getClass(), "lastPlaceId", -293267957);
        setField(term101889, term101889.getClass(), "lastPlaceName", "sIrqbajnbs");
        setIntField(term101889, term101889.getClass(), "lastRegionId", -1966853151);
        setField(term101889, term101889.getClass(), "lastRegionName", "AaxFofoThl");
        setField(term101889, term101889.getClass(), "lastClientId", "ukaqYcLsKW");
        setField(term101889, term101889.getClass(), "lastCountryCode", "EZLBboYbhD");
        setIntField(term101889, term101889.getClass(), "eventPoint", 1145144778);
        setIntField(term101889, term101889.getClass(), "totalLv", 1858161828);
        setIntField(term101889, term101889.getClass(), "lastLoginBonusDay", 969920028);
        setIntField(term101889, term101889.getClass(), "lastSurvivalBonusDay", -609652862);
        setIntField(term101889, term101889.getClass(), "loginBonusLv", -356838469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term101889;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


