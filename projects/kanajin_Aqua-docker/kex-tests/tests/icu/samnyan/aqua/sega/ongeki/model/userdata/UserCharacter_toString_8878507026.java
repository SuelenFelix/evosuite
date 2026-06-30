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

public class UserCharacter_toString_8878507026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180004;

    public UserCharacter_toString_8878507026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180010 = new Long(9062006526792682783L);
        term180004 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term180006 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term180008 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term180024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180034 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180035 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180039 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180004, term180004.getClass(), "id", -1469167471004592973L);
        setLongField(term180006, term180006.getClass(), "id", 2639211404788643317L);
        setLongField(term180008, term180008.getClass(), "id", -3986523968546940861L);
        setField(term180008, term180008.getClass(), "extId", term180010);
        setField(term180008, term180008.getClass(), "luid", "KkgsnVFOTA");
        setIntField(term180025, term180025.getClass(), "year", 2017);
        setShortField(term180025, term180025.getClass(), "month", (short) 8);
        setShortField(term180025, term180025.getClass(), "day", (short) 13);
        setField(term180024, term180024.getClass(), "date", term180025);
        setByteField(term180029, term180029.getClass(), "hour", (byte) 3);
        setByteField(term180029, term180029.getClass(), "minute", (byte) 9);
        setByteField(term180029, term180029.getClass(), "second", (byte) 24);
        setIntField(term180029, term180029.getClass(), "nano", 692710591);
        setField(term180024, term180024.getClass(), "time", term180029);
        setField(term180008, term180008.getClass(), "registerTime", term180024);
        setIntField(term180035, term180035.getClass(), "year", 2019);
        setShortField(term180035, term180035.getClass(), "month", (short) 6);
        setShortField(term180035, term180035.getClass(), "day", (short) 13);
        setField(term180034, term180034.getClass(), "date", term180035);
        setByteField(term180039, term180039.getClass(), "hour", (byte) 22);
        setByteField(term180039, term180039.getClass(), "minute", (byte) 53);
        setByteField(term180039, term180039.getClass(), "second", (byte) 1);
        setIntField(term180039, term180039.getClass(), "nano", 411931015);
        setField(term180034, term180034.getClass(), "time", term180039);
        setField(term180008, term180008.getClass(), "accessTime", term180034);
        setField(term180006, term180006.getClass(), "card", term180008);
        setField(term180006, term180006.getClass(), "userName", "SrYCuNBdSA");
        setIntField(term180006, term180006.getClass(), "level", 1186573309);
        setIntField(term180006, term180006.getClass(), "reincarnationNum", -1612970790);
        setLongField(term180006, term180006.getClass(), "exp", 2040798244583969156L);
        setLongField(term180006, term180006.getClass(), "point", -6822217640569799687L);
        setLongField(term180006, term180006.getClass(), "totalPoint", 1075530383686298757L);
        setIntField(term180006, term180006.getClass(), "playCount", 1322035683);
        setIntField(term180006, term180006.getClass(), "jewelCount", 473364076);
        setIntField(term180006, term180006.getClass(), "totalJewelCount", -309915978);
        setIntField(term180006, term180006.getClass(), "medalCount", -2126284255);
        setIntField(term180006, term180006.getClass(), "playerRating", 1745632136);
        setIntField(term180006, term180006.getClass(), "highestRating", -1127735797);
        setIntField(term180006, term180006.getClass(), "battlePoint", -1176366062);
        setIntField(term180006, term180006.getClass(), "bestBattlePoint", -1989569985);
        setIntField(term180006, term180006.getClass(), "overDamageBattlePoint", 22953591);
        setBooleanField(term180006, term180006.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term180006, term180006.getClass(), "nameplateId", 2000418563);
        setIntField(term180006, term180006.getClass(), "trophyId", 1533972742);
        setIntField(term180006, term180006.getClass(), "cardId", 2134249034);
        setIntField(term180006, term180006.getClass(), "characterId", 905187079);
        setIntField(term180006, term180006.getClass(), "characterVoiceNo", 2064319269);
        setIntField(term180006, term180006.getClass(), "tabSetting", -1355791461);
        setIntField(term180006, term180006.getClass(), "tabSortSetting", 315878223);
        setIntField(term180006, term180006.getClass(), "cardCategorySetting", -1983348178);
        setIntField(term180006, term180006.getClass(), "cardSortSetting", 51452417);
        setIntField(term180006, term180006.getClass(), "rivalScoreCategorySetting", 1419486741);
        setIntField(term180006, term180006.getClass(), "playedTutorialBit", 1354604715);
        setIntField(term180006, term180006.getClass(), "firstTutorialCancelNum", 860219207);
        setLongField(term180006, term180006.getClass(), "sumTechHighScore", 4250412912426613100L);
        setLongField(term180006, term180006.getClass(), "sumTechBasicHighScore", 5159190121161740282L);
        setLongField(term180006, term180006.getClass(), "sumTechAdvancedHighScore", -8519906009423347259L);
        setLongField(term180006, term180006.getClass(), "sumTechExpertHighScore", -6489651937391409571L);
        setLongField(term180006, term180006.getClass(), "sumTechMasterHighScore", 508850698309860517L);
        setLongField(term180006, term180006.getClass(), "sumTechLunaticHighScore", -4869654863013458132L);
        setLongField(term180006, term180006.getClass(), "sumBattleHighScore", 4316236036287549765L);
        setLongField(term180006, term180006.getClass(), "sumBattleBasicHighScore", -5350794827033786712L);
        setLongField(term180006, term180006.getClass(), "sumBattleAdvancedHighScore", 69036866501516766L);
        setLongField(term180006, term180006.getClass(), "sumBattleExpertHighScore", 3411697775536637400L);
        setLongField(term180006, term180006.getClass(), "sumBattleMasterHighScore", 8263542389347483980L);
        setLongField(term180006, term180006.getClass(), "sumBattleLunaticHighScore", -9056977522310889772L);
        setField(term180006, term180006.getClass(), "eventWatchedDate", "kqsqqnPWbj");
        setField(term180006, term180006.getClass(), "cmEventWatchedDate", "KAcGeaXccL");
        setField(term180006, term180006.getClass(), "firstGameId", "ijslNghuqA");
        setField(term180006, term180006.getClass(), "firstRomVersion", "aHfYHkXvpt");
        setField(term180006, term180006.getClass(), "firstDataVersion", "tovbqDKkFd");
        setField(term180006, term180006.getClass(), "firstPlayDate", "MrywNflOyn");
        setField(term180006, term180006.getClass(), "lastGameId", "aXHYGWlgTv");
        setField(term180006, term180006.getClass(), "lastRomVersion", "BqUjQAIFoc");
        setField(term180006, term180006.getClass(), "lastDataVersion", "edwgLgtJYD");
        setField(term180006, term180006.getClass(), "compatibleCmVersion", "EpbpcphIAy");
        setField(term180006, term180006.getClass(), "lastPlayDate", "eQOioilfFk");
        setIntField(term180006, term180006.getClass(), "lastPlaceId", 1870807379);
        setField(term180006, term180006.getClass(), "lastPlaceName", "dftnVDBTUa");
        setIntField(term180006, term180006.getClass(), "lastRegionId", -667004842);
        setField(term180006, term180006.getClass(), "lastRegionName", "THBraLlQtu");
        setIntField(term180006, term180006.getClass(), "lastAllNetId", -1826721895);
        setField(term180006, term180006.getClass(), "lastClientId", "fJcSsPSIBR");
        setIntField(term180006, term180006.getClass(), "lastUsedDeckId", 61071892);
        setIntField(term180006, term180006.getClass(), "lastPlayMusicLevel", -76539716);
        setIntField(term180006, term180006.getClass(), "lastEmoneyBrand", 1044482948);
        setField(term180004, term180004.getClass(), "user", term180006);
        setIntField(term180004, term180004.getClass(), "characterId", 524326924);
        setIntField(term180004, term180004.getClass(), "costumeId", -38117113);
        setIntField(term180004, term180004.getClass(), "attachmentId", 2089667764);
        setIntField(term180004, term180004.getClass(), "playCount", 1175452649);
        setIntField(term180004, term180004.getClass(), "intimateLevel", 535398079);
        setIntField(term180004, term180004.getClass(), "intimateCount", -1827195972);
        setIntField(term180004, term180004.getClass(), "intimateCountRewarded", 72074430);
        setField(term180004, term180004.getClass(), "intimateCountDate", "HWLSSvSHoZ");
        setBooleanField(term180004, term180004.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term180004, args);
    }

};


