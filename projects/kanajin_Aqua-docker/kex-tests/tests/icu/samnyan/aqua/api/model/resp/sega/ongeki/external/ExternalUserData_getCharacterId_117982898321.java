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

public class ExternalUserData_getCharacterId_117982898321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172540;

    public ExternalUserData_getCharacterId_117982898321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3172540 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3172540, term3172540.getClass(), "accessCode", "EXNZoPAvpe");
        setField(term3172540, term3172540.getClass(), "userName", "dElmiigHbc");
        setIntField(term3172540, term3172540.getClass(), "level", -375608289);
        setIntField(term3172540, term3172540.getClass(), "reincarnationNum", 1708468921);
        setLongField(term3172540, term3172540.getClass(), "exp", 3942168136582365085L);
        setLongField(term3172540, term3172540.getClass(), "point", -963596756719940160L);
        setLongField(term3172540, term3172540.getClass(), "totalPoint", 8216771811948729821L);
        setIntField(term3172540, term3172540.getClass(), "playCount", -1880018501);
        setIntField(term3172540, term3172540.getClass(), "jewelCount", -1063767034);
        setIntField(term3172540, term3172540.getClass(), "totalJewelCount", -1140688200);
        setIntField(term3172540, term3172540.getClass(), "medalCount", 2102591755);
        setIntField(term3172540, term3172540.getClass(), "playerRating", -589317342);
        setIntField(term3172540, term3172540.getClass(), "highestRating", -627125782);
        setIntField(term3172540, term3172540.getClass(), "battlePoint", -1589892840);
        setIntField(term3172540, term3172540.getClass(), "bestBattlePoint", 2122184733);
        setIntField(term3172540, term3172540.getClass(), "overDamageBattlePoint", 1600268495);
        setIntField(term3172540, term3172540.getClass(), "nameplateId", -1343760990);
        setIntField(term3172540, term3172540.getClass(), "trophyId", -1079752130);
        setIntField(term3172540, term3172540.getClass(), "cardId", -1216861571);
        setIntField(term3172540, term3172540.getClass(), "characterId", -1392889241);
        setIntField(term3172540, term3172540.getClass(), "tabSetting", 1971923051);
        setIntField(term3172540, term3172540.getClass(), "tabSortSetting", -1305141148);
        setIntField(term3172540, term3172540.getClass(), "cardCategorySetting", 1589001656);
        setIntField(term3172540, term3172540.getClass(), "cardSortSetting", -371663210);
        setIntField(term3172540, term3172540.getClass(), "rivalScoreCategorySetting", -447102069);
        setIntField(term3172540, term3172540.getClass(), "playedTutorialBit", -486626646);
        setIntField(term3172540, term3172540.getClass(), "firstTutorialCancelNum", -223049421);
        setLongField(term3172540, term3172540.getClass(), "sumTechHighScore", 1158750696167228222L);
        setLongField(term3172540, term3172540.getClass(), "sumTechBasicHighScore", 2170704825117646585L);
        setLongField(term3172540, term3172540.getClass(), "sumTechAdvancedHighScore", 6717180256648953090L);
        setLongField(term3172540, term3172540.getClass(), "sumTechExpertHighScore", -6000170977988690177L);
        setLongField(term3172540, term3172540.getClass(), "sumTechMasterHighScore", -8466028680182079342L);
        setLongField(term3172540, term3172540.getClass(), "sumTechLunaticHighScore", -2490906539575980812L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleHighScore", 6670970205903537184L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleBasicHighScore", 1411087388392826324L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleAdvancedHighScore", 291238219337278258L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleExpertHighScore", -8736290642956735530L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleMasterHighScore", 3634995889967528325L);
        setLongField(term3172540, term3172540.getClass(), "sumBattleLunaticHighScore", -4812654894628243981L);
        setField(term3172540, term3172540.getClass(), "eventWatchedDate", "dcpAVKZKJi");
        setField(term3172540, term3172540.getClass(), "cmEventWatchedDate", "lMwaWRwgqm");
        setField(term3172540, term3172540.getClass(), "firstGameId", "rnAPOMjxtm");
        setField(term3172540, term3172540.getClass(), "firstRomVersion", "TEIAIsrKmq");
        setField(term3172540, term3172540.getClass(), "firstDataVersion", "JPWUIxbjZH");
        setField(term3172540, term3172540.getClass(), "firstPlayDate", "LACNVdOlkT");
        setField(term3172540, term3172540.getClass(), "lastGameId", "vLDxMGBROX");
        setField(term3172540, term3172540.getClass(), "lastRomVersion", "LuibtSSVCi");
        setField(term3172540, term3172540.getClass(), "lastDataVersion", "nWYRMhMGUH");
        setField(term3172540, term3172540.getClass(), "compatibleCmVersion", "SxyMOxKArf");
        setField(term3172540, term3172540.getClass(), "lastPlayDate", "kERoSBOdXe");
        setIntField(term3172540, term3172540.getClass(), "lastPlaceId", -313359530);
        setField(term3172540, term3172540.getClass(), "lastPlaceName", "CUjTFEqHNO");
        setIntField(term3172540, term3172540.getClass(), "lastRegionId", 843244857);
        setField(term3172540, term3172540.getClass(), "lastRegionName", "cQNinDcBFN");
        setIntField(term3172540, term3172540.getClass(), "lastAllNetId", -264410890);
        setField(term3172540, term3172540.getClass(), "lastClientId", "PAfkXzfeLx");
        setIntField(term3172540, term3172540.getClass(), "lastUsedDeckId", 114775611);
        setIntField(term3172540, term3172540.getClass(), "lastPlayMusicLevel", 1633420913);
        setIntField(term3172540, term3172540.getClass(), "lastEmoneyBrand", -365223716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term3172540, args);
    }

};


