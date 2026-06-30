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

public class UserStory_getLastChapterId_9022558274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159350;

    public UserStory_getLastChapterId_9022558274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159356 = new Long(-8398381579707958144L);
        term159350 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term159352 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term159354 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159385 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159350, term159350.getClass(), "id", -8139745683966925044L);
        setLongField(term159352, term159352.getClass(), "id", -70290858846123640L);
        setLongField(term159354, term159354.getClass(), "id", 5694128139482897319L);
        setField(term159354, term159354.getClass(), "extId", term159356);
        setField(term159354, term159354.getClass(), "luid", "ibhIEMBJkC");
        setIntField(term159371, term159371.getClass(), "year", 2028);
        setShortField(term159371, term159371.getClass(), "month", (short) 10);
        setShortField(term159371, term159371.getClass(), "day", (short) 5);
        setField(term159370, term159370.getClass(), "date", term159371);
        setByteField(term159375, term159375.getClass(), "hour", (byte) 0);
        setByteField(term159375, term159375.getClass(), "minute", (byte) 53);
        setByteField(term159375, term159375.getClass(), "second", (byte) 18);
        setIntField(term159375, term159375.getClass(), "nano", 567999687);
        setField(term159370, term159370.getClass(), "time", term159375);
        setField(term159354, term159354.getClass(), "registerTime", term159370);
        setIntField(term159381, term159381.getClass(), "year", 2029);
        setShortField(term159381, term159381.getClass(), "month", (short) 7);
        setShortField(term159381, term159381.getClass(), "day", (short) 30);
        setField(term159380, term159380.getClass(), "date", term159381);
        setByteField(term159385, term159385.getClass(), "hour", (byte) 23);
        setByteField(term159385, term159385.getClass(), "minute", (byte) 35);
        setByteField(term159385, term159385.getClass(), "second", (byte) 35);
        setIntField(term159385, term159385.getClass(), "nano", 848673909);
        setField(term159380, term159380.getClass(), "time", term159385);
        setField(term159354, term159354.getClass(), "accessTime", term159380);
        setField(term159352, term159352.getClass(), "card", term159354);
        setField(term159352, term159352.getClass(), "userName", "ozYBIBVPBo");
        setIntField(term159352, term159352.getClass(), "level", 1084454865);
        setIntField(term159352, term159352.getClass(), "reincarnationNum", -1444485060);
        setLongField(term159352, term159352.getClass(), "exp", -7695239710538668939L);
        setLongField(term159352, term159352.getClass(), "point", 3015313255108144976L);
        setLongField(term159352, term159352.getClass(), "totalPoint", -6445201902102343423L);
        setIntField(term159352, term159352.getClass(), "playCount", -1355001013);
        setIntField(term159352, term159352.getClass(), "jewelCount", -1335912879);
        setIntField(term159352, term159352.getClass(), "totalJewelCount", 1371866185);
        setIntField(term159352, term159352.getClass(), "medalCount", 1556888444);
        setIntField(term159352, term159352.getClass(), "playerRating", 1393504869);
        setIntField(term159352, term159352.getClass(), "highestRating", 728799986);
        setIntField(term159352, term159352.getClass(), "battlePoint", -444430231);
        setIntField(term159352, term159352.getClass(), "bestBattlePoint", -623445473);
        setIntField(term159352, term159352.getClass(), "overDamageBattlePoint", 565663783);
        setBooleanField(term159352, term159352.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term159352, term159352.getClass(), "nameplateId", -971589912);
        setIntField(term159352, term159352.getClass(), "trophyId", 1025926099);
        setIntField(term159352, term159352.getClass(), "cardId", 961710200);
        setIntField(term159352, term159352.getClass(), "characterId", -698630156);
        setIntField(term159352, term159352.getClass(), "characterVoiceNo", 160752273);
        setIntField(term159352, term159352.getClass(), "tabSetting", -1555752602);
        setIntField(term159352, term159352.getClass(), "tabSortSetting", -1803417927);
        setIntField(term159352, term159352.getClass(), "cardCategorySetting", 1174691081);
        setIntField(term159352, term159352.getClass(), "cardSortSetting", -1554467908);
        setIntField(term159352, term159352.getClass(), "rivalScoreCategorySetting", 809458440);
        setIntField(term159352, term159352.getClass(), "playedTutorialBit", 1648454496);
        setIntField(term159352, term159352.getClass(), "firstTutorialCancelNum", 1189516772);
        setLongField(term159352, term159352.getClass(), "sumTechHighScore", 1454316596500911577L);
        setLongField(term159352, term159352.getClass(), "sumTechBasicHighScore", -2111542580361798016L);
        setLongField(term159352, term159352.getClass(), "sumTechAdvancedHighScore", 2057875774041820508L);
        setLongField(term159352, term159352.getClass(), "sumTechExpertHighScore", 1156903350966631617L);
        setLongField(term159352, term159352.getClass(), "sumTechMasterHighScore", -8354491077748222406L);
        setLongField(term159352, term159352.getClass(), "sumTechLunaticHighScore", -6434345679586157129L);
        setLongField(term159352, term159352.getClass(), "sumBattleHighScore", 3290723342049781600L);
        setLongField(term159352, term159352.getClass(), "sumBattleBasicHighScore", -6390767292089348773L);
        setLongField(term159352, term159352.getClass(), "sumBattleAdvancedHighScore", -4378898106281221428L);
        setLongField(term159352, term159352.getClass(), "sumBattleExpertHighScore", -5745667405526113327L);
        setLongField(term159352, term159352.getClass(), "sumBattleMasterHighScore", 4527529084032110159L);
        setLongField(term159352, term159352.getClass(), "sumBattleLunaticHighScore", -475536693979007543L);
        setField(term159352, term159352.getClass(), "eventWatchedDate", "biviUUSgfC");
        setField(term159352, term159352.getClass(), "cmEventWatchedDate", "aooyFRcKhG");
        setField(term159352, term159352.getClass(), "firstGameId", "XKnXDRejrp");
        setField(term159352, term159352.getClass(), "firstRomVersion", "KXuRaoGXpO");
        setField(term159352, term159352.getClass(), "firstDataVersion", "dvVcvTQRwf");
        setField(term159352, term159352.getClass(), "firstPlayDate", "MmpIaMLtIl");
        setField(term159352, term159352.getClass(), "lastGameId", "NdxOgIeywq");
        setField(term159352, term159352.getClass(), "lastRomVersion", "CVVuyKTkfU");
        setField(term159352, term159352.getClass(), "lastDataVersion", "kVJJpdqrcb");
        setField(term159352, term159352.getClass(), "compatibleCmVersion", "lrxpxFLOlO");
        setField(term159352, term159352.getClass(), "lastPlayDate", "TlaWwdzyFj");
        setIntField(term159352, term159352.getClass(), "lastPlaceId", 261537591);
        setField(term159352, term159352.getClass(), "lastPlaceName", "JFwtRLPoHH");
        setIntField(term159352, term159352.getClass(), "lastRegionId", 988974502);
        setField(term159352, term159352.getClass(), "lastRegionName", "PkFqFUDNRB");
        setIntField(term159352, term159352.getClass(), "lastAllNetId", 796479728);
        setField(term159352, term159352.getClass(), "lastClientId", "JTaFYFigKc");
        setIntField(term159352, term159352.getClass(), "lastUsedDeckId", 527667682);
        setIntField(term159352, term159352.getClass(), "lastPlayMusicLevel", -2024603739);
        setIntField(term159352, term159352.getClass(), "lastEmoneyBrand", -501282440);
        setField(term159350, term159350.getClass(), "user", term159352);
        setIntField(term159350, term159350.getClass(), "storyId", 890596068);
        setIntField(term159350, term159350.getClass(), "lastChapterId", -917816022);
        setIntField(term159350, term159350.getClass(), "jewelCount", 629691796);
        setIntField(term159350, term159350.getClass(), "lastPlayMusicId", -977560951);
        setIntField(term159350, term159350.getClass(), "lastPlayMusicCategory", 934860256);
        setIntField(term159350, term159350.getClass(), "lastPlayMusicLevel", 956376778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastChapterId", argTypes, term159350, args);
    }

};


