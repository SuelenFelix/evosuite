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
import java.lang.Integer;

public class UserMusicDetail_setClearStatus_174149405135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419618;
     Object term419899;

    public UserMusicDetail_setClearStatus_174149405135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term419624 = new Long(-1721083210597101555L);
        term419618 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term419620 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term419622 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term419638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term419639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term419643 = newInstance(Class.forName("java.time.LocalTime"));
        Object term419648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term419649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term419653 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term419618, term419618.getClass(), "id", -4227137210985109946L);
        setLongField(term419620, term419620.getClass(), "id", -5020993618596636256L);
        setLongField(term419622, term419622.getClass(), "id", 6823257979679433712L);
        setField(term419622, term419622.getClass(), "extId", term419624);
        setField(term419622, term419622.getClass(), "luid", "BZHiPTlyYU");
        setIntField(term419639, term419639.getClass(), "year", 2029);
        setShortField(term419639, term419639.getClass(), "month", (short) 4);
        setShortField(term419639, term419639.getClass(), "day", (short) 20);
        setField(term419638, term419638.getClass(), "date", term419639);
        setByteField(term419643, term419643.getClass(), "hour", (byte) 8);
        setByteField(term419643, term419643.getClass(), "minute", (byte) 8);
        setByteField(term419643, term419643.getClass(), "second", (byte) 39);
        setIntField(term419643, term419643.getClass(), "nano", 45548450);
        setField(term419638, term419638.getClass(), "time", term419643);
        setField(term419622, term419622.getClass(), "registerTime", term419638);
        setIntField(term419649, term419649.getClass(), "year", 2015);
        setShortField(term419649, term419649.getClass(), "month", (short) 1);
        setShortField(term419649, term419649.getClass(), "day", (short) 14);
        setField(term419648, term419648.getClass(), "date", term419649);
        setByteField(term419653, term419653.getClass(), "hour", (byte) 17);
        setByteField(term419653, term419653.getClass(), "minute", (byte) 48);
        setByteField(term419653, term419653.getClass(), "second", (byte) 25);
        setIntField(term419653, term419653.getClass(), "nano", 585352469);
        setField(term419648, term419648.getClass(), "time", term419653);
        setField(term419622, term419622.getClass(), "accessTime", term419648);
        setField(term419620, term419620.getClass(), "card", term419622);
        setField(term419620, term419620.getClass(), "userName", "LeSntOaeGs");
        setIntField(term419620, term419620.getClass(), "level", 227902140);
        setIntField(term419620, term419620.getClass(), "reincarnationNum", 325841787);
        setLongField(term419620, term419620.getClass(), "exp", -387306293330553920L);
        setLongField(term419620, term419620.getClass(), "point", -178460539238551753L);
        setLongField(term419620, term419620.getClass(), "totalPoint", 3528097239290636501L);
        setIntField(term419620, term419620.getClass(), "playCount", -1093019375);
        setIntField(term419620, term419620.getClass(), "jewelCount", 585716932);
        setIntField(term419620, term419620.getClass(), "totalJewelCount", -2040086264);
        setIntField(term419620, term419620.getClass(), "medalCount", -1796908120);
        setIntField(term419620, term419620.getClass(), "playerRating", 1418339257);
        setIntField(term419620, term419620.getClass(), "highestRating", -1258578613);
        setIntField(term419620, term419620.getClass(), "battlePoint", -1292921063);
        setIntField(term419620, term419620.getClass(), "bestBattlePoint", -1948987196);
        setIntField(term419620, term419620.getClass(), "overDamageBattlePoint", -1037532351);
        setBooleanField(term419620, term419620.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term419620, term419620.getClass(), "nameplateId", -1244939317);
        setIntField(term419620, term419620.getClass(), "trophyId", -2108388262);
        setIntField(term419620, term419620.getClass(), "cardId", 519883393);
        setIntField(term419620, term419620.getClass(), "characterId", 2081691976);
        setIntField(term419620, term419620.getClass(), "characterVoiceNo", 883247977);
        setIntField(term419620, term419620.getClass(), "tabSetting", 1231040378);
        setIntField(term419620, term419620.getClass(), "tabSortSetting", -2055814185);
        setIntField(term419620, term419620.getClass(), "cardCategorySetting", -1406806383);
        setIntField(term419620, term419620.getClass(), "cardSortSetting", -589504932);
        setIntField(term419620, term419620.getClass(), "rivalScoreCategorySetting", 1338137272);
        setIntField(term419620, term419620.getClass(), "playedTutorialBit", -391617548);
        setIntField(term419620, term419620.getClass(), "firstTutorialCancelNum", 47063781);
        setLongField(term419620, term419620.getClass(), "sumTechHighScore", 9046792787887548794L);
        setLongField(term419620, term419620.getClass(), "sumTechBasicHighScore", 3310056259438210913L);
        setLongField(term419620, term419620.getClass(), "sumTechAdvancedHighScore", 8894743658119982571L);
        setLongField(term419620, term419620.getClass(), "sumTechExpertHighScore", 699346466212118646L);
        setLongField(term419620, term419620.getClass(), "sumTechMasterHighScore", -4517700096298749293L);
        setLongField(term419620, term419620.getClass(), "sumTechLunaticHighScore", -7875120711791482282L);
        setLongField(term419620, term419620.getClass(), "sumBattleHighScore", 1287531040260208025L);
        setLongField(term419620, term419620.getClass(), "sumBattleBasicHighScore", 6242926536167270749L);
        setLongField(term419620, term419620.getClass(), "sumBattleAdvancedHighScore", 4473578815692552898L);
        setLongField(term419620, term419620.getClass(), "sumBattleExpertHighScore", 2436550245687364383L);
        setLongField(term419620, term419620.getClass(), "sumBattleMasterHighScore", 6963427950330355003L);
        setLongField(term419620, term419620.getClass(), "sumBattleLunaticHighScore", -2031902403940556851L);
        setField(term419620, term419620.getClass(), "eventWatchedDate", "FUAvnCUGdx");
        setField(term419620, term419620.getClass(), "cmEventWatchedDate", "pAWDoHcrSd");
        setField(term419620, term419620.getClass(), "firstGameId", "dXSHBTlzTP");
        setField(term419620, term419620.getClass(), "firstRomVersion", "IGYvahkFXY");
        setField(term419620, term419620.getClass(), "firstDataVersion", "cFETgwszfy");
        setField(term419620, term419620.getClass(), "firstPlayDate", "ZLBlFIuHcr");
        setField(term419620, term419620.getClass(), "lastGameId", "UhHofUGkdl");
        setField(term419620, term419620.getClass(), "lastRomVersion", "XQLvnlpQjd");
        setField(term419620, term419620.getClass(), "lastDataVersion", "SJQAdQLEcN");
        setField(term419620, term419620.getClass(), "compatibleCmVersion", "QPGtOWcqFD");
        setField(term419620, term419620.getClass(), "lastPlayDate", "bvoVOsClMI");
        setIntField(term419620, term419620.getClass(), "lastPlaceId", 578245125);
        setField(term419620, term419620.getClass(), "lastPlaceName", "AJqjkvHaRD");
        setIntField(term419620, term419620.getClass(), "lastRegionId", 55113824);
        setField(term419620, term419620.getClass(), "lastRegionName", "UujzTBGdrN");
        setIntField(term419620, term419620.getClass(), "lastAllNetId", -710032784);
        setField(term419620, term419620.getClass(), "lastClientId", "ncLbPXFYty");
        setIntField(term419620, term419620.getClass(), "lastUsedDeckId", 1921687351);
        setIntField(term419620, term419620.getClass(), "lastPlayMusicLevel", 283758658);
        setIntField(term419620, term419620.getClass(), "lastEmoneyBrand", -1841165420);
        setField(term419618, term419618.getClass(), "user", term419620);
        setIntField(term419618, term419618.getClass(), "musicId", 430389956);
        setIntField(term419618, term419618.getClass(), "level", 1878222345);
        setIntField(term419618, term419618.getClass(), "playCount", -1933045246);
        setIntField(term419618, term419618.getClass(), "techScoreMax", 720306511);
        setIntField(term419618, term419618.getClass(), "techScoreRank", -2008251652);
        setIntField(term419618, term419618.getClass(), "battleScoreMax", -1431212529);
        setIntField(term419618, term419618.getClass(), "battleScoreRank", -1736722660);
        setIntField(term419618, term419618.getClass(), "maxComboCount", -974287449);
        setIntField(term419618, term419618.getClass(), "maxOverKill", 1410202028);
        setIntField(term419618, term419618.getClass(), "maxTeamOverKill", -190450927);
        setBooleanField(term419618, term419618.getClass(), "isFullBell", false);
        setBooleanField(term419618, term419618.getClass(), "isFullCombo", false);
        setBooleanField(term419618, term419618.getClass(), "isAllBreake", false);
        setBooleanField(term419618, term419618.getClass(), "isLock", false);
        setIntField(term419618, term419618.getClass(), "clearStatus", -1837578404);
        setBooleanField(term419618, term419618.getClass(), "isStoryWatched", false);
        term419899 = new Integer(620403025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term419899;
        callMethod(klass, "setClearStatus", argTypes, term419618, args);
    }

};


