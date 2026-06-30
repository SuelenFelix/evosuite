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

public class UserKop_setId_180601300510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275431;
     Object term275725;

    public UserKop_setId_180601300510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275437 = new Long(5097769785635819744L);
        term275431 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term275433 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term275435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term275451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275466 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term275431, term275431.getClass(), "id", 8958523844182801555L);
        setLongField(term275433, term275433.getClass(), "id", -5370634325913369443L);
        setLongField(term275435, term275435.getClass(), "id", 3172754617115999258L);
        setField(term275435, term275435.getClass(), "extId", term275437);
        setField(term275435, term275435.getClass(), "luid", "qAoVvEtxnE");
        setIntField(term275452, term275452.getClass(), "year", 2013);
        setShortField(term275452, term275452.getClass(), "month", (short) 1);
        setShortField(term275452, term275452.getClass(), "day", (short) 1);
        setField(term275451, term275451.getClass(), "date", term275452);
        setByteField(term275456, term275456.getClass(), "hour", (byte) 23);
        setByteField(term275456, term275456.getClass(), "minute", (byte) 48);
        setByteField(term275456, term275456.getClass(), "second", (byte) 59);
        setIntField(term275456, term275456.getClass(), "nano", 211446868);
        setField(term275451, term275451.getClass(), "time", term275456);
        setField(term275435, term275435.getClass(), "registerTime", term275451);
        setIntField(term275462, term275462.getClass(), "year", 2012);
        setShortField(term275462, term275462.getClass(), "month", (short) 12);
        setShortField(term275462, term275462.getClass(), "day", (short) 21);
        setField(term275461, term275461.getClass(), "date", term275462);
        setByteField(term275466, term275466.getClass(), "hour", (byte) 0);
        setByteField(term275466, term275466.getClass(), "minute", (byte) 9);
        setByteField(term275466, term275466.getClass(), "second", (byte) 16);
        setIntField(term275466, term275466.getClass(), "nano", 344150131);
        setField(term275461, term275461.getClass(), "time", term275466);
        setField(term275435, term275435.getClass(), "accessTime", term275461);
        setField(term275433, term275433.getClass(), "card", term275435);
        setField(term275433, term275433.getClass(), "userName", "rXhHWXIrYT");
        setIntField(term275433, term275433.getClass(), "level", -533381129);
        setIntField(term275433, term275433.getClass(), "reincarnationNum", 1546616429);
        setLongField(term275433, term275433.getClass(), "exp", 7280844066232587956L);
        setLongField(term275433, term275433.getClass(), "point", 6101527964967183690L);
        setLongField(term275433, term275433.getClass(), "totalPoint", 550863938148788477L);
        setIntField(term275433, term275433.getClass(), "playCount", -1118279209);
        setIntField(term275433, term275433.getClass(), "jewelCount", 1759093333);
        setIntField(term275433, term275433.getClass(), "totalJewelCount", -2066077490);
        setIntField(term275433, term275433.getClass(), "medalCount", 1724222715);
        setIntField(term275433, term275433.getClass(), "playerRating", 296158792);
        setIntField(term275433, term275433.getClass(), "highestRating", 132497002);
        setIntField(term275433, term275433.getClass(), "battlePoint", 89033786);
        setIntField(term275433, term275433.getClass(), "bestBattlePoint", -1720491783);
        setIntField(term275433, term275433.getClass(), "overDamageBattlePoint", -740145325);
        setBooleanField(term275433, term275433.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term275433, term275433.getClass(), "nameplateId", 403564511);
        setIntField(term275433, term275433.getClass(), "trophyId", -518011071);
        setIntField(term275433, term275433.getClass(), "cardId", -11473506);
        setIntField(term275433, term275433.getClass(), "characterId", 984165021);
        setIntField(term275433, term275433.getClass(), "characterVoiceNo", 1330156234);
        setIntField(term275433, term275433.getClass(), "tabSetting", 621404274);
        setIntField(term275433, term275433.getClass(), "tabSortSetting", -502520589);
        setIntField(term275433, term275433.getClass(), "cardCategorySetting", -973774966);
        setIntField(term275433, term275433.getClass(), "cardSortSetting", 834522817);
        setIntField(term275433, term275433.getClass(), "rivalScoreCategorySetting", -347786272);
        setIntField(term275433, term275433.getClass(), "playedTutorialBit", 1060556162);
        setIntField(term275433, term275433.getClass(), "firstTutorialCancelNum", 959380706);
        setLongField(term275433, term275433.getClass(), "sumTechHighScore", -8060664115470734715L);
        setLongField(term275433, term275433.getClass(), "sumTechBasicHighScore", 847288150704981718L);
        setLongField(term275433, term275433.getClass(), "sumTechAdvancedHighScore", 7846897591824181919L);
        setLongField(term275433, term275433.getClass(), "sumTechExpertHighScore", -5656540365912860631L);
        setLongField(term275433, term275433.getClass(), "sumTechMasterHighScore", -5697641509048557664L);
        setLongField(term275433, term275433.getClass(), "sumTechLunaticHighScore", 11459664456333261L);
        setLongField(term275433, term275433.getClass(), "sumBattleHighScore", -7966363509507508793L);
        setLongField(term275433, term275433.getClass(), "sumBattleBasicHighScore", -8170709579257820116L);
        setLongField(term275433, term275433.getClass(), "sumBattleAdvancedHighScore", 5559447669412695762L);
        setLongField(term275433, term275433.getClass(), "sumBattleExpertHighScore", -8463695230560696795L);
        setLongField(term275433, term275433.getClass(), "sumBattleMasterHighScore", -7578977401060608644L);
        setLongField(term275433, term275433.getClass(), "sumBattleLunaticHighScore", -4720079533116855758L);
        setField(term275433, term275433.getClass(), "eventWatchedDate", "xScYUuGKsX");
        setField(term275433, term275433.getClass(), "cmEventWatchedDate", "trzXXmqsss");
        setField(term275433, term275433.getClass(), "firstGameId", "HWcsZwHzBJ");
        setField(term275433, term275433.getClass(), "firstRomVersion", "IXfEZVfVbn");
        setField(term275433, term275433.getClass(), "firstDataVersion", "ibOPAeVaEy");
        setField(term275433, term275433.getClass(), "firstPlayDate", "UQFCGhBwRP");
        setField(term275433, term275433.getClass(), "lastGameId", "IKUCiyluwb");
        setField(term275433, term275433.getClass(), "lastRomVersion", "OIVvPvythq");
        setField(term275433, term275433.getClass(), "lastDataVersion", "OIRXQPPjVx");
        setField(term275433, term275433.getClass(), "compatibleCmVersion", "SxVFmiOidb");
        setField(term275433, term275433.getClass(), "lastPlayDate", "BsiZGiodQR");
        setIntField(term275433, term275433.getClass(), "lastPlaceId", -326306383);
        setField(term275433, term275433.getClass(), "lastPlaceName", "oJyzXrwmfx");
        setIntField(term275433, term275433.getClass(), "lastRegionId", 540302191);
        setField(term275433, term275433.getClass(), "lastRegionName", "RsEXdKLcXN");
        setIntField(term275433, term275433.getClass(), "lastAllNetId", -609255604);
        setField(term275433, term275433.getClass(), "lastClientId", "zoOFEvSdRU");
        setIntField(term275433, term275433.getClass(), "lastUsedDeckId", -82613070);
        setIntField(term275433, term275433.getClass(), "lastPlayMusicLevel", -784469011);
        setIntField(term275433, term275433.getClass(), "lastEmoneyBrand", -1563306162);
        setField(term275431, term275431.getClass(), "user", term275433);
        setField(term275431, term275431.getClass(), "authKey", "WtywQPTOaF");
        setIntField(term275431, term275431.getClass(), "kopId", 1768487935);
        setIntField(term275431, term275431.getClass(), "areaId", -1396395408);
        setIntField(term275431, term275431.getClass(), "totalTechScore", 1098284426);
        setIntField(term275431, term275431.getClass(), "totalPlatinumScore", 1882274499);
        setField(term275431, term275431.getClass(), "techRecordDate", "MZMkZoDeKG");
        setBooleanField(term275431, term275431.getClass(), "isTotalTechNewRecord", true);
        term275725 = new Long(-9186517534702582457L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term275725;
        callMethod(klass, "setId", argTypes, term275431, args);
    }

};


