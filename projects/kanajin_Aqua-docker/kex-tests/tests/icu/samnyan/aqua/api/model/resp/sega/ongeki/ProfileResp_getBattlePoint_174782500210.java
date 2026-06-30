package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileResp_getBattlePoint_174782500210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96640;

    public ProfileResp_getBattlePoint_174782500210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96640 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96640, term96640.getClass(), "userName", "oCeHCTSNPQ");
        setIntField(term96640, term96640.getClass(), "level", 1147279988);
        setLongField(term96640, term96640.getClass(), "exp", 6232814662785894682L);
        setLongField(term96640, term96640.getClass(), "point", -2155767273076186488L);
        setLongField(term96640, term96640.getClass(), "totalPoint", 8110441689725602445L);
        setIntField(term96640, term96640.getClass(), "playCount", 835240119);
        setIntField(term96640, term96640.getClass(), "jewelCount", -404554106);
        setIntField(term96640, term96640.getClass(), "totalJewelCount", -1347236618);
        setIntField(term96640, term96640.getClass(), "playerRating", 1832174089);
        setIntField(term96640, term96640.getClass(), "highestRating", -34481225);
        setIntField(term96640, term96640.getClass(), "battlePoint", -1379952794);
        setIntField(term96640, term96640.getClass(), "nameplateId", 23436277);
        setIntField(term96640, term96640.getClass(), "trophyId", 1932442906);
        setIntField(term96640, term96640.getClass(), "cardId", -1758444761);
        setIntField(term96640, term96640.getClass(), "characterId", 765699300);
        setLongField(term96640, term96640.getClass(), "sumTechHighScore", -9082281991821907915L);
        setLongField(term96640, term96640.getClass(), "sumTechBasicHighScore", 4417761383883681455L);
        setLongField(term96640, term96640.getClass(), "sumTechAdvancedHighScore", -3044152800785769968L);
        setLongField(term96640, term96640.getClass(), "sumTechExpertHighScore", 6897351676415382691L);
        setLongField(term96640, term96640.getClass(), "sumTechMasterHighScore", 1036915229171996265L);
        setLongField(term96640, term96640.getClass(), "sumTechLunaticHighScore", 7154811240802208944L);
        setLongField(term96640, term96640.getClass(), "sumBattleHighScore", 186068278428831214L);
        setLongField(term96640, term96640.getClass(), "sumBattleBasicHighScore", 4340463983847366212L);
        setLongField(term96640, term96640.getClass(), "sumBattleAdvancedHighScore", -4400539493082635439L);
        setLongField(term96640, term96640.getClass(), "sumBattleExpertHighScore", 6543171266426513980L);
        setLongField(term96640, term96640.getClass(), "sumBattleMasterHighScore", 6239758129133855015L);
        setLongField(term96640, term96640.getClass(), "sumBattleLunaticHighScore", -355566870490534558L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattlePoint", argTypes, term96640, args);
    }

};


