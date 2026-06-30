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

public class UserLoginBonus_getLastUpdateDate_12780288225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303028;

    public UserLoginBonus_getLastUpdateDate_12780288225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term303034 = new Long(-8699693633047465617L);
        term303028 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term303030 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term303032 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term303048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term303028, term303028.getClass(), "id", 1435273021559155218L);
        setLongField(term303030, term303030.getClass(), "id", -246153305660173932L);
        setLongField(term303032, term303032.getClass(), "id", 275301452792981420L);
        setField(term303032, term303032.getClass(), "extId", term303034);
        setField(term303032, term303032.getClass(), "luid", "hKYdhUsiDC");
        setIntField(term303049, term303049.getClass(), "year", 2012);
        setShortField(term303049, term303049.getClass(), "month", (short) 2);
        setShortField(term303049, term303049.getClass(), "day", (short) 5);
        setField(term303048, term303048.getClass(), "date", term303049);
        setByteField(term303053, term303053.getClass(), "hour", (byte) 17);
        setByteField(term303053, term303053.getClass(), "minute", (byte) 15);
        setByteField(term303053, term303053.getClass(), "second", (byte) 32);
        setIntField(term303053, term303053.getClass(), "nano", 232376809);
        setField(term303048, term303048.getClass(), "time", term303053);
        setField(term303032, term303032.getClass(), "registerTime", term303048);
        setIntField(term303059, term303059.getClass(), "year", 2023);
        setShortField(term303059, term303059.getClass(), "month", (short) 6);
        setShortField(term303059, term303059.getClass(), "day", (short) 1);
        setField(term303058, term303058.getClass(), "date", term303059);
        setByteField(term303063, term303063.getClass(), "hour", (byte) 8);
        setByteField(term303063, term303063.getClass(), "minute", (byte) 51);
        setByteField(term303063, term303063.getClass(), "second", (byte) 47);
        setIntField(term303063, term303063.getClass(), "nano", 455209241);
        setField(term303058, term303058.getClass(), "time", term303063);
        setField(term303032, term303032.getClass(), "accessTime", term303058);
        setField(term303030, term303030.getClass(), "card", term303032);
        setField(term303030, term303030.getClass(), "userName", "whjpwSMlSP");
        setIntField(term303030, term303030.getClass(), "level", 1485634751);
        setIntField(term303030, term303030.getClass(), "reincarnationNum", 1649606615);
        setLongField(term303030, term303030.getClass(), "exp", 3364961805310730107L);
        setLongField(term303030, term303030.getClass(), "point", 2737795524863043142L);
        setLongField(term303030, term303030.getClass(), "totalPoint", 8360541079546375719L);
        setIntField(term303030, term303030.getClass(), "playCount", 1965144392);
        setIntField(term303030, term303030.getClass(), "jewelCount", -896244794);
        setIntField(term303030, term303030.getClass(), "totalJewelCount", -1329430786);
        setIntField(term303030, term303030.getClass(), "medalCount", 1526430415);
        setIntField(term303030, term303030.getClass(), "playerRating", -1335813580);
        setIntField(term303030, term303030.getClass(), "highestRating", -1945458236);
        setIntField(term303030, term303030.getClass(), "battlePoint", 620008134);
        setIntField(term303030, term303030.getClass(), "bestBattlePoint", -1310086261);
        setIntField(term303030, term303030.getClass(), "overDamageBattlePoint", -1554112233);
        setBooleanField(term303030, term303030.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term303030, term303030.getClass(), "nameplateId", 54581392);
        setIntField(term303030, term303030.getClass(), "trophyId", 671071231);
        setIntField(term303030, term303030.getClass(), "cardId", 1323294572);
        setIntField(term303030, term303030.getClass(), "characterId", 562264132);
        setIntField(term303030, term303030.getClass(), "characterVoiceNo", 220331589);
        setIntField(term303030, term303030.getClass(), "tabSetting", 1631094414);
        setIntField(term303030, term303030.getClass(), "tabSortSetting", -1544328261);
        setIntField(term303030, term303030.getClass(), "cardCategorySetting", -1889604863);
        setIntField(term303030, term303030.getClass(), "cardSortSetting", 279867224);
        setIntField(term303030, term303030.getClass(), "rivalScoreCategorySetting", -537026089);
        setIntField(term303030, term303030.getClass(), "playedTutorialBit", -1121256227);
        setIntField(term303030, term303030.getClass(), "firstTutorialCancelNum", -534653262);
        setLongField(term303030, term303030.getClass(), "sumTechHighScore", 2887611018941773502L);
        setLongField(term303030, term303030.getClass(), "sumTechBasicHighScore", -6584797421308555700L);
        setLongField(term303030, term303030.getClass(), "sumTechAdvancedHighScore", 6344137555173625826L);
        setLongField(term303030, term303030.getClass(), "sumTechExpertHighScore", -6258793873221904514L);
        setLongField(term303030, term303030.getClass(), "sumTechMasterHighScore", 5780056333360124761L);
        setLongField(term303030, term303030.getClass(), "sumTechLunaticHighScore", 1511663339936747951L);
        setLongField(term303030, term303030.getClass(), "sumBattleHighScore", 1470496884416412868L);
        setLongField(term303030, term303030.getClass(), "sumBattleBasicHighScore", 7349221649206211318L);
        setLongField(term303030, term303030.getClass(), "sumBattleAdvancedHighScore", -2336894511371231457L);
        setLongField(term303030, term303030.getClass(), "sumBattleExpertHighScore", -3060295605797751407L);
        setLongField(term303030, term303030.getClass(), "sumBattleMasterHighScore", 5844623527945294957L);
        setLongField(term303030, term303030.getClass(), "sumBattleLunaticHighScore", -5183646439839331795L);
        setField(term303030, term303030.getClass(), "eventWatchedDate", "CWWvGZMEId");
        setField(term303030, term303030.getClass(), "cmEventWatchedDate", "uhdVsaXySd");
        setField(term303030, term303030.getClass(), "firstGameId", "evnloNxsNi");
        setField(term303030, term303030.getClass(), "firstRomVersion", "kLCuIvMMCV");
        setField(term303030, term303030.getClass(), "firstDataVersion", "KXSxokRDON");
        setField(term303030, term303030.getClass(), "firstPlayDate", "eGlkGTQepc");
        setField(term303030, term303030.getClass(), "lastGameId", "DcEhRkuwFV");
        setField(term303030, term303030.getClass(), "lastRomVersion", "bLkMoMyLsr");
        setField(term303030, term303030.getClass(), "lastDataVersion", "fMTcYTqwCd");
        setField(term303030, term303030.getClass(), "compatibleCmVersion", "sMWFVIsJMj");
        setField(term303030, term303030.getClass(), "lastPlayDate", "XWepsdWPbm");
        setIntField(term303030, term303030.getClass(), "lastPlaceId", -645772567);
        setField(term303030, term303030.getClass(), "lastPlaceName", "zGFPDuDbGy");
        setIntField(term303030, term303030.getClass(), "lastRegionId", -682512253);
        setField(term303030, term303030.getClass(), "lastRegionName", "DJWFLHPZno");
        setIntField(term303030, term303030.getClass(), "lastAllNetId", -766106428);
        setField(term303030, term303030.getClass(), "lastClientId", "iwcGksjeEo");
        setIntField(term303030, term303030.getClass(), "lastUsedDeckId", 1129646646);
        setIntField(term303030, term303030.getClass(), "lastPlayMusicLevel", -800100261);
        setIntField(term303030, term303030.getClass(), "lastEmoneyBrand", -119811965);
        setField(term303028, term303028.getClass(), "user", term303030);
        setIntField(term303028, term303028.getClass(), "bonusId", 1546312873);
        setIntField(term303028, term303028.getClass(), "bonusCount", 1323349904);
        setField(term303028, term303028.getClass(), "lastUpdateDate", "ftOtxrQrKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdateDate", argTypes, term303028, args);
    }

};


