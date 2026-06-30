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

public class ExternalUserData_getCardSortSetting_142485556323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105258;

    public ExternalUserData_getCardSortSetting_142485556323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105258 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term105258, term105258.getClass(), "accessCode", "DxxKHLavAQ");
        setField(term105258, term105258.getClass(), "userName", "NqNhMkhwDY");
        setIntField(term105258, term105258.getClass(), "level", 320468454);
        setIntField(term105258, term105258.getClass(), "reincarnationNum", 232349751);
        setLongField(term105258, term105258.getClass(), "exp", -2039415660848937066L);
        setLongField(term105258, term105258.getClass(), "point", -5288308497989947812L);
        setLongField(term105258, term105258.getClass(), "totalPoint", -7824771278445605005L);
        setIntField(term105258, term105258.getClass(), "playCount", 1894995620);
        setIntField(term105258, term105258.getClass(), "jewelCount", 567244523);
        setIntField(term105258, term105258.getClass(), "totalJewelCount", -758396509);
        setIntField(term105258, term105258.getClass(), "medalCount", -1667705696);
        setIntField(term105258, term105258.getClass(), "playerRating", 1890946426);
        setIntField(term105258, term105258.getClass(), "highestRating", -549128513);
        setIntField(term105258, term105258.getClass(), "battlePoint", 1350385544);
        setIntField(term105258, term105258.getClass(), "bestBattlePoint", -509568686);
        setIntField(term105258, term105258.getClass(), "overDamageBattlePoint", 1225095501);
        setIntField(term105258, term105258.getClass(), "nameplateId", -832770220);
        setIntField(term105258, term105258.getClass(), "trophyId", -1608766021);
        setIntField(term105258, term105258.getClass(), "cardId", -1069226182);
        setIntField(term105258, term105258.getClass(), "characterId", -1860249845);
        setIntField(term105258, term105258.getClass(), "tabSetting", 1922007857);
        setIntField(term105258, term105258.getClass(), "tabSortSetting", -1896359397);
        setIntField(term105258, term105258.getClass(), "cardCategorySetting", 365210604);
        setIntField(term105258, term105258.getClass(), "cardSortSetting", -81161640);
        setIntField(term105258, term105258.getClass(), "rivalScoreCategorySetting", 1398765046);
        setIntField(term105258, term105258.getClass(), "playedTutorialBit", -664153656);
        setIntField(term105258, term105258.getClass(), "firstTutorialCancelNum", -58858278);
        setLongField(term105258, term105258.getClass(), "sumTechHighScore", 3924227041181820339L);
        setLongField(term105258, term105258.getClass(), "sumTechBasicHighScore", 6299628643468364230L);
        setLongField(term105258, term105258.getClass(), "sumTechAdvancedHighScore", -3437796750132882567L);
        setLongField(term105258, term105258.getClass(), "sumTechExpertHighScore", -8883327576327176872L);
        setLongField(term105258, term105258.getClass(), "sumTechMasterHighScore", 545211381451685619L);
        setLongField(term105258, term105258.getClass(), "sumTechLunaticHighScore", -1424170915126137744L);
        setLongField(term105258, term105258.getClass(), "sumBattleHighScore", -7090976603783369130L);
        setLongField(term105258, term105258.getClass(), "sumBattleBasicHighScore", 2105547361973674685L);
        setLongField(term105258, term105258.getClass(), "sumBattleAdvancedHighScore", 5193414351788523845L);
        setLongField(term105258, term105258.getClass(), "sumBattleExpertHighScore", -7203259019783668358L);
        setLongField(term105258, term105258.getClass(), "sumBattleMasterHighScore", -5482859863685894248L);
        setLongField(term105258, term105258.getClass(), "sumBattleLunaticHighScore", -1774467958123998772L);
        setField(term105258, term105258.getClass(), "eventWatchedDate", "dYQImRUWxM");
        setField(term105258, term105258.getClass(), "cmEventWatchedDate", "YeqJmNmIIY");
        setField(term105258, term105258.getClass(), "firstGameId", "hcZXAXYxdU");
        setField(term105258, term105258.getClass(), "firstRomVersion", "zdxKnjrAdp");
        setField(term105258, term105258.getClass(), "firstDataVersion", "HzjGAUNELB");
        setField(term105258, term105258.getClass(), "firstPlayDate", "HGSQVJCxul");
        setField(term105258, term105258.getClass(), "lastGameId", "uIugAGTulK");
        setField(term105258, term105258.getClass(), "lastRomVersion", "LDtphCRvpE");
        setField(term105258, term105258.getClass(), "lastDataVersion", "bhNizQfATc");
        setField(term105258, term105258.getClass(), "compatibleCmVersion", "tOMKZFAgFD");
        setField(term105258, term105258.getClass(), "lastPlayDate", "GOiBZeyBWd");
        setIntField(term105258, term105258.getClass(), "lastPlaceId", 660951730);
        setField(term105258, term105258.getClass(), "lastPlaceName", "nUoGYOdMrB");
        setIntField(term105258, term105258.getClass(), "lastRegionId", 1541643440);
        setField(term105258, term105258.getClass(), "lastRegionName", "nIJRcJvBkb");
        setIntField(term105258, term105258.getClass(), "lastAllNetId", -1279904536);
        setField(term105258, term105258.getClass(), "lastClientId", "uXKYJaaymx");
        setIntField(term105258, term105258.getClass(), "lastUsedDeckId", -1993344574);
        setIntField(term105258, term105258.getClass(), "lastPlayMusicLevel", -778160427);
        setIntField(term105258, term105258.getClass(), "lastEmoneyBrand", -1912176787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardSortSetting", argTypes, term105258, args);
    }

};


