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

public class ExternalUserData_getLastRomVersion_20010099446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114366;

    public ExternalUserData_getLastRomVersion_20010099446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114366 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term114366, term114366.getClass(), "accessCode", "TpsLJBxkis");
        setField(term114366, term114366.getClass(), "userName", "GYtHjClQtm");
        setIntField(term114366, term114366.getClass(), "level", 1814385745);
        setIntField(term114366, term114366.getClass(), "reincarnationNum", 1887112953);
        setLongField(term114366, term114366.getClass(), "exp", -7083639040362932921L);
        setLongField(term114366, term114366.getClass(), "point", -945372690225290924L);
        setLongField(term114366, term114366.getClass(), "totalPoint", 3627823862949907304L);
        setIntField(term114366, term114366.getClass(), "playCount", -950882557);
        setIntField(term114366, term114366.getClass(), "jewelCount", -499250296);
        setIntField(term114366, term114366.getClass(), "totalJewelCount", -1190835418);
        setIntField(term114366, term114366.getClass(), "medalCount", 612443200);
        setIntField(term114366, term114366.getClass(), "playerRating", 1943395405);
        setIntField(term114366, term114366.getClass(), "highestRating", -812258468);
        setIntField(term114366, term114366.getClass(), "battlePoint", -1297633185);
        setIntField(term114366, term114366.getClass(), "bestBattlePoint", -744046254);
        setIntField(term114366, term114366.getClass(), "overDamageBattlePoint", -1115141189);
        setIntField(term114366, term114366.getClass(), "nameplateId", 1885642336);
        setIntField(term114366, term114366.getClass(), "trophyId", 475759812);
        setIntField(term114366, term114366.getClass(), "cardId", 1490671756);
        setIntField(term114366, term114366.getClass(), "characterId", 1891803675);
        setIntField(term114366, term114366.getClass(), "tabSetting", -1708806595);
        setIntField(term114366, term114366.getClass(), "tabSortSetting", -441329955);
        setIntField(term114366, term114366.getClass(), "cardCategorySetting", 1681780901);
        setIntField(term114366, term114366.getClass(), "cardSortSetting", 1788258962);
        setIntField(term114366, term114366.getClass(), "rivalScoreCategorySetting", 2018643591);
        setIntField(term114366, term114366.getClass(), "playedTutorialBit", -326895945);
        setIntField(term114366, term114366.getClass(), "firstTutorialCancelNum", 1526875941);
        setLongField(term114366, term114366.getClass(), "sumTechHighScore", -4318897785943810220L);
        setLongField(term114366, term114366.getClass(), "sumTechBasicHighScore", 6332564091028476882L);
        setLongField(term114366, term114366.getClass(), "sumTechAdvancedHighScore", -8468127981775383720L);
        setLongField(term114366, term114366.getClass(), "sumTechExpertHighScore", -4022913440181089712L);
        setLongField(term114366, term114366.getClass(), "sumTechMasterHighScore", -4176652691249199259L);
        setLongField(term114366, term114366.getClass(), "sumTechLunaticHighScore", -5281821170218750265L);
        setLongField(term114366, term114366.getClass(), "sumBattleHighScore", 3385472837842448275L);
        setLongField(term114366, term114366.getClass(), "sumBattleBasicHighScore", -7404536129809980737L);
        setLongField(term114366, term114366.getClass(), "sumBattleAdvancedHighScore", 2669208122397609272L);
        setLongField(term114366, term114366.getClass(), "sumBattleExpertHighScore", 176806626668624673L);
        setLongField(term114366, term114366.getClass(), "sumBattleMasterHighScore", -3699280856911503290L);
        setLongField(term114366, term114366.getClass(), "sumBattleLunaticHighScore", -3180129706405729726L);
        setField(term114366, term114366.getClass(), "eventWatchedDate", "WHinUJeSCZ");
        setField(term114366, term114366.getClass(), "cmEventWatchedDate", "xEVXQOoFCD");
        setField(term114366, term114366.getClass(), "firstGameId", "CwIhrSJtCq");
        setField(term114366, term114366.getClass(), "firstRomVersion", "EhTSgDVPvf");
        setField(term114366, term114366.getClass(), "firstDataVersion", "gUWfbjtftQ");
        setField(term114366, term114366.getClass(), "firstPlayDate", "mElshzHjgS");
        setField(term114366, term114366.getClass(), "lastGameId", "luoDUbItJH");
        setField(term114366, term114366.getClass(), "lastRomVersion", "pLouvmQoQM");
        setField(term114366, term114366.getClass(), "lastDataVersion", "LDXexoFiSf");
        setField(term114366, term114366.getClass(), "compatibleCmVersion", "bRekjMRiCb");
        setField(term114366, term114366.getClass(), "lastPlayDate", "KFffcLjyYP");
        setIntField(term114366, term114366.getClass(), "lastPlaceId", -1528808954);
        setField(term114366, term114366.getClass(), "lastPlaceName", "tJLyYVmtXr");
        setIntField(term114366, term114366.getClass(), "lastRegionId", 873252438);
        setField(term114366, term114366.getClass(), "lastRegionName", "ARtqDamfiW");
        setIntField(term114366, term114366.getClass(), "lastAllNetId", 776118760);
        setField(term114366, term114366.getClass(), "lastClientId", "TYvtOPkOKB");
        setIntField(term114366, term114366.getClass(), "lastUsedDeckId", -2091702761);
        setIntField(term114366, term114366.getClass(), "lastPlayMusicLevel", -654940997);
        setIntField(term114366, term114366.getClass(), "lastEmoneyBrand", 452468501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term114366, args);
    }

};


