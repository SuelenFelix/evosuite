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

public class UserMemoryChapter_equals_65747508027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401117;
     Object term401393;

    public UserMemoryChapter_equals_65747508027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term401123 = new Long(2678845111978352940L);
        term401117 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term401119 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term401121 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term401137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term401147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401152 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term401117, term401117.getClass(), "id", -6246736132402863594L);
        setLongField(term401119, term401119.getClass(), "id", 1041198836874363024L);
        setLongField(term401121, term401121.getClass(), "id", 953055836500237237L);
        setField(term401121, term401121.getClass(), "extId", term401123);
        setField(term401121, term401121.getClass(), "luid", "KZRvaFfknp");
        setIntField(term401138, term401138.getClass(), "year", 2021);
        setShortField(term401138, term401138.getClass(), "month", (short) 11);
        setShortField(term401138, term401138.getClass(), "day", (short) 6);
        setField(term401137, term401137.getClass(), "date", term401138);
        setByteField(term401142, term401142.getClass(), "hour", (byte) 14);
        setByteField(term401142, term401142.getClass(), "minute", (byte) 35);
        setByteField(term401142, term401142.getClass(), "second", (byte) 19);
        setIntField(term401142, term401142.getClass(), "nano", 169314591);
        setField(term401137, term401137.getClass(), "time", term401142);
        setField(term401121, term401121.getClass(), "registerTime", term401137);
        setIntField(term401148, term401148.getClass(), "year", 2024);
        setShortField(term401148, term401148.getClass(), "month", (short) 10);
        setShortField(term401148, term401148.getClass(), "day", (short) 25);
        setField(term401147, term401147.getClass(), "date", term401148);
        setByteField(term401152, term401152.getClass(), "hour", (byte) 20);
        setByteField(term401152, term401152.getClass(), "minute", (byte) 30);
        setByteField(term401152, term401152.getClass(), "second", (byte) 37);
        setIntField(term401152, term401152.getClass(), "nano", 13027541);
        setField(term401147, term401147.getClass(), "time", term401152);
        setField(term401121, term401121.getClass(), "accessTime", term401147);
        setField(term401119, term401119.getClass(), "card", term401121);
        setField(term401119, term401119.getClass(), "userName", "HZYHTZWvCL");
        setIntField(term401119, term401119.getClass(), "level", -1427142012);
        setIntField(term401119, term401119.getClass(), "reincarnationNum", 753189694);
        setLongField(term401119, term401119.getClass(), "exp", -2489440598226882778L);
        setLongField(term401119, term401119.getClass(), "point", 2178302950009102694L);
        setLongField(term401119, term401119.getClass(), "totalPoint", -6959816049126516902L);
        setIntField(term401119, term401119.getClass(), "playCount", 1885436402);
        setIntField(term401119, term401119.getClass(), "jewelCount", 1715535520);
        setIntField(term401119, term401119.getClass(), "totalJewelCount", 2078205419);
        setIntField(term401119, term401119.getClass(), "medalCount", -539256557);
        setIntField(term401119, term401119.getClass(), "playerRating", -157575454);
        setIntField(term401119, term401119.getClass(), "highestRating", 643981764);
        setIntField(term401119, term401119.getClass(), "battlePoint", 1871126583);
        setIntField(term401119, term401119.getClass(), "bestBattlePoint", -1252641066);
        setIntField(term401119, term401119.getClass(), "overDamageBattlePoint", 1527654934);
        setBooleanField(term401119, term401119.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term401119, term401119.getClass(), "nameplateId", -1343600216);
        setIntField(term401119, term401119.getClass(), "trophyId", 622874825);
        setIntField(term401119, term401119.getClass(), "cardId", 955104668);
        setIntField(term401119, term401119.getClass(), "characterId", 277744816);
        setIntField(term401119, term401119.getClass(), "characterVoiceNo", -480405139);
        setIntField(term401119, term401119.getClass(), "tabSetting", 809004608);
        setIntField(term401119, term401119.getClass(), "tabSortSetting", -333834666);
        setIntField(term401119, term401119.getClass(), "cardCategorySetting", 16329647);
        setIntField(term401119, term401119.getClass(), "cardSortSetting", 1218952606);
        setIntField(term401119, term401119.getClass(), "rivalScoreCategorySetting", 951392834);
        setIntField(term401119, term401119.getClass(), "playedTutorialBit", 1421331522);
        setIntField(term401119, term401119.getClass(), "firstTutorialCancelNum", -110574768);
        setLongField(term401119, term401119.getClass(), "sumTechHighScore", 8151287794377461925L);
        setLongField(term401119, term401119.getClass(), "sumTechBasicHighScore", 3659917402769044046L);
        setLongField(term401119, term401119.getClass(), "sumTechAdvancedHighScore", 1047290652534056793L);
        setLongField(term401119, term401119.getClass(), "sumTechExpertHighScore", 8087706986098256695L);
        setLongField(term401119, term401119.getClass(), "sumTechMasterHighScore", -6594572008134805448L);
        setLongField(term401119, term401119.getClass(), "sumTechLunaticHighScore", 6808779350592717925L);
        setLongField(term401119, term401119.getClass(), "sumBattleHighScore", 4045330952321794410L);
        setLongField(term401119, term401119.getClass(), "sumBattleBasicHighScore", 8428251397168351360L);
        setLongField(term401119, term401119.getClass(), "sumBattleAdvancedHighScore", 154603419020757356L);
        setLongField(term401119, term401119.getClass(), "sumBattleExpertHighScore", 5201425391616953363L);
        setLongField(term401119, term401119.getClass(), "sumBattleMasterHighScore", 4833652184756528695L);
        setLongField(term401119, term401119.getClass(), "sumBattleLunaticHighScore", 865720572702622542L);
        setField(term401119, term401119.getClass(), "eventWatchedDate", "EKiPKtNVmD");
        setField(term401119, term401119.getClass(), "cmEventWatchedDate", "uNMyyYKArF");
        setField(term401119, term401119.getClass(), "firstGameId", "JdYqAepOLk");
        setField(term401119, term401119.getClass(), "firstRomVersion", "KnrrIQRbYZ");
        setField(term401119, term401119.getClass(), "firstDataVersion", "YIBQhuIwqv");
        setField(term401119, term401119.getClass(), "firstPlayDate", "XFzuYupKYf");
        setField(term401119, term401119.getClass(), "lastGameId", "IjBvNqEnli");
        setField(term401119, term401119.getClass(), "lastRomVersion", "vSxIvcYZaq");
        setField(term401119, term401119.getClass(), "lastDataVersion", "eSMUXSYlki");
        setField(term401119, term401119.getClass(), "compatibleCmVersion", "iglvlgJCvj");
        setField(term401119, term401119.getClass(), "lastPlayDate", "bsMcvKRfgr");
        setIntField(term401119, term401119.getClass(), "lastPlaceId", -1173762613);
        setField(term401119, term401119.getClass(), "lastPlaceName", "VagonZzeLk");
        setIntField(term401119, term401119.getClass(), "lastRegionId", -415242885);
        setField(term401119, term401119.getClass(), "lastRegionName", "cvStjsttcb");
        setIntField(term401119, term401119.getClass(), "lastAllNetId", 401382051);
        setField(term401119, term401119.getClass(), "lastClientId", "ZvFoPIgeHX");
        setIntField(term401119, term401119.getClass(), "lastUsedDeckId", 784428208);
        setIntField(term401119, term401119.getClass(), "lastPlayMusicLevel", 216118104);
        setIntField(term401119, term401119.getClass(), "lastEmoneyBrand", 1382305765);
        setField(term401117, term401117.getClass(), "user", term401119);
        setIntField(term401117, term401117.getClass(), "chapterId", -1696947789);
        setIntField(term401117, term401117.getClass(), "jewelCount", 344187317);
        setIntField(term401117, term401117.getClass(), "lastPlayMusicCategory", 1723623826);
        setIntField(term401117, term401117.getClass(), "lastPlayMusicId", 123144522);
        setIntField(term401117, term401117.getClass(), "lastPlayMusicLevel", -1256360232);
        setBooleanField(term401117, term401117.getClass(), "isDialogWatched", true);
        setBooleanField(term401117, term401117.getClass(), "isStoryWatched", true);
        setBooleanField(term401117, term401117.getClass(), "isBossWatched", true);
        setBooleanField(term401117, term401117.getClass(), "isClear", false);
        setIntField(term401117, term401117.getClass(), "gaugeId", -1064592593);
        setIntField(term401117, term401117.getClass(), "gaugeNum", -121394430);
        term401393 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term401393;
        callMethod(klass, "equals", argTypes, term401117, args);
    }

};


