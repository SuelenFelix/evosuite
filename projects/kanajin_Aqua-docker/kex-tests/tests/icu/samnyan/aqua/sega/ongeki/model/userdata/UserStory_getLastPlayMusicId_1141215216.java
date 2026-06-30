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

public class UserStory_getLastPlayMusicId_1141215216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160212;

    public UserStory_getLastPlayMusicId_1141215216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160218 = new Long(4525924047960478347L);
        term160212 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term160214 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term160216 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160237 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160247 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160212, term160212.getClass(), "id", -1608929094615847791L);
        setLongField(term160214, term160214.getClass(), "id", 3816410054760960914L);
        setLongField(term160216, term160216.getClass(), "id", -6232410367831760531L);
        setField(term160216, term160216.getClass(), "extId", term160218);
        setField(term160216, term160216.getClass(), "luid", "WIGBWJtmAB");
        setIntField(term160233, term160233.getClass(), "year", 2029);
        setShortField(term160233, term160233.getClass(), "month", (short) 11);
        setShortField(term160233, term160233.getClass(), "day", (short) 25);
        setField(term160232, term160232.getClass(), "date", term160233);
        setByteField(term160237, term160237.getClass(), "hour", (byte) 14);
        setByteField(term160237, term160237.getClass(), "minute", (byte) 49);
        setByteField(term160237, term160237.getClass(), "second", (byte) 17);
        setIntField(term160237, term160237.getClass(), "nano", 699722589);
        setField(term160232, term160232.getClass(), "time", term160237);
        setField(term160216, term160216.getClass(), "registerTime", term160232);
        setIntField(term160243, term160243.getClass(), "year", 2026);
        setShortField(term160243, term160243.getClass(), "month", (short) 10);
        setShortField(term160243, term160243.getClass(), "day", (short) 4);
        setField(term160242, term160242.getClass(), "date", term160243);
        setByteField(term160247, term160247.getClass(), "hour", (byte) 6);
        setByteField(term160247, term160247.getClass(), "minute", (byte) 41);
        setByteField(term160247, term160247.getClass(), "second", (byte) 50);
        setIntField(term160247, term160247.getClass(), "nano", 414376807);
        setField(term160242, term160242.getClass(), "time", term160247);
        setField(term160216, term160216.getClass(), "accessTime", term160242);
        setField(term160214, term160214.getClass(), "card", term160216);
        setField(term160214, term160214.getClass(), "userName", "QBaceAmfVr");
        setIntField(term160214, term160214.getClass(), "level", -236721588);
        setIntField(term160214, term160214.getClass(), "reincarnationNum", 1662513131);
        setLongField(term160214, term160214.getClass(), "exp", 2828639518050386066L);
        setLongField(term160214, term160214.getClass(), "point", -6705862032122161454L);
        setLongField(term160214, term160214.getClass(), "totalPoint", -8153349613425308115L);
        setIntField(term160214, term160214.getClass(), "playCount", 997658608);
        setIntField(term160214, term160214.getClass(), "jewelCount", -680345799);
        setIntField(term160214, term160214.getClass(), "totalJewelCount", -1388442633);
        setIntField(term160214, term160214.getClass(), "medalCount", -2049142454);
        setIntField(term160214, term160214.getClass(), "playerRating", -1757685074);
        setIntField(term160214, term160214.getClass(), "highestRating", 1123330448);
        setIntField(term160214, term160214.getClass(), "battlePoint", 1289973373);
        setIntField(term160214, term160214.getClass(), "bestBattlePoint", 1367726729);
        setIntField(term160214, term160214.getClass(), "overDamageBattlePoint", 1626219905);
        setBooleanField(term160214, term160214.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term160214, term160214.getClass(), "nameplateId", -1484874229);
        setIntField(term160214, term160214.getClass(), "trophyId", 887503328);
        setIntField(term160214, term160214.getClass(), "cardId", 586281192);
        setIntField(term160214, term160214.getClass(), "characterId", 1538125488);
        setIntField(term160214, term160214.getClass(), "characterVoiceNo", 825356733);
        setIntField(term160214, term160214.getClass(), "tabSetting", -1301409375);
        setIntField(term160214, term160214.getClass(), "tabSortSetting", 1979382762);
        setIntField(term160214, term160214.getClass(), "cardCategorySetting", -812267058);
        setIntField(term160214, term160214.getClass(), "cardSortSetting", 1394307839);
        setIntField(term160214, term160214.getClass(), "rivalScoreCategorySetting", 794207842);
        setIntField(term160214, term160214.getClass(), "playedTutorialBit", -771456985);
        setIntField(term160214, term160214.getClass(), "firstTutorialCancelNum", -722140170);
        setLongField(term160214, term160214.getClass(), "sumTechHighScore", 1290649024236556228L);
        setLongField(term160214, term160214.getClass(), "sumTechBasicHighScore", 4611475637593877402L);
        setLongField(term160214, term160214.getClass(), "sumTechAdvancedHighScore", 6027182674428873748L);
        setLongField(term160214, term160214.getClass(), "sumTechExpertHighScore", 5081404701350015572L);
        setLongField(term160214, term160214.getClass(), "sumTechMasterHighScore", -3975304277285445404L);
        setLongField(term160214, term160214.getClass(), "sumTechLunaticHighScore", -724066272816948155L);
        setLongField(term160214, term160214.getClass(), "sumBattleHighScore", -8080049785254177431L);
        setLongField(term160214, term160214.getClass(), "sumBattleBasicHighScore", 9116984811565234208L);
        setLongField(term160214, term160214.getClass(), "sumBattleAdvancedHighScore", -5186439316513011726L);
        setLongField(term160214, term160214.getClass(), "sumBattleExpertHighScore", 5555758503849541646L);
        setLongField(term160214, term160214.getClass(), "sumBattleMasterHighScore", -6044969559481196759L);
        setLongField(term160214, term160214.getClass(), "sumBattleLunaticHighScore", -3717040050675321204L);
        setField(term160214, term160214.getClass(), "eventWatchedDate", "hWLfpgPZDo");
        setField(term160214, term160214.getClass(), "cmEventWatchedDate", "YVKAmDRCvR");
        setField(term160214, term160214.getClass(), "firstGameId", "HseZXIAzZp");
        setField(term160214, term160214.getClass(), "firstRomVersion", "jbkKYvnNUK");
        setField(term160214, term160214.getClass(), "firstDataVersion", "qBnhTJalNA");
        setField(term160214, term160214.getClass(), "firstPlayDate", "sgpNzhEbZp");
        setField(term160214, term160214.getClass(), "lastGameId", "JrardfRgpb");
        setField(term160214, term160214.getClass(), "lastRomVersion", "LNnXYTWbVh");
        setField(term160214, term160214.getClass(), "lastDataVersion", "IsSVVsKoyt");
        setField(term160214, term160214.getClass(), "compatibleCmVersion", "JIYvHbwfiy");
        setField(term160214, term160214.getClass(), "lastPlayDate", "YheKvmZTNn");
        setIntField(term160214, term160214.getClass(), "lastPlaceId", 1916400220);
        setField(term160214, term160214.getClass(), "lastPlaceName", "cLPBTxvmBL");
        setIntField(term160214, term160214.getClass(), "lastRegionId", -1141686836);
        setField(term160214, term160214.getClass(), "lastRegionName", "BqBLmrxQoP");
        setIntField(term160214, term160214.getClass(), "lastAllNetId", 478352224);
        setField(term160214, term160214.getClass(), "lastClientId", "wGTLHXqSLS");
        setIntField(term160214, term160214.getClass(), "lastUsedDeckId", -1101969321);
        setIntField(term160214, term160214.getClass(), "lastPlayMusicLevel", -1548753200);
        setIntField(term160214, term160214.getClass(), "lastEmoneyBrand", 464016562);
        setField(term160212, term160212.getClass(), "user", term160214);
        setIntField(term160212, term160212.getClass(), "storyId", -1354580524);
        setIntField(term160212, term160212.getClass(), "lastChapterId", 1631553778);
        setIntField(term160212, term160212.getClass(), "jewelCount", 518955314);
        setIntField(term160212, term160212.getClass(), "lastPlayMusicId", 947568502);
        setIntField(term160212, term160212.getClass(), "lastPlayMusicCategory", -1214145327);
        setIntField(term160212, term160212.getClass(), "lastPlayMusicLevel", -1998835806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicId", argTypes, term160212, args);
    }

};


