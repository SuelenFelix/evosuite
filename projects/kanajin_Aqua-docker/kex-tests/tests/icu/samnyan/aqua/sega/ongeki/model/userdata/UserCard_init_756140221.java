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
import java.lang.Integer;

public class UserCard_init_756140221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111282;
     Object term111545;
     Object term111547;

    public UserCard_init_756140221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111286 = new Long(3108750145697087661L);
        term111282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term111284 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111305 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111315 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111282, term111282.getClass(), "id", -7223089829633275696L);
        setLongField(term111284, term111284.getClass(), "id", 3836862422152000358L);
        setField(term111284, term111284.getClass(), "extId", term111286);
        setField(term111284, term111284.getClass(), "luid", "mjXKuwKUyR");
        setIntField(term111301, term111301.getClass(), "year", 2016);
        setShortField(term111301, term111301.getClass(), "month", (short) 12);
        setShortField(term111301, term111301.getClass(), "day", (short) 20);
        setField(term111300, term111300.getClass(), "date", term111301);
        setByteField(term111305, term111305.getClass(), "hour", (byte) 20);
        setByteField(term111305, term111305.getClass(), "minute", (byte) 42);
        setByteField(term111305, term111305.getClass(), "second", (byte) 4);
        setIntField(term111305, term111305.getClass(), "nano", 499637837);
        setField(term111300, term111300.getClass(), "time", term111305);
        setField(term111284, term111284.getClass(), "registerTime", term111300);
        setIntField(term111311, term111311.getClass(), "year", 2017);
        setShortField(term111311, term111311.getClass(), "month", (short) 1);
        setShortField(term111311, term111311.getClass(), "day", (short) 2);
        setField(term111310, term111310.getClass(), "date", term111311);
        setByteField(term111315, term111315.getClass(), "hour", (byte) 17);
        setByteField(term111315, term111315.getClass(), "minute", (byte) 7);
        setByteField(term111315, term111315.getClass(), "second", (byte) 40);
        setIntField(term111315, term111315.getClass(), "nano", 688544705);
        setField(term111310, term111310.getClass(), "time", term111315);
        setField(term111284, term111284.getClass(), "accessTime", term111310);
        setField(term111282, term111282.getClass(), "card", term111284);
        setField(term111282, term111282.getClass(), "userName", "UfdjcAQclb");
        setIntField(term111282, term111282.getClass(), "level", -614078903);
        setIntField(term111282, term111282.getClass(), "reincarnationNum", 250967452);
        setLongField(term111282, term111282.getClass(), "exp", 2979885618631780227L);
        setLongField(term111282, term111282.getClass(), "point", -1040543263100611755L);
        setLongField(term111282, term111282.getClass(), "totalPoint", 4584995128924595032L);
        setIntField(term111282, term111282.getClass(), "playCount", -67856100);
        setIntField(term111282, term111282.getClass(), "jewelCount", -1760300151);
        setIntField(term111282, term111282.getClass(), "totalJewelCount", 635198715);
        setIntField(term111282, term111282.getClass(), "medalCount", -619729133);
        setIntField(term111282, term111282.getClass(), "playerRating", -91784171);
        setIntField(term111282, term111282.getClass(), "highestRating", -1752710731);
        setIntField(term111282, term111282.getClass(), "battlePoint", -1991397007);
        setIntField(term111282, term111282.getClass(), "bestBattlePoint", -1896800756);
        setIntField(term111282, term111282.getClass(), "overDamageBattlePoint", -855121939);
        setBooleanField(term111282, term111282.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term111282, term111282.getClass(), "nameplateId", 389647062);
        setIntField(term111282, term111282.getClass(), "trophyId", 59254717);
        setIntField(term111282, term111282.getClass(), "cardId", -1753562901);
        setIntField(term111282, term111282.getClass(), "characterId", 1942866138);
        setIntField(term111282, term111282.getClass(), "characterVoiceNo", -628548003);
        setIntField(term111282, term111282.getClass(), "tabSetting", -1600050434);
        setIntField(term111282, term111282.getClass(), "tabSortSetting", 2068225629);
        setIntField(term111282, term111282.getClass(), "cardCategorySetting", 230619154);
        setIntField(term111282, term111282.getClass(), "cardSortSetting", 939877540);
        setIntField(term111282, term111282.getClass(), "rivalScoreCategorySetting", -1177910195);
        setIntField(term111282, term111282.getClass(), "playedTutorialBit", 2096168037);
        setIntField(term111282, term111282.getClass(), "firstTutorialCancelNum", -681093302);
        setLongField(term111282, term111282.getClass(), "sumTechHighScore", 2759983640207349010L);
        setLongField(term111282, term111282.getClass(), "sumTechBasicHighScore", -6684114917577827963L);
        setLongField(term111282, term111282.getClass(), "sumTechAdvancedHighScore", -1358301831846391496L);
        setLongField(term111282, term111282.getClass(), "sumTechExpertHighScore", -131539669468315137L);
        setLongField(term111282, term111282.getClass(), "sumTechMasterHighScore", -637593741819001106L);
        setLongField(term111282, term111282.getClass(), "sumTechLunaticHighScore", -1906352440411933411L);
        setLongField(term111282, term111282.getClass(), "sumBattleHighScore", 7752941586314695716L);
        setLongField(term111282, term111282.getClass(), "sumBattleBasicHighScore", 8737756539779917691L);
        setLongField(term111282, term111282.getClass(), "sumBattleAdvancedHighScore", -5720726444677059044L);
        setLongField(term111282, term111282.getClass(), "sumBattleExpertHighScore", -2182608618488086496L);
        setLongField(term111282, term111282.getClass(), "sumBattleMasterHighScore", 5292581895392992812L);
        setLongField(term111282, term111282.getClass(), "sumBattleLunaticHighScore", 4681829811089190115L);
        setField(term111282, term111282.getClass(), "eventWatchedDate", "skKLlFIRTI");
        setField(term111282, term111282.getClass(), "cmEventWatchedDate", "SfjOvqPCwx");
        setField(term111282, term111282.getClass(), "firstGameId", "rinBVtrpcr");
        setField(term111282, term111282.getClass(), "firstRomVersion", "KjCvQWfqew");
        setField(term111282, term111282.getClass(), "firstDataVersion", "WewLrXvLmC");
        setField(term111282, term111282.getClass(), "firstPlayDate", "vbEYtFntxd");
        setField(term111282, term111282.getClass(), "lastGameId", "ZiYiKyRQTQ");
        setField(term111282, term111282.getClass(), "lastRomVersion", "aaACqoZRFl");
        setField(term111282, term111282.getClass(), "lastDataVersion", "CtIecpnHzx");
        setField(term111282, term111282.getClass(), "compatibleCmVersion", "lgGoogCJeG");
        setField(term111282, term111282.getClass(), "lastPlayDate", "EyskfGpFOR");
        setIntField(term111282, term111282.getClass(), "lastPlaceId", 1008385565);
        setField(term111282, term111282.getClass(), "lastPlaceName", "eEKpyfnNFi");
        setIntField(term111282, term111282.getClass(), "lastRegionId", -1408656420);
        setField(term111282, term111282.getClass(), "lastRegionName", "WjMAISAxtn");
        setIntField(term111282, term111282.getClass(), "lastAllNetId", 1356166325);
        setField(term111282, term111282.getClass(), "lastClientId", "GiDsfCiYsm");
        setIntField(term111282, term111282.getClass(), "lastUsedDeckId", 36575353);
        setIntField(term111282, term111282.getClass(), "lastPlayMusicLevel", 1173070286);
        setIntField(term111282, term111282.getClass(), "lastEmoneyBrand", -373348260);
        term111545 = new Integer(-476546497);
        term111547 = new Integer(1196854753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term111282;
        args[1] = term111545;
        args[2] = term111547;
        args[3] = "RuvnkQFdLv";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


