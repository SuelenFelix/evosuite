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

public class UserData_getTotalJewelCount_112421644010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26148;

    public UserData_getTotalJewelCount_112421644010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26152 = new Long(3892018155439224435L);
        term26148 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term26150 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26148, term26148.getClass(), "id", -8129901089598682226L);
        setLongField(term26150, term26150.getClass(), "id", -2740731095268174775L);
        setField(term26150, term26150.getClass(), "extId", term26152);
        setField(term26150, term26150.getClass(), "luid", "taPBiMFNEZ");
        setIntField(term26167, term26167.getClass(), "year", 2024);
        setShortField(term26167, term26167.getClass(), "month", (short) 9);
        setShortField(term26167, term26167.getClass(), "day", (short) 22);
        setField(term26166, term26166.getClass(), "date", term26167);
        setByteField(term26171, term26171.getClass(), "hour", (byte) 0);
        setByteField(term26171, term26171.getClass(), "minute", (byte) 11);
        setByteField(term26171, term26171.getClass(), "second", (byte) 7);
        setIntField(term26171, term26171.getClass(), "nano", 56643259);
        setField(term26166, term26166.getClass(), "time", term26171);
        setField(term26150, term26150.getClass(), "registerTime", term26166);
        setIntField(term26177, term26177.getClass(), "year", 2021);
        setShortField(term26177, term26177.getClass(), "month", (short) 12);
        setShortField(term26177, term26177.getClass(), "day", (short) 21);
        setField(term26176, term26176.getClass(), "date", term26177);
        setByteField(term26181, term26181.getClass(), "hour", (byte) 12);
        setByteField(term26181, term26181.getClass(), "minute", (byte) 59);
        setByteField(term26181, term26181.getClass(), "second", (byte) 52);
        setIntField(term26181, term26181.getClass(), "nano", 47081639);
        setField(term26176, term26176.getClass(), "time", term26181);
        setField(term26150, term26150.getClass(), "accessTime", term26176);
        setField(term26148, term26148.getClass(), "card", term26150);
        setField(term26148, term26148.getClass(), "userName", "NoAFAfGyYL");
        setIntField(term26148, term26148.getClass(), "level", -710001354);
        setIntField(term26148, term26148.getClass(), "reincarnationNum", 2007404429);
        setLongField(term26148, term26148.getClass(), "exp", 1434994695522862422L);
        setLongField(term26148, term26148.getClass(), "point", 7917622690009120321L);
        setLongField(term26148, term26148.getClass(), "totalPoint", -6651761389033452541L);
        setIntField(term26148, term26148.getClass(), "playCount", 472580433);
        setIntField(term26148, term26148.getClass(), "jewelCount", 1189049164);
        setIntField(term26148, term26148.getClass(), "totalJewelCount", -673413879);
        setIntField(term26148, term26148.getClass(), "medalCount", 1609778442);
        setIntField(term26148, term26148.getClass(), "playerRating", 524850421);
        setIntField(term26148, term26148.getClass(), "highestRating", -1833121756);
        setIntField(term26148, term26148.getClass(), "battlePoint", -1493632787);
        setIntField(term26148, term26148.getClass(), "bestBattlePoint", -1056969264);
        setIntField(term26148, term26148.getClass(), "overDamageBattlePoint", -709130701);
        setBooleanField(term26148, term26148.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term26148, term26148.getClass(), "nameplateId", 86144663);
        setIntField(term26148, term26148.getClass(), "trophyId", -1480903995);
        setIntField(term26148, term26148.getClass(), "cardId", -2111772603);
        setIntField(term26148, term26148.getClass(), "characterId", 637942911);
        setIntField(term26148, term26148.getClass(), "characterVoiceNo", -395396657);
        setIntField(term26148, term26148.getClass(), "tabSetting", 1677171453);
        setIntField(term26148, term26148.getClass(), "tabSortSetting", -2108979704);
        setIntField(term26148, term26148.getClass(), "cardCategorySetting", 1629835601);
        setIntField(term26148, term26148.getClass(), "cardSortSetting", 1866184476);
        setIntField(term26148, term26148.getClass(), "rivalScoreCategorySetting", -17998574);
        setIntField(term26148, term26148.getClass(), "playedTutorialBit", 145080354);
        setIntField(term26148, term26148.getClass(), "firstTutorialCancelNum", -2087321012);
        setLongField(term26148, term26148.getClass(), "sumTechHighScore", 7492997886327124063L);
        setLongField(term26148, term26148.getClass(), "sumTechBasicHighScore", -8520099975744950197L);
        setLongField(term26148, term26148.getClass(), "sumTechAdvancedHighScore", 3505714875198206555L);
        setLongField(term26148, term26148.getClass(), "sumTechExpertHighScore", 4923049398658802749L);
        setLongField(term26148, term26148.getClass(), "sumTechMasterHighScore", -6994512078037182768L);
        setLongField(term26148, term26148.getClass(), "sumTechLunaticHighScore", -7497758874949135776L);
        setLongField(term26148, term26148.getClass(), "sumBattleHighScore", 504174293291540734L);
        setLongField(term26148, term26148.getClass(), "sumBattleBasicHighScore", -6669406542315322596L);
        setLongField(term26148, term26148.getClass(), "sumBattleAdvancedHighScore", 607455009844232907L);
        setLongField(term26148, term26148.getClass(), "sumBattleExpertHighScore", -2171686672543976361L);
        setLongField(term26148, term26148.getClass(), "sumBattleMasterHighScore", 1122196220816602891L);
        setLongField(term26148, term26148.getClass(), "sumBattleLunaticHighScore", 1006339275456792418L);
        setField(term26148, term26148.getClass(), "eventWatchedDate", "MFtfkBMyOD");
        setField(term26148, term26148.getClass(), "cmEventWatchedDate", "rdiIyXfRtL");
        setField(term26148, term26148.getClass(), "firstGameId", "douzkltmiI");
        setField(term26148, term26148.getClass(), "firstRomVersion", "MFKjhvLtpe");
        setField(term26148, term26148.getClass(), "firstDataVersion", "xpbLKEsput");
        setField(term26148, term26148.getClass(), "firstPlayDate", "urlyLwPBVn");
        setField(term26148, term26148.getClass(), "lastGameId", "SPQVzOlOzZ");
        setField(term26148, term26148.getClass(), "lastRomVersion", "bOUAgAptAI");
        setField(term26148, term26148.getClass(), "lastDataVersion", "KSZfGbvzPE");
        setField(term26148, term26148.getClass(), "compatibleCmVersion", "YfgYGgzYER");
        setField(term26148, term26148.getClass(), "lastPlayDate", "IDClvDZuqE");
        setIntField(term26148, term26148.getClass(), "lastPlaceId", -1613074612);
        setField(term26148, term26148.getClass(), "lastPlaceName", "cMvKxpZOvg");
        setIntField(term26148, term26148.getClass(), "lastRegionId", 1054908502);
        setField(term26148, term26148.getClass(), "lastRegionName", "WWBYemIuiK");
        setIntField(term26148, term26148.getClass(), "lastAllNetId", -1226802566);
        setField(term26148, term26148.getClass(), "lastClientId", "nHYQYkycCR");
        setIntField(term26148, term26148.getClass(), "lastUsedDeckId", 1162813858);
        setIntField(term26148, term26148.getClass(), "lastPlayMusicLevel", 494596414);
        setIntField(term26148, term26148.getClass(), "lastEmoneyBrand", 1226377461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalJewelCount", argTypes, term26148, args);
    }

};


