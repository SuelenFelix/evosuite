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

public class UserEventMusic_getTechScoreMax_20120924697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372202;

    public UserEventMusic_getTechScoreMax_20120924697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term372208 = new Long(3831842879355381917L);
        term372202 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term372204 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term372206 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term372222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term372223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term372232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term372233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372237 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term372202, term372202.getClass(), "id", 601930651913677024L);
        setLongField(term372204, term372204.getClass(), "id", -1536923407745600121L);
        setLongField(term372206, term372206.getClass(), "id", -7904237724889841883L);
        setField(term372206, term372206.getClass(), "extId", term372208);
        setField(term372206, term372206.getClass(), "luid", "DrVsMeJTCu");
        setIntField(term372223, term372223.getClass(), "year", 2011);
        setShortField(term372223, term372223.getClass(), "month", (short) 4);
        setShortField(term372223, term372223.getClass(), "day", (short) 13);
        setField(term372222, term372222.getClass(), "date", term372223);
        setByteField(term372227, term372227.getClass(), "hour", (byte) 13);
        setByteField(term372227, term372227.getClass(), "minute", (byte) 34);
        setByteField(term372227, term372227.getClass(), "second", (byte) 31);
        setIntField(term372227, term372227.getClass(), "nano", 110060277);
        setField(term372222, term372222.getClass(), "time", term372227);
        setField(term372206, term372206.getClass(), "registerTime", term372222);
        setIntField(term372233, term372233.getClass(), "year", 2016);
        setShortField(term372233, term372233.getClass(), "month", (short) 11);
        setShortField(term372233, term372233.getClass(), "day", (short) 25);
        setField(term372232, term372232.getClass(), "date", term372233);
        setByteField(term372237, term372237.getClass(), "hour", (byte) 0);
        setByteField(term372237, term372237.getClass(), "minute", (byte) 48);
        setByteField(term372237, term372237.getClass(), "second", (byte) 33);
        setIntField(term372237, term372237.getClass(), "nano", 65903710);
        setField(term372232, term372232.getClass(), "time", term372237);
        setField(term372206, term372206.getClass(), "accessTime", term372232);
        setField(term372204, term372204.getClass(), "card", term372206);
        setField(term372204, term372204.getClass(), "userName", "FLxDyBgVYy");
        setIntField(term372204, term372204.getClass(), "level", -348449129);
        setIntField(term372204, term372204.getClass(), "reincarnationNum", 529553641);
        setLongField(term372204, term372204.getClass(), "exp", -6615286573288596946L);
        setLongField(term372204, term372204.getClass(), "point", -4638262231504085275L);
        setLongField(term372204, term372204.getClass(), "totalPoint", -2610467604436511556L);
        setIntField(term372204, term372204.getClass(), "playCount", 1724138080);
        setIntField(term372204, term372204.getClass(), "jewelCount", -1066572048);
        setIntField(term372204, term372204.getClass(), "totalJewelCount", 43866683);
        setIntField(term372204, term372204.getClass(), "medalCount", -1707921545);
        setIntField(term372204, term372204.getClass(), "playerRating", -1534375203);
        setIntField(term372204, term372204.getClass(), "highestRating", 1480343690);
        setIntField(term372204, term372204.getClass(), "battlePoint", -1098215055);
        setIntField(term372204, term372204.getClass(), "bestBattlePoint", 77663174);
        setIntField(term372204, term372204.getClass(), "overDamageBattlePoint", 1515468761);
        setBooleanField(term372204, term372204.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term372204, term372204.getClass(), "nameplateId", -415271155);
        setIntField(term372204, term372204.getClass(), "trophyId", -750808326);
        setIntField(term372204, term372204.getClass(), "cardId", -1639426950);
        setIntField(term372204, term372204.getClass(), "characterId", 1847870459);
        setIntField(term372204, term372204.getClass(), "characterVoiceNo", -1532947365);
        setIntField(term372204, term372204.getClass(), "tabSetting", 861236145);
        setIntField(term372204, term372204.getClass(), "tabSortSetting", 1953854770);
        setIntField(term372204, term372204.getClass(), "cardCategorySetting", -515393654);
        setIntField(term372204, term372204.getClass(), "cardSortSetting", 38070548);
        setIntField(term372204, term372204.getClass(), "rivalScoreCategorySetting", -1859518037);
        setIntField(term372204, term372204.getClass(), "playedTutorialBit", 463645914);
        setIntField(term372204, term372204.getClass(), "firstTutorialCancelNum", 2015115823);
        setLongField(term372204, term372204.getClass(), "sumTechHighScore", 3452055581415233931L);
        setLongField(term372204, term372204.getClass(), "sumTechBasicHighScore", 6816061373811401247L);
        setLongField(term372204, term372204.getClass(), "sumTechAdvancedHighScore", -7162474975028972631L);
        setLongField(term372204, term372204.getClass(), "sumTechExpertHighScore", -4041519536662781416L);
        setLongField(term372204, term372204.getClass(), "sumTechMasterHighScore", -9203397476289657503L);
        setLongField(term372204, term372204.getClass(), "sumTechLunaticHighScore", 951621450772564033L);
        setLongField(term372204, term372204.getClass(), "sumBattleHighScore", -398988771312714490L);
        setLongField(term372204, term372204.getClass(), "sumBattleBasicHighScore", -6087058565791164079L);
        setLongField(term372204, term372204.getClass(), "sumBattleAdvancedHighScore", 1986891041403070466L);
        setLongField(term372204, term372204.getClass(), "sumBattleExpertHighScore", -2473059188585285473L);
        setLongField(term372204, term372204.getClass(), "sumBattleMasterHighScore", 6731747097760212473L);
        setLongField(term372204, term372204.getClass(), "sumBattleLunaticHighScore", 2268472544235162084L);
        setField(term372204, term372204.getClass(), "eventWatchedDate", "VSpOFnXurK");
        setField(term372204, term372204.getClass(), "cmEventWatchedDate", "TJCTcbweDG");
        setField(term372204, term372204.getClass(), "firstGameId", "aINaTyGiau");
        setField(term372204, term372204.getClass(), "firstRomVersion", "plIOkAiMwJ");
        setField(term372204, term372204.getClass(), "firstDataVersion", "TsesWAlesh");
        setField(term372204, term372204.getClass(), "firstPlayDate", "IPdUbaiIeB");
        setField(term372204, term372204.getClass(), "lastGameId", "WoGLhyxdfV");
        setField(term372204, term372204.getClass(), "lastRomVersion", "NAeoJYQffb");
        setField(term372204, term372204.getClass(), "lastDataVersion", "frmOeQcldO");
        setField(term372204, term372204.getClass(), "compatibleCmVersion", "EXCyrcgGgy");
        setField(term372204, term372204.getClass(), "lastPlayDate", "BoePrBiFDx");
        setIntField(term372204, term372204.getClass(), "lastPlaceId", 1007908100);
        setField(term372204, term372204.getClass(), "lastPlaceName", "nqSnHrlKXP");
        setIntField(term372204, term372204.getClass(), "lastRegionId", -1853012582);
        setField(term372204, term372204.getClass(), "lastRegionName", "VMOQdMfgYP");
        setIntField(term372204, term372204.getClass(), "lastAllNetId", 499510589);
        setField(term372204, term372204.getClass(), "lastClientId", "pwrnkLXEmX");
        setIntField(term372204, term372204.getClass(), "lastUsedDeckId", 478674174);
        setIntField(term372204, term372204.getClass(), "lastPlayMusicLevel", -2010750244);
        setIntField(term372204, term372204.getClass(), "lastEmoneyBrand", 1741002353);
        setField(term372202, term372202.getClass(), "user", term372204);
        setIntField(term372202, term372202.getClass(), "eventId", 1826922461);
        setIntField(term372202, term372202.getClass(), "type", -1255472969);
        setIntField(term372202, term372202.getClass(), "musicId", -1164670172);
        setIntField(term372202, term372202.getClass(), "level", 788806477);
        setIntField(term372202, term372202.getClass(), "techScoreMax", 895378438);
        setIntField(term372202, term372202.getClass(), "platinumScoreMax", 1751645256);
        setField(term372202, term372202.getClass(), "techRecordDate", "nMcZZSwFPs");
        setBooleanField(term372202, term372202.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScoreMax", argTypes, term372202, args);
    }

};


