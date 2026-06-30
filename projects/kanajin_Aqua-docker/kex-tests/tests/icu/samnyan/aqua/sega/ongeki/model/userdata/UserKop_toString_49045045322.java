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
import java.lang.Object;
import java.lang.Long;

public class UserKop_toString_49045045322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281600;

    public UserKop_toString_49045045322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281606 = new Long(-8928717808154338062L);
        term281600 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term281602 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term281604 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281635 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281600, term281600.getClass(), "id", 4020126725012649437L);
        setLongField(term281602, term281602.getClass(), "id", -8921625505903073413L);
        setLongField(term281604, term281604.getClass(), "id", 5214283317567780004L);
        setField(term281604, term281604.getClass(), "extId", term281606);
        setField(term281604, term281604.getClass(), "luid", "qngJBSwcWS");
        setIntField(term281621, term281621.getClass(), "year", 2021);
        setShortField(term281621, term281621.getClass(), "month", (short) 6);
        setShortField(term281621, term281621.getClass(), "day", (short) 6);
        setField(term281620, term281620.getClass(), "date", term281621);
        setByteField(term281625, term281625.getClass(), "hour", (byte) 5);
        setByteField(term281625, term281625.getClass(), "minute", (byte) 8);
        setByteField(term281625, term281625.getClass(), "second", (byte) 19);
        setIntField(term281625, term281625.getClass(), "nano", 49468317);
        setField(term281620, term281620.getClass(), "time", term281625);
        setField(term281604, term281604.getClass(), "registerTime", term281620);
        setIntField(term281631, term281631.getClass(), "year", 2016);
        setShortField(term281631, term281631.getClass(), "month", (short) 8);
        setShortField(term281631, term281631.getClass(), "day", (short) 28);
        setField(term281630, term281630.getClass(), "date", term281631);
        setByteField(term281635, term281635.getClass(), "hour", (byte) 19);
        setByteField(term281635, term281635.getClass(), "minute", (byte) 45);
        setByteField(term281635, term281635.getClass(), "second", (byte) 36);
        setIntField(term281635, term281635.getClass(), "nano", 185901048);
        setField(term281630, term281630.getClass(), "time", term281635);
        setField(term281604, term281604.getClass(), "accessTime", term281630);
        setField(term281602, term281602.getClass(), "card", term281604);
        setField(term281602, term281602.getClass(), "userName", "NeglvhHDjr");
        setIntField(term281602, term281602.getClass(), "level", 162800610);
        setIntField(term281602, term281602.getClass(), "reincarnationNum", -130685400);
        setLongField(term281602, term281602.getClass(), "exp", 7985898285548279218L);
        setLongField(term281602, term281602.getClass(), "point", 5001132640058908729L);
        setLongField(term281602, term281602.getClass(), "totalPoint", 639614553632575670L);
        setIntField(term281602, term281602.getClass(), "playCount", 733495333);
        setIntField(term281602, term281602.getClass(), "jewelCount", 224926338);
        setIntField(term281602, term281602.getClass(), "totalJewelCount", -1994228985);
        setIntField(term281602, term281602.getClass(), "medalCount", 1359678788);
        setIntField(term281602, term281602.getClass(), "playerRating", 1234464848);
        setIntField(term281602, term281602.getClass(), "highestRating", 1342592274);
        setIntField(term281602, term281602.getClass(), "battlePoint", 1594888304);
        setIntField(term281602, term281602.getClass(), "bestBattlePoint", -472612133);
        setIntField(term281602, term281602.getClass(), "overDamageBattlePoint", 580127194);
        setBooleanField(term281602, term281602.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term281602, term281602.getClass(), "nameplateId", 763714666);
        setIntField(term281602, term281602.getClass(), "trophyId", 1091341986);
        setIntField(term281602, term281602.getClass(), "cardId", 1965907538);
        setIntField(term281602, term281602.getClass(), "characterId", 72918123);
        setIntField(term281602, term281602.getClass(), "characterVoiceNo", -145666395);
        setIntField(term281602, term281602.getClass(), "tabSetting", 788738026);
        setIntField(term281602, term281602.getClass(), "tabSortSetting", -960721893);
        setIntField(term281602, term281602.getClass(), "cardCategorySetting", 619168390);
        setIntField(term281602, term281602.getClass(), "cardSortSetting", 1473974676);
        setIntField(term281602, term281602.getClass(), "rivalScoreCategorySetting", 83830744);
        setIntField(term281602, term281602.getClass(), "playedTutorialBit", -310121450);
        setIntField(term281602, term281602.getClass(), "firstTutorialCancelNum", 869833249);
        setLongField(term281602, term281602.getClass(), "sumTechHighScore", 1838613597468548693L);
        setLongField(term281602, term281602.getClass(), "sumTechBasicHighScore", -3359948516535400868L);
        setLongField(term281602, term281602.getClass(), "sumTechAdvancedHighScore", 5380852255664314677L);
        setLongField(term281602, term281602.getClass(), "sumTechExpertHighScore", -827897194788198087L);
        setLongField(term281602, term281602.getClass(), "sumTechMasterHighScore", -985988646060745825L);
        setLongField(term281602, term281602.getClass(), "sumTechLunaticHighScore", -9107585428833659325L);
        setLongField(term281602, term281602.getClass(), "sumBattleHighScore", 946527206019901730L);
        setLongField(term281602, term281602.getClass(), "sumBattleBasicHighScore", -4718942464503910216L);
        setLongField(term281602, term281602.getClass(), "sumBattleAdvancedHighScore", 6882429509870573218L);
        setLongField(term281602, term281602.getClass(), "sumBattleExpertHighScore", 4879561218160089150L);
        setLongField(term281602, term281602.getClass(), "sumBattleMasterHighScore", -6440617897553860845L);
        setLongField(term281602, term281602.getClass(), "sumBattleLunaticHighScore", 3446961003644706123L);
        setField(term281602, term281602.getClass(), "eventWatchedDate", "TTDVDdOeqI");
        setField(term281602, term281602.getClass(), "cmEventWatchedDate", "jDyYjDgeRm");
        setField(term281602, term281602.getClass(), "firstGameId", "DlaIwKXfcE");
        setField(term281602, term281602.getClass(), "firstRomVersion", "XqyZdgkVGJ");
        setField(term281602, term281602.getClass(), "firstDataVersion", "lDHOULUQIk");
        setField(term281602, term281602.getClass(), "firstPlayDate", "NXdDKYbdXI");
        setField(term281602, term281602.getClass(), "lastGameId", "pxtuUGpEnU");
        setField(term281602, term281602.getClass(), "lastRomVersion", "uRwndqhyZT");
        setField(term281602, term281602.getClass(), "lastDataVersion", "ZyhPGeQowD");
        setField(term281602, term281602.getClass(), "compatibleCmVersion", "YBDATxOjKA");
        setField(term281602, term281602.getClass(), "lastPlayDate", "HMHWwIqMRa");
        setIntField(term281602, term281602.getClass(), "lastPlaceId", -2051296834);
        setField(term281602, term281602.getClass(), "lastPlaceName", "oYEupxjTZn");
        setIntField(term281602, term281602.getClass(), "lastRegionId", 407416813);
        setField(term281602, term281602.getClass(), "lastRegionName", "vnBZyaIYnL");
        setIntField(term281602, term281602.getClass(), "lastAllNetId", 513307188);
        setField(term281602, term281602.getClass(), "lastClientId", "lVKHMYsoNI");
        setIntField(term281602, term281602.getClass(), "lastUsedDeckId", 1094537848);
        setIntField(term281602, term281602.getClass(), "lastPlayMusicLevel", -100651609);
        setIntField(term281602, term281602.getClass(), "lastEmoneyBrand", 1224321939);
        setField(term281600, term281600.getClass(), "user", term281602);
        setField(term281600, term281600.getClass(), "authKey", "MPUPYPQuHB");
        setIntField(term281600, term281600.getClass(), "kopId", 1940467037);
        setIntField(term281600, term281600.getClass(), "areaId", -847131875);
        setIntField(term281600, term281600.getClass(), "totalTechScore", 928002389);
        setIntField(term281600, term281600.getClass(), "totalPlatinumScore", -274458803);
        setField(term281600, term281600.getClass(), "techRecordDate", "blJZUhevsA");
        setBooleanField(term281600, term281600.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term281600, args);
    }

};


