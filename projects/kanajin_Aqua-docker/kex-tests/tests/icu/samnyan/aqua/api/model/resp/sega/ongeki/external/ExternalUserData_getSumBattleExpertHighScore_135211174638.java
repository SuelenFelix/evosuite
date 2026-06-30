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

public class ExternalUserData_getSumBattleExpertHighScore_135211174638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3179272;

    public ExternalUserData_getSumBattleExpertHighScore_135211174638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3179272 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3179272, term3179272.getClass(), "accessCode", "yLwstKfAXf");
        setField(term3179272, term3179272.getClass(), "userName", "joywVKLOVL");
        setIntField(term3179272, term3179272.getClass(), "level", -965578943);
        setIntField(term3179272, term3179272.getClass(), "reincarnationNum", 995872579);
        setLongField(term3179272, term3179272.getClass(), "exp", -4123575814396695703L);
        setLongField(term3179272, term3179272.getClass(), "point", -493593707566317550L);
        setLongField(term3179272, term3179272.getClass(), "totalPoint", 1181413227742891819L);
        setIntField(term3179272, term3179272.getClass(), "playCount", -43510996);
        setIntField(term3179272, term3179272.getClass(), "jewelCount", -184683717);
        setIntField(term3179272, term3179272.getClass(), "totalJewelCount", -252558833);
        setIntField(term3179272, term3179272.getClass(), "medalCount", -1939082623);
        setIntField(term3179272, term3179272.getClass(), "playerRating", 1992673365);
        setIntField(term3179272, term3179272.getClass(), "highestRating", 2026413389);
        setIntField(term3179272, term3179272.getClass(), "battlePoint", -1317658861);
        setIntField(term3179272, term3179272.getClass(), "bestBattlePoint", 277886102);
        setIntField(term3179272, term3179272.getClass(), "overDamageBattlePoint", -45110901);
        setIntField(term3179272, term3179272.getClass(), "nameplateId", 1322074958);
        setIntField(term3179272, term3179272.getClass(), "trophyId", -293724463);
        setIntField(term3179272, term3179272.getClass(), "cardId", -1311905881);
        setIntField(term3179272, term3179272.getClass(), "characterId", 562714363);
        setIntField(term3179272, term3179272.getClass(), "tabSetting", -1127771225);
        setIntField(term3179272, term3179272.getClass(), "tabSortSetting", 1660110210);
        setIntField(term3179272, term3179272.getClass(), "cardCategorySetting", 567480743);
        setIntField(term3179272, term3179272.getClass(), "cardSortSetting", 118515385);
        setIntField(term3179272, term3179272.getClass(), "rivalScoreCategorySetting", 1101201515);
        setIntField(term3179272, term3179272.getClass(), "playedTutorialBit", -1410114428);
        setIntField(term3179272, term3179272.getClass(), "firstTutorialCancelNum", -12463125);
        setLongField(term3179272, term3179272.getClass(), "sumTechHighScore", 9036303761068645232L);
        setLongField(term3179272, term3179272.getClass(), "sumTechBasicHighScore", 8131294186238099675L);
        setLongField(term3179272, term3179272.getClass(), "sumTechAdvancedHighScore", -3498278104427918758L);
        setLongField(term3179272, term3179272.getClass(), "sumTechExpertHighScore", -4746271564199160876L);
        setLongField(term3179272, term3179272.getClass(), "sumTechMasterHighScore", 1608882691720710658L);
        setLongField(term3179272, term3179272.getClass(), "sumTechLunaticHighScore", 1259668065275018169L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleHighScore", 1400488769730657418L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleBasicHighScore", 100885810021670624L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleAdvancedHighScore", 5742217558461586446L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleExpertHighScore", 6251767843164760812L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleMasterHighScore", -223744967782573592L);
        setLongField(term3179272, term3179272.getClass(), "sumBattleLunaticHighScore", 1172260767126409147L);
        setField(term3179272, term3179272.getClass(), "eventWatchedDate", "TaJHcfeHoY");
        setField(term3179272, term3179272.getClass(), "cmEventWatchedDate", "toOUjEdYLn");
        setField(term3179272, term3179272.getClass(), "firstGameId", "RvlYnMxldF");
        setField(term3179272, term3179272.getClass(), "firstRomVersion", "lOIIBgwaxb");
        setField(term3179272, term3179272.getClass(), "firstDataVersion", "GAcSwKvPZg");
        setField(term3179272, term3179272.getClass(), "firstPlayDate", "HcztmwTWug");
        setField(term3179272, term3179272.getClass(), "lastGameId", "ZLttZZayyc");
        setField(term3179272, term3179272.getClass(), "lastRomVersion", "LXNVFalQcD");
        setField(term3179272, term3179272.getClass(), "lastDataVersion", "fwHMBYAuiK");
        setField(term3179272, term3179272.getClass(), "compatibleCmVersion", "wWVHkcyyhp");
        setField(term3179272, term3179272.getClass(), "lastPlayDate", "JGqZwSALec");
        setIntField(term3179272, term3179272.getClass(), "lastPlaceId", -651397441);
        setField(term3179272, term3179272.getClass(), "lastPlaceName", "KOLKaaHhUk");
        setIntField(term3179272, term3179272.getClass(), "lastRegionId", -1158413548);
        setField(term3179272, term3179272.getClass(), "lastRegionName", "PtfjaXCCxu");
        setIntField(term3179272, term3179272.getClass(), "lastAllNetId", -1305051664);
        setField(term3179272, term3179272.getClass(), "lastClientId", "OILLBzEkOm");
        setIntField(term3179272, term3179272.getClass(), "lastUsedDeckId", -460179458);
        setIntField(term3179272, term3179272.getClass(), "lastPlayMusicLevel", -1435247819);
        setIntField(term3179272, term3179272.getClass(), "lastEmoneyBrand", 823486321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleExpertHighScore", argTypes, term3179272, args);
    }

};


