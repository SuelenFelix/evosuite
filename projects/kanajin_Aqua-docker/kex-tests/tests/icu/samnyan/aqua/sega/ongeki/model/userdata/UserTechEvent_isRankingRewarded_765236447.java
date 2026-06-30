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

public class UserTechEvent_isRankingRewarded_765236447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354282;

    public UserTechEvent_isRankingRewarded_765236447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term354288 = new Long(-8848853088235282046L);
        term354282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term354284 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term354286 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term354302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term354303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term354307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term354312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term354313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term354317 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term354282, term354282.getClass(), "id", -7157801438670071773L);
        setLongField(term354284, term354284.getClass(), "id", 7494282579310488638L);
        setLongField(term354286, term354286.getClass(), "id", -2814525421292850308L);
        setField(term354286, term354286.getClass(), "extId", term354288);
        setField(term354286, term354286.getClass(), "luid", "VxdyIqIBkP");
        setIntField(term354303, term354303.getClass(), "year", 2022);
        setShortField(term354303, term354303.getClass(), "month", (short) 10);
        setShortField(term354303, term354303.getClass(), "day", (short) 14);
        setField(term354302, term354302.getClass(), "date", term354303);
        setByteField(term354307, term354307.getClass(), "hour", (byte) 23);
        setByteField(term354307, term354307.getClass(), "minute", (byte) 2);
        setByteField(term354307, term354307.getClass(), "second", (byte) 20);
        setIntField(term354307, term354307.getClass(), "nano", 37251985);
        setField(term354302, term354302.getClass(), "time", term354307);
        setField(term354286, term354286.getClass(), "registerTime", term354302);
        setIntField(term354313, term354313.getClass(), "year", 2027);
        setShortField(term354313, term354313.getClass(), "month", (short) 1);
        setShortField(term354313, term354313.getClass(), "day", (short) 9);
        setField(term354312, term354312.getClass(), "date", term354313);
        setByteField(term354317, term354317.getClass(), "hour", (byte) 15);
        setByteField(term354317, term354317.getClass(), "minute", (byte) 18);
        setByteField(term354317, term354317.getClass(), "second", (byte) 24);
        setIntField(term354317, term354317.getClass(), "nano", 493834528);
        setField(term354312, term354312.getClass(), "time", term354317);
        setField(term354286, term354286.getClass(), "accessTime", term354312);
        setField(term354284, term354284.getClass(), "card", term354286);
        setField(term354284, term354284.getClass(), "userName", "SLtBWvJhki");
        setIntField(term354284, term354284.getClass(), "level", -1828546613);
        setIntField(term354284, term354284.getClass(), "reincarnationNum", 504996191);
        setLongField(term354284, term354284.getClass(), "exp", 7094915728695545240L);
        setLongField(term354284, term354284.getClass(), "point", -5677694798832892675L);
        setLongField(term354284, term354284.getClass(), "totalPoint", 1822871833419597759L);
        setIntField(term354284, term354284.getClass(), "playCount", 1703207922);
        setIntField(term354284, term354284.getClass(), "jewelCount", 256783421);
        setIntField(term354284, term354284.getClass(), "totalJewelCount", 704150609);
        setIntField(term354284, term354284.getClass(), "medalCount", 70614388);
        setIntField(term354284, term354284.getClass(), "playerRating", -882660209);
        setIntField(term354284, term354284.getClass(), "highestRating", 1188968497);
        setIntField(term354284, term354284.getClass(), "battlePoint", -2082244283);
        setIntField(term354284, term354284.getClass(), "bestBattlePoint", 822711451);
        setIntField(term354284, term354284.getClass(), "overDamageBattlePoint", 1734713430);
        setBooleanField(term354284, term354284.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term354284, term354284.getClass(), "nameplateId", 567547655);
        setIntField(term354284, term354284.getClass(), "trophyId", -785228496);
        setIntField(term354284, term354284.getClass(), "cardId", 1631388659);
        setIntField(term354284, term354284.getClass(), "characterId", -1632350638);
        setIntField(term354284, term354284.getClass(), "characterVoiceNo", 911576601);
        setIntField(term354284, term354284.getClass(), "tabSetting", -714548283);
        setIntField(term354284, term354284.getClass(), "tabSortSetting", -575442660);
        setIntField(term354284, term354284.getClass(), "cardCategorySetting", -1613305240);
        setIntField(term354284, term354284.getClass(), "cardSortSetting", 1017723551);
        setIntField(term354284, term354284.getClass(), "rivalScoreCategorySetting", -1602515386);
        setIntField(term354284, term354284.getClass(), "playedTutorialBit", 608373956);
        setIntField(term354284, term354284.getClass(), "firstTutorialCancelNum", 1995595343);
        setLongField(term354284, term354284.getClass(), "sumTechHighScore", 7041624554846529278L);
        setLongField(term354284, term354284.getClass(), "sumTechBasicHighScore", 4514674591550497963L);
        setLongField(term354284, term354284.getClass(), "sumTechAdvancedHighScore", -1147466494553629241L);
        setLongField(term354284, term354284.getClass(), "sumTechExpertHighScore", 9078403129002766222L);
        setLongField(term354284, term354284.getClass(), "sumTechMasterHighScore", 7347307177889439794L);
        setLongField(term354284, term354284.getClass(), "sumTechLunaticHighScore", -4492669303632500717L);
        setLongField(term354284, term354284.getClass(), "sumBattleHighScore", 7107507696423585423L);
        setLongField(term354284, term354284.getClass(), "sumBattleBasicHighScore", 5499319601852081638L);
        setLongField(term354284, term354284.getClass(), "sumBattleAdvancedHighScore", -8277876377567984697L);
        setLongField(term354284, term354284.getClass(), "sumBattleExpertHighScore", 2617638670318743672L);
        setLongField(term354284, term354284.getClass(), "sumBattleMasterHighScore", -5417421175204590397L);
        setLongField(term354284, term354284.getClass(), "sumBattleLunaticHighScore", 5773536922034228995L);
        setField(term354284, term354284.getClass(), "eventWatchedDate", "LHRCkiQwKL");
        setField(term354284, term354284.getClass(), "cmEventWatchedDate", "PEslZNesSz");
        setField(term354284, term354284.getClass(), "firstGameId", "yfWQhAajGa");
        setField(term354284, term354284.getClass(), "firstRomVersion", "AhgmeLabaO");
        setField(term354284, term354284.getClass(), "firstDataVersion", "LsdyjdaZPl");
        setField(term354284, term354284.getClass(), "firstPlayDate", "OvtazzMoOB");
        setField(term354284, term354284.getClass(), "lastGameId", "UQagJqLknt");
        setField(term354284, term354284.getClass(), "lastRomVersion", "TUJPAiqmrH");
        setField(term354284, term354284.getClass(), "lastDataVersion", "SlRGZNhCbH");
        setField(term354284, term354284.getClass(), "compatibleCmVersion", "pncjKTyHQa");
        setField(term354284, term354284.getClass(), "lastPlayDate", "WuvsUclvsK");
        setIntField(term354284, term354284.getClass(), "lastPlaceId", 1702326373);
        setField(term354284, term354284.getClass(), "lastPlaceName", "UHmYOnRAUD");
        setIntField(term354284, term354284.getClass(), "lastRegionId", -1891559898);
        setField(term354284, term354284.getClass(), "lastRegionName", "AmkNhqlVkZ");
        setIntField(term354284, term354284.getClass(), "lastAllNetId", -466638206);
        setField(term354284, term354284.getClass(), "lastClientId", "CfUTOrZnvJ");
        setIntField(term354284, term354284.getClass(), "lastUsedDeckId", -183834912);
        setIntField(term354284, term354284.getClass(), "lastPlayMusicLevel", -1229633602);
        setIntField(term354284, term354284.getClass(), "lastEmoneyBrand", 2130724335);
        setField(term354282, term354282.getClass(), "user", term354284);
        setIntField(term354282, term354282.getClass(), "eventId", 345965026);
        setIntField(term354282, term354282.getClass(), "totalTechScore", 141279631);
        setIntField(term354282, term354282.getClass(), "totalPlatinumScore", 1130239672);
        setField(term354282, term354282.getClass(), "techRecordDate", "aFIhhyVWCe");
        setBooleanField(term354282, term354282.getClass(), "isRankingRewarded", false);
        setBooleanField(term354282, term354282.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRankingRewarded", argTypes, term354282, args);
    }

};


