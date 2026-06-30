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

public class UserMusicItem_setId_3395049615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132;
     Object term2399;

    public UserMusicItem_setId_3395049615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2138 = new Long(7411271909051562686L);
        term2132 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term2134 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term2136 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2157 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2167 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2132, term2132.getClass(), "id", 846579494941632714L);
        setLongField(term2134, term2134.getClass(), "id", 6689117472719450333L);
        setLongField(term2136, term2136.getClass(), "id", 5836128569274066678L);
        setField(term2136, term2136.getClass(), "extId", term2138);
        setField(term2136, term2136.getClass(), "luid", "idgaQsnJpQ");
        setIntField(term2153, term2153.getClass(), "year", 2019);
        setShortField(term2153, term2153.getClass(), "month", (short) 2);
        setShortField(term2153, term2153.getClass(), "day", (short) 21);
        setField(term2152, term2152.getClass(), "date", term2153);
        setByteField(term2157, term2157.getClass(), "hour", (byte) 5);
        setByteField(term2157, term2157.getClass(), "minute", (byte) 41);
        setByteField(term2157, term2157.getClass(), "second", (byte) 11);
        setIntField(term2157, term2157.getClass(), "nano", 859829782);
        setField(term2152, term2152.getClass(), "time", term2157);
        setField(term2136, term2136.getClass(), "registerTime", term2152);
        setIntField(term2163, term2163.getClass(), "year", 2018);
        setShortField(term2163, term2163.getClass(), "month", (short) 9);
        setShortField(term2163, term2163.getClass(), "day", (short) 28);
        setField(term2162, term2162.getClass(), "date", term2163);
        setByteField(term2167, term2167.getClass(), "hour", (byte) 3);
        setByteField(term2167, term2167.getClass(), "minute", (byte) 37);
        setByteField(term2167, term2167.getClass(), "second", (byte) 46);
        setIntField(term2167, term2167.getClass(), "nano", 763326845);
        setField(term2162, term2162.getClass(), "time", term2167);
        setField(term2136, term2136.getClass(), "accessTime", term2162);
        setField(term2134, term2134.getClass(), "card", term2136);
        setField(term2134, term2134.getClass(), "userName", "VgZnGoIFwQ");
        setIntField(term2134, term2134.getClass(), "level", -1498296052);
        setIntField(term2134, term2134.getClass(), "reincarnationNum", 2098647989);
        setLongField(term2134, term2134.getClass(), "exp", -2177368829816872572L);
        setLongField(term2134, term2134.getClass(), "point", -8463029266761149071L);
        setLongField(term2134, term2134.getClass(), "totalPoint", 3133860696238261492L);
        setIntField(term2134, term2134.getClass(), "playCount", 1598895173);
        setIntField(term2134, term2134.getClass(), "jewelCount", 1830648570);
        setIntField(term2134, term2134.getClass(), "totalJewelCount", -227365013);
        setIntField(term2134, term2134.getClass(), "medalCount", 11724947);
        setIntField(term2134, term2134.getClass(), "playerRating", 1953277050);
        setIntField(term2134, term2134.getClass(), "highestRating", 1283079251);
        setIntField(term2134, term2134.getClass(), "battlePoint", -523949691);
        setIntField(term2134, term2134.getClass(), "bestBattlePoint", 1398204340);
        setIntField(term2134, term2134.getClass(), "overDamageBattlePoint", 229204365);
        setBooleanField(term2134, term2134.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term2134, term2134.getClass(), "nameplateId", -461771056);
        setIntField(term2134, term2134.getClass(), "trophyId", -243422082);
        setIntField(term2134, term2134.getClass(), "cardId", 1384592638);
        setIntField(term2134, term2134.getClass(), "characterId", -1002370457);
        setIntField(term2134, term2134.getClass(), "characterVoiceNo", -2014576105);
        setIntField(term2134, term2134.getClass(), "tabSetting", 1296895584);
        setIntField(term2134, term2134.getClass(), "tabSortSetting", 628918458);
        setIntField(term2134, term2134.getClass(), "cardCategorySetting", -1274456137);
        setIntField(term2134, term2134.getClass(), "cardSortSetting", 1041916673);
        setIntField(term2134, term2134.getClass(), "rivalScoreCategorySetting", -601863069);
        setIntField(term2134, term2134.getClass(), "playedTutorialBit", 663292551);
        setIntField(term2134, term2134.getClass(), "firstTutorialCancelNum", -1885090354);
        setLongField(term2134, term2134.getClass(), "sumTechHighScore", 7247160664318067468L);
        setLongField(term2134, term2134.getClass(), "sumTechBasicHighScore", 2135754395358000892L);
        setLongField(term2134, term2134.getClass(), "sumTechAdvancedHighScore", -8085190702504231560L);
        setLongField(term2134, term2134.getClass(), "sumTechExpertHighScore", 1672578078364590450L);
        setLongField(term2134, term2134.getClass(), "sumTechMasterHighScore", 4949335493504695457L);
        setLongField(term2134, term2134.getClass(), "sumTechLunaticHighScore", -5216789073301458893L);
        setLongField(term2134, term2134.getClass(), "sumBattleHighScore", -1832940336320585644L);
        setLongField(term2134, term2134.getClass(), "sumBattleBasicHighScore", -8033714905181142681L);
        setLongField(term2134, term2134.getClass(), "sumBattleAdvancedHighScore", -9040825890007374809L);
        setLongField(term2134, term2134.getClass(), "sumBattleExpertHighScore", 1368340889161782793L);
        setLongField(term2134, term2134.getClass(), "sumBattleMasterHighScore", -5786861555969446503L);
        setLongField(term2134, term2134.getClass(), "sumBattleLunaticHighScore", 2354625302846375590L);
        setField(term2134, term2134.getClass(), "eventWatchedDate", "jUbSRrkrYZ");
        setField(term2134, term2134.getClass(), "cmEventWatchedDate", "bWWfajKbEX");
        setField(term2134, term2134.getClass(), "firstGameId", "cAPeiZHKGJ");
        setField(term2134, term2134.getClass(), "firstRomVersion", "LvJFtLBaxj");
        setField(term2134, term2134.getClass(), "firstDataVersion", "PHvxnGHptP");
        setField(term2134, term2134.getClass(), "firstPlayDate", "TimdotUuNC");
        setField(term2134, term2134.getClass(), "lastGameId", "PkWMRdJcBb");
        setField(term2134, term2134.getClass(), "lastRomVersion", "jSpAteRute");
        setField(term2134, term2134.getClass(), "lastDataVersion", "swZVeJAxjt");
        setField(term2134, term2134.getClass(), "compatibleCmVersion", "xOcJIiQQDu");
        setField(term2134, term2134.getClass(), "lastPlayDate", "GVizqqzXpy");
        setIntField(term2134, term2134.getClass(), "lastPlaceId", -2066804303);
        setField(term2134, term2134.getClass(), "lastPlaceName", "JqXGgAhZPl");
        setIntField(term2134, term2134.getClass(), "lastRegionId", -1731761810);
        setField(term2134, term2134.getClass(), "lastRegionName", "jiKYgYHqIS");
        setIntField(term2134, term2134.getClass(), "lastAllNetId", 197109649);
        setField(term2134, term2134.getClass(), "lastClientId", "DfISiziTgG");
        setIntField(term2134, term2134.getClass(), "lastUsedDeckId", -1239406390);
        setIntField(term2134, term2134.getClass(), "lastPlayMusicLevel", 1557431527);
        setIntField(term2134, term2134.getClass(), "lastEmoneyBrand", -1504890659);
        setField(term2132, term2132.getClass(), "user", term2134);
        setIntField(term2132, term2132.getClass(), "musicId", 1358829571);
        setIntField(term2132, term2132.getClass(), "status", 991356662);
        term2399 = new Long(7276637106827860087L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2399;
        callMethod(klass, "setId", argTypes, term2132, args);
    }

};


