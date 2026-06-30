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

public class ProfileResp_getSumTechAdvancedHighScore_185896651917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96983;

    public ProfileResp_getSumTechAdvancedHighScore_185896651917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96983 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96983, term96983.getClass(), "userName", "jklReDfGwK");
        setIntField(term96983, term96983.getClass(), "level", 1987418328);
        setLongField(term96983, term96983.getClass(), "exp", 8072048057985100745L);
        setLongField(term96983, term96983.getClass(), "point", -429221516133028123L);
        setLongField(term96983, term96983.getClass(), "totalPoint", -5612447594596385148L);
        setIntField(term96983, term96983.getClass(), "playCount", 1207598723);
        setIntField(term96983, term96983.getClass(), "jewelCount", -1572956762);
        setIntField(term96983, term96983.getClass(), "totalJewelCount", 1471076648);
        setIntField(term96983, term96983.getClass(), "playerRating", 1860652385);
        setIntField(term96983, term96983.getClass(), "highestRating", 657103133);
        setIntField(term96983, term96983.getClass(), "battlePoint", 581380127);
        setIntField(term96983, term96983.getClass(), "nameplateId", -145123291);
        setIntField(term96983, term96983.getClass(), "trophyId", -459845996);
        setIntField(term96983, term96983.getClass(), "cardId", 588956417);
        setIntField(term96983, term96983.getClass(), "characterId", -1664696134);
        setLongField(term96983, term96983.getClass(), "sumTechHighScore", 3561474293560106048L);
        setLongField(term96983, term96983.getClass(), "sumTechBasicHighScore", 8109882239139730164L);
        setLongField(term96983, term96983.getClass(), "sumTechAdvancedHighScore", -7221650230919404584L);
        setLongField(term96983, term96983.getClass(), "sumTechExpertHighScore", 1652196551832168198L);
        setLongField(term96983, term96983.getClass(), "sumTechMasterHighScore", 1271886189946761050L);
        setLongField(term96983, term96983.getClass(), "sumTechLunaticHighScore", -8948819443252049963L);
        setLongField(term96983, term96983.getClass(), "sumBattleHighScore", 1453490191575429352L);
        setLongField(term96983, term96983.getClass(), "sumBattleBasicHighScore", -3825706505085522353L);
        setLongField(term96983, term96983.getClass(), "sumBattleAdvancedHighScore", 6860188989104917092L);
        setLongField(term96983, term96983.getClass(), "sumBattleExpertHighScore", 6728797662264246808L);
        setLongField(term96983, term96983.getClass(), "sumBattleMasterHighScore", -4004666427351866130L);
        setLongField(term96983, term96983.getClass(), "sumBattleLunaticHighScore", -8739949290721302866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechAdvancedHighScore", argTypes, term96983, args);
    }

};


