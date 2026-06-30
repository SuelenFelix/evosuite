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

public class UserMemoryChapter_getUser_6837051642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389770;

    public UserMemoryChapter_getUser_6837051642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term389776 = new Long(-4033544645261759750L);
        term389770 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term389772 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term389774 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term389790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term389791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term389795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term389800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term389801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term389805 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term389770, term389770.getClass(), "id", 7692525918204841581L);
        setLongField(term389772, term389772.getClass(), "id", 1250523707536937424L);
        setLongField(term389774, term389774.getClass(), "id", -3124023167700528134L);
        setField(term389774, term389774.getClass(), "extId", term389776);
        setField(term389774, term389774.getClass(), "luid", "HHejrVmLMa");
        setIntField(term389791, term389791.getClass(), "year", 2018);
        setShortField(term389791, term389791.getClass(), "month", (short) 12);
        setShortField(term389791, term389791.getClass(), "day", (short) 17);
        setField(term389790, term389790.getClass(), "date", term389791);
        setByteField(term389795, term389795.getClass(), "hour", (byte) 14);
        setByteField(term389795, term389795.getClass(), "minute", (byte) 2);
        setByteField(term389795, term389795.getClass(), "second", (byte) 27);
        setIntField(term389795, term389795.getClass(), "nano", 303910253);
        setField(term389790, term389790.getClass(), "time", term389795);
        setField(term389774, term389774.getClass(), "registerTime", term389790);
        setIntField(term389801, term389801.getClass(), "year", 2022);
        setShortField(term389801, term389801.getClass(), "month", (short) 1);
        setShortField(term389801, term389801.getClass(), "day", (short) 18);
        setField(term389800, term389800.getClass(), "date", term389801);
        setByteField(term389805, term389805.getClass(), "hour", (byte) 14);
        setByteField(term389805, term389805.getClass(), "minute", (byte) 16);
        setByteField(term389805, term389805.getClass(), "second", (byte) 30);
        setIntField(term389805, term389805.getClass(), "nano", 392308423);
        setField(term389800, term389800.getClass(), "time", term389805);
        setField(term389774, term389774.getClass(), "accessTime", term389800);
        setField(term389772, term389772.getClass(), "card", term389774);
        setField(term389772, term389772.getClass(), "userName", "zyqLPxzGFO");
        setIntField(term389772, term389772.getClass(), "level", 105847741);
        setIntField(term389772, term389772.getClass(), "reincarnationNum", 1994016092);
        setLongField(term389772, term389772.getClass(), "exp", 729801856755139626L);
        setLongField(term389772, term389772.getClass(), "point", 1585648672259188032L);
        setLongField(term389772, term389772.getClass(), "totalPoint", 522280712737592630L);
        setIntField(term389772, term389772.getClass(), "playCount", -1256875933);
        setIntField(term389772, term389772.getClass(), "jewelCount", 1574268051);
        setIntField(term389772, term389772.getClass(), "totalJewelCount", 2112573119);
        setIntField(term389772, term389772.getClass(), "medalCount", -2029772203);
        setIntField(term389772, term389772.getClass(), "playerRating", -1107509246);
        setIntField(term389772, term389772.getClass(), "highestRating", 1744140180);
        setIntField(term389772, term389772.getClass(), "battlePoint", -40972271);
        setIntField(term389772, term389772.getClass(), "bestBattlePoint", -785251684);
        setIntField(term389772, term389772.getClass(), "overDamageBattlePoint", 836453622);
        setBooleanField(term389772, term389772.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term389772, term389772.getClass(), "nameplateId", 1923817159);
        setIntField(term389772, term389772.getClass(), "trophyId", 1188543286);
        setIntField(term389772, term389772.getClass(), "cardId", -1979391350);
        setIntField(term389772, term389772.getClass(), "characterId", -1240006369);
        setIntField(term389772, term389772.getClass(), "characterVoiceNo", -1332422917);
        setIntField(term389772, term389772.getClass(), "tabSetting", -639321209);
        setIntField(term389772, term389772.getClass(), "tabSortSetting", -420329719);
        setIntField(term389772, term389772.getClass(), "cardCategorySetting", 377962642);
        setIntField(term389772, term389772.getClass(), "cardSortSetting", -1190471193);
        setIntField(term389772, term389772.getClass(), "rivalScoreCategorySetting", -1851111045);
        setIntField(term389772, term389772.getClass(), "playedTutorialBit", -1236636787);
        setIntField(term389772, term389772.getClass(), "firstTutorialCancelNum", -2108716424);
        setLongField(term389772, term389772.getClass(), "sumTechHighScore", 7983795434846114778L);
        setLongField(term389772, term389772.getClass(), "sumTechBasicHighScore", -4978418078043618001L);
        setLongField(term389772, term389772.getClass(), "sumTechAdvancedHighScore", -7292482330192280029L);
        setLongField(term389772, term389772.getClass(), "sumTechExpertHighScore", -3721505474796343685L);
        setLongField(term389772, term389772.getClass(), "sumTechMasterHighScore", 5245944844954048799L);
        setLongField(term389772, term389772.getClass(), "sumTechLunaticHighScore", -8491465990571387854L);
        setLongField(term389772, term389772.getClass(), "sumBattleHighScore", -8015465580603278182L);
        setLongField(term389772, term389772.getClass(), "sumBattleBasicHighScore", 9116493323584984288L);
        setLongField(term389772, term389772.getClass(), "sumBattleAdvancedHighScore", -3215449192440238703L);
        setLongField(term389772, term389772.getClass(), "sumBattleExpertHighScore", -4663989259702352502L);
        setLongField(term389772, term389772.getClass(), "sumBattleMasterHighScore", -6787604392570260783L);
        setLongField(term389772, term389772.getClass(), "sumBattleLunaticHighScore", -1161713320438974225L);
        setField(term389772, term389772.getClass(), "eventWatchedDate", "dtpbYPcLPn");
        setField(term389772, term389772.getClass(), "cmEventWatchedDate", "KKaydYtCgS");
        setField(term389772, term389772.getClass(), "firstGameId", "HKyYPplKbq");
        setField(term389772, term389772.getClass(), "firstRomVersion", "gWLedERFfg");
        setField(term389772, term389772.getClass(), "firstDataVersion", "WfsCuMnMou");
        setField(term389772, term389772.getClass(), "firstPlayDate", "iBuWzpFkVQ");
        setField(term389772, term389772.getClass(), "lastGameId", "EXCWvODxPo");
        setField(term389772, term389772.getClass(), "lastRomVersion", "cfoCDiUsop");
        setField(term389772, term389772.getClass(), "lastDataVersion", "jCOOcbkKkf");
        setField(term389772, term389772.getClass(), "compatibleCmVersion", "vBtxFKCjdv");
        setField(term389772, term389772.getClass(), "lastPlayDate", "OCPPGrRFxg");
        setIntField(term389772, term389772.getClass(), "lastPlaceId", -336361673);
        setField(term389772, term389772.getClass(), "lastPlaceName", "KFrFiliXNG");
        setIntField(term389772, term389772.getClass(), "lastRegionId", -888670168);
        setField(term389772, term389772.getClass(), "lastRegionName", "FSvrGPtCMl");
        setIntField(term389772, term389772.getClass(), "lastAllNetId", 345955140);
        setField(term389772, term389772.getClass(), "lastClientId", "ZyiWiQsSTG");
        setIntField(term389772, term389772.getClass(), "lastUsedDeckId", 1243845685);
        setIntField(term389772, term389772.getClass(), "lastPlayMusicLevel", -564903193);
        setIntField(term389772, term389772.getClass(), "lastEmoneyBrand", -1817798903);
        setField(term389770, term389770.getClass(), "user", term389772);
        setIntField(term389770, term389770.getClass(), "chapterId", 207415691);
        setIntField(term389770, term389770.getClass(), "jewelCount", 1077199564);
        setIntField(term389770, term389770.getClass(), "lastPlayMusicCategory", -1797167916);
        setIntField(term389770, term389770.getClass(), "lastPlayMusicId", 519056385);
        setIntField(term389770, term389770.getClass(), "lastPlayMusicLevel", 565362084);
        setBooleanField(term389770, term389770.getClass(), "isDialogWatched", false);
        setBooleanField(term389770, term389770.getClass(), "isStoryWatched", false);
        setBooleanField(term389770, term389770.getClass(), "isBossWatched", true);
        setBooleanField(term389770, term389770.getClass(), "isClear", false);
        setIntField(term389770, term389770.getClass(), "gaugeId", -215228799);
        setIntField(term389770, term389770.getClass(), "gaugeNum", -890958448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term389770, args);
    }

};


