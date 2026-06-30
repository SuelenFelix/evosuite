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

public class UserMusicDetail_equals_46294585437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420504;
     Object term420785;

    public UserMusicDetail_equals_46294585437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term420510 = new Long(-6096027338784768449L);
        term420504 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term420506 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term420508 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term420524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term420534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420539 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term420504, term420504.getClass(), "id", 8055932001955448240L);
        setLongField(term420506, term420506.getClass(), "id", 2064898994589676548L);
        setLongField(term420508, term420508.getClass(), "id", -7873825361879650376L);
        setField(term420508, term420508.getClass(), "extId", term420510);
        setField(term420508, term420508.getClass(), "luid", "PTnUzSvDBP");
        setIntField(term420525, term420525.getClass(), "year", 2016);
        setShortField(term420525, term420525.getClass(), "month", (short) 5);
        setShortField(term420525, term420525.getClass(), "day", (short) 6);
        setField(term420524, term420524.getClass(), "date", term420525);
        setByteField(term420529, term420529.getClass(), "hour", (byte) 11);
        setByteField(term420529, term420529.getClass(), "minute", (byte) 4);
        setByteField(term420529, term420529.getClass(), "second", (byte) 34);
        setIntField(term420529, term420529.getClass(), "nano", 282282258);
        setField(term420524, term420524.getClass(), "time", term420529);
        setField(term420508, term420508.getClass(), "registerTime", term420524);
        setIntField(term420535, term420535.getClass(), "year", 2012);
        setShortField(term420535, term420535.getClass(), "month", (short) 5);
        setShortField(term420535, term420535.getClass(), "day", (short) 30);
        setField(term420534, term420534.getClass(), "date", term420535);
        setByteField(term420539, term420539.getClass(), "hour", (byte) 10);
        setByteField(term420539, term420539.getClass(), "minute", (byte) 28);
        setByteField(term420539, term420539.getClass(), "second", (byte) 24);
        setIntField(term420539, term420539.getClass(), "nano", 279576746);
        setField(term420534, term420534.getClass(), "time", term420539);
        setField(term420508, term420508.getClass(), "accessTime", term420534);
        setField(term420506, term420506.getClass(), "card", term420508);
        setField(term420506, term420506.getClass(), "userName", "aXIMplnoMO");
        setIntField(term420506, term420506.getClass(), "level", -436058601);
        setIntField(term420506, term420506.getClass(), "reincarnationNum", -88465528);
        setLongField(term420506, term420506.getClass(), "exp", -7570099699052676245L);
        setLongField(term420506, term420506.getClass(), "point", 7083096690532637067L);
        setLongField(term420506, term420506.getClass(), "totalPoint", 7646127499114756546L);
        setIntField(term420506, term420506.getClass(), "playCount", -192888942);
        setIntField(term420506, term420506.getClass(), "jewelCount", 527142152);
        setIntField(term420506, term420506.getClass(), "totalJewelCount", -113928847);
        setIntField(term420506, term420506.getClass(), "medalCount", -1944174781);
        setIntField(term420506, term420506.getClass(), "playerRating", 1492910201);
        setIntField(term420506, term420506.getClass(), "highestRating", 461332708);
        setIntField(term420506, term420506.getClass(), "battlePoint", -1940451207);
        setIntField(term420506, term420506.getClass(), "bestBattlePoint", -1094614944);
        setIntField(term420506, term420506.getClass(), "overDamageBattlePoint", -1386011357);
        setBooleanField(term420506, term420506.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term420506, term420506.getClass(), "nameplateId", 2091423467);
        setIntField(term420506, term420506.getClass(), "trophyId", 247763514);
        setIntField(term420506, term420506.getClass(), "cardId", 1350190949);
        setIntField(term420506, term420506.getClass(), "characterId", -1342242251);
        setIntField(term420506, term420506.getClass(), "characterVoiceNo", 2082021306);
        setIntField(term420506, term420506.getClass(), "tabSetting", -1508690540);
        setIntField(term420506, term420506.getClass(), "tabSortSetting", -2143555254);
        setIntField(term420506, term420506.getClass(), "cardCategorySetting", 2088229494);
        setIntField(term420506, term420506.getClass(), "cardSortSetting", -378451635);
        setIntField(term420506, term420506.getClass(), "rivalScoreCategorySetting", -46024914);
        setIntField(term420506, term420506.getClass(), "playedTutorialBit", 1870381148);
        setIntField(term420506, term420506.getClass(), "firstTutorialCancelNum", -892136470);
        setLongField(term420506, term420506.getClass(), "sumTechHighScore", 8921296074912107735L);
        setLongField(term420506, term420506.getClass(), "sumTechBasicHighScore", -2279006761469496429L);
        setLongField(term420506, term420506.getClass(), "sumTechAdvancedHighScore", -98214495137156696L);
        setLongField(term420506, term420506.getClass(), "sumTechExpertHighScore", -4749796964307108935L);
        setLongField(term420506, term420506.getClass(), "sumTechMasterHighScore", 3779666897589907431L);
        setLongField(term420506, term420506.getClass(), "sumTechLunaticHighScore", 6774005486725945998L);
        setLongField(term420506, term420506.getClass(), "sumBattleHighScore", 5994571620554351907L);
        setLongField(term420506, term420506.getClass(), "sumBattleBasicHighScore", -1019589086711971000L);
        setLongField(term420506, term420506.getClass(), "sumBattleAdvancedHighScore", -9209805423098416493L);
        setLongField(term420506, term420506.getClass(), "sumBattleExpertHighScore", -7933271144025637984L);
        setLongField(term420506, term420506.getClass(), "sumBattleMasterHighScore", 3690542535599826779L);
        setLongField(term420506, term420506.getClass(), "sumBattleLunaticHighScore", -8276160793799992908L);
        setField(term420506, term420506.getClass(), "eventWatchedDate", "FeMnhHRUAi");
        setField(term420506, term420506.getClass(), "cmEventWatchedDate", "MjRTZovBhK");
        setField(term420506, term420506.getClass(), "firstGameId", "amLNjVlUSQ");
        setField(term420506, term420506.getClass(), "firstRomVersion", "mnvUeZltmf");
        setField(term420506, term420506.getClass(), "firstDataVersion", "gnSldDVyYY");
        setField(term420506, term420506.getClass(), "firstPlayDate", "pwqtcbNTXK");
        setField(term420506, term420506.getClass(), "lastGameId", "xdBoIIkQay");
        setField(term420506, term420506.getClass(), "lastRomVersion", "MogycwvJEn");
        setField(term420506, term420506.getClass(), "lastDataVersion", "GqBAlUEbYq");
        setField(term420506, term420506.getClass(), "compatibleCmVersion", "SwAqUdIZYL");
        setField(term420506, term420506.getClass(), "lastPlayDate", "QEPWPNXdAj");
        setIntField(term420506, term420506.getClass(), "lastPlaceId", 870699133);
        setField(term420506, term420506.getClass(), "lastPlaceName", "UKVjewPDMr");
        setIntField(term420506, term420506.getClass(), "lastRegionId", -77954389);
        setField(term420506, term420506.getClass(), "lastRegionName", "JFMxDFoKmQ");
        setIntField(term420506, term420506.getClass(), "lastAllNetId", -1057148061);
        setField(term420506, term420506.getClass(), "lastClientId", "PvXxQpyZAw");
        setIntField(term420506, term420506.getClass(), "lastUsedDeckId", -1343313377);
        setIntField(term420506, term420506.getClass(), "lastPlayMusicLevel", -2064185655);
        setIntField(term420506, term420506.getClass(), "lastEmoneyBrand", 2014109467);
        setField(term420504, term420504.getClass(), "user", term420506);
        setIntField(term420504, term420504.getClass(), "musicId", -1360385273);
        setIntField(term420504, term420504.getClass(), "level", -409931323);
        setIntField(term420504, term420504.getClass(), "playCount", 390991960);
        setIntField(term420504, term420504.getClass(), "techScoreMax", -1589121357);
        setIntField(term420504, term420504.getClass(), "techScoreRank", 1635615087);
        setIntField(term420504, term420504.getClass(), "battleScoreMax", 41451908);
        setIntField(term420504, term420504.getClass(), "battleScoreRank", -1709081026);
        setIntField(term420504, term420504.getClass(), "maxComboCount", -564562495);
        setIntField(term420504, term420504.getClass(), "maxOverKill", 1254946858);
        setIntField(term420504, term420504.getClass(), "maxTeamOverKill", -314485750);
        setBooleanField(term420504, term420504.getClass(), "isFullBell", false);
        setBooleanField(term420504, term420504.getClass(), "isFullCombo", true);
        setBooleanField(term420504, term420504.getClass(), "isAllBreake", true);
        setBooleanField(term420504, term420504.getClass(), "isLock", true);
        setIntField(term420504, term420504.getClass(), "clearStatus", 1070778622);
        setBooleanField(term420504, term420504.getClass(), "isStoryWatched", true);
        term420785 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term420785;
        callMethod(klass, "equals", argTypes, term420504, args);
    }

};


