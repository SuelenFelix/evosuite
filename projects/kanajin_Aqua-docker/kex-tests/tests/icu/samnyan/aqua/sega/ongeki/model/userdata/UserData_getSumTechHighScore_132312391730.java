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

public class UserData_getSumTechHighScore_132312391730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34608;

    public UserData_getSumTechHighScore_132312391730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34612 = new Long(50358265865610362L);
        term34608 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term34610 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term34626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34631 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34641 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term34608, term34608.getClass(), "id", 7099191052876902273L);
        setLongField(term34610, term34610.getClass(), "id", 4098126979899957789L);
        setField(term34610, term34610.getClass(), "extId", term34612);
        setField(term34610, term34610.getClass(), "luid", "iVIrSxTsaM");
        setIntField(term34627, term34627.getClass(), "year", 2026);
        setShortField(term34627, term34627.getClass(), "month", (short) 2);
        setShortField(term34627, term34627.getClass(), "day", (short) 5);
        setField(term34626, term34626.getClass(), "date", term34627);
        setByteField(term34631, term34631.getClass(), "hour", (byte) 1);
        setByteField(term34631, term34631.getClass(), "minute", (byte) 38);
        setByteField(term34631, term34631.getClass(), "second", (byte) 15);
        setIntField(term34631, term34631.getClass(), "nano", 167345230);
        setField(term34626, term34626.getClass(), "time", term34631);
        setField(term34610, term34610.getClass(), "registerTime", term34626);
        setIntField(term34637, term34637.getClass(), "year", 2029);
        setShortField(term34637, term34637.getClass(), "month", (short) 6);
        setShortField(term34637, term34637.getClass(), "day", (short) 4);
        setField(term34636, term34636.getClass(), "date", term34637);
        setByteField(term34641, term34641.getClass(), "hour", (byte) 22);
        setByteField(term34641, term34641.getClass(), "minute", (byte) 1);
        setByteField(term34641, term34641.getClass(), "second", (byte) 38);
        setIntField(term34641, term34641.getClass(), "nano", 329228491);
        setField(term34636, term34636.getClass(), "time", term34641);
        setField(term34610, term34610.getClass(), "accessTime", term34636);
        setField(term34608, term34608.getClass(), "card", term34610);
        setField(term34608, term34608.getClass(), "userName", "FmJNEfmYgq");
        setIntField(term34608, term34608.getClass(), "level", -953072528);
        setIntField(term34608, term34608.getClass(), "reincarnationNum", 2011046892);
        setLongField(term34608, term34608.getClass(), "exp", 1429711781003863063L);
        setLongField(term34608, term34608.getClass(), "point", -1033267581061931547L);
        setLongField(term34608, term34608.getClass(), "totalPoint", 8918321414047974185L);
        setIntField(term34608, term34608.getClass(), "playCount", 466007219);
        setIntField(term34608, term34608.getClass(), "jewelCount", -2142979104);
        setIntField(term34608, term34608.getClass(), "totalJewelCount", -1983330479);
        setIntField(term34608, term34608.getClass(), "medalCount", 1929952462);
        setIntField(term34608, term34608.getClass(), "playerRating", 701114540);
        setIntField(term34608, term34608.getClass(), "highestRating", -1284079635);
        setIntField(term34608, term34608.getClass(), "battlePoint", -2130090775);
        setIntField(term34608, term34608.getClass(), "bestBattlePoint", -1455026066);
        setIntField(term34608, term34608.getClass(), "overDamageBattlePoint", -169160528);
        setBooleanField(term34608, term34608.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term34608, term34608.getClass(), "nameplateId", 951748736);
        setIntField(term34608, term34608.getClass(), "trophyId", 787260842);
        setIntField(term34608, term34608.getClass(), "cardId", -137516512);
        setIntField(term34608, term34608.getClass(), "characterId", -585134115);
        setIntField(term34608, term34608.getClass(), "characterVoiceNo", 1435872700);
        setIntField(term34608, term34608.getClass(), "tabSetting", 1421496660);
        setIntField(term34608, term34608.getClass(), "tabSortSetting", -1299897376);
        setIntField(term34608, term34608.getClass(), "cardCategorySetting", 1829266361);
        setIntField(term34608, term34608.getClass(), "cardSortSetting", -1296335739);
        setIntField(term34608, term34608.getClass(), "rivalScoreCategorySetting", -520737857);
        setIntField(term34608, term34608.getClass(), "playedTutorialBit", -2038325814);
        setIntField(term34608, term34608.getClass(), "firstTutorialCancelNum", -581928806);
        setLongField(term34608, term34608.getClass(), "sumTechHighScore", -142778328872192310L);
        setLongField(term34608, term34608.getClass(), "sumTechBasicHighScore", -7173990301200265783L);
        setLongField(term34608, term34608.getClass(), "sumTechAdvancedHighScore", -5523700551819095387L);
        setLongField(term34608, term34608.getClass(), "sumTechExpertHighScore", -8614603287624597112L);
        setLongField(term34608, term34608.getClass(), "sumTechMasterHighScore", -334717540353714793L);
        setLongField(term34608, term34608.getClass(), "sumTechLunaticHighScore", -57359230242997736L);
        setLongField(term34608, term34608.getClass(), "sumBattleHighScore", -7779928833373989299L);
        setLongField(term34608, term34608.getClass(), "sumBattleBasicHighScore", 2105697925603985714L);
        setLongField(term34608, term34608.getClass(), "sumBattleAdvancedHighScore", -589167249491619196L);
        setLongField(term34608, term34608.getClass(), "sumBattleExpertHighScore", 5990686118620195001L);
        setLongField(term34608, term34608.getClass(), "sumBattleMasterHighScore", 268218069036722127L);
        setLongField(term34608, term34608.getClass(), "sumBattleLunaticHighScore", -3992663397060695265L);
        setField(term34608, term34608.getClass(), "eventWatchedDate", "NqQofgWsJd");
        setField(term34608, term34608.getClass(), "cmEventWatchedDate", "ZlVRdHsBMO");
        setField(term34608, term34608.getClass(), "firstGameId", "UMMXkhuqzw");
        setField(term34608, term34608.getClass(), "firstRomVersion", "KyGXZcXJwq");
        setField(term34608, term34608.getClass(), "firstDataVersion", "TqiCjeuoWE");
        setField(term34608, term34608.getClass(), "firstPlayDate", "GWWfkXOYLP");
        setField(term34608, term34608.getClass(), "lastGameId", "qvykDllgpT");
        setField(term34608, term34608.getClass(), "lastRomVersion", "hzdUbcLZhZ");
        setField(term34608, term34608.getClass(), "lastDataVersion", "GlxnEJvYeC");
        setField(term34608, term34608.getClass(), "compatibleCmVersion", "SLdOGaqmNv");
        setField(term34608, term34608.getClass(), "lastPlayDate", "QZfhwDBzyR");
        setIntField(term34608, term34608.getClass(), "lastPlaceId", -1387086578);
        setField(term34608, term34608.getClass(), "lastPlaceName", "HvnMmAOZev");
        setIntField(term34608, term34608.getClass(), "lastRegionId", -2098841130);
        setField(term34608, term34608.getClass(), "lastRegionName", "JTPAQsfRtT");
        setIntField(term34608, term34608.getClass(), "lastAllNetId", 65321166);
        setField(term34608, term34608.getClass(), "lastClientId", "otxkkKfDfl");
        setIntField(term34608, term34608.getClass(), "lastUsedDeckId", -2114805689);
        setIntField(term34608, term34608.getClass(), "lastPlayMusicLevel", 400772784);
        setIntField(term34608, term34608.getClass(), "lastEmoneyBrand", 46781158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechHighScore", argTypes, term34608, args);
    }

};


