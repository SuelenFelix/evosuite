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
import java.lang.Boolean;

public class UserTechEvent_setTotalTechNewRecord_137051307116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358805;
     Object term359087;

    public UserTechEvent_setTotalTechNewRecord_137051307116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term358811 = new Long(-7755863896540616668L);
        term358805 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term358807 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term358809 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term358825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term358826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term358835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term358836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term358840 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term358805, term358805.getClass(), "id", -3031835212840023328L);
        setLongField(term358807, term358807.getClass(), "id", -6004843697197131658L);
        setLongField(term358809, term358809.getClass(), "id", 7822535492074557099L);
        setField(term358809, term358809.getClass(), "extId", term358811);
        setField(term358809, term358809.getClass(), "luid", "YDbPxKSSQd");
        setIntField(term358826, term358826.getClass(), "year", 2015);
        setShortField(term358826, term358826.getClass(), "month", (short) 5);
        setShortField(term358826, term358826.getClass(), "day", (short) 22);
        setField(term358825, term358825.getClass(), "date", term358826);
        setByteField(term358830, term358830.getClass(), "hour", (byte) 0);
        setByteField(term358830, term358830.getClass(), "minute", (byte) 45);
        setByteField(term358830, term358830.getClass(), "second", (byte) 59);
        setIntField(term358830, term358830.getClass(), "nano", 902042652);
        setField(term358825, term358825.getClass(), "time", term358830);
        setField(term358809, term358809.getClass(), "registerTime", term358825);
        setIntField(term358836, term358836.getClass(), "year", 2026);
        setShortField(term358836, term358836.getClass(), "month", (short) 10);
        setShortField(term358836, term358836.getClass(), "day", (short) 4);
        setField(term358835, term358835.getClass(), "date", term358836);
        setByteField(term358840, term358840.getClass(), "hour", (byte) 23);
        setByteField(term358840, term358840.getClass(), "minute", (byte) 57);
        setByteField(term358840, term358840.getClass(), "second", (byte) 14);
        setIntField(term358840, term358840.getClass(), "nano", 415970419);
        setField(term358835, term358835.getClass(), "time", term358840);
        setField(term358809, term358809.getClass(), "accessTime", term358835);
        setField(term358807, term358807.getClass(), "card", term358809);
        setField(term358807, term358807.getClass(), "userName", "CzqyVuMqLh");
        setIntField(term358807, term358807.getClass(), "level", -766108965);
        setIntField(term358807, term358807.getClass(), "reincarnationNum", -1600788149);
        setLongField(term358807, term358807.getClass(), "exp", -3056014261313457606L);
        setLongField(term358807, term358807.getClass(), "point", -7789843481661430172L);
        setLongField(term358807, term358807.getClass(), "totalPoint", -4737340718251174391L);
        setIntField(term358807, term358807.getClass(), "playCount", 237058014);
        setIntField(term358807, term358807.getClass(), "jewelCount", -337868688);
        setIntField(term358807, term358807.getClass(), "totalJewelCount", 873452507);
        setIntField(term358807, term358807.getClass(), "medalCount", -287614125);
        setIntField(term358807, term358807.getClass(), "playerRating", 1215720277);
        setIntField(term358807, term358807.getClass(), "highestRating", -1139276284);
        setIntField(term358807, term358807.getClass(), "battlePoint", 1360833110);
        setIntField(term358807, term358807.getClass(), "bestBattlePoint", 572659344);
        setIntField(term358807, term358807.getClass(), "overDamageBattlePoint", 2041143525);
        setBooleanField(term358807, term358807.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term358807, term358807.getClass(), "nameplateId", -1059744296);
        setIntField(term358807, term358807.getClass(), "trophyId", -1968002967);
        setIntField(term358807, term358807.getClass(), "cardId", -2322904);
        setIntField(term358807, term358807.getClass(), "characterId", 946790222);
        setIntField(term358807, term358807.getClass(), "characterVoiceNo", 779969771);
        setIntField(term358807, term358807.getClass(), "tabSetting", -635673956);
        setIntField(term358807, term358807.getClass(), "tabSortSetting", -2146788868);
        setIntField(term358807, term358807.getClass(), "cardCategorySetting", -433546904);
        setIntField(term358807, term358807.getClass(), "cardSortSetting", 1398625880);
        setIntField(term358807, term358807.getClass(), "rivalScoreCategorySetting", -547222460);
        setIntField(term358807, term358807.getClass(), "playedTutorialBit", 2008612160);
        setIntField(term358807, term358807.getClass(), "firstTutorialCancelNum", 1116369694);
        setLongField(term358807, term358807.getClass(), "sumTechHighScore", 7565937596368263641L);
        setLongField(term358807, term358807.getClass(), "sumTechBasicHighScore", -554221257458314124L);
        setLongField(term358807, term358807.getClass(), "sumTechAdvancedHighScore", 8127720293652900785L);
        setLongField(term358807, term358807.getClass(), "sumTechExpertHighScore", 5282860538170654318L);
        setLongField(term358807, term358807.getClass(), "sumTechMasterHighScore", 383161809636116621L);
        setLongField(term358807, term358807.getClass(), "sumTechLunaticHighScore", -7699229966706646258L);
        setLongField(term358807, term358807.getClass(), "sumBattleHighScore", 4592356855837705321L);
        setLongField(term358807, term358807.getClass(), "sumBattleBasicHighScore", 5075715406844749202L);
        setLongField(term358807, term358807.getClass(), "sumBattleAdvancedHighScore", -8980257102526002616L);
        setLongField(term358807, term358807.getClass(), "sumBattleExpertHighScore", 3415905194910248870L);
        setLongField(term358807, term358807.getClass(), "sumBattleMasterHighScore", -4392774133763235312L);
        setLongField(term358807, term358807.getClass(), "sumBattleLunaticHighScore", -36988102163266586L);
        setField(term358807, term358807.getClass(), "eventWatchedDate", "oIIbdMIKZo");
        setField(term358807, term358807.getClass(), "cmEventWatchedDate", "aWZmsiSSDG");
        setField(term358807, term358807.getClass(), "firstGameId", "rWnASAyCZs");
        setField(term358807, term358807.getClass(), "firstRomVersion", "NgXbAiAVsI");
        setField(term358807, term358807.getClass(), "firstDataVersion", "NiSpEkkUAU");
        setField(term358807, term358807.getClass(), "firstPlayDate", "jNOoIRoelR");
        setField(term358807, term358807.getClass(), "lastGameId", "PGTEMarizD");
        setField(term358807, term358807.getClass(), "lastRomVersion", "iUeeGWdMuD");
        setField(term358807, term358807.getClass(), "lastDataVersion", "yqZDrBMlsV");
        setField(term358807, term358807.getClass(), "compatibleCmVersion", "OgwKKxJUNC");
        setField(term358807, term358807.getClass(), "lastPlayDate", "EUNRKAGsIU");
        setIntField(term358807, term358807.getClass(), "lastPlaceId", 146341391);
        setField(term358807, term358807.getClass(), "lastPlaceName", "atyssQESPk");
        setIntField(term358807, term358807.getClass(), "lastRegionId", -1773867480);
        setField(term358807, term358807.getClass(), "lastRegionName", "BIqLuHJdEX");
        setIntField(term358807, term358807.getClass(), "lastAllNetId", 735724109);
        setField(term358807, term358807.getClass(), "lastClientId", "RkyahTdZNh");
        setIntField(term358807, term358807.getClass(), "lastUsedDeckId", 1189122749);
        setIntField(term358807, term358807.getClass(), "lastPlayMusicLevel", -439217465);
        setIntField(term358807, term358807.getClass(), "lastEmoneyBrand", 1277764455);
        setField(term358805, term358805.getClass(), "user", term358807);
        setIntField(term358805, term358805.getClass(), "eventId", -542048331);
        setIntField(term358805, term358805.getClass(), "totalTechScore", 1238286958);
        setIntField(term358805, term358805.getClass(), "totalPlatinumScore", -944665805);
        setField(term358805, term358805.getClass(), "techRecordDate", "ZXtlpxITwX");
        setBooleanField(term358805, term358805.getClass(), "isRankingRewarded", true);
        setBooleanField(term358805, term358805.getClass(), "isTotalTechNewRecord", true);
        term359087 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term359087;
        callMethod(klass, "setTotalTechNewRecord", argTypes, term358805, args);
    }

};


