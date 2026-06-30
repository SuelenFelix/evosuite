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

public class UserCard_getUser_6856182783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112299;

    public UserCard_getUser_6856182783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112305 = new Long(1860789353508856614L);
        term112299 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term112301 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term112303 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112334 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112299, term112299.getClass(), "id", -962443270368828376L);
        setLongField(term112301, term112301.getClass(), "id", 8871591264878584676L);
        setLongField(term112303, term112303.getClass(), "id", 4668755569034261276L);
        setField(term112303, term112303.getClass(), "extId", term112305);
        setField(term112303, term112303.getClass(), "luid", "cJBWpbUYku");
        setIntField(term112320, term112320.getClass(), "year", 2015);
        setShortField(term112320, term112320.getClass(), "month", (short) 1);
        setShortField(term112320, term112320.getClass(), "day", (short) 10);
        setField(term112319, term112319.getClass(), "date", term112320);
        setByteField(term112324, term112324.getClass(), "hour", (byte) 2);
        setByteField(term112324, term112324.getClass(), "minute", (byte) 48);
        setByteField(term112324, term112324.getClass(), "second", (byte) 41);
        setIntField(term112324, term112324.getClass(), "nano", 572611941);
        setField(term112319, term112319.getClass(), "time", term112324);
        setField(term112303, term112303.getClass(), "registerTime", term112319);
        setIntField(term112330, term112330.getClass(), "year", 2013);
        setShortField(term112330, term112330.getClass(), "month", (short) 10);
        setShortField(term112330, term112330.getClass(), "day", (short) 23);
        setField(term112329, term112329.getClass(), "date", term112330);
        setByteField(term112334, term112334.getClass(), "hour", (byte) 4);
        setByteField(term112334, term112334.getClass(), "minute", (byte) 33);
        setByteField(term112334, term112334.getClass(), "second", (byte) 51);
        setIntField(term112334, term112334.getClass(), "nano", 626320293);
        setField(term112329, term112329.getClass(), "time", term112334);
        setField(term112303, term112303.getClass(), "accessTime", term112329);
        setField(term112301, term112301.getClass(), "card", term112303);
        setField(term112301, term112301.getClass(), "userName", "FuPIwSZZLv");
        setIntField(term112301, term112301.getClass(), "level", -250008835);
        setIntField(term112301, term112301.getClass(), "reincarnationNum", -1865187594);
        setLongField(term112301, term112301.getClass(), "exp", -8476152522802926440L);
        setLongField(term112301, term112301.getClass(), "point", 5442777372425729608L);
        setLongField(term112301, term112301.getClass(), "totalPoint", -4170727101039793104L);
        setIntField(term112301, term112301.getClass(), "playCount", -1806281595);
        setIntField(term112301, term112301.getClass(), "jewelCount", -1207788939);
        setIntField(term112301, term112301.getClass(), "totalJewelCount", -1116962728);
        setIntField(term112301, term112301.getClass(), "medalCount", 1420647748);
        setIntField(term112301, term112301.getClass(), "playerRating", 1179379876);
        setIntField(term112301, term112301.getClass(), "highestRating", -1997441951);
        setIntField(term112301, term112301.getClass(), "battlePoint", -138340336);
        setIntField(term112301, term112301.getClass(), "bestBattlePoint", 233375431);
        setIntField(term112301, term112301.getClass(), "overDamageBattlePoint", 1527507424);
        setBooleanField(term112301, term112301.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term112301, term112301.getClass(), "nameplateId", -2100070024);
        setIntField(term112301, term112301.getClass(), "trophyId", 1206642688);
        setIntField(term112301, term112301.getClass(), "cardId", 224560582);
        setIntField(term112301, term112301.getClass(), "characterId", 1608206239);
        setIntField(term112301, term112301.getClass(), "characterVoiceNo", -989652648);
        setIntField(term112301, term112301.getClass(), "tabSetting", 234527042);
        setIntField(term112301, term112301.getClass(), "tabSortSetting", -1070770514);
        setIntField(term112301, term112301.getClass(), "cardCategorySetting", 1004064636);
        setIntField(term112301, term112301.getClass(), "cardSortSetting", -1815732679);
        setIntField(term112301, term112301.getClass(), "rivalScoreCategorySetting", -2141382740);
        setIntField(term112301, term112301.getClass(), "playedTutorialBit", -1545135290);
        setIntField(term112301, term112301.getClass(), "firstTutorialCancelNum", -802934163);
        setLongField(term112301, term112301.getClass(), "sumTechHighScore", 2425919301049553782L);
        setLongField(term112301, term112301.getClass(), "sumTechBasicHighScore", 4947114332289186760L);
        setLongField(term112301, term112301.getClass(), "sumTechAdvancedHighScore", 3438688892765738362L);
        setLongField(term112301, term112301.getClass(), "sumTechExpertHighScore", 5548942172756435328L);
        setLongField(term112301, term112301.getClass(), "sumTechMasterHighScore", 921962243596830906L);
        setLongField(term112301, term112301.getClass(), "sumTechLunaticHighScore", 4734307196115855909L);
        setLongField(term112301, term112301.getClass(), "sumBattleHighScore", 7771274437273050096L);
        setLongField(term112301, term112301.getClass(), "sumBattleBasicHighScore", 3067561445859721614L);
        setLongField(term112301, term112301.getClass(), "sumBattleAdvancedHighScore", -7437685790046877394L);
        setLongField(term112301, term112301.getClass(), "sumBattleExpertHighScore", -4307414339795555000L);
        setLongField(term112301, term112301.getClass(), "sumBattleMasterHighScore", -7540649381960807646L);
        setLongField(term112301, term112301.getClass(), "sumBattleLunaticHighScore", 6857953530991005045L);
        setField(term112301, term112301.getClass(), "eventWatchedDate", "IHnthsxNjP");
        setField(term112301, term112301.getClass(), "cmEventWatchedDate", "AmuZWWgIan");
        setField(term112301, term112301.getClass(), "firstGameId", "niexDrHktN");
        setField(term112301, term112301.getClass(), "firstRomVersion", "zkKyhlpdHO");
        setField(term112301, term112301.getClass(), "firstDataVersion", "deRevaCteK");
        setField(term112301, term112301.getClass(), "firstPlayDate", "dVepDETefb");
        setField(term112301, term112301.getClass(), "lastGameId", "IVzSENeLxP");
        setField(term112301, term112301.getClass(), "lastRomVersion", "XlXuNQwqYb");
        setField(term112301, term112301.getClass(), "lastDataVersion", "ePtDnXODVc");
        setField(term112301, term112301.getClass(), "compatibleCmVersion", "NupNPsPxZu");
        setField(term112301, term112301.getClass(), "lastPlayDate", "bOTZrbSitH");
        setIntField(term112301, term112301.getClass(), "lastPlaceId", -1934019263);
        setField(term112301, term112301.getClass(), "lastPlaceName", "ojFfVocDNH");
        setIntField(term112301, term112301.getClass(), "lastRegionId", 530191772);
        setField(term112301, term112301.getClass(), "lastRegionName", "gqBOEdccip");
        setIntField(term112301, term112301.getClass(), "lastAllNetId", 698731814);
        setField(term112301, term112301.getClass(), "lastClientId", "biglNwhOOx");
        setIntField(term112301, term112301.getClass(), "lastUsedDeckId", -1282557913);
        setIntField(term112301, term112301.getClass(), "lastPlayMusicLevel", -2080692202);
        setIntField(term112301, term112301.getClass(), "lastEmoneyBrand", 601982968);
        setField(term112299, term112299.getClass(), "user", term112301);
        setIntField(term112299, term112299.getClass(), "cardId", -1);
        setIntField(term112299, term112299.getClass(), "digitalStock", 1);
        setIntField(term112299, term112299.getClass(), "analogStock", -999152791);
        setIntField(term112299, term112299.getClass(), "level", 771966144);
        setIntField(term112299, term112299.getClass(), "maxLevel", 10);
        setIntField(term112299, term112299.getClass(), "exp", -270951499);
        setIntField(term112299, term112299.getClass(), "printCount", 1283219056);
        setIntField(term112299, term112299.getClass(), "useCount", 1914052513);
        setBooleanField(term112299, term112299.getClass(), "isNew", true);
        setField(term112299, term112299.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term112299, term112299.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term112299, term112299.getClass(), "skillId", -1810525034);
        setBooleanField(term112299, term112299.getClass(), "isAcquired", true);
        setField(term112299, term112299.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term112299, args);
    }

};


