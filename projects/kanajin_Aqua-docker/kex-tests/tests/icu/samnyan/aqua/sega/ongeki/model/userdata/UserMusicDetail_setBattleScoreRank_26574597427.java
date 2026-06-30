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

public class UserMusicDetail_setBattleScoreRank_26574597427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416074;
     Object term416355;

    public UserMusicDetail_setBattleScoreRank_26574597427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term416080 = new Long(5255768275907389358L);
        term416074 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term416076 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term416078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term416094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term416104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term416074, term416074.getClass(), "id", -3642113412527235344L);
        setLongField(term416076, term416076.getClass(), "id", 3648316440469286245L);
        setLongField(term416078, term416078.getClass(), "id", 6776975096575362523L);
        setField(term416078, term416078.getClass(), "extId", term416080);
        setField(term416078, term416078.getClass(), "luid", "bzfEWTjvbn");
        setIntField(term416095, term416095.getClass(), "year", 2014);
        setShortField(term416095, term416095.getClass(), "month", (short) 8);
        setShortField(term416095, term416095.getClass(), "day", (short) 20);
        setField(term416094, term416094.getClass(), "date", term416095);
        setByteField(term416099, term416099.getClass(), "hour", (byte) 7);
        setByteField(term416099, term416099.getClass(), "minute", (byte) 38);
        setByteField(term416099, term416099.getClass(), "second", (byte) 47);
        setIntField(term416099, term416099.getClass(), "nano", 532211394);
        setField(term416094, term416094.getClass(), "time", term416099);
        setField(term416078, term416078.getClass(), "registerTime", term416094);
        setIntField(term416105, term416105.getClass(), "year", 2025);
        setShortField(term416105, term416105.getClass(), "month", (short) 2);
        setShortField(term416105, term416105.getClass(), "day", (short) 13);
        setField(term416104, term416104.getClass(), "date", term416105);
        setByteField(term416109, term416109.getClass(), "hour", (byte) 2);
        setByteField(term416109, term416109.getClass(), "minute", (byte) 25);
        setByteField(term416109, term416109.getClass(), "second", (byte) 41);
        setIntField(term416109, term416109.getClass(), "nano", 234411599);
        setField(term416104, term416104.getClass(), "time", term416109);
        setField(term416078, term416078.getClass(), "accessTime", term416104);
        setField(term416076, term416076.getClass(), "card", term416078);
        setField(term416076, term416076.getClass(), "userName", "qoViEKtYWg");
        setIntField(term416076, term416076.getClass(), "level", -2003652991);
        setIntField(term416076, term416076.getClass(), "reincarnationNum", -2018433067);
        setLongField(term416076, term416076.getClass(), "exp", 6127024388514029159L);
        setLongField(term416076, term416076.getClass(), "point", 4096585780854382743L);
        setLongField(term416076, term416076.getClass(), "totalPoint", -1764012464441058205L);
        setIntField(term416076, term416076.getClass(), "playCount", 1018008674);
        setIntField(term416076, term416076.getClass(), "jewelCount", 1238557120);
        setIntField(term416076, term416076.getClass(), "totalJewelCount", 597226346);
        setIntField(term416076, term416076.getClass(), "medalCount", -223417027);
        setIntField(term416076, term416076.getClass(), "playerRating", 808100358);
        setIntField(term416076, term416076.getClass(), "highestRating", -660047421);
        setIntField(term416076, term416076.getClass(), "battlePoint", -2080061035);
        setIntField(term416076, term416076.getClass(), "bestBattlePoint", -1897207968);
        setIntField(term416076, term416076.getClass(), "overDamageBattlePoint", 1886810839);
        setBooleanField(term416076, term416076.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term416076, term416076.getClass(), "nameplateId", -1603878264);
        setIntField(term416076, term416076.getClass(), "trophyId", -122832269);
        setIntField(term416076, term416076.getClass(), "cardId", 1842831808);
        setIntField(term416076, term416076.getClass(), "characterId", -430421214);
        setIntField(term416076, term416076.getClass(), "characterVoiceNo", 881145258);
        setIntField(term416076, term416076.getClass(), "tabSetting", -761833608);
        setIntField(term416076, term416076.getClass(), "tabSortSetting", 1883562796);
        setIntField(term416076, term416076.getClass(), "cardCategorySetting", 361685874);
        setIntField(term416076, term416076.getClass(), "cardSortSetting", -617957175);
        setIntField(term416076, term416076.getClass(), "rivalScoreCategorySetting", -114930141);
        setIntField(term416076, term416076.getClass(), "playedTutorialBit", -56145035);
        setIntField(term416076, term416076.getClass(), "firstTutorialCancelNum", 1256048184);
        setLongField(term416076, term416076.getClass(), "sumTechHighScore", 1741303457712223201L);
        setLongField(term416076, term416076.getClass(), "sumTechBasicHighScore", -6791410355952080019L);
        setLongField(term416076, term416076.getClass(), "sumTechAdvancedHighScore", 3008415788370974249L);
        setLongField(term416076, term416076.getClass(), "sumTechExpertHighScore", -8625448071885644543L);
        setLongField(term416076, term416076.getClass(), "sumTechMasterHighScore", 1952563306981502613L);
        setLongField(term416076, term416076.getClass(), "sumTechLunaticHighScore", 168067915956342963L);
        setLongField(term416076, term416076.getClass(), "sumBattleHighScore", -8259606580780981L);
        setLongField(term416076, term416076.getClass(), "sumBattleBasicHighScore", 3063314603858615049L);
        setLongField(term416076, term416076.getClass(), "sumBattleAdvancedHighScore", 8860503237438891503L);
        setLongField(term416076, term416076.getClass(), "sumBattleExpertHighScore", 3230252887439226535L);
        setLongField(term416076, term416076.getClass(), "sumBattleMasterHighScore", -773071204004617878L);
        setLongField(term416076, term416076.getClass(), "sumBattleLunaticHighScore", -6336114388808604755L);
        setField(term416076, term416076.getClass(), "eventWatchedDate", "XGsIEhXFHi");
        setField(term416076, term416076.getClass(), "cmEventWatchedDate", "zkCgIRppca");
        setField(term416076, term416076.getClass(), "firstGameId", "OwduCxNrgc");
        setField(term416076, term416076.getClass(), "firstRomVersion", "EeQPlviCiN");
        setField(term416076, term416076.getClass(), "firstDataVersion", "kEmsuIIuFj");
        setField(term416076, term416076.getClass(), "firstPlayDate", "GpkaYTEUvY");
        setField(term416076, term416076.getClass(), "lastGameId", "XVbdQOdeNY");
        setField(term416076, term416076.getClass(), "lastRomVersion", "hVpOQrwLiE");
        setField(term416076, term416076.getClass(), "lastDataVersion", "GptjdLlIRI");
        setField(term416076, term416076.getClass(), "compatibleCmVersion", "fZmnhgDPcz");
        setField(term416076, term416076.getClass(), "lastPlayDate", "VJCPmBPHZF");
        setIntField(term416076, term416076.getClass(), "lastPlaceId", -1238379431);
        setField(term416076, term416076.getClass(), "lastPlaceName", "XlIqpTOofA");
        setIntField(term416076, term416076.getClass(), "lastRegionId", -1060882373);
        setField(term416076, term416076.getClass(), "lastRegionName", "LpOCNuRXYF");
        setIntField(term416076, term416076.getClass(), "lastAllNetId", -2036164505);
        setField(term416076, term416076.getClass(), "lastClientId", "SkSQtSanSp");
        setIntField(term416076, term416076.getClass(), "lastUsedDeckId", -186621016);
        setIntField(term416076, term416076.getClass(), "lastPlayMusicLevel", 1192035255);
        setIntField(term416076, term416076.getClass(), "lastEmoneyBrand", 1572449370);
        setField(term416074, term416074.getClass(), "user", term416076);
        setIntField(term416074, term416074.getClass(), "musicId", 308970999);
        setIntField(term416074, term416074.getClass(), "level", 1168113632);
        setIntField(term416074, term416074.getClass(), "playCount", -1328188803);
        setIntField(term416074, term416074.getClass(), "techScoreMax", -1552264530);
        setIntField(term416074, term416074.getClass(), "techScoreRank", 528448952);
        setIntField(term416074, term416074.getClass(), "battleScoreMax", 991420239);
        setIntField(term416074, term416074.getClass(), "battleScoreRank", -1131431146);
        setIntField(term416074, term416074.getClass(), "maxComboCount", -1575550466);
        setIntField(term416074, term416074.getClass(), "maxOverKill", 1879476628);
        setIntField(term416074, term416074.getClass(), "maxTeamOverKill", 1504007508);
        setBooleanField(term416074, term416074.getClass(), "isFullBell", true);
        setBooleanField(term416074, term416074.getClass(), "isFullCombo", false);
        setBooleanField(term416074, term416074.getClass(), "isAllBreake", true);
        setBooleanField(term416074, term416074.getClass(), "isLock", true);
        setIntField(term416074, term416074.getClass(), "clearStatus", -1622967660);
        setBooleanField(term416074, term416074.getClass(), "isStoryWatched", true);
        term416355 = new Integer(1279666411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term416355;
        callMethod(klass, "setBattleScoreRank", argTypes, term416074, args);
    }

};


