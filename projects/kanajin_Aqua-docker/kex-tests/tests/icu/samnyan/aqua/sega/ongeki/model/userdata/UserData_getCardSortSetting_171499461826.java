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

public class UserData_getCardSortSetting_171499461826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32916;

    public UserData_getCardSortSetting_171499461826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32920 = new Long(-7291743527973326814L);
        term32916 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term32918 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term32934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32949 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term32916, term32916.getClass(), "id", 7043650218274841102L);
        setLongField(term32918, term32918.getClass(), "id", -6096774034189525139L);
        setField(term32918, term32918.getClass(), "extId", term32920);
        setField(term32918, term32918.getClass(), "luid", "fheZXFNQZh");
        setIntField(term32935, term32935.getClass(), "year", 2015);
        setShortField(term32935, term32935.getClass(), "month", (short) 2);
        setShortField(term32935, term32935.getClass(), "day", (short) 1);
        setField(term32934, term32934.getClass(), "date", term32935);
        setByteField(term32939, term32939.getClass(), "hour", (byte) 11);
        setByteField(term32939, term32939.getClass(), "minute", (byte) 31);
        setByteField(term32939, term32939.getClass(), "second", (byte) 24);
        setIntField(term32939, term32939.getClass(), "nano", 461437823);
        setField(term32934, term32934.getClass(), "time", term32939);
        setField(term32918, term32918.getClass(), "registerTime", term32934);
        setIntField(term32945, term32945.getClass(), "year", 2012);
        setShortField(term32945, term32945.getClass(), "month", (short) 3);
        setShortField(term32945, term32945.getClass(), "day", (short) 12);
        setField(term32944, term32944.getClass(), "date", term32945);
        setByteField(term32949, term32949.getClass(), "hour", (byte) 0);
        setByteField(term32949, term32949.getClass(), "minute", (byte) 32);
        setByteField(term32949, term32949.getClass(), "second", (byte) 14);
        setIntField(term32949, term32949.getClass(), "nano", 342342345);
        setField(term32944, term32944.getClass(), "time", term32949);
        setField(term32918, term32918.getClass(), "accessTime", term32944);
        setField(term32916, term32916.getClass(), "card", term32918);
        setField(term32916, term32916.getClass(), "userName", "YxHVWlebna");
        setIntField(term32916, term32916.getClass(), "level", 145571200);
        setIntField(term32916, term32916.getClass(), "reincarnationNum", -81919234);
        setLongField(term32916, term32916.getClass(), "exp", -6476891479972746312L);
        setLongField(term32916, term32916.getClass(), "point", -366973868174666045L);
        setLongField(term32916, term32916.getClass(), "totalPoint", -7657074490059876332L);
        setIntField(term32916, term32916.getClass(), "playCount", 41779745);
        setIntField(term32916, term32916.getClass(), "jewelCount", 908188015);
        setIntField(term32916, term32916.getClass(), "totalJewelCount", 1448289766);
        setIntField(term32916, term32916.getClass(), "medalCount", 1377148923);
        setIntField(term32916, term32916.getClass(), "playerRating", 540775467);
        setIntField(term32916, term32916.getClass(), "highestRating", -2083028527);
        setIntField(term32916, term32916.getClass(), "battlePoint", 1631605263);
        setIntField(term32916, term32916.getClass(), "bestBattlePoint", -1378134881);
        setIntField(term32916, term32916.getClass(), "overDamageBattlePoint", -1887131478);
        setBooleanField(term32916, term32916.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term32916, term32916.getClass(), "nameplateId", 1916020077);
        setIntField(term32916, term32916.getClass(), "trophyId", -1842191454);
        setIntField(term32916, term32916.getClass(), "cardId", 384551988);
        setIntField(term32916, term32916.getClass(), "characterId", -2021521187);
        setIntField(term32916, term32916.getClass(), "characterVoiceNo", -2139205197);
        setIntField(term32916, term32916.getClass(), "tabSetting", -584949216);
        setIntField(term32916, term32916.getClass(), "tabSortSetting", 1646064199);
        setIntField(term32916, term32916.getClass(), "cardCategorySetting", -1135845415);
        setIntField(term32916, term32916.getClass(), "cardSortSetting", -1361921586);
        setIntField(term32916, term32916.getClass(), "rivalScoreCategorySetting", 593679468);
        setIntField(term32916, term32916.getClass(), "playedTutorialBit", 747491);
        setIntField(term32916, term32916.getClass(), "firstTutorialCancelNum", 734222768);
        setLongField(term32916, term32916.getClass(), "sumTechHighScore", -4773629433896348407L);
        setLongField(term32916, term32916.getClass(), "sumTechBasicHighScore", -5187796980288712037L);
        setLongField(term32916, term32916.getClass(), "sumTechAdvancedHighScore", 238025331923627916L);
        setLongField(term32916, term32916.getClass(), "sumTechExpertHighScore", -6163417416099720642L);
        setLongField(term32916, term32916.getClass(), "sumTechMasterHighScore", -4498877698180346473L);
        setLongField(term32916, term32916.getClass(), "sumTechLunaticHighScore", 4642147601851708039L);
        setLongField(term32916, term32916.getClass(), "sumBattleHighScore", 1425489182033961019L);
        setLongField(term32916, term32916.getClass(), "sumBattleBasicHighScore", -884853141515650306L);
        setLongField(term32916, term32916.getClass(), "sumBattleAdvancedHighScore", 5063961949952053841L);
        setLongField(term32916, term32916.getClass(), "sumBattleExpertHighScore", 5946931662340995277L);
        setLongField(term32916, term32916.getClass(), "sumBattleMasterHighScore", -519044061680044865L);
        setLongField(term32916, term32916.getClass(), "sumBattleLunaticHighScore", -5615015000728170842L);
        setField(term32916, term32916.getClass(), "eventWatchedDate", "IEmAQCkrPE");
        setField(term32916, term32916.getClass(), "cmEventWatchedDate", "lqFGhtlNRM");
        setField(term32916, term32916.getClass(), "firstGameId", "GLxLHUsuLw");
        setField(term32916, term32916.getClass(), "firstRomVersion", "HuKdqrrxIm");
        setField(term32916, term32916.getClass(), "firstDataVersion", "yJKKddLqMb");
        setField(term32916, term32916.getClass(), "firstPlayDate", "LWEYaXeKBe");
        setField(term32916, term32916.getClass(), "lastGameId", "cNoFvpHBHw");
        setField(term32916, term32916.getClass(), "lastRomVersion", "DoSWbCtsBg");
        setField(term32916, term32916.getClass(), "lastDataVersion", "NrXtkbXwDc");
        setField(term32916, term32916.getClass(), "compatibleCmVersion", "EUapSrAmOe");
        setField(term32916, term32916.getClass(), "lastPlayDate", "dUHylIprea");
        setIntField(term32916, term32916.getClass(), "lastPlaceId", 1545425140);
        setField(term32916, term32916.getClass(), "lastPlaceName", "FKDqHRpMcc");
        setIntField(term32916, term32916.getClass(), "lastRegionId", -1580765555);
        setField(term32916, term32916.getClass(), "lastRegionName", "mIRMQIxHUD");
        setIntField(term32916, term32916.getClass(), "lastAllNetId", -1295149055);
        setField(term32916, term32916.getClass(), "lastClientId", "FbBMtntDbw");
        setIntField(term32916, term32916.getClass(), "lastUsedDeckId", -769814321);
        setIntField(term32916, term32916.getClass(), "lastPlayMusicLevel", 114898432);
        setIntField(term32916, term32916.getClass(), "lastEmoneyBrand", -193767503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardSortSetting", argTypes, term32916, args);
    }

};


