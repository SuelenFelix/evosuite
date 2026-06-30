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

public class UserStory_getUser_18462562592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158488;

    public UserStory_getUser_18462562592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158494 = new Long(-2136893352275781569L);
        term158488 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term158490 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term158492 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158523 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158488, term158488.getClass(), "id", -26107593653918206L);
        setLongField(term158490, term158490.getClass(), "id", -882029722229355739L);
        setLongField(term158492, term158492.getClass(), "id", -764143069790997305L);
        setField(term158492, term158492.getClass(), "extId", term158494);
        setField(term158492, term158492.getClass(), "luid", "LjyAsUkMpT");
        setIntField(term158509, term158509.getClass(), "year", 2026);
        setShortField(term158509, term158509.getClass(), "month", (short) 12);
        setShortField(term158509, term158509.getClass(), "day", (short) 13);
        setField(term158508, term158508.getClass(), "date", term158509);
        setByteField(term158513, term158513.getClass(), "hour", (byte) 12);
        setByteField(term158513, term158513.getClass(), "minute", (byte) 7);
        setByteField(term158513, term158513.getClass(), "second", (byte) 52);
        setIntField(term158513, term158513.getClass(), "nano", 158332280);
        setField(term158508, term158508.getClass(), "time", term158513);
        setField(term158492, term158492.getClass(), "registerTime", term158508);
        setIntField(term158519, term158519.getClass(), "year", 2022);
        setShortField(term158519, term158519.getClass(), "month", (short) 4);
        setShortField(term158519, term158519.getClass(), "day", (short) 28);
        setField(term158518, term158518.getClass(), "date", term158519);
        setByteField(term158523, term158523.getClass(), "hour", (byte) 5);
        setByteField(term158523, term158523.getClass(), "minute", (byte) 17);
        setByteField(term158523, term158523.getClass(), "second", (byte) 39);
        setIntField(term158523, term158523.getClass(), "nano", 883798425);
        setField(term158518, term158518.getClass(), "time", term158523);
        setField(term158492, term158492.getClass(), "accessTime", term158518);
        setField(term158490, term158490.getClass(), "card", term158492);
        setField(term158490, term158490.getClass(), "userName", "eVYbmAKfrT");
        setIntField(term158490, term158490.getClass(), "level", 52007815);
        setIntField(term158490, term158490.getClass(), "reincarnationNum", -1005174618);
        setLongField(term158490, term158490.getClass(), "exp", 7841874237578415646L);
        setLongField(term158490, term158490.getClass(), "point", 4722907183385854894L);
        setLongField(term158490, term158490.getClass(), "totalPoint", 1141311547133627189L);
        setIntField(term158490, term158490.getClass(), "playCount", -1473069102);
        setIntField(term158490, term158490.getClass(), "jewelCount", 748392208);
        setIntField(term158490, term158490.getClass(), "totalJewelCount", -442203106);
        setIntField(term158490, term158490.getClass(), "medalCount", 1102131875);
        setIntField(term158490, term158490.getClass(), "playerRating", 448371674);
        setIntField(term158490, term158490.getClass(), "highestRating", -2004923949);
        setIntField(term158490, term158490.getClass(), "battlePoint", 1462015503);
        setIntField(term158490, term158490.getClass(), "bestBattlePoint", 1329564508);
        setIntField(term158490, term158490.getClass(), "overDamageBattlePoint", 1294433705);
        setBooleanField(term158490, term158490.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term158490, term158490.getClass(), "nameplateId", -1348634231);
        setIntField(term158490, term158490.getClass(), "trophyId", -1188666831);
        setIntField(term158490, term158490.getClass(), "cardId", 1782059615);
        setIntField(term158490, term158490.getClass(), "characterId", 53804926);
        setIntField(term158490, term158490.getClass(), "characterVoiceNo", -1667170549);
        setIntField(term158490, term158490.getClass(), "tabSetting", -482792210);
        setIntField(term158490, term158490.getClass(), "tabSortSetting", -206765569);
        setIntField(term158490, term158490.getClass(), "cardCategorySetting", -1371614953);
        setIntField(term158490, term158490.getClass(), "cardSortSetting", 1919582876);
        setIntField(term158490, term158490.getClass(), "rivalScoreCategorySetting", -1180179163);
        setIntField(term158490, term158490.getClass(), "playedTutorialBit", 1145136743);
        setIntField(term158490, term158490.getClass(), "firstTutorialCancelNum", 1587227439);
        setLongField(term158490, term158490.getClass(), "sumTechHighScore", -5819816209403809941L);
        setLongField(term158490, term158490.getClass(), "sumTechBasicHighScore", -3534340455184560024L);
        setLongField(term158490, term158490.getClass(), "sumTechAdvancedHighScore", -6827271135302328977L);
        setLongField(term158490, term158490.getClass(), "sumTechExpertHighScore", -497952545782064277L);
        setLongField(term158490, term158490.getClass(), "sumTechMasterHighScore", 7460739162162045801L);
        setLongField(term158490, term158490.getClass(), "sumTechLunaticHighScore", -5532808814285818165L);
        setLongField(term158490, term158490.getClass(), "sumBattleHighScore", 8715063241676350223L);
        setLongField(term158490, term158490.getClass(), "sumBattleBasicHighScore", 8749998032565339478L);
        setLongField(term158490, term158490.getClass(), "sumBattleAdvancedHighScore", -2844921168908116451L);
        setLongField(term158490, term158490.getClass(), "sumBattleExpertHighScore", 1210014003210444730L);
        setLongField(term158490, term158490.getClass(), "sumBattleMasterHighScore", 4954389181137471134L);
        setLongField(term158490, term158490.getClass(), "sumBattleLunaticHighScore", 3180630027369982060L);
        setField(term158490, term158490.getClass(), "eventWatchedDate", "OpDokNbkSu");
        setField(term158490, term158490.getClass(), "cmEventWatchedDate", "yHeJtottbK");
        setField(term158490, term158490.getClass(), "firstGameId", "EsebiMkeGU");
        setField(term158490, term158490.getClass(), "firstRomVersion", "ronKInFVff");
        setField(term158490, term158490.getClass(), "firstDataVersion", "OTWCnNUjew");
        setField(term158490, term158490.getClass(), "firstPlayDate", "oUSILMxQiI");
        setField(term158490, term158490.getClass(), "lastGameId", "dohWFHGwwR");
        setField(term158490, term158490.getClass(), "lastRomVersion", "yXKOrgWdes");
        setField(term158490, term158490.getClass(), "lastDataVersion", "LIssGNIAFq");
        setField(term158490, term158490.getClass(), "compatibleCmVersion", "MqkrVMSgoi");
        setField(term158490, term158490.getClass(), "lastPlayDate", "mBvhIZezxE");
        setIntField(term158490, term158490.getClass(), "lastPlaceId", -118801642);
        setField(term158490, term158490.getClass(), "lastPlaceName", "sswCagQpqo");
        setIntField(term158490, term158490.getClass(), "lastRegionId", -1584878256);
        setField(term158490, term158490.getClass(), "lastRegionName", "LrwYiZGGQg");
        setIntField(term158490, term158490.getClass(), "lastAllNetId", -1322460687);
        setField(term158490, term158490.getClass(), "lastClientId", "ugFOXAltBR");
        setIntField(term158490, term158490.getClass(), "lastUsedDeckId", -1227589816);
        setIntField(term158490, term158490.getClass(), "lastPlayMusicLevel", -2138540955);
        setIntField(term158490, term158490.getClass(), "lastEmoneyBrand", 1205424873);
        setField(term158488, term158488.getClass(), "user", term158490);
        setIntField(term158488, term158488.getClass(), "storyId", -1362218312);
        setIntField(term158488, term158488.getClass(), "lastChapterId", -931123286);
        setIntField(term158488, term158488.getClass(), "jewelCount", -225670855);
        setIntField(term158488, term158488.getClass(), "lastPlayMusicId", 1809930249);
        setIntField(term158488, term158488.getClass(), "lastPlayMusicCategory", 742585707);
        setIntField(term158488, term158488.getClass(), "lastPlayMusicLevel", -665502806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term158488, args);
    }

};


