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

public class ExternalUserData_getLastDataVersion_189316891247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114762;

    public ExternalUserData_getLastDataVersion_189316891247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114762 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term114762, term114762.getClass(), "accessCode", "QyXPOZhljS");
        setField(term114762, term114762.getClass(), "userName", "PScfXNamhZ");
        setIntField(term114762, term114762.getClass(), "level", -599954481);
        setIntField(term114762, term114762.getClass(), "reincarnationNum", -450993923);
        setLongField(term114762, term114762.getClass(), "exp", 5775461462976695025L);
        setLongField(term114762, term114762.getClass(), "point", 6397334634655139359L);
        setLongField(term114762, term114762.getClass(), "totalPoint", -4344083315626652780L);
        setIntField(term114762, term114762.getClass(), "playCount", -2071467456);
        setIntField(term114762, term114762.getClass(), "jewelCount", -399610727);
        setIntField(term114762, term114762.getClass(), "totalJewelCount", -1144920544);
        setIntField(term114762, term114762.getClass(), "medalCount", 124660995);
        setIntField(term114762, term114762.getClass(), "playerRating", -1887962228);
        setIntField(term114762, term114762.getClass(), "highestRating", -1636384139);
        setIntField(term114762, term114762.getClass(), "battlePoint", 1793478047);
        setIntField(term114762, term114762.getClass(), "bestBattlePoint", -1902327688);
        setIntField(term114762, term114762.getClass(), "overDamageBattlePoint", 121552739);
        setIntField(term114762, term114762.getClass(), "nameplateId", -880858485);
        setIntField(term114762, term114762.getClass(), "trophyId", -171196629);
        setIntField(term114762, term114762.getClass(), "cardId", -1663654535);
        setIntField(term114762, term114762.getClass(), "characterId", -1633470210);
        setIntField(term114762, term114762.getClass(), "tabSetting", -966053658);
        setIntField(term114762, term114762.getClass(), "tabSortSetting", 1247820029);
        setIntField(term114762, term114762.getClass(), "cardCategorySetting", -1954018322);
        setIntField(term114762, term114762.getClass(), "cardSortSetting", 98202858);
        setIntField(term114762, term114762.getClass(), "rivalScoreCategorySetting", 1369364679);
        setIntField(term114762, term114762.getClass(), "playedTutorialBit", -1167528911);
        setIntField(term114762, term114762.getClass(), "firstTutorialCancelNum", 749627066);
        setLongField(term114762, term114762.getClass(), "sumTechHighScore", -3763600317941289238L);
        setLongField(term114762, term114762.getClass(), "sumTechBasicHighScore", 5244740187149398229L);
        setLongField(term114762, term114762.getClass(), "sumTechAdvancedHighScore", 718471511380285893L);
        setLongField(term114762, term114762.getClass(), "sumTechExpertHighScore", -3607019980089365498L);
        setLongField(term114762, term114762.getClass(), "sumTechMasterHighScore", 822276414731142092L);
        setLongField(term114762, term114762.getClass(), "sumTechLunaticHighScore", 8089248698485794254L);
        setLongField(term114762, term114762.getClass(), "sumBattleHighScore", 3711721846786904409L);
        setLongField(term114762, term114762.getClass(), "sumBattleBasicHighScore", 5224036234170448136L);
        setLongField(term114762, term114762.getClass(), "sumBattleAdvancedHighScore", -2746894021637841534L);
        setLongField(term114762, term114762.getClass(), "sumBattleExpertHighScore", -4811828139614324758L);
        setLongField(term114762, term114762.getClass(), "sumBattleMasterHighScore", 492526995924434406L);
        setLongField(term114762, term114762.getClass(), "sumBattleLunaticHighScore", 3040101547176632170L);
        setField(term114762, term114762.getClass(), "eventWatchedDate", "aIZQFkeqSV");
        setField(term114762, term114762.getClass(), "cmEventWatchedDate", "xxIbflesWW");
        setField(term114762, term114762.getClass(), "firstGameId", "QYXuwfWiLr");
        setField(term114762, term114762.getClass(), "firstRomVersion", "zxbwScKVek");
        setField(term114762, term114762.getClass(), "firstDataVersion", "ZyCkexIIwm");
        setField(term114762, term114762.getClass(), "firstPlayDate", "YYiVhULvXY");
        setField(term114762, term114762.getClass(), "lastGameId", "NhRgTGFWmB");
        setField(term114762, term114762.getClass(), "lastRomVersion", "rOBKHPZFnU");
        setField(term114762, term114762.getClass(), "lastDataVersion", "IkFYovCTgb");
        setField(term114762, term114762.getClass(), "compatibleCmVersion", "RVIVmNguKP");
        setField(term114762, term114762.getClass(), "lastPlayDate", "fSUwhYHvGR");
        setIntField(term114762, term114762.getClass(), "lastPlaceId", 158474288);
        setField(term114762, term114762.getClass(), "lastPlaceName", "sAWmTYzZBk");
        setIntField(term114762, term114762.getClass(), "lastRegionId", 362499837);
        setField(term114762, term114762.getClass(), "lastRegionName", "tZvhNWcNUv");
        setIntField(term114762, term114762.getClass(), "lastAllNetId", -786324858);
        setField(term114762, term114762.getClass(), "lastClientId", "yDgSLJiiaz");
        setIntField(term114762, term114762.getClass(), "lastUsedDeckId", -1110134738);
        setIntField(term114762, term114762.getClass(), "lastPlayMusicLevel", 1680534965);
        setIntField(term114762, term114762.getClass(), "lastEmoneyBrand", 1648618873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term114762, args);
    }

};


