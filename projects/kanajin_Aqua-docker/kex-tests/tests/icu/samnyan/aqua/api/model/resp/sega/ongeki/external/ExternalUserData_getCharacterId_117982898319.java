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

public class ExternalUserData_getCharacterId_117982898319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103674;

    public ExternalUserData_getCharacterId_117982898319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103674 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term103674, term103674.getClass(), "accessCode", "HSusXQYBHP");
        setField(term103674, term103674.getClass(), "userName", "FLPhtvtLOq");
        setIntField(term103674, term103674.getClass(), "level", -699063940);
        setIntField(term103674, term103674.getClass(), "reincarnationNum", -1534836282);
        setLongField(term103674, term103674.getClass(), "exp", 933166127036935939L);
        setLongField(term103674, term103674.getClass(), "point", 778070503698107839L);
        setLongField(term103674, term103674.getClass(), "totalPoint", 3768864628757510145L);
        setIntField(term103674, term103674.getClass(), "playCount", -615320596);
        setIntField(term103674, term103674.getClass(), "jewelCount", 1009353606);
        setIntField(term103674, term103674.getClass(), "totalJewelCount", 2119724919);
        setIntField(term103674, term103674.getClass(), "medalCount", -270619364);
        setIntField(term103674, term103674.getClass(), "playerRating", -2129714346);
        setIntField(term103674, term103674.getClass(), "highestRating", 1734631443);
        setIntField(term103674, term103674.getClass(), "battlePoint", 1849033992);
        setIntField(term103674, term103674.getClass(), "bestBattlePoint", 2024051849);
        setIntField(term103674, term103674.getClass(), "overDamageBattlePoint", -861723623);
        setIntField(term103674, term103674.getClass(), "nameplateId", 496159678);
        setIntField(term103674, term103674.getClass(), "trophyId", 1276659733);
        setIntField(term103674, term103674.getClass(), "cardId", -1291400151);
        setIntField(term103674, term103674.getClass(), "characterId", 1243558732);
        setIntField(term103674, term103674.getClass(), "tabSetting", -1080536959);
        setIntField(term103674, term103674.getClass(), "tabSortSetting", -2133284530);
        setIntField(term103674, term103674.getClass(), "cardCategorySetting", -1891876210);
        setIntField(term103674, term103674.getClass(), "cardSortSetting", -547162550);
        setIntField(term103674, term103674.getClass(), "rivalScoreCategorySetting", -1885733949);
        setIntField(term103674, term103674.getClass(), "playedTutorialBit", -456319819);
        setIntField(term103674, term103674.getClass(), "firstTutorialCancelNum", 955574517);
        setLongField(term103674, term103674.getClass(), "sumTechHighScore", -6796635995012351438L);
        setLongField(term103674, term103674.getClass(), "sumTechBasicHighScore", -3179135527747206068L);
        setLongField(term103674, term103674.getClass(), "sumTechAdvancedHighScore", -4951536499363469726L);
        setLongField(term103674, term103674.getClass(), "sumTechExpertHighScore", 7374998902411388045L);
        setLongField(term103674, term103674.getClass(), "sumTechMasterHighScore", -2001340366695650392L);
        setLongField(term103674, term103674.getClass(), "sumTechLunaticHighScore", -6724266774522277260L);
        setLongField(term103674, term103674.getClass(), "sumBattleHighScore", -3629055115799732458L);
        setLongField(term103674, term103674.getClass(), "sumBattleBasicHighScore", -7531060248188268768L);
        setLongField(term103674, term103674.getClass(), "sumBattleAdvancedHighScore", -2868282596086632333L);
        setLongField(term103674, term103674.getClass(), "sumBattleExpertHighScore", 3768900472924603331L);
        setLongField(term103674, term103674.getClass(), "sumBattleMasterHighScore", -3304218531907046012L);
        setLongField(term103674, term103674.getClass(), "sumBattleLunaticHighScore", -5743716942084093819L);
        setField(term103674, term103674.getClass(), "eventWatchedDate", "cxAGzDzZQN");
        setField(term103674, term103674.getClass(), "cmEventWatchedDate", "kLSNOkINAm");
        setField(term103674, term103674.getClass(), "firstGameId", "zBRdYuXoYN");
        setField(term103674, term103674.getClass(), "firstRomVersion", "QYODvhTpQJ");
        setField(term103674, term103674.getClass(), "firstDataVersion", "QxcqbPoIvu");
        setField(term103674, term103674.getClass(), "firstPlayDate", "vUsvTwohxq");
        setField(term103674, term103674.getClass(), "lastGameId", "tQuxnkgzhp");
        setField(term103674, term103674.getClass(), "lastRomVersion", "dpIzWZNQDh");
        setField(term103674, term103674.getClass(), "lastDataVersion", "YrrjhuglXQ");
        setField(term103674, term103674.getClass(), "compatibleCmVersion", "dvgcgrRaHQ");
        setField(term103674, term103674.getClass(), "lastPlayDate", "qrWIaBYkls");
        setIntField(term103674, term103674.getClass(), "lastPlaceId", -1265037091);
        setField(term103674, term103674.getClass(), "lastPlaceName", "EPvofivIjz");
        setIntField(term103674, term103674.getClass(), "lastRegionId", 1471259557);
        setField(term103674, term103674.getClass(), "lastRegionName", "gtuyMVdtqK");
        setIntField(term103674, term103674.getClass(), "lastAllNetId", -1948903841);
        setField(term103674, term103674.getClass(), "lastClientId", "IruzBrBJdj");
        setIntField(term103674, term103674.getClass(), "lastUsedDeckId", -2028574022);
        setIntField(term103674, term103674.getClass(), "lastPlayMusicLevel", 190019992);
        setIntField(term103674, term103674.getClass(), "lastEmoneyBrand", -117461604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term103674, args);
    }

};


