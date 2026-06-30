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

public class ProfileResp_getSumTechMasterHighScore_56786458519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97081;

    public ProfileResp_getSumTechMasterHighScore_56786458519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97081 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97081, term97081.getClass(), "userName", "nTrxmBQSmQ");
        setIntField(term97081, term97081.getClass(), "level", -192456802);
        setLongField(term97081, term97081.getClass(), "exp", 933166127036935939L);
        setLongField(term97081, term97081.getClass(), "point", 778070503698107839L);
        setLongField(term97081, term97081.getClass(), "totalPoint", 3768864628757510145L);
        setIntField(term97081, term97081.getClass(), "playCount", -1440344177);
        setIntField(term97081, term97081.getClass(), "jewelCount", 1854587192);
        setIntField(term97081, term97081.getClass(), "totalJewelCount", 552161283);
        setIntField(term97081, term97081.getClass(), "playerRating", -533505195);
        setIntField(term97081, term97081.getClass(), "highestRating", -27748358);
        setIntField(term97081, term97081.getClass(), "battlePoint", -449693352);
        setIntField(term97081, term97081.getClass(), "nameplateId", 397657766);
        setIntField(term97081, term97081.getClass(), "trophyId", -1913693541);
        setIntField(term97081, term97081.getClass(), "cardId", -806910109);
        setIntField(term97081, term97081.getClass(), "characterId", 890021651);
        setLongField(term97081, term97081.getClass(), "sumTechHighScore", -6796635995012351438L);
        setLongField(term97081, term97081.getClass(), "sumTechBasicHighScore", -3179135527747206068L);
        setLongField(term97081, term97081.getClass(), "sumTechAdvancedHighScore", -4951536499363469726L);
        setLongField(term97081, term97081.getClass(), "sumTechExpertHighScore", 7374998902411388045L);
        setLongField(term97081, term97081.getClass(), "sumTechMasterHighScore", -2001340366695650392L);
        setLongField(term97081, term97081.getClass(), "sumTechLunaticHighScore", -6724266774522277260L);
        setLongField(term97081, term97081.getClass(), "sumBattleHighScore", -3629055115799732458L);
        setLongField(term97081, term97081.getClass(), "sumBattleBasicHighScore", -7531060248188268768L);
        setLongField(term97081, term97081.getClass(), "sumBattleAdvancedHighScore", -2868282596086632333L);
        setLongField(term97081, term97081.getClass(), "sumBattleExpertHighScore", 3768900472924603331L);
        setLongField(term97081, term97081.getClass(), "sumBattleMasterHighScore", -3304218531907046012L);
        setLongField(term97081, term97081.getClass(), "sumBattleLunaticHighScore", -5743716942084093819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechMasterHighScore", argTypes, term97081, args);
    }

};


