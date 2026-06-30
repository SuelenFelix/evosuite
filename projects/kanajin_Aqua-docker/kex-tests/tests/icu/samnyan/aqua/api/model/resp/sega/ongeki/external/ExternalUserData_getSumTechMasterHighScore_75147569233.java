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

public class ExternalUserData_getSumTechMasterHighScore_75147569233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3177292;

    public ExternalUserData_getSumTechMasterHighScore_75147569233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3177292 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3177292, term3177292.getClass(), "accessCode", "NtPbexNpvz");
        setField(term3177292, term3177292.getClass(), "userName", "mUpXzlarCp");
        setIntField(term3177292, term3177292.getClass(), "level", -1133350216);
        setIntField(term3177292, term3177292.getClass(), "reincarnationNum", 1044581483);
        setLongField(term3177292, term3177292.getClass(), "exp", -8341265960664959520L);
        setLongField(term3177292, term3177292.getClass(), "point", -1168989275450340140L);
        setLongField(term3177292, term3177292.getClass(), "totalPoint", -8660451082873507934L);
        setIntField(term3177292, term3177292.getClass(), "playCount", -1923914235);
        setIntField(term3177292, term3177292.getClass(), "jewelCount", 85761463);
        setIntField(term3177292, term3177292.getClass(), "totalJewelCount", 1692909682);
        setIntField(term3177292, term3177292.getClass(), "medalCount", -316236424);
        setIntField(term3177292, term3177292.getClass(), "playerRating", 1043478106);
        setIntField(term3177292, term3177292.getClass(), "highestRating", 396395584);
        setIntField(term3177292, term3177292.getClass(), "battlePoint", 1911862674);
        setIntField(term3177292, term3177292.getClass(), "bestBattlePoint", -106287109);
        setIntField(term3177292, term3177292.getClass(), "overDamageBattlePoint", 867959918);
        setIntField(term3177292, term3177292.getClass(), "nameplateId", -2081288832);
        setIntField(term3177292, term3177292.getClass(), "trophyId", -1697235525);
        setIntField(term3177292, term3177292.getClass(), "cardId", -1945118015);
        setIntField(term3177292, term3177292.getClass(), "characterId", -1986046576);
        setIntField(term3177292, term3177292.getClass(), "tabSetting", -2105531553);
        setIntField(term3177292, term3177292.getClass(), "tabSortSetting", 131053855);
        setIntField(term3177292, term3177292.getClass(), "cardCategorySetting", -944495958);
        setIntField(term3177292, term3177292.getClass(), "cardSortSetting", -1307178004);
        setIntField(term3177292, term3177292.getClass(), "rivalScoreCategorySetting", -1185578664);
        setIntField(term3177292, term3177292.getClass(), "playedTutorialBit", -1341780191);
        setIntField(term3177292, term3177292.getClass(), "firstTutorialCancelNum", -79412614);
        setLongField(term3177292, term3177292.getClass(), "sumTechHighScore", 6428413471342284527L);
        setLongField(term3177292, term3177292.getClass(), "sumTechBasicHighScore", -4414409401173935616L);
        setLongField(term3177292, term3177292.getClass(), "sumTechAdvancedHighScore", 6143095055936166478L);
        setLongField(term3177292, term3177292.getClass(), "sumTechExpertHighScore", 8894291104634753662L);
        setLongField(term3177292, term3177292.getClass(), "sumTechMasterHighScore", 3400960591988145517L);
        setLongField(term3177292, term3177292.getClass(), "sumTechLunaticHighScore", 7578739472882400824L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleHighScore", 2233311173564498014L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleBasicHighScore", -8898837114560069777L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleAdvancedHighScore", -1885954106779369492L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleExpertHighScore", 4295418188015230787L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleMasterHighScore", -5114402864758384893L);
        setLongField(term3177292, term3177292.getClass(), "sumBattleLunaticHighScore", 8632079867603931074L);
        setField(term3177292, term3177292.getClass(), "eventWatchedDate", "TCSoeWUfgU");
        setField(term3177292, term3177292.getClass(), "cmEventWatchedDate", "wrwWdtWbGs");
        setField(term3177292, term3177292.getClass(), "firstGameId", "crOhvljMdw");
        setField(term3177292, term3177292.getClass(), "firstRomVersion", "LfHGccOevc");
        setField(term3177292, term3177292.getClass(), "firstDataVersion", "MasDRtQYga");
        setField(term3177292, term3177292.getClass(), "firstPlayDate", "HiIwoZvrwS");
        setField(term3177292, term3177292.getClass(), "lastGameId", "SYIlPGsVYh");
        setField(term3177292, term3177292.getClass(), "lastRomVersion", "lnFAKVqgEG");
        setField(term3177292, term3177292.getClass(), "lastDataVersion", "CHrCpnZoFO");
        setField(term3177292, term3177292.getClass(), "compatibleCmVersion", "lErnUXeZWy");
        setField(term3177292, term3177292.getClass(), "lastPlayDate", "QtEXGqzYxQ");
        setIntField(term3177292, term3177292.getClass(), "lastPlaceId", -788892728);
        setField(term3177292, term3177292.getClass(), "lastPlaceName", "BinoTJlsPh");
        setIntField(term3177292, term3177292.getClass(), "lastRegionId", 548041328);
        setField(term3177292, term3177292.getClass(), "lastRegionName", "GczJKBYJIr");
        setIntField(term3177292, term3177292.getClass(), "lastAllNetId", 1361495867);
        setField(term3177292, term3177292.getClass(), "lastClientId", "dceIkgoQzQ");
        setIntField(term3177292, term3177292.getClass(), "lastUsedDeckId", -579822607);
        setIntField(term3177292, term3177292.getClass(), "lastPlayMusicLevel", 2076795146);
        setIntField(term3177292, term3177292.getClass(), "lastEmoneyBrand", 1476393572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechMasterHighScore", argTypes, term3177292, args);
    }

};


