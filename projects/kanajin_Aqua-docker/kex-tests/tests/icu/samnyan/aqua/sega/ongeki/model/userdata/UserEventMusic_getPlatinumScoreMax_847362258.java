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

public class UserEventMusic_getPlatinumScoreMax_847362258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372656;

    public UserEventMusic_getPlatinumScoreMax_847362258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term372662 = new Long(-2196447813514870436L);
        term372656 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term372658 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term372660 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term372676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term372677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term372686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term372687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372691 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term372656, term372656.getClass(), "id", 6080155027960228398L);
        setLongField(term372658, term372658.getClass(), "id", 3787456440392919876L);
        setLongField(term372660, term372660.getClass(), "id", -8176053380015444187L);
        setField(term372660, term372660.getClass(), "extId", term372662);
        setField(term372660, term372660.getClass(), "luid", "UiaFhnPuSw");
        setIntField(term372677, term372677.getClass(), "year", 2029);
        setShortField(term372677, term372677.getClass(), "month", (short) 10);
        setShortField(term372677, term372677.getClass(), "day", (short) 25);
        setField(term372676, term372676.getClass(), "date", term372677);
        setByteField(term372681, term372681.getClass(), "hour", (byte) 13);
        setByteField(term372681, term372681.getClass(), "minute", (byte) 14);
        setByteField(term372681, term372681.getClass(), "second", (byte) 54);
        setIntField(term372681, term372681.getClass(), "nano", 845860001);
        setField(term372676, term372676.getClass(), "time", term372681);
        setField(term372660, term372660.getClass(), "registerTime", term372676);
        setIntField(term372687, term372687.getClass(), "year", 2014);
        setShortField(term372687, term372687.getClass(), "month", (short) 3);
        setShortField(term372687, term372687.getClass(), "day", (short) 17);
        setField(term372686, term372686.getClass(), "date", term372687);
        setByteField(term372691, term372691.getClass(), "hour", (byte) 19);
        setByteField(term372691, term372691.getClass(), "minute", (byte) 47);
        setByteField(term372691, term372691.getClass(), "second", (byte) 9);
        setIntField(term372691, term372691.getClass(), "nano", 271312880);
        setField(term372686, term372686.getClass(), "time", term372691);
        setField(term372660, term372660.getClass(), "accessTime", term372686);
        setField(term372658, term372658.getClass(), "card", term372660);
        setField(term372658, term372658.getClass(), "userName", "etXsYIibxg");
        setIntField(term372658, term372658.getClass(), "level", -922307984);
        setIntField(term372658, term372658.getClass(), "reincarnationNum", 59578259);
        setLongField(term372658, term372658.getClass(), "exp", 3916582472933182351L);
        setLongField(term372658, term372658.getClass(), "point", 605276330450387082L);
        setLongField(term372658, term372658.getClass(), "totalPoint", 3314696260843872451L);
        setIntField(term372658, term372658.getClass(), "playCount", -1998775776);
        setIntField(term372658, term372658.getClass(), "jewelCount", 1479976854);
        setIntField(term372658, term372658.getClass(), "totalJewelCount", -1759676719);
        setIntField(term372658, term372658.getClass(), "medalCount", 476249429);
        setIntField(term372658, term372658.getClass(), "playerRating", -890646459);
        setIntField(term372658, term372658.getClass(), "highestRating", 445214332);
        setIntField(term372658, term372658.getClass(), "battlePoint", 407117966);
        setIntField(term372658, term372658.getClass(), "bestBattlePoint", 394019321);
        setIntField(term372658, term372658.getClass(), "overDamageBattlePoint", -1609866221);
        setBooleanField(term372658, term372658.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term372658, term372658.getClass(), "nameplateId", 372035603);
        setIntField(term372658, term372658.getClass(), "trophyId", 1427327508);
        setIntField(term372658, term372658.getClass(), "cardId", 1419344156);
        setIntField(term372658, term372658.getClass(), "characterId", -1991447102);
        setIntField(term372658, term372658.getClass(), "characterVoiceNo", -1918439885);
        setIntField(term372658, term372658.getClass(), "tabSetting", -1390308566);
        setIntField(term372658, term372658.getClass(), "tabSortSetting", -938313293);
        setIntField(term372658, term372658.getClass(), "cardCategorySetting", -849917832);
        setIntField(term372658, term372658.getClass(), "cardSortSetting", 1426198842);
        setIntField(term372658, term372658.getClass(), "rivalScoreCategorySetting", -1588604056);
        setIntField(term372658, term372658.getClass(), "playedTutorialBit", -1383329421);
        setIntField(term372658, term372658.getClass(), "firstTutorialCancelNum", -416658469);
        setLongField(term372658, term372658.getClass(), "sumTechHighScore", -5394272527536275631L);
        setLongField(term372658, term372658.getClass(), "sumTechBasicHighScore", 2408714783642469077L);
        setLongField(term372658, term372658.getClass(), "sumTechAdvancedHighScore", -2149784982571842530L);
        setLongField(term372658, term372658.getClass(), "sumTechExpertHighScore", 9215319590745829040L);
        setLongField(term372658, term372658.getClass(), "sumTechMasterHighScore", -106256357718113306L);
        setLongField(term372658, term372658.getClass(), "sumTechLunaticHighScore", -7551945404218362499L);
        setLongField(term372658, term372658.getClass(), "sumBattleHighScore", -4826288346118481195L);
        setLongField(term372658, term372658.getClass(), "sumBattleBasicHighScore", 6399816086241139749L);
        setLongField(term372658, term372658.getClass(), "sumBattleAdvancedHighScore", 1135354926986027378L);
        setLongField(term372658, term372658.getClass(), "sumBattleExpertHighScore", -5598782172386398445L);
        setLongField(term372658, term372658.getClass(), "sumBattleMasterHighScore", -291683154338942976L);
        setLongField(term372658, term372658.getClass(), "sumBattleLunaticHighScore", 2913987279570193982L);
        setField(term372658, term372658.getClass(), "eventWatchedDate", "hxQyeuzPhS");
        setField(term372658, term372658.getClass(), "cmEventWatchedDate", "uskUHJhOco");
        setField(term372658, term372658.getClass(), "firstGameId", "EHePotrOtI");
        setField(term372658, term372658.getClass(), "firstRomVersion", "zSvleJGotD");
        setField(term372658, term372658.getClass(), "firstDataVersion", "GowAXgpVSX");
        setField(term372658, term372658.getClass(), "firstPlayDate", "AaSVTByetk");
        setField(term372658, term372658.getClass(), "lastGameId", "gFCdYpVnLA");
        setField(term372658, term372658.getClass(), "lastRomVersion", "DBXbkHfSYd");
        setField(term372658, term372658.getClass(), "lastDataVersion", "IPUkEPCgem");
        setField(term372658, term372658.getClass(), "compatibleCmVersion", "fkfWVyEWea");
        setField(term372658, term372658.getClass(), "lastPlayDate", "uwkKXpKIyP");
        setIntField(term372658, term372658.getClass(), "lastPlaceId", -858446837);
        setField(term372658, term372658.getClass(), "lastPlaceName", "zwLyumFIDA");
        setIntField(term372658, term372658.getClass(), "lastRegionId", 562135017);
        setField(term372658, term372658.getClass(), "lastRegionName", "NmydLPmEPr");
        setIntField(term372658, term372658.getClass(), "lastAllNetId", 617286258);
        setField(term372658, term372658.getClass(), "lastClientId", "kwqKVikpuV");
        setIntField(term372658, term372658.getClass(), "lastUsedDeckId", 1312262888);
        setIntField(term372658, term372658.getClass(), "lastPlayMusicLevel", -527864743);
        setIntField(term372658, term372658.getClass(), "lastEmoneyBrand", 1250506815);
        setField(term372656, term372656.getClass(), "user", term372658);
        setIntField(term372656, term372656.getClass(), "eventId", 520054542);
        setIntField(term372656, term372656.getClass(), "type", 90811394);
        setIntField(term372656, term372656.getClass(), "musicId", 269288229);
        setIntField(term372656, term372656.getClass(), "level", 1897705127);
        setIntField(term372656, term372656.getClass(), "techScoreMax", 1395456013);
        setIntField(term372656, term372656.getClass(), "platinumScoreMax", 1136701006);
        setField(term372656, term372656.getClass(), "techRecordDate", "MWsfTTwQRo");
        setBooleanField(term372656, term372656.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatinumScoreMax", argTypes, term372656, args);
    }

};


