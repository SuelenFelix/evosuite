package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserCourse_getPlayCount_901730218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76090;

    public UserCourse_getPlayCount_901730218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76096 = new Long(2297097306706899827L);
        Integer term76159 = new Integer(-600102466);
        Integer term76161 = new Integer(-899986714);
        ArrayList term76157 = new ArrayList();
        ((ArrayList) term76157).add(term76159);
        ((ArrayList) term76157).add(term76161);
        Integer term76167 = new Integer(1307244466);
        Integer term76169 = new Integer(-252262096);
        Integer term76171 = new Integer(-37129068);
        ArrayList term76165 = new ArrayList();
        ((ArrayList) term76165).add(term76167);
        ((ArrayList) term76165).add(term76169);
        ((ArrayList) term76165).add(term76171);
        term76090 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term76092 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term76094 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76125 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76090, term76090.getClass(), "id", -6850320595253329951L);
        setLongField(term76092, term76092.getClass(), "id", 5358056200486376020L);
        setLongField(term76094, term76094.getClass(), "id", -4914143694950160865L);
        setField(term76094, term76094.getClass(), "extId", term76096);
        setField(term76094, term76094.getClass(), "luid", "ZKwDTklKHb");
        setIntField(term76111, term76111.getClass(), "year", 2024);
        setShortField(term76111, term76111.getClass(), "month", (short) 9);
        setShortField(term76111, term76111.getClass(), "day", (short) 7);
        setField(term76110, term76110.getClass(), "date", term76111);
        setByteField(term76115, term76115.getClass(), "hour", (byte) 2);
        setByteField(term76115, term76115.getClass(), "minute", (byte) 37);
        setByteField(term76115, term76115.getClass(), "second", (byte) 4);
        setIntField(term76115, term76115.getClass(), "nano", 236043949);
        setField(term76110, term76110.getClass(), "time", term76115);
        setField(term76094, term76094.getClass(), "registerTime", term76110);
        setIntField(term76121, term76121.getClass(), "year", 2025);
        setShortField(term76121, term76121.getClass(), "month", (short) 7);
        setShortField(term76121, term76121.getClass(), "day", (short) 4);
        setField(term76120, term76120.getClass(), "date", term76121);
        setByteField(term76125, term76125.getClass(), "hour", (byte) 18);
        setByteField(term76125, term76125.getClass(), "minute", (byte) 13);
        setByteField(term76125, term76125.getClass(), "second", (byte) 37);
        setIntField(term76125, term76125.getClass(), "nano", 681447348);
        setField(term76120, term76120.getClass(), "time", term76125);
        setField(term76094, term76094.getClass(), "accessTime", term76120);
        setField(term76092, term76092.getClass(), "card", term76094);
        setField(term76092, term76092.getClass(), "userName", "tQMlnMStsQ");
        setIntField(term76092, term76092.getClass(), "isNetMember", 909002823);
        setIntField(term76092, term76092.getClass(), "iconId", -1704063989);
        setIntField(term76092, term76092.getClass(), "plateId", -611728039);
        setIntField(term76092, term76092.getClass(), "titleId", -1889258359);
        setIntField(term76092, term76092.getClass(), "partnerId", 518609792);
        setIntField(term76092, term76092.getClass(), "frameId", 744386531);
        setIntField(term76092, term76092.getClass(), "selectMapId", -1325218609);
        setIntField(term76092, term76092.getClass(), "totalAwake", -1282023865);
        setIntField(term76092, term76092.getClass(), "gradeRating", 64836181);
        setIntField(term76092, term76092.getClass(), "musicRating", -919341486);
        setIntField(term76092, term76092.getClass(), "playerRating", -2030534662);
        setIntField(term76092, term76092.getClass(), "highestRating", 671838672);
        setIntField(term76092, term76092.getClass(), "gradeRank", 722555455);
        setIntField(term76092, term76092.getClass(), "classRank", 862777086);
        setIntField(term76092, term76092.getClass(), "courseRank", 868971767);
        setField(term76092, term76092.getClass(), "charaSlot", term76157);
        setField(term76092, term76092.getClass(), "charaLockSlot", term76165);
        setLongField(term76092, term76092.getClass(), "contentBit", -1749621039048991870L);
        setIntField(term76092, term76092.getClass(), "playCount", -1295670091);
        setField(term76092, term76092.getClass(), "eventWatchedDate", "OYJvKAMFEk");
        setField(term76092, term76092.getClass(), "lastGameId", "puNAveVBkA");
        setField(term76092, term76092.getClass(), "lastRomVersion", "BcZKUIbuQL");
        setField(term76092, term76092.getClass(), "lastDataVersion", "YvjPnZyRnw");
        setField(term76092, term76092.getClass(), "lastLoginDate", "IKmMfqFPku");
        setField(term76092, term76092.getClass(), "lastPlayDate", "NACnGDmVPl");
        setIntField(term76092, term76092.getClass(), "lastPlayCredit", -567427801);
        setIntField(term76092, term76092.getClass(), "lastPlayMode", -2126712285);
        setIntField(term76092, term76092.getClass(), "lastPlaceId", 194145706);
        setField(term76092, term76092.getClass(), "lastPlaceName", "SfWiFjkLGW");
        setIntField(term76092, term76092.getClass(), "lastAllNetId", -1882347774);
        setIntField(term76092, term76092.getClass(), "lastRegionId", 814595421);
        setField(term76092, term76092.getClass(), "lastRegionName", "urBahuOkUQ");
        setField(term76092, term76092.getClass(), "lastClientId", "zHcZrTMdOT");
        setField(term76092, term76092.getClass(), "lastCountryCode", "zIAIXHeKXt");
        setIntField(term76092, term76092.getClass(), "lastSelectEMoney", -760041618);
        setIntField(term76092, term76092.getClass(), "lastSelectTicket", -666603825);
        setIntField(term76092, term76092.getClass(), "lastSelectCourse", -2041846076);
        setIntField(term76092, term76092.getClass(), "lastCountCourse", 591994062);
        setField(term76092, term76092.getClass(), "firstGameId", "fVkSkOqFEO");
        setField(term76092, term76092.getClass(), "firstRomVersion", "DLfgyAqDDu");
        setField(term76092, term76092.getClass(), "firstDataVersion", "ryuQaXtwNj");
        setField(term76092, term76092.getClass(), "firstPlayDate", "OutjKNDSgR");
        setField(term76092, term76092.getClass(), "compatibleCmVersion", "brfLLGXcwA");
        setField(term76092, term76092.getClass(), "dailyBonusDate", "zoVKwYYMOI");
        setField(term76092, term76092.getClass(), "dailyCourseBonusDate", "DGCeQsmIOU");
        setField(term76092, term76092.getClass(), "lastPairLoginDate", "otcpSHwkzG");
        setField(term76092, term76092.getClass(), "lastTrialPlayDate", "BixZhUjVme");
        setIntField(term76092, term76092.getClass(), "playVsCount", -47102164);
        setIntField(term76092, term76092.getClass(), "playSyncCount", 1202324559);
        setIntField(term76092, term76092.getClass(), "winCount", -1203173430);
        setIntField(term76092, term76092.getClass(), "helpCount", -643310730);
        setIntField(term76092, term76092.getClass(), "comboCount", 79925667);
        setLongField(term76092, term76092.getClass(), "totalDeluxscore", 4849764353789057222L);
        setLongField(term76092, term76092.getClass(), "totalBasicDeluxscore", -5669163500655780876L);
        setLongField(term76092, term76092.getClass(), "totalAdvancedDeluxscore", -9197280619599317547L);
        setLongField(term76092, term76092.getClass(), "totalExpertDeluxscore", 2958081309532830349L);
        setLongField(term76092, term76092.getClass(), "totalMasterDeluxscore", -1656614758988755309L);
        setLongField(term76092, term76092.getClass(), "totalReMasterDeluxscore", -6648383051825562915L);
        setIntField(term76092, term76092.getClass(), "totalSync", -299467052);
        setIntField(term76092, term76092.getClass(), "totalBasicSync", -1138748496);
        setIntField(term76092, term76092.getClass(), "totalAdvancedSync", -1047250669);
        setIntField(term76092, term76092.getClass(), "totalExpertSync", -749602624);
        setIntField(term76092, term76092.getClass(), "totalMasterSync", -2057374049);
        setIntField(term76092, term76092.getClass(), "totalReMasterSync", -912972263);
        setLongField(term76092, term76092.getClass(), "totalAchievement", -4486155849590836885L);
        setLongField(term76092, term76092.getClass(), "totalBasicAchievement", -6012687164779285598L);
        setLongField(term76092, term76092.getClass(), "totalAdvancedAchievement", 2233851663671602704L);
        setLongField(term76092, term76092.getClass(), "totalExpertAchievement", 6887740911666145680L);
        setLongField(term76092, term76092.getClass(), "totalMasterAchievement", -4871907458438465560L);
        setLongField(term76092, term76092.getClass(), "totalReMasterAchievement", 7748272685716656724L);
        setLongField(term76092, term76092.getClass(), "playerOldRating", -304168856452232538L);
        setLongField(term76092, term76092.getClass(), "playerNewRating", -6655020803769744426L);
        setIntField(term76092, term76092.getClass(), "banState", -340318694);
        setLongField(term76092, term76092.getClass(), "dateTime", -6267313683795118791L);
        setField(term76090, term76090.getClass(), "user", term76092);
        setIntField(term76090, term76090.getClass(), "courseId", 53069810);
        setBooleanField(term76090, term76090.getClass(), "isLastClear", false);
        setIntField(term76090, term76090.getClass(), "totalRestlife", 399386520);
        setIntField(term76090, term76090.getClass(), "totalAchievement", 1509169467);
        setIntField(term76090, term76090.getClass(), "totalDeluxscore", 1228296174);
        setIntField(term76090, term76090.getClass(), "playCount", 1070536276);
        setField(term76090, term76090.getClass(), "clearDate", "BmnUezUoWz");
        setField(term76090, term76090.getClass(), "lastPlayDate", "QqeCgeRpIS");
        setIntField(term76090, term76090.getClass(), "bestAchievement", -474907994);
        setField(term76090, term76090.getClass(), "bestAchievementDate", "xVwossmLda");
        setIntField(term76090, term76090.getClass(), "bestDeluxscore", 785315487);
        setField(term76090, term76090.getClass(), "bestDeluxscoreDate", "EvSQeALexj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term76090, args);
    }

};


