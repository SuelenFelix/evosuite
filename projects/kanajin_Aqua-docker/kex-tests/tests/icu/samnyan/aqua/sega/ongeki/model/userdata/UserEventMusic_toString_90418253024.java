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

public class UserEventMusic_toString_90418253024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380383;

    public UserEventMusic_toString_90418253024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term380389 = new Long(4911393165710268247L);
        term380383 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term380385 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term380387 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term380403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term380413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380418 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term380383, term380383.getClass(), "id", -8750345253467667665L);
        setLongField(term380385, term380385.getClass(), "id", -2636969618991658275L);
        setLongField(term380387, term380387.getClass(), "id", 8050394733339296874L);
        setField(term380387, term380387.getClass(), "extId", term380389);
        setField(term380387, term380387.getClass(), "luid", "RZkxUvEJPU");
        setIntField(term380404, term380404.getClass(), "year", 2029);
        setShortField(term380404, term380404.getClass(), "month", (short) 2);
        setShortField(term380404, term380404.getClass(), "day", (short) 26);
        setField(term380403, term380403.getClass(), "date", term380404);
        setByteField(term380408, term380408.getClass(), "hour", (byte) 14);
        setByteField(term380408, term380408.getClass(), "minute", (byte) 14);
        setByteField(term380408, term380408.getClass(), "second", (byte) 21);
        setIntField(term380408, term380408.getClass(), "nano", 88227166);
        setField(term380403, term380403.getClass(), "time", term380408);
        setField(term380387, term380387.getClass(), "registerTime", term380403);
        setIntField(term380414, term380414.getClass(), "year", 2023);
        setShortField(term380414, term380414.getClass(), "month", (short) 1);
        setShortField(term380414, term380414.getClass(), "day", (short) 24);
        setField(term380413, term380413.getClass(), "date", term380414);
        setByteField(term380418, term380418.getClass(), "hour", (byte) 9);
        setByteField(term380418, term380418.getClass(), "minute", (byte) 16);
        setByteField(term380418, term380418.getClass(), "second", (byte) 14);
        setIntField(term380418, term380418.getClass(), "nano", 590816672);
        setField(term380413, term380413.getClass(), "time", term380418);
        setField(term380387, term380387.getClass(), "accessTime", term380413);
        setField(term380385, term380385.getClass(), "card", term380387);
        setField(term380385, term380385.getClass(), "userName", "XjjToJVNct");
        setIntField(term380385, term380385.getClass(), "level", 299801134);
        setIntField(term380385, term380385.getClass(), "reincarnationNum", -287528111);
        setLongField(term380385, term380385.getClass(), "exp", -7058183270036037891L);
        setLongField(term380385, term380385.getClass(), "point", 4588048866935130184L);
        setLongField(term380385, term380385.getClass(), "totalPoint", 904382329376979746L);
        setIntField(term380385, term380385.getClass(), "playCount", 1395973014);
        setIntField(term380385, term380385.getClass(), "jewelCount", 1211575855);
        setIntField(term380385, term380385.getClass(), "totalJewelCount", -1195228796);
        setIntField(term380385, term380385.getClass(), "medalCount", 1055493234);
        setIntField(term380385, term380385.getClass(), "playerRating", 1235709618);
        setIntField(term380385, term380385.getClass(), "highestRating", -644432598);
        setIntField(term380385, term380385.getClass(), "battlePoint", 1033591647);
        setIntField(term380385, term380385.getClass(), "bestBattlePoint", 878370666);
        setIntField(term380385, term380385.getClass(), "overDamageBattlePoint", 1473691724);
        setBooleanField(term380385, term380385.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term380385, term380385.getClass(), "nameplateId", 1807164936);
        setIntField(term380385, term380385.getClass(), "trophyId", -680730364);
        setIntField(term380385, term380385.getClass(), "cardId", -1879643284);
        setIntField(term380385, term380385.getClass(), "characterId", 110707984);
        setIntField(term380385, term380385.getClass(), "characterVoiceNo", -1716058112);
        setIntField(term380385, term380385.getClass(), "tabSetting", -1673995251);
        setIntField(term380385, term380385.getClass(), "tabSortSetting", -1963680505);
        setIntField(term380385, term380385.getClass(), "cardCategorySetting", -1466011976);
        setIntField(term380385, term380385.getClass(), "cardSortSetting", -938045734);
        setIntField(term380385, term380385.getClass(), "rivalScoreCategorySetting", -801394836);
        setIntField(term380385, term380385.getClass(), "playedTutorialBit", -1635568416);
        setIntField(term380385, term380385.getClass(), "firstTutorialCancelNum", 1545193133);
        setLongField(term380385, term380385.getClass(), "sumTechHighScore", 5833224820213882642L);
        setLongField(term380385, term380385.getClass(), "sumTechBasicHighScore", 4410166293602167630L);
        setLongField(term380385, term380385.getClass(), "sumTechAdvancedHighScore", 7784716710841584067L);
        setLongField(term380385, term380385.getClass(), "sumTechExpertHighScore", -6330970338649658593L);
        setLongField(term380385, term380385.getClass(), "sumTechMasterHighScore", -6678890781376451857L);
        setLongField(term380385, term380385.getClass(), "sumTechLunaticHighScore", 532745624339716947L);
        setLongField(term380385, term380385.getClass(), "sumBattleHighScore", 4093182316068544992L);
        setLongField(term380385, term380385.getClass(), "sumBattleBasicHighScore", -6558597247477363825L);
        setLongField(term380385, term380385.getClass(), "sumBattleAdvancedHighScore", -616226529743506431L);
        setLongField(term380385, term380385.getClass(), "sumBattleExpertHighScore", -7740935865573745573L);
        setLongField(term380385, term380385.getClass(), "sumBattleMasterHighScore", 7463790388819273855L);
        setLongField(term380385, term380385.getClass(), "sumBattleLunaticHighScore", 854208999833648497L);
        setField(term380385, term380385.getClass(), "eventWatchedDate", "ePuvOLHPAK");
        setField(term380385, term380385.getClass(), "cmEventWatchedDate", "KIdvMWgZnq");
        setField(term380385, term380385.getClass(), "firstGameId", "bTvIVpaCAE");
        setField(term380385, term380385.getClass(), "firstRomVersion", "BYpnMgjxlu");
        setField(term380385, term380385.getClass(), "firstDataVersion", "gKfOkZqrMd");
        setField(term380385, term380385.getClass(), "firstPlayDate", "DImkJyxGWZ");
        setField(term380385, term380385.getClass(), "lastGameId", "bKBkrLKYMu");
        setField(term380385, term380385.getClass(), "lastRomVersion", "VlUvXnMgqc");
        setField(term380385, term380385.getClass(), "lastDataVersion", "NRPHYXTCBM");
        setField(term380385, term380385.getClass(), "compatibleCmVersion", "PdVjteDxhm");
        setField(term380385, term380385.getClass(), "lastPlayDate", "jHVCXECbOs");
        setIntField(term380385, term380385.getClass(), "lastPlaceId", 1538335426);
        setField(term380385, term380385.getClass(), "lastPlaceName", "nEhDjFYvXB");
        setIntField(term380385, term380385.getClass(), "lastRegionId", -1851495249);
        setField(term380385, term380385.getClass(), "lastRegionName", "DgWKryqKJD");
        setIntField(term380385, term380385.getClass(), "lastAllNetId", -795759199);
        setField(term380385, term380385.getClass(), "lastClientId", "wqWIipIhFm");
        setIntField(term380385, term380385.getClass(), "lastUsedDeckId", 1983024884);
        setIntField(term380385, term380385.getClass(), "lastPlayMusicLevel", -855522978);
        setIntField(term380385, term380385.getClass(), "lastEmoneyBrand", -349783676);
        setField(term380383, term380383.getClass(), "user", term380385);
        setIntField(term380383, term380383.getClass(), "eventId", -1110307535);
        setIntField(term380383, term380383.getClass(), "type", -1252913848);
        setIntField(term380383, term380383.getClass(), "musicId", -399813598);
        setIntField(term380383, term380383.getClass(), "level", 42404224);
        setIntField(term380383, term380383.getClass(), "techScoreMax", -1610345179);
        setIntField(term380383, term380383.getClass(), "platinumScoreMax", 1281942658);
        setField(term380383, term380383.getClass(), "techRecordDate", "FcfoqdQMbR");
        setBooleanField(term380383, term380383.getClass(), "isTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term380383, args);
    }

};


