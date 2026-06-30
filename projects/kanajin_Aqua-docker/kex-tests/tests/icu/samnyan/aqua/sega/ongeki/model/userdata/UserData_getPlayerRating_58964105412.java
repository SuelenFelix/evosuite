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

public class UserData_getPlayerRating_58964105412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26994;

    public UserData_getPlayerRating_58964105412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26998 = new Long(7994303628307559416L);
        term26994 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term26996 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27027 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26994, term26994.getClass(), "id", 3218173944566395082L);
        setLongField(term26996, term26996.getClass(), "id", -3694649475237271412L);
        setField(term26996, term26996.getClass(), "extId", term26998);
        setField(term26996, term26996.getClass(), "luid", "ZiyMvLArWJ");
        setIntField(term27013, term27013.getClass(), "year", 2014);
        setShortField(term27013, term27013.getClass(), "month", (short) 1);
        setShortField(term27013, term27013.getClass(), "day", (short) 26);
        setField(term27012, term27012.getClass(), "date", term27013);
        setByteField(term27017, term27017.getClass(), "hour", (byte) 3);
        setByteField(term27017, term27017.getClass(), "minute", (byte) 31);
        setByteField(term27017, term27017.getClass(), "second", (byte) 56);
        setIntField(term27017, term27017.getClass(), "nano", 100873602);
        setField(term27012, term27012.getClass(), "time", term27017);
        setField(term26996, term26996.getClass(), "registerTime", term27012);
        setIntField(term27023, term27023.getClass(), "year", 2021);
        setShortField(term27023, term27023.getClass(), "month", (short) 12);
        setShortField(term27023, term27023.getClass(), "day", (short) 1);
        setField(term27022, term27022.getClass(), "date", term27023);
        setByteField(term27027, term27027.getClass(), "hour", (byte) 15);
        setByteField(term27027, term27027.getClass(), "minute", (byte) 30);
        setByteField(term27027, term27027.getClass(), "second", (byte) 5);
        setIntField(term27027, term27027.getClass(), "nano", 996341606);
        setField(term27022, term27022.getClass(), "time", term27027);
        setField(term26996, term26996.getClass(), "accessTime", term27022);
        setField(term26994, term26994.getClass(), "card", term26996);
        setField(term26994, term26994.getClass(), "userName", "MaeokjEfWD");
        setIntField(term26994, term26994.getClass(), "level", -21429773);
        setIntField(term26994, term26994.getClass(), "reincarnationNum", 1774728742);
        setLongField(term26994, term26994.getClass(), "exp", 5323722289713523213L);
        setLongField(term26994, term26994.getClass(), "point", 4496648256608157890L);
        setLongField(term26994, term26994.getClass(), "totalPoint", 3615978191092655321L);
        setIntField(term26994, term26994.getClass(), "playCount", -1822211508);
        setIntField(term26994, term26994.getClass(), "jewelCount", -177243872);
        setIntField(term26994, term26994.getClass(), "totalJewelCount", 1485047282);
        setIntField(term26994, term26994.getClass(), "medalCount", 1624190794);
        setIntField(term26994, term26994.getClass(), "playerRating", -773608881);
        setIntField(term26994, term26994.getClass(), "highestRating", -1642688455);
        setIntField(term26994, term26994.getClass(), "battlePoint", -1184558215);
        setIntField(term26994, term26994.getClass(), "bestBattlePoint", 2123688338);
        setIntField(term26994, term26994.getClass(), "overDamageBattlePoint", -1051941387);
        setBooleanField(term26994, term26994.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term26994, term26994.getClass(), "nameplateId", -640763660);
        setIntField(term26994, term26994.getClass(), "trophyId", -1189468129);
        setIntField(term26994, term26994.getClass(), "cardId", -1099664830);
        setIntField(term26994, term26994.getClass(), "characterId", 873502011);
        setIntField(term26994, term26994.getClass(), "characterVoiceNo", -2004575734);
        setIntField(term26994, term26994.getClass(), "tabSetting", 1491468856);
        setIntField(term26994, term26994.getClass(), "tabSortSetting", 962385185);
        setIntField(term26994, term26994.getClass(), "cardCategorySetting", 2146718886);
        setIntField(term26994, term26994.getClass(), "cardSortSetting", -985577036);
        setIntField(term26994, term26994.getClass(), "rivalScoreCategorySetting", 802539130);
        setIntField(term26994, term26994.getClass(), "playedTutorialBit", 2105146188);
        setIntField(term26994, term26994.getClass(), "firstTutorialCancelNum", -862415480);
        setLongField(term26994, term26994.getClass(), "sumTechHighScore", -8950106037310251203L);
        setLongField(term26994, term26994.getClass(), "sumTechBasicHighScore", -2967233328786457154L);
        setLongField(term26994, term26994.getClass(), "sumTechAdvancedHighScore", 3081163056749096636L);
        setLongField(term26994, term26994.getClass(), "sumTechExpertHighScore", 8461184996981583369L);
        setLongField(term26994, term26994.getClass(), "sumTechMasterHighScore", 8327650518139070689L);
        setLongField(term26994, term26994.getClass(), "sumTechLunaticHighScore", 928851110761968932L);
        setLongField(term26994, term26994.getClass(), "sumBattleHighScore", 3746407492061591608L);
        setLongField(term26994, term26994.getClass(), "sumBattleBasicHighScore", -8815714356297321412L);
        setLongField(term26994, term26994.getClass(), "sumBattleAdvancedHighScore", -4738455258060622217L);
        setLongField(term26994, term26994.getClass(), "sumBattleExpertHighScore", -6514877903832915932L);
        setLongField(term26994, term26994.getClass(), "sumBattleMasterHighScore", -6735965016116114681L);
        setLongField(term26994, term26994.getClass(), "sumBattleLunaticHighScore", 4813306236521164153L);
        setField(term26994, term26994.getClass(), "eventWatchedDate", "ocZcumnXEz");
        setField(term26994, term26994.getClass(), "cmEventWatchedDate", "rNNwyactDR");
        setField(term26994, term26994.getClass(), "firstGameId", "QJrTMTdxyh");
        setField(term26994, term26994.getClass(), "firstRomVersion", "rgZSPplPSs");
        setField(term26994, term26994.getClass(), "firstDataVersion", "NPUSTXlEKx");
        setField(term26994, term26994.getClass(), "firstPlayDate", "KKFprGoNpl");
        setField(term26994, term26994.getClass(), "lastGameId", "tWVISJlxKZ");
        setField(term26994, term26994.getClass(), "lastRomVersion", "rOZkUKEoaf");
        setField(term26994, term26994.getClass(), "lastDataVersion", "yLnzGqyHGL");
        setField(term26994, term26994.getClass(), "compatibleCmVersion", "IjprPXBDuY");
        setField(term26994, term26994.getClass(), "lastPlayDate", "wkqPmmFDAa");
        setIntField(term26994, term26994.getClass(), "lastPlaceId", 312605349);
        setField(term26994, term26994.getClass(), "lastPlaceName", "rLTDtNqLyW");
        setIntField(term26994, term26994.getClass(), "lastRegionId", -402072606);
        setField(term26994, term26994.getClass(), "lastRegionName", "CLsbWobdgS");
        setIntField(term26994, term26994.getClass(), "lastAllNetId", -477355193);
        setField(term26994, term26994.getClass(), "lastClientId", "TbYrjEyFPc");
        setIntField(term26994, term26994.getClass(), "lastUsedDeckId", 168425089);
        setIntField(term26994, term26994.getClass(), "lastPlayMusicLevel", -571931590);
        setIntField(term26994, term26994.getClass(), "lastEmoneyBrand", 37757400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term26994, args);
    }

};


