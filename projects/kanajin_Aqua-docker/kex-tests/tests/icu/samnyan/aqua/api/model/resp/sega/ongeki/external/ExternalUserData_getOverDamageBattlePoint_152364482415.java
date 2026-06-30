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

public class ExternalUserData_getOverDamageBattlePoint_152364482415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102090;

    public ExternalUserData_getOverDamageBattlePoint_152364482415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102090 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term102090, term102090.getClass(), "accessCode", "VhWamhmJkG");
        setField(term102090, term102090.getClass(), "userName", "wAooJbXKDp");
        setIntField(term102090, term102090.getClass(), "level", -1304849956);
        setIntField(term102090, term102090.getClass(), "reincarnationNum", -470529597);
        setLongField(term102090, term102090.getClass(), "exp", -8086360537435351230L);
        setLongField(term102090, term102090.getClass(), "point", 5165854032880293294L);
        setLongField(term102090, term102090.getClass(), "totalPoint", 2615686874066328070L);
        setIntField(term102090, term102090.getClass(), "playCount", -576113658);
        setIntField(term102090, term102090.getClass(), "jewelCount", 561781134);
        setIntField(term102090, term102090.getClass(), "totalJewelCount", -1650485890);
        setIntField(term102090, term102090.getClass(), "medalCount", -1724210968);
        setIntField(term102090, term102090.getClass(), "playerRating", -1009071033);
        setIntField(term102090, term102090.getClass(), "highestRating", -1736858487);
        setIntField(term102090, term102090.getClass(), "battlePoint", -595268504);
        setIntField(term102090, term102090.getClass(), "bestBattlePoint", 1825456872);
        setIntField(term102090, term102090.getClass(), "overDamageBattlePoint", 1789979680);
        setIntField(term102090, term102090.getClass(), "nameplateId", -523619566);
        setIntField(term102090, term102090.getClass(), "trophyId", 261762175);
        setIntField(term102090, term102090.getClass(), "cardId", 739203659);
        setIntField(term102090, term102090.getClass(), "characterId", 293964561);
        setIntField(term102090, term102090.getClass(), "tabSetting", -704904230);
        setIntField(term102090, term102090.getClass(), "tabSortSetting", -979479163);
        setIntField(term102090, term102090.getClass(), "cardCategorySetting", -903346718);
        setIntField(term102090, term102090.getClass(), "cardSortSetting", -1151949200);
        setIntField(term102090, term102090.getClass(), "rivalScoreCategorySetting", 1790267210);
        setIntField(term102090, term102090.getClass(), "playedTutorialBit", 153692829);
        setIntField(term102090, term102090.getClass(), "firstTutorialCancelNum", -1991176715);
        setLongField(term102090, term102090.getClass(), "sumTechHighScore", 749986994143010909L);
        setLongField(term102090, term102090.getClass(), "sumTechBasicHighScore", -5610923948186923865L);
        setLongField(term102090, term102090.getClass(), "sumTechAdvancedHighScore", 6863726040287841526L);
        setLongField(term102090, term102090.getClass(), "sumTechExpertHighScore", -7493572270081168323L);
        setLongField(term102090, term102090.getClass(), "sumTechMasterHighScore", -1116229180112055302L);
        setLongField(term102090, term102090.getClass(), "sumTechLunaticHighScore", 1976943265485923698L);
        setLongField(term102090, term102090.getClass(), "sumBattleHighScore", -4020415065526048923L);
        setLongField(term102090, term102090.getClass(), "sumBattleBasicHighScore", 8778345812083053413L);
        setLongField(term102090, term102090.getClass(), "sumBattleAdvancedHighScore", 6204558253499196979L);
        setLongField(term102090, term102090.getClass(), "sumBattleExpertHighScore", -952147836925065007L);
        setLongField(term102090, term102090.getClass(), "sumBattleMasterHighScore", 4031766487864198182L);
        setLongField(term102090, term102090.getClass(), "sumBattleLunaticHighScore", 1105479031792764782L);
        setField(term102090, term102090.getClass(), "eventWatchedDate", "CmeJChKlxD");
        setField(term102090, term102090.getClass(), "cmEventWatchedDate", "ykMBkjJHCt");
        setField(term102090, term102090.getClass(), "firstGameId", "MSGfPDgvSC");
        setField(term102090, term102090.getClass(), "firstRomVersion", "gIVxxnuVFq");
        setField(term102090, term102090.getClass(), "firstDataVersion", "rHnHNeNRWU");
        setField(term102090, term102090.getClass(), "firstPlayDate", "qStzbctyLJ");
        setField(term102090, term102090.getClass(), "lastGameId", "DwFOZqjQsc");
        setField(term102090, term102090.getClass(), "lastRomVersion", "lnaaPhjFrk");
        setField(term102090, term102090.getClass(), "lastDataVersion", "pmrwOMPSht");
        setField(term102090, term102090.getClass(), "compatibleCmVersion", "INqCuCsEDd");
        setField(term102090, term102090.getClass(), "lastPlayDate", "dUlkhAFong");
        setIntField(term102090, term102090.getClass(), "lastPlaceId", -1614536563);
        setField(term102090, term102090.getClass(), "lastPlaceName", "jzmHczvxOi");
        setIntField(term102090, term102090.getClass(), "lastRegionId", -931749414);
        setField(term102090, term102090.getClass(), "lastRegionName", "xWOzduiVAJ");
        setIntField(term102090, term102090.getClass(), "lastAllNetId", -1593630706);
        setField(term102090, term102090.getClass(), "lastClientId", "WEIfiUKcne");
        setIntField(term102090, term102090.getClass(), "lastUsedDeckId", -2003814210);
        setIntField(term102090, term102090.getClass(), "lastPlayMusicLevel", -135664106);
        setIntField(term102090, term102090.getClass(), "lastEmoneyBrand", 494405538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamageBattlePoint", argTypes, term102090, args);
    }

};


