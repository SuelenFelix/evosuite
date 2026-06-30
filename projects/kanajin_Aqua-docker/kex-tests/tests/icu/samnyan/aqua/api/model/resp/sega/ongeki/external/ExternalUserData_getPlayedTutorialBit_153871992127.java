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

public class ExternalUserData_getPlayedTutorialBit_153871992127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3174916;

    public ExternalUserData_getPlayedTutorialBit_153871992127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3174916 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3174916, term3174916.getClass(), "accessCode", "ZMaUGWfUcZ");
        setField(term3174916, term3174916.getClass(), "userName", "pomsrhjHYA");
        setIntField(term3174916, term3174916.getClass(), "level", 1555171967);
        setIntField(term3174916, term3174916.getClass(), "reincarnationNum", 1412390867);
        setLongField(term3174916, term3174916.getClass(), "exp", 9058035174844838688L);
        setLongField(term3174916, term3174916.getClass(), "point", -5903124063630971841L);
        setLongField(term3174916, term3174916.getClass(), "totalPoint", -7491010601418333846L);
        setIntField(term3174916, term3174916.getClass(), "playCount", -2036770175);
        setIntField(term3174916, term3174916.getClass(), "jewelCount", -1303149935);
        setIntField(term3174916, term3174916.getClass(), "totalJewelCount", 1912911394);
        setIntField(term3174916, term3174916.getClass(), "medalCount", -697081333);
        setIntField(term3174916, term3174916.getClass(), "playerRating", -74654495);
        setIntField(term3174916, term3174916.getClass(), "highestRating", -327267446);
        setIntField(term3174916, term3174916.getClass(), "battlePoint", -151539589);
        setIntField(term3174916, term3174916.getClass(), "bestBattlePoint", -498893113);
        setIntField(term3174916, term3174916.getClass(), "overDamageBattlePoint", 1947343663);
        setIntField(term3174916, term3174916.getClass(), "nameplateId", -1455123444);
        setIntField(term3174916, term3174916.getClass(), "trophyId", -1333126317);
        setIntField(term3174916, term3174916.getClass(), "cardId", -406156339);
        setIntField(term3174916, term3174916.getClass(), "characterId", -223525090);
        setIntField(term3174916, term3174916.getClass(), "tabSetting", 1506886790);
        setIntField(term3174916, term3174916.getClass(), "tabSortSetting", -1123880);
        setIntField(term3174916, term3174916.getClass(), "cardCategorySetting", -1899916053);
        setIntField(term3174916, term3174916.getClass(), "cardSortSetting", -66919472);
        setIntField(term3174916, term3174916.getClass(), "rivalScoreCategorySetting", -1959277652);
        setIntField(term3174916, term3174916.getClass(), "playedTutorialBit", 1608554691);
        setIntField(term3174916, term3174916.getClass(), "firstTutorialCancelNum", 1270328143);
        setLongField(term3174916, term3174916.getClass(), "sumTechHighScore", -5040269627394845374L);
        setLongField(term3174916, term3174916.getClass(), "sumTechBasicHighScore", 6736765567745879633L);
        setLongField(term3174916, term3174916.getClass(), "sumTechAdvancedHighScore", 6752614024253736453L);
        setLongField(term3174916, term3174916.getClass(), "sumTechExpertHighScore", -8805184840474358837L);
        setLongField(term3174916, term3174916.getClass(), "sumTechMasterHighScore", -5845454927485394841L);
        setLongField(term3174916, term3174916.getClass(), "sumTechLunaticHighScore", -5466470086042333704L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleHighScore", 5601349161017826122L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleBasicHighScore", 7576439658059775332L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleAdvancedHighScore", -2798648437969311628L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleExpertHighScore", 5390300219935345032L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleMasterHighScore", -6688397425569229642L);
        setLongField(term3174916, term3174916.getClass(), "sumBattleLunaticHighScore", -580103322030219370L);
        setField(term3174916, term3174916.getClass(), "eventWatchedDate", "LxSfOqIGKh");
        setField(term3174916, term3174916.getClass(), "cmEventWatchedDate", "LvsOBJMVnY");
        setField(term3174916, term3174916.getClass(), "firstGameId", "MXJqsawNnq");
        setField(term3174916, term3174916.getClass(), "firstRomVersion", "PSBzLrhNWd");
        setField(term3174916, term3174916.getClass(), "firstDataVersion", "iSnlzJdXvC");
        setField(term3174916, term3174916.getClass(), "firstPlayDate", "iWLDKfjHtZ");
        setField(term3174916, term3174916.getClass(), "lastGameId", "NaVzKclQdv");
        setField(term3174916, term3174916.getClass(), "lastRomVersion", "UtvruMMZGw");
        setField(term3174916, term3174916.getClass(), "lastDataVersion", "IUYGmAGjCi");
        setField(term3174916, term3174916.getClass(), "compatibleCmVersion", "axTKjIjUpd");
        setField(term3174916, term3174916.getClass(), "lastPlayDate", "wxCubJkhEq");
        setIntField(term3174916, term3174916.getClass(), "lastPlaceId", -1541372770);
        setField(term3174916, term3174916.getClass(), "lastPlaceName", "BLifblFwUW");
        setIntField(term3174916, term3174916.getClass(), "lastRegionId", -1098813449);
        setField(term3174916, term3174916.getClass(), "lastRegionName", "GbdpGsLtoT");
        setIntField(term3174916, term3174916.getClass(), "lastAllNetId", 141276349);
        setField(term3174916, term3174916.getClass(), "lastClientId", "ffBapXZHMM");
        setIntField(term3174916, term3174916.getClass(), "lastUsedDeckId", -1640573418);
        setIntField(term3174916, term3174916.getClass(), "lastPlayMusicLevel", 1422668824);
        setIntField(term3174916, term3174916.getClass(), "lastEmoneyBrand", -1631992752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term3174916, args);
    }

};


