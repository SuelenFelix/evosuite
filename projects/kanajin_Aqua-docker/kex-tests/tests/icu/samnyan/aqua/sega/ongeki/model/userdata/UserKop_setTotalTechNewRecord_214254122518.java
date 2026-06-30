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

public class UserKop_setTotalTechNewRecord_214254122518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279700;
     Object term279994;

    public UserKop_setTotalTechNewRecord_214254122518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279706 = new Long(-99017747847004910L);
        term279700 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term279702 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term279704 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279735 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279700, term279700.getClass(), "id", 5492358869034688065L);
        setLongField(term279702, term279702.getClass(), "id", -277101538578378460L);
        setLongField(term279704, term279704.getClass(), "id", 3048862569346510616L);
        setField(term279704, term279704.getClass(), "extId", term279706);
        setField(term279704, term279704.getClass(), "luid", "BlUKdVLBNm");
        setIntField(term279721, term279721.getClass(), "year", 2010);
        setShortField(term279721, term279721.getClass(), "month", (short) 11);
        setShortField(term279721, term279721.getClass(), "day", (short) 17);
        setField(term279720, term279720.getClass(), "date", term279721);
        setByteField(term279725, term279725.getClass(), "hour", (byte) 6);
        setByteField(term279725, term279725.getClass(), "minute", (byte) 22);
        setByteField(term279725, term279725.getClass(), "second", (byte) 8);
        setIntField(term279725, term279725.getClass(), "nano", 287083432);
        setField(term279720, term279720.getClass(), "time", term279725);
        setField(term279704, term279704.getClass(), "registerTime", term279720);
        setIntField(term279731, term279731.getClass(), "year", 2026);
        setShortField(term279731, term279731.getClass(), "month", (short) 1);
        setShortField(term279731, term279731.getClass(), "day", (short) 22);
        setField(term279730, term279730.getClass(), "date", term279731);
        setByteField(term279735, term279735.getClass(), "hour", (byte) 11);
        setByteField(term279735, term279735.getClass(), "minute", (byte) 58);
        setByteField(term279735, term279735.getClass(), "second", (byte) 44);
        setIntField(term279735, term279735.getClass(), "nano", 573755699);
        setField(term279730, term279730.getClass(), "time", term279735);
        setField(term279704, term279704.getClass(), "accessTime", term279730);
        setField(term279702, term279702.getClass(), "card", term279704);
        setField(term279702, term279702.getClass(), "userName", "CldhEgXvQf");
        setIntField(term279702, term279702.getClass(), "level", 1707744811);
        setIntField(term279702, term279702.getClass(), "reincarnationNum", 803063031);
        setLongField(term279702, term279702.getClass(), "exp", -5828984278360475278L);
        setLongField(term279702, term279702.getClass(), "point", 3062411936172634571L);
        setLongField(term279702, term279702.getClass(), "totalPoint", -8376110350251919406L);
        setIntField(term279702, term279702.getClass(), "playCount", 832802103);
        setIntField(term279702, term279702.getClass(), "jewelCount", 2091427121);
        setIntField(term279702, term279702.getClass(), "totalJewelCount", -1709658772);
        setIntField(term279702, term279702.getClass(), "medalCount", -1850646714);
        setIntField(term279702, term279702.getClass(), "playerRating", 1704468960);
        setIntField(term279702, term279702.getClass(), "highestRating", -299710958);
        setIntField(term279702, term279702.getClass(), "battlePoint", -1806570782);
        setIntField(term279702, term279702.getClass(), "bestBattlePoint", 598628574);
        setIntField(term279702, term279702.getClass(), "overDamageBattlePoint", 64811427);
        setBooleanField(term279702, term279702.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term279702, term279702.getClass(), "nameplateId", 1227631914);
        setIntField(term279702, term279702.getClass(), "trophyId", 1333652434);
        setIntField(term279702, term279702.getClass(), "cardId", -1093703240);
        setIntField(term279702, term279702.getClass(), "characterId", 468378808);
        setIntField(term279702, term279702.getClass(), "characterVoiceNo", -1470659106);
        setIntField(term279702, term279702.getClass(), "tabSetting", 1250265239);
        setIntField(term279702, term279702.getClass(), "tabSortSetting", -1795670477);
        setIntField(term279702, term279702.getClass(), "cardCategorySetting", 499241052);
        setIntField(term279702, term279702.getClass(), "cardSortSetting", 1118287873);
        setIntField(term279702, term279702.getClass(), "rivalScoreCategorySetting", 1164127961);
        setIntField(term279702, term279702.getClass(), "playedTutorialBit", 2072620854);
        setIntField(term279702, term279702.getClass(), "firstTutorialCancelNum", -1096501716);
        setLongField(term279702, term279702.getClass(), "sumTechHighScore", 6232301055706106592L);
        setLongField(term279702, term279702.getClass(), "sumTechBasicHighScore", -2577423586678140160L);
        setLongField(term279702, term279702.getClass(), "sumTechAdvancedHighScore", 741925491061039443L);
        setLongField(term279702, term279702.getClass(), "sumTechExpertHighScore", -8444111158575243799L);
        setLongField(term279702, term279702.getClass(), "sumTechMasterHighScore", 6309304541171313047L);
        setLongField(term279702, term279702.getClass(), "sumTechLunaticHighScore", -2061424634890951606L);
        setLongField(term279702, term279702.getClass(), "sumBattleHighScore", 8525752919784529119L);
        setLongField(term279702, term279702.getClass(), "sumBattleBasicHighScore", 4351075678109695383L);
        setLongField(term279702, term279702.getClass(), "sumBattleAdvancedHighScore", 292202552937488537L);
        setLongField(term279702, term279702.getClass(), "sumBattleExpertHighScore", 8919601520440158749L);
        setLongField(term279702, term279702.getClass(), "sumBattleMasterHighScore", -4564726585746120134L);
        setLongField(term279702, term279702.getClass(), "sumBattleLunaticHighScore", 7175441648984235626L);
        setField(term279702, term279702.getClass(), "eventWatchedDate", "WgctHDcsib");
        setField(term279702, term279702.getClass(), "cmEventWatchedDate", "gIhnDwhYPA");
        setField(term279702, term279702.getClass(), "firstGameId", "CHKxCaDYeL");
        setField(term279702, term279702.getClass(), "firstRomVersion", "pltMgQSnCb");
        setField(term279702, term279702.getClass(), "firstDataVersion", "RiGoJoBvZO");
        setField(term279702, term279702.getClass(), "firstPlayDate", "xjNArFEvAJ");
        setField(term279702, term279702.getClass(), "lastGameId", "cNAlXBcuBR");
        setField(term279702, term279702.getClass(), "lastRomVersion", "zhTrQcOfmZ");
        setField(term279702, term279702.getClass(), "lastDataVersion", "QPQvZYsKyp");
        setField(term279702, term279702.getClass(), "compatibleCmVersion", "DcKnNHFkHB");
        setField(term279702, term279702.getClass(), "lastPlayDate", "ItJTfGujtZ");
        setIntField(term279702, term279702.getClass(), "lastPlaceId", 705451675);
        setField(term279702, term279702.getClass(), "lastPlaceName", "qkPcNUMMFU");
        setIntField(term279702, term279702.getClass(), "lastRegionId", 1012015870);
        setField(term279702, term279702.getClass(), "lastRegionName", "ZXmgWZeTRn");
        setIntField(term279702, term279702.getClass(), "lastAllNetId", 1111414939);
        setField(term279702, term279702.getClass(), "lastClientId", "GoLHmDBAJB");
        setIntField(term279702, term279702.getClass(), "lastUsedDeckId", -209050442);
        setIntField(term279702, term279702.getClass(), "lastPlayMusicLevel", 1148172012);
        setIntField(term279702, term279702.getClass(), "lastEmoneyBrand", -886315809);
        setField(term279700, term279700.getClass(), "user", term279702);
        setField(term279700, term279700.getClass(), "authKey", "AZqmZETlNN");
        setIntField(term279700, term279700.getClass(), "kopId", -665144885);
        setIntField(term279700, term279700.getClass(), "areaId", -1411805876);
        setIntField(term279700, term279700.getClass(), "totalTechScore", -522128464);
        setIntField(term279700, term279700.getClass(), "totalPlatinumScore", 1776987071);
        setField(term279700, term279700.getClass(), "techRecordDate", "bToiDutxBd");
        setBooleanField(term279700, term279700.getClass(), "isTotalTechNewRecord", true);
        term279994 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term279994;
        callMethod(klass, "setTotalTechNewRecord", argTypes, term279700, args);
    }

};


