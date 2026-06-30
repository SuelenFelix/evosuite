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

public class ExternalUserData_setLastGameId_1308379169104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137584;

    public ExternalUserData_setLastGameId_1308379169104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137584 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term137584, term137584.getClass(), "accessCode", "TXUHNeqATO");
        setField(term137584, term137584.getClass(), "userName", "nthSEPyTbL");
        setIntField(term137584, term137584.getClass(), "level", 1330818286);
        setIntField(term137584, term137584.getClass(), "reincarnationNum", -595356901);
        setLongField(term137584, term137584.getClass(), "exp", 3993438830346485693L);
        setLongField(term137584, term137584.getClass(), "point", -6011786073120489306L);
        setLongField(term137584, term137584.getClass(), "totalPoint", 48519824410961186L);
        setIntField(term137584, term137584.getClass(), "playCount", -321952234);
        setIntField(term137584, term137584.getClass(), "jewelCount", 139891931);
        setIntField(term137584, term137584.getClass(), "totalJewelCount", 1133521350);
        setIntField(term137584, term137584.getClass(), "medalCount", -1286291229);
        setIntField(term137584, term137584.getClass(), "playerRating", 165168836);
        setIntField(term137584, term137584.getClass(), "highestRating", 662132274);
        setIntField(term137584, term137584.getClass(), "battlePoint", 569068892);
        setIntField(term137584, term137584.getClass(), "bestBattlePoint", 1732439601);
        setIntField(term137584, term137584.getClass(), "overDamageBattlePoint", 493113664);
        setIntField(term137584, term137584.getClass(), "nameplateId", -489970199);
        setIntField(term137584, term137584.getClass(), "trophyId", -1844524611);
        setIntField(term137584, term137584.getClass(), "cardId", 97678785);
        setIntField(term137584, term137584.getClass(), "characterId", -1082619101);
        setIntField(term137584, term137584.getClass(), "tabSetting", 535264383);
        setIntField(term137584, term137584.getClass(), "tabSortSetting", 348869275);
        setIntField(term137584, term137584.getClass(), "cardCategorySetting", 670352277);
        setIntField(term137584, term137584.getClass(), "cardSortSetting", -1743182411);
        setIntField(term137584, term137584.getClass(), "rivalScoreCategorySetting", 859817472);
        setIntField(term137584, term137584.getClass(), "playedTutorialBit", 23554421);
        setIntField(term137584, term137584.getClass(), "firstTutorialCancelNum", -409298867);
        setLongField(term137584, term137584.getClass(), "sumTechHighScore", -6689264245592072245L);
        setLongField(term137584, term137584.getClass(), "sumTechBasicHighScore", 4697044943381684273L);
        setLongField(term137584, term137584.getClass(), "sumTechAdvancedHighScore", 1549144135965512577L);
        setLongField(term137584, term137584.getClass(), "sumTechExpertHighScore", 3927026989340465099L);
        setLongField(term137584, term137584.getClass(), "sumTechMasterHighScore", 2168942126652777458L);
        setLongField(term137584, term137584.getClass(), "sumTechLunaticHighScore", 1102876396054150225L);
        setLongField(term137584, term137584.getClass(), "sumBattleHighScore", 303286486204394639L);
        setLongField(term137584, term137584.getClass(), "sumBattleBasicHighScore", 5106580808507029829L);
        setLongField(term137584, term137584.getClass(), "sumBattleAdvancedHighScore", 3533518777824419926L);
        setLongField(term137584, term137584.getClass(), "sumBattleExpertHighScore", 2437598616361262384L);
        setLongField(term137584, term137584.getClass(), "sumBattleMasterHighScore", 7006760935837945426L);
        setLongField(term137584, term137584.getClass(), "sumBattleLunaticHighScore", 3915191688379292613L);
        setField(term137584, term137584.getClass(), "eventWatchedDate", "TxeqOUPRHc");
        setField(term137584, term137584.getClass(), "cmEventWatchedDate", "fTznIqOtFV");
        setField(term137584, term137584.getClass(), "firstGameId", "vKEhEaEszK");
        setField(term137584, term137584.getClass(), "firstRomVersion", "sTFtRMhWYu");
        setField(term137584, term137584.getClass(), "firstDataVersion", "sEgFNJPHQu");
        setField(term137584, term137584.getClass(), "firstPlayDate", "LadAxADciE");
        setField(term137584, term137584.getClass(), "lastGameId", "rkjXosTvbN");
        setField(term137584, term137584.getClass(), "lastRomVersion", "nBAtVlfxeb");
        setField(term137584, term137584.getClass(), "lastDataVersion", "GlDhJkLHgd");
        setField(term137584, term137584.getClass(), "compatibleCmVersion", "ExORPbJoGL");
        setField(term137584, term137584.getClass(), "lastPlayDate", "mkFNmDEjgR");
        setIntField(term137584, term137584.getClass(), "lastPlaceId", 1081974961);
        setField(term137584, term137584.getClass(), "lastPlaceName", "dRHBhjcXmK");
        setIntField(term137584, term137584.getClass(), "lastRegionId", -1622587529);
        setField(term137584, term137584.getClass(), "lastRegionName", "uUtZwutIHm");
        setIntField(term137584, term137584.getClass(), "lastAllNetId", -958576652);
        setField(term137584, term137584.getClass(), "lastClientId", "IMGXNDMtcP");
        setIntField(term137584, term137584.getClass(), "lastUsedDeckId", 332836283);
        setIntField(term137584, term137584.getClass(), "lastPlayMusicLevel", -1507994294);
        setIntField(term137584, term137584.getClass(), "lastEmoneyBrand", -1734613088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KnDWMwFoOA";
        callMethod(klass, "setLastGameId", argTypes, term137584, args);
    }

};


