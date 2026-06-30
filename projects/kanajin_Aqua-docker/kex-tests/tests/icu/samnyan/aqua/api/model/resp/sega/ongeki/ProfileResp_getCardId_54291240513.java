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

public class ProfileResp_getCardId_54291240513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96787;

    public ProfileResp_getCardId_54291240513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96787 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96787, term96787.getClass(), "userName", "KlOojNxfBG");
        setIntField(term96787, term96787.getClass(), "level", 14425647);
        setLongField(term96787, term96787.getClass(), "exp", 3092737582558127489L);
        setLongField(term96787, term96787.getClass(), "point", -3700967396082740491L);
        setLongField(term96787, term96787.getClass(), "totalPoint", 3775402870482316054L);
        setIntField(term96787, term96787.getClass(), "playCount", -131768228);
        setIntField(term96787, term96787.getClass(), "jewelCount", 1340204745);
        setIntField(term96787, term96787.getClass(), "totalJewelCount", 1186998669);
        setIntField(term96787, term96787.getClass(), "playerRating", 878195596);
        setIntField(term96787, term96787.getClass(), "highestRating", -1992358235);
        setIntField(term96787, term96787.getClass(), "battlePoint", 490392803);
        setIntField(term96787, term96787.getClass(), "nameplateId", 483229214);
        setIntField(term96787, term96787.getClass(), "trophyId", -288824457);
        setIntField(term96787, term96787.getClass(), "cardId", 1823637993);
        setIntField(term96787, term96787.getClass(), "characterId", 2015959631);
        setLongField(term96787, term96787.getClass(), "sumTechHighScore", 706445567923930538L);
        setLongField(term96787, term96787.getClass(), "sumTechBasicHighScore", 7395018499368984599L);
        setLongField(term96787, term96787.getClass(), "sumTechAdvancedHighScore", 2012997396639433575L);
        setLongField(term96787, term96787.getClass(), "sumTechExpertHighScore", 6808333697500268778L);
        setLongField(term96787, term96787.getClass(), "sumTechMasterHighScore", -4354118509903605179L);
        setLongField(term96787, term96787.getClass(), "sumTechLunaticHighScore", -2124280462742546388L);
        setLongField(term96787, term96787.getClass(), "sumBattleHighScore", 1718045375557290781L);
        setLongField(term96787, term96787.getClass(), "sumBattleBasicHighScore", -3660549989010197550L);
        setLongField(term96787, term96787.getClass(), "sumBattleAdvancedHighScore", -5661285024722117302L);
        setLongField(term96787, term96787.getClass(), "sumBattleExpertHighScore", -4949461452251682671L);
        setLongField(term96787, term96787.getClass(), "sumBattleMasterHighScore", -5302767309235664205L);
        setLongField(term96787, term96787.getClass(), "sumBattleLunaticHighScore", -8900621581808668801L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term96787, args);
    }

};


