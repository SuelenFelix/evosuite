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

public class ExternalUserData_getSumBattleHighScore_53419758033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109218;

    public ExternalUserData_getSumBattleHighScore_53419758033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109218 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term109218, term109218.getClass(), "accessCode", "shrssrqLCu");
        setField(term109218, term109218.getClass(), "userName", "YVkCJXYvcs");
        setIntField(term109218, term109218.getClass(), "level", 1544967563);
        setIntField(term109218, term109218.getClass(), "reincarnationNum", -560212260);
        setLongField(term109218, term109218.getClass(), "exp", -7385996154796124764L);
        setLongField(term109218, term109218.getClass(), "point", -3983596883706946405L);
        setLongField(term109218, term109218.getClass(), "totalPoint", -5090083476376619601L);
        setIntField(term109218, term109218.getClass(), "playCount", -1769777305);
        setIntField(term109218, term109218.getClass(), "jewelCount", -1557327029);
        setIntField(term109218, term109218.getClass(), "totalJewelCount", 1761536994);
        setIntField(term109218, term109218.getClass(), "medalCount", -689505027);
        setIntField(term109218, term109218.getClass(), "playerRating", -999722413);
        setIntField(term109218, term109218.getClass(), "highestRating", 1640658084);
        setIntField(term109218, term109218.getClass(), "battlePoint", 36461610);
        setIntField(term109218, term109218.getClass(), "bestBattlePoint", 1502135803);
        setIntField(term109218, term109218.getClass(), "overDamageBattlePoint", 1017117709);
        setIntField(term109218, term109218.getClass(), "nameplateId", -587139809);
        setIntField(term109218, term109218.getClass(), "trophyId", 176202046);
        setIntField(term109218, term109218.getClass(), "cardId", 2098601225);
        setIntField(term109218, term109218.getClass(), "characterId", 1678038772);
        setIntField(term109218, term109218.getClass(), "tabSetting", 1167630742);
        setIntField(term109218, term109218.getClass(), "tabSortSetting", -724382838);
        setIntField(term109218, term109218.getClass(), "cardCategorySetting", -385069314);
        setIntField(term109218, term109218.getClass(), "cardSortSetting", 1919650229);
        setIntField(term109218, term109218.getClass(), "rivalScoreCategorySetting", -466499147);
        setIntField(term109218, term109218.getClass(), "playedTutorialBit", 1971150358);
        setIntField(term109218, term109218.getClass(), "firstTutorialCancelNum", -1364181759);
        setLongField(term109218, term109218.getClass(), "sumTechHighScore", 3233362963106306685L);
        setLongField(term109218, term109218.getClass(), "sumTechBasicHighScore", 8819129988249637928L);
        setLongField(term109218, term109218.getClass(), "sumTechAdvancedHighScore", -649375634918728295L);
        setLongField(term109218, term109218.getClass(), "sumTechExpertHighScore", 7591162060290192571L);
        setLongField(term109218, term109218.getClass(), "sumTechMasterHighScore", 7933556287518447241L);
        setLongField(term109218, term109218.getClass(), "sumTechLunaticHighScore", -8470126707013662687L);
        setLongField(term109218, term109218.getClass(), "sumBattleHighScore", 6918389485665287999L);
        setLongField(term109218, term109218.getClass(), "sumBattleBasicHighScore", -5804321305224591674L);
        setLongField(term109218, term109218.getClass(), "sumBattleAdvancedHighScore", 4415872891600302153L);
        setLongField(term109218, term109218.getClass(), "sumBattleExpertHighScore", -3414371718554283604L);
        setLongField(term109218, term109218.getClass(), "sumBattleMasterHighScore", 9129195907367634518L);
        setLongField(term109218, term109218.getClass(), "sumBattleLunaticHighScore", -3768337518626488946L);
        setField(term109218, term109218.getClass(), "eventWatchedDate", "LSuzDzzkRF");
        setField(term109218, term109218.getClass(), "cmEventWatchedDate", "UpZNaBLJck");
        setField(term109218, term109218.getClass(), "firstGameId", "SzyaMGYSKf");
        setField(term109218, term109218.getClass(), "firstRomVersion", "eTCSYKLsdP");
        setField(term109218, term109218.getClass(), "firstDataVersion", "UzEeKtsLXK");
        setField(term109218, term109218.getClass(), "firstPlayDate", "DGEFqUrMDr");
        setField(term109218, term109218.getClass(), "lastGameId", "yPMBJDQAOz");
        setField(term109218, term109218.getClass(), "lastRomVersion", "oqsgYMFTfZ");
        setField(term109218, term109218.getClass(), "lastDataVersion", "iAFNdbRIVG");
        setField(term109218, term109218.getClass(), "compatibleCmVersion", "AGnFhhQyih");
        setField(term109218, term109218.getClass(), "lastPlayDate", "IRAQJIbBQm");
        setIntField(term109218, term109218.getClass(), "lastPlaceId", 656641520);
        setField(term109218, term109218.getClass(), "lastPlaceName", "oUWxwMXaWa");
        setIntField(term109218, term109218.getClass(), "lastRegionId", 1481364428);
        setField(term109218, term109218.getClass(), "lastRegionName", "OVuedhrXPK");
        setIntField(term109218, term109218.getClass(), "lastAllNetId", -637077564);
        setField(term109218, term109218.getClass(), "lastClientId", "eNLegmDnty");
        setIntField(term109218, term109218.getClass(), "lastUsedDeckId", -425621888);
        setIntField(term109218, term109218.getClass(), "lastPlayMusicLevel", 1564632347);
        setIntField(term109218, term109218.getClass(), "lastEmoneyBrand", 1153759718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleHighScore", argTypes, term109218, args);
    }

};


