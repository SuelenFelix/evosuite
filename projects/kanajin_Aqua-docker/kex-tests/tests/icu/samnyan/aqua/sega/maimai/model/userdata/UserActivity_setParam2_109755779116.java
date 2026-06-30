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
import java.lang.Integer;

public class UserActivity_setParam2_109755779116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48344;
     Object term48527;

    public UserActivity_setParam2_109755779116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48350 = new Long(-7291742736502427077L);
        term48344 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term48346 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term48348 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48379 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48344, term48344.getClass(), "id", -421166328269063791L);
        setLongField(term48346, term48346.getClass(), "id", 4811527754205378980L);
        setLongField(term48348, term48348.getClass(), "id", 9174730812791817537L);
        setField(term48348, term48348.getClass(), "extId", term48350);
        setField(term48348, term48348.getClass(), "luid", "rACmzcmIPm");
        setIntField(term48365, term48365.getClass(), "year", 2022);
        setShortField(term48365, term48365.getClass(), "month", (short) 12);
        setShortField(term48365, term48365.getClass(), "day", (short) 22);
        setField(term48364, term48364.getClass(), "date", term48365);
        setByteField(term48369, term48369.getClass(), "hour", (byte) 18);
        setByteField(term48369, term48369.getClass(), "minute", (byte) 30);
        setByteField(term48369, term48369.getClass(), "second", (byte) 56);
        setIntField(term48369, term48369.getClass(), "nano", 111391416);
        setField(term48364, term48364.getClass(), "time", term48369);
        setField(term48348, term48348.getClass(), "registerTime", term48364);
        setIntField(term48375, term48375.getClass(), "year", 2019);
        setShortField(term48375, term48375.getClass(), "month", (short) 6);
        setShortField(term48375, term48375.getClass(), "day", (short) 22);
        setField(term48374, term48374.getClass(), "date", term48375);
        setByteField(term48379, term48379.getClass(), "hour", (byte) 9);
        setByteField(term48379, term48379.getClass(), "minute", (byte) 14);
        setByteField(term48379, term48379.getClass(), "second", (byte) 27);
        setIntField(term48379, term48379.getClass(), "nano", 124138657);
        setField(term48374, term48374.getClass(), "time", term48379);
        setField(term48348, term48348.getClass(), "accessTime", term48374);
        setField(term48346, term48346.getClass(), "card", term48348);
        setIntField(term48346, term48346.getClass(), "lastDataVersion", -1575960315);
        setField(term48346, term48346.getClass(), "userName", "OCtePrLDhe");
        setIntField(term48346, term48346.getClass(), "point", -514683546);
        setIntField(term48346, term48346.getClass(), "totalPoint", 1234114047);
        setIntField(term48346, term48346.getClass(), "iconId", 781355790);
        setIntField(term48346, term48346.getClass(), "nameplateId", 549100322);
        setIntField(term48346, term48346.getClass(), "frameId", 398153902);
        setIntField(term48346, term48346.getClass(), "trophyId", 377234030);
        setIntField(term48346, term48346.getClass(), "playCount", 1874512723);
        setIntField(term48346, term48346.getClass(), "playVsCount", 1522351738);
        setIntField(term48346, term48346.getClass(), "playSyncCount", 1017805089);
        setIntField(term48346, term48346.getClass(), "winCount", -1625168727);
        setIntField(term48346, term48346.getClass(), "helpCount", 1507365243);
        setIntField(term48346, term48346.getClass(), "comboCount", -1212284162);
        setIntField(term48346, term48346.getClass(), "feverCount", -1956243783);
        setIntField(term48346, term48346.getClass(), "totalHiScore", 33967357);
        setIntField(term48346, term48346.getClass(), "totalEasyHighScore", -1227252559);
        setIntField(term48346, term48346.getClass(), "totalBasicHighScore", 1636889912);
        setIntField(term48346, term48346.getClass(), "totalAdvancedHighScore", 1695339680);
        setIntField(term48346, term48346.getClass(), "totalExpertHighScore", 79521146);
        setIntField(term48346, term48346.getClass(), "totalMasterHighScore", 1295906354);
        setIntField(term48346, term48346.getClass(), "totalReMasterHighScore", 980180400);
        setIntField(term48346, term48346.getClass(), "totalHighSync", -128299328);
        setIntField(term48346, term48346.getClass(), "totalEasySync", 668320250);
        setIntField(term48346, term48346.getClass(), "totalBasicSync", -2078852356);
        setIntField(term48346, term48346.getClass(), "totalAdvancedSync", 381868688);
        setIntField(term48346, term48346.getClass(), "totalExpertSync", -1312990054);
        setIntField(term48346, term48346.getClass(), "totalMasterSync", -741512095);
        setIntField(term48346, term48346.getClass(), "totalReMasterSync", 1514556613);
        setIntField(term48346, term48346.getClass(), "playerRating", 678621067);
        setIntField(term48346, term48346.getClass(), "highestRating", -133223081);
        setIntField(term48346, term48346.getClass(), "rankAuthTailId", 1890767141);
        setField(term48346, term48346.getClass(), "eventWatchedDate", "yqEphNxUPZ");
        setField(term48346, term48346.getClass(), "webLimitDate", "mJJxTuZuKO");
        setIntField(term48346, term48346.getClass(), "challengeTrackPhase", -1943101906);
        setIntField(term48346, term48346.getClass(), "firstPlayBits", 2055548921);
        setField(term48346, term48346.getClass(), "lastPlayDate", "anSZCikKpS");
        setIntField(term48346, term48346.getClass(), "lastPlaceId", -946368228);
        setField(term48346, term48346.getClass(), "lastPlaceName", "zvMQGbTtsV");
        setIntField(term48346, term48346.getClass(), "lastRegionId", -1303810032);
        setField(term48346, term48346.getClass(), "lastRegionName", "DyUuIDzZPG");
        setField(term48346, term48346.getClass(), "lastClientId", "EGQLusEtRN");
        setField(term48346, term48346.getClass(), "lastCountryCode", "GwGUMPdvZq");
        setIntField(term48346, term48346.getClass(), "eventPoint", -489320904);
        setIntField(term48346, term48346.getClass(), "totalLv", -1264556218);
        setIntField(term48346, term48346.getClass(), "lastLoginBonusDay", 989594530);
        setIntField(term48346, term48346.getClass(), "lastSurvivalBonusDay", -1044228796);
        setIntField(term48346, term48346.getClass(), "loginBonusLv", -1143503114);
        setField(term48344, term48344.getClass(), "user", term48346);
        setIntField(term48344, term48344.getClass(), "kind", -1645386867);
        setIntField(term48344, term48344.getClass(), "activityId", -176403451);
        setLongField(term48344, term48344.getClass(), "sortNumber", 8024477479047145752L);
        setIntField(term48344, term48344.getClass(), "param1", 546610816);
        setIntField(term48344, term48344.getClass(), "param2", -100412540);
        setIntField(term48344, term48344.getClass(), "param3", 1721386623);
        setIntField(term48344, term48344.getClass(), "param4", -1262959141);
        term48527 = new Integer(-1778216800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48527;
        callMethod(klass, "setParam2", argTypes, term48344, args);
    }

};


