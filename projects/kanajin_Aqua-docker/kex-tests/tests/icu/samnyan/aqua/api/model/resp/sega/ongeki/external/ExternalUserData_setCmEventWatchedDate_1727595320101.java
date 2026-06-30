package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setCmEventWatchedDate_1727595320101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3204360;

    public ExternalUserData_setCmEventWatchedDate_1727595320101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3204360 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3204360, term3204360.getClass(), "accessCode", "ldOYtPdWpS");
        setField(term3204360, term3204360.getClass(), "userName", "CxxCukCQUR");
        setIntField(term3204360, term3204360.getClass(), "level", 476823526);
        setIntField(term3204360, term3204360.getClass(), "reincarnationNum", 455542270);
        setLongField(term3204360, term3204360.getClass(), "exp", -2682568728142347159L);
        setLongField(term3204360, term3204360.getClass(), "point", -1936953238670077017L);
        setLongField(term3204360, term3204360.getClass(), "totalPoint", 8102206476058556864L);
        setIntField(term3204360, term3204360.getClass(), "playCount", 1090117632);
        setIntField(term3204360, term3204360.getClass(), "jewelCount", -1543185414);
        setIntField(term3204360, term3204360.getClass(), "totalJewelCount", 1253018561);
        setIntField(term3204360, term3204360.getClass(), "medalCount", 1976508365);
        setIntField(term3204360, term3204360.getClass(), "playerRating", -461155976);
        setIntField(term3204360, term3204360.getClass(), "highestRating", -1285394384);
        setIntField(term3204360, term3204360.getClass(), "battlePoint", -2104777736);
        setIntField(term3204360, term3204360.getClass(), "bestBattlePoint", 1709396065);
        setIntField(term3204360, term3204360.getClass(), "overDamageBattlePoint", 1024604451);
        setIntField(term3204360, term3204360.getClass(), "nameplateId", -1040989718);
        setIntField(term3204360, term3204360.getClass(), "trophyId", 1213432811);
        setIntField(term3204360, term3204360.getClass(), "cardId", 362602510);
        setIntField(term3204360, term3204360.getClass(), "characterId", -2092464550);
        setIntField(term3204360, term3204360.getClass(), "tabSetting", -671203195);
        setIntField(term3204360, term3204360.getClass(), "tabSortSetting", -787452775);
        setIntField(term3204360, term3204360.getClass(), "cardCategorySetting", 665820206);
        setIntField(term3204360, term3204360.getClass(), "cardSortSetting", 2074234898);
        setIntField(term3204360, term3204360.getClass(), "rivalScoreCategorySetting", 754070487);
        setIntField(term3204360, term3204360.getClass(), "playedTutorialBit", -624051679);
        setIntField(term3204360, term3204360.getClass(), "firstTutorialCancelNum", -1303455657);
        setLongField(term3204360, term3204360.getClass(), "sumTechHighScore", 8905039865965490586L);
        setLongField(term3204360, term3204360.getClass(), "sumTechBasicHighScore", 6872083596623646420L);
        setLongField(term3204360, term3204360.getClass(), "sumTechAdvancedHighScore", 3679873179957988405L);
        setLongField(term3204360, term3204360.getClass(), "sumTechExpertHighScore", 8747183835167110264L);
        setLongField(term3204360, term3204360.getClass(), "sumTechMasterHighScore", -5311378197970180383L);
        setLongField(term3204360, term3204360.getClass(), "sumTechLunaticHighScore", 607575538289531720L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleHighScore", -2993106650093562503L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleBasicHighScore", 4074009904443162129L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleAdvancedHighScore", -467331282410379440L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleExpertHighScore", 2875810910431702640L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleMasterHighScore", -4214572018937495944L);
        setLongField(term3204360, term3204360.getClass(), "sumBattleLunaticHighScore", 3649540604680685496L);
        setField(term3204360, term3204360.getClass(), "eventWatchedDate", "uZreHHaRiX");
        setField(term3204360, term3204360.getClass(), "cmEventWatchedDate", "PrsZkgVVdl");
        setField(term3204360, term3204360.getClass(), "firstGameId", "BJyoEJMZer");
        setField(term3204360, term3204360.getClass(), "firstRomVersion", "JOsBdxicUy");
        setField(term3204360, term3204360.getClass(), "firstDataVersion", "mwWMNohVCR");
        setField(term3204360, term3204360.getClass(), "firstPlayDate", "mZRGbhqeRY");
        setField(term3204360, term3204360.getClass(), "lastGameId", "CFibpmGPHS");
        setField(term3204360, term3204360.getClass(), "lastRomVersion", "hDeHJSWPIC");
        setField(term3204360, term3204360.getClass(), "lastDataVersion", "UMwTANLzNv");
        setField(term3204360, term3204360.getClass(), "compatibleCmVersion", "EqLvFPBrfd");
        setField(term3204360, term3204360.getClass(), "lastPlayDate", "JEaoGyEkVo");
        setIntField(term3204360, term3204360.getClass(), "lastPlaceId", 178655221);
        setField(term3204360, term3204360.getClass(), "lastPlaceName", "HJsUoVKHAT");
        setIntField(term3204360, term3204360.getClass(), "lastRegionId", 1376010884);
        setField(term3204360, term3204360.getClass(), "lastRegionName", "jWZVZgxJNM");
        setIntField(term3204360, term3204360.getClass(), "lastAllNetId", 1813417350);
        setField(term3204360, term3204360.getClass(), "lastClientId", "vmJnexjvIe");
        setIntField(term3204360, term3204360.getClass(), "lastUsedDeckId", 652529359);
        setIntField(term3204360, term3204360.getClass(), "lastPlayMusicLevel", 562490319);
        setIntField(term3204360, term3204360.getClass(), "lastEmoneyBrand", 564693392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ijoMMyZRNQ";
        callMethod(klass, "setCmEventWatchedDate", argTypes, term3204360, args);
    }

};


