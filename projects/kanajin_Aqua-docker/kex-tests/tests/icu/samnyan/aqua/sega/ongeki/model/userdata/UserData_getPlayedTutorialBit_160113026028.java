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

public class UserData_getPlayedTutorialBit_160113026028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33762;

    public UserData_getPlayedTutorialBit_160113026028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33766 = new Long(9013624480170062917L);
        term33762 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term33764 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33785 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33795 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33762, term33762.getClass(), "id", 789661870469773196L);
        setLongField(term33764, term33764.getClass(), "id", -3484599398786804700L);
        setField(term33764, term33764.getClass(), "extId", term33766);
        setField(term33764, term33764.getClass(), "luid", "oTGxFdiaIW");
        setIntField(term33781, term33781.getClass(), "year", 2023);
        setShortField(term33781, term33781.getClass(), "month", (short) 7);
        setShortField(term33781, term33781.getClass(), "day", (short) 27);
        setField(term33780, term33780.getClass(), "date", term33781);
        setByteField(term33785, term33785.getClass(), "hour", (byte) 4);
        setByteField(term33785, term33785.getClass(), "minute", (byte) 25);
        setByteField(term33785, term33785.getClass(), "second", (byte) 46);
        setIntField(term33785, term33785.getClass(), "nano", 646465452);
        setField(term33780, term33780.getClass(), "time", term33785);
        setField(term33764, term33764.getClass(), "registerTime", term33780);
        setIntField(term33791, term33791.getClass(), "year", 2022);
        setShortField(term33791, term33791.getClass(), "month", (short) 11);
        setShortField(term33791, term33791.getClass(), "day", (short) 2);
        setField(term33790, term33790.getClass(), "date", term33791);
        setByteField(term33795, term33795.getClass(), "hour", (byte) 4);
        setByteField(term33795, term33795.getClass(), "minute", (byte) 14);
        setByteField(term33795, term33795.getClass(), "second", (byte) 5);
        setIntField(term33795, term33795.getClass(), "nano", 604465127);
        setField(term33790, term33790.getClass(), "time", term33795);
        setField(term33764, term33764.getClass(), "accessTime", term33790);
        setField(term33762, term33762.getClass(), "card", term33764);
        setField(term33762, term33762.getClass(), "userName", "jlyFvaZlmv");
        setIntField(term33762, term33762.getClass(), "level", 1876812694);
        setIntField(term33762, term33762.getClass(), "reincarnationNum", 461068473);
        setLongField(term33762, term33762.getClass(), "exp", -5259338558309636239L);
        setLongField(term33762, term33762.getClass(), "point", -94386090490716219L);
        setLongField(term33762, term33762.getClass(), "totalPoint", -5539140353886034290L);
        setIntField(term33762, term33762.getClass(), "playCount", -1833298266);
        setIntField(term33762, term33762.getClass(), "jewelCount", 746372422);
        setIntField(term33762, term33762.getClass(), "totalJewelCount", 1921465988);
        setIntField(term33762, term33762.getClass(), "medalCount", -164438599);
        setIntField(term33762, term33762.getClass(), "playerRating", -444441955);
        setIntField(term33762, term33762.getClass(), "highestRating", -544005591);
        setIntField(term33762, term33762.getClass(), "battlePoint", -1379603462);
        setIntField(term33762, term33762.getClass(), "bestBattlePoint", -1304965721);
        setIntField(term33762, term33762.getClass(), "overDamageBattlePoint", 1661411651);
        setBooleanField(term33762, term33762.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term33762, term33762.getClass(), "nameplateId", 175517901);
        setIntField(term33762, term33762.getClass(), "trophyId", 335030203);
        setIntField(term33762, term33762.getClass(), "cardId", -474014477);
        setIntField(term33762, term33762.getClass(), "characterId", 1610419467);
        setIntField(term33762, term33762.getClass(), "characterVoiceNo", 1155135931);
        setIntField(term33762, term33762.getClass(), "tabSetting", -636910567);
        setIntField(term33762, term33762.getClass(), "tabSortSetting", 1896114203);
        setIntField(term33762, term33762.getClass(), "cardCategorySetting", 1045745470);
        setIntField(term33762, term33762.getClass(), "cardSortSetting", 892741901);
        setIntField(term33762, term33762.getClass(), "rivalScoreCategorySetting", -1724900201);
        setIntField(term33762, term33762.getClass(), "playedTutorialBit", -758523003);
        setIntField(term33762, term33762.getClass(), "firstTutorialCancelNum", 1567184195);
        setLongField(term33762, term33762.getClass(), "sumTechHighScore", -2993798135603613656L);
        setLongField(term33762, term33762.getClass(), "sumTechBasicHighScore", 7643902889687500887L);
        setLongField(term33762, term33762.getClass(), "sumTechAdvancedHighScore", 5801400276670793406L);
        setLongField(term33762, term33762.getClass(), "sumTechExpertHighScore", 750257143483156761L);
        setLongField(term33762, term33762.getClass(), "sumTechMasterHighScore", -1357354750773482244L);
        setLongField(term33762, term33762.getClass(), "sumTechLunaticHighScore", -1493241070032348830L);
        setLongField(term33762, term33762.getClass(), "sumBattleHighScore", -2261267969370273698L);
        setLongField(term33762, term33762.getClass(), "sumBattleBasicHighScore", -6265268170103538784L);
        setLongField(term33762, term33762.getClass(), "sumBattleAdvancedHighScore", -6478060368064484690L);
        setLongField(term33762, term33762.getClass(), "sumBattleExpertHighScore", 2358294751965878279L);
        setLongField(term33762, term33762.getClass(), "sumBattleMasterHighScore", 8600922426578985605L);
        setLongField(term33762, term33762.getClass(), "sumBattleLunaticHighScore", -3701629604936783176L);
        setField(term33762, term33762.getClass(), "eventWatchedDate", "sofyLEfomV");
        setField(term33762, term33762.getClass(), "cmEventWatchedDate", "zHcDSJHKAb");
        setField(term33762, term33762.getClass(), "firstGameId", "WRIQkTdeMl");
        setField(term33762, term33762.getClass(), "firstRomVersion", "rLSEheWsHd");
        setField(term33762, term33762.getClass(), "firstDataVersion", "DoUKDhlGCY");
        setField(term33762, term33762.getClass(), "firstPlayDate", "IeoToWsQWU");
        setField(term33762, term33762.getClass(), "lastGameId", "QxiiHtQAzN");
        setField(term33762, term33762.getClass(), "lastRomVersion", "gQgTBlRIvX");
        setField(term33762, term33762.getClass(), "lastDataVersion", "ulKaKnANzj");
        setField(term33762, term33762.getClass(), "compatibleCmVersion", "ABwhdjjeJi");
        setField(term33762, term33762.getClass(), "lastPlayDate", "KKEcpYXNZV");
        setIntField(term33762, term33762.getClass(), "lastPlaceId", 63595623);
        setField(term33762, term33762.getClass(), "lastPlaceName", "shLHFznysy");
        setIntField(term33762, term33762.getClass(), "lastRegionId", 1764150991);
        setField(term33762, term33762.getClass(), "lastRegionName", "YCKIloBHLj");
        setIntField(term33762, term33762.getClass(), "lastAllNetId", 944653455);
        setField(term33762, term33762.getClass(), "lastClientId", "qUWDhAeFJY");
        setIntField(term33762, term33762.getClass(), "lastUsedDeckId", -1819474400);
        setIntField(term33762, term33762.getClass(), "lastPlayMusicLevel", 783684648);
        setIntField(term33762, term33762.getClass(), "lastEmoneyBrand", 553754005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term33762, args);
    }

};


