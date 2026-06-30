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

public class UserMusicDetail_getPlayCount_4475543475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405935;

    public UserMusicDetail_getPlayCount_4475543475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term405941 = new Long(-2792969772767139843L);
        term405935 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term405937 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term405939 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term405955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term405965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term405966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term405970 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term405935, term405935.getClass(), "id", -5868502002860539084L);
        setLongField(term405937, term405937.getClass(), "id", 7207360941494127108L);
        setLongField(term405939, term405939.getClass(), "id", -5144130457931959162L);
        setField(term405939, term405939.getClass(), "extId", term405941);
        setField(term405939, term405939.getClass(), "luid", "YCirJnDDCI");
        setIntField(term405956, term405956.getClass(), "year", 2012);
        setShortField(term405956, term405956.getClass(), "month", (short) 7);
        setShortField(term405956, term405956.getClass(), "day", (short) 25);
        setField(term405955, term405955.getClass(), "date", term405956);
        setByteField(term405960, term405960.getClass(), "hour", (byte) 10);
        setByteField(term405960, term405960.getClass(), "minute", (byte) 47);
        setByteField(term405960, term405960.getClass(), "second", (byte) 40);
        setIntField(term405960, term405960.getClass(), "nano", 235079109);
        setField(term405955, term405955.getClass(), "time", term405960);
        setField(term405939, term405939.getClass(), "registerTime", term405955);
        setIntField(term405966, term405966.getClass(), "year", 2014);
        setShortField(term405966, term405966.getClass(), "month", (short) 5);
        setShortField(term405966, term405966.getClass(), "day", (short) 7);
        setField(term405965, term405965.getClass(), "date", term405966);
        setByteField(term405970, term405970.getClass(), "hour", (byte) 3);
        setByteField(term405970, term405970.getClass(), "minute", (byte) 29);
        setByteField(term405970, term405970.getClass(), "second", (byte) 53);
        setIntField(term405970, term405970.getClass(), "nano", 601925853);
        setField(term405965, term405965.getClass(), "time", term405970);
        setField(term405939, term405939.getClass(), "accessTime", term405965);
        setField(term405937, term405937.getClass(), "card", term405939);
        setField(term405937, term405937.getClass(), "userName", "BXDNpxnAhJ");
        setIntField(term405937, term405937.getClass(), "level", 2000354632);
        setIntField(term405937, term405937.getClass(), "reincarnationNum", -1783366653);
        setLongField(term405937, term405937.getClass(), "exp", -1169804476297780862L);
        setLongField(term405937, term405937.getClass(), "point", 331808579972926160L);
        setLongField(term405937, term405937.getClass(), "totalPoint", -1227200230278255275L);
        setIntField(term405937, term405937.getClass(), "playCount", 562675433);
        setIntField(term405937, term405937.getClass(), "jewelCount", 2095256776);
        setIntField(term405937, term405937.getClass(), "totalJewelCount", -2059716825);
        setIntField(term405937, term405937.getClass(), "medalCount", -407591550);
        setIntField(term405937, term405937.getClass(), "playerRating", 2030349728);
        setIntField(term405937, term405937.getClass(), "highestRating", -2020530648);
        setIntField(term405937, term405937.getClass(), "battlePoint", -987763008);
        setIntField(term405937, term405937.getClass(), "bestBattlePoint", 558686292);
        setIntField(term405937, term405937.getClass(), "overDamageBattlePoint", 1845275575);
        setBooleanField(term405937, term405937.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term405937, term405937.getClass(), "nameplateId", -1742017555);
        setIntField(term405937, term405937.getClass(), "trophyId", -714299461);
        setIntField(term405937, term405937.getClass(), "cardId", -1322151883);
        setIntField(term405937, term405937.getClass(), "characterId", 504547480);
        setIntField(term405937, term405937.getClass(), "characterVoiceNo", 1982634659);
        setIntField(term405937, term405937.getClass(), "tabSetting", -1174248500);
        setIntField(term405937, term405937.getClass(), "tabSortSetting", 1644388137);
        setIntField(term405937, term405937.getClass(), "cardCategorySetting", 241514188);
        setIntField(term405937, term405937.getClass(), "cardSortSetting", 1667080657);
        setIntField(term405937, term405937.getClass(), "rivalScoreCategorySetting", -2006142939);
        setIntField(term405937, term405937.getClass(), "playedTutorialBit", -266096668);
        setIntField(term405937, term405937.getClass(), "firstTutorialCancelNum", 1966102669);
        setLongField(term405937, term405937.getClass(), "sumTechHighScore", -2271649408838336402L);
        setLongField(term405937, term405937.getClass(), "sumTechBasicHighScore", 1478570841635730121L);
        setLongField(term405937, term405937.getClass(), "sumTechAdvancedHighScore", 1341096111951622964L);
        setLongField(term405937, term405937.getClass(), "sumTechExpertHighScore", -2312069257754675718L);
        setLongField(term405937, term405937.getClass(), "sumTechMasterHighScore", -3050613874514953293L);
        setLongField(term405937, term405937.getClass(), "sumTechLunaticHighScore", -6514613926623974211L);
        setLongField(term405937, term405937.getClass(), "sumBattleHighScore", 2183188154740503738L);
        setLongField(term405937, term405937.getClass(), "sumBattleBasicHighScore", -451607477374993472L);
        setLongField(term405937, term405937.getClass(), "sumBattleAdvancedHighScore", 2840755355585115935L);
        setLongField(term405937, term405937.getClass(), "sumBattleExpertHighScore", -5716496558005575185L);
        setLongField(term405937, term405937.getClass(), "sumBattleMasterHighScore", 3876149023053286847L);
        setLongField(term405937, term405937.getClass(), "sumBattleLunaticHighScore", -5733112360762657255L);
        setField(term405937, term405937.getClass(), "eventWatchedDate", "cmBUAJmlTo");
        setField(term405937, term405937.getClass(), "cmEventWatchedDate", "tROiTrmvcb");
        setField(term405937, term405937.getClass(), "firstGameId", "apkHVPCfAF");
        setField(term405937, term405937.getClass(), "firstRomVersion", "cbsfQBtIOh");
        setField(term405937, term405937.getClass(), "firstDataVersion", "QAfBLVWMSv");
        setField(term405937, term405937.getClass(), "firstPlayDate", "WmdHnrJChR");
        setField(term405937, term405937.getClass(), "lastGameId", "RvQGbuebfi");
        setField(term405937, term405937.getClass(), "lastRomVersion", "wSwusOhIzM");
        setField(term405937, term405937.getClass(), "lastDataVersion", "UWcMPdJvnE");
        setField(term405937, term405937.getClass(), "compatibleCmVersion", "CrSbsVMLfW");
        setField(term405937, term405937.getClass(), "lastPlayDate", "zFUJYSyuid");
        setIntField(term405937, term405937.getClass(), "lastPlaceId", 387972849);
        setField(term405937, term405937.getClass(), "lastPlaceName", "zzSVwQQvPd");
        setIntField(term405937, term405937.getClass(), "lastRegionId", -1393715669);
        setField(term405937, term405937.getClass(), "lastRegionName", "SoZBIPkAcd");
        setIntField(term405937, term405937.getClass(), "lastAllNetId", 670814827);
        setField(term405937, term405937.getClass(), "lastClientId", "iNTCxAwhfj");
        setIntField(term405937, term405937.getClass(), "lastUsedDeckId", -694451815);
        setIntField(term405937, term405937.getClass(), "lastPlayMusicLevel", -13419333);
        setIntField(term405937, term405937.getClass(), "lastEmoneyBrand", -108305557);
        setField(term405935, term405935.getClass(), "user", term405937);
        setIntField(term405935, term405935.getClass(), "musicId", -1653580038);
        setIntField(term405935, term405935.getClass(), "level", 1185907272);
        setIntField(term405935, term405935.getClass(), "playCount", 1695654569);
        setIntField(term405935, term405935.getClass(), "techScoreMax", -1927381809);
        setIntField(term405935, term405935.getClass(), "techScoreRank", 1148508968);
        setIntField(term405935, term405935.getClass(), "battleScoreMax", 2076332000);
        setIntField(term405935, term405935.getClass(), "battleScoreRank", 74602679);
        setIntField(term405935, term405935.getClass(), "maxComboCount", -980635380);
        setIntField(term405935, term405935.getClass(), "maxOverKill", 2068974920);
        setIntField(term405935, term405935.getClass(), "maxTeamOverKill", -175874520);
        setBooleanField(term405935, term405935.getClass(), "isFullBell", false);
        setBooleanField(term405935, term405935.getClass(), "isFullCombo", false);
        setBooleanField(term405935, term405935.getClass(), "isAllBreake", true);
        setBooleanField(term405935, term405935.getClass(), "isLock", false);
        setIntField(term405935, term405935.getClass(), "clearStatus", -1763474581);
        setBooleanField(term405935, term405935.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term405935, args);
    }

};


